package defpackage;

final class lgz implements Runnable {
    final /* synthetic */ lgy a;

    lgz(lgy lgy) {
        this.a = lgy;
    }

    public void run() {
        Throwable th;
        while (!this.a.b.isShutdown()) {
            try {
                ((lha) this.a.a.remove()).b.b(null);
            } catch (InterruptedException e) {
                try {
                    this.a.b.execute(this);
                    return;
                } catch (Throwable e2) {
                    th = e2;
                    synchronized (lha.a) {
                        for (mtt a : lha.a) {
                            a.a(th);
                        }
                        return;
                    }
                }
            } catch (Throwable e22) {
                th = e22;
                try {
                    this.a.b.execute(this);
                } catch (Throwable e222) {
                    Throwable th2 = e222;
                    synchronized (lha.a) {
                        for (mtt a2 : lha.a) {
                            a2.a(th2);
                        }
                    }
                }
            }
        }
        try {
            this.a.b.execute(this);
        } catch (Throwable e2222) {
            th = e2222;
            synchronized (lha.a) {
                for (mtt a22 : lha.a) {
                    a22.a(th);
                }
            }
        }
    }
}
