package p000;

public final class nue extends nyx<nue> {
    public nje f30823a;
    public String f30824b;
    public nuc f30825c;
    public nuc[] f30826d;
    public nuc[] f30827e;

    public /* synthetic */ nzf m36575a(nyt nyt) {
        return m36573b(nyt);
    }

    public nue() {
        m36574d();
    }

    private nue m36574d() {
        this.f30823a = null;
        this.f30824b = null;
        this.f30825c = null;
        this.f30826d = nuc.m36562d();
        this.f30827e = nuc.m36562d();
        this.unknownFieldData = null;
        this.cachedSize = -1;
        return this;
    }

    public void m36576a(nyu nyu) {
        int i = 0;
        if (this.f30823a != null) {
            nyu.m37182b(1, this.f30823a);
        }
        if (this.f30824b != null) {
            nyu.m37170a(2, this.f30824b);
        }
        if (this.f30825c != null) {
            nyu.m37182b(3, this.f30825c);
        }
        if (this.f30826d != null && this.f30826d.length > 0) {
            for (nzf nzf : this.f30826d) {
                if (nzf != null) {
                    nyu.m37182b(5, nzf);
                }
            }
        }
        if (this.f30827e != null && this.f30827e.length > 0) {
            while (i < this.f30827e.length) {
                nzf nzf2 = this.f30827e[i];
                if (nzf2 != null) {
                    nyu.m37182b(6, nzf2);
                }
                i++;
            }
        }
        super.a(nyu);
    }

    protected int m36577b() {
        int i = 0;
        int b = super.b();
        if (this.f30823a != null) {
            b += nyu.m37145d(1, this.f30823a);
        }
        if (this.f30824b != null) {
            b += nyu.m37137b(2, this.f30824b);
        }
        if (this.f30825c != null) {
            b += nyu.m37145d(3, this.f30825c);
        }
        if (this.f30826d != null && this.f30826d.length > 0) {
            int i2 = b;
            for (nzf nzf : this.f30826d) {
                if (nzf != null) {
                    i2 += nyu.m37145d(5, nzf);
                }
            }
            b = i2;
        }
        if (this.f30827e != null && this.f30827e.length > 0) {
            while (i < this.f30827e.length) {
                nzf nzf2 = this.f30827e[i];
                if (nzf2 != null) {
                    b += nyu.m37145d(6, nzf2);
                }
                i++;
            }
        }
        return b;
    }

    private nue m36573b(nyt nyt) {
        while (true) {
            int a = nyt.m37099a();
            int b;
            Object obj;
            switch (a) {
                case 0:
                    break;
                case 10:
                    if (this.f30823a == null) {
                        this.f30823a = new nje();
                    }
                    nyt.m37101a(this.f30823a);
                    continue;
                case wi.dH /*18*/:
                    this.f30824b = nyt.m37117j();
                    continue;
                case wi.dx /*26*/:
                    if (this.f30825c == null) {
                        this.f30825c = new nuc();
                    }
                    nyt.m37101a(this.f30825c);
                    continue;
                case 42:
                    b = nzl.m37265b(nyt, 42);
                    if (this.f30826d == null) {
                        a = 0;
                    } else {
                        a = this.f30826d.length;
                    }
                    obj = new nuc[(b + a)];
                    if (a != 0) {
                        System.arraycopy(this.f30826d, 0, obj, 0, a);
                    }
                    while (a < obj.length - 1) {
                        obj[a] = new nuc();
                        nyt.m37101a(obj[a]);
                        nyt.m37099a();
                        a++;
                    }
                    obj[a] = new nuc();
                    nyt.m37101a(obj[a]);
                    this.f30826d = obj;
                    continue;
                case 50:
                    b = nzl.m37265b(nyt, 50);
                    if (this.f30827e == null) {
                        a = 0;
                    } else {
                        a = this.f30827e.length;
                    }
                    obj = new nuc[(b + a)];
                    if (a != 0) {
                        System.arraycopy(this.f30827e, 0, obj, 0, a);
                    }
                    while (a < obj.length - 1) {
                        obj[a] = new nuc();
                        nyt.m37101a(obj[a]);
                        nyt.m37099a();
                        a++;
                    }
                    obj[a] = new nuc();
                    nyt.m37101a(obj[a]);
                    this.f30827e = obj;
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
