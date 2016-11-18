package p000;

import com.google.android.apps.hangouts.concurrent.impl.ConcurrentService;

public final class bih implements Runnable {
    final /* synthetic */ ConcurrentService f3429a;

    public bih(ConcurrentService concurrentService) {
        this.f3429a = concurrentService;
    }

    public void run() {
        int i = 0;
        ConcurrentService concurrentService;
        if (!this.f3429a.f5968f) {
            concurrentService = this.f3429a;
            glk.m17979c("Babel_ConcService", "Stopping service, as no more tasks are running.", new Object[0]);
            concurrentService.stopSelf();
        } else if (this.f3429a.f5966d.m5338i()) {
            concurrentService = this.f3429a;
            glk.m17979c("Babel_ConcService", "Stopping service, as no more tasks are running.", new Object[0]);
            concurrentService.stopSelf();
        } else {
            i = 1;
        }
        if (i != 0) {
            this.f3429a.m8235b(bhp.DEFAULT);
            this.f3429a.m8228a(ConcurrentService.f5960b);
        }
    }
}
