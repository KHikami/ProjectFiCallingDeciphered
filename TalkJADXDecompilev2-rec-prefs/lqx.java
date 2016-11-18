package p000;

public final class lqx extends nyx<lqx> {
    public byte[] f26184a;

    public /* synthetic */ nzf mo150a(nyt nyt) {
        return m30115b(nyt);
    }

    public lqx() {
        m30116d();
    }

    private lqx m30116d() {
        this.f26184a = null;
        this.unknownFieldData = null;
        this.cachedSize = -1;
        return this;
    }

    public void mo146a(nyu nyu) {
        if (this.f26184a != null) {
            nyu.a(1, this.f26184a);
        }
        super.mo146a(nyu);
    }

    protected int mo147b() {
        int b = super.mo147b();
        if (this.f26184a != null) {
            return b + nyu.b(1, this.f26184a);
        }
        return b;
    }

    private lqx m30115b(nyt nyt) {
        while (true) {
            int a = nyt.a();
            switch (a) {
                case 0:
                    break;
                case 10:
                    this.f26184a = nyt.k();
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
