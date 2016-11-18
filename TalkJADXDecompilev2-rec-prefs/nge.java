package p000;

public final class nge extends nyx<nge> {
    private static volatile nge[] f29764s;
    public String f29765a;
    public njs f29766b;
    public nfo f29767c;
    public nfk f29768d;
    public nih f29769e;
    public nhu[] f29770f;
    public nji[] f29771g;
    public nip f29772h;
    public nud[] f29773i;
    public niu f29774j;
    public nfj f29775k;
    public njf f29776l;
    public nfu[] f29777m;
    public nfs f29778n;
    public nfs f29779o;
    public nfx f29780p;
    public nfm f29781q;
    public nfz f29782r;

    public /* synthetic */ nzf m34796a(nyt nyt) {
        return m34793b(nyt);
    }

    public static nge[] m34794d() {
        if (f29764s == null) {
            synchronized (nzc.f31309c) {
                if (f29764s == null) {
                    f29764s = new nge[0];
                }
            }
        }
        return f29764s;
    }

    public nge() {
        m34795g();
    }

    private nge m34795g() {
        this.f29765a = null;
        this.f29766b = null;
        this.f29767c = null;
        this.f29768d = null;
        this.f29769e = null;
        this.f29770f = nhu.m35011d();
        this.f29771g = nji.m35222d();
        this.f29772h = null;
        this.f29773i = nud.m36568d();
        this.f29774j = null;
        this.f29775k = null;
        this.f29776l = null;
        this.f29777m = nfu.m34739d();
        this.f29778n = null;
        this.f29779o = null;
        this.f29780p = null;
        this.f29781q = null;
        this.f29782r = null;
        this.unknownFieldData = null;
        this.cachedSize = -1;
        return this;
    }

    public void m34797a(nyu nyu) {
        int i = 0;
        if (this.f29765a != null) {
            nyu.m37170a(1, this.f29765a);
        }
        if (this.f29767c != null) {
            nyu.m37182b(2, this.f29767c);
        }
        if (this.f29772h != null) {
            nyu.m37182b(3, this.f29772h);
        }
        if (this.f29766b != null) {
            nyu.m37182b(4, this.f29766b);
        }
        if (this.f29768d != null) {
            nyu.m37182b(5, this.f29768d);
        }
        if (this.f29769e != null) {
            nyu.m37182b(7, this.f29769e);
        }
        if (this.f29770f != null && this.f29770f.length > 0) {
            for (nzf nzf : this.f29770f) {
                if (nzf != null) {
                    nyu.m37182b(8, nzf);
                }
            }
        }
        if (this.f29771g != null && this.f29771g.length > 0) {
            for (nzf nzf2 : this.f29771g) {
                if (nzf2 != null) {
                    nyu.m37182b(9, nzf2);
                }
            }
        }
        if (this.f29773i != null && this.f29773i.length > 0) {
            for (nzf nzf22 : this.f29773i) {
                if (nzf22 != null) {
                    nyu.m37182b(10, nzf22);
                }
            }
        }
        if (this.f29774j != null) {
            nyu.m37182b(11, this.f29774j);
        }
        if (this.f29775k != null) {
            nyu.m37182b(12, this.f29775k);
        }
        if (this.f29776l != null) {
            nyu.m37182b(13, this.f29776l);
        }
        if (this.f29777m != null && this.f29777m.length > 0) {
            while (i < this.f29777m.length) {
                nzf nzf3 = this.f29777m[i];
                if (nzf3 != null) {
                    nyu.m37182b(14, nzf3);
                }
                i++;
            }
        }
        if (this.f29780p != null) {
            nyu.m37182b(15, this.f29780p);
        }
        if (this.f29781q != null) {
            nyu.m37182b(16, this.f29781q);
        }
        if (this.f29778n != null) {
            nyu.m37182b(17, this.f29778n);
        }
        if (this.f29779o != null) {
            nyu.m37182b(18, this.f29779o);
        }
        if (this.f29782r != null) {
            nyu.m37182b(19, this.f29782r);
        }
        super.a(nyu);
    }

    protected int m34798b() {
        int i;
        int i2 = 0;
        int b = super.b();
        if (this.f29765a != null) {
            b += nyu.m37137b(1, this.f29765a);
        }
        if (this.f29767c != null) {
            b += nyu.m37145d(2, this.f29767c);
        }
        if (this.f29772h != null) {
            b += nyu.m37145d(3, this.f29772h);
        }
        if (this.f29766b != null) {
            b += nyu.m37145d(4, this.f29766b);
        }
        if (this.f29768d != null) {
            b += nyu.m37145d(5, this.f29768d);
        }
        if (this.f29769e != null) {
            b += nyu.m37145d(7, this.f29769e);
        }
        if (this.f29770f != null && this.f29770f.length > 0) {
            i = b;
            for (nzf nzf : this.f29770f) {
                if (nzf != null) {
                    i += nyu.m37145d(8, nzf);
                }
            }
            b = i;
        }
        if (this.f29771g != null && this.f29771g.length > 0) {
            i = b;
            for (nzf nzf2 : this.f29771g) {
                if (nzf2 != null) {
                    i += nyu.m37145d(9, nzf2);
                }
            }
            b = i;
        }
        if (this.f29773i != null && this.f29773i.length > 0) {
            i = b;
            for (nzf nzf22 : this.f29773i) {
                if (nzf22 != null) {
                    i += nyu.m37145d(10, nzf22);
                }
            }
            b = i;
        }
        if (this.f29774j != null) {
            b += nyu.m37145d(11, this.f29774j);
        }
        if (this.f29775k != null) {
            b += nyu.m37145d(12, this.f29775k);
        }
        if (this.f29776l != null) {
            b += nyu.m37145d(13, this.f29776l);
        }
        if (this.f29777m != null && this.f29777m.length > 0) {
            while (i2 < this.f29777m.length) {
                nzf nzf3 = this.f29777m[i2];
                if (nzf3 != null) {
                    b += nyu.m37145d(14, nzf3);
                }
                i2++;
            }
        }
        if (this.f29780p != null) {
            b += nyu.m37145d(15, this.f29780p);
        }
        if (this.f29781q != null) {
            b += nyu.m37145d(16, this.f29781q);
        }
        if (this.f29778n != null) {
            b += nyu.m37145d(17, this.f29778n);
        }
        if (this.f29779o != null) {
            b += nyu.m37145d(18, this.f29779o);
        }
        if (this.f29782r != null) {
            return b + nyu.m37145d(19, this.f29782r);
        }
        return b;
    }

    private nge m34793b(nyt nyt) {
        while (true) {
            int a = nyt.m37099a();
            int b;
            Object obj;
            switch (a) {
                case 0:
                    break;
                case 10:
                    this.f29765a = nyt.m37117j();
                    continue;
                case wi.dH /*18*/:
                    if (this.f29767c == null) {
                        this.f29767c = new nfo();
                    }
                    nyt.m37101a(this.f29767c);
                    continue;
                case wi.dx /*26*/:
                    if (this.f29772h == null) {
                        this.f29772h = new nip();
                    }
                    nyt.m37101a(this.f29772h);
                    continue;
                case 34:
                    if (this.f29766b == null) {
                        this.f29766b = new njs();
                    }
                    nyt.m37101a(this.f29766b);
                    continue;
                case 42:
                    if (this.f29768d == null) {
                        this.f29768d = new nfk();
                    }
                    nyt.m37101a(this.f29768d);
                    continue;
                case 58:
                    if (this.f29769e == null) {
                        this.f29769e = new nih();
                    }
                    nyt.m37101a(this.f29769e);
                    continue;
                case 66:
                    b = nzl.m37265b(nyt, 66);
                    if (this.f29770f == null) {
                        a = 0;
                    } else {
                        a = this.f29770f.length;
                    }
                    obj = new nhu[(b + a)];
                    if (a != 0) {
                        System.arraycopy(this.f29770f, 0, obj, 0, a);
                    }
                    while (a < obj.length - 1) {
                        obj[a] = new nhu();
                        nyt.m37101a(obj[a]);
                        nyt.m37099a();
                        a++;
                    }
                    obj[a] = new nhu();
                    nyt.m37101a(obj[a]);
                    this.f29770f = obj;
                    continue;
                case 74:
                    b = nzl.m37265b(nyt, 74);
                    if (this.f29771g == null) {
                        a = 0;
                    } else {
                        a = this.f29771g.length;
                    }
                    obj = new nji[(b + a)];
                    if (a != 0) {
                        System.arraycopy(this.f29771g, 0, obj, 0, a);
                    }
                    while (a < obj.length - 1) {
                        obj[a] = new nji();
                        nyt.m37101a(obj[a]);
                        nyt.m37099a();
                        a++;
                    }
                    obj[a] = new nji();
                    nyt.m37101a(obj[a]);
                    this.f29771g = obj;
                    continue;
                case 82:
                    b = nzl.m37265b(nyt, 82);
                    if (this.f29773i == null) {
                        a = 0;
                    } else {
                        a = this.f29773i.length;
                    }
                    obj = new nud[(b + a)];
                    if (a != 0) {
                        System.arraycopy(this.f29773i, 0, obj, 0, a);
                    }
                    while (a < obj.length - 1) {
                        obj[a] = new nud();
                        nyt.m37101a(obj[a]);
                        nyt.m37099a();
                        a++;
                    }
                    obj[a] = new nud();
                    nyt.m37101a(obj[a]);
                    this.f29773i = obj;
                    continue;
                case 90:
                    if (this.f29774j == null) {
                        this.f29774j = new niu();
                    }
                    nyt.m37101a(this.f29774j);
                    continue;
                case 98:
                    if (this.f29775k == null) {
                        this.f29775k = new nfj();
                    }
                    nyt.m37101a(this.f29775k);
                    continue;
                case 106:
                    if (this.f29776l == null) {
                        this.f29776l = new njf();
                    }
                    nyt.m37101a(this.f29776l);
                    continue;
                case 114:
                    b = nzl.m37265b(nyt, 114);
                    if (this.f29777m == null) {
                        a = 0;
                    } else {
                        a = this.f29777m.length;
                    }
                    obj = new nfu[(b + a)];
                    if (a != 0) {
                        System.arraycopy(this.f29777m, 0, obj, 0, a);
                    }
                    while (a < obj.length - 1) {
                        obj[a] = new nfu();
                        nyt.m37101a(obj[a]);
                        nyt.m37099a();
                        a++;
                    }
                    obj[a] = new nfu();
                    nyt.m37101a(obj[a]);
                    this.f29777m = obj;
                    continue;
                case 122:
                    if (this.f29780p == null) {
                        this.f29780p = new nfx();
                    }
                    nyt.m37101a(this.f29780p);
                    continue;
                case 130:
                    if (this.f29781q == null) {
                        this.f29781q = new nfm();
                    }
                    nyt.m37101a(this.f29781q);
                    continue;
                case 138:
                    if (this.f29778n == null) {
                        this.f29778n = new nfs();
                    }
                    nyt.m37101a(this.f29778n);
                    continue;
                case 146:
                    if (this.f29779o == null) {
                        this.f29779o = new nfs();
                    }
                    nyt.m37101a(this.f29779o);
                    continue;
                case 154:
                    if (this.f29782r == null) {
                        this.f29782r = new nfz();
                    }
                    nyt.m37101a(this.f29782r);
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
