package defpackage;

import com.google.android.apps.hangouts.concurrent.impl.ConcurrentService;

public final class bij implements Runnable {
    final /* synthetic */ ConcurrentService a;

    public bij(ConcurrentService concurrentService) {
        this.a = concurrentService;
    }

    public void run() {
        this.a.d.h();
    }
}
