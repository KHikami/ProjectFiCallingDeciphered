package defpackage;

import android.os.Process;

final class hhe implements Runnable {
    private final Runnable a;
    private final int b;

    public hhe(Runnable runnable, int i) {
        this.a = runnable;
        this.b = i;
    }

    public void run() {
        Process.setThreadPriority(this.b);
        this.a.run();
    }
}
