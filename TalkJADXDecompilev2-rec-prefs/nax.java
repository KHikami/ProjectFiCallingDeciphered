package p000;

public final class nax extends nyx<nax> {
    private static volatile nax[] f29399e;
    public Integer f29400a;
    public nay f29401b;
    public String f29402c;
    public nar[] f29403d;

    public /* synthetic */ nzf m34126a(nyt nyt) {
        return m34123b(nyt);
    }

    public static nax[] m34124d() {
        if (f29399e == null) {
            synchronized (nzc.f31309c) {
                if (f29399e == null) {
                    f29399e = new nax[0];
                }
            }
        }
        return f29399e;
    }

    public nax() {
        m34125g();
    }

    private nax m34125g() {
        this.f29401b = null;
        this.f29402c = null;
        this.f29403d = nar.m34091d();
        this.unknownFieldData = null;
        this.cachedSize = -1;
        return this;
    }

    public void m34127a(nyu nyu) {
        if (this.f29400a != null) {
            nyu.m37168a(1, this.f29400a.intValue());
        }
        if (this.f29401b != null) {
            nyu.m37182b(2, this.f29401b);
        }
        if (this.f29402c != null) {
            nyu.m37170a(3, this.f29402c);
        }
        if (this.f29403d != null && this.f29403d.length > 0) {
            for (nzf nzf : this.f29403d) {
                if (nzf != null) {
                    nyu.m37182b(4, nzf);
                }
            }
        }
        super.a(nyu);
    }

    protected int m34128b() {
        int b = super.b();
        if (this.f29400a != null) {
            b += nyu.m37147f(1, this.f29400a.intValue());
        }
        if (this.f29401b != null) {
            b += nyu.m37145d(2, this.f29401b);
        }
        if (this.f29402c != null) {
            b += nyu.m37137b(3, this.f29402c);
        }
        if (this.f29403d == null || this.f29403d.length <= 0) {
            return b;
        }
        int i = b;
        for (nzf nzf : this.f29403d) {
            if (nzf != null) {
                i += nyu.m37145d(4, nzf);
            }
        }
        return i;
    }

    private nax m34123b(nyt nyt) {
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
                            this.f29400a = Integer.valueOf(a);
                            break;
                        default:
                            continue;
                    }
                case wi.dH /*18*/:
                    if (this.f29401b == null) {
                        this.f29401b = new nay();
                    }
                    nyt.m37101a(this.f29401b);
                    continue;
                case wi.dx /*26*/:
                    this.f29402c = nyt.m37117j();
                    continue;
                case 34:
                    int b = nzl.m37265b(nyt, 34);
                    if (this.f29403d == null) {
                        a = 0;
                    } else {
                        a = this.f29403d.length;
                    }
                    Object obj = new nar[(b + a)];
                    if (a != 0) {
                        System.arraycopy(this.f29403d, 0, obj, 0, a);
                    }
                    while (a < obj.length - 1) {
                        obj[a] = new nar();
                        nyt.m37101a(obj[a]);
                        nyt.m37099a();
                        a++;
                    }
                    obj[a] = new nar();
                    nyt.m37101a(obj[a]);
                    this.f29403d = obj;
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
