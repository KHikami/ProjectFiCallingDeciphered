package p000;

import java.util.List;

final class ind {
    private final ijn f18105a;
    private final itl f18106b = new itl();
    private final ijd f18107c;
    private iqo f18108d;

    ind(ijn ijn) {
        this.f18105a = ijn;
        this.f18107c = (ijd) ijn.mo3229t().m21926a(ijd.class);
    }

    public String m22332a() {
        return this.f18106b.m23229a();
    }

    public itl m22334b() {
        return this.f18106b;
    }

    public iqo m22335c() {
        return this.f18108d;
    }

    void m22333a(iqo iqo) {
        this.f18108d = iqo;
        this.f18106b.m23226a(iqo.m22949a());
        this.f18106b.m23230b(iqo.m22953b());
        this.f18106b.m23233c(iqo.m22956c());
        this.f18106b.m23225a(iqo.m22965g());
        if (iqo instanceof iqs) {
            this.f18106b.m23236d(((iqs) iqo).m22978s());
        }
        this.f18106b.m23241f(iqo instanceof iqu);
        m22331f();
    }

    public boolean m22336d() {
        return this.f18108d == null ? true : this.f18108d.m22969k();
    }

    private void m22331f() {
        boolean z = true;
        if (m22336d()) {
            ito p = this.f18105a.mo3225p();
            itl itl = this.f18106b;
            boolean z2 = p == null || !p.mo1322g();
            itl.m23231b(z2);
            if (this.f18108d == null) {
                itc q = this.f18105a.mo3226q();
                itl = this.f18106b;
                if (q != null && q.mo3397b()) {
                    z = false;
                }
                itl.m23228a(z);
            } else {
                this.f18106b.m23228a(this.f18108d.m22972n());
            }
            this.f18106b.m23243g(false);
            this.f18106b.m23227a(this.f18107c.mo3376a());
            return;
        }
        this.f18106b.m23231b(this.f18108d.m22973o());
        this.f18106b.m23228a(this.f18108d.m22972n());
        lym a = this.f18107c.mo3376a();
        lym lym = (lym) this.f18107c.mo3365b().get(this.f18108d.m22949a());
        if (a != null && lym != null) {
            for (lyn lyn : a.f26913h) {
                if (lyn.f26931a.equals(lym.f26908c)) {
                    this.f18106b.m23243g(true);
                    break;
                }
            }
        }
        List m = this.f18108d.m22971m();
        if (m == null || m.isEmpty()) {
            this.f18106b.m23224a(0);
        } else {
            this.f18106b.m23224a(((Integer) m.get(0)).intValue());
        }
        this.f18106b.m23227a(lym);
    }

    public void m22337e() {
        m22331f();
        this.f18105a.m21966d().m22343b(this);
    }
}
