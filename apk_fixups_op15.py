from pathlib import Path
import re

from extract_utils.fixups_blob import apktool_path, java_path
from extract_utils.utils import run_cmd


def blob_fixup_apktool_unpack_full(ctx, file, file_path, *args, tmp_dir=None, **kwargs):
    if tmp_dir is None:
        return
    run_cmd([java_path, '-Xmx8g', '-jar', apktool_path, 'd', file_path, '-o', tmp_dir, '-f'])


def blob_fixup_cryptoeng_permissions_xml(ctx, file, file_path, *args, tmp_dir=None, **kwargs):
    path = Path(file_path)
    data = path.read_text(encoding='utf-8')
    path.write_text(data.replace('\n</permissions>\n\n<permissions>\n', '\n'), encoding='utf-8')


def blob_fixup_cryptoeng_manifest(ctx, file, file_path, *args, tmp_dir=None, **kwargs):
    path = Path(file_path)
    data = path.read_text(encoding='utf-8')
    data = data.replace('<!--\n    <hal format="hidl">', '    <hal format="hidl">')
    data = data.replace('    </hal>\n-->\n    <hal format="aidl">', '    </hal>\n    <hal format="aidl">')
    path.write_text(data, encoding='utf-8')


def blob_fixup_inject_compat_uses_library(ctx, file, file_path, *args, tmp_dir=None, **kwargs):
    # Inject <uses-library android:name="com.oplus.compat" android:required="false"/>
    # into <application> so the ported OEM app resolves the moved oplus-fwk classes,
    # now homed in the com.oplus.compat uses-library instead of the boot classpath.
    if tmp_dir is None:
        return
    manifest = Path(tmp_dir) / 'AndroidManifest.xml'
    data = manifest.read_text(encoding='utf-8')
    if 'android:name="com.oplus.compat"' in data:
        return  # idempotent
    lib = '\n        <uses-library android:name="com.oplus.compat" android:required="false"/>'
    fixed, count = re.subn(r'(<application\b[^>]*>)', r'\1' + lib, data, count=1)
    if count != 1:
        raise ValueError('inject compat uses-library: <application> open tag not found')
    manifest.write_text(fixed, encoding='utf-8')
