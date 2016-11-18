package p000;

public final class obd extends nyx<obd> {
    public Boolean f31907a;
    public Boolean f31908b;
    public Boolean f31909c;
    public Boolean f31910d;
    public Boolean f31911e;
    public Boolean f31912f;
    public Boolean f31913g;

    public /* synthetic */ nzf m37600a(nyt nyt) {
        return m37598b(nyt);
    }

    public obd() {
        m37599d();
    }

    private obd m37599d() {
        this.f31907a = null;
        this.f31908b = null;
        this.f31909c = null;
        this.f31910d = null;
        this.f31911e = null;
        this.f31912f = null;
        this.f31913g = null;
        this.unknownFieldData = null;
        this.cachedSize = -1;
        return this;
    }

    public void m37601a(nyu nyu) {
        if (this.f31907a != null) {
            nyu.m37172a(1, this.f31907a.booleanValue());
        }
        if (this.f31908b != null) {
            nyu.m37172a(2, this.f31908b.booleanValue());
        }
        if (this.f31909c != null) {
            nyu.m37172a(3, this.f31909c.booleanValue());
        }
        if (this.f31910d != null) {
            nyu.m37172a(4, this.f31910d.booleanValue());
        }
        if (this.f31911e != null) {
            nyu.m37172a(5, this.f31911e.booleanValue());
        }
        if (this.f31912f != null) {
            nyu.m37172a(6, this.f31912f.booleanValue());
        }
        if (this.f31913g != null) {
            nyu.m37172a(7, this.f31913g.booleanValue());
        }
        super.a(nyu);
    }

    protected int m37602b() {
        int b = super.b();
        if (this.f31907a != null) {
            this.f31907a.booleanValue();
            b += nyu.m37154h(1) + 1;
        }
        if (this.f31908b != null) {
            this.f31908b.booleanValue();
            b += nyu.m37154h(2) + 1;
        }
        if (this.f31909c != null) {
            this.f31909c.booleanValue();
            b += nyu.m37154h(3) + 1;
        }
        if (this.f31910d != null) {
            this.f31910d.booleanValue();
            b += nyu.m37154h(4) + 1;
        }
        if (this.f31911e != null) {
            this.f31911e.booleanValue();
            b += nyu.m37154h(5) + 1;
        }
        if (this.f31912f != null) {
            this.f31912f.booleanValue();
            b += nyu.m37154h(6) + 1;
        }
        if (this.f31913g == null) {
            return b;
        }
        this.f31913g.booleanValue();
        return b + (nyu.m37154h(7) + 1);
    }

    private obd m37598b(nyt nyt) {
        while (true) {
            int a = nyt.m37099a();
            switch (a) {
                case 0:
                    break;
                case 8:
                    this.f31907a = Boolean.valueOf(nyt.m37116i());
                    continue;
                case 16:
                    this.f31908b = Boolean.valueOf(nyt.m37116i());
                    continue;
                case wi.dA /*24*/:
                    this.f31909c = Boolean.valueOf(nyt.m37116i());
                    continue;
                case 32:
                    this.f31910d = Boolean.valueOf(nyt.m37116i());
                    continue;
                case 40:
                    this.f31911e = Boolean.valueOf(nyt.m37116i());
                    continue;
                case 48:
                    this.f31912f = Boolean.valueOf(nyt.m37116i());
                    continue;
                case 56:
                    this.f31913g = Boolean.valueOf(nyt.m37116i());
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
