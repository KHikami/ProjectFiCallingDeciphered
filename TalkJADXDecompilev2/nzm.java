package defpackage;

public final class nzm extends nyx<nzm> {
    private static volatile nzm[] i;
    public String a;
    public Boolean b;
    public Double c;
    public String[] d;
    public Long e;
    public Long f;
    public Integer g;
    public long[] h;

    public /* synthetic */ nzf a(nyt nyt) {
        return b(nyt);
    }

    public static nzm[] d() {
        if (i == null) {
            synchronized (nzc.c) {
                if (i == null) {
                    i = new nzm[0];
                }
            }
        }
        return i;
    }

    public nzm() {
        this.a = null;
        this.b = null;
        this.c = null;
        this.d = nzl.f;
        this.e = null;
        this.f = null;
        this.g = null;
        this.h = nzl.b;
        this.cachedSize = -1;
    }

    public void a(nyu nyu) {
        int i = 0;
        nyu.a(1, this.a);
        if (this.b != null) {
            nyu.a(2, this.b.booleanValue());
        }
        if (this.c != null) {
            nyu.a(3, this.c.doubleValue());
        }
        if (this.d != null && this.d.length > 0) {
            for (String str : this.d) {
                if (str != null) {
                    nyu.a(4, str);
                }
            }
        }
        if (this.g != null) {
            nyu.a(5, this.g.intValue());
        }
        if (this.e != null) {
            nyu.b(6, this.e.longValue());
        }
        if (this.f != null) {
            nyu.b(7, this.f.longValue());
        }
        if (this.h != null && this.h.length > 0) {
            while (i < this.h.length) {
                nyu.b(8, this.h[i]);
                i++;
            }
        }
        super.a(nyu);
    }

    protected int b() {
        int i;
        int i2 = 0;
        int b = super.b() + nyu.b(1, this.a);
        if (this.b != null) {
            this.b.booleanValue();
            b += nyu.h(2) + 1;
        }
        if (this.c != null) {
            this.c.doubleValue();
            b += nyu.h(3) + 8;
        }
        if (this.d != null && this.d.length > 0) {
            int i3 = 0;
            int i4 = 0;
            for (String str : this.d) {
                if (str != null) {
                    i4++;
                    i3 += nyu.b(str);
                }
            }
            b = (b + i3) + (i4 * 1);
        }
        if (this.g != null) {
            b += nyu.f(5, this.g.intValue());
        }
        if (this.e != null) {
            b += nyu.f(6, this.e.longValue());
        }
        if (this.f != null) {
            b += nyu.f(7, this.f.longValue());
        }
        if (this.h == null || this.h.length <= 0) {
            return b;
        }
        i = 0;
        while (i2 < this.h.length) {
            i += nyu.f(this.h[i2]);
            i2++;
        }
        return (b + i) + (this.h.length * 1);
    }

    private nzm b(nyt nyt) {
        while (true) {
            int a = nyt.a();
            int b;
            Object obj;
            switch (a) {
                case 0:
                    break;
                case 10:
                    this.a = nyt.j();
                    continue;
                case 16:
                    this.b = Boolean.valueOf(nyt.i());
                    continue;
                case wi.dz /*25*/:
                    this.c = Double.valueOf(nyt.b());
                    continue;
                case 34:
                    b = nzl.b(nyt, 34);
                    a = this.d == null ? 0 : this.d.length;
                    obj = new String[(b + a)];
                    if (a != 0) {
                        System.arraycopy(this.d, 0, obj, 0, a);
                    }
                    while (a < obj.length - 1) {
                        obj[a] = nyt.j();
                        nyt.a();
                        a++;
                    }
                    obj[a] = nyt.j();
                    this.d = obj;
                    continue;
                case 40:
                    this.g = Integer.valueOf(nyt.f());
                    continue;
                case 48:
                    this.e = Long.valueOf(nyt.e());
                    continue;
                case 56:
                    this.f = Long.valueOf(nyt.e());
                    continue;
                case 64:
                    b = nzl.b(nyt, 64);
                    a = this.h == null ? 0 : this.h.length;
                    obj = new long[(b + a)];
                    if (a != 0) {
                        System.arraycopy(this.h, 0, obj, 0, a);
                    }
                    while (a < obj.length - 1) {
                        obj[a] = nyt.e();
                        nyt.a();
                        a++;
                    }
                    obj[a] = nyt.e();
                    this.h = obj;
                    continue;
                case 66:
                    int d = nyt.d(nyt.r());
                    b = nyt.u();
                    a = 0;
                    while (nyt.s() > 0) {
                        nyt.e();
                        a++;
                    }
                    nyt.f(b);
                    b = this.h == null ? 0 : this.h.length;
                    Object obj2 = new long[(a + b)];
                    if (b != 0) {
                        System.arraycopy(this.h, 0, obj2, 0, b);
                    }
                    while (b < obj2.length) {
                        obj2[b] = nyt.e();
                        b++;
                    }
                    this.h = obj2;
                    nyt.e(d);
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
