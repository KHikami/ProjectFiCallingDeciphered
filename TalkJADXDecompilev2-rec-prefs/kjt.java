package p000;

public final class kjt extends nyx<kjt> {
    private static volatile kjt[] f21979h;
    public klk f21980a;
    public String f21981b;
    public String f21982c;
    public Integer f21983d;
    public Integer f21984e;
    public Boolean f21985f;
    public Boolean f21986g;

    public /* synthetic */ nzf mo150a(nyt nyt) {
        return m26149b(nyt);
    }

    public static kjt[] m26150d() {
        if (f21979h == null) {
            synchronized (nzc.c) {
                if (f21979h == null) {
                    f21979h = new kjt[0];
                }
            }
        }
        return f21979h;
    }

    public kjt() {
        m26151g();
    }

    private kjt m26151g() {
        this.f21980a = null;
        this.f21981b = null;
        this.f21982c = null;
        this.f21983d = null;
        this.f21984e = null;
        this.f21985f = null;
        this.f21986g = null;
        this.unknownFieldData = null;
        this.cachedSize = -1;
        return this;
    }

    public void mo146a(nyu nyu) {
        if (this.f21981b != null) {
            nyu.a(1, this.f21981b);
        }
        if (this.f21982c != null) {
            nyu.a(2, this.f21982c);
        }
        if (this.f21983d != null) {
            nyu.a(3, this.f21983d.intValue());
        }
        if (this.f21984e != null) {
            nyu.a(4, this.f21984e.intValue());
        }
        if (this.f21985f != null) {
            nyu.a(5, this.f21985f.booleanValue());
        }
        if (this.f21980a != null) {
            nyu.b(6, this.f21980a);
        }
        if (this.f21986g != null) {
            nyu.a(7, this.f21986g.booleanValue());
        }
        super.mo146a(nyu);
    }

    protected int mo147b() {
        int b = super.mo147b();
        if (this.f21981b != null) {
            b += nyu.b(1, this.f21981b);
        }
        if (this.f21982c != null) {
            b += nyu.b(2, this.f21982c);
        }
        if (this.f21983d != null) {
            b += nyu.f(3, this.f21983d.intValue());
        }
        if (this.f21984e != null) {
            b += nyu.f(4, this.f21984e.intValue());
        }
        if (this.f21985f != null) {
            this.f21985f.booleanValue();
            b += nyu.h(5) + 1;
        }
        if (this.f21980a != null) {
            b += nyu.d(6, this.f21980a);
        }
        if (this.f21986g == null) {
            return b;
        }
        this.f21986g.booleanValue();
        return b + (nyu.h(7) + 1);
    }

    private kjt m26149b(nyt nyt) {
        while (true) {
            int a = nyt.a();
            switch (a) {
                case 0:
                    break;
                case 10:
                    this.f21981b = nyt.j();
                    continue;
                case wi.dH /*18*/:
                    this.f21982c = nyt.j();
                    continue;
                case wi.dA /*24*/:
                    this.f21983d = Integer.valueOf(nyt.f());
                    continue;
                case 32:
                    this.f21984e = Integer.valueOf(nyt.f());
                    continue;
                case 40:
                    this.f21985f = Boolean.valueOf(nyt.i());
                    continue;
                case 50:
                    if (this.f21980a == null) {
                        this.f21980a = new klk();
                    }
                    nyt.a(this.f21980a);
                    continue;
                case 56:
                    this.f21986g = Boolean.valueOf(nyt.i());
                    continue;
                default:
                    if (!super.m1039a(nyt, a)) {
                        break;
                    }
                    continue;
            }
            return this;
        }
    }
}
