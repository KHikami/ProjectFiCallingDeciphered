package p000;

public final class lyo extends nyx<lyo> {
    public Boolean f26933a;
    public Boolean f26934b;

    public /* synthetic */ nzf mo150a(nyt nyt) {
        return m31169b(nyt);
    }

    public lyo() {
        m31170d();
    }

    private lyo m31170d() {
        this.f26933a = null;
        this.f26934b = null;
        this.unknownFieldData = null;
        this.cachedSize = -1;
        return this;
    }

    public void mo146a(nyu nyu) {
        if (this.f26933a != null) {
            nyu.a(3, this.f26933a.booleanValue());
        }
        if (this.f26934b != null) {
            nyu.a(4, this.f26934b.booleanValue());
        }
        super.mo146a(nyu);
    }

    protected int mo147b() {
        int b = super.mo147b();
        if (this.f26933a != null) {
            this.f26933a.booleanValue();
            b += nyu.h(3) + 1;
        }
        if (this.f26934b == null) {
            return b;
        }
        this.f26934b.booleanValue();
        return b + (nyu.h(4) + 1);
    }

    private lyo m31169b(nyt nyt) {
        while (true) {
            int a = nyt.a();
            switch (a) {
                case 0:
                    break;
                case wi.dA /*24*/:
                    this.f26933a = Boolean.valueOf(nyt.i());
                    continue;
                case 32:
                    this.f26934b = Boolean.valueOf(nyt.i());
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
