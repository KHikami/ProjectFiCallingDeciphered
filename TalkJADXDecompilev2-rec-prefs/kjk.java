package p000;

public final class kjk extends nyx<kjk> {
    public String f21933a;

    public /* synthetic */ nzf mo150a(nyt nyt) {
        return m26097b(nyt);
    }

    public kjk() {
        m26098d();
    }

    private kjk m26098d() {
        this.f21933a = null;
        this.unknownFieldData = null;
        this.cachedSize = -1;
        return this;
    }

    public void mo146a(nyu nyu) {
        if (this.f21933a != null) {
            nyu.a(1, this.f21933a);
        }
        super.mo146a(nyu);
    }

    protected int mo147b() {
        int b = super.mo147b();
        if (this.f21933a != null) {
            return b + nyu.b(1, this.f21933a);
        }
        return b;
    }

    private kjk m26097b(nyt nyt) {
        while (true) {
            int a = nyt.a();
            switch (a) {
                case 0:
                    break;
                case 10:
                    this.f21933a = nyt.j();
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
