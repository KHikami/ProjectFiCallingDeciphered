package defpackage;

public final class oal extends nyx<oal> {
    private static volatile oal[] m;
    public oao a;
    public obo b;
    public int c;
    public Integer d;
    public oao e;
    public obo f;
    public Boolean g;
    public oat[] h;
    public Boolean i;
    public String j;
    public int k;
    public khq l;

    public /* synthetic */ nzf a(nyt nyt) {
        return b(nyt);
    }

    public static oal[] d() {
        if (m == null) {
            synchronized (nzc.c) {
                if (m == null) {
                    m = new oal[0];
                }
            }
        }
        return m;
    }

    public oal() {
        this.c = nzf.UNSET_ENUM_VALUE;
        this.d = null;
        this.g = null;
        this.h = oat.d();
        this.i = null;
        this.j = null;
        this.k = nzf.UNSET_ENUM_VALUE;
        this.cachedSize = -1;
    }

    public void a(nyu nyu) {
        if (this.a != null) {
            nyu.b(1, this.a);
        }
        if (this.c != nzf.UNSET_ENUM_VALUE) {
            nyu.a(2, this.c);
        }
        if (this.d != null) {
            nyu.a(3, this.d.intValue());
        }
        if (this.e != null) {
            nyu.b(4, this.e);
        }
        if (this.g != null) {
            nyu.a(5, this.g.booleanValue());
        }
        if (this.h != null && this.h.length > 0) {
            for (nzf nzf : this.h) {
                if (nzf != null) {
                    nyu.b(6, nzf);
                }
            }
        }
        if (this.i != null) {
            nyu.a(7, this.i.booleanValue());
        }
        if (this.j != null) {
            nyu.a(8, this.j);
        }
        if (this.b != null) {
            nyu.b(9, this.b);
        }
        if (this.l != null) {
            nyu.b(10, this.l);
        }
        if (this.f != null) {
            nyu.b(11, this.f);
        }
        if (this.k != nzf.UNSET_ENUM_VALUE) {
            nyu.a(12, this.k);
        }
        super.a(nyu);
    }

    protected int b() {
        int b = super.b();
        if (this.a != null) {
            b += nyu.d(1, this.a);
        }
        if (this.c != nzf.UNSET_ENUM_VALUE) {
            b += nyu.f(2, this.c);
        }
        if (this.d != null) {
            b += nyu.f(3, this.d.intValue());
        }
        if (this.e != null) {
            b += nyu.d(4, this.e);
        }
        if (this.g != null) {
            this.g.booleanValue();
            b += nyu.h(5) + 1;
        }
        if (this.h != null && this.h.length > 0) {
            int i = b;
            for (nzf nzf : this.h) {
                if (nzf != null) {
                    i += nyu.d(6, nzf);
                }
            }
            b = i;
        }
        if (this.i != null) {
            this.i.booleanValue();
            b += nyu.h(7) + 1;
        }
        if (this.j != null) {
            b += nyu.b(8, this.j);
        }
        if (this.b != null) {
            b += nyu.d(9, this.b);
        }
        if (this.l != null) {
            b += nyu.d(10, this.l);
        }
        if (this.f != null) {
            b += nyu.d(11, this.f);
        }
        if (this.k != nzf.UNSET_ENUM_VALUE) {
            return b + nyu.f(12, this.k);
        }
        return b;
    }

    private oal b(nyt nyt) {
        while (true) {
            int a = nyt.a();
            switch (a) {
                case 0:
                    break;
                case 10:
                    if (this.a == null) {
                        this.a = new oao();
                    }
                    nyt.a(this.a);
                    continue;
                case 16:
                    a = nyt.f();
                    switch (a) {
                        case 1:
                        case 2:
                        case 3:
                        case 4:
                        case 5:
                        case 6:
                        case 7:
                            this.c = a;
                            break;
                        default:
                            continue;
                    }
                case wi.dA /*24*/:
                    this.d = Integer.valueOf(nyt.f());
                    continue;
                case 34:
                    if (this.e == null) {
                        this.e = new oao();
                    }
                    nyt.a(this.e);
                    continue;
                case 40:
                    this.g = Boolean.valueOf(nyt.i());
                    continue;
                case 50:
                    int b = nzl.b(nyt, 50);
                    if (this.h == null) {
                        a = 0;
                    } else {
                        a = this.h.length;
                    }
                    Object obj = new oat[(b + a)];
                    if (a != 0) {
                        System.arraycopy(this.h, 0, obj, 0, a);
                    }
                    while (a < obj.length - 1) {
                        obj[a] = new oat();
                        nyt.a(obj[a]);
                        nyt.a();
                        a++;
                    }
                    obj[a] = new oat();
                    nyt.a(obj[a]);
                    this.h = obj;
                    continue;
                case 56:
                    this.i = Boolean.valueOf(nyt.i());
                    continue;
                case 66:
                    this.j = nyt.j();
                    continue;
                case 74:
                    if (this.b == null) {
                        this.b = new obo();
                    }
                    nyt.a(this.b);
                    continue;
                case 82:
                    if (this.l == null) {
                        this.l = new khq();
                    }
                    nyt.a(this.l);
                    continue;
                case 90:
                    if (this.f == null) {
                        this.f = new obo();
                    }
                    nyt.a(this.f);
                    continue;
                case 96:
                    a = nyt.f();
                    switch (a) {
                        case 1:
                        case 2:
                        case 3:
                            this.k = a;
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
