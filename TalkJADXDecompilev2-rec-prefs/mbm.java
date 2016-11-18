package p000;

public final class mbm extends nyx<mbm> {
    public lzj f27228a;
    public mab[] f27229b;
    public lzi[] f27230c;
    public lzi f27231d;

    public /* synthetic */ nzf mo150a(nyt nyt) {
        return m31593b(nyt);
    }

    public mbm() {
        m31594d();
    }

    private mbm m31594d() {
        this.f27228a = null;
        this.f27229b = mab.m31388d();
        this.f27230c = lzi.m31273d();
        this.f27231d = null;
        this.unknownFieldData = null;
        this.cachedSize = -1;
        return this;
    }

    public void mo146a(nyu nyu) {
        int i = 0;
        if (this.f27228a != null) {
            nyu.b(1, this.f27228a);
        }
        if (this.f27229b != null && this.f27229b.length > 0) {
            for (nzf nzf : this.f27229b) {
                if (nzf != null) {
                    nyu.b(2, nzf);
                }
            }
        }
        if (this.f27230c != null && this.f27230c.length > 0) {
            while (i < this.f27230c.length) {
                nzf nzf2 = this.f27230c[i];
                if (nzf2 != null) {
                    nyu.b(3, nzf2);
                }
                i++;
            }
        }
        if (this.f27231d != null) {
            nyu.b(4, this.f27231d);
        }
        super.mo146a(nyu);
    }

    protected int mo147b() {
        int i = 0;
        int b = super.mo147b();
        if (this.f27228a != null) {
            b += nyu.d(1, this.f27228a);
        }
        if (this.f27229b != null && this.f27229b.length > 0) {
            int i2 = b;
            for (nzf nzf : this.f27229b) {
                if (nzf != null) {
                    i2 += nyu.d(2, nzf);
                }
            }
            b = i2;
        }
        if (this.f27230c != null && this.f27230c.length > 0) {
            while (i < this.f27230c.length) {
                nzf nzf2 = this.f27230c[i];
                if (nzf2 != null) {
                    b += nyu.d(3, nzf2);
                }
                i++;
            }
        }
        if (this.f27231d != null) {
            return b + nyu.d(4, this.f27231d);
        }
        return b;
    }

    private mbm m31593b(nyt nyt) {
        while (true) {
            int a = nyt.a();
            int b;
            Object obj;
            switch (a) {
                case 0:
                    break;
                case 10:
                    if (this.f27228a == null) {
                        this.f27228a = new lzj();
                    }
                    nyt.a(this.f27228a);
                    continue;
                case wi.dH /*18*/:
                    b = nzl.b(nyt, 18);
                    if (this.f27229b == null) {
                        a = 0;
                    } else {
                        a = this.f27229b.length;
                    }
                    obj = new mab[(b + a)];
                    if (a != 0) {
                        System.arraycopy(this.f27229b, 0, obj, 0, a);
                    }
                    while (a < obj.length - 1) {
                        obj[a] = new mab();
                        nyt.a(obj[a]);
                        nyt.a();
                        a++;
                    }
                    obj[a] = new mab();
                    nyt.a(obj[a]);
                    this.f27229b = obj;
                    continue;
                case wi.dx /*26*/:
                    b = nzl.b(nyt, 26);
                    if (this.f27230c == null) {
                        a = 0;
                    } else {
                        a = this.f27230c.length;
                    }
                    obj = new lzi[(b + a)];
                    if (a != 0) {
                        System.arraycopy(this.f27230c, 0, obj, 0, a);
                    }
                    while (a < obj.length - 1) {
                        obj[a] = new lzi();
                        nyt.a(obj[a]);
                        nyt.a();
                        a++;
                    }
                    obj[a] = new lzi();
                    nyt.a(obj[a]);
                    this.f27230c = obj;
                    continue;
                case 34:
                    if (this.f27231d == null) {
                        this.f27231d = new lzi();
                    }
                    nyt.a(this.f27231d);
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
