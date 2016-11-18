package p000;

public final class orj extends nyx<orj> {
    public Integer f34017a;
    public Long f34018b;
    public Integer f34019c;
    public Long f34020d;
    public Integer f34021e;
    public Long f34022f;

    public /* synthetic */ nzf m39429a(nyt nyt) {
        return m39427b(nyt);
    }

    public orj() {
        m39428d();
    }

    private orj m39428d() {
        this.f34017a = null;
        this.f34018b = null;
        this.f34019c = null;
        this.f34020d = null;
        this.f34021e = null;
        this.f34022f = null;
        this.unknownFieldData = null;
        this.cachedSize = -1;
        return this;
    }

    public void m39430a(nyu nyu) {
        if (this.f34017a != null) {
            nyu.m37168a(1, this.f34017a.intValue());
        }
        if (this.f34018b != null) {
            nyu.m37181b(2, this.f34018b.longValue());
        }
        if (this.f34019c != null) {
            nyu.m37168a(3, this.f34019c.intValue());
        }
        if (this.f34020d != null) {
            nyu.m37181b(4, this.f34020d.longValue());
        }
        if (this.f34021e != null) {
            nyu.m37168a(5, this.f34021e.intValue());
        }
        if (this.f34022f != null) {
            nyu.m37181b(6, this.f34022f.longValue());
        }
        super.a(nyu);
    }

    protected int m39431b() {
        int b = super.b();
        if (this.f34017a != null) {
            b += nyu.m37147f(1, this.f34017a.intValue());
        }
        if (this.f34018b != null) {
            b += nyu.m37148f(2, this.f34018b.longValue());
        }
        if (this.f34019c != null) {
            b += nyu.m37147f(3, this.f34019c.intValue());
        }
        if (this.f34020d != null) {
            b += nyu.m37148f(4, this.f34020d.longValue());
        }
        if (this.f34021e != null) {
            b += nyu.m37147f(5, this.f34021e.intValue());
        }
        if (this.f34022f != null) {
            return b + nyu.m37148f(6, this.f34022f.longValue());
        }
        return b;
    }

    private orj m39427b(nyt nyt) {
        while (true) {
            int a = nyt.m37099a();
            switch (a) {
                case 0:
                    break;
                case 8:
                    this.f34017a = Integer.valueOf(nyt.m37112f());
                    continue;
                case 16:
                    this.f34018b = Long.valueOf(nyt.m37110e());
                    continue;
                case wi.dA /*24*/:
                    this.f34019c = Integer.valueOf(nyt.m37112f());
                    continue;
                case 32:
                    this.f34020d = Long.valueOf(nyt.m37110e());
                    continue;
                case 40:
                    this.f34021e = Integer.valueOf(nyt.m37112f());
                    continue;
                case 48:
                    this.f34022f = Long.valueOf(nyt.m37110e());
                    continue;
                default:
                    if (!super.a(nyt, a)) {
                        break;
                    }
                    continue;
            }
            return this;
        }
    }
}
