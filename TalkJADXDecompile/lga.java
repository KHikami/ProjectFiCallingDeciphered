import android.os.Process;

final class lga implements Runnable {
    final /* synthetic */ Runnable a;
    final /* synthetic */ lfz b;

    lga(lfz lfz, Runnable runnable) {
        this.b = lfz;
        this.a = runnable;
    }

    public void run() {
        Process.setThreadPriority(11);
        this.a.run();
    }
}
