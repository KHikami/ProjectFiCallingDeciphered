package org.chromium.base;

import android.os.Looper;
import android.util.Printer;
import org.chromium.base.annotations.CalledByNative;
import org.chromium.base.annotations.JNINamespace;
import otp;
import oue;

@JNINamespace
public class TraceEvent {
    public static volatile boolean a;
    private static volatile boolean b;

    private static native void nativeBegin(String str, String str2);

    private static native void nativeBeginToplevel();

    private static native void nativeEnd(String str, String str2);

    private static native void nativeEndToplevel();

    private static native void nativeFinishAsync(String str, long j);

    private static native void nativeInstant(String str, String str2);

    private static native void nativeRegisterEnabledObserver();

    private static native void nativeStartATrace();

    private static native void nativeStartAsync(String str, long j);

    private static native void nativeStopATrace();

    static {
        a = false;
        b = false;
    }

    @CalledByNative
    public static void setEnabled(boolean z) {
        if (z) {
            synchronized (EarlyTraceEvent.a) {
                if (EarlyTraceEvent.b != 1) {
                } else {
                    EarlyTraceEvent.b = 2;
                    EarlyTraceEvent.a();
                }
            }
        }
        a = z;
        if (!b) {
            Printer printer;
            Looper looper = ThreadUtils.a().getLooper();
            if (z) {
                printer = oue.a;
            } else {
                printer = null;
            }
            looper.setMessageLogging(printer);
        }
    }

    public static void a(String str, String str2) {
        if (a) {
            nativeInstant(str, str2);
        }
    }

    public static void b(String str, String str2) {
        if (EarlyTraceEvent.b == 1) {
            otp otp = new otp(str);
            synchronized (EarlyTraceEvent.a) {
                if (EarlyTraceEvent.b != 1) {
                } else {
                    otp = (otp) EarlyTraceEvent.d.put(str, otp);
                    if (otp != null) {
                        throw new IllegalArgumentException("Multiple pending trace events can't have the same name");
                    }
                }
            }
        }
        if (a) {
            nativeBegin(str, str2);
        }
    }

    public static void a(String str) {
        EarlyTraceEvent.a(str);
        if (a) {
            nativeEnd(str, null);
        }
    }
}
