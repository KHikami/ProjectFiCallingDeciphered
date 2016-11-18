package p000;

public final class nuc extends nyx<nuc> {
    private static volatile nuc[] f30813f;
    public Integer f30814a;
    public nhx f30815b;
    public String f30816c;
    public String f30817d;
    public nhx f30818e;

    public /* synthetic */ nzf m36564a(nyt nyt) {
        return m36561b(nyt);
    }

    public static nuc[] m36562d() {
        if (f30813f == null) {
            synchronized (nzc.f31309c) {
                if (f30813f == null) {
                    f30813f = new nuc[0];
                }
            }
        }
        return f30813f;
    }

    public nuc() {
        m36563g();
    }

    private nuc m36563g() {
        this.f30815b = null;
        this.f30816c = null;
        this.f30817d = null;
        this.f30818e = null;
        this.unknownFieldData = null;
        this.cachedSize = -1;
        return this;
    }

    public void m36565a(nyu nyu) {
        if (this.f30814a != null) {
            nyu.m37168a(1, this.f30814a.intValue());
        }
        if (this.f30815b != null) {
            nyu.m37182b(2, this.f30815b);
        }
        if (this.f30816c != null) {
            nyu.m37170a(3, this.f30816c);
        }
        if (this.f30817d != null) {
            nyu.m37170a(4, this.f30817d);
        }
        if (this.f30818e != null) {
            nyu.m37182b(5, this.f30818e);
        }
        super.a(nyu);
    }

    protected int m36566b() {
        int b = super.b();
        if (this.f30814a != null) {
            b += nyu.m37147f(1, this.f30814a.intValue());
        }
        if (this.f30815b != null) {
            b += nyu.m37145d(2, this.f30815b);
        }
        if (this.f30816c != null) {
            b += nyu.m37137b(3, this.f30816c);
        }
        if (this.f30817d != null) {
            b += nyu.m37137b(4, this.f30817d);
        }
        if (this.f30818e != null) {
            return b + nyu.m37145d(5, this.f30818e);
        }
        return b;
    }

    private nuc m36561b(nyt nyt) {
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
                            this.f30814a = Integer.valueOf(a);
                            break;
                        default:
                            continue;
                    }
                case wi.dH /*18*/:
                    if (this.f30815b == null) {
                        this.f30815b = new nhx();
                    }
                    nyt.m37101a(this.f30815b);
                    continue;
                case wi.dx /*26*/:
                    this.f30816c = nyt.m37117j();
                    continue;
                case 34:
                    this.f30817d = nyt.m37117j();
                    continue;
                case 42:
                    if (this.f30818e == null) {
                        this.f30818e = new nhx();
                    }
                    nyt.m37101a(this.f30818e);
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
