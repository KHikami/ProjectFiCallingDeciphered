package p000;

public final class kqt extends nyx<kqt> {
    public Integer f22809a;
    public Integer f22810b;

    public /* synthetic */ nzf mo150a(nyt nyt) {
        return m27106b(nyt);
    }

    public kqt() {
        m27107d();
    }

    private kqt m27107d() {
        this.f22809a = null;
        this.f22810b = null;
        this.unknownFieldData = null;
        this.cachedSize = -1;
        return this;
    }

    public void mo146a(nyu nyu) {
        if (this.f22809a != null) {
            nyu.a(1, this.f22809a.intValue());
        }
        if (this.f22810b != null) {
            nyu.a(2, this.f22810b.intValue());
        }
        super.mo146a(nyu);
    }

    protected int mo147b() {
        int b = super.mo147b();
        if (this.f22809a != null) {
            b += nyu.f(1, this.f22809a.intValue());
        }
        if (this.f22810b != null) {
            return b + nyu.f(2, this.f22810b.intValue());
        }
        return b;
    }

    private kqt m27106b(nyt nyt) {
        while (true) {
            int a = nyt.a();
            switch (a) {
                case 0:
                    break;
                case 8:
                    this.f22809a = Integer.valueOf(nyt.f());
                    continue;
                case 16:
                    this.f22810b = Integer.valueOf(nyt.f());
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
