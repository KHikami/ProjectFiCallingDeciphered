package p000;

public final class oax extends nyx<oax> {
    private static volatile oax[] f31828m;
    public oap f31829a;
    public obp f31830b;
    public Integer f31831c;
    public Integer f31832d;
    public oap f31833e;
    public obp f31834f;
    public Boolean f31835g;
    public oba[] f31836h;
    public Boolean f31837i;
    public String f31838j;
    public Integer f31839k;
    public khu f31840l;

    public /* synthetic */ nzf m37483a(nyt nyt) {
        return m37480b(nyt);
    }

    public static oax[] m37481d() {
        if (f31828m == null) {
            synchronized (nzc.f31309c) {
                if (f31828m == null) {
                    f31828m = new oax[0];
                }
            }
        }
        return f31828m;
    }

    public oax() {
        m37482g();
    }

    private oax m37482g() {
        this.f31829a = null;
        this.f31830b = null;
        this.f31832d = null;
        this.f31833e = null;
        this.f31834f = null;
        this.f31835g = null;
        this.f31836h = oba.m37583d();
        this.f31837i = null;
        this.f31838j = null;
        this.f31840l = null;
        this.unknownFieldData = null;
        this.cachedSize = -1;
        return this;
    }

    public void m37484a(nyu nyu) {
        if (this.f31829a != null) {
            nyu.m37182b(1, this.f31829a);
        }
        if (this.f31831c != null) {
            nyu.m37168a(2, this.f31831c.intValue());
        }
        if (this.f31832d != null) {
            nyu.m37168a(3, this.f31832d.intValue());
        }
        if (this.f31833e != null) {
            nyu.m37182b(4, this.f31833e);
        }
        if (this.f31835g != null) {
            nyu.m37172a(5, this.f31835g.booleanValue());
        }
        if (this.f31836h != null && this.f31836h.length > 0) {
            for (nzf nzf : this.f31836h) {
                if (nzf != null) {
                    nyu.m37182b(6, nzf);
                }
            }
        }
        if (this.f31837i != null) {
            nyu.m37172a(7, this.f31837i.booleanValue());
        }
        if (this.f31838j != null) {
            nyu.m37170a(8, this.f31838j);
        }
        if (this.f31830b != null) {
            nyu.m37182b(9, this.f31830b);
        }
        if (this.f31840l != null) {
            nyu.m37182b(10, this.f31840l);
        }
        if (this.f31834f != null) {
            nyu.m37182b(11, this.f31834f);
        }
        if (this.f31839k != null) {
            nyu.m37168a(12, this.f31839k.intValue());
        }
        super.a(nyu);
    }

    protected int m37485b() {
        int b = super.b();
        if (this.f31829a != null) {
            b += nyu.m37145d(1, this.f31829a);
        }
        if (this.f31831c != null) {
            b += nyu.m37147f(2, this.f31831c.intValue());
        }
        if (this.f31832d != null) {
            b += nyu.m37147f(3, this.f31832d.intValue());
        }
        if (this.f31833e != null) {
            b += nyu.m37145d(4, this.f31833e);
        }
        if (this.f31835g != null) {
            this.f31835g.booleanValue();
            b += nyu.m37154h(5) + 1;
        }
        if (this.f31836h != null && this.f31836h.length > 0) {
            int i = b;
            for (nzf nzf : this.f31836h) {
                if (nzf != null) {
                    i += nyu.m37145d(6, nzf);
                }
            }
            b = i;
        }
        if (this.f31837i != null) {
            this.f31837i.booleanValue();
            b += nyu.m37154h(7) + 1;
        }
        if (this.f31838j != null) {
            b += nyu.m37137b(8, this.f31838j);
        }
        if (this.f31830b != null) {
            b += nyu.m37145d(9, this.f31830b);
        }
        if (this.f31840l != null) {
            b += nyu.m37145d(10, this.f31840l);
        }
        if (this.f31834f != null) {
            b += nyu.m37145d(11, this.f31834f);
        }
        if (this.f31839k != null) {
            return b + nyu.m37147f(12, this.f31839k.intValue());
        }
        return b;
    }

    private oax m37480b(nyt nyt) {
        while (true) {
            int a = nyt.m37099a();
            switch (a) {
                case 0:
                    break;
                case 10:
                    if (this.f31829a == null) {
                        this.f31829a = new oap();
                    }
                    nyt.m37101a(this.f31829a);
                    continue;
                case 16:
                    a = nyt.m37112f();
                    switch (a) {
                        case 1:
                        case 2:
                        case 3:
                        case 4:
                        case 5:
                        case 6:
                        case 7:
                            this.f31831c = Integer.valueOf(a);
                            break;
                        default:
                            continue;
                    }
                case wi.dA /*24*/:
                    this.f31832d = Integer.valueOf(nyt.m37112f());
                    continue;
                case 34:
                    if (this.f31833e == null) {
                        this.f31833e = new oap();
                    }
                    nyt.m37101a(this.f31833e);
                    continue;
                case 40:
                    this.f31835g = Boolean.valueOf(nyt.m37116i());
                    continue;
                case 50:
                    int b = nzl.m37265b(nyt, 50);
                    if (this.f31836h == null) {
                        a = 0;
                    } else {
                        a = this.f31836h.length;
                    }
                    Object obj = new oba[(b + a)];
                    if (a != 0) {
                        System.arraycopy(this.f31836h, 0, obj, 0, a);
                    }
                    while (a < obj.length - 1) {
                        obj[a] = new oba();
                        nyt.m37101a(obj[a]);
                        nyt.m37099a();
                        a++;
                    }
                    obj[a] = new oba();
                    nyt.m37101a(obj[a]);
                    this.f31836h = obj;
                    continue;
                case 56:
                    this.f31837i = Boolean.valueOf(nyt.m37116i());
                    continue;
                case 66:
                    this.f31838j = nyt.m37117j();
                    continue;
                case 74:
                    if (this.f31830b == null) {
                        this.f31830b = new obp();
                    }
                    nyt.m37101a(this.f31830b);
                    continue;
                case 82:
                    if (this.f31840l == null) {
                        this.f31840l = new khu();
                    }
                    nyt.m37101a(this.f31840l);
                    continue;
                case 90:
                    if (this.f31834f == null) {
                        this.f31834f = new obp();
                    }
                    nyt.m37101a(this.f31834f);
                    continue;
                case 96:
                    a = nyt.m37112f();
                    switch (a) {
                        case 1:
                        case 2:
                        case 3:
                            this.f31839k = Integer.valueOf(a);
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
