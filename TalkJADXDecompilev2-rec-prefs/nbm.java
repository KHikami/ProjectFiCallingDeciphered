package p000;

public final class nbm extends nyx<nbm> {
    private static volatile nbm[] f29438e;
    public int f29439a;
    public nbn f29440b;
    public String f29441c;
    public nbg[] f29442d;

    public /* synthetic */ nzf m34197a(nyt nyt) {
        return m34195b(nyt);
    }

    public static nbm[] m34196d() {
        if (f29438e == null) {
            synchronized (nzc.f31309c) {
                if (f29438e == null) {
                    f29438e = new nbm[0];
                }
            }
        }
        return f29438e;
    }

    public nbm() {
        this.f29439a = nzf.UNSET_ENUM_VALUE;
        this.f29441c = null;
        this.f29442d = nbg.m34169d();
        this.cachedSize = -1;
    }

    public void m34198a(nyu nyu) {
        if (this.f29439a != nzf.UNSET_ENUM_VALUE) {
            nyu.m37168a(1, this.f29439a);
        }
        if (this.f29440b != null) {
            nyu.m37182b(2, this.f29440b);
        }
        if (this.f29441c != null) {
            nyu.m37170a(3, this.f29441c);
        }
        if (this.f29442d != null && this.f29442d.length > 0) {
            for (nzf nzf : this.f29442d) {
                if (nzf != null) {
                    nyu.m37182b(4, nzf);
                }
            }
        }
        super.a(nyu);
    }

    protected int m34199b() {
        int b = super.b();
        if (this.f29439a != nzf.UNSET_ENUM_VALUE) {
            b += nyu.m37147f(1, this.f29439a);
        }
        if (this.f29440b != null) {
            b += nyu.m37145d(2, this.f29440b);
        }
        if (this.f29441c != null) {
            b += nyu.m37137b(3, this.f29441c);
        }
        if (this.f29442d == null || this.f29442d.length <= 0) {
            return b;
        }
        int i = b;
        for (nzf nzf : this.f29442d) {
            if (nzf != null) {
                i += nyu.m37145d(4, nzf);
            }
        }
        return i;
    }

    private nbm m34195b(nyt nyt) {
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
                        case 2:
                        case 3:
                        case 4:
                        case 5:
                        case 6:
                        case 7:
                        case 8:
                            this.f29439a = a;
                            break;
                        default:
                            continue;
                    }
                case wi.dH /*18*/:
                    if (this.f29440b == null) {
                        this.f29440b = new nbn();
                    }
                    nyt.m37101a(this.f29440b);
                    continue;
                case wi.dx /*26*/:
                    this.f29441c = nyt.m37117j();
                    continue;
                case 34:
                    int b = nzl.m37265b(nyt, 34);
                    if (this.f29442d == null) {
                        a = 0;
                    } else {
                        a = this.f29442d.length;
                    }
                    Object obj = new nbg[(b + a)];
                    if (a != 0) {
                        System.arraycopy(this.f29442d, 0, obj, 0, a);
                    }
                    while (a < obj.length - 1) {
                        obj[a] = new nbg();
                        nyt.m37101a(obj[a]);
                        nyt.m37099a();
                        a++;
                    }
                    obj[a] = new nbg();
                    nyt.m37101a(obj[a]);
                    this.f29442d = obj;
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
