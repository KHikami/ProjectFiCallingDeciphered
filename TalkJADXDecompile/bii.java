import com.google.android.apps.hangouts.concurrent.impl.ConcurrentService;

public final class bii implements Runnable {
    final /* synthetic */ ConcurrentService a;

    public bii(ConcurrentService concurrentService) {
        this.a = concurrentService;
    }

    public void run() {
        synchronized (this.a.c) {
            if (!this.a.g.isShutdown()) {
                this.a.g.submit(this.a.k);
            }
        }
    }
}
