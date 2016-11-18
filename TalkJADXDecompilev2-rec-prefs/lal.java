package p000;

public final class lal extends nyx<lal> {
    public String f24364a;
    public String f24365b;

    public /* synthetic */ nzf mo150a(nyt nyt) {
        return m28367b(nyt);
    }

    public lal() {
        m28368d();
    }

    private lal m28368d() {
        this.f24364a = null;
        this.f24365b = null;
        this.unknownFieldData = null;
        this.cachedSize = -1;
        return this;
    }

    public void mo146a(nyu nyu) {
        if (this.f24364a != null) {
            nyu.a(1, this.f24364a);
        }
        if (this.f24365b != null) {
            nyu.a(2, this.f24365b);
        }
        super.mo146a(nyu);
    }

    protected int mo147b() {
        int b = super.mo147b();
        if (this.f24364a != null) {
            b += nyu.b(1, this.f24364a);
        }
        if (this.f24365b != null) {
            return b + nyu.b(2, this.f24365b);
        }
        return b;
    }

    private lal m28367b(nyt nyt) {
        while (true) {
            int a = nyt.a();
            switch (a) {
                case 0:
                    break;
                case 10:
                    this.f24364a = nyt.j();
                    continue;
                case wi.dH /*18*/:
                    this.f24365b = nyt.j();
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
