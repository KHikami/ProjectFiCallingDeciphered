package p000;

public final class ore extends nyx<ore> {
    private static volatile ore[] f33868g;
    public oqu f33869a;
    public osv[] f33870b;
    public String f33871c;
    public String f33872d;
    public Long f33873e;
    public Long f33874f;

    public /* synthetic */ nzf m39300a(nyt nyt) {
        return m39297b(nyt);
    }

    public static ore[] m39298d() {
        if (f33868g == null) {
            synchronized (nzc.f31309c) {
                if (f33868g == null) {
                    f33868g = new ore[0];
                }
            }
        }
        return f33868g;
    }

    public ore() {
        m39299g();
    }

    private ore m39299g() {
        this.f33869a = null;
        this.f33870b = osv.m39628d();
        this.f33871c = null;
        this.f33872d = null;
        this.f33873e = null;
        this.f33874f = null;
        this.unknownFieldData = null;
        this.cachedSize = -1;
        return this;
    }

    public void m39301a(nyu nyu) {
        if (this.f33869a != null) {
            nyu.m37182b(1, this.f33869a);
        }
        if (this.f33870b != null && this.f33870b.length > 0) {
            for (nzf nzf : this.f33870b) {
                if (nzf != null) {
                    nyu.m37182b(2, nzf);
                }
            }
        }
        nyu.m37170a(3, this.f33871c);
        if (this.f33872d != null) {
            nyu.m37170a(4, this.f33872d);
        }
        if (this.f33873e != null) {
            nyu.m37181b(5, this.f33873e.longValue());
        }
        if (this.f33874f != null) {
            nyu.m37181b(6, this.f33874f.longValue());
        }
        super.a(nyu);
    }

    protected int m39302b() {
        int b = super.b();
        if (this.f33869a != null) {
            b += nyu.m37145d(1, this.f33869a);
        }
        if (this.f33870b != null && this.f33870b.length > 0) {
            int i = b;
            for (nzf nzf : this.f33870b) {
                if (nzf != null) {
                    i += nyu.m37145d(2, nzf);
                }
            }
            b = i;
        }
        b += nyu.m37137b(3, this.f33871c);
        if (this.f33872d != null) {
            b += nyu.m37137b(4, this.f33872d);
        }
        if (this.f33873e != null) {
            b += nyu.m37148f(5, this.f33873e.longValue());
        }
        if (this.f33874f != null) {
            return b + nyu.m37148f(6, this.f33874f.longValue());
        }
        return b;
    }

    private ore m39297b(nyt nyt) {
        while (true) {
            int a = nyt.m37099a();
            switch (a) {
                case 0:
                    break;
                case 10:
                    if (this.f33869a == null) {
                        this.f33869a = new oqu();
                    }
                    nyt.m37101a(this.f33869a);
                    continue;
                case wi.dH /*18*/:
                    int b = nzl.m37265b(nyt, 18);
                    if (this.f33870b == null) {
                        a = 0;
                    } else {
                        a = this.f33870b.length;
                    }
                    Object obj = new osv[(b + a)];
                    if (a != 0) {
                        System.arraycopy(this.f33870b, 0, obj, 0, a);
                    }
                    while (a < obj.length - 1) {
                        obj[a] = new osv();
                        nyt.m37101a(obj[a]);
                        nyt.m37099a();
                        a++;
                    }
                    obj[a] = new osv();
                    nyt.m37101a(obj[a]);
                    this.f33870b = obj;
                    continue;
                case wi.dx /*26*/:
                    this.f33871c = nyt.m37117j();
                    continue;
                case 34:
                    this.f33872d = nyt.m37117j();
                    continue;
                case 40:
                    this.f33873e = Long.valueOf(nyt.m37110e());
                    continue;
                case 48:
                    this.f33874f = Long.valueOf(nyt.m37110e());
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
