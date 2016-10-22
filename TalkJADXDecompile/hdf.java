import android.os.Process;

final class hdf implements Runnable {
    final /* synthetic */ Runnable a;
    final /* synthetic */ hde b;

    hdf(hde hde, Runnable runnable) {
        this.b = hde;
        this.a = runnable;
    }

    public void run() {
        Process.setThreadPriority(10);
        this.a.run();
    }
}
