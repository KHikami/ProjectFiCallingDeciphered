package defpackage;

import android.os.Process;
import android.os.StrictMode;
import com.google.android.apps.hangouts.concurrent.impl.ConcurrentService;

final class bil implements Runnable {
    final /* synthetic */ Runnable a;
    final /* synthetic */ bik b;

    bil(bik bik, Runnable runnable) {
        this.b = bik;
        this.a = runnable;
    }

    public void run() {
        StrictMode.setThreadPolicy(ConcurrentService.a);
        Process.setThreadPriority(this.b.a);
        this.a.run();
    }
}
