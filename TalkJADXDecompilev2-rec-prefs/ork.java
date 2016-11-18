package p000;

public final class ork extends nyx<ork> {
    public mun f34023a;
    public String f34024b;
    public orl[] f34025c;
    public orl f34026d;
    public oqu f34027e;
    public Integer f34028f;

    public /* synthetic */ nzf m39434a(nyt nyt) {
        return m39432b(nyt);
    }

    public ork() {
        m39433d();
    }

    private ork m39433d() {
        this.f34023a = null;
        this.f34024b = null;
        this.f34025c = orl.m39438d();
        this.f34026d = null;
        this.f34027e = null;
        this.unknownFieldData = null;
        this.cachedSize = -1;
        return this;
    }

    public void m39435a(nyu nyu) {
        if (this.f34023a != null) {
            nyu.m37182b(1, this.f34023a);
        }
        if (this.f34024b != null) {
            nyu.m37170a(2, this.f34024b);
        }
        if (this.f34025c != null && this.f34025c.length > 0) {
            for (nzf nzf : this.f34025c) {
                if (nzf != null) {
                    nyu.m37182b(3, nzf);
                }
            }
        }
        if (this.f34026d != null) {
            nyu.m37182b(4, this.f34026d);
        }
        if (this.f34027e != null) {
            nyu.m37182b(5, this.f34027e);
        }
        if (this.f34028f != null) {
            nyu.m37168a(6, this.f34028f.intValue());
        }
        super.a(nyu);
    }

    protected int m39436b() {
        int b = super.b();
        if (this.f34023a != null) {
            b += nyu.m37145d(1, this.f34023a);
        }
        if (this.f34024b != null) {
            b += nyu.m37137b(2, this.f34024b);
        }
        if (this.f34025c != null && this.f34025c.length > 0) {
            int i = b;
            for (nzf nzf : this.f34025c) {
                if (nzf != null) {
                    i += nyu.m37145d(3, nzf);
                }
            }
            b = i;
        }
        if (this.f34026d != null) {
            b += nyu.m37145d(4, this.f34026d);
        }
        if (this.f34027e != null) {
            b += nyu.m37145d(5, this.f34027e);
        }
        if (this.f34028f != null) {
            return b + nyu.m37147f(6, this.f34028f.intValue());
        }
        return b;
    }

    private ork m39432b(nyt nyt) {
        while (true) {
            int a = nyt.m37099a();
            switch (a) {
                case 0:
                    break;
                case 10:
                    if (this.f34023a == null) {
                        this.f34023a = new mun();
                    }
                    nyt.m37101a(this.f34023a);
                    continue;
                case wi.dH /*18*/:
                    this.f34024b = nyt.m37117j();
                    continue;
                case wi.dx /*26*/:
                    int b = nzl.m37265b(nyt, 26);
                    if (this.f34025c == null) {
                        a = 0;
                    } else {
                        a = this.f34025c.length;
                    }
                    Object obj = new orl[(b + a)];
                    if (a != 0) {
                        System.arraycopy(this.f34025c, 0, obj, 0, a);
                    }
                    while (a < obj.length - 1) {
                        obj[a] = new orl();
                        nyt.m37101a(obj[a]);
                        nyt.m37099a();
                        a++;
                    }
                    obj[a] = new orl();
                    nyt.m37101a(obj[a]);
                    this.f34025c = obj;
                    continue;
                case 34:
                    if (this.f34026d == null) {
                        this.f34026d = new orl();
                    }
                    nyt.m37101a(this.f34026d);
                    continue;
                case 42:
                    if (this.f34027e == null) {
                        this.f34027e = new oqu();
                    }
                    nyt.m37101a(this.f34027e);
                    continue;
                case 48:
                    a = nyt.m37112f();
                    switch (a) {
                        case 0:
                        case 1:
                        case 2:
                            this.f34028f = Integer.valueOf(a);
                            break;
                        default:
                            continue;
                    }
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
