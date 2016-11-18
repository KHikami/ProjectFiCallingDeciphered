package p000;

import java.util.concurrent.TimeUnit;

final class lgq implements Runnable {
    final Runnable f24971a = this;
    final /* synthetic */ Runnable f24972b;
    final /* synthetic */ mtt f24973c;
    final /* synthetic */ lgs f24974d;
    final /* synthetic */ long f24975e;
    final /* synthetic */ TimeUnit f24976f;
    final /* synthetic */ lgl f24977g;

    lgq(lgl lgl, Runnable runnable, mtt mtt, lgs lgs, long j, TimeUnit timeUnit) {
        this.f24977g = lgl;
        this.f24972b = runnable;
        this.f24973c = mtt;
        this.f24974d = lgs;
        this.f24975e = j;
        this.f24976f = timeUnit;
    }

    public void run() {
        this.f24977g.execute(new lgr(this));
    }
}
