package com.oplus.wrapper.hardware.camera2.impl;

public class CameraMetadataNative {
    private final android.hardware.camera2.impl.CameraMetadataNative mCameraMetadataNative;

    public CameraMetadataNative(android.hardware.camera2.impl.CameraMetadataNative cameraMetadataNative) {
        this.mCameraMetadataNative = cameraMetadataNative;
    }

    public long getMetadataPtr() {
        return this.mCameraMetadataNative.getMetadataPtr();
    }

    public static int getTag(String key, long vendorId) {
        return android.hardware.camera2.impl.CameraMetadataNative.getTag(key, vendorId);
    }
}
