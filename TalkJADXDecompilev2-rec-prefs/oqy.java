package p000;

public final class oqy extends nyx<oqy> {
    private static volatile oqy[] f33829d;
    public oqu f33830a;
    public String f33831b;
    public String f33832c;

    public /* synthetic */ nzf m39265a(nyt nyt) {
        return m39262b(nyt);
    }

    public static oqy[] m39263d() {
        if (f33829d == null) {
            synchronized (nzc.f31309c) {
                if (f33829d == null) {
                    f33829d = new oqy[0];
                }
            }
        }
        return f33829d;
    }

    public oqy() {
        m39264g();
    }

    private oqy m39264g() {
        this.f33830a = null;
        this.f33831b = null;
        this.f33832c = null;
        this.unknownFieldData = null;
        this.cachedSize = -1;
        return this;
    }

    public void m39266a(nyu nyu) {
        if (this.f33830a != null) {
            nyu.m37182b(1, this.f33830a);
        }
        if (this.f33831b != null) {
            nyu.m37170a(2, this.f33831b);
        }
        if (this.f33832c != null) {
            nyu.m37170a(3, this.f33832c);
        }
        super.a(nyu);
    }

    protected int m39267b() {
        int b = super.b();
        if (this.f33830a != null) {
            b += nyu.m37145d(1, this.f33830a);
        }
        if (this.f33831b != null) {
            b += nyu.m37137b(2, this.f33831b);
        }
        if (this.f33832c != null) {
            return b + nyu.m37137b(3, this.f33832c);
        }
        return b;
    }

    private oqy m39262b(nyt nyt) {
        while (true) {
            int a = nyt.m37099a();
            switch (a) {
                case 0:
                    break;
                case 10:
                    if (this.f33830a == null) {
                        this.f33830a = new oqu();
                    }
                    nyt.m37101a(this.f33830a);
                    continue;
                case wi.dH /*18*/:
                    this.f33831b = nyt.m37117j();
                    continue;
                case wi.dx /*26*/:
                    this.f33832c = nyt.m37117j();
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
