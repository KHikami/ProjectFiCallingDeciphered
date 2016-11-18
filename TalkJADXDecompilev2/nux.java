package defpackage;

public final class nux extends nyx<nux> {
    public Float a;
    public Float b;
    public Float c;
    public Float d;
    public Float e;
    public Float f;
    public Float g;
    public Float h;
    public Float i;

    public /* synthetic */ nzf a(nyt nyt) {
        return b(nyt);
    }

    public nux() {
        this.a = null;
        this.b = null;
        this.c = null;
        this.d = null;
        this.e = null;
        this.f = null;
        this.g = null;
        this.h = null;
        this.i = null;
        this.cachedSize = -1;
    }

    public void a(nyu nyu) {
        nyu.a(1, this.a.floatValue());
        nyu.a(2, this.b.floatValue());
        nyu.a(3, this.c.floatValue());
        nyu.a(4, this.d.floatValue());
        nyu.a(5, this.e.floatValue());
        nyu.a(6, this.f.floatValue());
        nyu.a(7, this.g.floatValue());
        nyu.a(8, this.h.floatValue());
        nyu.a(9, this.i.floatValue());
        super.a(nyu);
    }

    protected int b() {
        int b = super.b();
        this.a.floatValue();
        b += nyu.h(1) + 4;
        this.b.floatValue();
        b += nyu.h(2) + 4;
        this.c.floatValue();
        b += nyu.h(3) + 4;
        this.d.floatValue();
        b += nyu.h(4) + 4;
        this.e.floatValue();
        b += nyu.h(5) + 4;
        this.f.floatValue();
        b += nyu.h(6) + 4;
        this.g.floatValue();
        b += nyu.h(7) + 4;
        this.h.floatValue();
        b += nyu.h(8) + 4;
        this.i.floatValue();
        return b + (nyu.h(9) + 4);
    }

    private nux b(nyt nyt) {
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
                case 37:
                    this.d = Float.valueOf(nyt.c());
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
