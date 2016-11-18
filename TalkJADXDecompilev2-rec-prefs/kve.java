package p000;

public final class kve extends nyx<kve> {
    public String f23569a;
    public String f23570b;
    public String f23571c;

    public /* synthetic */ nzf mo150a(nyt nyt) {
        return m27669b(nyt);
    }

    public kve() {
        this.f23569a = null;
        this.f23570b = null;
        this.f23571c = null;
        this.cachedSize = -1;
    }

    public void mo146a(nyu nyu) {
        nyu.a(1, this.f23569a);
        nyu.a(2, this.f23570b);
        if (this.f23571c != null) {
            nyu.a(3, this.f23571c);
        }
        super.mo146a(nyu);
    }

    protected int mo147b() {
        int b = (super.mo147b() + nyu.b(1, this.f23569a)) + nyu.b(2, this.f23570b);
        if (this.f23571c != null) {
            return b + nyu.b(3, this.f23571c);
        }
        return b;
    }

    private kve m27669b(nyt nyt) {
        while (true) {
            int a = nyt.a();
            switch (a) {
                case 0:
                    break;
                case 10:
                    this.f23569a = nyt.j();
                    continue;
                case wi.dH /*18*/:
                    this.f23570b = nyt.j();
                    continue;
                case wi.dx /*26*/:
                    this.f23571c = nyt.j();
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
