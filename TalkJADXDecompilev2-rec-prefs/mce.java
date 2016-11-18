package p000;

public final class mce extends nyx<mce> {
    public Boolean f27301a;
    public Boolean f27302b;

    public /* synthetic */ nzf mo150a(nyt nyt) {
        return m31686b(nyt);
    }

    public mce() {
        m31687d();
    }

    private mce m31687d() {
        this.f27301a = null;
        this.f27302b = null;
        this.unknownFieldData = null;
        this.cachedSize = -1;
        return this;
    }

    public void mo146a(nyu nyu) {
        if (this.f27301a != null) {
            nyu.a(1, this.f27301a.booleanValue());
        }
        if (this.f27302b != null) {
            nyu.a(2, this.f27302b.booleanValue());
        }
        super.mo146a(nyu);
    }

    protected int mo147b() {
        int b = super.mo147b();
        if (this.f27301a != null) {
            this.f27301a.booleanValue();
            b += nyu.h(1) + 1;
        }
        if (this.f27302b == null) {
            return b;
        }
        this.f27302b.booleanValue();
        return b + (nyu.h(2) + 1);
    }

    private mce m31686b(nyt nyt) {
        while (true) {
            int a = nyt.a();
            switch (a) {
                case 0:
                    break;
                case 8:
                    this.f27301a = Boolean.valueOf(nyt.i());
                    continue;
                case 16:
                    this.f27302b = Boolean.valueOf(nyt.i());
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
