package p000;

public final class oyj extends nyx<oyj> {
    public oyb f34636a;
    public nuo f34637b;
    public nae f34638c;
    public mva f34639d;
    public Integer f34640e;
    public Integer f34641f;
    public ozm f34642g;
    public Float f34643h;
    public Boolean f34644i;

    public /* synthetic */ nzf m39912a(nyt nyt) {
        return m39910b(nyt);
    }

    public oyj() {
        m39911d();
    }

    private oyj m39911d() {
        this.f34636a = null;
        this.f34637b = null;
        this.f34638c = null;
        this.f34639d = null;
        this.f34640e = null;
        this.f34642g = null;
        this.f34643h = null;
        this.f34644i = null;
        this.unknownFieldData = null;
        this.cachedSize = -1;
        return this;
    }

    public void m39913a(nyu nyu) {
        if (this.f34636a != null) {
            nyu.m37182b(1, this.f34636a);
        }
        if (this.f34637b != null) {
            nyu.m37182b(2, this.f34637b);
        }
        if (this.f34638c != null) {
            nyu.m37182b(3, this.f34638c);
        }
        if (this.f34639d != null) {
            nyu.m37182b(4, this.f34639d);
        }
        if (this.f34640e != null) {
            nyu.m37168a(5, this.f34640e.intValue());
        }
        if (this.f34641f != null) {
            nyu.m37168a(6, this.f34641f.intValue());
        }
        if (this.f34642g != null) {
            nyu.m37182b(7, this.f34642g);
        }
        if (this.f34643h != null) {
            nyu.m37167a(10, this.f34643h.floatValue());
        }
        if (this.f34644i != null) {
            nyu.m37172a(11, this.f34644i.booleanValue());
        }
        super.a(nyu);
    }

    protected int m39914b() {
        int b = super.b();
        if (this.f34636a != null) {
            b += nyu.m37145d(1, this.f34636a);
        }
        if (this.f34637b != null) {
            b += nyu.m37145d(2, this.f34637b);
        }
        if (this.f34638c != null) {
            b += nyu.m37145d(3, this.f34638c);
        }
        if (this.f34639d != null) {
            b += nyu.m37145d(4, this.f34639d);
        }
        if (this.f34640e != null) {
            b += nyu.m37147f(5, this.f34640e.intValue());
        }
        if (this.f34641f != null) {
            b += nyu.m37147f(6, this.f34641f.intValue());
        }
        if (this.f34642g != null) {
            b += nyu.m37145d(7, this.f34642g);
        }
        if (this.f34643h != null) {
            this.f34643h.floatValue();
            b += nyu.m37154h(10) + 4;
        }
        if (this.f34644i == null) {
            return b;
        }
        this.f34644i.booleanValue();
        return b + (nyu.m37154h(11) + 1);
    }

    private oyj m39910b(nyt nyt) {
        while (true) {
            int a = nyt.m37099a();
            switch (a) {
                case 0:
                    break;
                case 10:
                    if (this.f34636a == null) {
                        this.f34636a = new oyb();
                    }
                    nyt.m37101a(this.f34636a);
                    continue;
                case wi.dH /*18*/:
                    if (this.f34637b == null) {
                        this.f34637b = new nuo();
                    }
                    nyt.m37101a(this.f34637b);
                    continue;
                case wi.dx /*26*/:
                    if (this.f34638c == null) {
                        this.f34638c = new nae();
                    }
                    nyt.m37101a(this.f34638c);
                    continue;
                case 34:
                    if (this.f34639d == null) {
                        this.f34639d = new mva();
                    }
                    nyt.m37101a(this.f34639d);
                    continue;
                case 40:
                    this.f34640e = Integer.valueOf(nyt.m37112f());
                    continue;
                case 48:
                    a = nyt.m37112f();
                    switch (a) {
                        case 0:
                        case 1:
                        case 2:
                            this.f34641f = Integer.valueOf(a);
                            break;
                        default:
                            continue;
                    }
                case 58:
                    if (this.f34642g == null) {
                        this.f34642g = new ozm();
                    }
                    nyt.m37101a(this.f34642g);
                    continue;
                case 85:
                    this.f34643h = Float.valueOf(nyt.m37106c());
                    continue;
                case 88:
                    this.f34644i = Boolean.valueOf(nyt.m37116i());
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
