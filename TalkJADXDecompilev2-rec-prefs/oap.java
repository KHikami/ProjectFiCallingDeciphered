package p000;

public final class oap extends nyx<oap> {
    public static final nyy<nzr, oap> f31671a = nyy.m37203a(11, oap.class, 217756658);
    public static final oap[] f31672b = new oap[0];
    public String f31673c;
    public String f31674d;
    public String f31675e;
    public String f31676f;
    public String f31677g;
    public String f31678h;
    public nzr f31679i;

    public /* synthetic */ nzf m37446a(nyt nyt) {
        return m37444b(nyt);
    }

    public oap() {
        m37445d();
    }

    private oap m37445d() {
        this.f31673c = null;
        this.f31674d = null;
        this.f31675e = null;
        this.f31676f = null;
        this.f31677g = null;
        this.f31678h = null;
        this.f31679i = null;
        this.unknownFieldData = null;
        this.cachedSize = -1;
        return this;
    }

    public void m37447a(nyu nyu) {
        if (this.f31673c != null) {
            nyu.m37170a(1, this.f31673c);
        }
        if (this.f31674d != null) {
            nyu.m37170a(2, this.f31674d);
        }
        if (this.f31675e != null) {
            nyu.m37170a(3, this.f31675e);
        }
        if (this.f31676f != null) {
            nyu.m37170a(4, this.f31676f);
        }
        if (this.f31677g != null) {
            nyu.m37170a(5, this.f31677g);
        }
        if (this.f31678h != null) {
            nyu.m37170a(6, this.f31678h);
        }
        if (this.f31679i != null) {
            nyu.m37182b(7, this.f31679i);
        }
        super.a(nyu);
    }

    protected int m37448b() {
        int b = super.b();
        if (this.f31673c != null) {
            b += nyu.m37137b(1, this.f31673c);
        }
        if (this.f31674d != null) {
            b += nyu.m37137b(2, this.f31674d);
        }
        if (this.f31675e != null) {
            b += nyu.m37137b(3, this.f31675e);
        }
        if (this.f31676f != null) {
            b += nyu.m37137b(4, this.f31676f);
        }
        if (this.f31677g != null) {
            b += nyu.m37137b(5, this.f31677g);
        }
        if (this.f31678h != null) {
            b += nyu.m37137b(6, this.f31678h);
        }
        if (this.f31679i != null) {
            return b + nyu.m37145d(7, this.f31679i);
        }
        return b;
    }

    private oap m37444b(nyt nyt) {
        while (true) {
            int a = nyt.m37099a();
            switch (a) {
                case 0:
                    break;
                case 10:
                    this.f31673c = nyt.m37117j();
                    continue;
                case wi.dH /*18*/:
                    this.f31674d = nyt.m37117j();
                    continue;
                case wi.dx /*26*/:
                    this.f31675e = nyt.m37117j();
                    continue;
                case 34:
                    this.f31676f = nyt.m37117j();
                    continue;
                case 42:
                    this.f31677g = nyt.m37117j();
                    continue;
                case 50:
                    this.f31678h = nyt.m37117j();
                    continue;
                case 58:
                    if (this.f31679i == null) {
                        this.f31679i = new nzr();
                    }
                    nyt.m37101a(this.f31679i);
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
