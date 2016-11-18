package p000;

final class lgr implements Runnable {
    final /* synthetic */ lgq f24978a;

    lgr(lgq lgq) {
        this.f24978a = lgq;
    }

    public void run() {
        try {
            this.f24978a.f24972b.run();
            if (!this.f24978a.f24973c.isDone()) {
                this.f24978a.f24974d.m29046a(this.f24978a.f24977g.f24960a.mo3701a(this.f24978a.f24971a, this.f24978a.f24975e, this.f24978a.f24976f));
            }
        } catch (Throwable th) {
            this.f24978a.f24973c.mo3941a(th);
        }
    }
}
