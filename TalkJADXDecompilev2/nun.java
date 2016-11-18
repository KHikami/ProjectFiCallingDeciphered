package defpackage;

public final class nun extends nyx<nun> {
    public String a;
    public Float b;
    public Float c;
    public String d;
    public Integer e;
    public Integer f;
    public String g;

    public /* synthetic */ nzf a(nyt nyt) {
        return b(nyt);
    }

    public nun() {
        d();
    }

    private nun d() {
        this.a = null;
        this.b = null;
        this.c = null;
        this.d = null;
        this.e = null;
        this.f = null;
        this.g = null;
        this.unknownFieldData = null;
        this.cachedSize = -1;
        return this;
    }

    public void a(nyu nyu) {
        if (this.a != null) {
            nyu.a(1, this.a);
        }
        if (this.b != null) {
            nyu.a(2, this.b.floatValue());
        }
        if (this.c != null) {
            nyu.a(3, this.c.floatValue());
        }
        if (this.d != null) {
            nyu.a(4, this.d);
        }
        if (this.e != null) {
            nyu.a(5, this.e.intValue());
        }
        if (this.f != null) {
            nyu.a(6, this.f.intValue());
        }
        if (this.g != null) {
            nyu.a(7, this.g);
        }
        super.a(nyu);
    }

    protected int b() {
        int b = super.b();
        if (this.a != null) {
            b += nyu.b(1, this.a);
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
            b += nyu.b(4, this.d);
        }
        if (this.e != null) {
            b += nyu.f(5, this.e.intValue());
        }
        if (this.f != null) {
            b += nyu.f(6, this.f.intValue());
        }
        if (this.g != null) {
            return b + nyu.b(7, this.g);
        }
        return b;
    }

    private nun b(nyt nyt) {
        while (true) {
            int a = nyt.a();
            switch (a) {
                case 0:
                    break;
                case 10:
                    this.a = nyt.j();
                    continue;
                case 21:
                    this.b = Float.valueOf(nyt.c());
                    continue;
                case 29:
                    this.c = Float.valueOf(nyt.c());
                    continue;
                case 34:
                    this.d = nyt.j();
                    continue;
                case 40:
                    this.e = Integer.valueOf(nyt.f());
                    continue;
                case 48:
                    this.f = Integer.valueOf(nyt.f());
                    continue;
                case 58:
                    this.g = nyt.j();
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
