package com.oplus.graphics;

/*
 * Stub implementation — OplusBlurParam is an OEM (ColorOS/OOS) cross-window blur
 * parameter holder that lives in the proprietary oplus-framework.jar, which is NOT
 * shipped on LineageOS. The OnePlus camera/gallery build a parameter object here and
 * submit it via com.oplus.view.ViewRootManager.setBlurParams(); with no OEM
 * SurfaceFlinger blur backend on LOS the params are accepted and silently ignored
 * (the blurred background simply does not render). This restores the API surface so
 * com.oplus.camera no longer dies with NoClassDefFoundError on open. Mirrors the
 * existing com/oplus/graphics/Oplus* stub style in this tree.
 *
 * Surface required by com.oplus.camera (RE'd from OplusCamera.apk smali):
 *   <init>()V, setBlurType(I)V, setMaterialParams(I[F[F)V, setSmoothCornerWeight(F)V
 */
public class OplusBlurParam {
    private static final String TAG = "OplusBlurParam";

    public OplusBlurParam() {
    }

    public void setBlurType(int blurType) {
        // no-op (no OEM blur backend on LOS)
    }

    public void setBlurRadius(int blurRadius) {
        // no-op
    }

    public void setMaterialParams(int material, float[] colorParams, float[] weightParams) {
        // no-op
    }

    public void setSmoothCornerType(int cornerType) {
        // no-op
    }

    public void setSmoothCornerWeight(float weight) {
        // no-op
    }
}
