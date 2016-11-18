package defpackage;

public final class nlr extends nyx<nlr> {
    private static volatile nlr[] r;
    public String a;
    public njz b;
    public nll c;
    public nlp d;
    public nkz e;
    public njd f;
    public nin g;
    public nln h;
    public nlf[] i;
    public nhu j;
    public nle k;
    public nlg l;
    public nlu m;
    public niu n;
    public niu o;
    public nlq p;
    public njf q;

    public /* synthetic */ nzf a(nyt nyt) {
        return b(nyt);
    }

    public static nlr[] d() {
        if (r == null) {
            synchronized (nzc.c) {
                if (r == null) {
                    r = new nlr[0];
                }
            }
        }
        return r;
    }

    public nlr() {
        g();
    }

    private nlr g() {
        this.a = null;
        this.b = null;
        this.c = null;
        this.d = null;
        this.e = null;
        this.f = null;
        this.g = null;
        this.h = null;
        this.i = nlf.d();
        this.j = null;
        this.k = null;
        this.l = null;
        this.m = null;
        this.n = null;
        this.o = null;
        this.p = null;
        this.q = null;
        this.unknownFieldData = null;
        this.cachedSize = -1;
        return this;
    }

    public void a(nyu nyu) {
        if (this.a != null) {
            nyu.a(1, this.a);
        }
        if (this.c != null) {
            nyu.b(2, this.c);
        }
        if (this.f != null) {
            nyu.b(3, this.f);
        }
        if (this.g != null) {
            nyu.b(4, this.g);
        }
        if (this.d != null) {
            nyu.b(5, this.d);
        }
        if (this.b != null) {
            nyu.b(6, this.b);
        }
        if (this.h != null) {
            nyu.b(7, this.h);
        }
        if (this.e != null) {
            nyu.b(8, this.e);
        }
        if (this.i != null && this.i.length > 0) {
            for (nzf nzf : this.i) {
                if (nzf != null) {
                    nyu.b(9, nzf);
                }
            }
        }
        if (this.j != null) {
            nyu.b(10, this.j);
        }
        if (this.k != null) {
            nyu.b(11, this.k);
        }
        if (this.l != null) {
            nyu.b(12, this.l);
        }
        if (this.m != null) {
            nyu.b(13, this.m);
        }
        if (this.n != null) {
            nyu.b(14, this.n);
        }
        if (this.p != null) {
            nyu.b(15, this.p);
        }
        if (this.q != null) {
            nyu.b(16, this.q);
        }
        if (this.o != null) {
            nyu.b(17, this.o);
        }
        super.a(nyu);
    }

    protected int b() {
        int b = super.b();
        if (this.a != null) {
            b += nyu.b(1, this.a);
        }
        if (this.c != null) {
            b += nyu.d(2, this.c);
        }
        if (this.f != null) {
            b += nyu.d(3, this.f);
        }
        if (this.g != null) {
            b += nyu.d(4, this.g);
        }
        if (this.d != null) {
            b += nyu.d(5, this.d);
        }
        if (this.b != null) {
            b += nyu.d(6, this.b);
        }
        if (this.h != null) {
            b += nyu.d(7, this.h);
        }
        if (this.e != null) {
            b += nyu.d(8, this.e);
        }
        if (this.i != null && this.i.length > 0) {
            int i = b;
            for (nzf nzf : this.i) {
                if (nzf != null) {
                    i += nyu.d(9, nzf);
                }
            }
            b = i;
        }
        if (this.j != null) {
            b += nyu.d(10, this.j);
        }
        if (this.k != null) {
            b += nyu.d(11, this.k);
        }
        if (this.l != null) {
            b += nyu.d(12, this.l);
        }
        if (this.m != null) {
            b += nyu.d(13, this.m);
        }
        if (this.n != null) {
            b += nyu.d(14, this.n);
        }
        if (this.p != null) {
            b += nyu.d(15, this.p);
        }
        if (this.q != null) {
            b += nyu.d(16, this.q);
        }
        if (this.o != null) {
            return b + nyu.d(17, this.o);
        }
        return b;
    }

    private nlr b(nyt nyt) {
        while (true) {
            int a = nyt.a();
            switch (a) {
                case 0:
                    break;
                case 10:
                    this.a = nyt.j();
                    continue;
                case wi.dH /*18*/:
                    if (this.c == null) {
                        this.c = new nll();
                    }
                    nyt.a(this.c);
                    continue;
                case wi.dx /*26*/:
                    if (this.f == null) {
                        this.f = new njd();
                    }
                    nyt.a(this.f);
                    continue;
                case 34:
                    if (this.g == null) {
                        this.g = new nin();
                    }
                    nyt.a(this.g);
                    continue;
                case 42:
                    if (this.d == null) {
                        this.d = new nlp();
                    }
                    nyt.a(this.d);
                    continue;
                case 50:
                    if (this.b == null) {
                        this.b = new njz();
                    }
                    nyt.a(this.b);
                    continue;
                case 58:
                    if (this.h == null) {
                        this.h = new nln();
                    }
                    nyt.a(this.h);
                    continue;
                case 66:
                    if (this.e == null) {
                        this.e = new nkz();
                    }
                    nyt.a(this.e);
                    continue;
                case 74:
                    int b = nzl.b(nyt, 74);
                    if (this.i == null) {
                        a = 0;
                    } else {
                        a = this.i.length;
                    }
                    Object obj = new nlf[(b + a)];
                    if (a != 0) {
                        System.arraycopy(this.i, 0, obj, 0, a);
                    }
                    while (a < obj.length - 1) {
                        obj[a] = new nlf();
                        nyt.a(obj[a]);
                        nyt.a();
                        a++;
                    }
                    obj[a] = new nlf();
                    nyt.a(obj[a]);
                    this.i = obj;
                    continue;
                case 82:
                    if (this.j == null) {
                        this.j = new nhu();
                    }
                    nyt.a(this.j);
                    continue;
                case 90:
                    if (this.k == null) {
                        this.k = new nle();
                    }
                    nyt.a(this.k);
                    continue;
                case 98:
                    if (this.l == null) {
                        this.l = new nlg();
                    }
                    nyt.a(this.l);
                    continue;
                case 106:
                    if (this.m == null) {
                        this.m = new nlu();
                    }
                    nyt.a(this.m);
                    continue;
                case 114:
                    if (this.n == null) {
                        this.n = new niu();
                    }
                    nyt.a(this.n);
                    continue;
                case 122:
                    if (this.p == null) {
                        this.p = new nlq();
                    }
                    nyt.a(this.p);
                    continue;
                case 130:
                    if (this.q == null) {
                        this.q = new njf();
                    }
                    nyt.a(this.q);
                    continue;
                case 138:
                    if (this.o == null) {
                        this.o = new niu();
                    }
                    nyt.a(this.o);
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
