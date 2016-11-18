package p000;

public final class mbp extends nyx<mbp> {
    public mbf f27241a;
    public mbl f27242b;
    public mbo f27243c;
    public mbb f27244d;
    public mbm f27245e;
    public maw f27246f;
    public mbh f27247g;
    public mba f27248h;
    public mbg f27249i;
    public may f27250j;
    public byte[] f27251k;

    public /* synthetic */ nzf mo150a(nyt nyt) {
        return m31609b(nyt);
    }

    public mbp() {
        m31610d();
    }

    private mbp m31610d() {
        this.f27241a = null;
        this.f27242b = null;
        this.f27243c = null;
        this.f27244d = null;
        this.f27245e = null;
        this.f27246f = null;
        this.f27247g = null;
        this.f27248h = null;
        this.f27249i = null;
        this.f27250j = null;
        this.f27251k = null;
        this.unknownFieldData = null;
        this.cachedSize = -1;
        return this;
    }

    public void mo146a(nyu nyu) {
        if (this.f27241a != null) {
            nyu.b(1, this.f27241a);
        }
        if (this.f27242b != null) {
            nyu.b(2, this.f27242b);
        }
        if (this.f27243c != null) {
            nyu.b(3, this.f27243c);
        }
        if (this.f27244d != null) {
            nyu.b(4, this.f27244d);
        }
        if (this.f27245e != null) {
            nyu.b(5, this.f27245e);
        }
        if (this.f27246f != null) {
            nyu.b(7, this.f27246f);
        }
        if (this.f27247g != null) {
            nyu.b(8, this.f27247g);
        }
        if (this.f27248h != null) {
            nyu.b(9, this.f27248h);
        }
        if (this.f27249i != null) {
            nyu.b(10, this.f27249i);
        }
        if (this.f27250j != null) {
            nyu.b(11, this.f27250j);
        }
        if (this.f27251k != null) {
            nyu.a(12, this.f27251k);
        }
        super.mo146a(nyu);
    }

    protected int mo147b() {
        int b = super.mo147b();
        if (this.f27241a != null) {
            b += nyu.d(1, this.f27241a);
        }
        if (this.f27242b != null) {
            b += nyu.d(2, this.f27242b);
        }
        if (this.f27243c != null) {
            b += nyu.d(3, this.f27243c);
        }
        if (this.f27244d != null) {
            b += nyu.d(4, this.f27244d);
        }
        if (this.f27245e != null) {
            b += nyu.d(5, this.f27245e);
        }
        if (this.f27246f != null) {
            b += nyu.d(7, this.f27246f);
        }
        if (this.f27247g != null) {
            b += nyu.d(8, this.f27247g);
        }
        if (this.f27248h != null) {
            b += nyu.d(9, this.f27248h);
        }
        if (this.f27249i != null) {
            b += nyu.d(10, this.f27249i);
        }
        if (this.f27250j != null) {
            b += nyu.d(11, this.f27250j);
        }
        if (this.f27251k != null) {
            return b + nyu.b(12, this.f27251k);
        }
        return b;
    }

    private mbp m31609b(nyt nyt) {
        while (true) {
            int a = nyt.a();
            switch (a) {
                case 0:
                    break;
                case 10:
                    if (this.f27241a == null) {
                        this.f27241a = new mbf();
                    }
                    nyt.a(this.f27241a);
                    continue;
                case wi.dH /*18*/:
                    if (this.f27242b == null) {
                        this.f27242b = new mbl();
                    }
                    nyt.a(this.f27242b);
                    continue;
                case wi.dx /*26*/:
                    if (this.f27243c == null) {
                        this.f27243c = new mbo();
                    }
                    nyt.a(this.f27243c);
                    continue;
                case 34:
                    if (this.f27244d == null) {
                        this.f27244d = new mbb();
                    }
                    nyt.a(this.f27244d);
                    continue;
                case 42:
                    if (this.f27245e == null) {
                        this.f27245e = new mbm();
                    }
                    nyt.a(this.f27245e);
                    continue;
                case 58:
                    if (this.f27246f == null) {
                        this.f27246f = new maw();
                    }
                    nyt.a(this.f27246f);
                    continue;
                case 66:
                    if (this.f27247g == null) {
                        this.f27247g = new mbh();
                    }
                    nyt.a(this.f27247g);
                    continue;
                case 74:
                    if (this.f27248h == null) {
                        this.f27248h = new mba();
                    }
                    nyt.a(this.f27248h);
                    continue;
                case 82:
                    if (this.f27249i == null) {
                        this.f27249i = new mbg();
                    }
                    nyt.a(this.f27249i);
                    continue;
                case 90:
                    if (this.f27250j == null) {
                        this.f27250j = new may();
                    }
                    nyt.a(this.f27250j);
                    continue;
                case 98:
                    this.f27251k = nyt.k();
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
