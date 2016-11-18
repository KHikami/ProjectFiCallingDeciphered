package defpackage;

public final class oqi extends nyx<oqi> {
    private static volatile oqi[] j;
    public Float a;
    public Float b;
    public String c;
    public String d;
    public String e;
    public String f;
    public String g;
    public String h;
    public Boolean i;

    public /* synthetic */ nzf a(nyt nyt) {
        return b(nyt);
    }

    public static oqi[] d() {
        if (j == null) {
            synchronized (nzc.c) {
                if (j == null) {
                    j = new oqi[0];
                }
            }
        }
        return j;
    }

    public oqi() {
        g();
    }

    private oqi g() {
        this.a = null;
        this.b = null;
        this.c = null;
        this.d = null;
        this.e = null;
        this.f = null;
        this.g = null;
        this.h = null;
        this.i = null;
        this.unknownFieldData = null;
        this.cachedSize = -1;
        return this;
    }

    public void a(nyu nyu) {
        if (this.a != null) {
            nyu.a(1, this.a.floatValue());
        }
        if (this.b != null) {
            nyu.a(2, this.b.floatValue());
        }
        if (this.c != null) {
            nyu.a(3, this.c);
        }
        if (this.d != null) {
            nyu.a(4, this.d);
        }
        if (this.e != null) {
            nyu.a(5, this.e);
        }
        if (this.f != null) {
            nyu.a(7, this.f);
        }
        if (this.g != null) {
            nyu.a(8, this.g);
        }
        if (this.h != null) {
            nyu.a(9, this.h);
        }
        if (this.i != null) {
            nyu.a(10, this.i.booleanValue());
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
            this.b.floatValue();
            b += nyu.h(2) + 4;
        }
        if (this.c != null) {
            b += nyu.b(3, this.c);
        }
        if (this.d != null) {
            b += nyu.b(4, this.d);
        }
        if (this.e != null) {
            b += nyu.b(5, this.e);
        }
        if (this.f != null) {
            b += nyu.b(7, this.f);
        }
        if (this.g != null) {
            b += nyu.b(8, this.g);
        }
        if (this.h != null) {
            b += nyu.b(9, this.h);
        }
        if (this.i == null) {
            return b;
        }
        this.i.booleanValue();
        return b + (nyu.h(10) + 1);
    }

    private oqi b(nyt nyt) {
        while (true) {
            int a = nyt.a();
            switch (a) {
                case 0:
                    break;
                case 13:
                    this.a = Float.valueOf(nyt.c());
                    continue;
                case 21:
                    this.b = Float.valueOf(nyt.c());
                    continue;
                case wi.dx /*26*/:
                    this.c = nyt.j();
                    continue;
                case 34:
                    this.d = nyt.j();
                    continue;
                case 42:
                    this.e = nyt.j();
                    continue;
                case 58:
                    this.f = nyt.j();
                    continue;
                case 66:
                    this.g = nyt.j();
                    continue;
                case 74:
                    this.h = nyt.j();
                    continue;
                case 80:
                    this.i = Boolean.valueOf(nyt.i());
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
