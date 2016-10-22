final class lgr implements Runnable {
    final /* synthetic */ lgq a;

    lgr(lgq lgq) {
        this.a = lgq;
    }

    public void run() {
        try {
            this.a.b.run();
            if (!this.a.c.isDone()) {
                this.a.d.a(this.a.g.a.a(this.a.a, this.a.e, this.a.f));
            }
        } catch (Throwable th) {
            this.a.c.a(th);
        }
    }
}
