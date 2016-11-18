package p000;

public final class nhv extends nyx<nhv> {
    private static volatile nhv[] f29850c;
    public Integer f29851a;
    public String f29852b;

    public /* synthetic */ nzf m35019a(nyt nyt) {
        return m35016b(nyt);
    }

    public static nhv[] m35017d() {
        if (f29850c == null) {
            synchronized (nzc.f31309c) {
                if (f29850c == null) {
                    f29850c = new nhv[0];
                }
            }
        }
        return f29850c;
    }

    public nhv() {
        m35018g();
    }

    private nhv m35018g() {
        this.f29852b = null;
        this.unknownFieldData = null;
        this.cachedSize = -1;
        return this;
    }

    public void m35020a(nyu nyu) {
        if (this.f29851a != null) {
            nyu.m37168a(1, this.f29851a.intValue());
        }
        if (this.f29852b != null) {
            nyu.m37170a(2, this.f29852b);
        }
        super.a(nyu);
    }

    protected int m35021b() {
        int b = super.b();
        if (this.f29851a != null) {
            b += nyu.m37147f(1, this.f29851a.intValue());
        }
        if (this.f29852b != null) {
            return b + nyu.m37137b(2, this.f29852b);
        }
        return b;
    }

    private nhv m35016b(nyt nyt) {
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
                            this.f29851a = Integer.valueOf(a);
                            break;
                        default:
                            continue;
                    }
                case wi.dH /*18*/:
                    this.f29852b = nyt.m37117j();
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
