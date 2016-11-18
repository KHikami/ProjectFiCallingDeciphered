package p000;

public final class nil extends nyx<nil> {
    private static volatile nil[] f29888g;
    public njv f29889a;
    public nhx f29890b;
    public njb f29891c;
    public nim f29892d;
    public String f29893e;
    public ndv[] f29894f;

    public /* synthetic */ nzf m35106a(nyt nyt) {
        return m35103b(nyt);
    }

    public static nil[] m35104d() {
        if (f29888g == null) {
            synchronized (nzc.f31309c) {
                if (f29888g == null) {
                    f29888g = new nil[0];
                }
            }
        }
        return f29888g;
    }

    public nil() {
        m35105g();
    }

    private nil m35105g() {
        this.f29889a = null;
        this.f29890b = null;
        this.f29891c = null;
        this.f29892d = null;
        this.f29893e = null;
        this.f29894f = ndv.m34477d();
        this.unknownFieldData = null;
        this.cachedSize = -1;
        return this;
    }

    public void m35107a(nyu nyu) {
        if (this.f29889a != null) {
            nyu.m37182b(1, this.f29889a);
        }
        if (this.f29890b != null) {
            nyu.m37182b(2, this.f29890b);
        }
        if (this.f29892d != null) {
            nyu.m37182b(3, this.f29892d);
        }
        if (this.f29893e != null) {
            nyu.m37170a(4, this.f29893e);
        }
        if (this.f29894f != null && this.f29894f.length > 0) {
            for (nzf nzf : this.f29894f) {
                if (nzf != null) {
                    nyu.m37182b(5, nzf);
                }
            }
        }
        if (this.f29891c != null) {
            nyu.m37182b(6, this.f29891c);
        }
        super.a(nyu);
    }

    protected int m35108b() {
        int b = super.b();
        if (this.f29889a != null) {
            b += nyu.m37145d(1, this.f29889a);
        }
        if (this.f29890b != null) {
            b += nyu.m37145d(2, this.f29890b);
        }
        if (this.f29892d != null) {
            b += nyu.m37145d(3, this.f29892d);
        }
        if (this.f29893e != null) {
            b += nyu.m37137b(4, this.f29893e);
        }
        if (this.f29894f != null && this.f29894f.length > 0) {
            int i = b;
            for (nzf nzf : this.f29894f) {
                if (nzf != null) {
                    i += nyu.m37145d(5, nzf);
                }
            }
            b = i;
        }
        if (this.f29891c != null) {
            return b + nyu.m37145d(6, this.f29891c);
        }
        return b;
    }

    private nil m35103b(nyt nyt) {
        while (true) {
            int a = nyt.m37099a();
            switch (a) {
                case 0:
                    break;
                case 10:
                    if (this.f29889a == null) {
                        this.f29889a = new njv();
                    }
                    nyt.m37101a(this.f29889a);
                    continue;
                case wi.dH /*18*/:
                    if (this.f29890b == null) {
                        this.f29890b = new nhx();
                    }
                    nyt.m37101a(this.f29890b);
                    continue;
                case wi.dx /*26*/:
                    if (this.f29892d == null) {
                        this.f29892d = new nim();
                    }
                    nyt.m37101a(this.f29892d);
                    continue;
                case 34:
                    this.f29893e = nyt.m37117j();
                    continue;
                case 42:
                    int b = nzl.m37265b(nyt, 42);
                    if (this.f29894f == null) {
                        a = 0;
                    } else {
                        a = this.f29894f.length;
                    }
                    Object obj = new ndv[(b + a)];
                    if (a != 0) {
                        System.arraycopy(this.f29894f, 0, obj, 0, a);
                    }
                    while (a < obj.length - 1) {
                        obj[a] = new ndv();
                        nyt.m37101a(obj[a]);
                        nyt.m37099a();
                        a++;
                    }
                    obj[a] = new ndv();
                    nyt.m37101a(obj[a]);
                    this.f29894f = obj;
                    continue;
                case 50:
                    if (this.f29891c == null) {
                        this.f29891c = new njb();
                    }
                    nyt.m37101a(this.f29891c);
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
