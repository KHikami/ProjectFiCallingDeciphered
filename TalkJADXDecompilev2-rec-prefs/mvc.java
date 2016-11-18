package p000;

public final class mvc extends nyx<mvc> {
    private static volatile mvc[] f28440k;
    public Float f28441a;
    public muz f28442b;
    public muz f28443c;
    public muz f28444d;
    public mvd f28445e;
    public mvd f28446f;
    public mvd f28447g;
    public mvb f28448h;
    public mvb f28449i;
    public mvb f28450j;

    public /* synthetic */ nzf mo150a(nyt nyt) {
        return m33048b(nyt);
    }

    public static mvc[] m33049d() {
        if (f28440k == null) {
            synchronized (nzc.c) {
                if (f28440k == null) {
                    f28440k = new mvc[0];
                }
            }
        }
        return f28440k;
    }

    public mvc() {
        m33050g();
    }

    private mvc m33050g() {
        this.f28441a = null;
        this.f28442b = null;
        this.f28443c = null;
        this.f28444d = null;
        this.f28445e = null;
        this.f28446f = null;
        this.f28447g = null;
        this.f28448h = null;
        this.f28449i = null;
        this.f28450j = null;
        this.unknownFieldData = null;
        this.cachedSize = -1;
        return this;
    }

    public void mo146a(nyu nyu) {
        if (this.f28441a != null) {
            nyu.a(1, this.f28441a.floatValue());
        }
        if (this.f28442b != null) {
            nyu.b(2, this.f28442b);
        }
        if (this.f28443c != null) {
            nyu.b(3, this.f28443c);
        }
        if (this.f28444d != null) {
            nyu.b(4, this.f28444d);
        }
        if (this.f28445e != null) {
            nyu.b(5, this.f28445e);
        }
        if (this.f28446f != null) {
            nyu.b(6, this.f28446f);
        }
        if (this.f28447g != null) {
            nyu.b(7, this.f28447g);
        }
        if (this.f28448h != null) {
            nyu.b(8, this.f28448h);
        }
        if (this.f28449i != null) {
            nyu.b(9, this.f28449i);
        }
        if (this.f28450j != null) {
            nyu.b(10, this.f28450j);
        }
        super.mo146a(nyu);
    }

    protected int mo147b() {
        int b = super.mo147b();
        if (this.f28441a != null) {
            this.f28441a.floatValue();
            b += nyu.h(1) + 4;
        }
        if (this.f28442b != null) {
            b += nyu.d(2, this.f28442b);
        }
        if (this.f28443c != null) {
            b += nyu.d(3, this.f28443c);
        }
        if (this.f28444d != null) {
            b += nyu.d(4, this.f28444d);
        }
        if (this.f28445e != null) {
            b += nyu.d(5, this.f28445e);
        }
        if (this.f28446f != null) {
            b += nyu.d(6, this.f28446f);
        }
        if (this.f28447g != null) {
            b += nyu.d(7, this.f28447g);
        }
        if (this.f28448h != null) {
            b += nyu.d(8, this.f28448h);
        }
        if (this.f28449i != null) {
            b += nyu.d(9, this.f28449i);
        }
        if (this.f28450j != null) {
            return b + nyu.d(10, this.f28450j);
        }
        return b;
    }

    private mvc m33048b(nyt nyt) {
        while (true) {
            int a = nyt.a();
            switch (a) {
                case 0:
                    break;
                case 13:
                    this.f28441a = Float.valueOf(nyt.c());
                    continue;
                case wi.dH /*18*/:
                    if (this.f28442b == null) {
                        this.f28442b = new muz();
                    }
                    nyt.a(this.f28442b);
                    continue;
                case wi.dx /*26*/:
                    if (this.f28443c == null) {
                        this.f28443c = new muz();
                    }
                    nyt.a(this.f28443c);
                    continue;
                case 34:
                    if (this.f28444d == null) {
                        this.f28444d = new muz();
                    }
                    nyt.a(this.f28444d);
                    continue;
                case 42:
                    if (this.f28445e == null) {
                        this.f28445e = new mvd();
                    }
                    nyt.a(this.f28445e);
                    continue;
                case 50:
                    if (this.f28446f == null) {
                        this.f28446f = new mvd();
                    }
                    nyt.a(this.f28446f);
                    continue;
                case 58:
                    if (this.f28447g == null) {
                        this.f28447g = new mvd();
                    }
                    nyt.a(this.f28447g);
                    continue;
                case 66:
                    if (this.f28448h == null) {
                        this.f28448h = new mvb();
                    }
                    nyt.a(this.f28448h);
                    continue;
                case 74:
                    if (this.f28449i == null) {
                        this.f28449i = new mvb();
                    }
                    nyt.a(this.f28449i);
                    continue;
                case 82:
                    if (this.f28450j == null) {
                        this.f28450j = new mvb();
                    }
                    nyt.a(this.f28450j);
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
