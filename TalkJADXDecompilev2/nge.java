package defpackage;

public final class nge extends nyx<nge> {
    private static volatile nge[] s;
    public String a;
    public njs b;
    public nfo c;
    public nfk d;
    public nih e;
    public nhu[] f;
    public nji[] g;
    public nip h;
    public nud[] i;
    public niu j;
    public nfj k;
    public njf l;
    public nfu[] m;
    public nfs n;
    public nfs o;
    public nfx p;
    public nfm q;
    public nfz r;

    public /* synthetic */ nzf a(nyt nyt) {
        return b(nyt);
    }

    public static nge[] d() {
        if (s == null) {
            synchronized (nzc.c) {
                if (s == null) {
                    s = new nge[0];
                }
            }
        }
        return s;
    }

    public nge() {
        g();
    }

    private nge g() {
        this.a = null;
        this.b = null;
        this.c = null;
        this.d = null;
        this.e = null;
        this.f = nhu.d();
        this.g = nji.d();
        this.h = null;
        this.i = nud.d();
        this.j = null;
        this.k = null;
        this.l = null;
        this.m = nfu.d();
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
        if (this.a != null) {
            nyu.a(1, this.a);
        }
        if (this.c != null) {
            nyu.b(2, this.c);
        }
        if (this.h != null) {
            nyu.b(3, this.h);
        }
        if (this.b != null) {
            nyu.b(4, this.b);
        }
        if (this.d != null) {
            nyu.b(5, this.d);
        }
        if (this.e != null) {
            nyu.b(7, this.e);
        }
        if (this.f != null && this.f.length > 0) {
            for (nzf nzf : this.f) {
                if (nzf != null) {
                    nyu.b(8, nzf);
                }
            }
        }
        if (this.g != null && this.g.length > 0) {
            for (nzf nzf2 : this.g) {
                if (nzf2 != null) {
                    nyu.b(9, nzf2);
                }
            }
        }
        if (this.i != null && this.i.length > 0) {
            for (nzf nzf22 : this.i) {
                if (nzf22 != null) {
                    nyu.b(10, nzf22);
                }
            }
        }
        if (this.j != null) {
            nyu.b(11, this.j);
        }
        if (this.k != null) {
            nyu.b(12, this.k);
        }
        if (this.l != null) {
            nyu.b(13, this.l);
        }
        if (this.m != null && this.m.length > 0) {
            while (i < this.m.length) {
                nzf nzf3 = this.m[i];
                if (nzf3 != null) {
                    nyu.b(14, nzf3);
                }
                i++;
            }
        }
        if (this.p != null) {
            nyu.b(15, this.p);
        }
        if (this.q != null) {
            nyu.b(16, this.q);
        }
        if (this.n != null) {
            nyu.b(17, this.n);
        }
        if (this.o != null) {
            nyu.b(18, this.o);
        }
        if (this.r != null) {
            nyu.b(19, this.r);
        }
        super.a(nyu);
    }

    protected int b() {
        int i;
        int i2 = 0;
        int b = super.b();
        if (this.a != null) {
            b += nyu.b(1, this.a);
        }
        if (this.c != null) {
            b += nyu.d(2, this.c);
        }
        if (this.h != null) {
            b += nyu.d(3, this.h);
        }
        if (this.b != null) {
            b += nyu.d(4, this.b);
        }
        if (this.d != null) {
            b += nyu.d(5, this.d);
        }
        if (this.e != null) {
            b += nyu.d(7, this.e);
        }
        if (this.f != null && this.f.length > 0) {
            i = b;
            for (nzf nzf : this.f) {
                if (nzf != null) {
                    i += nyu.d(8, nzf);
                }
            }
            b = i;
        }
        if (this.g != null && this.g.length > 0) {
            i = b;
            for (nzf nzf2 : this.g) {
                if (nzf2 != null) {
                    i += nyu.d(9, nzf2);
                }
            }
            b = i;
        }
        if (this.i != null && this.i.length > 0) {
            i = b;
            for (nzf nzf22 : this.i) {
                if (nzf22 != null) {
                    i += nyu.d(10, nzf22);
                }
            }
            b = i;
        }
        if (this.j != null) {
            b += nyu.d(11, this.j);
        }
        if (this.k != null) {
            b += nyu.d(12, this.k);
        }
        if (this.l != null) {
            b += nyu.d(13, this.l);
        }
        if (this.m != null && this.m.length > 0) {
            while (i2 < this.m.length) {
                nzf nzf3 = this.m[i2];
                if (nzf3 != null) {
                    b += nyu.d(14, nzf3);
                }
                i2++;
            }
        }
        if (this.p != null) {
            b += nyu.d(15, this.p);
        }
        if (this.q != null) {
            b += nyu.d(16, this.q);
        }
        if (this.n != null) {
            b += nyu.d(17, this.n);
        }
        if (this.o != null) {
            b += nyu.d(18, this.o);
        }
        if (this.r != null) {
            return b + nyu.d(19, this.r);
        }
        return b;
    }

    private nge b(nyt nyt) {
        while (true) {
            int a = nyt.a();
            int b;
            Object obj;
            switch (a) {
                case 0:
                    break;
                case 10:
                    this.a = nyt.j();
                    continue;
                case wi.dH /*18*/:
                    if (this.c == null) {
                        this.c = new nfo();
                    }
                    nyt.a(this.c);
                    continue;
                case wi.dx /*26*/:
                    if (this.h == null) {
                        this.h = new nip();
                    }
                    nyt.a(this.h);
                    continue;
                case 34:
                    if (this.b == null) {
                        this.b = new njs();
                    }
                    nyt.a(this.b);
                    continue;
                case 42:
                    if (this.d == null) {
                        this.d = new nfk();
                    }
                    nyt.a(this.d);
                    continue;
                case 58:
                    if (this.e == null) {
                        this.e = new nih();
                    }
                    nyt.a(this.e);
                    continue;
                case 66:
                    b = nzl.b(nyt, 66);
                    if (this.f == null) {
                        a = 0;
                    } else {
                        a = this.f.length;
                    }
                    obj = new nhu[(b + a)];
                    if (a != 0) {
                        System.arraycopy(this.f, 0, obj, 0, a);
                    }
                    while (a < obj.length - 1) {
                        obj[a] = new nhu();
                        nyt.a(obj[a]);
                        nyt.a();
                        a++;
                    }
                    obj[a] = new nhu();
                    nyt.a(obj[a]);
                    this.f = obj;
                    continue;
                case 74:
                    b = nzl.b(nyt, 74);
                    if (this.g == null) {
                        a = 0;
                    } else {
                        a = this.g.length;
                    }
                    obj = new nji[(b + a)];
                    if (a != 0) {
                        System.arraycopy(this.g, 0, obj, 0, a);
                    }
                    while (a < obj.length - 1) {
                        obj[a] = new nji();
                        nyt.a(obj[a]);
                        nyt.a();
                        a++;
                    }
                    obj[a] = new nji();
                    nyt.a(obj[a]);
                    this.g = obj;
                    continue;
                case 82:
                    b = nzl.b(nyt, 82);
                    if (this.i == null) {
                        a = 0;
                    } else {
                        a = this.i.length;
                    }
                    obj = new nud[(b + a)];
                    if (a != 0) {
                        System.arraycopy(this.i, 0, obj, 0, a);
                    }
                    while (a < obj.length - 1) {
                        obj[a] = new nud();
                        nyt.a(obj[a]);
                        nyt.a();
                        a++;
                    }
                    obj[a] = new nud();
                    nyt.a(obj[a]);
                    this.i = obj;
                    continue;
                case 90:
                    if (this.j == null) {
                        this.j = new niu();
                    }
                    nyt.a(this.j);
                    continue;
                case 98:
                    if (this.k == null) {
                        this.k = new nfj();
                    }
                    nyt.a(this.k);
                    continue;
                case 106:
                    if (this.l == null) {
                        this.l = new njf();
                    }
                    nyt.a(this.l);
                    continue;
                case 114:
                    b = nzl.b(nyt, 114);
                    if (this.m == null) {
                        a = 0;
                    } else {
                        a = this.m.length;
                    }
                    obj = new nfu[(b + a)];
                    if (a != 0) {
                        System.arraycopy(this.m, 0, obj, 0, a);
                    }
                    while (a < obj.length - 1) {
                        obj[a] = new nfu();
                        nyt.a(obj[a]);
                        nyt.a();
                        a++;
                    }
                    obj[a] = new nfu();
                    nyt.a(obj[a]);
                    this.m = obj;
                    continue;
                case 122:
                    if (this.p == null) {
                        this.p = new nfx();
                    }
                    nyt.a(this.p);
                    continue;
                case 130:
                    if (this.q == null) {
                        this.q = new nfm();
                    }
                    nyt.a(this.q);
                    continue;
                case 138:
                    if (this.n == null) {
                        this.n = new nfs();
                    }
                    nyt.a(this.n);
                    continue;
                case 146:
                    if (this.o == null) {
                        this.o = new nfs();
                    }
                    nyt.a(this.o);
                    continue;
                case 154:
                    if (this.r == null) {
                        this.r = new nfz();
                    }
                    nyt.a(this.r);
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
