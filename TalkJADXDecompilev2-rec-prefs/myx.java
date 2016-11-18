package p000;

public final class myx extends nyx<myx> {
    private static volatile myx[] f29192h;
    public String f29193a;
    public nbf f29194b;
    public String[] f29195c;
    public String f29196d;
    public myr[] f29197e;
    public nbx f29198f;
    public myw[] f29199g;

    public /* synthetic */ nzf m33880a(nyt nyt) {
        return m33878b(nyt);
    }

    public static myx[] m33879d() {
        if (f29192h == null) {
            synchronized (nzc.f31309c) {
                if (f29192h == null) {
                    f29192h = new myx[0];
                }
            }
        }
        return f29192h;
    }

    public myx() {
        this.f29193a = null;
        this.f29195c = nzl.f31332f;
        this.f29196d = null;
        this.f29197e = myr.m33849d();
        this.f29199g = myw.m33874d();
        this.cachedSize = -1;
    }

    public void m33881a(nyu nyu) {
        int i = 0;
        if (this.f29193a != null) {
            nyu.m37170a(1, this.f29193a);
        }
        if (this.f29194b != null) {
            nyu.m37182b(2, this.f29194b);
        }
        if (this.f29195c != null && this.f29195c.length > 0) {
            for (String str : this.f29195c) {
                if (str != null) {
                    nyu.m37170a(3, str);
                }
            }
        }
        if (this.f29196d != null) {
            nyu.m37170a(4, this.f29196d);
        }
        if (this.f29197e != null && this.f29197e.length > 0) {
            for (nzf nzf : this.f29197e) {
                if (nzf != null) {
                    nyu.m37182b(5, nzf);
                }
            }
        }
        if (this.f29198f != null) {
            nyu.m37182b(6, this.f29198f);
        }
        if (this.f29199g != null && this.f29199g.length > 0) {
            while (i < this.f29199g.length) {
                nzf nzf2 = this.f29199g[i];
                if (nzf2 != null) {
                    nyu.m37182b(7, nzf2);
                }
                i++;
            }
        }
        super.a(nyu);
    }

    protected int m33882b() {
        int i;
        int i2 = 0;
        int b = super.b();
        if (this.f29193a != null) {
            b += nyu.m37137b(1, this.f29193a);
        }
        if (this.f29194b != null) {
            b += nyu.m37145d(2, this.f29194b);
        }
        if (this.f29195c != null && this.f29195c.length > 0) {
            int i3 = 0;
            int i4 = 0;
            for (String str : this.f29195c) {
                if (str != null) {
                    i4++;
                    i3 += nyu.m37140b(str);
                }
            }
            b = (b + i3) + (i4 * 1);
        }
        if (this.f29196d != null) {
            b += nyu.m37137b(4, this.f29196d);
        }
        if (this.f29197e != null && this.f29197e.length > 0) {
            i = b;
            for (nzf nzf : this.f29197e) {
                if (nzf != null) {
                    i += nyu.m37145d(5, nzf);
                }
            }
            b = i;
        }
        if (this.f29198f != null) {
            b += nyu.m37145d(6, this.f29198f);
        }
        if (this.f29199g != null && this.f29199g.length > 0) {
            while (i2 < this.f29199g.length) {
                nzf nzf2 = this.f29199g[i2];
                if (nzf2 != null) {
                    b += nyu.m37145d(7, nzf2);
                }
                i2++;
            }
        }
        return b;
    }

    private myx m33878b(nyt nyt) {
        while (true) {
            int a = nyt.m37099a();
            int b;
            Object obj;
            switch (a) {
                case 0:
                    break;
                case 10:
                    this.f29193a = nyt.m37117j();
                    continue;
                case wi.dH /*18*/:
                    if (this.f29194b == null) {
                        this.f29194b = new nbf();
                    }
                    nyt.m37101a(this.f29194b);
                    continue;
                case wi.dx /*26*/:
                    b = nzl.m37265b(nyt, 26);
                    a = this.f29195c == null ? 0 : this.f29195c.length;
                    obj = new String[(b + a)];
                    if (a != 0) {
                        System.arraycopy(this.f29195c, 0, obj, 0, a);
                    }
                    while (a < obj.length - 1) {
                        obj[a] = nyt.m37117j();
                        nyt.m37099a();
                        a++;
                    }
                    obj[a] = nyt.m37117j();
                    this.f29195c = obj;
                    continue;
                case 34:
                    this.f29196d = nyt.m37117j();
                    continue;
                case 42:
                    b = nzl.m37265b(nyt, 42);
                    if (this.f29197e == null) {
                        a = 0;
                    } else {
                        a = this.f29197e.length;
                    }
                    obj = new myr[(b + a)];
                    if (a != 0) {
                        System.arraycopy(this.f29197e, 0, obj, 0, a);
                    }
                    while (a < obj.length - 1) {
                        obj[a] = new myr();
                        nyt.m37101a(obj[a]);
                        nyt.m37099a();
                        a++;
                    }
                    obj[a] = new myr();
                    nyt.m37101a(obj[a]);
                    this.f29197e = obj;
                    continue;
                case 50:
                    if (this.f29198f == null) {
                        this.f29198f = new nbx();
                    }
                    nyt.m37101a(this.f29198f);
                    continue;
                case 58:
                    b = nzl.m37265b(nyt, 58);
                    if (this.f29199g == null) {
                        a = 0;
                    } else {
                        a = this.f29199g.length;
                    }
                    obj = new myw[(b + a)];
                    if (a != 0) {
                        System.arraycopy(this.f29199g, 0, obj, 0, a);
                    }
                    while (a < obj.length - 1) {
                        obj[a] = new myw();
                        nyt.m37101a(obj[a]);
                        nyt.m37099a();
                        a++;
                    }
                    obj[a] = new myw();
                    nyt.m37101a(obj[a]);
                    this.f29199g = obj;
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
