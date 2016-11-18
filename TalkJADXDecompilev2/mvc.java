package defpackage;

public final class mvc extends nyx<mvc> {
    private static volatile mvc[] k;
    public Float a;
    public muz b;
    public muz c;
    public muz d;
    public mvd e;
    public mvd f;
    public mvd g;
    public mvb h;
    public mvb i;
    public mvb j;

    public /* synthetic */ nzf a(nyt nyt) {
        return b(nyt);
    }

    public static mvc[] d() {
        if (k == null) {
            synchronized (nzc.c) {
                if (k == null) {
                    k = new mvc[0];
                }
            }
        }
        return k;
    }

    public mvc() {
        g();
    }

    private mvc g() {
        this.a = null;
        this.b = null;
        this.c = null;
        this.d = null;
        this.e = null;
        this.f = null;
        this.g = null;
        this.h = null;
        this.i = null;
        this.j = null;
        this.unknownFieldData = null;
        this.cachedSize = -1;
        return this;
    }

    public void a(nyu nyu) {
        if (this.a != null) {
            nyu.a(1, this.a.floatValue());
        }
        if (this.b != null) {
            nyu.b(2, this.b);
        }
        if (this.c != null) {
            nyu.b(3, this.c);
        }
        if (this.d != null) {
            nyu.b(4, this.d);
        }
        if (this.e != null) {
            nyu.b(5, this.e);
        }
        if (this.f != null) {
            nyu.b(6, this.f);
        }
        if (this.g != null) {
            nyu.b(7, this.g);
        }
        if (this.h != null) {
            nyu.b(8, this.h);
        }
        if (this.i != null) {
            nyu.b(9, this.i);
        }
        if (this.j != null) {
            nyu.b(10, this.j);
        }
        super.a(nyu);
    }

    protected int b() {
        int b = super.b();
        if (this.a != null) {
            this.a.floatValue();
            b += nyu.h(1) + 4;
        }
        if (this.b != null) {
            b += nyu.d(2, this.b);
        }
        if (this.c != null) {
            b += nyu.d(3, this.c);
        }
        if (this.d != null) {
            b += nyu.d(4, this.d);
        }
        if (this.e != null) {
            b += nyu.d(5, this.e);
        }
        if (this.f != null) {
            b += nyu.d(6, this.f);
        }
        if (this.g != null) {
            b += nyu.d(7, this.g);
        }
        if (this.h != null) {
            b += nyu.d(8, this.h);
        }
        if (this.i != null) {
            b += nyu.d(9, this.i);
        }
        if (this.j != null) {
            return b + nyu.d(10, this.j);
        }
        return b;
    }

    private mvc b(nyt nyt) {
        while (true) {
            int a = nyt.a();
            switch (a) {
                case 0:
                    break;
                case 13:
                    this.a = Float.valueOf(nyt.c());
                    continue;
                case wi.dH /*18*/:
                    if (this.b == null) {
                        this.b = new muz();
                    }
                    nyt.a(this.b);
                    continue;
                case wi.dx /*26*/:
                    if (this.c == null) {
                        this.c = new muz();
                    }
                    nyt.a(this.c);
                    continue;
                case 34:
                    if (this.d == null) {
                        this.d = new muz();
                    }
                    nyt.a(this.d);
                    continue;
                case 42:
                    if (this.e == null) {
                        this.e = new mvd();
                    }
                    nyt.a(this.e);
                    continue;
                case 50:
                    if (this.f == null) {
                        this.f = new mvd();
                    }
                    nyt.a(this.f);
                    continue;
                case 58:
                    if (this.g == null) {
                        this.g = new mvd();
                    }
                    nyt.a(this.g);
                    continue;
                case 66:
                    if (this.h == null) {
                        this.h = new mvb();
                    }
                    nyt.a(this.h);
                    continue;
                case 74:
                    if (this.i == null) {
                        this.i = new mvb();
                    }
                    nyt.a(this.i);
                    continue;
                case 82:
                    if (this.j == null) {
                        this.j = new mvb();
                    }
                    nyt.a(this.j);
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
