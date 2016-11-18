package p000;

import com.google.android.apps.hangouts.concurrent.impl.ConcurrentService;

public final class bii implements Runnable {
    final /* synthetic */ ConcurrentService f3430a;

    public bii(ConcurrentService concurrentService) {
        this.f3430a = concurrentService;
    }

    public void run() {
        synchronized (this.f3430a.f5965c) {
            if (!this.f3430a.f5969g.isShutdown()) {
                this.f3430a.f5969g.submit(this.f3430a.f5973k);
            }
        }
    }
}
