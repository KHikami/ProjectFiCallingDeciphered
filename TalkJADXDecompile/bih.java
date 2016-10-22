import com.google.android.apps.hangouts.concurrent.impl.ConcurrentService;

public final class bih implements Runnable {
    final /* synthetic */ ConcurrentService a;

    public bih(ConcurrentService concurrentService) {
        this.a = concurrentService;
    }

    public void run() {
        int i = 0;
        ConcurrentService concurrentService;
        if (!this.a.f) {
            concurrentService = this.a;
            glk.c("Babel_ConcService", "Stopping service, as no more tasks are running.", new Object[0]);
            concurrentService.stopSelf();
        } else if (this.a.d.i()) {
            concurrentService = this.a;
            glk.c("Babel_ConcService", "Stopping service, as no more tasks are running.", new Object[0]);
            concurrentService.stopSelf();
        } else {
            i = 1;
        }
        if (i != 0) {
            this.a.b(bhp.DEFAULT);
            this.a.a(ConcurrentService.b);
        }
    }
}
