package p000;

import android.os.Build.VERSION;
import android.os.Looper;

final class iuj extends ThreadLocal<iui> {
    iuj() {
    }

    protected /* synthetic */ Object initialValue() {
        if (VERSION.SDK_INT >= 16) {
            return new iuo();
        }
        Looper myLooper = Looper.myLooper();
        if (myLooper != null) {
            return new iun(myLooper);
        }
        throw new IllegalStateException("The current thread must have a looper!");
    }
}
