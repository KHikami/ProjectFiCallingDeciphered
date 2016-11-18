package p000;

public final class kwb extends nyx<kwb> {
    public String f23709a;
    public kwc f23710b;
    public Integer f23711c;

    public /* synthetic */ nzf mo150a(nyt nyt) {
        return m27765b(nyt);
    }

    public kwb() {
        this.f23709a = null;
        this.f23711c = null;
        this.cachedSize = -1;
    }

    public void mo146a(nyu nyu) {
        if (this.f23709a != null) {
            nyu.a(1, this.f23709a);
        }
        if (this.f23710b != null) {
            nyu.b(2, this.f23710b);
        }
        if (this.f23711c != null) {
            nyu.a(3, this.f23711c.intValue());
        }
        super.mo146a(nyu);
    }

    protected int mo147b() {
        int b = super.mo147b();
        if (this.f23709a != null) {
            b += nyu.b(1, this.f23709a);
        }
        if (this.f23710b != null) {
            b += nyu.d(2, this.f23710b);
        }
        if (this.f23711c != null) {
            return b + nyu.f(3, this.f23711c.intValue());
        }
        return b;
    }

    private kwb m27765b(nyt nyt) {
        while (true) {
            int a = nyt.a();
            switch (a) {
                case 0:
                    break;
                case 10:
                    this.f23709a = nyt.j();
                    continue;
                case wi.dH /*18*/:
                    if (this.f23710b == null) {
                        this.f23710b = new kwc();
                    }
                    nyt.a(this.f23710b);
                    continue;
                case wi.dA /*24*/:
                    this.f23711c = Integer.valueOf(nyt.f());
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
