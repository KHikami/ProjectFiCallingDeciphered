package com.google.common.flogger.backend.android;

import android.util.Log;
import dalvik.system.VMStack;
import java.util.Locale;
import mob;
import mor;
import mov;
import mox;
import mph;
import mpn;
import mpo;

public final class AndroidPlatform extends mov {
    private static final mox CALLER_FINDER;
    private static final boolean USE_FAST_ANDROID_STACK;

    final class 1 extends mox {
        1() {
        }

        public String findLoggingClass(Class<? extends Object> cls) {
            if (AndroidPlatform.USE_FAST_ANDROID_STACK) {
                try {
                    Class stackClass1 = AndroidPlatform.getStackClass1();
                    if (cls.equals(stackClass1)) {
                        return VMStack.getStackClass2().getName();
                    }
                    String valueOf = String.valueOf(cls);
                    String valueOf2 = String.valueOf(stackClass1);
                    throw new IllegalStateException(new StringBuilder((String.valueOf(valueOf).length() + 43) + String.valueOf(valueOf2).length()).append("Unexpected stack depth, expected: ").append(valueOf).append(" but was ").append(valueOf2).toString());
                } catch (Throwable th) {
                }
            }
            return null;
        }

        public mob findLogSite(Class<? extends Object> cls, int i) {
            return mob.a;
        }
    }

    final class InternalStackVerifier {
        InternalStackVerifier() {
        }

        static boolean isVmStackPresent() {
            return AndroidPlatform.isVmStackPresent();
        }
    }

    static {
        USE_FAST_ANDROID_STACK = InternalStackVerifier.isVmStackPresent();
        Log.class.getName();
        CALLER_FINDER = new 1();
    }

    static boolean isVmStackPresent() {
        boolean z = false;
        try {
            Class.forName("dalvik.system.VMStack").getMethod("getStackClass2", new Class[0]);
            z = InternalStackVerifier.class.getName().equals(staticGetLoggingClassName());
        } catch (Throwable th) {
        }
        return z;
    }

    static String staticGetLoggingClassName() {
        try {
            return VMStack.getStackClass2().getName();
        } catch (Throwable th) {
            return null;
        }
    }

    static Class<?> getStackClass1() {
        return VMStack.getStackClass2();
    }

    protected mox getCallerFinderImpl() {
        return CALLER_FINDER;
    }

    protected String formatImpl(String str, Object obj) {
        return String.format(Locale.ROOT, str, new Object[]{obj});
    }

    protected String getConfigInfoImpl() {
        return "platform: Android";
    }

    protected mor getBackendImpl(String str) {
        if (mpn.a.get() != null) {
            return ((mph) mpn.a.get()).a(str);
        }
        mor mpn = new mpn(str.replace('$', '.'));
        mpo.a.offer(mpn);
        if (mpn.a.get() == null) {
            return mpn;
        }
        mpn.c();
        return mpn;
    }
}
