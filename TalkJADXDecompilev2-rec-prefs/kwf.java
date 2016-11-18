package p000;

public final class kwf extends nyx<kwf> {
    public int f23751a;
    public String f23752b;

    public /* synthetic */ nzf mo150a(nyt nyt) {
        return m27783b(nyt);
    }

    public kwf() {
        this.f23751a = nzf.UNSET_ENUM_VALUE;
        this.f23752b = null;
        this.cachedSize = -1;
    }

    public void mo146a(nyu nyu) {
        if (this.f23751a != nzf.UNSET_ENUM_VALUE) {
            nyu.a(1, this.f23751a);
        }
        if (this.f23752b != null) {
            nyu.a(2, this.f23752b);
        }
        super.mo146a(nyu);
    }

    protected int mo147b() {
        int b = super.mo147b();
        if (this.f23751a != nzf.UNSET_ENUM_VALUE) {
            b += nyu.f(1, this.f23751a);
        }
        if (this.f23752b != null) {
            return b + nyu.b(2, this.f23752b);
        }
        return b;
    }

    private kwf m27783b(nyt nyt) {
        while (true) {
            int a = nyt.a();
            switch (a) {
                case 0:
                    break;
                case 8:
                    a = nyt.f();
                    switch (a) {
                        case 0:
                        case 1:
                        case 2:
                        case 3:
                        case 4:
                            this.f23751a = a;
                            break;
                        default:
                            continue;
                    }
                case wi.dH /*18*/:
                    this.f23752b = nyt.j();
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
