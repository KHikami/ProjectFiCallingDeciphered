package p000;

public final class obj extends nyx<obj> {
    public static final nyy<nzs, obj> f31926a = nyy.m37203a(11, obj.class, 221119658);
    static final obj[] f31927b = new obj[0];
    public oai f31928c;
    public String f31929d;
    public String f31930e;
    public String f31931f;
    public String[] f31932g;
    public Boolean f31933h;
    public String f31934i;
    public String f31935j;
    public String f31936k;
    public String f31937l;
    public String f31938m;
    public String f31939n;
    public String f31940o;
    public int f31941p;
    public nzs f31942q;
    public String f31943r;
    public String f31944s;
    public String f31945t;
    public String f31946u;
    public String f31947v;

    public /* synthetic */ nzf m37627a(nyt nyt) {
        return m37626b(nyt);
    }

    public obj() {
        this.f31929d = null;
        this.f31930e = null;
        this.f31931f = null;
        this.f31932g = nzl.f31332f;
        this.f31933h = null;
        this.f31934i = null;
        this.f31935j = null;
        this.f31936k = null;
        this.f31937l = null;
        this.f31938m = null;
        this.f31939n = null;
        this.f31940o = null;
        this.f31941p = nzf.UNSET_ENUM_VALUE;
        this.f31943r = null;
        this.f31944s = null;
        this.f31945t = null;
        this.f31946u = null;
        this.f31947v = null;
        this.cachedSize = -1;
    }

    public void m37628a(nyu nyu) {
        if (this.f31928c != null) {
            nyu.m37182b(1, this.f31928c);
        }
        if (this.f31929d != null) {
            nyu.m37170a(2, this.f31929d);
        }
        if (this.f31930e != null) {
            nyu.m37170a(3, this.f31930e);
        }
        if (this.f31931f != null) {
            nyu.m37170a(4, this.f31931f);
        }
        if (this.f31933h != null) {
            nyu.m37172a(5, this.f31933h.booleanValue());
        }
        if (this.f31934i != null) {
            nyu.m37170a(6, this.f31934i);
        }
        if (this.f31935j != null) {
            nyu.m37170a(7, this.f31935j);
        }
        if (this.f31936k != null) {
            nyu.m37170a(8, this.f31936k);
        }
        if (this.f31937l != null) {
            nyu.m37170a(9, this.f31937l);
        }
        if (this.f31938m != null) {
            nyu.m37170a(10, this.f31938m);
        }
        if (this.f31939n != null) {
            nyu.m37170a(11, this.f31939n);
        }
        if (this.f31940o != null) {
            nyu.m37170a(12, this.f31940o);
        }
        if (this.f31941p != nzf.UNSET_ENUM_VALUE) {
            nyu.m37168a(13, this.f31941p);
        }
        if (this.f31932g != null && this.f31932g.length > 0) {
            for (String str : this.f31932g) {
                if (str != null) {
                    nyu.m37170a(14, str);
                }
            }
        }
        if (this.f31942q != null) {
            nyu.m37182b(15, this.f31942q);
        }
        if (this.f31943r != null) {
            nyu.m37170a(16, this.f31943r);
        }
        if (this.f31944s != null) {
            nyu.m37170a(17, this.f31944s);
        }
        if (this.f31945t != null) {
            nyu.m37170a(18, this.f31945t);
        }
        if (this.f31946u != null) {
            nyu.m37170a(19, this.f31946u);
        }
        if (this.f31947v != null) {
            nyu.m37170a(20, this.f31947v);
        }
        super.a(nyu);
    }

    protected int m37629b() {
        int i = 0;
        int b = super.b();
        if (this.f31928c != null) {
            b += nyu.m37145d(1, this.f31928c);
        }
        if (this.f31929d != null) {
            b += nyu.m37137b(2, this.f31929d);
        }
        if (this.f31930e != null) {
            b += nyu.m37137b(3, this.f31930e);
        }
        if (this.f31931f != null) {
            b += nyu.m37137b(4, this.f31931f);
        }
        if (this.f31933h != null) {
            this.f31933h.booleanValue();
            b += nyu.m37154h(5) + 1;
        }
        if (this.f31934i != null) {
            b += nyu.m37137b(6, this.f31934i);
        }
        if (this.f31935j != null) {
            b += nyu.m37137b(7, this.f31935j);
        }
        if (this.f31936k != null) {
            b += nyu.m37137b(8, this.f31936k);
        }
        if (this.f31937l != null) {
            b += nyu.m37137b(9, this.f31937l);
        }
        if (this.f31938m != null) {
            b += nyu.m37137b(10, this.f31938m);
        }
        if (this.f31939n != null) {
            b += nyu.m37137b(11, this.f31939n);
        }
        if (this.f31940o != null) {
            b += nyu.m37137b(12, this.f31940o);
        }
        if (this.f31941p != nzf.UNSET_ENUM_VALUE) {
            b += nyu.m37147f(13, this.f31941p);
        }
        if (this.f31932g != null && this.f31932g.length > 0) {
            int i2 = 0;
            int i3 = 0;
            while (i < this.f31932g.length) {
                String str = this.f31932g[i];
                if (str != null) {
                    i3++;
                    i2 += nyu.m37140b(str);
                }
                i++;
            }
            b = (b + i2) + (i3 * 1);
        }
        if (this.f31942q != null) {
            b += nyu.m37145d(15, this.f31942q);
        }
        if (this.f31943r != null) {
            b += nyu.m37137b(16, this.f31943r);
        }
        if (this.f31944s != null) {
            b += nyu.m37137b(17, this.f31944s);
        }
        if (this.f31945t != null) {
            b += nyu.m37137b(18, this.f31945t);
        }
        if (this.f31946u != null) {
            b += nyu.m37137b(19, this.f31946u);
        }
        if (this.f31947v != null) {
            return b + nyu.m37137b(20, this.f31947v);
        }
        return b;
    }

    private obj m37626b(nyt nyt) {
        while (true) {
            int a = nyt.m37099a();
            switch (a) {
                case 0:
                    break;
                case 10:
                    if (this.f31928c == null) {
                        this.f31928c = new oai();
                    }
                    nyt.m37101a(this.f31928c);
                    continue;
                case wi.dH /*18*/:
                    this.f31929d = nyt.m37117j();
                    continue;
                case wi.dx /*26*/:
                    this.f31930e = nyt.m37117j();
                    continue;
                case 34:
                    this.f31931f = nyt.m37117j();
                    continue;
                case 40:
                    this.f31933h = Boolean.valueOf(nyt.m37116i());
                    continue;
                case 50:
                    this.f31934i = nyt.m37117j();
                    continue;
                case 58:
                    this.f31935j = nyt.m37117j();
                    continue;
                case 66:
                    this.f31936k = nyt.m37117j();
                    continue;
                case 74:
                    this.f31937l = nyt.m37117j();
                    continue;
                case 82:
                    this.f31938m = nyt.m37117j();
                    continue;
                case 90:
                    this.f31939n = nyt.m37117j();
                    continue;
                case 98:
                    this.f31940o = nyt.m37117j();
                    continue;
                case 104:
                    a = nyt.m37112f();
                    switch (a) {
                        case 0:
                        case 1:
                        case 2:
                        case 3:
                        case 4:
                            this.f31941p = a;
                            break;
                        default:
                            continue;
                    }
                case 114:
                    int b = nzl.m37265b(nyt, 114);
                    a = this.f31932g == null ? 0 : this.f31932g.length;
                    Object obj = new String[(b + a)];
                    if (a != 0) {
                        System.arraycopy(this.f31932g, 0, obj, 0, a);
                    }
                    while (a < obj.length - 1) {
                        obj[a] = nyt.m37117j();
                        nyt.m37099a();
                        a++;
                    }
                    obj[a] = nyt.m37117j();
                    this.f31932g = obj;
                    continue;
                case 122:
                    if (this.f31942q == null) {
                        this.f31942q = new nzs();
                    }
                    nyt.m37101a(this.f31942q);
                    continue;
                case 130:
                    this.f31943r = nyt.m37117j();
                    continue;
                case 138:
                    this.f31944s = nyt.m37117j();
                    continue;
                case 146:
                    this.f31945t = nyt.m37117j();
                    continue;
                case 154:
                    this.f31946u = nyt.m37117j();
                    continue;
                case 162:
                    this.f31947v = nyt.m37117j();
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
