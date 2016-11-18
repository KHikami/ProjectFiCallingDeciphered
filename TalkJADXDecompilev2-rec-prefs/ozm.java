package p000;

public final class ozm extends nyx<ozm> {
    public oya[] f34691a;
    public oya[] f34692b;
    public boolean[] f34693c;

    public /* synthetic */ nzf m40033a(nyt nyt) {
        return m40031b(nyt);
    }

    public ozm() {
        m40032d();
    }

    private ozm m40032d() {
        this.f34691a = oya.m39861d();
        this.f34692b = oya.m39861d();
        this.f34693c = nzl.f31331e;
        this.unknownFieldData = null;
        this.cachedSize = -1;
        return this;
    }

    public void m40034a(nyu nyu) {
        int i = 0;
        if (this.f34691a != null && this.f34691a.length > 0) {
            for (nzf nzf : this.f34691a) {
                if (nzf != null) {
                    nyu.m37182b(1, nzf);
                }
            }
        }
        if (this.f34692b != null && this.f34692b.length > 0) {
            for (nzf nzf2 : this.f34692b) {
                if (nzf2 != null) {
                    nyu.m37182b(2, nzf2);
                }
            }
        }
        if (this.f34693c != null && this.f34693c.length > 0) {
            while (i < this.f34693c.length) {
                nyu.m37172a(3, this.f34693c[i]);
                i++;
            }
        }
        super.a(nyu);
    }

    protected int m40035b() {
        int i = 0;
        int b = super.b();
        if (this.f34691a != null && this.f34691a.length > 0) {
            int i2 = b;
            for (nzf nzf : this.f34691a) {
                if (nzf != null) {
                    i2 += nyu.m37145d(1, nzf);
                }
            }
            b = i2;
        }
        if (this.f34692b != null && this.f34692b.length > 0) {
            while (i < this.f34692b.length) {
                nzf nzf2 = this.f34692b[i];
                if (nzf2 != null) {
                    b += nyu.m37145d(2, nzf2);
                }
                i++;
            }
        }
        if (this.f34693c == null || this.f34693c.length <= 0) {
            return b;
        }
        return (b + (this.f34693c.length * 1)) + (this.f34693c.length * 1);
    }

    private ozm m40031b(nyt nyt) {
        while (true) {
            int a = nyt.m37099a();
            int b;
            Object obj;
            switch (a) {
                case 0:
                    break;
                case 10:
                    b = nzl.m37265b(nyt, 10);
                    if (this.f34691a == null) {
                        a = 0;
                    } else {
                        a = this.f34691a.length;
                    }
                    obj = new oya[(b + a)];
                    if (a != 0) {
                        System.arraycopy(this.f34691a, 0, obj, 0, a);
                    }
                    while (a < obj.length - 1) {
                        obj[a] = new oya();
                        nyt.m37101a(obj[a]);
                        nyt.m37099a();
                        a++;
                    }
                    obj[a] = new oya();
                    nyt.m37101a(obj[a]);
                    this.f34691a = obj;
                    continue;
                case wi.dH /*18*/:
                    b = nzl.m37265b(nyt, 18);
                    if (this.f34692b == null) {
                        a = 0;
                    } else {
                        a = this.f34692b.length;
                    }
                    obj = new oya[(b + a)];
                    if (a != 0) {
                        System.arraycopy(this.f34692b, 0, obj, 0, a);
                    }
                    while (a < obj.length - 1) {
                        obj[a] = new oya();
                        nyt.m37101a(obj[a]);
                        nyt.m37099a();
                        a++;
                    }
                    obj[a] = new oya();
                    nyt.m37101a(obj[a]);
                    this.f34692b = obj;
                    continue;
                case wi.dA /*24*/:
                    b = nzl.m37265b(nyt, 24);
                    a = this.f34693c == null ? 0 : this.f34693c.length;
                    obj = new boolean[(b + a)];
                    if (a != 0) {
                        System.arraycopy(this.f34693c, 0, obj, 0, a);
                    }
                    while (a < obj.length - 1) {
                        obj[a] = nyt.m37116i();
                        nyt.m37099a();
                        a++;
                    }
                    obj[a] = nyt.m37116i();
                    this.f34693c = obj;
                    continue;
                case wi.dx /*26*/:
                    int d = nyt.m37108d(nyt.m37125r());
                    b = nyt.m37128u();
                    a = 0;
                    while (nyt.m37126s() > 0) {
                        nyt.m37116i();
                        a++;
                    }
                    nyt.m37113f(b);
                    b = this.f34693c == null ? 0 : this.f34693c.length;
                    Object obj2 = new boolean[(a + b)];
                    if (b != 0) {
                        System.arraycopy(this.f34693c, 0, obj2, 0, b);
                    }
                    while (b < obj2.length) {
                        obj2[b] = nyt.m37116i();
                        b++;
                    }
                    this.f34693c = obj2;
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
