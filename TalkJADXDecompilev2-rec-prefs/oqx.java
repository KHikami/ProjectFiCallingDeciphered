package p000;

public final class oqx extends nyx<oqx> {
    public oso f33825a;
    public oqw[] f33826b;
    public oqu[] f33827c;
    public oqu f33828d;

    public /* synthetic */ nzf m39259a(nyt nyt) {
        return m39257b(nyt);
    }

    public oqx() {
        m39258d();
    }

    private oqx m39258d() {
        this.f33825a = null;
        this.f33826b = oqw.m39252d();
        this.f33827c = oqu.m39240d();
        this.f33828d = null;
        this.unknownFieldData = null;
        this.cachedSize = -1;
        return this;
    }

    public void m39260a(nyu nyu) {
        int i = 0;
        if (this.f33825a != null) {
            nyu.m37182b(1, this.f33825a);
        }
        if (this.f33826b != null && this.f33826b.length > 0) {
            for (nzf nzf : this.f33826b) {
                if (nzf != null) {
                    nyu.m37182b(2, nzf);
                }
            }
        }
        if (this.f33828d != null) {
            nyu.m37182b(3, this.f33828d);
        }
        if (this.f33827c != null && this.f33827c.length > 0) {
            while (i < this.f33827c.length) {
                nzf nzf2 = this.f33827c[i];
                if (nzf2 != null) {
                    nyu.m37182b(4, nzf2);
                }
                i++;
            }
        }
        super.a(nyu);
    }

    protected int m39261b() {
        int i = 0;
        int b = super.b();
        if (this.f33825a != null) {
            b += nyu.m37145d(1, this.f33825a);
        }
        if (this.f33826b != null && this.f33826b.length > 0) {
            int i2 = b;
            for (nzf nzf : this.f33826b) {
                if (nzf != null) {
                    i2 += nyu.m37145d(2, nzf);
                }
            }
            b = i2;
        }
        if (this.f33828d != null) {
            b += nyu.m37145d(3, this.f33828d);
        }
        if (this.f33827c != null && this.f33827c.length > 0) {
            while (i < this.f33827c.length) {
                nzf nzf2 = this.f33827c[i];
                if (nzf2 != null) {
                    b += nyu.m37145d(4, nzf2);
                }
                i++;
            }
        }
        return b;
    }

    private oqx m39257b(nyt nyt) {
        while (true) {
            int a = nyt.m37099a();
            int b;
            Object obj;
            switch (a) {
                case 0:
                    break;
                case 10:
                    if (this.f33825a == null) {
                        this.f33825a = new oso();
                    }
                    nyt.m37101a(this.f33825a);
                    continue;
                case wi.dH /*18*/:
                    b = nzl.m37265b(nyt, 18);
                    if (this.f33826b == null) {
                        a = 0;
                    } else {
                        a = this.f33826b.length;
                    }
                    obj = new oqw[(b + a)];
                    if (a != 0) {
                        System.arraycopy(this.f33826b, 0, obj, 0, a);
                    }
                    while (a < obj.length - 1) {
                        obj[a] = new oqw();
                        nyt.m37101a(obj[a]);
                        nyt.m37099a();
                        a++;
                    }
                    obj[a] = new oqw();
                    nyt.m37101a(obj[a]);
                    this.f33826b = obj;
                    continue;
                case wi.dx /*26*/:
                    if (this.f33828d == null) {
                        this.f33828d = new oqu();
                    }
                    nyt.m37101a(this.f33828d);
                    continue;
                case 34:
                    b = nzl.m37265b(nyt, 34);
                    if (this.f33827c == null) {
                        a = 0;
                    } else {
                        a = this.f33827c.length;
                    }
                    obj = new oqu[(b + a)];
                    if (a != 0) {
                        System.arraycopy(this.f33827c, 0, obj, 0, a);
                    }
                    while (a < obj.length - 1) {
                        obj[a] = new oqu();
                        nyt.m37101a(obj[a]);
                        nyt.m37099a();
                        a++;
                    }
                    obj[a] = new oqu();
                    nyt.m37101a(obj[a]);
                    this.f33827c = obj;
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
