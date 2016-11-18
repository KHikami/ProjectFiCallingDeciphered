package defpackage;

public final class oam extends nyx<oam> {
    private static volatile oam[] h;
    public int a;
    public Integer b;
    public oal[] c;
    public Boolean d;
    public Integer e;
    public String f;
    public Boolean g;

    public /* synthetic */ nzf a(nyt nyt) {
        return b(nyt);
    }

    public static oam[] d() {
        if (h == null) {
            synchronized (nzc.c) {
                if (h == null) {
                    h = new oam[0];
                }
            }
        }
        return h;
    }

    public oam() {
        this.a = nzf.UNSET_ENUM_VALUE;
        this.b = null;
        this.c = oal.d();
        this.d = null;
        this.e = null;
        this.f = null;
        this.g = null;
        this.cachedSize = -1;
    }

    public void a(nyu nyu) {
        if (this.a != nzf.UNSET_ENUM_VALUE) {
            nyu.a(1, this.a);
        }
        if (this.b != null) {
            nyu.a(2, this.b.intValue());
        }
        if (this.c != null && this.c.length > 0) {
            for (nzf nzf : this.c) {
                if (nzf != null) {
                    nyu.b(3, nzf);
                }
            }
        }
        if (this.d != null) {
            nyu.a(4, this.d.booleanValue());
        }
        if (this.e != null) {
            nyu.a(5, this.e.intValue());
        }
        if (this.f != null) {
            nyu.a(6, this.f);
        }
        if (this.g != null) {
            nyu.a(7, this.g.booleanValue());
        }
        super.a(nyu);
    }

    protected int b() {
        int b = super.b();
        if (this.a != nzf.UNSET_ENUM_VALUE) {
            b += nyu.f(1, this.a);
        }
        if (this.b != null) {
            b += nyu.f(2, this.b.intValue());
        }
        if (this.c != null && this.c.length > 0) {
            int i = b;
            for (nzf nzf : this.c) {
                if (nzf != null) {
                    i += nyu.d(3, nzf);
                }
            }
            b = i;
        }
        if (this.d != null) {
            this.d.booleanValue();
            b += nyu.h(4) + 1;
        }
        if (this.e != null) {
            b += nyu.f(5, this.e.intValue());
        }
        if (this.f != null) {
            b += nyu.b(6, this.f);
        }
        if (this.g == null) {
            return b;
        }
        this.g.booleanValue();
        return b + (nyu.h(7) + 1);
    }

    private oam b(nyt nyt) {
        while (true) {
            int a = nyt.a();
            switch (a) {
                case 0:
                    break;
                case 8:
                    a = nyt.f();
                    switch (a) {
                        case 1:
                        case 2:
                        case 3:
                        case 4:
                        case 5:
                        case 6:
                        case 7:
                            this.a = a;
                            break;
                        default:
                            continue;
                    }
                case 16:
                    this.b = Integer.valueOf(nyt.f());
                    continue;
                case wi.dx /*26*/:
                    int b = nzl.b(nyt, 26);
                    if (this.c == null) {
                        a = 0;
                    } else {
                        a = this.c.length;
                    }
                    Object obj = new oal[(b + a)];
                    if (a != 0) {
                        System.arraycopy(this.c, 0, obj, 0, a);
                    }
                    while (a < obj.length - 1) {
                        obj[a] = new oal();
                        nyt.a(obj[a]);
                        nyt.a();
                        a++;
                    }
                    obj[a] = new oal();
                    nyt.a(obj[a]);
                    this.c = obj;
                    continue;
                case 32:
                    this.d = Boolean.valueOf(nyt.i());
                    continue;
                case 40:
                    this.e = Integer.valueOf(nyt.f());
                    continue;
                case 50:
                    this.f = nyt.j();
                    continue;
                case 56:
                    this.g = Boolean.valueOf(nyt.i());
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
