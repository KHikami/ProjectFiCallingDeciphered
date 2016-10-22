package org.chromium.base;

import android.app.Activity;
import android.os.Looper;
import ayo;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import org.chromium.base.annotations.CalledByNative;
import org.chromium.base.annotations.JNINamespace;
import otm;
import oto;
import otu;

@JNINamespace
public class ApplicationStatus {
    public static Activity a;
    public static ayo b;
    public static final otu<ayo> c;
    private static Object d;
    private static Integer e;
    private static final Map<Activity, oto> f;
    private static final otu<Object> g;

    private static native void nativeOnApplicationStateChange(int i);

    static {
        d = new Object();
        f = new ConcurrentHashMap();
        g = new otu();
        c = new otu();
    }

    private ApplicationStatus() {
    }

    @CalledByNative
    public static int getStateForApplication() {
        int a;
        int i = 0;
        int i2 = 1;
        synchronized (d) {
            if (e == null) {
                int i3 = 0;
                for (oto a2 : f.values()) {
                    a = a2.a();
                    if (a != 4 && a != 5 && a != 6) {
                        break;
                    } else if (a == 4) {
                        i3 = 1;
                    } else {
                        if (a == 5) {
                            a = 1;
                        } else {
                            a = i;
                        }
                        i = a;
                    }
                }
                i2 = i3 != 0 ? 2 : i != 0 ? 3 : 4;
                e = Integer.valueOf(i2);
            }
            a = e.intValue();
        }
        return a;
    }

    public static void a(ayo ayo) {
        c.a(ayo);
    }

    @CalledByNative
    private static void registerThreadSafeNativeApplicationStateListener() {
        Object obj;
        otm otm = new otm();
        if (ThreadUtils.a().getLooper() == Looper.myLooper()) {
            obj = 1;
        } else {
            obj = null;
        }
        if (obj != null) {
            otm.run();
        } else {
            ThreadUtils.a().post(otm);
        }
    }
}
