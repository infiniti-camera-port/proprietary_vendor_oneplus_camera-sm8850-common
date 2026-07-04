/*
 * Copyright (C) 2024 The LineageOS Project
 *
 * SPDX-License-Identifier: Apache-2.0
 *
 * Reconstructed from OOS 16.0.8 oplus-framework.jar (com.oplus.media.OplusImageHdrImpl).
 * The OEM class is JNI-backed by liboplusImageHdrImpl.so, which does NOT ship in this
 * LineageOS build. Declaring the OEM native methods / loadLibrary would throw
 * UnsatisfiedLinkError at class-init and hard crash the caller. These pure-Java stubs
 * return safe defaults so OppoGallery2 falls back to SDR base-image decoding when the
 * OEM ultra-HDR gainmap path is unavailable.
 */

package com.oplus.media;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;

import java.io.FileDescriptor;
import java.io.InputStream;
import java.io.OutputStream;

public class OplusImageHdrImpl {
    private static final String TAG = "OplusImageHdrImpl_Java";

    public OplusImageHdrImpl() {
    }

    public static boolean compressAlpha8(Bitmap bitmap, Bitmap.CompressFormat format,
            int quality, OutputStream os) {
        return false;
    }

    public static Bitmap decodeBaseJpeg(FileDescriptor fd, BitmapFactory.Options options) {
        return null;
    }

    public static Bitmap decodeBaseJpeg(InputStream is, BitmapFactory.Options options) {
        return null;
    }

    public static GainmapInfo decodeGainmapAndMetadata(FileDescriptor fd, int type) {
        return null;
    }

    public static GainmapInfo decodeGainmapAndMetadata(InputStream is, int type) {
        return null;
    }

    public static GainmapInfo demuxFile(FileDescriptor fd) {
        return null;
    }

    public static GainmapInfo demuxFile(InputStream is) {
        return null;
    }

    public static class GainmapInfo {
        public int mBaseImageType;
        public float mDisplayRatioHdr;
        public float mDisplayRatioSdr;
        public float[] mEpsilonHdr;
        public float[] mEpsilonSdr;
        public Bitmap mGainmap;
        public float[] mGainmapGamma;
        public float[] mGainmapRatioMax;
        public float[] mGainmapRatioMin;
        public float mHdrScale;
        public boolean mIsJpegR;
        public int mType;

        public GainmapInfo() {
        }
    }
}
