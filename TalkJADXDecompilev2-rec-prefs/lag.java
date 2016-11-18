package p000;

public final class lag extends nyx<lag> {
    public String f24350a;
    public String f24351b;

    public /* synthetic */ nzf mo150a(nyt nyt) {
        return m28344b(nyt);
    }

    public lag() {
        this.f24350a = null;
        this.f24351b = null;
        this.cachedSize = -1;
    }

    public void mo146a(nyu nyu) {
        if (this.f24350a != null) {
            nyu.a(1, this.f24350a);
        }
        if (this.f24351b != null) {
            nyu.a(2, this.f24351b);
        }
        super.mo146a(nyu);
    }

    protected int mo147b() {
        int b = super.mo147b();
        if (this.f24350a != null) {
            b += nyu.b(1, this.f24350a);
        }
        if (this.f24351b != null) {
            return b + nyu.b(2, this.f24351b);
        }
        return b;
    }

    private lag m28344b(nyt nyt) {
        while (true) {
            int a = nyt.a();
            switch (a) {
                case 0:
                    break;
                case 10:
                    this.f24350a = nyt.j();
                    continue;
                case wi.dH /*18*/:
                    this.f24351b = nyt.j();
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
