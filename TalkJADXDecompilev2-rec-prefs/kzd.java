package p000;

public final class kzd extends nyx<kzd> {
    public String f24183a;

    public /* synthetic */ nzf mo150a(nyt nyt) {
        return m28201b(nyt);
    }

    public kzd() {
        m28202d();
    }

    private kzd m28202d() {
        this.f24183a = null;
        this.unknownFieldData = null;
        this.cachedSize = -1;
        return this;
    }

    public void mo146a(nyu nyu) {
        if (this.f24183a != null) {
            nyu.a(1, this.f24183a);
        }
        super.mo146a(nyu);
    }

    protected int mo147b() {
        int b = super.mo147b();
        if (this.f24183a != null) {
            return b + nyu.b(1, this.f24183a);
        }
        return b;
    }

    private kzd m28201b(nyt nyt) {
        while (true) {
            int a = nyt.a();
            switch (a) {
                case 0:
                    break;
                case 10:
                    this.f24183a = nyt.j();
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
