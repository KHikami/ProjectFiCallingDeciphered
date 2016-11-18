package p000;

public final class mdf extends nyx<mdf> {
    public Long f27446a;

    public /* synthetic */ nzf mo150a(nyt nyt) {
        return m31825b(nyt);
    }

    public mdf() {
        m31826d();
    }

    private mdf m31826d() {
        this.f27446a = null;
        this.unknownFieldData = null;
        this.cachedSize = -1;
        return this;
    }

    public void mo146a(nyu nyu) {
        if (this.f27446a != null) {
            nyu.b(1, this.f27446a.longValue());
        }
        super.mo146a(nyu);
    }

    protected int mo147b() {
        int b = super.mo147b();
        if (this.f27446a != null) {
            return b + nyu.f(1, this.f27446a.longValue());
        }
        return b;
    }

    private mdf m31825b(nyt nyt) {
        while (true) {
            int a = nyt.a();
            switch (a) {
                case 0:
                    break;
                case 8:
                    this.f27446a = Long.valueOf(nyt.e());
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
