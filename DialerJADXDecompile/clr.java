import android.os.Process;

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
