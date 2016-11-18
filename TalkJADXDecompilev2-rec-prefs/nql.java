package p000;

public final class nql extends nyx<nql> {
    public Boolean f30505a;
    public Boolean f30506b;
    public ntb f30507c;
    public nqm f30508d;
    public nsa f30509e;

    public /* synthetic */ nzf m36160a(nyt nyt) {
        return m36159b(nyt);
    }

    public nql() {
        this.f30505a = null;
        this.f30506b = null;
        this.cachedSize = -1;
    }

    public void m36161a(nyu nyu) {
        if (this.f30505a != null) {
            nyu.m37172a(1, this.f30505a.booleanValue());
        }
        if (this.f30507c != null) {
            nyu.m37182b(2, this.f30507c);
        }
        if (this.f30508d != null) {
            nyu.m37182b(3, this.f30508d);
        }
        if (this.f30509e != null) {
            nyu.m37182b(4, this.f30509e);
        }
        if (this.f30506b != null) {
            nyu.m37172a(5, this.f30506b.booleanValue());
        }
        super.a(nyu);
    }

    protected int m36162b() {
        int b = super.b();
        if (this.f30505a != null) {
            this.f30505a.booleanValue();
            b += nyu.m37154h(1) + 1;
        }
        if (this.f30507c != null) {
            b += nyu.m37145d(2, this.f30507c);
        }
        if (this.f30508d != null) {
            b += nyu.m37145d(3, this.f30508d);
        }
        if (this.f30509e != null) {
            b += nyu.m37145d(4, this.f30509e);
        }
        if (this.f30506b == null) {
            return b;
        }
        this.f30506b.booleanValue();
        return b + (nyu.m37154h(5) + 1);
    }

    private nql m36159b(nyt nyt) {
        while (true) {
            int a = nyt.m37099a();
            switch (a) {
                case 0:
                    break;
                case 8:
                    this.f30505a = Boolean.valueOf(nyt.m37116i());
                    continue;
                case wi.dH /*18*/:
                    if (this.f30507c == null) {
                        this.f30507c = new ntb();
                    }
                    nyt.m37101a(this.f30507c);
                    continue;
                case wi.dx /*26*/:
                    if (this.f30508d == null) {
                        this.f30508d = new nqm();
                    }
                    nyt.m37101a(this.f30508d);
                    continue;
                case 34:
                    if (this.f30509e == null) {
                        this.f30509e = new nsa();
                    }
                    nyt.m37101a(this.f30509e);
                    continue;
                case 40:
                    this.f30506b = Boolean.valueOf(nyt.m37116i());
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
