package p000;

public final class mbl extends nyx<mbl> {
    public lzj f27224a;
    public lzy[] f27225b;
    public mbk[] f27226c;
    public mbk f27227d;

    public /* synthetic */ nzf mo150a(nyt nyt) {
        return m31588b(nyt);
    }

    public mbl() {
        m31589d();
    }

    private mbl m31589d() {
        this.f27224a = null;
        this.f27225b = lzy.m31363d();
        this.f27226c = mbk.m31583d();
        this.f27227d = null;
        this.unknownFieldData = null;
        this.cachedSize = -1;
        return this;
    }

    public void mo146a(nyu nyu) {
        int i = 0;
        if (this.f27224a != null) {
            nyu.b(1, this.f27224a);
        }
        if (this.f27225b != null && this.f27225b.length > 0) {
            for (nzf nzf : this.f27225b) {
                if (nzf != null) {
                    nyu.b(2, nzf);
                }
            }
        }
        if (this.f27226c != null && this.f27226c.length > 0) {
            while (i < this.f27226c.length) {
                nzf nzf2 = this.f27226c[i];
                if (nzf2 != null) {
                    nyu.b(3, nzf2);
                }
                i++;
            }
        }
        if (this.f27227d != null) {
            nyu.b(4, this.f27227d);
        }
        super.mo146a(nyu);
    }

    protected int mo147b() {
        int i = 0;
        int b = super.mo147b();
        if (this.f27224a != null) {
            b += nyu.d(1, this.f27224a);
        }
        if (this.f27225b != null && this.f27225b.length > 0) {
            int i2 = b;
            for (nzf nzf : this.f27225b) {
                if (nzf != null) {
                    i2 += nyu.d(2, nzf);
                }
            }
            b = i2;
        }
        if (this.f27226c != null && this.f27226c.length > 0) {
            while (i < this.f27226c.length) {
                nzf nzf2 = this.f27226c[i];
                if (nzf2 != null) {
                    b += nyu.d(3, nzf2);
                }
                i++;
            }
        }
        if (this.f27227d != null) {
            return b + nyu.d(4, this.f27227d);
        }
        return b;
    }

    private mbl m31588b(nyt nyt) {
        while (true) {
            int a = nyt.a();
            int b;
            Object obj;
            switch (a) {
                case 0:
                    break;
                case 10:
                    if (this.f27224a == null) {
                        this.f27224a = new lzj();
                    }
                    nyt.a(this.f27224a);
                    continue;
                case wi.dH /*18*/:
                    b = nzl.b(nyt, 18);
                    if (this.f27225b == null) {
                        a = 0;
                    } else {
                        a = this.f27225b.length;
                    }
                    obj = new lzy[(b + a)];
                    if (a != 0) {
                        System.arraycopy(this.f27225b, 0, obj, 0, a);
                    }
                    while (a < obj.length - 1) {
                        obj[a] = new lzy();
                        nyt.a(obj[a]);
                        nyt.a();
                        a++;
                    }
                    obj[a] = new lzy();
                    nyt.a(obj[a]);
                    this.f27225b = obj;
                    continue;
                case wi.dx /*26*/:
                    b = nzl.b(nyt, 26);
                    if (this.f27226c == null) {
                        a = 0;
                    } else {
                        a = this.f27226c.length;
                    }
                    obj = new mbk[(b + a)];
                    if (a != 0) {
                        System.arraycopy(this.f27226c, 0, obj, 0, a);
                    }
                    while (a < obj.length - 1) {
                        obj[a] = new mbk();
                        nyt.a(obj[a]);
                        nyt.a();
                        a++;
                    }
                    obj[a] = new mbk();
                    nyt.a(obj[a]);
                    this.f27226c = obj;
                    continue;
                case 34:
                    if (this.f27227d == null) {
                        this.f27227d = new mbk();
                    }
                    nyt.a(this.f27227d);
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
