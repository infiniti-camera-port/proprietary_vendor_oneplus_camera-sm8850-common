package com.oplus.wrapper.hardware.camera2;

import com.oplus.wrapper.hardware.camera2.impl.CameraMetadataNative;

public class CameraCharacteristics {
    private final android.hardware.camera2.CameraCharacteristics mCameraCharacteristics;

    public CameraCharacteristics(android.hardware.camera2.CameraCharacteristics cameraCharacteristics) {
        this.mCameraCharacteristics = cameraCharacteristics;
    }

    public CameraMetadataNative getNativeMetadata() {
        android.hardware.camera2.impl.CameraMetadataNative metadataNative =
                this.mCameraCharacteristics.getNativeMetadata();
        if (metadataNative == null) {
            return null;
        }
        return new CameraMetadataNative(metadataNative);
    }
}
