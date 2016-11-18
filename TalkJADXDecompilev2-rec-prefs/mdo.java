package p000;

public final class mdo extends nyx<mdo> {
    public Integer f27489a;

    public /* synthetic */ nzf mo150a(nyt nyt) {
        return m31873b(nyt);
    }

    public mdo() {
        m31874d();
    }

    private mdo m31874d() {
        this.f27489a = null;
        this.unknownFieldData = null;
        this.cachedSize = -1;
        return this;
    }

    public void mo146a(nyu nyu) {
        if (this.f27489a != null) {
            nyu.a(1, this.f27489a.intValue());
        }
        super.mo146a(nyu);
    }

    protected int mo147b() {
        int b = super.mo147b();
        if (this.f27489a != null) {
            return b + nyu.f(1, this.f27489a.intValue());
        }
        return b;
    }

    private mdo m31873b(nyt nyt) {
        while (true) {
            int a = nyt.a();
            switch (a) {
                case 0:
                    break;
                case 8:
                    this.f27489a = Integer.valueOf(nyt.f());
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
