package p000;

public final class mxs extends nyx<mxs> {
    public int f29082a;
    public mxx f29083b;
    public mwy f29084c;
    public mwk f29085d;
    public Boolean f29086e;

    public /* synthetic */ nzf m33725a(nyt nyt) {
        return m33724b(nyt);
    }

    public mxs() {
        this.f29082a = nzf.UNSET_ENUM_VALUE;
        this.f29086e = null;
        this.cachedSize = -1;
    }

    public void m33726a(nyu nyu) {
        if (this.f29082a != nzf.UNSET_ENUM_VALUE) {
            nyu.m37168a(1, this.f29082a);
        }
        if (this.f29083b != null) {
            nyu.m37182b(2, this.f29083b);
        }
        if (this.f29084c != null) {
            nyu.m37182b(3, this.f29084c);
        }
        if (this.f29085d != null) {
            nyu.m37182b(4, this.f29085d);
        }
        if (this.f29086e != null) {
            nyu.m37172a(5, this.f29086e.booleanValue());
        }
        super.a(nyu);
    }

    protected int m33727b() {
        int b = super.b();
        if (this.f29082a != nzf.UNSET_ENUM_VALUE) {
            b += nyu.m37147f(1, this.f29082a);
        }
        if (this.f29083b != null) {
            b += nyu.m37145d(2, this.f29083b);
        }
        if (this.f29084c != null) {
            b += nyu.m37145d(3, this.f29084c);
        }
        if (this.f29085d != null) {
            b += nyu.m37145d(4, this.f29085d);
        }
        if (this.f29086e == null) {
            return b;
        }
        this.f29086e.booleanValue();
        return b + (nyu.m37154h(5) + 1);
    }

    private mxs m33724b(nyt nyt) {
        while (true) {
            int a = nyt.m37099a();
            switch (a) {
                case 0:
                    break;
                case 8:
                    a = nyt.m37112f();
                    switch (a) {
                        case 0:
                        case 1:
                        case 2:
                        case 3:
                        case 4:
                        case 5:
                        case 6:
                        case 7:
                        case 8:
                        case 9:
                        case 10:
                        case 11:
                        case 12:
                        case 13:
                        case 14:
                        case 15:
                        case 16:
                        case wi.dK /*17*/:
                        case wi.dH /*18*/:
                            this.f29082a = a;
                            break;
                        default:
                            continue;
                    }
                case wi.dH /*18*/:
                    if (this.f29083b == null) {
                        this.f29083b = new mxx();
                    }
                    nyt.m37101a(this.f29083b);
                    continue;
                case wi.dx /*26*/:
                    if (this.f29084c == null) {
                        this.f29084c = new mwy();
                    }
                    nyt.m37101a(this.f29084c);
                    continue;
                case 34:
                    if (this.f29085d == null) {
                        this.f29085d = new mwk();
                    }
                    nyt.m37101a(this.f29085d);
                    continue;
                case 40:
                    this.f29086e = Boolean.valueOf(nyt.m37116i());
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
