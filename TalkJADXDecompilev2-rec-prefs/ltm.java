package p000;

public final class ltm extends nyx<ltm> {
    public String f26389a;

    public /* synthetic */ nzf mo150a(nyt nyt) {
        return m30466b(nyt);
    }

    public ltm() {
        m30467d();
    }

    private ltm m30467d() {
        this.f26389a = null;
        this.unknownFieldData = null;
        this.cachedSize = -1;
        return this;
    }

    public void mo146a(nyu nyu) {
        if (this.f26389a != null) {
            nyu.a(1, this.f26389a);
        }
        super.mo146a(nyu);
    }

    protected int mo147b() {
        int b = super.mo147b();
        if (this.f26389a != null) {
            return b + nyu.b(1, this.f26389a);
        }
        return b;
    }

    private ltm m30466b(nyt nyt) {
        while (true) {
            int a = nyt.a();
            switch (a) {
                case 0:
                    break;
                case 10:
                    this.f26389a = nyt.j();
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
