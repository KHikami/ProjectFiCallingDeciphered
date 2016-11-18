package p000;

public final class kwa extends nyx<kwa> {
    public String f23707a;
    public String f23708b;

    public /* synthetic */ nzf mo150a(nyt nyt) {
        return m27761b(nyt);
    }

    public kwa() {
        this.f23707a = null;
        this.f23708b = null;
        this.cachedSize = -1;
    }

    public void mo146a(nyu nyu) {
        nyu.a(1, this.f23707a);
        nyu.a(2, this.f23708b);
        super.mo146a(nyu);
    }

    protected int mo147b() {
        return (super.mo147b() + nyu.b(1, this.f23707a)) + nyu.b(2, this.f23708b);
    }

    private kwa m27761b(nyt nyt) {
        while (true) {
            int a = nyt.a();
            switch (a) {
                case 0:
                    break;
                case 10:
                    this.f23707a = nyt.j();
                    continue;
                case wi.dH /*18*/:
                    this.f23708b = nyt.j();
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
