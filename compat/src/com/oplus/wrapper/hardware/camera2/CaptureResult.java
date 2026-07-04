package com.oplus.wrapper.hardware.camera2;

import com.oplus.wrapper.hardware.camera2.impl.CameraMetadataNative;

public class CaptureResult {
    private final android.hardware.camera2.CaptureResult mCaptureResult;

    public CaptureResult(android.hardware.camera2.CaptureResult captureResult) {
        this.mCaptureResult = captureResult;
    }

    public CameraMetadataNative getNativeMetadata() {
        android.hardware.camera2.impl.CameraMetadataNative metadataNative =
                this.mCaptureResult.getNativeMetadata();
        if (metadataNative == null) {
            return null;
        }
        return new CameraMetadataNative(metadataNative);
    }

    public CameraMetadataNative getNativeCopy() {
        android.hardware.camera2.impl.CameraMetadataNative metadataNative =
                this.mCaptureResult.getNativeCopy();
        if (metadataNative == null) {
            return null;
        }
        return new CameraMetadataNative(metadataNative);
    }

    public static final class Key<T> {
        private final android.hardware.camera2.CaptureResult.Key<T> mKey;

        public Key(android.hardware.camera2.CaptureResult.Key<T> key) {
            this.mKey = key;
        }

        public Key(String name, Class<T> type, long vendorId) {
            this.mKey = new android.hardware.camera2.CaptureResult.Key<>(name, type, vendorId);
        }

        public Key(String name, Class<T> type) {
            this.mKey = new android.hardware.camera2.CaptureResult.Key<>(name, type);
        }

        public Key(String name, String fallbackName, Class<T> type) {
            this.mKey = new android.hardware.camera2.CaptureResult.Key<>(name, fallbackName, type);
        }

        public android.hardware.camera2.CaptureResult.Key<T> getKey() {
            return this.mKey;
        }

        public long getVendorId() {
            return this.mKey.getVendorId();
        }
    }
}
