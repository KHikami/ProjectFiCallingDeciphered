package org.chromium.net;

import org.chromium.base.annotations.JNINamespace;

@JNINamespace
public final class GURLUtils {
    private static native String nativeGetOrigin(String str);

    private static native String nativeGetScheme(String str);
}
