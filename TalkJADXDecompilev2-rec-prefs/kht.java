package p000;

public final class kht extends nyx<kht> {
    public String f21791a;
    public String f21792b;
    public String f21793c;
    public String f21794d;

    public /* synthetic */ nzf mo150a(nyt nyt) {
        return m25891b(nyt);
    }

    public kht() {
        m25892d();
    }

    private kht m25892d() {
        this.f21791a = null;
        this.f21792b = null;
        this.f21793c = null;
        this.f21794d = null;
        this.unknownFieldData = null;
        this.cachedSize = -1;
        return this;
    }

    public void mo146a(nyu nyu) {
        if (this.f21791a != null) {
            nyu.a(1, this.f21791a);
        }
        if (this.f21792b != null) {
            nyu.a(2, this.f21792b);
        }
        if (this.f21793c != null) {
            nyu.a(3, this.f21793c);
        }
        if (this.f21794d != null) {
            nyu.a(4, this.f21794d);
        }
        super.mo146a(nyu);
    }

    protected int mo147b() {
        int b = super.mo147b();
        if (this.f21791a != null) {
            b += nyu.b(1, this.f21791a);
        }
        if (this.f21792b != null) {
            b += nyu.b(2, this.f21792b);
        }
        if (this.f21793c != null) {
            b += nyu.b(3, this.f21793c);
        }
        if (this.f21794d != null) {
            return b + nyu.b(4, this.f21794d);
        }
        return b;
    }

    private kht m25891b(nyt nyt) {
        while (true) {
            int a = nyt.a();
            switch (a) {
                case 0:
                    break;
                case 10:
                    this.f21791a = nyt.j();
                    continue;
                case wi.dH /*18*/:
                    this.f21792b = nyt.j();
                    continue;
                case wi.dx /*26*/:
                    this.f21793c = nyt.j();
                    continue;
                case 34:
                    this.f21794d = nyt.j();
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
