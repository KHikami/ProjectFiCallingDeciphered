package p000;

import android.os.Process;

final class lga implements Runnable {
    final /* synthetic */ Runnable f24936a;
    final /* synthetic */ lfz f24937b;

    lga(lfz lfz, Runnable runnable) {
        this.f24937b = lfz;
        this.f24936a = runnable;
    }

    public void run() {
        Process.setThreadPriority(11);
        this.f24936a.run();
    }
}
