package org.chromium.base.metrics;

import org.chromium.base.annotations.JNINamespace;

@JNINamespace
public class RecordUserAction {
    private static boolean a;

    private static native void nativeRecordUserAction(String str);

    static {
        a = false;
    }
}
