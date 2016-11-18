package p000;

public final class nzm extends nyx<nzm> {
    private static volatile nzm[] f31335i;
    public String f31336a;
    public Boolean f31337b;
    public Double f31338c;
    public String[] f31339d;
    public Long f31340e;
    public Long f31341f;
    public Integer f31342g;
    public long[] f31343h;

    public /* synthetic */ nzf m37268a(nyt nyt) {
        return m37266b(nyt);
    }

    public static nzm[] m37267d() {
        if (f31335i == null) {
            synchronized (nzc.f31309c) {
                if (f31335i == null) {
                    f31335i = new nzm[0];
                }
            }
        }
        return f31335i;
    }

    public nzm() {
        this.f31336a = null;
        this.f31337b = null;
        this.f31338c = null;
        this.f31339d = nzl.f31332f;
        this.f31340e = null;
        this.f31341f = null;
        this.f31342g = null;
        this.f31343h = nzl.f31328b;
        this.cachedSize = -1;
    }

    public void m37269a(nyu nyu) {
        int i = 0;
        nyu.m37170a(1, this.f31336a);
        if (this.f31337b != null) {
            nyu.m37172a(2, this.f31337b.booleanValue());
        }
        if (this.f31338c != null) {
            nyu.m37166a(3, this.f31338c.doubleValue());
        }
        if (this.f31339d != null && this.f31339d.length > 0) {
            for (String str : this.f31339d) {
                if (str != null) {
                    nyu.m37170a(4, str);
                }
            }
        }
        if (this.f31342g != null) {
            nyu.m37168a(5, this.f31342g.intValue());
        }
        if (this.f31340e != null) {
            nyu.m37181b(6, this.f31340e.longValue());
        }
        if (this.f31341f != null) {
            nyu.m37181b(7, this.f31341f.longValue());
        }
        if (this.f31343h != null && this.f31343h.length > 0) {
            while (i < this.f31343h.length) {
                nyu.m37181b(8, this.f31343h[i]);
                i++;
            }
        }
        super.a(nyu);
    }

    protected int m37270b() {
        int i;
        int i2 = 0;
        int b = super.b() + nyu.m37137b(1, this.f31336a);
        if (this.f31337b != null) {
            this.f31337b.booleanValue();
            b += nyu.m37154h(2) + 1;
        }
        if (this.f31338c != null) {
            this.f31338c.doubleValue();
            b += nyu.m37154h(3) + 8;
        }
        if (this.f31339d != null && this.f31339d.length > 0) {
            int i3 = 0;
            int i4 = 0;
            for (String str : this.f31339d) {
                if (str != null) {
                    i4++;
                    i3 += nyu.m37140b(str);
                }
            }
            b = (b + i3) + (i4 * 1);
        }
        if (this.f31342g != null) {
            b += nyu.m37147f(5, this.f31342g.intValue());
        }
        if (this.f31340e != null) {
            b += nyu.m37148f(6, this.f31340e.longValue());
        }
        if (this.f31341f != null) {
            b += nyu.m37148f(7, this.f31341f.longValue());
        }
        if (this.f31343h == null || this.f31343h.length <= 0) {
            return b;
        }
        i = 0;
        while (i2 < this.f31343h.length) {
            i += nyu.m37149f(this.f31343h[i2]);
            i2++;
        }
        return (b + i) + (this.f31343h.length * 1);
    }

    private nzm m37266b(nyt nyt) {
        while (true) {
            int a = nyt.m37099a();
            int b;
            Object obj;
            switch (a) {
                case 0:
                    break;
                case 10:
                    this.f31336a = nyt.m37117j();
                    continue;
                case 16:
                    this.f31337b = Boolean.valueOf(nyt.m37116i());
                    continue;
                case wi.dz /*25*/:
                    this.f31338c = Double.valueOf(nyt.m37104b());
                    continue;
                case 34:
                    b = nzl.m37265b(nyt, 34);
                    a = this.f31339d == null ? 0 : this.f31339d.length;
                    obj = new String[(b + a)];
                    if (a != 0) {
                        System.arraycopy(this.f31339d, 0, obj, 0, a);
                    }
                    while (a < obj.length - 1) {
                        obj[a] = nyt.m37117j();
                        nyt.m37099a();
                        a++;
                    }
                    obj[a] = nyt.m37117j();
                    this.f31339d = obj;
                    continue;
                case 40:
                    this.f31342g = Integer.valueOf(nyt.m37112f());
                    continue;
                case 48:
                    this.f31340e = Long.valueOf(nyt.m37110e());
                    continue;
                case 56:
                    this.f31341f = Long.valueOf(nyt.m37110e());
                    continue;
                case 64:
                    b = nzl.m37265b(nyt, 64);
                    a = this.f31343h == null ? 0 : this.f31343h.length;
                    obj = new long[(b + a)];
                    if (a != 0) {
                        System.arraycopy(this.f31343h, 0, obj, 0, a);
                    }
                    while (a < obj.length - 1) {
                        obj[a] = nyt.m37110e();
                        nyt.m37099a();
                        a++;
                    }
                    obj[a] = nyt.m37110e();
                    this.f31343h = obj;
                    continue;
                case 66:
                    int d = nyt.m37108d(nyt.m37125r());
                    b = nyt.m37128u();
                    a = 0;
                    while (nyt.m37126s() > 0) {
                        nyt.m37110e();
                        a++;
                    }
                    nyt.m37113f(b);
                    b = this.f31343h == null ? 0 : this.f31343h.length;
                    Object obj2 = new long[(a + b)];
                    if (b != 0) {
                        System.arraycopy(this.f31343h, 0, obj2, 0, b);
                    }
                    while (b < obj2.length) {
                        obj2[b] = nyt.m37110e();
                        b++;
                    }
                    this.f31343h = obj2;
                    nyt.m37111e(d);
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
