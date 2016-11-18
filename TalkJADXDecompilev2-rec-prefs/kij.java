package p000;

public final class kij extends nyx<kij> {
    public String f21847a;

    public /* synthetic */ nzf mo150a(nyt nyt) {
        return m25970b(nyt);
    }

    public kij() {
        m25971d();
    }

    private kij m25971d() {
        this.f21847a = null;
        this.unknownFieldData = null;
        this.cachedSize = -1;
        return this;
    }

    public void mo146a(nyu nyu) {
        if (this.f21847a != null) {
            nyu.a(1, this.f21847a);
        }
        super.mo146a(nyu);
    }

    protected int mo147b() {
        int b = super.mo147b();
        if (this.f21847a != null) {
            return b + nyu.b(1, this.f21847a);
        }
        return b;
    }

    private kij m25970b(nyt nyt) {
        while (true) {
            int a = nyt.a();
            switch (a) {
                case 0:
                    break;
                case 10:
                    this.f21847a = nyt.j();
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
