package defpackage;

public final class ore extends nyx<ore> {
    private static volatile ore[] g;
    public oqu a;
    public osv[] b;
    public String c;
    public String d;
    public Long e;
    public Long f;

    public /* synthetic */ nzf a(nyt nyt) {
        return b(nyt);
    }

    public static ore[] d() {
        if (g == null) {
            synchronized (nzc.c) {
                if (g == null) {
                    g = new ore[0];
                }
            }
        }
        return g;
    }

    public ore() {
        g();
    }

    private ore g() {
        this.a = null;
        this.b = osv.d();
        this.c = null;
        this.d = null;
        this.e = null;
        this.f = null;
        this.unknownFieldData = null;
        this.cachedSize = -1;
        return this;
    }

    public void a(nyu nyu) {
        if (this.a != null) {
            nyu.b(1, this.a);
        }
        if (this.b != null && this.b.length > 0) {
            for (nzf nzf : this.b) {
                if (nzf != null) {
                    nyu.b(2, nzf);
                }
            }
        }
        nyu.a(3, this.c);
        if (this.d != null) {
            nyu.a(4, this.d);
        }
        if (this.e != null) {
            nyu.b(5, this.e.longValue());
        }
        if (this.f != null) {
            nyu.b(6, this.f.longValue());
        }
        super.a(nyu);
    }

    protected int b() {
        int b = super.b();
        if (this.a != null) {
            b += nyu.d(1, this.a);
        }
        if (this.b != null && this.b.length > 0) {
            int i = b;
            for (nzf nzf : this.b) {
                if (nzf != null) {
                    i += nyu.d(2, nzf);
                }
            }
            b = i;
        }
        b += nyu.b(3, this.c);
        if (this.d != null) {
            b += nyu.b(4, this.d);
        }
        if (this.e != null) {
            b += nyu.f(5, this.e.longValue());
        }
        if (this.f != null) {
            return b + nyu.f(6, this.f.longValue());
        }
        return b;
    }

    private ore b(nyt nyt) {
        while (true) {
            int a = nyt.a();
            switch (a) {
                case 0:
                    break;
                case 10:
                    if (this.a == null) {
                        this.a = new oqu();
                    }
                    nyt.a(this.a);
                    continue;
                case wi.dH /*18*/:
                    int b = nzl.b(nyt, 18);
                    if (this.b == null) {
                        a = 0;
                    } else {
                        a = this.b.length;
                    }
                    Object obj = new osv[(b + a)];
                    if (a != 0) {
                        System.arraycopy(this.b, 0, obj, 0, a);
                    }
                    while (a < obj.length - 1) {
                        obj[a] = new osv();
                        nyt.a(obj[a]);
                        nyt.a();
                        a++;
                    }
                    obj[a] = new osv();
                    nyt.a(obj[a]);
                    this.b = obj;
                    continue;
                case wi.dx /*26*/:
                    this.c = nyt.j();
                    continue;
                case 34:
                    this.d = nyt.j();
                    continue;
                case 40:
                    this.e = Long.valueOf(nyt.e());
                    continue;
                case 48:
                    this.f = Long.valueOf(nyt.e());
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
