package p000;

public final class nfu extends nyx<nfu> {
    private static volatile nfu[] f29730e;
    public Integer f29731a;
    public nfs[] f29732b;
    public Integer f29733c;
    public String f29734d;

    public /* synthetic */ nzf m34741a(nyt nyt) {
        return m34738b(nyt);
    }

    public static nfu[] m34739d() {
        if (f29730e == null) {
            synchronized (nzc.f31309c) {
                if (f29730e == null) {
                    f29730e = new nfu[0];
                }
            }
        }
        return f29730e;
    }

    public nfu() {
        m34740g();
    }

    private nfu m34740g() {
        this.f29732b = nfs.m34728d();
        this.f29733c = null;
        this.f29734d = null;
        this.unknownFieldData = null;
        this.cachedSize = -1;
        return this;
    }

    public void m34742a(nyu nyu) {
        if (this.f29731a != null) {
            nyu.m37168a(1, this.f29731a.intValue());
        }
        if (this.f29732b != null && this.f29732b.length > 0) {
            for (nzf nzf : this.f29732b) {
                if (nzf != null) {
                    nyu.m37182b(2, nzf);
                }
            }
        }
        if (this.f29734d != null) {
            nyu.m37170a(3, this.f29734d);
        }
        if (this.f29733c != null) {
            nyu.m37168a(4, this.f29733c.intValue());
        }
        super.a(nyu);
    }

    protected int m34743b() {
        int b = super.b();
        if (this.f29731a != null) {
            b += nyu.m37147f(1, this.f29731a.intValue());
        }
        if (this.f29732b != null && this.f29732b.length > 0) {
            int i = b;
            for (nzf nzf : this.f29732b) {
                if (nzf != null) {
                    i += nyu.m37145d(2, nzf);
                }
            }
            b = i;
        }
        if (this.f29734d != null) {
            b += nyu.m37137b(3, this.f29734d);
        }
        if (this.f29733c != null) {
            return b + nyu.m37147f(4, this.f29733c.intValue());
        }
        return b;
    }

    private nfu m34738b(nyt nyt) {
        while (true) {
            int a = nyt.m37099a();
            switch (a) {
                case 0:
                    break;
                case 8:
                    a = nyt.m37112f();
                    switch (a) {
                        case 0:
                        case 1:
                            this.f29731a = Integer.valueOf(a);
                            break;
                        default:
                            continue;
                    }
                case wi.dH /*18*/:
                    int b = nzl.m37265b(nyt, 18);
                    if (this.f29732b == null) {
                        a = 0;
                    } else {
                        a = this.f29732b.length;
                    }
                    Object obj = new nfs[(b + a)];
                    if (a != 0) {
                        System.arraycopy(this.f29732b, 0, obj, 0, a);
                    }
                    while (a < obj.length - 1) {
                        obj[a] = new nfs();
                        nyt.m37101a(obj[a]);
                        nyt.m37099a();
                        a++;
                    }
                    obj[a] = new nfs();
                    nyt.m37101a(obj[a]);
                    this.f29732b = obj;
                    continue;
                case wi.dx /*26*/:
                    this.f29734d = nyt.m37117j();
                    continue;
                case 32:
                    this.f29733c = Integer.valueOf(nyt.m37112f());
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
