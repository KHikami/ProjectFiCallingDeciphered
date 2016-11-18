package p000;

public final class kui extends nyx<kui> {
    public Long f23439a;
    public Long f23440b;
    public Boolean f23441c;
    public Boolean f23442d;

    public /* synthetic */ nzf mo150a(nyt nyt) {
        return m27565b(nyt);
    }

    public kui() {
        this.f23439a = null;
        this.f23440b = null;
        this.f23441c = null;
        this.f23442d = null;
        this.cachedSize = -1;
    }

    public void mo146a(nyu nyu) {
        nyu.b(1, this.f23439a.longValue());
        nyu.b(2, this.f23440b.longValue());
        nyu.a(3, this.f23441c.booleanValue());
        if (this.f23442d != null) {
            nyu.a(4, this.f23442d.booleanValue());
        }
        super.mo146a(nyu);
    }

    protected int mo147b() {
        int b = (super.mo147b() + nyu.f(1, this.f23439a.longValue())) + nyu.f(2, this.f23440b.longValue());
        this.f23441c.booleanValue();
        b += nyu.h(3) + 1;
        if (this.f23442d == null) {
            return b;
        }
        this.f23442d.booleanValue();
        return b + (nyu.h(4) + 1);
    }

    private kui m27565b(nyt nyt) {
        while (true) {
            int a = nyt.a();
            switch (a) {
                case 0:
                    break;
                case 8:
                    this.f23439a = Long.valueOf(nyt.e());
                    continue;
                case 16:
                    this.f23440b = Long.valueOf(nyt.e());
                    continue;
                case wi.dA /*24*/:
                    this.f23441c = Boolean.valueOf(nyt.i());
                    continue;
                case 32:
                    this.f23442d = Boolean.valueOf(nyt.i());
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
