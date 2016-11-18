package p000;

public final class khv extends nyx<khv> {
    public String f21798a;

    public /* synthetic */ nzf mo150a(nyt nyt) {
        return m25901b(nyt);
    }

    public khv() {
        m25902d();
    }

    private khv m25902d() {
        this.f21798a = null;
        this.unknownFieldData = null;
        this.cachedSize = -1;
        return this;
    }

    public void mo146a(nyu nyu) {
        if (this.f21798a != null) {
            nyu.a(1, this.f21798a);
        }
        super.mo146a(nyu);
    }

    protected int mo147b() {
        int b = super.mo147b();
        if (this.f21798a != null) {
            return b + nyu.b(1, this.f21798a);
        }
        return b;
    }

    private khv m25901b(nyt nyt) {
        while (true) {
            int a = nyt.a();
            switch (a) {
                case 0:
                    break;
                case 10:
                    this.f21798a = nyt.j();
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
