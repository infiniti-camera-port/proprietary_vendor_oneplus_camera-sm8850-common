#
# Copyright (C) 2024 The LineageOS Project
#
# SPDX-License-Identifier: Apache-2.0
#
# com.oplus.compat: system_ext uses-library that replaces the retired
# oplus-fwk boot jar (O3 Phase-B1 boot-jar -> uses-library migration).

PRODUCT_PACKAGES += com.oplus.compat

PRODUCT_COPY_FILES += \
    $(LOCAL_PATH)/com.oplus.compat.xml:$(TARGET_COPY_OUT_SYSTEM_EXT)/etc/permissions/com.oplus.compat.xml
