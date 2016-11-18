package p000;

public final class lds extends nyx<lds> {
    public ldr f24718a;
    public String f24719b;

    public /* synthetic */ nzf mo150a(nyt nyt) {
        return m28781b(nyt);
    }

    public lds() {
        m28782d();
    }

    private lds m28782d() {
        this.f24718a = null;
        this.f24719b = null;
        this.unknownFieldData = null;
        this.cachedSize = -1;
        return this;
    }

    public void mo146a(nyu nyu) {
        if (this.f24718a != null) {
            nyu.b(1, this.f24718a);
        }
        if (this.f24719b != null) {
            nyu.a(2, this.f24719b);
        }
        super.mo146a(nyu);
    }

    protected int mo147b() {
        int b = super.mo147b();
        if (this.f24718a != null) {
            b += nyu.d(1, this.f24718a);
        }
        if (this.f24719b != null) {
            return b + nyu.b(2, this.f24719b);
        }
        return b;
    }

    private lds m28781b(nyt nyt) {
        while (true) {
            int a = nyt.a();
            switch (a) {
                case 0:
                    break;
                case 10:
                    if (this.f24718a == null) {
                        this.f24718a = new ldr();
                    }
                    nyt.a(this.f24718a);
                    continue;
                case wi.dH /*18*/:
                    this.f24719b = nyt.j();
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
