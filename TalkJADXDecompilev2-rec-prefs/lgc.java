package p000;

import android.os.Process;
import android.os.StrictMode;

final class lgc implements Runnable {
    final /* synthetic */ Runnable f24940a;
    final /* synthetic */ lgb f24941b;

    lgc(lgb lgb, Runnable runnable) {
        this.f24941b = lgb;
        this.f24940a = runnable;
    }

    public void run() {
        StrictMode.setThreadPolicy(this.f24941b.f24938a);
        Process.setThreadPriority(this.f24941b.f24939b);
        this.f24940a.run();
    }
}
