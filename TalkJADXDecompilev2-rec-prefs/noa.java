package p000;

public final class noa extends nyx<noa> {
    public Integer f30320a;
    public Integer f30321b;
    public Integer f30322c;
    public Boolean f30323d;
    public Long f30324e;
    public Integer f30325f;

    public /* synthetic */ nzf m35859a(nyt nyt) {
        return m35857b(nyt);
    }

    public noa() {
        m35858d();
    }

    private noa m35858d() {
        this.f30320a = null;
        this.f30321b = null;
        this.f30322c = null;
        this.f30323d = null;
        this.f30324e = null;
        this.unknownFieldData = null;
        this.cachedSize = -1;
        return this;
    }

    public void m35860a(nyu nyu) {
        if (this.f30320a != null) {
            nyu.m37168a(1, this.f30320a.intValue());
        }
        if (this.f30321b != null) {
            nyu.m37168a(2, this.f30321b.intValue());
        }
        if (this.f30322c != null) {
            nyu.m37168a(3, this.f30322c.intValue());
        }
        if (this.f30323d != null) {
            nyu.m37172a(4, this.f30323d.booleanValue());
        }
        if (this.f30324e != null) {
            nyu.m37181b(5, this.f30324e.longValue());
        }
        if (this.f30325f != null) {
            nyu.m37168a(6, this.f30325f.intValue());
        }
        super.a(nyu);
    }

    protected int m35861b() {
        int b = super.b();
        if (this.f30320a != null) {
            b += nyu.m37147f(1, this.f30320a.intValue());
        }
        if (this.f30321b != null) {
            b += nyu.m37147f(2, this.f30321b.intValue());
        }
        if (this.f30322c != null) {
            b += nyu.m37147f(3, this.f30322c.intValue());
        }
        if (this.f30323d != null) {
            this.f30323d.booleanValue();
            b += nyu.m37154h(4) + 1;
        }
        if (this.f30324e != null) {
            b += nyu.m37148f(5, this.f30324e.longValue());
        }
        if (this.f30325f != null) {
            return b + nyu.m37147f(6, this.f30325f.intValue());
        }
        return b;
    }

    private noa m35857b(nyt nyt) {
        while (true) {
            int a = nyt.m37099a();
            switch (a) {
                case 0:
                    break;
                case 8:
                    this.f30320a = Integer.valueOf(nyt.m37112f());
                    continue;
                case 16:
                    this.f30321b = Integer.valueOf(nyt.m37112f());
                    continue;
                case wi.dA /*24*/:
                    this.f30322c = Integer.valueOf(nyt.m37112f());
                    continue;
                case 32:
                    this.f30323d = Boolean.valueOf(nyt.m37116i());
                    continue;
                case 40:
                    this.f30324e = Long.valueOf(nyt.m37110e());
                    continue;
                case 48:
                    a = nyt.m37112f();
                    switch (a) {
                        case 0:
                        case 1:
                        case 2:
                        case 3:
                            this.f30325f = Integer.valueOf(a);
                            break;
                        default:
                            continue;
                    }
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
