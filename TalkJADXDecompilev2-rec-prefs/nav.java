package p000;

public final class nav extends nyx<nav> {
    public String f29395a;

    public /* synthetic */ nzf m34114a(nyt nyt) {
        return m34112b(nyt);
    }

    public nav() {
        m34113d();
    }

    private nav m34113d() {
        this.f29395a = null;
        this.unknownFieldData = null;
        this.cachedSize = -1;
        return this;
    }

    public void m34115a(nyu nyu) {
        if (this.f29395a != null) {
            nyu.m37170a(1, this.f29395a);
        }
        super.a(nyu);
    }

    protected int m34116b() {
        int b = super.b();
        if (this.f29395a != null) {
            return b + nyu.m37137b(1, this.f29395a);
        }
        return b;
    }

    private nav m34112b(nyt nyt) {
        while (true) {
            int a = nyt.m37099a();
            switch (a) {
                case 0:
                    break;
                case 10:
                    this.f29395a = nyt.m37117j();
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
