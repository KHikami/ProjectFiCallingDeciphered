package p000;

public final class lfa extends nyx<lfa> {
    public String f24890a;

    public /* synthetic */ nzf mo150a(nyt nyt) {
        return m28955b(nyt);
    }

    public lfa() {
        m28956d();
    }

    private lfa m28956d() {
        this.f24890a = null;
        this.unknownFieldData = null;
        this.cachedSize = -1;
        return this;
    }

    public void mo146a(nyu nyu) {
        if (this.f24890a != null) {
            nyu.a(1, this.f24890a);
        }
        super.mo146a(nyu);
    }

    protected int mo147b() {
        int b = super.mo147b();
        if (this.f24890a != null) {
            return b + nyu.b(1, this.f24890a);
        }
        return b;
    }

    private lfa m28955b(nyt nyt) {
        while (true) {
            int a = nyt.a();
            switch (a) {
                case 0:
                    break;
                case 10:
                    this.f24890a = nyt.j();
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
