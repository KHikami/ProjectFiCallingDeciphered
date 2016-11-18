package p000;

public final class kwi extends nyx<kwi> {
    public String f23765a;
    public String f23766b;

    public /* synthetic */ nzf mo150a(nyt nyt) {
        return m27796b(nyt);
    }

    public kwi() {
        this.f23765a = null;
        this.f23766b = null;
        this.cachedSize = -1;
    }

    public void mo146a(nyu nyu) {
        if (this.f23765a != null) {
            nyu.a(1, this.f23765a);
        }
        if (this.f23766b != null) {
            nyu.a(2, this.f23766b);
        }
        super.mo146a(nyu);
    }

    protected int mo147b() {
        int b = super.mo147b();
        if (this.f23765a != null) {
            b += nyu.b(1, this.f23765a);
        }
        if (this.f23766b != null) {
            return b + nyu.b(2, this.f23766b);
        }
        return b;
    }

    private kwi m27796b(nyt nyt) {
        while (true) {
            int a = nyt.a();
            switch (a) {
                case 0:
                    break;
                case 10:
                    this.f23765a = nyt.j();
                    continue;
                case wi.dH /*18*/:
                    this.f23766b = nyt.j();
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
