package defpackage;

public final class ony extends nyx<ony> {
    private static volatile ony[] l;
    public String a;
    public String b;
    public Integer c;
    public Integer d;
    public Integer e;
    public Integer f;
    public Integer g;
    public int h;
    public ooi[] i;
    public ong j;
    public onx k;

    public /* synthetic */ nzf a(nyt nyt) {
        return b(nyt);
    }

    public static ony[] d() {
        if (l == null) {
            synchronized (nzc.c) {
                if (l == null) {
                    l = new ony[0];
                }
            }
        }
        return l;
    }

    public ony() {
        this.a = null;
        this.b = null;
        this.c = null;
        this.d = null;
        this.e = null;
        this.f = null;
        this.g = null;
        this.h = nzf.UNSET_ENUM_VALUE;
        this.i = ooi.d();
        this.cachedSize = -1;
    }

    public void a(nyu nyu) {
        if (this.a != null) {
            nyu.a(1, this.a);
        }
        if (this.b != null) {
            nyu.a(2, this.b);
        }
        if (this.c != null) {
            nyu.a(3, this.c.intValue());
        }
        if (this.d != null) {
            nyu.a(4, this.d.intValue());
        }
        if (this.e != null) {
            nyu.a(5, this.e.intValue());
        }
        if (this.f != null) {
            nyu.c(6, this.f.intValue());
        }
        if (this.g != null) {
            nyu.c(7, this.g.intValue());
        }
        if (this.h != nzf.UNSET_ENUM_VALUE) {
            nyu.a(8, this.h);
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
        super.a(nyu);
    }

    protected int b() {
        int b = super.b();
        if (this.a != null) {
            b += nyu.b(1, this.a);
        }
        if (this.b != null) {
            b += nyu.b(2, this.b);
        }
        if (this.c != null) {
            b += nyu.f(3, this.c.intValue());
        }
        if (this.d != null) {
            b += nyu.f(4, this.d.intValue());
        }
        if (this.e != null) {
            b += nyu.f(5, this.e.intValue());
        }
        if (this.f != null) {
            b += nyu.g(6, this.f.intValue());
        }
        if (this.g != null) {
            b += nyu.g(7, this.g.intValue());
        }
        if (this.h != nzf.UNSET_ENUM_VALUE) {
            b += nyu.f(8, this.h);
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
            return b + nyu.d(11, this.k);
        }
        return b;
    }

    private ony b(nyt nyt) {
        while (true) {
            int a = nyt.a();
            switch (a) {
                case 0:
                    break;
                case 10:
                    this.a = nyt.j();
                    continue;
                case wi.dH /*18*/:
                    this.b = nyt.j();
                    continue;
                case wi.dA /*24*/:
                    this.c = Integer.valueOf(nyt.f());
                    continue;
                case 32:
                    this.d = Integer.valueOf(nyt.f());
                    continue;
                case 40:
                    this.e = Integer.valueOf(nyt.f());
                    continue;
                case 48:
                    this.f = Integer.valueOf(nyt.l());
                    continue;
                case 56:
                    this.g = Integer.valueOf(nyt.l());
                    continue;
                case 64:
                    a = nyt.f();
                    switch (a) {
                        case 0:
                        case 1:
                        case 2:
                        case 3:
                        case 4:
                        case 5:
                        case 6:
                            this.h = a;
                            break;
                        default:
                            continue;
                    }
                case 74:
                    int b = nzl.b(nyt, 74);
                    if (this.i == null) {
                        a = 0;
                    } else {
                        a = this.i.length;
                    }
                    Object obj = new ooi[(b + a)];
                    if (a != 0) {
                        System.arraycopy(this.i, 0, obj, 0, a);
                    }
                    while (a < obj.length - 1) {
                        obj[a] = new ooi();
                        nyt.a(obj[a]);
                        nyt.a();
                        a++;
                    }
                    obj[a] = new ooi();
                    nyt.a(obj[a]);
                    this.i = obj;
                    continue;
                case 82:
                    if (this.j == null) {
                        this.j = new ong();
                    }
                    nyt.a(this.j);
                    continue;
                case 90:
                    if (this.k == null) {
                        this.k = new onx();
                    }
                    nyt.a(this.k);
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
