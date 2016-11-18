package p000;

public final class oal extends nyx<oal> {
    private static volatile oal[] f31636m;
    public oao f31637a;
    public obo f31638b;
    public int f31639c;
    public Integer f31640d;
    public oao f31641e;
    public obo f31642f;
    public Boolean f31643g;
    public oat[] f31644h;
    public Boolean f31645i;
    public String f31646j;
    public int f31647k;
    public khq f31648l;

    public /* synthetic */ nzf m37427a(nyt nyt) {
        return m37425b(nyt);
    }

    public static oal[] m37426d() {
        if (f31636m == null) {
            synchronized (nzc.f31309c) {
                if (f31636m == null) {
                    f31636m = new oal[0];
                }
            }
        }
        return f31636m;
    }

    public oal() {
        this.f31639c = nzf.UNSET_ENUM_VALUE;
        this.f31640d = null;
        this.f31643g = null;
        this.f31644h = oat.m37464d();
        this.f31645i = null;
        this.f31646j = null;
        this.f31647k = nzf.UNSET_ENUM_VALUE;
        this.cachedSize = -1;
    }

    public void m37428a(nyu nyu) {
        if (this.f31637a != null) {
            nyu.m37182b(1, this.f31637a);
        }
        if (this.f31639c != nzf.UNSET_ENUM_VALUE) {
            nyu.m37168a(2, this.f31639c);
        }
        if (this.f31640d != null) {
            nyu.m37168a(3, this.f31640d.intValue());
        }
        if (this.f31641e != null) {
            nyu.m37182b(4, this.f31641e);
        }
        if (this.f31643g != null) {
            nyu.m37172a(5, this.f31643g.booleanValue());
        }
        if (this.f31644h != null && this.f31644h.length > 0) {
            for (nzf nzf : this.f31644h) {
                if (nzf != null) {
                    nyu.m37182b(6, nzf);
                }
            }
        }
        if (this.f31645i != null) {
            nyu.m37172a(7, this.f31645i.booleanValue());
        }
        if (this.f31646j != null) {
            nyu.m37170a(8, this.f31646j);
        }
        if (this.f31638b != null) {
            nyu.m37182b(9, this.f31638b);
        }
        if (this.f31648l != null) {
            nyu.m37182b(10, this.f31648l);
        }
        if (this.f31642f != null) {
            nyu.m37182b(11, this.f31642f);
        }
        if (this.f31647k != nzf.UNSET_ENUM_VALUE) {
            nyu.m37168a(12, this.f31647k);
        }
        super.a(nyu);
    }

    protected int m37429b() {
        int b = super.b();
        if (this.f31637a != null) {
            b += nyu.m37145d(1, this.f31637a);
        }
        if (this.f31639c != nzf.UNSET_ENUM_VALUE) {
            b += nyu.m37147f(2, this.f31639c);
        }
        if (this.f31640d != null) {
            b += nyu.m37147f(3, this.f31640d.intValue());
        }
        if (this.f31641e != null) {
            b += nyu.m37145d(4, this.f31641e);
        }
        if (this.f31643g != null) {
            this.f31643g.booleanValue();
            b += nyu.m37154h(5) + 1;
        }
        if (this.f31644h != null && this.f31644h.length > 0) {
            int i = b;
            for (nzf nzf : this.f31644h) {
                if (nzf != null) {
                    i += nyu.m37145d(6, nzf);
                }
            }
            b = i;
        }
        if (this.f31645i != null) {
            this.f31645i.booleanValue();
            b += nyu.m37154h(7) + 1;
        }
        if (this.f31646j != null) {
            b += nyu.m37137b(8, this.f31646j);
        }
        if (this.f31638b != null) {
            b += nyu.m37145d(9, this.f31638b);
        }
        if (this.f31648l != null) {
            b += nyu.m37145d(10, this.f31648l);
        }
        if (this.f31642f != null) {
            b += nyu.m37145d(11, this.f31642f);
        }
        if (this.f31647k != nzf.UNSET_ENUM_VALUE) {
            return b + nyu.m37147f(12, this.f31647k);
        }
        return b;
    }

    private oal m37425b(nyt nyt) {
        while (true) {
            int a = nyt.m37099a();
            switch (a) {
                case 0:
                    break;
                case 10:
                    if (this.f31637a == null) {
                        this.f31637a = new oao();
                    }
                    nyt.m37101a(this.f31637a);
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
                            this.f31639c = a;
                            break;
                        default:
                            continue;
                    }
                case wi.dA /*24*/:
                    this.f31640d = Integer.valueOf(nyt.m37112f());
                    continue;
                case 34:
                    if (this.f31641e == null) {
                        this.f31641e = new oao();
                    }
                    nyt.m37101a(this.f31641e);
                    continue;
                case 40:
                    this.f31643g = Boolean.valueOf(nyt.m37116i());
                    continue;
                case 50:
                    int b = nzl.m37265b(nyt, 50);
                    if (this.f31644h == null) {
                        a = 0;
                    } else {
                        a = this.f31644h.length;
                    }
                    Object obj = new oat[(b + a)];
                    if (a != 0) {
                        System.arraycopy(this.f31644h, 0, obj, 0, a);
                    }
                    while (a < obj.length - 1) {
                        obj[a] = new oat();
                        nyt.m37101a(obj[a]);
                        nyt.m37099a();
                        a++;
                    }
                    obj[a] = new oat();
                    nyt.m37101a(obj[a]);
                    this.f31644h = obj;
                    continue;
                case 56:
                    this.f31645i = Boolean.valueOf(nyt.m37116i());
                    continue;
                case 66:
                    this.f31646j = nyt.m37117j();
                    continue;
                case 74:
                    if (this.f31638b == null) {
                        this.f31638b = new obo();
                    }
                    nyt.m37101a(this.f31638b);
                    continue;
                case 82:
                    if (this.f31648l == null) {
                        this.f31648l = new khq();
                    }
                    nyt.m37101a(this.f31648l);
                    continue;
                case 90:
                    if (this.f31642f == null) {
                        this.f31642f = new obo();
                    }
                    nyt.m37101a(this.f31642f);
                    continue;
                case 96:
                    a = nyt.m37112f();
                    switch (a) {
                        case 1:
                        case 2:
                        case 3:
                            this.f31647k = a;
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
