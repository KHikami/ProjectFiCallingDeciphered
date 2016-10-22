package defpackage;

import android.os.Process;
import android.os.StrictMode;

/* renamed from: lgc */
final class lgc implements Runnable {
    final /* synthetic */ Runnable a;
    final /* synthetic */ lgb b;

    lgc(lgb lgb, Runnable runnable) {
        this.b = lgb;
        this.a = runnable;
    }

    public void run() {
        StrictMode.setThreadPolicy(this.b.a);
        Process.setThreadPriority(this.b.b);
        this.a.run();
    }
}
