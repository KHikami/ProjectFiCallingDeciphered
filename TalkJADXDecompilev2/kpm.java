package defpackage;

public final class kpm extends nyx<kpm> {
    private static volatile kpm[] n;
    public kqd a;
    public kqd b;
    public Integer c;
    public Double d;
    public Double e;
    public Long f;
    public Integer g;
    public String h;
    public String i;
    public String j;
    public String k;
    public Long l;
    public kpl[] m;

    public /* synthetic */ nzf a(nyt nyt) {
        return b(nyt);
    }

    public static kpm[] d() {
        if (n == null) {
            synchronized (nzc.c) {
                if (n == null) {
                    n = new kpm[0];
                }
            }
        }
        return n;
    }

    public kpm() {
        g();
    }

    private kpm g() {
        this.a = null;
        this.b = null;
        this.d = null;
        this.e = null;
        this.f = null;
        this.g = null;
        this.h = null;
        this.i = null;
        this.j = null;
        this.k = null;
        this.l = null;
        this.m = kpl.d();
        this.unknownFieldData = null;
        this.cachedSize = -1;
        return this;
    }

    public void a(nyu nyu) {
        if (this.c != null) {
            nyu.a(2, this.c.intValue());
        }
        if (this.d != null) {
            nyu.a(3, this.d.doubleValue());
        }
        if (this.e != null) {
            nyu.a(4, this.e.doubleValue());
        }
        if (this.f != null) {
            nyu.b(5, this.f.longValue());
        }
        if (this.g != null) {
            nyu.a(6, this.g.intValue());
        }
        if (this.h != null) {
            nyu.a(7, this.h);
        }
        if (this.i != null) {
            nyu.a(8, this.i);
        }
        if (this.j != null) {
            nyu.a(9, this.j);
        }
        if (this.k != null) {
            nyu.a(10, this.k);
        }
        if (this.l != null) {
            nyu.b(11, this.l.longValue());
        }
        if (this.a != null) {
            nyu.b(12, this.a);
        }
        if (this.b != null) {
            nyu.b(13, this.b);
        }
        if (this.m != null && this.m.length > 0) {
            for (nzf nzf : this.m) {
                if (nzf != null) {
                    nyu.b(14, nzf);
                }
            }
        }
        super.a(nyu);
    }

    protected int b() {
        int b = super.b();
        if (this.c != null) {
            b += nyu.f(2, this.c.intValue());
        }
        if (this.d != null) {
            this.d.doubleValue();
            b += nyu.h(3) + 8;
        }
        if (this.e != null) {
            this.e.doubleValue();
            b += nyu.h(4) + 8;
        }
        if (this.f != null) {
            b += nyu.f(5, this.f.longValue());
        }
        if (this.g != null) {
            b += nyu.f(6, this.g.intValue());
        }
        if (this.h != null) {
            b += nyu.b(7, this.h);
        }
        if (this.i != null) {
            b += nyu.b(8, this.i);
        }
        if (this.j != null) {
            b += nyu.b(9, this.j);
        }
        if (this.k != null) {
            b += nyu.b(10, this.k);
        }
        if (this.l != null) {
            b += nyu.f(11, this.l.longValue());
        }
        if (this.a != null) {
            b += nyu.d(12, this.a);
        }
        if (this.b != null) {
            b += nyu.d(13, this.b);
        }
        if (this.m == null || this.m.length <= 0) {
            return b;
        }
        int i = b;
        for (nzf nzf : this.m) {
            if (nzf != null) {
                i += nyu.d(14, nzf);
            }
        }
        return i;
    }

    private kpm b(nyt nyt) {
        while (true) {
            int a = nyt.a();
            switch (a) {
                case 0:
                    break;
                case 16:
                    a = nyt.f();
                    switch (a) {
                        case 1:
                        case 2:
                            this.c = Integer.valueOf(a);
                            break;
                        default:
                            continue;
                    }
                case wi.dz /*25*/:
                    this.d = Double.valueOf(nyt.b());
                    continue;
                case 33:
                    this.e = Double.valueOf(nyt.b());
                    continue;
                case 40:
                    this.f = Long.valueOf(nyt.e());
                    continue;
                case 48:
                    this.g = Integer.valueOf(nyt.f());
                    continue;
                case 58:
                    this.h = nyt.j();
                    continue;
                case 66:
                    this.i = nyt.j();
                    continue;
                case 74:
                    this.j = nyt.j();
                    continue;
                case 82:
                    this.k = nyt.j();
                    continue;
                case 88:
                    this.l = Long.valueOf(nyt.e());
                    continue;
                case 98:
                    if (this.a == null) {
                        this.a = new kqd();
                    }
                    nyt.a(this.a);
                    continue;
                case 106:
                    if (this.b == null) {
                        this.b = new kqd();
                    }
                    nyt.a(this.b);
                    continue;
                case 114:
                    int b = nzl.b(nyt, 114);
                    if (this.m == null) {
                        a = 0;
                    } else {
                        a = this.m.length;
                    }
                    Object obj = new kpl[(b + a)];
                    if (a != 0) {
                        System.arraycopy(this.m, 0, obj, 0, a);
                    }
                    while (a < obj.length - 1) {
                        obj[a] = new kpl();
                        nyt.a(obj[a]);
                        nyt.a();
                        a++;
                    }
                    obj[a] = new kpl();
                    nyt.a(obj[a]);
                    this.m = obj;
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
