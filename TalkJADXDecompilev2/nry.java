package defpackage;

public final class nry extends nyx<nry> {
    public String a;
    public String b;
    public String c;
    public Float d;
    public Float e;
    public Integer f;
    public Float g;

    public /* synthetic */ nzf a(nyt nyt) {
        return b(nyt);
    }

    public nry() {
        this.a = null;
        this.b = null;
        this.c = null;
        this.d = null;
        this.e = null;
        this.f = null;
        this.g = null;
        this.cachedSize = -1;
    }

    public void a(nyu nyu) {
        if (this.a != null) {
            nyu.a(1, this.a);
        }
        if (this.b != null) {
            nyu.a(2, this.b);
        }
        if (this.c != null) {
            nyu.a(3, this.c);
        }
        if (this.d != null) {
            nyu.a(4, this.d.floatValue());
        }
        if (this.e != null) {
            nyu.a(5, this.e.floatValue());
        }
        if (this.f != null) {
            nyu.a(6, this.f.intValue());
        }
        if (this.g != null) {
            nyu.a(7, this.g.floatValue());
        }
        super.a(nyu);
    }

    protected int b() {
        int b = super.b();
        if (this.a != null) {
            b += nyu.b(1, this.a);
        }
        if (this.b != null) {
            b += nyu.b(2, this.b);
        }
        if (this.c != null) {
            b += nyu.b(3, this.c);
        }
        if (this.d != null) {
            this.d.floatValue();
            b += nyu.h(4) + 4;
        }
        if (this.e != null) {
            this.e.floatValue();
            b += nyu.h(5) + 4;
        }
        if (this.f != null) {
            b += nyu.f(6, this.f.intValue());
        }
        if (this.g == null) {
            return b;
        }
        this.g.floatValue();
        return b + (nyu.h(7) + 4);
    }

    private nry b(nyt nyt) {
        while (true) {
            int a = nyt.a();
            switch (a) {
                case 0:
                    break;
                case 10:
                    this.a = nyt.j();
                    continue;
                case wi.dH /*18*/:
                    this.b = nyt.j();
                    continue;
                case wi.dx /*26*/:
                    this.c = nyt.j();
                    continue;
                case 37:
                    this.d = Float.valueOf(nyt.c());
                    continue;
                case 45:
                    this.e = Float.valueOf(nyt.c());
                    continue;
                case 48:
                    this.f = Integer.valueOf(nyt.f());
                    continue;
                case 61:
                    this.g = Float.valueOf(nyt.c());
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
