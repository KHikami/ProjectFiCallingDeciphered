package p000;

public final class ohs extends nyx<ohs> {
    public String f32934a;
    public Integer f32935b;

    public /* synthetic */ nzf m38393a(nyt nyt) {
        return m38391b(nyt);
    }

    public ohs() {
        m38392d();
    }

    private ohs m38392d() {
        this.f32934a = null;
        this.f32935b = null;
        this.unknownFieldData = null;
        this.cachedSize = -1;
        return this;
    }

    public void m38394a(nyu nyu) {
        if (this.f32934a != null) {
            nyu.m37170a(1, this.f32934a);
        }
        if (this.f32935b != null) {
            nyu.m37168a(2, this.f32935b.intValue());
        }
        super.a(nyu);
    }

    protected int m38395b() {
        int b = super.b();
        if (this.f32934a != null) {
            b += nyu.m37137b(1, this.f32934a);
        }
        if (this.f32935b != null) {
            return b + nyu.m37147f(2, this.f32935b.intValue());
        }
        return b;
    }

    private ohs m38391b(nyt nyt) {
        while (true) {
            int a = nyt.m37099a();
            switch (a) {
                case 0:
                    break;
                case 10:
                    this.f32934a = nyt.m37117j();
                    continue;
                case 16:
                    this.f32935b = Integer.valueOf(nyt.m37112f());
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
