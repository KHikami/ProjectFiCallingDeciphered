package p000;

public final class khb extends nyx<khb> {
    public String f21680a;
    public String f21681b;

    public /* synthetic */ nzf mo150a(nyt nyt) {
        return m25801b(nyt);
    }

    public khb() {
        m25802d();
    }

    private khb m25802d() {
        this.f21680a = null;
        this.f21681b = null;
        this.unknownFieldData = null;
        this.cachedSize = -1;
        return this;
    }

    public void mo146a(nyu nyu) {
        nyu.a(1, this.f21680a);
        nyu.a(2, this.f21681b);
        super.mo146a(nyu);
    }

    protected int mo147b() {
        return (super.mo147b() + nyu.b(1, this.f21680a)) + nyu.b(2, this.f21681b);
    }

    private khb m25801b(nyt nyt) {
        while (true) {
            int a = nyt.a();
            switch (a) {
                case 0:
                    break;
                case 10:
                    this.f21680a = nyt.j();
                    continue;
                case wi.dH /*18*/:
                    this.f21681b = nyt.j();
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
