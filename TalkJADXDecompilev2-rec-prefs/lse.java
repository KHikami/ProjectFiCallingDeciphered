package p000;

public final class lse extends nyx<lse> {
    public String f26305a;

    public /* synthetic */ nzf mo150a(nyt nyt) {
        return m30286b(nyt);
    }

    public lse() {
        m30287d();
    }

    private lse m30287d() {
        this.f26305a = null;
        this.unknownFieldData = null;
        this.cachedSize = -1;
        return this;
    }

    public void mo146a(nyu nyu) {
        if (this.f26305a != null) {
            nyu.a(1, this.f26305a);
        }
        super.mo146a(nyu);
    }

    protected int mo147b() {
        int b = super.mo147b();
        if (this.f26305a != null) {
            return b + nyu.b(1, this.f26305a);
        }
        return b;
    }

    private lse m30286b(nyt nyt) {
        while (true) {
            int a = nyt.a();
            switch (a) {
                case 0:
                    break;
                case 10:
                    this.f26305a = nyt.j();
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
