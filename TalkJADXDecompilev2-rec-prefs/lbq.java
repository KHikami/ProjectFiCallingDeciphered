package p000;

public final class lbq extends nyx<lbq> {
    public String f24508a;
    public laa f24509b;
    public lbr f24510c;

    public /* synthetic */ nzf mo150a(nyt nyt) {
        return m28507b(nyt);
    }

    public lbq() {
        this.f24508a = null;
        this.cachedSize = -1;
    }

    public void mo146a(nyu nyu) {
        if (this.f24508a != null) {
            nyu.a(2, this.f24508a);
        }
        if (this.f24509b != null) {
            nyu.b(3, this.f24509b);
        }
        if (this.f24510c != null) {
            nyu.b(4, this.f24510c);
        }
        super.mo146a(nyu);
    }

    protected int mo147b() {
        int b = super.mo147b();
        if (this.f24508a != null) {
            b += nyu.b(2, this.f24508a);
        }
        if (this.f24509b != null) {
            b += nyu.d(3, this.f24509b);
        }
        if (this.f24510c != null) {
            return b + nyu.d(4, this.f24510c);
        }
        return b;
    }

    private lbq m28507b(nyt nyt) {
        while (true) {
            int a = nyt.a();
            switch (a) {
                case 0:
                    break;
                case wi.dH /*18*/:
                    this.f24508a = nyt.j();
                    continue;
                case wi.dx /*26*/:
                    if (this.f24509b == null) {
                        this.f24509b = new laa();
                    }
                    nyt.a(this.f24509b);
                    continue;
                case 34:
                    if (this.f24510c == null) {
                        this.f24510c = new lbr();
                    }
                    nyt.a(this.f24510c);
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
