package p000;

public final class mba extends nyx<mba> {
    public lzj f27194a;
    public lya[] f27195b;
    public maz[] f27196c;
    public maz f27197d;

    public /* synthetic */ nzf mo150a(nyt nyt) {
        return m31530b(nyt);
    }

    public mba() {
        m31531d();
    }

    private mba m31531d() {
        this.f27194a = null;
        this.f27195b = lya.m31096d();
        this.f27196c = maz.m31514d();
        this.f27197d = null;
        this.unknownFieldData = null;
        this.cachedSize = -1;
        return this;
    }

    public void mo146a(nyu nyu) {
        int i = 0;
        if (this.f27194a != null) {
            nyu.b(1, this.f27194a);
        }
        if (this.f27195b != null && this.f27195b.length > 0) {
            for (nzf nzf : this.f27195b) {
                if (nzf != null) {
                    nyu.b(2, nzf);
                }
            }
        }
        if (this.f27196c != null && this.f27196c.length > 0) {
            while (i < this.f27196c.length) {
                nzf nzf2 = this.f27196c[i];
                if (nzf2 != null) {
                    nyu.b(3, nzf2);
                }
                i++;
            }
        }
        if (this.f27197d != null) {
            nyu.b(4, this.f27197d);
        }
        super.mo146a(nyu);
    }

    protected int mo147b() {
        int i = 0;
        int b = super.mo147b();
        if (this.f27194a != null) {
            b += nyu.d(1, this.f27194a);
        }
        if (this.f27195b != null && this.f27195b.length > 0) {
            int i2 = b;
            for (nzf nzf : this.f27195b) {
                if (nzf != null) {
                    i2 += nyu.d(2, nzf);
                }
            }
            b = i2;
        }
        if (this.f27196c != null && this.f27196c.length > 0) {
            while (i < this.f27196c.length) {
                nzf nzf2 = this.f27196c[i];
                if (nzf2 != null) {
                    b += nyu.d(3, nzf2);
                }
                i++;
            }
        }
        if (this.f27197d != null) {
            return b + nyu.d(4, this.f27197d);
        }
        return b;
    }

    private mba m31530b(nyt nyt) {
        while (true) {
            int a = nyt.a();
            int b;
            Object obj;
            switch (a) {
                case 0:
                    break;
                case 10:
                    if (this.f27194a == null) {
                        this.f27194a = new lzj();
                    }
                    nyt.a(this.f27194a);
                    continue;
                case wi.dH /*18*/:
                    b = nzl.b(nyt, 18);
                    if (this.f27195b == null) {
                        a = 0;
                    } else {
                        a = this.f27195b.length;
                    }
                    obj = new lya[(b + a)];
                    if (a != 0) {
                        System.arraycopy(this.f27195b, 0, obj, 0, a);
                    }
                    while (a < obj.length - 1) {
                        obj[a] = new lya();
                        nyt.a(obj[a]);
                        nyt.a();
                        a++;
                    }
                    obj[a] = new lya();
                    nyt.a(obj[a]);
                    this.f27195b = obj;
                    continue;
                case wi.dx /*26*/:
                    b = nzl.b(nyt, 26);
                    if (this.f27196c == null) {
                        a = 0;
                    } else {
                        a = this.f27196c.length;
                    }
                    obj = new maz[(b + a)];
                    if (a != 0) {
                        System.arraycopy(this.f27196c, 0, obj, 0, a);
                    }
                    while (a < obj.length - 1) {
                        obj[a] = new maz();
                        nyt.a(obj[a]);
                        nyt.a();
                        a++;
                    }
                    obj[a] = new maz();
                    nyt.a(obj[a]);
                    this.f27196c = obj;
                    continue;
                case 34:
                    if (this.f27197d == null) {
                        this.f27197d = new maz();
                    }
                    nyt.a(this.f27197d);
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
