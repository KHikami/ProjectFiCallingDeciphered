import android.os.Process;

final class cmm implements Runnable {
    private final Runnable a;
    private final int b;

    public cmm(Runnable runnable, int i) {
        this.a = runnable;
        this.b = i;
    }

    public final void run() {
        Process.setThreadPriority(this.b);
        this.a.run();
    }
}
