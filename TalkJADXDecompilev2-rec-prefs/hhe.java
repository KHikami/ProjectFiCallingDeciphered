package p000;

import android.os.Process;

final class hhe implements Runnable {
    private final Runnable f16965a;
    private final int f16966b;

    public hhe(Runnable runnable, int i) {
        this.f16965a = runnable;
        this.f16966b = i;
    }

    public void run() {
        Process.setThreadPriority(this.f16966b);
        this.f16965a.run();
    }
}
