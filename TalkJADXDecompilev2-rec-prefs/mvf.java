package p000;

public final class mvf extends nyx<mvf> {
    private static volatile mvf[] f28457k;
    public Float f28458a;
    public mux f28459b;
    public mux f28460c;
    public mux f28461d;
    public mvg f28462e;
    public mvg f28463f;
    public mvg f28464g;
    public mve f28465h;
    public mve f28466i;
    public mve f28467j;

    public /* synthetic */ nzf mo150a(nyt nyt) {
        return m33063b(nyt);
    }

    public static mvf[] m33064d() {
        if (f28457k == null) {
            synchronized (nzc.c) {
                if (f28457k == null) {
                    f28457k = new mvf[0];
                }
            }
        }
        return f28457k;
    }

    public mvf() {
        this.f28458a = null;
        this.cachedSize = -1;
    }

    public void mo146a(nyu nyu) {
        if (this.f28458a != null) {
            nyu.a(1, this.f28458a.floatValue());
        }
        if (this.f28459b != null) {
            nyu.b(2, this.f28459b);
        }
        if (this.f28460c != null) {
            nyu.b(3, this.f28460c);
        }
        if (this.f28461d != null) {
            nyu.b(4, this.f28461d);
        }
        if (this.f28462e != null) {
            nyu.b(5, this.f28462e);
        }
        if (this.f28463f != null) {
            nyu.b(6, this.f28463f);
        }
        if (this.f28464g != null) {
            nyu.b(7, this.f28464g);
        }
        if (this.f28465h != null) {
            nyu.b(8, this.f28465h);
        }
        if (this.f28466i != null) {
            nyu.b(9, this.f28466i);
        }
        if (this.f28467j != null) {
            nyu.b(10, this.f28467j);
        }
        super.mo146a(nyu);
    }

    protected int mo147b() {
        int b = super.mo147b();
        if (this.f28458a != null) {
            this.f28458a.floatValue();
            b += nyu.h(1) + 4;
        }
        if (this.f28459b != null) {
            b += nyu.d(2, this.f28459b);
        }
        if (this.f28460c != null) {
            b += nyu.d(3, this.f28460c);
        }
        if (this.f28461d != null) {
            b += nyu.d(4, this.f28461d);
        }
        if (this.f28462e != null) {
            b += nyu.d(5, this.f28462e);
        }
        if (this.f28463f != null) {
            b += nyu.d(6, this.f28463f);
        }
        if (this.f28464g != null) {
            b += nyu.d(7, this.f28464g);
        }
        if (this.f28465h != null) {
            b += nyu.d(8, this.f28465h);
        }
        if (this.f28466i != null) {
            b += nyu.d(9, this.f28466i);
        }
        if (this.f28467j != null) {
            return b + nyu.d(10, this.f28467j);
        }
        return b;
    }

    private mvf m33063b(nyt nyt) {
        while (true) {
            int a = nyt.a();
            switch (a) {
                case 0:
                    break;
                case 13:
                    this.f28458a = Float.valueOf(nyt.c());
                    continue;
                case wi.dH /*18*/:
                    if (this.f28459b == null) {
                        this.f28459b = new mux();
                    }
                    nyt.a(this.f28459b);
                    continue;
                case wi.dx /*26*/:
                    if (this.f28460c == null) {
                        this.f28460c = new mux();
                    }
                    nyt.a(this.f28460c);
                    continue;
                case 34:
                    if (this.f28461d == null) {
                        this.f28461d = new mux();
                    }
                    nyt.a(this.f28461d);
                    continue;
                case 42:
                    if (this.f28462e == null) {
                        this.f28462e = new mvg();
                    }
                    nyt.a(this.f28462e);
                    continue;
                case 50:
                    if (this.f28463f == null) {
                        this.f28463f = new mvg();
                    }
                    nyt.a(this.f28463f);
                    continue;
                case 58:
                    if (this.f28464g == null) {
                        this.f28464g = new mvg();
                    }
                    nyt.a(this.f28464g);
                    continue;
                case 66:
                    if (this.f28465h == null) {
                        this.f28465h = new mve();
                    }
                    nyt.a(this.f28465h);
                    continue;
                case 74:
                    if (this.f28466i == null) {
                        this.f28466i = new mve();
                    }
                    nyt.a(this.f28466i);
                    continue;
                case 82:
                    if (this.f28467j == null) {
                        this.f28467j = new mve();
                    }
                    nyt.a(this.f28467j);
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
