package org.chromium.base;

import org.chromium.base.annotations.JNINamespace;

@JNINamespace
public class PathService {
    private static native void nativeOverride(int i, String str);

    private PathService() {
    }
}
