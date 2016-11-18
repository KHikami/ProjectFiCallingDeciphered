package defpackage;

public final class nga extends nyx<nga> {
    public Long a;
    public njl b;
    public Long c;
    public njl d;
    public Long e;
    public String f;
    public Integer g;
    public Long h;

    public /* synthetic */ nzf a(nyt nyt) {
        return b(nyt);
    }

    public nga() {
        d();
    }

    private nga d() {
        this.a = null;
        this.b = null;
        this.c = null;
        this.d = null;
        this.e = null;
        this.f = null;
        this.g = null;
        this.h = null;
        this.unknownFieldData = null;
        this.cachedSize = -1;
        return this;
    }

    public void a(nyu nyu) {
        if (this.a != null) {
            nyu.b(1, this.a.longValue());
        }
        if (this.c != null) {
            nyu.b(2, this.c.longValue());
        }
        if (this.f != null) {
            nyu.a(3, this.f);
        }
        if (this.g != null) {
            nyu.a(4, this.g.intValue());
        }
        if (this.e != null) {
            nyu.b(5, this.e.longValue());
        }
        if (this.b != null) {
            nyu.b(6, this.b);
        }
        if (this.d != null) {
            nyu.b(7, this.d);
        }
        if (this.h != null) {
            nyu.b(8, this.h.longValue());
        }
        super.a(nyu);
    }

    protected int b() {
        int b = super.b();
        if (this.a != null) {
            b += nyu.f(1, this.a.longValue());
        }
        if (this.c != null) {
            b += nyu.f(2, this.c.longValue());
        }
        if (this.f != null) {
            b += nyu.b(3, this.f);
        }
        if (this.g != null) {
            b += nyu.f(4, this.g.intValue());
        }
        if (this.e != null) {
            b += nyu.f(5, this.e.longValue());
        }
        if (this.b != null) {
            b += nyu.d(6, this.b);
        }
        if (this.d != null) {
            b += nyu.d(7, this.d);
        }
        if (this.h != null) {
            return b + nyu.f(8, this.h.longValue());
        }
        return b;
    }

    private nga b(nyt nyt) {
        while (true) {
            int a = nyt.a();
            switch (a) {
                case 0:
                    break;
                case 8:
                    this.a = Long.valueOf(nyt.e());
                    continue;
                case 16:
                    this.c = Long.valueOf(nyt.e());
                    continue;
                case wi.dx /*26*/:
                    this.f = nyt.j();
                    continue;
                case 32:
                    this.g = Integer.valueOf(nyt.f());
                    continue;
                case 40:
                    this.e = Long.valueOf(nyt.e());
                    continue;
                case 50:
                    if (this.b == null) {
                        this.b = new njl();
                    }
                    nyt.a(this.b);
                    continue;
                case 58:
                    if (this.d == null) {
                        this.d = new njl();
                    }
                    nyt.a(this.d);
                    continue;
                case 64:
                    this.h = Long.valueOf(nyt.e());
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
