package org.chromium.base;

import org.chromium.base.annotations.JNINamespace;

@JNINamespace
public class CpuFeatures {
    private static native int nativeGetCoreCount();

    private static native long nativeGetCpuFeatures();
}
