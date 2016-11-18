package p000;

public final class mxq extends nyx<mxq> {
    public Integer f29066a;
    public mxe[] f29067b;
    public long[] f29068c;
    public boolean[] f29069d;
    public mxf[] f29070e;
    public String f29071f;
    public String f29072g;
    public mxr f29073h;
    public Integer f29074i;
    public Integer f29075j;
    public mze f29076k;

    public /* synthetic */ nzf m33716a(nyt nyt) {
        return m33714b(nyt);
    }

    public mxq() {
        m33715d();
    }

    private mxq m33715d() {
        this.f29066a = null;
        this.f29067b = mxe.d();
        this.f29068c = nzl.f31328b;
        this.f29069d = nzl.f31331e;
        this.f29070e = mxf.d();
        this.f29071f = null;
        this.f29072g = null;
        this.f29073h = null;
        this.f29074i = null;
        this.f29075j = null;
        this.f29076k = null;
        this.unknownFieldData = null;
        this.cachedSize = -1;
        return this;
    }

    public void m33717a(nyu nyu) {
        int i = 0;
        if (this.f29067b != null && this.f29067b.length > 0) {
            for (nzf nzf : this.f29067b) {
                if (nzf != null) {
                    nyu.m37182b(1, nzf);
                }
            }
        }
        if (this.f29071f != null) {
            nyu.m37170a(2, this.f29071f);
        }
        if (this.f29073h != null) {
            nyu.m37182b(3, this.f29073h);
        }
        if (this.f29074i != null) {
            nyu.m37168a(4, this.f29074i.intValue());
        }
        if (this.f29075j != null) {
            nyu.m37168a(5, this.f29075j.intValue());
        }
        if (this.f29066a != null) {
            nyu.m37168a(6, this.f29066a.intValue());
        }
        if (this.f29068c != null && this.f29068c.length > 0) {
            for (long b : this.f29068c) {
                nyu.m37181b(7, b);
            }
        }
        if (this.f29069d != null && this.f29069d.length > 0) {
            for (boolean a : this.f29069d) {
                nyu.m37172a(8, a);
            }
        }
        if (this.f29070e != null && this.f29070e.length > 0) {
            while (i < this.f29070e.length) {
                nzf nzf2 = this.f29070e[i];
                if (nzf2 != null) {
                    nyu.m37182b(9, nzf2);
                }
                i++;
            }
        }
        if (this.f29072g != null) {
            nyu.m37170a(10, this.f29072g);
        }
        if (this.f29076k != null) {
            nyu.m37182b(11, this.f29076k);
        }
        super.a(nyu);
    }

    protected int m33718b() {
        int i;
        int i2 = 0;
        int b = super.b();
        if (this.f29067b != null && this.f29067b.length > 0) {
            i = b;
            for (nzf nzf : this.f29067b) {
                if (nzf != null) {
                    i += nyu.m37145d(1, nzf);
                }
            }
            b = i;
        }
        if (this.f29071f != null) {
            b += nyu.m37137b(2, this.f29071f);
        }
        if (this.f29073h != null) {
            b += nyu.m37145d(3, this.f29073h);
        }
        if (this.f29074i != null) {
            b += nyu.m37147f(4, this.f29074i.intValue());
        }
        if (this.f29075j != null) {
            b += nyu.m37147f(5, this.f29075j.intValue());
        }
        if (this.f29066a != null) {
            b += nyu.m37147f(6, this.f29066a.intValue());
        }
        if (this.f29068c != null && this.f29068c.length > 0) {
            int i3 = 0;
            for (long f : this.f29068c) {
                i3 += nyu.m37149f(f);
            }
            b = (b + i3) + (this.f29068c.length * 1);
        }
        if (this.f29069d != null && this.f29069d.length > 0) {
            b = (b + (this.f29069d.length * 1)) + (this.f29069d.length * 1);
        }
        if (this.f29070e != null && this.f29070e.length > 0) {
            while (i2 < this.f29070e.length) {
                nzf nzf2 = this.f29070e[i2];
                if (nzf2 != null) {
                    b += nyu.m37145d(9, nzf2);
                }
                i2++;
            }
        }
        if (this.f29072g != null) {
            b += nyu.m37137b(10, this.f29072g);
        }
        if (this.f29076k != null) {
            return b + nyu.m37145d(11, this.f29076k);
        }
        return b;
    }

    private mxq m33714b(nyt nyt) {
        while (true) {
            int a = nyt.m37099a();
            int b;
            Object obj;
            int d;
            Object obj2;
            switch (a) {
                case 0:
                    break;
                case 10:
                    b = nzl.m37265b(nyt, 10);
                    if (this.f29067b == null) {
                        a = 0;
                    } else {
                        a = this.f29067b.length;
                    }
                    obj = new mxe[(b + a)];
                    if (a != 0) {
                        System.arraycopy(this.f29067b, 0, obj, 0, a);
                    }
                    while (a < obj.length - 1) {
                        obj[a] = new mxe();
                        nyt.m37101a(obj[a]);
                        nyt.m37099a();
                        a++;
                    }
                    obj[a] = new mxe();
                    nyt.m37101a(obj[a]);
                    this.f29067b = obj;
                    continue;
                case wi.dH /*18*/:
                    this.f29071f = nyt.m37117j();
                    continue;
                case wi.dx /*26*/:
                    if (this.f29073h == null) {
                        this.f29073h = new mxr();
                    }
                    nyt.m37101a(this.f29073h);
                    continue;
                case 32:
                    this.f29074i = Integer.valueOf(nyt.m37112f());
                    continue;
                case 40:
                    this.f29075j = Integer.valueOf(nyt.m37112f());
                    continue;
                case 48:
                    this.f29066a = Integer.valueOf(nyt.m37112f());
                    continue;
                case 56:
                    b = nzl.m37265b(nyt, 56);
                    a = this.f29068c == null ? 0 : this.f29068c.length;
                    obj = new long[(b + a)];
                    if (a != 0) {
                        System.arraycopy(this.f29068c, 0, obj, 0, a);
                    }
                    while (a < obj.length - 1) {
                        obj[a] = nyt.m37110e();
                        nyt.m37099a();
                        a++;
                    }
                    obj[a] = nyt.m37110e();
                    this.f29068c = obj;
                    continue;
                case 58:
                    d = nyt.m37108d(nyt.m37125r());
                    b = nyt.m37128u();
                    a = 0;
                    while (nyt.m37126s() > 0) {
                        nyt.m37110e();
                        a++;
                    }
                    nyt.m37113f(b);
                    b = this.f29068c == null ? 0 : this.f29068c.length;
                    obj2 = new long[(a + b)];
                    if (b != 0) {
                        System.arraycopy(this.f29068c, 0, obj2, 0, b);
                    }
                    while (b < obj2.length) {
                        obj2[b] = nyt.m37110e();
                        b++;
                    }
                    this.f29068c = obj2;
                    nyt.m37111e(d);
                    continue;
                case 64:
                    b = nzl.m37265b(nyt, 64);
                    a = this.f29069d == null ? 0 : this.f29069d.length;
                    obj = new boolean[(b + a)];
                    if (a != 0) {
                        System.arraycopy(this.f29069d, 0, obj, 0, a);
                    }
                    while (a < obj.length - 1) {
                        obj[a] = nyt.m37116i();
                        nyt.m37099a();
                        a++;
                    }
                    obj[a] = nyt.m37116i();
                    this.f29069d = obj;
                    continue;
                case 66:
                    d = nyt.m37108d(nyt.m37125r());
                    b = nyt.m37128u();
                    a = 0;
                    while (nyt.m37126s() > 0) {
                        nyt.m37116i();
                        a++;
                    }
                    nyt.m37113f(b);
                    b = this.f29069d == null ? 0 : this.f29069d.length;
                    obj2 = new boolean[(a + b)];
                    if (b != 0) {
                        System.arraycopy(this.f29069d, 0, obj2, 0, b);
                    }
                    while (b < obj2.length) {
                        obj2[b] = nyt.m37116i();
                        b++;
                    }
                    this.f29069d = obj2;
                    nyt.m37111e(d);
                    continue;
                case 74:
                    b = nzl.m37265b(nyt, 74);
                    if (this.f29070e == null) {
                        a = 0;
                    } else {
                        a = this.f29070e.length;
                    }
                    obj = new mxf[(b + a)];
                    if (a != 0) {
                        System.arraycopy(this.f29070e, 0, obj, 0, a);
                    }
                    while (a < obj.length - 1) {
                        obj[a] = new mxf();
                        nyt.m37101a(obj[a]);
                        nyt.m37099a();
                        a++;
                    }
                    obj[a] = new mxf();
                    nyt.m37101a(obj[a]);
                    this.f29070e = obj;
                    continue;
                case 82:
                    this.f29072g = nyt.m37117j();
                    continue;
                case 90:
                    if (this.f29076k == null) {
                        this.f29076k = new mze();
                    }
                    nyt.m37101a(this.f29076k);
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
