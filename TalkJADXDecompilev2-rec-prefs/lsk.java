package p000;

public final class lsk extends nyx<lsk> {
    public String f26327a;

    public /* synthetic */ nzf mo150a(nyt nyt) {
        return m30319b(nyt);
    }

    public lsk() {
        m30320d();
    }

    private lsk m30320d() {
        this.f26327a = null;
        this.unknownFieldData = null;
        this.cachedSize = -1;
        return this;
    }

    public void mo146a(nyu nyu) {
        if (this.f26327a != null) {
            nyu.a(1, this.f26327a);
        }
        super.mo146a(nyu);
    }

    protected int mo147b() {
        int b = super.mo147b();
        if (this.f26327a != null) {
            return b + nyu.b(1, this.f26327a);
        }
        return b;
    }

    private lsk m30319b(nyt nyt) {
        while (true) {
            int a = nyt.a();
            switch (a) {
                case 0:
                    break;
                case 10:
                    this.f26327a = nyt.j();
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
