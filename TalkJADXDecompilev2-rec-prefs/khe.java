package p000;

public final class khe extends nyx<khe> {
    private static volatile khe[] f21735d;
    public String f21736a;
    public String f21737b;
    public Integer f21738c;

    public /* synthetic */ nzf mo150a(nyt nyt) {
        return m25816b(nyt);
    }

    public static khe[] m25817d() {
        if (f21735d == null) {
            synchronized (nzc.c) {
                if (f21735d == null) {
                    f21735d = new khe[0];
                }
            }
        }
        return f21735d;
    }

    public khe() {
        m25818g();
    }

    private khe m25818g() {
        this.f21736a = null;
        this.f21737b = null;
        this.unknownFieldData = null;
        this.cachedSize = -1;
        return this;
    }

    public void mo146a(nyu nyu) {
        if (this.f21736a != null) {
            nyu.a(1, this.f21736a);
        }
        if (this.f21737b != null) {
            nyu.a(2, this.f21737b);
        }
        if (this.f21738c != null) {
            nyu.a(3, this.f21738c.intValue());
        }
        super.mo146a(nyu);
    }

    protected int mo147b() {
        int b = super.mo147b();
        if (this.f21736a != null) {
            b += nyu.b(1, this.f21736a);
        }
        if (this.f21737b != null) {
            b += nyu.b(2, this.f21737b);
        }
        if (this.f21738c != null) {
            return b + nyu.f(3, this.f21738c.intValue());
        }
        return b;
    }

    private khe m25816b(nyt nyt) {
        while (true) {
            int a = nyt.a();
            switch (a) {
                case 0:
                    break;
                case 10:
                    this.f21736a = nyt.j();
                    continue;
                case wi.dH /*18*/:
                    this.f21737b = nyt.j();
                    continue;
                case wi.dA /*24*/:
                    a = nyt.f();
                    switch (a) {
                        case 1:
                        case 2:
                        case 3:
                            this.f21738c = Integer.valueOf(a);
                            break;
                        default:
                            continue;
                    }
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
