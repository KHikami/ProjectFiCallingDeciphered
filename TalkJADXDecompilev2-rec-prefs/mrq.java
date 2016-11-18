package p000;

public final class mrq extends nyx<mrq> {
    public Long f28216a;
    public Long f28217b;
    public Long f28218c;

    public /* synthetic */ nzf mo150a(nyt nyt) {
        return m32787b(nyt);
    }

    public mrq() {
        m32788d();
    }

    private mrq m32788d() {
        this.f28216a = null;
        this.f28217b = null;
        this.f28218c = null;
        this.unknownFieldData = null;
        this.cachedSize = -1;
        return this;
    }

    public void mo146a(nyu nyu) {
        if (this.f28216a != null) {
            nyu.b(1, this.f28216a.longValue());
        }
        if (this.f28217b != null) {
            nyu.b(2, this.f28217b.longValue());
        }
        if (this.f28218c != null) {
            nyu.b(3, this.f28218c.longValue());
        }
        super.mo146a(nyu);
    }

    protected int mo147b() {
        int b = super.mo147b();
        if (this.f28216a != null) {
            b += nyu.f(1, this.f28216a.longValue());
        }
        if (this.f28217b != null) {
            b += nyu.f(2, this.f28217b.longValue());
        }
        if (this.f28218c != null) {
            return b + nyu.f(3, this.f28218c.longValue());
        }
        return b;
    }

    private mrq m32787b(nyt nyt) {
        while (true) {
            int a = nyt.a();
            switch (a) {
                case 0:
                    break;
                case 8:
                    this.f28216a = Long.valueOf(nyt.e());
                    continue;
                case 16:
                    this.f28217b = Long.valueOf(nyt.e());
                    continue;
                case wi.dA /*24*/:
                    this.f28218c = Long.valueOf(nyt.e());
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
