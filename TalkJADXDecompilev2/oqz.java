package defpackage;

public final class oqz extends nyx<oqz> {
    private static volatile oqz[] n;
    public Integer a;
    public ora b;
    public String c;
    public String d;
    public String e;
    public String f;
    public Integer g;
    public String h;
    public Integer i;
    public orb j;
    public ora[] k;
    public oqr l;
    public String m;

    public /* synthetic */ nzf a(nyt nyt) {
        return b(nyt);
    }

    public static oqz[] d() {
        if (n == null) {
            synchronized (nzc.c) {
                if (n == null) {
                    n = new oqz[0];
                }
            }
        }
        return n;
    }

    public oqz() {
        g();
    }

    private oqz g() {
        this.b = null;
        this.c = null;
        this.d = null;
        this.e = null;
        this.f = null;
        this.g = null;
        this.h = null;
        this.i = null;
        this.j = null;
        this.k = ora.d();
        this.l = null;
        this.m = null;
        this.unknownFieldData = null;
        this.cachedSize = -1;
        return this;
    }

    public void a(nyu nyu) {
        if (this.a != null) {
            nyu.a(1, this.a.intValue());
        }
        if (this.b != null) {
            nyu.b(2, this.b);
        }
        if (this.c != null) {
            nyu.a(3, this.c);
        }
        if (this.d != null) {
            nyu.a(4, this.d);
        }
        if (this.f != null) {
            nyu.a(5, this.f);
        }
        if (this.h != null) {
            nyu.a(6, this.h);
        }
        if (this.i != null) {
            nyu.a(7, this.i.intValue());
        }
        if (this.j != null) {
            nyu.b(8, this.j);
        }
        if (this.g != null) {
            nyu.a(9, this.g.intValue());
        }
        if (this.k != null && this.k.length > 0) {
            for (nzf nzf : this.k) {
                if (nzf != null) {
                    nyu.b(10, nzf);
                }
            }
        }
        if (this.l != null) {
            nyu.b(11, this.l);
        }
        if (this.e != null) {
            nyu.a(12, this.e);
        }
        if (this.m != null) {
            nyu.a(13, this.m);
        }
        super.a(nyu);
    }

    protected int b() {
        int b = super.b();
        if (this.a != null) {
            b += nyu.f(1, this.a.intValue());
        }
        if (this.b != null) {
            b += nyu.d(2, this.b);
        }
        if (this.c != null) {
            b += nyu.b(3, this.c);
        }
        if (this.d != null) {
            b += nyu.b(4, this.d);
        }
        if (this.f != null) {
            b += nyu.b(5, this.f);
        }
        if (this.h != null) {
            b += nyu.b(6, this.h);
        }
        if (this.i != null) {
            b += nyu.f(7, this.i.intValue());
        }
        if (this.j != null) {
            b += nyu.d(8, this.j);
        }
        if (this.g != null) {
            b += nyu.f(9, this.g.intValue());
        }
        if (this.k != null && this.k.length > 0) {
            int i = b;
            for (nzf nzf : this.k) {
                if (nzf != null) {
                    i += nyu.d(10, nzf);
                }
            }
            b = i;
        }
        if (this.l != null) {
            b += nyu.d(11, this.l);
        }
        if (this.e != null) {
            b += nyu.b(12, this.e);
        }
        if (this.m != null) {
            return b + nyu.b(13, this.m);
        }
        return b;
    }

    private oqz b(nyt nyt) {
        while (true) {
            int a = nyt.a();
            switch (a) {
                case 0:
                    break;
                case 8:
                    a = nyt.f();
                    switch (a) {
                        case 0:
                        case 1:
                            this.a = Integer.valueOf(a);
                            break;
                        default:
                            continue;
                    }
                case wi.dH /*18*/:
                    if (this.b == null) {
                        this.b = new ora();
                    }
                    nyt.a(this.b);
                    continue;
                case wi.dx /*26*/:
                    this.c = nyt.j();
                    continue;
                case 34:
                    this.d = nyt.j();
                    continue;
                case 42:
                    this.f = nyt.j();
                    continue;
                case 50:
                    this.h = nyt.j();
                    continue;
                case 56:
                    this.i = Integer.valueOf(nyt.f());
                    continue;
                case 66:
                    if (this.j == null) {
                        this.j = new orb();
                    }
                    nyt.a(this.j);
                    continue;
                case 72:
                    this.g = Integer.valueOf(nyt.f());
                    continue;
                case 82:
                    int b = nzl.b(nyt, 82);
                    if (this.k == null) {
                        a = 0;
                    } else {
                        a = this.k.length;
                    }
                    Object obj = new ora[(b + a)];
                    if (a != 0) {
                        System.arraycopy(this.k, 0, obj, 0, a);
                    }
                    while (a < obj.length - 1) {
                        obj[a] = new ora();
                        nyt.a(obj[a]);
                        nyt.a();
                        a++;
                    }
                    obj[a] = new ora();
                    nyt.a(obj[a]);
                    this.k = obj;
                    continue;
                case 90:
                    if (this.l == null) {
                        this.l = new oqr();
                    }
                    nyt.a(this.l);
                    continue;
                case 98:
                    this.e = nyt.j();
                    continue;
                case 106:
                    this.m = nyt.j();
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
