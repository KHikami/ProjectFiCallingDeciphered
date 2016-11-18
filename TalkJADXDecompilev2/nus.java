package defpackage;

public final class nus extends nyx<nus> {
    public Float a;
    public Float b;
    public Float c;
    public Float d;
    public Float e;
    public Float f;
    public Float g;
    public Float h;
    public Boolean i;
    public Boolean j;
    public Boolean k;
    public Float l;

    public /* synthetic */ nzf a(nyt nyt) {
        return b(nyt);
    }

    public nus() {
        d();
    }

    private nus d() {
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
        this.k = null;
        this.l = null;
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
            nyu.a(3, this.c.floatValue());
        }
        if (this.g != null) {
            nyu.a(7, this.g.floatValue());
        }
        if (this.h != null) {
            nyu.a(8, this.h.floatValue());
        }
        if (this.e != null) {
            nyu.a(9, this.e.floatValue());
        }
        if (this.d != null) {
            nyu.a(10, this.d.floatValue());
        }
        if (this.f != null) {
            nyu.a(11, this.f.floatValue());
        }
        if (this.i != null) {
            nyu.a(12, this.i.booleanValue());
        }
        if (this.j != null) {
            nyu.a(13, this.j.booleanValue());
        }
        if (this.k != null) {
            nyu.a(14, this.k.booleanValue());
        }
        if (this.l != null) {
            nyu.a(15, this.l.floatValue());
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
        if (this.g != null) {
            this.g.floatValue();
            b += nyu.h(7) + 4;
        }
        if (this.h != null) {
            this.h.floatValue();
            b += nyu.h(8) + 4;
        }
        if (this.e != null) {
            this.e.floatValue();
            b += nyu.h(9) + 4;
        }
        if (this.d != null) {
            this.d.floatValue();
            b += nyu.h(10) + 4;
        }
        if (this.f != null) {
            this.f.floatValue();
            b += nyu.h(11) + 4;
        }
        if (this.i != null) {
            this.i.booleanValue();
            b += nyu.h(12) + 1;
        }
        if (this.j != null) {
            this.j.booleanValue();
            b += nyu.h(13) + 1;
        }
        if (this.k != null) {
            this.k.booleanValue();
            b += nyu.h(14) + 1;
        }
        if (this.l == null) {
            return b;
        }
        this.l.floatValue();
        return b + (nyu.h(15) + 4);
    }

    private nus b(nyt nyt) {
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
                case 61:
                    this.g = Float.valueOf(nyt.c());
                    continue;
                case 69:
                    this.h = Float.valueOf(nyt.c());
                    continue;
                case 77:
                    this.e = Float.valueOf(nyt.c());
                    continue;
                case 85:
                    this.d = Float.valueOf(nyt.c());
                    continue;
                case 93:
                    this.f = Float.valueOf(nyt.c());
                    continue;
                case 96:
                    this.i = Boolean.valueOf(nyt.i());
                    continue;
                case 104:
                    this.j = Boolean.valueOf(nyt.i());
                    continue;
                case 112:
                    this.k = Boolean.valueOf(nyt.i());
                    continue;
                case 125:
                    this.l = Float.valueOf(nyt.c());
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
