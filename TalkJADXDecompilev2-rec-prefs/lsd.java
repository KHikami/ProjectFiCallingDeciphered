package p000;

public final class lsd extends nyx<lsd> {
    public lsb f26304a;

    public /* synthetic */ nzf mo150a(nyt nyt) {
        return m30281b(nyt);
    }

    public lsd() {
        m30282d();
    }

    private lsd m30282d() {
        this.f26304a = null;
        this.unknownFieldData = null;
        this.cachedSize = -1;
        return this;
    }

    public void mo146a(nyu nyu) {
        if (this.f26304a != null) {
            nyu.b(1, this.f26304a);
        }
        super.mo146a(nyu);
    }

    protected int mo147b() {
        int b = super.mo147b();
        if (this.f26304a != null) {
            return b + nyu.d(1, this.f26304a);
        }
        return b;
    }

    private lsd m30281b(nyt nyt) {
        while (true) {
            int a = nyt.a();
            switch (a) {
                case 0:
                    break;
                case 10:
                    if (this.f26304a == null) {
                        this.f26304a = new lsb();
                    }
                    nyt.a(this.f26304a);
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
