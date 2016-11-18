package p000;

public final class lwl extends nyx<lwl> {
    public String f26692a;

    public /* synthetic */ nzf mo150a(nyt nyt) {
        return m30878b(nyt);
    }

    public lwl() {
        m30879d();
    }

    private lwl m30879d() {
        this.f26692a = null;
        this.unknownFieldData = null;
        this.cachedSize = -1;
        return this;
    }

    public void mo146a(nyu nyu) {
        if (this.f26692a != null) {
            nyu.a(1, this.f26692a);
        }
        super.mo146a(nyu);
    }

    protected int mo147b() {
        int b = super.mo147b();
        if (this.f26692a != null) {
            return b + nyu.b(1, this.f26692a);
        }
        return b;
    }

    private lwl m30878b(nyt nyt) {
        while (true) {
            int a = nyt.a();
            switch (a) {
                case 0:
                    break;
                case 10:
                    this.f26692a = nyt.j();
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
