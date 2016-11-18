package p000;

public final class mcd extends nyx<mcd> {
    public Boolean f27300a;

    public /* synthetic */ nzf mo150a(nyt nyt) {
        return m31681b(nyt);
    }

    public mcd() {
        m31682d();
    }

    private mcd m31682d() {
        this.f27300a = null;
        this.unknownFieldData = null;
        this.cachedSize = -1;
        return this;
    }

    public void mo146a(nyu nyu) {
        if (this.f27300a != null) {
            nyu.a(1, this.f27300a.booleanValue());
        }
        super.mo146a(nyu);
    }

    protected int mo147b() {
        int b = super.mo147b();
        if (this.f27300a == null) {
            return b;
        }
        this.f27300a.booleanValue();
        return b + (nyu.h(1) + 1);
    }

    private mcd m31681b(nyt nyt) {
        while (true) {
            int a = nyt.a();
            switch (a) {
                case 0:
                    break;
                case 8:
                    this.f27300a = Boolean.valueOf(nyt.i());
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
