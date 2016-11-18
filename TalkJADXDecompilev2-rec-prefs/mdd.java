package p000;

public final class mdd extends nyx<mdd> {
    public Boolean f27441a;

    public /* synthetic */ nzf mo150a(nyt nyt) {
        return m31815b(nyt);
    }

    public mdd() {
        m31816d();
    }

    private mdd m31816d() {
        this.f27441a = null;
        this.unknownFieldData = null;
        this.cachedSize = -1;
        return this;
    }

    public void mo146a(nyu nyu) {
        if (this.f27441a != null) {
            nyu.a(1, this.f27441a.booleanValue());
        }
        super.mo146a(nyu);
    }

    protected int mo147b() {
        int b = super.mo147b();
        if (this.f27441a == null) {
            return b;
        }
        this.f27441a.booleanValue();
        return b + (nyu.h(1) + 1);
    }

    private mdd m31815b(nyt nyt) {
        while (true) {
            int a = nyt.a();
            switch (a) {
                case 0:
                    break;
                case 8:
                    this.f27441a = Boolean.valueOf(nyt.i());
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
