package p000;

public final class mbj extends nyx<mbj> {
    public mbi f27221a;

    public /* synthetic */ nzf mo150a(nyt nyt) {
        return m31577b(nyt);
    }

    public mbj() {
        m31578d();
    }

    private mbj m31578d() {
        this.f27221a = null;
        this.unknownFieldData = null;
        this.cachedSize = -1;
        return this;
    }

    public void mo146a(nyu nyu) {
        if (this.f27221a != null) {
            nyu.b(1, this.f27221a);
        }
        super.mo146a(nyu);
    }

    protected int mo147b() {
        int b = super.mo147b();
        if (this.f27221a != null) {
            return b + nyu.d(1, this.f27221a);
        }
        return b;
    }

    private mbj m31577b(nyt nyt) {
        while (true) {
            int a = nyt.a();
            switch (a) {
                case 0:
                    break;
                case 10:
                    if (this.f27221a == null) {
                        this.f27221a = new mbi();
                    }
                    nyt.a(this.f27221a);
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
