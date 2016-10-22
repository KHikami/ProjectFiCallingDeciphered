package defpackage;

import android.os.Process;

/* renamed from: clr */
final class clr implements Runnable {
    private /* synthetic */ Runnable a;

    clr(clq clq, Runnable runnable) {
        this.a = runnable;
    }

    public final void run() {
        Process.setThreadPriority(10);
        this.a.run();
    }
}
