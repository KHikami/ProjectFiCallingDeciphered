package p000;

public final class ktl extends nyx<ktl> {
    public Integer f23229a;
    public ktm f23230b;

    public /* synthetic */ nzf mo150a(nyt nyt) {
        return m27460b(nyt);
    }

    public ktl() {
        m27461d();
    }

    private ktl m27461d() {
        this.f23230b = null;
        this.unknownFieldData = null;
        this.cachedSize = -1;
        return this;
    }

    public void mo146a(nyu nyu) {
        if (this.f23229a != null) {
            nyu.a(1, this.f23229a.intValue());
        }
        if (this.f23230b != null) {
            nyu.b(2, this.f23230b);
        }
        super.mo146a(nyu);
    }

    protected int mo147b() {
        int b = super.mo147b();
        if (this.f23229a != null) {
            b += nyu.f(1, this.f23229a.intValue());
        }
        if (this.f23230b != null) {
            return b + nyu.d(2, this.f23230b);
        }
        return b;
    }

    private ktl m27460b(nyt nyt) {
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
                        case 5:
                            this.f23229a = Integer.valueOf(a);
                            break;
                        default:
                            continue;
                    }
                case wi.dH /*18*/:
                    if (this.f23230b == null) {
                        this.f23230b = new ktm();
                    }
                    nyt.a(this.f23230b);
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
