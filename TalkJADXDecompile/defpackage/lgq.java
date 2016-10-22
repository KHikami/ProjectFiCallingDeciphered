package defpackage;

import java.util.concurrent.TimeUnit;

/* renamed from: lgq */
final class lgq implements Runnable {
    final Runnable a;
    final /* synthetic */ Runnable b;
    final /* synthetic */ mtt c;
    final /* synthetic */ lgs d;
    final /* synthetic */ long e;
    final /* synthetic */ TimeUnit f;
    final /* synthetic */ lgl g;

    lgq(lgl lgl, Runnable runnable, mtt mtt, lgs lgs, long j, TimeUnit timeUnit) {
        this.g = lgl;
        this.b = runnable;
        this.c = mtt;
        this.d = lgs;
        this.e = j;
        this.f = timeUnit;
        this.a = this;
    }

    public void run() {
        this.g.execute(new lgr(this));
    }
}
