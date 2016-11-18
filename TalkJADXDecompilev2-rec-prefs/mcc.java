package p000;

public final class mcc extends nyx<mcc> {
    public mcf f27294a;
    public mce f27295b;
    public mch f27296c;
    public Long f27297d;
    public mcg f27298e;
    public mcd f27299f;

    public /* synthetic */ nzf mo150a(nyt nyt) {
        return m31676b(nyt);
    }

    public mcc() {
        m31677d();
    }

    private mcc m31677d() {
        this.f27294a = null;
        this.f27295b = null;
        this.f27296c = null;
        this.f27297d = null;
        this.f27298e = null;
        this.f27299f = null;
        this.unknownFieldData = null;
        this.cachedSize = -1;
        return this;
    }

    public void mo146a(nyu nyu) {
        if (this.f27294a != null) {
            nyu.b(1, this.f27294a);
        }
        if (this.f27295b != null) {
            nyu.b(2, this.f27295b);
        }
        if (this.f27296c != null) {
            nyu.b(3, this.f27296c);
        }
        if (this.f27297d != null) {
            nyu.b(4, this.f27297d.longValue());
        }
        if (this.f27298e != null) {
            nyu.b(5, this.f27298e);
        }
        if (this.f27299f != null) {
            nyu.b(6, this.f27299f);
        }
        super.mo146a(nyu);
    }

    protected int mo147b() {
        int b = super.mo147b();
        if (this.f27294a != null) {
            b += nyu.d(1, this.f27294a);
        }
        if (this.f27295b != null) {
            b += nyu.d(2, this.f27295b);
        }
        if (this.f27296c != null) {
            b += nyu.d(3, this.f27296c);
        }
        if (this.f27297d != null) {
            b += nyu.f(4, this.f27297d.longValue());
        }
        if (this.f27298e != null) {
            b += nyu.d(5, this.f27298e);
        }
        if (this.f27299f != null) {
            return b + nyu.d(6, this.f27299f);
        }
        return b;
    }

    private mcc m31676b(nyt nyt) {
        while (true) {
            int a = nyt.a();
            switch (a) {
                case 0:
                    break;
                case 10:
                    if (this.f27294a == null) {
                        this.f27294a = new mcf();
                    }
                    nyt.a(this.f27294a);
                    continue;
                case wi.dH /*18*/:
                    if (this.f27295b == null) {
                        this.f27295b = new mce();
                    }
                    nyt.a(this.f27295b);
                    continue;
                case wi.dx /*26*/:
                    if (this.f27296c == null) {
                        this.f27296c = new mch();
                    }
                    nyt.a(this.f27296c);
                    continue;
                case 32:
                    this.f27297d = Long.valueOf(nyt.e());
                    continue;
                case 42:
                    if (this.f27298e == null) {
                        this.f27298e = new mcg();
                    }
                    nyt.a(this.f27298e);
                    continue;
                case 50:
                    if (this.f27299f == null) {
                        this.f27299f = new mcd();
                    }
                    nyt.a(this.f27299f);
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
