package defpackage;

import android.os.Process;

final class ouo implements Runnable {
    final /* synthetic */ Runnable a;
    final /* synthetic */ oun b;

    ouo(oun oun, Runnable runnable) {
        this.b = oun;
        this.a = runnable;
    }

    public void run() {
        Thread.currentThread().setName("JavaCronetEngine");
        Process.setThreadPriority(9);
        this.a.run();
    }
}
