package defpackage;

public final class odd extends nyx<odd> {
    private static volatile odd[] k;
    public Float a;
    public Float b;
    public Float c;
    public Boolean d;
    public Float e;
    public Float f;
    public Float g;
    public Float h;
    public Float i;
    public Float j;

    public /* synthetic */ nzf a(nyt nyt) {
        return b(nyt);
    }

    public static odd[] d() {
        if (k == null) {
            synchronized (nzc.c) {
                if (k == null) {
                    k = new odd[0];
                }
            }
        }
        return k;
    }

    public odd() {
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
        this.cachedSize = -1;
    }

    public void a(nyu nyu) {
        if (this.a != null) {
            nyu.a(1, this.a.floatValue());
        }
        if (this.b != null) {
            nyu.a(2, this.b.floatValue());
        }
        if (this.c != null) {
            nyu.a(3, this.c.floatValue());
        }
        if (this.d != null) {
            nyu.a(4, this.d.booleanValue());
        }
        if (this.e != null) {
            nyu.a(5, this.e.floatValue());
        }
        if (this.f != null) {
            nyu.a(6, this.f.floatValue());
        }
        if (this.g != null) {
            nyu.a(7, this.g.floatValue());
        }
        if (this.h != null) {
            nyu.a(8, this.h.floatValue());
        }
        if (this.i != null) {
            nyu.a(9, this.i.floatValue());
        }
        if (this.j != null) {
            nyu.a(10, this.j.floatValue());
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
            this.c.floatValue();
            b += nyu.h(3) + 4;
        }
        if (this.d != null) {
            this.d.booleanValue();
            b += nyu.h(4) + 1;
        }
        if (this.e != null) {
            this.e.floatValue();
            b += nyu.h(5) + 4;
        }
        if (this.f != null) {
            this.f.floatValue();
            b += nyu.h(6) + 4;
        }
        if (this.g != null) {
            this.g.floatValue();
            b += nyu.h(7) + 4;
        }
        if (this.h != null) {
            this.h.floatValue();
            b += nyu.h(8) + 4;
        }
        if (this.i != null) {
            this.i.floatValue();
            b += nyu.h(9) + 4;
        }
        if (this.j == null) {
            return b;
        }
        this.j.floatValue();
        return b + (nyu.h(10) + 4);
    }

    private odd b(nyt nyt) {
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
                case 29:
                    this.c = Float.valueOf(nyt.c());
                    continue;
                case 32:
                    this.d = Boolean.valueOf(nyt.i());
                    continue;
                case 45:
                    this.e = Float.valueOf(nyt.c());
                    continue;
                case 53:
                    this.f = Float.valueOf(nyt.c());
                    continue;
                case 61:
                    this.g = Float.valueOf(nyt.c());
                    continue;
                case 69:
                    this.h = Float.valueOf(nyt.c());
                    continue;
                case 77:
                    this.i = Float.valueOf(nyt.c());
                    continue;
                case 85:
                    this.j = Float.valueOf(nyt.c());
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
