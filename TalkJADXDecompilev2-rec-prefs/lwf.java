package p000;

public final class lwf extends nyx<lwf> {
    public String f26676a;

    public /* synthetic */ nzf mo150a(nyt nyt) {
        return m30847b(nyt);
    }

    public lwf() {
        m30848d();
    }

    private lwf m30848d() {
        this.f26676a = null;
        this.unknownFieldData = null;
        this.cachedSize = -1;
        return this;
    }

    public void mo146a(nyu nyu) {
        if (this.f26676a != null) {
            nyu.a(1, this.f26676a);
        }
        super.mo146a(nyu);
    }

    protected int mo147b() {
        int b = super.mo147b();
        if (this.f26676a != null) {
            return b + nyu.b(1, this.f26676a);
        }
        return b;
    }

    private lwf m30847b(nyt nyt) {
        while (true) {
            int a = nyt.a();
            switch (a) {
                case 0:
                    break;
                case 10:
                    this.f26676a = nyt.j();
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
