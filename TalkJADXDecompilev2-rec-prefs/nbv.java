package p000;

public final class nbv extends nyx<nbv> {
    private static volatile nbv[] f29462c;
    public String f29463a;
    public nbw f29464b;

    public /* synthetic */ nzf m34236a(nyt nyt) {
        return m34233b(nyt);
    }

    public static nbv[] m34234d() {
        if (f29462c == null) {
            synchronized (nzc.f31309c) {
                if (f29462c == null) {
                    f29462c = new nbv[0];
                }
            }
        }
        return f29462c;
    }

    public nbv() {
        m34235g();
    }

    private nbv m34235g() {
        this.f29463a = null;
        this.f29464b = null;
        this.unknownFieldData = null;
        this.cachedSize = -1;
        return this;
    }

    public void m34237a(nyu nyu) {
        if (this.f29463a != null) {
            nyu.m37170a(1, this.f29463a);
        }
        if (this.f29464b != null) {
            nyu.m37182b(2, this.f29464b);
        }
        super.a(nyu);
    }

    protected int m34238b() {
        int b = super.b();
        if (this.f29463a != null) {
            b += nyu.m37137b(1, this.f29463a);
        }
        if (this.f29464b != null) {
            return b + nyu.m37145d(2, this.f29464b);
        }
        return b;
    }

    private nbv m34233b(nyt nyt) {
        while (true) {
            int a = nyt.m37099a();
            switch (a) {
                case 0:
                    break;
                case 10:
                    this.f29463a = nyt.m37117j();
                    continue;
                case wi.dH /*18*/:
                    if (this.f29464b == null) {
                        this.f29464b = new nbw();
                    }
                    nyt.m37101a(this.f29464b);
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
