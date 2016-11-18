package p000;

public final class jbi extends nzf {
    public String f19717a;
    public String f19718b;
    public String f19719c;

    public /* synthetic */ nzf mo150a(nyt nyt) {
        return m23784b(nyt);
    }

    public jbi() {
        m23785d();
    }

    private jbi m23785d() {
        this.f19717a = "";
        this.f19718b = "";
        this.f19719c = "";
        this.cachedSize = -1;
        return this;
    }

    public void mo146a(nyu nyu) {
        if (!this.f19717a.equals("")) {
            nyu.a(2, this.f19717a);
        }
        if (!this.f19718b.equals("")) {
            nyu.a(3, this.f19718b);
        }
        if (!this.f19719c.equals("")) {
            nyu.a(6, this.f19719c);
        }
        super.mo146a(nyu);
    }

    protected int mo147b() {
        int b = super.mo147b();
        if (!this.f19717a.equals("")) {
            b += nyu.b(2, this.f19717a);
        }
        if (!this.f19718b.equals("")) {
            b += nyu.b(3, this.f19718b);
        }
        if (this.f19719c.equals("")) {
            return b;
        }
        return b + nyu.b(6, this.f19719c);
    }

    private jbi m23784b(nyt nyt) {
        while (true) {
            int a = nyt.a();
            switch (a) {
                case 0:
                    break;
                case wi.dH /*18*/:
                    this.f19717a = nyt.j();
                    continue;
                case wi.dx /*26*/:
                    this.f19718b = nyt.j();
                    continue;
                case 50:
                    this.f19719c = nyt.j();
                    continue;
                default:
                    if (!nzl.a(nyt, a)) {
                        break;
                    }
                    continue;
            }
            return this;
        }
    }
}
