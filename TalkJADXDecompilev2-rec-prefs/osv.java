package p000;

public final class osv extends nyx<osv> {
    private static volatile osv[] f34190f;
    public String[] f34191a;
    public String f34192b;
    public osu[] f34193c;
    public Boolean f34194d;
    public Boolean f34195e;

    public /* synthetic */ nzf m39630a(nyt nyt) {
        return m39627b(nyt);
    }

    public static osv[] m39628d() {
        if (f34190f == null) {
            synchronized (nzc.f31309c) {
                if (f34190f == null) {
                    f34190f = new osv[0];
                }
            }
        }
        return f34190f;
    }

    public osv() {
        m39629g();
    }

    private osv m39629g() {
        this.f34191a = nzl.f31332f;
        this.f34192b = null;
        this.f34193c = osu.m39622d();
        this.f34194d = null;
        this.f34195e = null;
        this.unknownFieldData = null;
        this.cachedSize = -1;
        return this;
    }

    public void m39631a(nyu nyu) {
        int i = 0;
        if (this.f34191a != null && this.f34191a.length > 0) {
            for (String str : this.f34191a) {
                if (str != null) {
                    nyu.m37170a(1, str);
                }
            }
        }
        if (this.f34192b != null) {
            nyu.m37170a(2, this.f34192b);
        }
        if (this.f34193c != null && this.f34193c.length > 0) {
            while (i < this.f34193c.length) {
                nzf nzf = this.f34193c[i];
                if (nzf != null) {
                    nyu.m37182b(3, nzf);
                }
                i++;
            }
        }
        if (this.f34194d != null) {
            nyu.m37172a(4, this.f34194d.booleanValue());
        }
        if (this.f34195e != null) {
            nyu.m37172a(5, this.f34195e.booleanValue());
        }
        super.a(nyu);
    }

    protected int m39632b() {
        int i;
        int i2 = 0;
        int b = super.b();
        if (this.f34191a == null || this.f34191a.length <= 0) {
            i = b;
        } else {
            int i3 = 0;
            int i4 = 0;
            for (String str : this.f34191a) {
                if (str != null) {
                    i4++;
                    i3 += nyu.m37140b(str);
                }
            }
            i = (b + i3) + (i4 * 1);
        }
        if (this.f34192b != null) {
            i += nyu.m37137b(2, this.f34192b);
        }
        if (this.f34193c != null && this.f34193c.length > 0) {
            while (i2 < this.f34193c.length) {
                nzf nzf = this.f34193c[i2];
                if (nzf != null) {
                    i += nyu.m37145d(3, nzf);
                }
                i2++;
            }
        }
        if (this.f34194d != null) {
            this.f34194d.booleanValue();
            i += nyu.m37154h(4) + 1;
        }
        if (this.f34195e == null) {
            return i;
        }
        this.f34195e.booleanValue();
        return i + (nyu.m37154h(5) + 1);
    }

    private osv m39627b(nyt nyt) {
        while (true) {
            int a = nyt.m37099a();
            int b;
            Object obj;
            switch (a) {
                case 0:
                    break;
                case 10:
                    b = nzl.m37265b(nyt, 10);
                    a = this.f34191a == null ? 0 : this.f34191a.length;
                    obj = new String[(b + a)];
                    if (a != 0) {
                        System.arraycopy(this.f34191a, 0, obj, 0, a);
                    }
                    while (a < obj.length - 1) {
                        obj[a] = nyt.m37117j();
                        nyt.m37099a();
                        a++;
                    }
                    obj[a] = nyt.m37117j();
                    this.f34191a = obj;
                    continue;
                case wi.dH /*18*/:
                    this.f34192b = nyt.m37117j();
                    continue;
                case wi.dx /*26*/:
                    b = nzl.m37265b(nyt, 26);
                    if (this.f34193c == null) {
                        a = 0;
                    } else {
                        a = this.f34193c.length;
                    }
                    obj = new osu[(b + a)];
                    if (a != 0) {
                        System.arraycopy(this.f34193c, 0, obj, 0, a);
                    }
                    while (a < obj.length - 1) {
                        obj[a] = new osu();
                        nyt.m37101a(obj[a]);
                        nyt.m37099a();
                        a++;
                    }
                    obj[a] = new osu();
                    nyt.m37101a(obj[a]);
                    this.f34193c = obj;
                    continue;
                case 32:
                    this.f34194d = Boolean.valueOf(nyt.m37116i());
                    continue;
                case 40:
                    this.f34195e = Boolean.valueOf(nyt.m37116i());
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
