package p000;

public final class nys extends nyx<nys> {
    private int f31279a;
    private String f31280b;
    private byte[] f31281c;

    public /* synthetic */ nzf m37087a(nyt nyt) {
        return m37085b(nyt);
    }

    public nys() {
        m37086d();
    }

    private nys m37086d() {
        this.f31279a = 0;
        this.f31280b = "";
        this.f31281c = nzl.f31334h;
        this.unknownFieldData = null;
        this.cachedSize = -1;
        return this;
    }

    public void m37088a(nyu nyu) {
        if ((this.f31279a & 1) != 0) {
            nyu.m37170a(1, this.f31280b);
        }
        if ((this.f31279a & 2) != 0) {
            nyu.m37173a(2, this.f31281c);
        }
        super.a(nyu);
    }

    protected int m37089b() {
        int b = super.b();
        if ((this.f31279a & 1) != 0) {
            b += nyu.m37137b(1, this.f31280b);
        }
        if ((this.f31279a & 2) != 0) {
            return b + nyu.m37139b(2, this.f31281c);
        }
        return b;
    }

    private nys m37085b(nyt nyt) {
        while (true) {
            int a = nyt.m37099a();
            switch (a) {
                case 0:
                    break;
                case 10:
                    this.f31280b = nyt.m37117j();
                    this.f31279a |= 1;
                    continue;
                case wi.dH /*18*/:
                    this.f31281c = nyt.m37118k();
                    this.f31279a |= 2;
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
