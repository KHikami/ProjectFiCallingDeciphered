package p000;

import android.os.Process;

final class hdf implements Runnable {
    final /* synthetic */ Runnable f16688a;
    final /* synthetic */ hde f16689b;

    hdf(hde hde, Runnable runnable) {
        this.f16689b = hde;
        this.f16688a = runnable;
    }

    public void run() {
        Process.setThreadPriority(10);
        this.f16688a.run();
    }
}
