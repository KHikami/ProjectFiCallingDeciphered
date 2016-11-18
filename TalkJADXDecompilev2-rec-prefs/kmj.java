package p000;

public final class kmj extends nyx<kmj> {
    public Boolean f22360a;

    public /* synthetic */ nzf mo150a(nyt nyt) {
        return m26537b(nyt);
    }

    public kmj() {
        m26538d();
    }

    private kmj m26538d() {
        this.f22360a = null;
        this.unknownFieldData = null;
        this.cachedSize = -1;
        return this;
    }

    public void mo146a(nyu nyu) {
        if (this.f22360a != null) {
            nyu.a(1, this.f22360a.booleanValue());
        }
        super.mo146a(nyu);
    }

    protected int mo147b() {
        int b = super.mo147b();
        if (this.f22360a == null) {
            return b;
        }
        this.f22360a.booleanValue();
        return b + (nyu.h(1) + 1);
    }

    private kmj m26537b(nyt nyt) {
        while (true) {
            int a = nyt.a();
            switch (a) {
                case 0:
                    break;
                case 8:
                    this.f22360a = Boolean.valueOf(nyt.i());
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
