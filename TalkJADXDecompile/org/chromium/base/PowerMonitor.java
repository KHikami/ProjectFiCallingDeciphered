package org.chromium.base;

import android.os.Handler;
import android.os.Looper;
import ayo;
import org.chromium.base.annotations.CalledByNative;
import org.chromium.base.annotations.JNINamespace;
import otx;

@JNINamespace
public class PowerMonitor implements ayo {
    private static PowerMonitor a;
    private static final Runnable d;
    private boolean b;
    private final Handler c;

    private static native void nativeOnBatteryChargingChanged();

    private static native void nativeOnMainActivityResumed();

    private static native void nativeOnMainActivitySuspended();

    static {
        d = new otx();
    }

    private PowerMonitor() {
        this.c = new Handler(Looper.getMainLooper());
    }

    @CalledByNative
    private static boolean isBatteryPower() {
        return a.b;
    }
}
