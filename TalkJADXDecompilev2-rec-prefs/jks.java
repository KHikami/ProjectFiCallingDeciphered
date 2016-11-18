package p000;

import android.os.Looper;

final class jks implements Runnable {
    final /* synthetic */ jkp f20379a;

    jks(jkp jkp) {
        this.f20379a = jkp;
    }

    public void run() {
        Looper.myQueue().addIdleHandler(this.f20379a.f20359b);
    }
}
