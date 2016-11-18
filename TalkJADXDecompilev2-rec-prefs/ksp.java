package p000;

public final class ksp extends nyx<ksp> {
    public kso f23123a;
    public kso f23124b;

    public /* synthetic */ nzf mo150a(nyt nyt) {
        return m27346b(nyt);
    }

    public ksp() {
        m27347d();
    }

    private ksp m27347d() {
        this.f23123a = null;
        this.f23124b = null;
        this.unknownFieldData = null;
        this.cachedSize = -1;
        return this;
    }

    public void mo146a(nyu nyu) {
        if (this.f23123a != null) {
            nyu.b(1, this.f23123a);
        }
        if (this.f23124b != null) {
            nyu.b(2, this.f23124b);
        }
        super.mo146a(nyu);
    }

    protected int mo147b() {
        int b = super.mo147b();
        if (this.f23123a != null) {
            b += nyu.d(1, this.f23123a);
        }
        if (this.f23124b != null) {
            return b + nyu.d(2, this.f23124b);
        }
        return b;
    }

    private ksp m27346b(nyt nyt) {
        while (true) {
            int a = nyt.a();
            switch (a) {
                case 0:
                    break;
                case 10:
                    if (this.f23123a == null) {
                        this.f23123a = new kso();
                    }
                    nyt.a(this.f23123a);
                    continue;
                case wi.dH /*18*/:
                    if (this.f23124b == null) {
                        this.f23124b = new kso();
                    }
                    nyt.a(this.f23124b);
                    continue;
                default:
                    if (!super.m1039a(nyt, a)) {
                        break;
                    }
                    continue;
            }
            return this;
        }
    }
}
