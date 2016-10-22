package com.google.android.libraries.social.jni.crashreporter;

import android.content.Context;
import android.content.Intent;
import android.os.Build.VERSION;
import android.util.Log;
import com.google.android.apps.common.proguard.UsedByNative;
import java.util.HashMap;
import jlv;

public final class NativeCrashHandler {
    private static Context a;
    private static Intent b;
    private static Runnable c;
    private static String d;
    private static HashMap<String, String> e;
    private static final String[] f;
    private static boolean g;

    private static native void setup();

    static {
        f = new String[]{"android.graphics"};
        g = false;
    }

    @UsedByNative
    private static void reportCrash(int i, int i2, long j) {
        String valueOf = String.valueOf(Long.toHexString(j));
        valueOf = new StringBuilder(String.valueOf(valueOf).length() + 62).append("Native crash signal: ").append(i).append(" code: ").append(i2).append(" address: 0x").append(valueOf).toString();
        jlv jlv = new jlv(valueOf);
        Log.e("NativeCrashHandler", valueOf, jlv);
        if (a(jlv)) {
            b.putExtra("knownCrash", true);
        }
        if (c != null) {
            c.run();
        }
        if (d != null) {
            b.putExtra("runnableName", d);
        }
        if (e != null) {
            b.putExtra("runnableArgs", e);
        }
        b.putExtra("description", valueOf);
        a.startActivity(b);
    }

    private static boolean a(jlv jlv) {
        StackTraceElement[] stackTrace = jlv.getStackTrace();
        if (stackTrace == null) {
            return false;
        }
        for (StackTraceElement className : stackTrace) {
            String className2 = className.getClassName();
            if (className2 != null) {
                for (CharSequence contains : f) {
                    if (className2.contains(contains)) {
                        return true;
                    }
                }
                continue;
            }
        }
        return false;
    }

    private static synchronized void a() {
        synchronized (NativeCrashHandler.class) {
            if (!g) {
                try {
                    setup();
                } catch (UnsatisfiedLinkError e) {
                    System.loadLibrary("crashreporterer");
                    setup();
                }
                g = true;
            }
        }
    }

    public static void a(Context context) {
        if (VERSION.SDK_INT < 21) {
            a();
            a = context.getApplicationContext();
            b = new Intent(a, NativeCrashReporterActivity.class);
            b.setFlags(268435456);
            c = null;
            e = null;
        }
    }
}
