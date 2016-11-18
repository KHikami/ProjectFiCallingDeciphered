package p000;

import android.os.Process;
import android.os.StrictMode;
import com.google.android.apps.hangouts.concurrent.impl.ConcurrentService;

final class bil implements Runnable {
    final /* synthetic */ Runnable f3434a;
    final /* synthetic */ bik f3435b;

    bil(bik bik, Runnable runnable) {
        this.f3435b = bik;
        this.f3434a = runnable;
    }

    public void run() {
        StrictMode.setThreadPolicy(ConcurrentService.f5959a);
        Process.setThreadPriority(this.f3435b.f3432a);
        this.f3434a.run();
    }
}
