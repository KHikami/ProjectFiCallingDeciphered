package p000;

public final class kwt extends nyx<kwt> {
    public String f23799a;

    public /* synthetic */ nzf mo150a(nyt nyt) {
        return m27847b(nyt);
    }

    public kwt() {
        m27848d();
    }

    private kwt m27848d() {
        this.f23799a = null;
        this.unknownFieldData = null;
        this.cachedSize = -1;
        return this;
    }

    public void mo146a(nyu nyu) {
        if (this.f23799a != null) {
            nyu.a(1, this.f23799a);
        }
        super.mo146a(nyu);
    }

    protected int mo147b() {
        int b = super.mo147b();
        if (this.f23799a != null) {
            return b + nyu.b(1, this.f23799a);
        }
        return b;
    }

    private kwt m27847b(nyt nyt) {
        while (true) {
            int a = nyt.a();
            switch (a) {
                case 0:
                    break;
                case 10:
                    this.f23799a = nyt.j();
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
