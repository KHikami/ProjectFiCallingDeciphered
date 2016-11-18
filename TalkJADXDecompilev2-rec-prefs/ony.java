package p000;

public final class ony extends nyx<ony> {
    private static volatile ony[] f33338l;
    public String f33339a;
    public String f33340b;
    public Integer f33341c;
    public Integer f33342d;
    public Integer f33343e;
    public Integer f33344f;
    public Integer f33345g;
    public int f33346h;
    public ooi[] f33347i;
    public ong f33348j;
    public onx f33349k;

    public /* synthetic */ nzf m38861a(nyt nyt) {
        return m38859b(nyt);
    }

    public static ony[] m38860d() {
        if (f33338l == null) {
            synchronized (nzc.f31309c) {
                if (f33338l == null) {
                    f33338l = new ony[0];
                }
            }
        }
        return f33338l;
    }

    public ony() {
        this.f33339a = null;
        this.f33340b = null;
        this.f33341c = null;
        this.f33342d = null;
        this.f33343e = null;
        this.f33344f = null;
        this.f33345g = null;
        this.f33346h = nzf.UNSET_ENUM_VALUE;
        this.f33347i = ooi.m38905d();
        this.cachedSize = -1;
    }

    public void m38862a(nyu nyu) {
        if (this.f33339a != null) {
            nyu.m37170a(1, this.f33339a);
        }
        if (this.f33340b != null) {
            nyu.m37170a(2, this.f33340b);
        }
        if (this.f33341c != null) {
            nyu.m37168a(3, this.f33341c.intValue());
        }
        if (this.f33342d != null) {
            nyu.m37168a(4, this.f33342d.intValue());
        }
        if (this.f33343e != null) {
            nyu.m37168a(5, this.f33343e.intValue());
        }
        if (this.f33344f != null) {
            nyu.m37186c(6, this.f33344f.intValue());
        }
        if (this.f33345g != null) {
            nyu.m37186c(7, this.f33345g.intValue());
        }
        if (this.f33346h != nzf.UNSET_ENUM_VALUE) {
            nyu.m37168a(8, this.f33346h);
        }
        if (this.f33347i != null && this.f33347i.length > 0) {
            for (nzf nzf : this.f33347i) {
                if (nzf != null) {
                    nyu.m37182b(9, nzf);
                }
            }
        }
        if (this.f33348j != null) {
            nyu.m37182b(10, this.f33348j);
        }
        if (this.f33349k != null) {
            nyu.m37182b(11, this.f33349k);
        }
        super.a(nyu);
    }

    protected int m38863b() {
        int b = super.b();
        if (this.f33339a != null) {
            b += nyu.m37137b(1, this.f33339a);
        }
        if (this.f33340b != null) {
            b += nyu.m37137b(2, this.f33340b);
        }
        if (this.f33341c != null) {
            b += nyu.m37147f(3, this.f33341c.intValue());
        }
        if (this.f33342d != null) {
            b += nyu.m37147f(4, this.f33342d.intValue());
        }
        if (this.f33343e != null) {
            b += nyu.m37147f(5, this.f33343e.intValue());
        }
        if (this.f33344f != null) {
            b += nyu.m37151g(6, this.f33344f.intValue());
        }
        if (this.f33345g != null) {
            b += nyu.m37151g(7, this.f33345g.intValue());
        }
        if (this.f33346h != nzf.UNSET_ENUM_VALUE) {
            b += nyu.m37147f(8, this.f33346h);
        }
        if (this.f33347i != null && this.f33347i.length > 0) {
            int i = b;
            for (nzf nzf : this.f33347i) {
                if (nzf != null) {
                    i += nyu.m37145d(9, nzf);
                }
            }
            b = i;
        }
        if (this.f33348j != null) {
            b += nyu.m37145d(10, this.f33348j);
        }
        if (this.f33349k != null) {
            return b + nyu.m37145d(11, this.f33349k);
        }
        return b;
    }

    private ony m38859b(nyt nyt) {
        while (true) {
            int a = nyt.m37099a();
            switch (a) {
                case 0:
                    break;
                case 10:
                    this.f33339a = nyt.m37117j();
                    continue;
                case wi.dH /*18*/:
                    this.f33340b = nyt.m37117j();
                    continue;
                case wi.dA /*24*/:
                    this.f33341c = Integer.valueOf(nyt.m37112f());
                    continue;
                case 32:
                    this.f33342d = Integer.valueOf(nyt.m37112f());
                    continue;
                case 40:
                    this.f33343e = Integer.valueOf(nyt.m37112f());
                    continue;
                case 48:
                    this.f33344f = Integer.valueOf(nyt.m37119l());
                    continue;
                case 56:
                    this.f33345g = Integer.valueOf(nyt.m37119l());
                    continue;
                case 64:
                    a = nyt.m37112f();
                    switch (a) {
                        case 0:
                        case 1:
                        case 2:
                        case 3:
                        case 4:
                        case 5:
                        case 6:
                            this.f33346h = a;
                            break;
                        default:
                            continue;
                    }
                case 74:
                    int b = nzl.m37265b(nyt, 74);
                    if (this.f33347i == null) {
                        a = 0;
                    } else {
                        a = this.f33347i.length;
                    }
                    Object obj = new ooi[(b + a)];
                    if (a != 0) {
                        System.arraycopy(this.f33347i, 0, obj, 0, a);
                    }
                    while (a < obj.length - 1) {
                        obj[a] = new ooi();
                        nyt.m37101a(obj[a]);
                        nyt.m37099a();
                        a++;
                    }
                    obj[a] = new ooi();
                    nyt.m37101a(obj[a]);
                    this.f33347i = obj;
                    continue;
                case 82:
                    if (this.f33348j == null) {
                        this.f33348j = new ong();
                    }
                    nyt.m37101a(this.f33348j);
                    continue;
                case 90:
                    if (this.f33349k == null) {
                        this.f33349k = new onx();
                    }
                    nyt.m37101a(this.f33349k);
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
