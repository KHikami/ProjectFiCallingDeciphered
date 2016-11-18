package p000;

public final class lcl extends nyx<lcl> {
    private static volatile lcl[] f24580g;
    public lcm f24581a;
    public String f24582b;
    public String f24583c;
    public kzw f24584d;
    public String f24585e;
    public String f24586f;

    public /* synthetic */ nzf mo150a(nyt nyt) {
        return m28611b(nyt);
    }

    public static lcl[] m28612d() {
        if (f24580g == null) {
            synchronized (nzc.c) {
                if (f24580g == null) {
                    f24580g = new lcl[0];
                }
            }
        }
        return f24580g;
    }

    public lcl() {
        this.f24582b = null;
        this.f24583c = null;
        this.f24585e = null;
        this.f24586f = null;
        this.cachedSize = -1;
    }

    public void mo146a(nyu nyu) {
        if (this.f24581a != null) {
            nyu.b(1, this.f24581a);
        }
        if (this.f24582b != null) {
            nyu.a(2, this.f24582b);
        }
        if (this.f24583c != null) {
            nyu.a(3, this.f24583c);
        }
        if (this.f24584d != null) {
            nyu.b(4, this.f24584d);
        }
        if (this.f24585e != null) {
            nyu.a(5, this.f24585e);
        }
        if (this.f24586f != null) {
            nyu.a(6, this.f24586f);
        }
        super.mo146a(nyu);
    }

    protected int mo147b() {
        int b = super.mo147b();
        if (this.f24581a != null) {
            b += nyu.d(1, this.f24581a);
        }
        if (this.f24582b != null) {
            b += nyu.b(2, this.f24582b);
        }
        if (this.f24583c != null) {
            b += nyu.b(3, this.f24583c);
        }
        if (this.f24584d != null) {
            b += nyu.d(4, this.f24584d);
        }
        if (this.f24585e != null) {
            b += nyu.b(5, this.f24585e);
        }
        if (this.f24586f != null) {
            return b + nyu.b(6, this.f24586f);
        }
        return b;
    }

    private lcl m28611b(nyt nyt) {
        while (true) {
            int a = nyt.a();
            switch (a) {
                case 0:
                    break;
                case 10:
                    if (this.f24581a == null) {
                        this.f24581a = new lcm();
                    }
                    nyt.a(this.f24581a);
                    continue;
                case wi.dH /*18*/:
                    this.f24582b = nyt.j();
                    continue;
                case wi.dx /*26*/:
                    this.f24583c = nyt.j();
                    continue;
                case 34:
                    if (this.f24584d == null) {
                        this.f24584d = new kzw();
                    }
                    nyt.a(this.f24584d);
                    continue;
                case 42:
                    this.f24585e = nyt.j();
                    continue;
                case 50:
                    this.f24586f = nyt.j();
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
