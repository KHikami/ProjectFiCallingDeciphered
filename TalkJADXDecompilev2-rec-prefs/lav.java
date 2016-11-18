package p000;

public final class lav extends nyx<lav> {
    public String f24422a;
    public String f24423b;
    public String f24424c;

    public /* synthetic */ nzf mo150a(nyt nyt) {
        return m28414b(nyt);
    }

    public lav() {
        this.f24422a = null;
        this.f24423b = null;
        this.f24424c = null;
        this.cachedSize = -1;
    }

    public void mo146a(nyu nyu) {
        if (this.f24422a != null) {
            nyu.a(1, this.f24422a);
        }
        if (this.f24423b != null) {
            nyu.a(2, this.f24423b);
        }
        if (this.f24424c != null) {
            nyu.a(3, this.f24424c);
        }
        super.mo146a(nyu);
    }

    protected int mo147b() {
        int b = super.mo147b();
        if (this.f24422a != null) {
            b += nyu.b(1, this.f24422a);
        }
        if (this.f24423b != null) {
            b += nyu.b(2, this.f24423b);
        }
        if (this.f24424c != null) {
            return b + nyu.b(3, this.f24424c);
        }
        return b;
    }

    private lav m28414b(nyt nyt) {
        while (true) {
            int a = nyt.a();
            switch (a) {
                case 0:
                    break;
                case 10:
                    this.f24422a = nyt.j();
                    continue;
                case wi.dH /*18*/:
                    this.f24423b = nyt.j();
                    continue;
                case wi.dx /*26*/:
                    this.f24424c = nyt.j();
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
