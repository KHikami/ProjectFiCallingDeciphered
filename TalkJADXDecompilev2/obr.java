package defpackage;

public final class obr extends nyx<obr> {
    public static final nyy<nzr, obr> a = nyy.a(11, obr.class, 317991610);
    public static final nyy<ozo, obr> b = nyy.a(11, obr.class, 317991610);
    private static final obr[] t = new obr[0];
    public String c;
    public String d;
    public String e;
    public String f;
    public String g;
    public oaa h;
    public String i;
    public nzr[] j;
    public nzr k;
    public nzr[] l;
    public String m;
    public String n;
    public nzr o;
    public String p;
    public String q;
    public String r;
    public Integer s;

    public /* synthetic */ nzf a(nyt nyt) {
        return b(nyt);
    }

    public obr() {
        d();
    }

    private obr d() {
        this.c = null;
        this.d = null;
        this.e = null;
        this.f = null;
        this.g = null;
        this.h = null;
        this.i = null;
        this.j = nzr.d();
        this.k = null;
        this.l = nzr.d();
        this.m = null;
        this.n = null;
        this.o = null;
        this.p = null;
        this.q = null;
        this.r = null;
        this.unknownFieldData = null;
        this.cachedSize = -1;
        return this;
    }

    public void a(nyu nyu) {
        int i = 0;
        if (this.c != null) {
            nyu.a(1, this.c);
        }
        if (this.d != null) {
            nyu.a(2, this.d);
        }
        if (this.e != null) {
            nyu.a(3, this.e);
        }
        if (this.f != null) {
            nyu.a(4, this.f);
        }
        if (this.g != null) {
            nyu.a(5, this.g);
        }
        if (this.h != null) {
            nyu.b(6, this.h);
        }
        if (this.i != null) {
            nyu.a(7, this.i);
        }
        if (this.j != null && this.j.length > 0) {
            for (nzf nzf : this.j) {
                if (nzf != null) {
                    nyu.b(8, nzf);
                }
            }
        }
        if (this.k != null) {
            nyu.b(9, this.k);
        }
        if (this.l != null && this.l.length > 0) {
            while (i < this.l.length) {
                nzf nzf2 = this.l[i];
                if (nzf2 != null) {
                    nyu.b(11, nzf2);
                }
                i++;
            }
        }
        if (this.m != null) {
            nyu.a(12, this.m);
        }
        if (this.n != null) {
            nyu.a(75, this.n);
        }
        if (this.o != null) {
            nyu.b(185, this.o);
        }
        if (this.p != null) {
            nyu.a(254, this.p);
        }
        if (this.q != null) {
            nyu.a(282, this.q);
        }
        if (this.r != null) {
            nyu.a(287, this.r);
        }
        if (this.s != null) {
            nyu.a(288, this.s.intValue());
        }
        super.a(nyu);
    }

    protected int b() {
        int i = 0;
        int b = super.b();
        if (this.c != null) {
            b += nyu.b(1, this.c);
        }
        if (this.d != null) {
            b += nyu.b(2, this.d);
        }
        if (this.e != null) {
            b += nyu.b(3, this.e);
        }
        if (this.f != null) {
            b += nyu.b(4, this.f);
        }
        if (this.g != null) {
            b += nyu.b(5, this.g);
        }
        if (this.h != null) {
            b += nyu.d(6, this.h);
        }
        if (this.i != null) {
            b += nyu.b(7, this.i);
        }
        if (this.j != null && this.j.length > 0) {
            int i2 = b;
            for (nzf nzf : this.j) {
                if (nzf != null) {
                    i2 += nyu.d(8, nzf);
                }
            }
            b = i2;
        }
        if (this.k != null) {
            b += nyu.d(9, this.k);
        }
        if (this.l != null && this.l.length > 0) {
            while (i < this.l.length) {
                nzf nzf2 = this.l[i];
                if (nzf2 != null) {
                    b += nyu.d(11, nzf2);
                }
                i++;
            }
        }
        if (this.m != null) {
            b += nyu.b(12, this.m);
        }
        if (this.n != null) {
            b += nyu.b(75, this.n);
        }
        if (this.o != null) {
            b += nyu.d(185, this.o);
        }
        if (this.p != null) {
            b += nyu.b(254, this.p);
        }
        if (this.q != null) {
            b += nyu.b(282, this.q);
        }
        if (this.r != null) {
            b += nyu.b(287, this.r);
        }
        if (this.s != null) {
            return b + nyu.f(288, this.s.intValue());
        }
        return b;
    }

    private obr b(nyt nyt) {
        while (true) {
            int a = nyt.a();
            int b;
            Object obj;
            switch (a) {
                case 0:
                    break;
                case 10:
                    this.c = nyt.j();
                    continue;
                case wi.dH /*18*/:
                    this.d = nyt.j();
                    continue;
                case wi.dx /*26*/:
                    this.e = nyt.j();
                    continue;
                case 34:
                    this.f = nyt.j();
                    continue;
                case 42:
                    this.g = nyt.j();
                    continue;
                case 50:
                    if (this.h == null) {
                        this.h = new oaa();
                    }
                    nyt.a(this.h);
                    continue;
                case 58:
                    this.i = nyt.j();
                    continue;
                case 66:
                    b = nzl.b(nyt, 66);
                    if (this.j == null) {
                        a = 0;
                    } else {
                        a = this.j.length;
                    }
                    obj = new nzr[(b + a)];
                    if (a != 0) {
                        System.arraycopy(this.j, 0, obj, 0, a);
                    }
                    while (a < obj.length - 1) {
                        obj[a] = new nzr();
                        nyt.a(obj[a]);
                        nyt.a();
                        a++;
                    }
                    obj[a] = new nzr();
                    nyt.a(obj[a]);
                    this.j = obj;
                    continue;
                case 74:
                    if (this.k == null) {
                        this.k = new nzr();
                    }
                    nyt.a(this.k);
                    continue;
                case 90:
                    b = nzl.b(nyt, 90);
                    if (this.l == null) {
                        a = 0;
                    } else {
                        a = this.l.length;
                    }
                    obj = new nzr[(b + a)];
                    if (a != 0) {
                        System.arraycopy(this.l, 0, obj, 0, a);
                    }
                    while (a < obj.length - 1) {
                        obj[a] = new nzr();
                        nyt.a(obj[a]);
                        nyt.a();
                        a++;
                    }
                    obj[a] = new nzr();
                    nyt.a(obj[a]);
                    this.l = obj;
                    continue;
                case 98:
                    this.m = nyt.j();
                    continue;
                case 602:
                    this.n = nyt.j();
                    continue;
                case 1482:
                    if (this.o == null) {
                        this.o = new nzr();
                    }
                    nyt.a(this.o);
                    continue;
                case 2034:
                    this.p = nyt.j();
                    continue;
                case 2258:
                    this.q = nyt.j();
                    continue;
                case 2298:
                    this.r = nyt.j();
                    continue;
                case 2304:
                    a = nyt.f();
                    switch (a) {
                        case 0:
                        case 1:
                        case 2:
                            this.s = Integer.valueOf(a);
                            break;
                        default:
                            continue;
                    }
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
