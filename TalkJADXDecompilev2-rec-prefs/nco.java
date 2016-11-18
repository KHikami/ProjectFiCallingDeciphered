package p000;

public final class nco extends nyx<nco> {
    private static volatile nco[] f29511f;
    public int f29512a;
    public ncd f29513b;
    public String f29514c;
    public String f29515d;
    public ncd f29516e;

    public /* synthetic */ nzf m34331a(nyt nyt) {
        return m34329b(nyt);
    }

    public static nco[] m34330d() {
        if (f29511f == null) {
            synchronized (nzc.f31309c) {
                if (f29511f == null) {
                    f29511f = new nco[0];
                }
            }
        }
        return f29511f;
    }

    public nco() {
        this.f29512a = nzf.UNSET_ENUM_VALUE;
        this.f29514c = null;
        this.f29515d = null;
        this.cachedSize = -1;
    }

    public void m34332a(nyu nyu) {
        if (this.f29512a != nzf.UNSET_ENUM_VALUE) {
            nyu.m37168a(1, this.f29512a);
        }
        if (this.f29513b != null) {
            nyu.m37182b(2, this.f29513b);
        }
        if (this.f29514c != null) {
            nyu.m37170a(3, this.f29514c);
        }
        if (this.f29515d != null) {
            nyu.m37170a(4, this.f29515d);
        }
        if (this.f29516e != null) {
            nyu.m37182b(5, this.f29516e);
        }
        super.a(nyu);
    }

    protected int m34333b() {
        int b = super.b();
        if (this.f29512a != nzf.UNSET_ENUM_VALUE) {
            b += nyu.m37147f(1, this.f29512a);
        }
        if (this.f29513b != null) {
            b += nyu.m37145d(2, this.f29513b);
        }
        if (this.f29514c != null) {
            b += nyu.m37137b(3, this.f29514c);
        }
        if (this.f29515d != null) {
            b += nyu.m37137b(4, this.f29515d);
        }
        if (this.f29516e != null) {
            return b + nyu.m37145d(5, this.f29516e);
        }
        return b;
    }

    private nco m34329b(nyt nyt) {
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
                            this.f29512a = a;
                            break;
                        default:
                            continue;
                    }
                case wi.dH /*18*/:
                    if (this.f29513b == null) {
                        this.f29513b = new ncd();
                    }
                    nyt.m37101a(this.f29513b);
                    continue;
                case wi.dx /*26*/:
                    this.f29514c = nyt.m37117j();
                    continue;
                case 34:
                    this.f29515d = nyt.m37117j();
                    continue;
                case 42:
                    if (this.f29516e == null) {
                        this.f29516e = new ncd();
                    }
                    nyt.m37101a(this.f29516e);
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
