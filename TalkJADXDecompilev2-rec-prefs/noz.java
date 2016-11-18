package p000;

public final class noz extends nyx<noz> {
    private static volatile noz[] f30411g;
    public npg f30412a;
    public ncd f30413b;
    public nse f30414c;
    public npc f30415d;
    public String f30416e;
    public npa[] f30417f;

    public /* synthetic */ nzf m35976a(nyt nyt) {
        return m35974b(nyt);
    }

    public static noz[] m35975d() {
        if (f30411g == null) {
            synchronized (nzc.f31309c) {
                if (f30411g == null) {
                    f30411g = new noz[0];
                }
            }
        }
        return f30411g;
    }

    public noz() {
        this.f30416e = null;
        this.f30417f = npa.m35995d();
        this.cachedSize = -1;
    }

    public void m35977a(nyu nyu) {
        if (this.f30412a != null) {
            nyu.m37182b(1, this.f30412a);
        }
        if (this.f30413b != null) {
            nyu.m37182b(2, this.f30413b);
        }
        if (this.f30415d != null) {
            nyu.m37182b(3, this.f30415d);
        }
        if (this.f30416e != null) {
            nyu.m37170a(4, this.f30416e);
        }
        if (this.f30417f != null && this.f30417f.length > 0) {
            for (nzf nzf : this.f30417f) {
                if (nzf != null) {
                    nyu.m37182b(5, nzf);
                }
            }
        }
        if (this.f30414c != null) {
            nyu.m37182b(6, this.f30414c);
        }
        super.a(nyu);
    }

    protected int m35978b() {
        int b = super.b();
        if (this.f30412a != null) {
            b += nyu.m37145d(1, this.f30412a);
        }
        if (this.f30413b != null) {
            b += nyu.m37145d(2, this.f30413b);
        }
        if (this.f30415d != null) {
            b += nyu.m37145d(3, this.f30415d);
        }
        if (this.f30416e != null) {
            b += nyu.m37137b(4, this.f30416e);
        }
        if (this.f30417f != null && this.f30417f.length > 0) {
            int i = b;
            for (nzf nzf : this.f30417f) {
                if (nzf != null) {
                    i += nyu.m37145d(5, nzf);
                }
            }
            b = i;
        }
        if (this.f30414c != null) {
            return b + nyu.m37145d(6, this.f30414c);
        }
        return b;
    }

    private noz m35974b(nyt nyt) {
        while (true) {
            int a = nyt.m37099a();
            switch (a) {
                case 0:
                    break;
                case 10:
                    if (this.f30412a == null) {
                        this.f30412a = new npg();
                    }
                    nyt.m37101a(this.f30412a);
                    continue;
                case wi.dH /*18*/:
                    if (this.f30413b == null) {
                        this.f30413b = new ncd();
                    }
                    nyt.m37101a(this.f30413b);
                    continue;
                case wi.dx /*26*/:
                    if (this.f30415d == null) {
                        this.f30415d = new npc();
                    }
                    nyt.m37101a(this.f30415d);
                    continue;
                case 34:
                    this.f30416e = nyt.m37117j();
                    continue;
                case 42:
                    int b = nzl.m37265b(nyt, 42);
                    if (this.f30417f == null) {
                        a = 0;
                    } else {
                        a = this.f30417f.length;
                    }
                    Object obj = new npa[(b + a)];
                    if (a != 0) {
                        System.arraycopy(this.f30417f, 0, obj, 0, a);
                    }
                    while (a < obj.length - 1) {
                        obj[a] = new npa();
                        nyt.m37101a(obj[a]);
                        nyt.m37099a();
                        a++;
                    }
                    obj[a] = new npa();
                    nyt.m37101a(obj[a]);
                    this.f30417f = obj;
                    continue;
                case 50:
                    if (this.f30414c == null) {
                        this.f30414c = new nse();
                    }
                    nyt.m37101a(this.f30414c);
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
