package defpackage;

import java.util.List;

final class ind {
    private final ijn a;
    private final itl b = new itl();
    private final ijd c;
    private iqo d;

    ind(ijn ijn) {
        this.a = ijn;
        this.c = (ijd) ijn.t().a(ijd.class);
    }

    public String a() {
        return this.b.a();
    }

    public itl b() {
        return this.b;
    }

    public iqo c() {
        return this.d;
    }

    void a(iqo iqo) {
        this.d = iqo;
        this.b.a(iqo.a());
        this.b.b(iqo.b());
        this.b.c(iqo.c());
        this.b.a(iqo.g());
        if (iqo instanceof iqs) {
            this.b.d(((iqs) iqo).s());
        }
        this.b.f(iqo instanceof iqu);
        f();
    }

    public boolean d() {
        return this.d == null ? true : this.d.k();
    }

    private void f() {
        boolean z = true;
        if (d()) {
            ito p = this.a.p();
            itl itl = this.b;
            boolean z2 = p == null || !p.g();
            itl.b(z2);
            if (this.d == null) {
                itc q = this.a.q();
                itl = this.b;
                if (q != null && q.b()) {
                    z = false;
                }
                itl.a(z);
            } else {
                this.b.a(this.d.n());
            }
            this.b.g(false);
            this.b.a(this.c.a());
            return;
        }
        this.b.b(this.d.o());
        this.b.a(this.d.n());
        lym a = this.c.a();
        lym lym = (lym) this.c.b().get(this.d.a());
        if (a != null && lym != null) {
            for (lyn lyn : a.h) {
                if (lyn.a.equals(lym.c)) {
                    this.b.g(true);
                    break;
                }
            }
        }
        List m = this.d.m();
        if (m == null || m.isEmpty()) {
            this.b.a(0);
        } else {
            this.b.a(((Integer) m.get(0)).intValue());
        }
        this.b.a(lym);
    }

    public void e() {
        f();
        this.a.d().b(this);
    }
}
