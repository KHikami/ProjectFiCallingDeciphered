package p000;

public final class kqz extends nyx<kqz> {
    private static volatile kqz[] f22840e;
    public kqd f22841a;
    public kpi f22842b;
    public String f22843c;
    public kpu f22844d;

    public /* synthetic */ nzf mo150a(nyt nyt) {
        return m27136b(nyt);
    }

    public static kqz[] m27137d() {
        if (f22840e == null) {
            synchronized (nzc.c) {
                if (f22840e == null) {
                    f22840e = new kqz[0];
                }
            }
        }
        return f22840e;
    }

    public kqz() {
        m27138g();
    }

    private kqz m27138g() {
        this.f22841a = null;
        this.f22842b = null;
        this.f22843c = null;
        this.f22844d = null;
        this.unknownFieldData = null;
        this.cachedSize = -1;
        return this;
    }

    public void mo146a(nyu nyu) {
        if (this.f22841a != null) {
            nyu.b(1, this.f22841a);
        }
        if (this.f22842b != null) {
            nyu.b(2, this.f22842b);
        }
        if (this.f22843c != null) {
            nyu.a(3, this.f22843c);
        }
        if (this.f22844d != null) {
            nyu.b(4, this.f22844d);
        }
        super.mo146a(nyu);
    }

    protected int mo147b() {
        int b = super.mo147b();
        if (this.f22841a != null) {
            b += nyu.d(1, this.f22841a);
        }
        if (this.f22842b != null) {
            b += nyu.d(2, this.f22842b);
        }
        if (this.f22843c != null) {
            b += nyu.b(3, this.f22843c);
        }
        if (this.f22844d != null) {
            return b + nyu.d(4, this.f22844d);
        }
        return b;
    }

    private kqz m27136b(nyt nyt) {
        while (true) {
            int a = nyt.a();
            switch (a) {
                case 0:
                    break;
                case 10:
                    if (this.f22841a == null) {
                        this.f22841a = new kqd();
                    }
                    nyt.a(this.f22841a);
                    continue;
                case wi.dH /*18*/:
                    if (this.f22842b == null) {
                        this.f22842b = new kpi();
                    }
                    nyt.a(this.f22842b);
                    continue;
                case wi.dx /*26*/:
                    this.f22843c = nyt.j();
                    continue;
                case 34:
                    if (this.f22844d == null) {
                        this.f22844d = new kpu();
                    }
                    nyt.a(this.f22844d);
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
