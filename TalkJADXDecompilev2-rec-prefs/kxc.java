package p000;

public final class kxc extends nyx<kxc> {
    public String f23828a;

    public /* synthetic */ nzf mo150a(nyt nyt) {
        return m27891b(nyt);
    }

    public kxc() {
        m27892d();
    }

    private kxc m27892d() {
        this.f23828a = null;
        this.unknownFieldData = null;
        this.cachedSize = -1;
        return this;
    }

    public void mo146a(nyu nyu) {
        if (this.f23828a != null) {
            nyu.a(1, this.f23828a);
        }
        super.mo146a(nyu);
    }

    protected int mo147b() {
        int b = super.mo147b();
        if (this.f23828a != null) {
            return b + nyu.b(1, this.f23828a);
        }
        return b;
    }

    private kxc m27891b(nyt nyt) {
        while (true) {
            int a = nyt.a();
            switch (a) {
                case 0:
                    break;
                case 10:
                    this.f23828a = nyt.j();
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
