package p000;

public final class oqv extends nyx<oqv> {
    private static volatile oqv[] f33809d;
    public String f33810a;
    public oqu f33811b;
    public String f33812c;

    public /* synthetic */ nzf m39248a(nyt nyt) {
        return m39245b(nyt);
    }

    public static oqv[] m39246d() {
        if (f33809d == null) {
            synchronized (nzc.f31309c) {
                if (f33809d == null) {
                    f33809d = new oqv[0];
                }
            }
        }
        return f33809d;
    }

    public oqv() {
        m39247g();
    }

    private oqv m39247g() {
        this.f33810a = null;
        this.f33811b = null;
        this.f33812c = null;
        this.unknownFieldData = null;
        this.cachedSize = -1;
        return this;
    }

    public void m39249a(nyu nyu) {
        if (this.f33810a != null) {
            nyu.m37170a(1, this.f33810a);
        }
        if (this.f33811b != null) {
            nyu.m37182b(2, this.f33811b);
        }
        if (this.f33812c != null) {
            nyu.m37170a(3, this.f33812c);
        }
        super.a(nyu);
    }

    protected int m39250b() {
        int b = super.b();
        if (this.f33810a != null) {
            b += nyu.m37137b(1, this.f33810a);
        }
        if (this.f33811b != null) {
            b += nyu.m37145d(2, this.f33811b);
        }
        if (this.f33812c != null) {
            return b + nyu.m37137b(3, this.f33812c);
        }
        return b;
    }

    private oqv m39245b(nyt nyt) {
        while (true) {
            int a = nyt.m37099a();
            switch (a) {
                case 0:
                    break;
                case 10:
                    this.f33810a = nyt.m37117j();
                    continue;
                case wi.dH /*18*/:
                    if (this.f33811b == null) {
                        this.f33811b = new oqu();
                    }
                    nyt.m37101a(this.f33811b);
                    continue;
                case wi.dx /*26*/:
                    this.f33812c = nyt.m37117j();
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
