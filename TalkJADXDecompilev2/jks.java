package defpackage;

import android.os.Looper;

final class jks implements Runnable {
    final /* synthetic */ jkp a;

    jks(jkp jkp) {
        this.a = jkp;
    }

    public void run() {
        Looper.myQueue().addIdleHandler(this.a.b);
    }
}