package p000;

public final class nph extends nyx<nph> {
    public nce f30431a;
    public npd f30432b;
    public npb f30433c;

    public /* synthetic */ nzf m36024a(nyt nyt) {
        return m36023b(nyt);
    }

    public nph() {
        this.cachedSize = -1;
    }

    public void m36025a(nyu nyu) {
        if (this.f30431a != null) {
            nyu.m37182b(1, this.f30431a);
        }
        if (this.f30432b != null) {
            nyu.m37182b(2, this.f30432b);
        }
        if (this.f30433c != null) {
            nyu.m37182b(3, this.f30433c);
        }
        super.a(nyu);
    }

    protected int m36026b() {
        int b = super.b();
        if (this.f30431a != null) {
            b += nyu.m37145d(1, this.f30431a);
        }
        if (this.f30432b != null) {
            b += nyu.m37145d(2, this.f30432b);
        }
        if (this.f30433c != null) {
            return b + nyu.m37145d(3, this.f30433c);
        }
        return b;
    }

    private nph m36023b(nyt nyt) {
        while (true) {
            int a = nyt.m37099a();
            switch (a) {
                case 0:
                    break;
                case 10:
                    if (this.f30431a == null) {
                        this.f30431a = new nce();
                    }
                    nyt.m37101a(this.f30431a);
                    continue;
                case wi.dH /*18*/:
                    if (this.f30432b == null) {
                        this.f30432b = new npd();
                    }
                    nyt.m37101a(this.f30432b);
                    continue;
                case wi.dx /*26*/:
                    if (this.f30433c == null) {
                        this.f30433c = new npb();
                    }
                    nyt.m37101a(this.f30433c);
                    continue;
                default:
                    if (!super.a(nyt, a)) {
                        break;
                    }
                    continue;
            }
            return this;
        }
    }
}
