package p000;

public final class naz extends nyx<naz> {
    public String f29412a;

    public /* synthetic */ nzf m34136a(nyt nyt) {
        return m34134b(nyt);
    }

    public naz() {
        m34135d();
    }

    private naz m34135d() {
        this.f29412a = null;
        this.unknownFieldData = null;
        this.cachedSize = -1;
        return this;
    }

    public void m34137a(nyu nyu) {
        if (this.f29412a != null) {
            nyu.m37170a(1, this.f29412a);
        }
        super.a(nyu);
    }

    protected int m34138b() {
        int b = super.b();
        if (this.f29412a != null) {
            return b + nyu.m37137b(1, this.f29412a);
        }
        return b;
    }

    private naz m34134b(nyt nyt) {
        while (true) {
            int a = nyt.m37099a();
            switch (a) {
                case 0:
                    break;
                case 10:
                    this.f29412a = nyt.m37117j();
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
