package defpackage;

public final class nil extends nyx<nil> {
    private static volatile nil[] g;
    public njv a;
    public nhx b;
    public njb c;
    public nim d;
    public String e;
    public ndv[] f;

    public /* synthetic */ nzf a(nyt nyt) {
        return b(nyt);
    }

    public static nil[] d() {
        if (g == null) {
            synchronized (nzc.c) {
                if (g == null) {
                    g = new nil[0];
                }
            }
        }
        return g;
    }

    public nil() {
        g();
    }

    private nil g() {
        this.a = null;
        this.b = null;
        this.c = null;
        this.d = null;
        this.e = null;
        this.f = ndv.d();
        this.unknownFieldData = null;
        this.cachedSize = -1;
        return this;
    }

    public void a(nyu nyu) {
        if (this.a != null) {
            nyu.b(1, this.a);
        }
        if (this.b != null) {
            nyu.b(2, this.b);
        }
        if (this.d != null) {
            nyu.b(3, this.d);
        }
        if (this.e != null) {
            nyu.a(4, this.e);
        }
        if (this.f != null && this.f.length > 0) {
            for (nzf nzf : this.f) {
                if (nzf != null) {
                    nyu.b(5, nzf);
                }
            }
        }
        if (this.c != null) {
            nyu.b(6, this.c);
        }
        super.a(nyu);
    }

    protected int b() {
        int b = super.b();
        if (this.a != null) {
            b += nyu.d(1, this.a);
        }
        if (this.b != null) {
            b += nyu.d(2, this.b);
        }
        if (this.d != null) {
            b += nyu.d(3, this.d);
        }
        if (this.e != null) {
            b += nyu.b(4, this.e);
        }
        if (this.f != null && this.f.length > 0) {
            int i = b;
            for (nzf nzf : this.f) {
                if (nzf != null) {
                    i += nyu.d(5, nzf);
                }
            }
            b = i;
        }
        if (this.c != null) {
            return b + nyu.d(6, this.c);
        }
        return b;
    }

    private nil b(nyt nyt) {
        while (true) {
            int a = nyt.a();
            switch (a) {
                case 0:
                    break;
                case 10:
                    if (this.a == null) {
                        this.a = new njv();
                    }
                    nyt.a(this.a);
                    continue;
                case wi.dH /*18*/:
                    if (this.b == null) {
                        this.b = new nhx();
                    }
                    nyt.a(this.b);
                    continue;
                case wi.dx /*26*/:
                    if (this.d == null) {
                        this.d = new nim();
                    }
                    nyt.a(this.d);
                    continue;
                case 34:
                    this.e = nyt.j();
                    continue;
                case 42:
                    int b = nzl.b(nyt, 42);
                    if (this.f == null) {
                        a = 0;
                    } else {
                        a = this.f.length;
                    }
                    Object obj = new ndv[(b + a)];
                    if (a != 0) {
                        System.arraycopy(this.f, 0, obj, 0, a);
                    }
                    while (a < obj.length - 1) {
                        obj[a] = new ndv();
                        nyt.a(obj[a]);
                        nyt.a();
                        a++;
                    }
                    obj[a] = new ndv();
                    nyt.a(obj[a]);
                    this.f = obj;
                    continue;
                case 50:
                    if (this.c == null) {
                        this.c = new njb();
                    }
                    nyt.a(this.c);
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
