import io.grpc.internal.e;

/* compiled from: PG */
final class djb {
    boolean a;
    final /* synthetic */ dja b;
    private dlu c;
    private boolean d;

    djb(dja dja, dlu dlu, boolean z) {
        this.b = dja;
        this.c = dlu;
        this.d = z;
    }

    final int a() {
        return (int) this.c.b;
    }

    final void b() {
        Object obj = 1;
        do {
            int a = a();
            int min = Math.min(a, this.b.g.b.c());
            if (min == a) {
                this.b.g.d.a(-a);
                this.b.a(-a);
                try {
                    this.b.g.b.a(this.d, this.b.b, this.c, a);
                    e eVar = this.b.f;
                    synchronized (eVar.l) {
                        Object obj2 = eVar.j < eVar.i ? 1 : null;
                        eVar.j -= a;
                        Object obj3;
                        if (eVar.j < eVar.i) {
                            obj3 = 1;
                        } else {
                            obj3 = null;
                        }
                        if (obj2 != null || r2 == null) {
                            obj = null;
                        }
                    }
                    if (obj != null) {
                        eVar.i();
                    }
                    if (this.a) {
                        dja dja = this.b;
                        dja.c -= a;
                        this.b.a.remove(this);
                        return;
                    }
                    return;
                } catch (Throwable e) {
                    throw new RuntimeException(e);
                }
            }
            a(min).b();
        } while (a() > 0);
    }

    final djb a(int i) {
        int min = Math.min(i, (int) this.c.b);
        dlu dlu = new dlu();
        dlu.a_(this.c, (long) min);
        djb djb = new djb(this.b, dlu, false);
        if (this.a) {
            dja dja = this.b;
            dja.c -= min;
        }
        return djb;
    }
}
