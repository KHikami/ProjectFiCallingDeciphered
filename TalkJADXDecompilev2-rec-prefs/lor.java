package p000;

public final class lor extends nyx<lor> {
    public String f25931a;

    public /* synthetic */ nzf mo150a(nyt nyt) {
        return m29791b(nyt);
    }

    public lor() {
        m29792d();
    }

    private lor m29792d() {
        this.f25931a = null;
        this.unknownFieldData = null;
        this.cachedSize = -1;
        return this;
    }

    public void mo146a(nyu nyu) {
        if (this.f25931a != null) {
            nyu.a(1, this.f25931a);
        }
        super.mo146a(nyu);
    }

    protected int mo147b() {
        int b = super.mo147b();
        if (this.f25931a != null) {
            return b + nyu.b(1, this.f25931a);
        }
        return b;
    }

    private lor m29791b(nyt nyt) {
        while (true) {
            int a = nyt.a();
            switch (a) {
                case 0:
                    break;
                case 10:
                    this.f25931a = nyt.j();
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
