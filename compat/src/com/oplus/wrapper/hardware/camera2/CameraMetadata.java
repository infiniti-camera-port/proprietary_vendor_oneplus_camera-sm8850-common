package com.oplus.wrapper.hardware.camera2;

public class CameraMetadata<T> {
    private final android.hardware.camera2.CameraMetadata<T> mCameraMetadata;

    public CameraMetadata(android.hardware.camera2.CameraMetadata<T> cameraMetadata) {
        this.mCameraMetadata = cameraMetadata;
    }

    public long getNativeMetadataPtr() {
        return this.mCameraMetadata.getNativeMetadataPtr();
    }
}
