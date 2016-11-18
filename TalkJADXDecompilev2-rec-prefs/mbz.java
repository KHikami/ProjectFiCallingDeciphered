package p000;

public final class mbz extends nyx<mbz> {
    public String f27285a;
    public String f27286b;

    public /* synthetic */ nzf mo150a(nyt nyt) {
        return m31660b(nyt);
    }

    public mbz() {
        m31661d();
    }

    private mbz m31661d() {
        this.f27285a = null;
        this.f27286b = null;
        this.unknownFieldData = null;
        this.cachedSize = -1;
        return this;
    }

    public void mo146a(nyu nyu) {
        if (this.f27285a != null) {
            nyu.a(1, this.f27285a);
        }
        if (this.f27286b != null) {
            nyu.a(2, this.f27286b);
        }
        super.mo146a(nyu);
    }

    protected int mo147b() {
        int b = super.mo147b();
        if (this.f27285a != null) {
            b += nyu.b(1, this.f27285a);
        }
        if (this.f27286b != null) {
            return b + nyu.b(2, this.f27286b);
        }
        return b;
    }

    private mbz m31660b(nyt nyt) {
        while (true) {
            int a = nyt.a();
            switch (a) {
                case 0:
                    break;
                case 10:
                    this.f27285a = nyt.j();
                    continue;
                case wi.dH /*18*/:
                    this.f27286b = nyt.j();
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
