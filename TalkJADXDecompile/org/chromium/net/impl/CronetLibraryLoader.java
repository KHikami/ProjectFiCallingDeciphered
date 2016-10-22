package org.chromium.net.impl;

import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import org.chromium.base.ContextUtils;
import org.chromium.base.annotations.JNINamespace;
import org.chromium.net.CronetEngine.Builder;
import org.chromium.net.NetworkChangeNotifier;
import org.chromium.net.RegistrationPolicyAlwaysRegister;
import ots;
import owy;

@JNINamespace
public class CronetLibraryLoader {
    private static final Object a;
    private static volatile boolean b;
    private static boolean c;

    private static native void nativeCronetInitOnMainThread();

    private static native String nativeGetCronetVersion();

    static {
        a = new Object();
        b = false;
        c = false;
    }

    public static void a(Context context, Builder builder) {
        synchronized (a) {
            if (b) {
                return;
            }
            b = true;
            Context applicationContext = context.getApplicationContext();
            if (ContextUtils.a != null && ContextUtils.a != applicationContext) {
                ots.a("ContextUtils", "Multiple contexts detected, ignoring new application context.");
            } else if (applicationContext == null) {
                throw new RuntimeException("Global application context cannot be set to null.");
            } else {
                ContextUtils.a = applicationContext;
            }
            if (builder.f() != null) {
                builder.f();
                builder.e();
            } else {
                System.loadLibrary(builder.e());
            }
            ContextUtils.a();
            if ("54.0.2837.2".equals(nativeGetCronetVersion())) {
                ots.b("CronetLibraryLoader", "Cronet version: %s, arch: %s", new Object[]{"54.0.2837.2", System.getProperty("os.arch")});
                owy owy = new owy(context);
                if (Looper.getMainLooper() == Looper.myLooper()) {
                    owy.run();
                } else {
                    new Handler(Looper.getMainLooper()).post(owy);
                }
                return;
            }
            throw new RuntimeException(String.format("Expected Cronet version number %s, actual version number %s.", new Object[]{"54.0.2837.2", nativeGetCronetVersion()}));
        }
    }

    public static void a(Context context) {
        if (!c) {
            NetworkChangeNotifier.init(context);
            NetworkChangeNotifier.a.a(true, new RegistrationPolicyAlwaysRegister());
            nativeCronetInitOnMainThread();
            c = true;
        }
    }
}
