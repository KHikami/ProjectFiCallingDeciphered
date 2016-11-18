package p000;

public final class ncc extends nyx<ncc> {
    private static volatile ncc[] f29485c;
    public int f29486a;
    public String f29487b;

    public /* synthetic */ nzf m34280a(nyt nyt) {
        return m34278b(nyt);
    }

    public static ncc[] m34279d() {
        if (f29485c == null) {
            synchronized (nzc.f31309c) {
                if (f29485c == null) {
                    f29485c = new ncc[0];
                }
            }
        }
        return f29485c;
    }

    public ncc() {
        this.f29486a = nzf.UNSET_ENUM_VALUE;
        this.f29487b = null;
        this.cachedSize = -1;
    }

    public void m34281a(nyu nyu) {
        if (this.f29486a != nzf.UNSET_ENUM_VALUE) {
            nyu.m37168a(1, this.f29486a);
        }
        if (this.f29487b != null) {
            nyu.m37170a(2, this.f29487b);
        }
        super.a(nyu);
    }

    protected int m34282b() {
        int b = super.b();
        if (this.f29486a != nzf.UNSET_ENUM_VALUE) {
            b += nyu.m37147f(1, this.f29486a);
        }
        if (this.f29487b != null) {
            return b + nyu.m37137b(2, this.f29487b);
        }
        return b;
    }

    private ncc m34278b(nyt nyt) {
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
                            this.f29486a = a;
                            break;
                        default:
                            continue;
                    }
                case wi.dH /*18*/:
                    this.f29487b = nyt.m37117j();
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
