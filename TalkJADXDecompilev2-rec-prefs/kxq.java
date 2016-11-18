package p000;

public final class kxq extends nyx<kxq> {
    public String f23870a;
    public Boolean f23871b;
    public String f23872c;

    public /* synthetic */ nzf mo150a(nyt nyt) {
        return m27957b(nyt);
    }

    public kxq() {
        this.f23870a = null;
        this.f23871b = null;
        this.f23872c = null;
        this.cachedSize = -1;
    }

    public void mo146a(nyu nyu) {
        if (this.f23870a != null) {
            nyu.a(1, this.f23870a);
        }
        if (this.f23871b != null) {
            nyu.a(2, this.f23871b.booleanValue());
        }
        if (this.f23872c != null) {
            nyu.a(3, this.f23872c);
        }
        super.mo146a(nyu);
    }

    protected int mo147b() {
        int b = super.mo147b();
        if (this.f23870a != null) {
            b += nyu.b(1, this.f23870a);
        }
        if (this.f23871b != null) {
            this.f23871b.booleanValue();
            b += nyu.h(2) + 1;
        }
        if (this.f23872c != null) {
            return b + nyu.b(3, this.f23872c);
        }
        return b;
    }

    private kxq m27957b(nyt nyt) {
        while (true) {
            int a = nyt.a();
            switch (a) {
                case 0:
                    break;
                case 10:
                    this.f23870a = nyt.j();
                    continue;
                case 16:
                    this.f23871b = Boolean.valueOf(nyt.i());
                    continue;
                case wi.dx /*26*/:
                    this.f23872c = nyt.j();
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
