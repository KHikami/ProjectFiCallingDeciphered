package p000;

public final class ltg extends nyx<ltg> {
    public String f26377a;

    public /* synthetic */ nzf mo150a(nyt nyt) {
        return m30434b(nyt);
    }

    public ltg() {
        m30435d();
    }

    private ltg m30435d() {
        this.f26377a = null;
        this.unknownFieldData = null;
        this.cachedSize = -1;
        return this;
    }

    public void mo146a(nyu nyu) {
        if (this.f26377a != null) {
            nyu.a(1, this.f26377a);
        }
        super.mo146a(nyu);
    }

    protected int mo147b() {
        int b = super.mo147b();
        if (this.f26377a != null) {
            return b + nyu.b(1, this.f26377a);
        }
        return b;
    }

    private ltg m30434b(nyt nyt) {
        while (true) {
            int a = nyt.a();
            switch (a) {
                case 0:
                    break;
                case 10:
                    this.f26377a = nyt.j();
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
