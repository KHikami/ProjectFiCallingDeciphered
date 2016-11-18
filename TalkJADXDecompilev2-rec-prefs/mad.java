package p000;

public final class mad extends nyx<mad> {
    public Boolean f27091a;
    public String f27092b;
    public Float f27093c;

    public /* synthetic */ nzf mo150a(nyt nyt) {
        return m31398b(nyt);
    }

    public mad() {
        m31399d();
    }

    private mad m31399d() {
        this.f27091a = null;
        this.f27092b = null;
        this.f27093c = null;
        this.unknownFieldData = null;
        this.cachedSize = -1;
        return this;
    }

    public void mo146a(nyu nyu) {
        nyu.a(1, this.f27091a.booleanValue());
        if (this.f27092b != null) {
            nyu.a(2, this.f27092b);
        }
        if (this.f27093c != null) {
            nyu.a(3, this.f27093c.floatValue());
        }
        super.mo146a(nyu);
    }

    protected int mo147b() {
        int b = super.mo147b();
        this.f27091a.booleanValue();
        b += nyu.h(1) + 1;
        if (this.f27092b != null) {
            b += nyu.b(2, this.f27092b);
        }
        if (this.f27093c == null) {
            return b;
        }
        this.f27093c.floatValue();
        return b + (nyu.h(3) + 4);
    }

    private mad m31398b(nyt nyt) {
        while (true) {
            int a = nyt.a();
            switch (a) {
                case 0:
                    break;
                case 8:
                    this.f27091a = Boolean.valueOf(nyt.i());
                    continue;
                case wi.dH /*18*/:
                    this.f27092b = nyt.j();
                    continue;
                case 29:
                    this.f27093c = Float.valueOf(nyt.c());
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
