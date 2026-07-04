/*
 * Copyright (C) 2024 The LineageOS Project
 *
 * SPDX-License-Identifier: Apache-2.0
 *
 * Reconstructed from OOS 16.0.8 oplus-framework.jar (com.oplus.media.OplusHeifConverter).
 * The OEM class is JNI-backed by liboplus_heifconverter.so / liboplusHeifDecoderImpl.so,
 * NEITHER of which ships in this LineageOS build. Declaring the OEM native methods and a
 * static System.loadLibrary here would throw UnsatisfiedLinkError at class-init and hard
 * crash the caller (java.lang.Error, not caught by catch(Exception)). These are therefore
 * pure-Java, non-native stubs returning safe defaults so OppoGallery2 falls back to the
 * platform HEIF path (BitmapFactory / libheif) instead of the OEM decoder.
 */

package com.oplus.media;

import android.graphics.ColorSpace;
import android.graphics.Rect;
import android.view.Surface;

import java.io.FileDescriptor;
import java.io.InputStream;
import java.io.OutputStream;

public class OplusHeifConverter {
    private static final String TAG = "OplusHeifConverter_Java";

    public OplusHeifConverter() {
    }

    public static boolean convertHeifToJpegFromPath(String path, int rotation, OutputStream os) {
        return false;
    }

    public static boolean convertHeifToJpegFromStream(InputStream is, int rotation, OutputStream os) {
        return false;
    }

    public boolean createDecoder() {
        return false;
    }

    public boolean destroyDecoder() {
        return false;
    }

    public HeifDecodedFrame decode(FileDescriptor fd, int sampleSize, boolean rotate) {
        return null;
    }

    public HeifDecodedFrame decode(InputStream is, int sampleSize, boolean rotate) {
        return null;
    }

    public boolean decode(FileDescriptor fd, int sampleSize, Surface surface) {
        return false;
    }

    public boolean decode(InputStream is, int sampleSize, Surface surface) {
        return false;
    }

    public HeifDecodedFrame decodeRegion(FileDescriptor fd, Rect region, int sampleSize, boolean rotate) {
        return null;
    }

    public HeifDecodedFrame decodeRegion(InputStream is, Rect region, int sampleSize, boolean rotate) {
        return null;
    }

    public boolean decodeRegion(FileDescriptor fd, Rect region, int sampleSize, Surface surface) {
        return false;
    }

    public boolean decodeRegion(InputStream is, Rect region, int sampleSize, Surface surface) {
        return false;
    }

    public int getFormat(FileDescriptor fd) {
        return 0;
    }

    public int getFormat(InputStream is) {
        return 0;
    }

    public boolean isHEIFFile(InputStream is) {
        return false;
    }

    public byte[] byteArrayToInt(byte[] data, int offset) {
        return null;
    }

    public static class HeifDecodedFrame {
        public ColorSpace m_ColorSpace;
        public long m_buffer_id;
        public long m_buffer_id_sub;
        public int m_frame_height;
        public int m_frame_width;
        public boolean m_recycled;
        public byte[] m_yuvdata;

        public HeifDecodedFrame(byte[] yuv, int width, int height, long id) {
            m_yuvdata = yuv;
            m_frame_width = width;
            m_frame_height = height;
            m_buffer_id = id;
        }

        public final boolean isRecycled() {
            return m_recycled;
        }

        public void recycle() {
            if (m_recycled) {
                return;
            }
            m_yuvdata = null;
            m_recycled = true;
        }

        public boolean render(Surface surface, boolean flag) {
            return false;
        }

        public boolean render(Surface surface, boolean flag, ColorSpace colorSpace) {
            return false;
        }
    }
}
