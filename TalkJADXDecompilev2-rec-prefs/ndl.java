package p000;

public final class ndl extends nyx<ndl> {
    private static volatile ndl[] f29564c;
    public Integer f29565a;
    public String f29566b;

    public /* synthetic */ nzf m34432a(nyt nyt) {
        return m34430b(nyt);
    }

    public static ndl[] m34431d() {
        if (f29564c == null) {
            synchronized (nzc.f31309c) {
                if (f29564c == null) {
                    f29564c = new ndl[0];
                }
            }
        }
        return f29564c;
    }

    public ndl() {
        this.f29565a = null;
        this.f29566b = null;
        this.cachedSize = -1;
    }

    public void m34433a(nyu nyu) {
        if (this.f29566b != null) {
            nyu.m37170a(2, this.f29566b);
        }
        if (this.f29565a != null) {
            nyu.m37168a(3, this.f29565a.intValue());
        }
        super.a(nyu);
    }

    protected int m34434b() {
        int b = super.b();
        if (this.f29566b != null) {
            b += nyu.m37137b(2, this.f29566b);
        }
        if (this.f29565a != null) {
            return b + nyu.m37147f(3, this.f29565a.intValue());
        }
        return b;
    }

    private ndl m34430b(nyt nyt) {
        while (true) {
            int a = nyt.m37099a();
            switch (a) {
                case 0:
                    break;
                case wi.dH /*18*/:
                    this.f29566b = nyt.m37117j();
                    continue;
                case wi.dA /*24*/:
                    this.f29565a = Integer.valueOf(nyt.m37112f());
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
