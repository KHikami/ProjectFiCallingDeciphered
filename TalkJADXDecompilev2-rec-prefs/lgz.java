package p000;

final class lgz implements Runnable {
    final /* synthetic */ lgy f24989a;

    lgz(lgy lgy) {
        this.f24989a = lgy;
    }

    public void run() {
        Throwable th;
        while (!this.f24989a.f24987b.isShutdown()) {
            try {
                ((lha) this.f24989a.f24986a.remove()).f24992b.mo3943b(null);
            } catch (InterruptedException e) {
                try {
                    this.f24989a.f24987b.execute(this);
                    return;
                } catch (Throwable e2) {
                    th = e2;
                    synchronized (lha.f24991a) {
                        for (mtt a : lha.f24991a) {
                            a.mo3941a(th);
                        }
                        return;
                    }
                }
            } catch (Throwable e22) {
                th = e22;
                try {
                    this.f24989a.f24987b.execute(this);
                } catch (Throwable e222) {
                    Throwable th2 = e222;
                    synchronized (lha.f24991a) {
                        for (mtt a2 : lha.f24991a) {
                            a2.mo3941a(th2);
                        }
                    }
                }
            }
        }
        try {
            this.f24989a.f24987b.execute(this);
        } catch (Throwable e2222) {
            th = e2222;
            synchronized (lha.f24991a) {
                for (mtt a22 : lha.f24991a) {
                    a22.mo3941a(th);
                }
            }
        }
    }
}
