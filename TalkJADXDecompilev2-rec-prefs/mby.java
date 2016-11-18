package p000;

public final class mby extends nyx<mby> {
    public mbz f27283a;
    public lor f27284b;

    public /* synthetic */ nzf mo150a(nyt nyt) {
        return m31655b(nyt);
    }

    public mby() {
        m31656d();
    }

    private mby m31656d() {
        this.f27283a = null;
        this.f27284b = null;
        this.unknownFieldData = null;
        this.cachedSize = -1;
        return this;
    }

    public void mo146a(nyu nyu) {
        if (this.f27283a != null) {
            nyu.b(1, this.f27283a);
        }
        if (this.f27284b != null) {
            nyu.b(4, this.f27284b);
        }
        super.mo146a(nyu);
    }

    protected int mo147b() {
        int b = super.mo147b();
        if (this.f27283a != null) {
            b += nyu.d(1, this.f27283a);
        }
        if (this.f27284b != null) {
            return b + nyu.d(4, this.f27284b);
        }
        return b;
    }

    private mby m31655b(nyt nyt) {
        while (true) {
            int a = nyt.a();
            switch (a) {
                case 0:
                    break;
                case 10:
                    if (this.f27283a == null) {
                        this.f27283a = new mbz();
                    }
                    nyt.a(this.f27283a);
                    continue;
                case 34:
                    if (this.f27284b == null) {
                        this.f27284b = new lor();
                    }
                    nyt.a(this.f27284b);
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
