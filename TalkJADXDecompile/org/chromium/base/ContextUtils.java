package org.chromium.base;

import android.content.Context;
import org.chromium.base.annotations.JNINamespace;

@JNINamespace
public class ContextUtils {
    public static Context a;

    private static native void nativeInitNativeSideApplicationContext(Context context);

    public static void a() {
        if (a == null) {
            throw new RuntimeException("Cannot have native global application context be null.");
        }
        nativeInitNativeSideApplicationContext(a);
    }
}
