package p000;

public final class ocy extends nyx<ocy> {
    public int f32339a;
    public String f32340b;

    public /* synthetic */ nzf m37809a(nyt nyt) {
        return m37808b(nyt);
    }

    public ocy() {
        this.f32339a = nzf.UNSET_ENUM_VALUE;
        this.f32340b = null;
        this.cachedSize = -1;
    }

    public void m37810a(nyu nyu) {
        if (this.f32339a != nzf.UNSET_ENUM_VALUE) {
            nyu.m37168a(1, this.f32339a);
        }
        if (this.f32340b != null) {
            nyu.m37170a(2, this.f32340b);
        }
        super.a(nyu);
    }

    protected int m37811b() {
        int b = super.b();
        if (this.f32339a != nzf.UNSET_ENUM_VALUE) {
            b += nyu.m37147f(1, this.f32339a);
        }
        if (this.f32340b != null) {
            return b + nyu.m37137b(2, this.f32340b);
        }
        return b;
    }

    private ocy m37808b(nyt nyt) {
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
                            this.f32339a = a;
                            break;
                        default:
                            continue;
                    }
                case wi.dH /*18*/:
                    this.f32340b = nyt.m37117j();
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
