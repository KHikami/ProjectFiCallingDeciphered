package p000;

public final class lvy extends nyx<lvy> {
    public muu f26628a;

    public /* synthetic */ nzf mo150a(nyt nyt) {
        return m30808b(nyt);
    }

    public lvy() {
        m30809d();
    }

    private lvy m30809d() {
        this.f26628a = null;
        this.unknownFieldData = null;
        this.cachedSize = -1;
        return this;
    }

    public void mo146a(nyu nyu) {
        if (this.f26628a != null) {
            nyu.b(1, this.f26628a);
        }
        super.mo146a(nyu);
    }

    protected int mo147b() {
        int b = super.mo147b();
        if (this.f26628a != null) {
            return b + nyu.d(1, this.f26628a);
        }
        return b;
    }

    private lvy m30808b(nyt nyt) {
        while (true) {
            int a = nyt.a();
            switch (a) {
                case 0:
                    break;
                case 10:
                    if (this.f26628a == null) {
                        this.f26628a = new muu();
                    }
                    nyt.a(this.f26628a);
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
