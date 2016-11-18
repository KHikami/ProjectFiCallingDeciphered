package p000;

public final class khp extends nyx<khp> {
    public String f21776a;
    public String f21777b;
    public String f21778c;
    public String f21779d;

    public /* synthetic */ nzf mo150a(nyt nyt) {
        return m25872b(nyt);
    }

    public khp() {
        this.f21776a = null;
        this.f21777b = null;
        this.f21778c = null;
        this.f21779d = null;
        this.cachedSize = -1;
    }

    public void mo146a(nyu nyu) {
        if (this.f21776a != null) {
            nyu.a(1, this.f21776a);
        }
        if (this.f21777b != null) {
            nyu.a(2, this.f21777b);
        }
        if (this.f21778c != null) {
            nyu.a(3, this.f21778c);
        }
        if (this.f21779d != null) {
            nyu.a(4, this.f21779d);
        }
        super.mo146a(nyu);
    }

    protected int mo147b() {
        int b = super.mo147b();
        if (this.f21776a != null) {
            b += nyu.b(1, this.f21776a);
        }
        if (this.f21777b != null) {
            b += nyu.b(2, this.f21777b);
        }
        if (this.f21778c != null) {
            b += nyu.b(3, this.f21778c);
        }
        if (this.f21779d != null) {
            return b + nyu.b(4, this.f21779d);
        }
        return b;
    }

    private khp m25872b(nyt nyt) {
        while (true) {
            int a = nyt.a();
            switch (a) {
                case 0:
                    break;
                case 10:
                    this.f21776a = nyt.j();
                    continue;
                case wi.dH /*18*/:
                    this.f21777b = nyt.j();
                    continue;
                case wi.dx /*26*/:
                    this.f21778c = nyt.j();
                    continue;
                case 34:
                    this.f21779d = nyt.j();
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
