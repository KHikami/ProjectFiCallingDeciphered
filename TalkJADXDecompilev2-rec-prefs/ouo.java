package p000;

import android.os.Process;

final class ouo implements Runnable {
    final /* synthetic */ Runnable f34316a;
    final /* synthetic */ oun f34317b;

    ouo(oun oun, Runnable runnable) {
        this.f34317b = oun;
        this.f34316a = runnable;
    }

    public void run() {
        Thread.currentThread().setName("JavaCronetEngine");
        Process.setThreadPriority(9);
        this.f34316a.run();
    }
}
