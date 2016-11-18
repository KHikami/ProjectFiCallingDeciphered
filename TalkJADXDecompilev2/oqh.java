package defpackage;

public final class oqh extends nyx<oqh> {
    public String a;
    public String b;
    public String c;
    public String d;
    public Long e;
    public String f;
    public String g;

    public /* synthetic */ nzf a(nyt nyt) {
        return b(nyt);
    }

    public oqh() {
        d();
    }

    private oqh d() {
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
            nyu.a(2, this.b);
        }
        if (this.c != null) {
            nyu.a(3, this.c);
        }
        if (this.e != null) {
            nyu.b(4, this.e.longValue());
        }
        if (this.d != null) {
            nyu.a(5, this.d);
        }
        if (this.f != null) {
            nyu.a(6, this.f);
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
            b += nyu.b(2, this.b);
        }
        if (this.c != null) {
            b += nyu.b(3, this.c);
        }
        if (this.e != null) {
            b += nyu.f(4, this.e.longValue());
        }
        if (this.d != null) {
            b += nyu.b(5, this.d);
        }
        if (this.f != null) {
            b += nyu.b(6, this.f);
        }
        if (this.g != null) {
            return b + nyu.b(7, this.g);
        }
        return b;
    }

    private oqh b(nyt nyt) {
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
                case 32:
                    this.e = Long.valueOf(nyt.e());
                    continue;
                case 42:
                    this.d = nyt.j();
                    continue;
                case 50:
                    this.f = nyt.j();
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
