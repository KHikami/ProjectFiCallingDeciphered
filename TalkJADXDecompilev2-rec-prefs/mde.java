package p000;

public final class mde extends nyx<mde> {
    public Integer f27442a;
    public Integer f27443b;
    public Long f27444c;
    public Boolean f27445d;

    public /* synthetic */ nzf mo150a(nyt nyt) {
        return m31820b(nyt);
    }

    public mde() {
        m31821d();
    }

    private mde m31821d() {
        this.f27442a = null;
        this.f27443b = null;
        this.f27444c = null;
        this.f27445d = null;
        this.unknownFieldData = null;
        this.cachedSize = -1;
        return this;
    }

    public void mo146a(nyu nyu) {
        if (this.f27442a != null) {
            nyu.a(1, this.f27442a.intValue());
        }
        if (this.f27443b != null) {
            nyu.a(2, this.f27443b.intValue());
        }
        if (this.f27444c != null) {
            nyu.b(3, this.f27444c.longValue());
        }
        if (this.f27445d != null) {
            nyu.a(4, this.f27445d.booleanValue());
        }
        super.mo146a(nyu);
    }

    protected int mo147b() {
        int b = super.mo147b();
        if (this.f27442a != null) {
            b += nyu.f(1, this.f27442a.intValue());
        }
        if (this.f27443b != null) {
            b += nyu.f(2, this.f27443b.intValue());
        }
        if (this.f27444c != null) {
            b += nyu.f(3, this.f27444c.longValue());
        }
        if (this.f27445d == null) {
            return b;
        }
        this.f27445d.booleanValue();
        return b + (nyu.h(4) + 1);
    }

    private mde m31820b(nyt nyt) {
        while (true) {
            int a = nyt.a();
            switch (a) {
                case 0:
                    break;
                case 8:
                    this.f27442a = Integer.valueOf(nyt.f());
                    continue;
                case 16:
                    this.f27443b = Integer.valueOf(nyt.f());
                    continue;
                case wi.dA /*24*/:
                    this.f27444c = Long.valueOf(nyt.e());
                    continue;
                case 32:
                    this.f27445d = Boolean.valueOf(nyt.i());
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
