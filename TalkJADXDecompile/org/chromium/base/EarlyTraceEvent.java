package org.chromium.base;

import android.os.SystemClock;
import java.util.List;
import java.util.Map;
import org.chromium.base.annotations.JNINamespace;
import otp;

@JNINamespace
public class EarlyTraceEvent {
    static final Object a;
    static volatile int b;
    static List<otp> c;
    static Map<String, otp> d;

    private static native long nativeGetTimeTicksNowUs();

    private static native void nativeRecordEarlyEvent(String str, long j, long j2, int i);

    static {
        a = new Object();
        b = 0;
    }

    public static void a(String str) {
        int i = b;
        if (i == 1 || i == 2) {
            synchronized (a) {
                if (b == 1 || b == 2) {
                    otp otp = (otp) d.remove(str);
                    if (otp == null) {
                        return;
                    }
                    otp.a();
                    c.add(otp);
                    if (b == 2) {
                        a();
                    }
                    return;
                }
            }
        }
    }

    static void a() {
        if (d.isEmpty()) {
            b = 3;
            long nativeGetTimeTicksNowUs = (nativeGetTimeTicksNowUs() - (SystemClock.elapsedRealtime() * 1000)) / 1000;
            for (otp otp : c) {
                nativeRecordEarlyEvent(otp.a, otp.c + nativeGetTimeTicksNowUs, otp.d + nativeGetTimeTicksNowUs, otp.b);
            }
            c = null;
            d = null;
        }
    }
}
