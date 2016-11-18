package p000;

public final class kit extends nyx<kit> {
    public Boolean f21882a;
    public Boolean f21883b;

    public /* synthetic */ nzf mo150a(nyt nyt) {
        return m26010b(nyt);
    }

    public kit() {
        m26011d();
    }

    private kit m26011d() {
        this.f21882a = null;
        this.f21883b = null;
        this.unknownFieldData = null;
        this.cachedSize = -1;
        return this;
    }

    public void mo146a(nyu nyu) {
        if (this.f21882a != null) {
            nyu.a(1, this.f21882a.booleanValue());
        }
        if (this.f21883b != null) {
            nyu.a(2, this.f21883b.booleanValue());
        }
        super.mo146a(nyu);
    }

    protected int mo147b() {
        int b = super.mo147b();
        if (this.f21882a != null) {
            this.f21882a.booleanValue();
            b += nyu.h(1) + 1;
        }
        if (this.f21883b == null) {
            return b;
        }
        this.f21883b.booleanValue();
        return b + (nyu.h(2) + 1);
    }

    private kit m26010b(nyt nyt) {
        while (true) {
            int a = nyt.a();
            switch (a) {
                case 0:
                    break;
                case 8:
                    this.f21882a = Boolean.valueOf(nyt.i());
                    continue;
                case 16:
                    this.f21883b = Boolean.valueOf(nyt.i());
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
