package p000;

public final class lql extends nyx<lql> {
    public lqg f26143a;

    public /* synthetic */ nzf mo150a(nyt nyt) {
        return m30051b(nyt);
    }

    public lql() {
        m30052d();
    }

    private lql m30052d() {
        this.f26143a = null;
        this.unknownFieldData = null;
        this.cachedSize = -1;
        return this;
    }

    public void mo146a(nyu nyu) {
        if (this.f26143a != null) {
            nyu.b(1, this.f26143a);
        }
        super.mo146a(nyu);
    }

    protected int mo147b() {
        int b = super.mo147b();
        if (this.f26143a != null) {
            return b + nyu.d(1, this.f26143a);
        }
        return b;
    }

    private lql m30051b(nyt nyt) {
        while (true) {
            int a = nyt.a();
            switch (a) {
                case 0:
                    break;
                case 10:
                    if (this.f26143a == null) {
                        this.f26143a = new lqg();
                    }
                    nyt.a(this.f26143a);
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
