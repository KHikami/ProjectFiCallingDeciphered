package p000;

public final class kze extends nyx<kze> {
    public Boolean f24184a;

    public /* synthetic */ nzf mo150a(nyt nyt) {
        return m28206b(nyt);
    }

    public kze() {
        m28207d();
    }

    private kze m28207d() {
        this.f24184a = null;
        this.unknownFieldData = null;
        this.cachedSize = -1;
        return this;
    }

    public void mo146a(nyu nyu) {
        if (this.f24184a != null) {
            nyu.a(1, this.f24184a.booleanValue());
        }
        super.mo146a(nyu);
    }

    protected int mo147b() {
        int b = super.mo147b();
        if (this.f24184a == null) {
            return b;
        }
        this.f24184a.booleanValue();
        return b + (nyu.h(1) + 1);
    }

    private kze m28206b(nyt nyt) {
        while (true) {
            int a = nyt.a();
            switch (a) {
                case 0:
                    break;
                case 8:
                    this.f24184a = Boolean.valueOf(nyt.i());
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
