package p000;

public final class kwn extends nyx<kwn> {
    public Integer f23779a;
    public ldy f23780b;

    public /* synthetic */ nzf mo150a(nyt nyt) {
        return m27817b(nyt);
    }

    public kwn() {
        m27818d();
    }

    private kwn m27818d() {
        this.f23780b = null;
        this.unknownFieldData = null;
        this.cachedSize = -1;
        return this;
    }

    public void mo146a(nyu nyu) {
        if (this.f23779a != null) {
            nyu.a(1, this.f23779a.intValue());
        }
        if (this.f23780b != null) {
            nyu.b(2, this.f23780b);
        }
        super.mo146a(nyu);
    }

    protected int mo147b() {
        int b = super.mo147b();
        if (this.f23779a != null) {
            b += nyu.f(1, this.f23779a.intValue());
        }
        if (this.f23780b != null) {
            return b + nyu.d(2, this.f23780b);
        }
        return b;
    }

    private kwn m27817b(nyt nyt) {
        while (true) {
            int a = nyt.a();
            switch (a) {
                case 0:
                    break;
                case 8:
                    a = nyt.f();
                    switch (a) {
                        case 1:
                        case 2:
                        case 3:
                        case 4:
                        case 5:
                            this.f23779a = Integer.valueOf(a);
                            break;
                        default:
                            continue;
                    }
                case wi.dH /*18*/:
                    if (this.f23780b == null) {
                        this.f23780b = new ldy();
                    }
                    nyt.a(this.f23780b);
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
