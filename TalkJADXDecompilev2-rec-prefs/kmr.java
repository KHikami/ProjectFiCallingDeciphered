package p000;

public final class kmr extends nyx<kmr> {
    public Boolean f22387a;
    public oxq f22388b;
    public String f22389c;
    public String f22390d;

    public /* synthetic */ nzf mo150a(nyt nyt) {
        return m26577b(nyt);
    }

    public kmr() {
        this.f22387a = null;
        this.f22389c = null;
        this.f22390d = null;
        this.cachedSize = -1;
    }

    public void mo146a(nyu nyu) {
        if (this.f22387a != null) {
            nyu.a(2, this.f22387a.booleanValue());
        }
        if (this.f22388b != null) {
            nyu.b(3, this.f22388b);
        }
        if (this.f22389c != null) {
            nyu.a(4, this.f22389c);
        }
        if (this.f22390d != null) {
            nyu.a(5, this.f22390d);
        }
        super.mo146a(nyu);
    }

    protected int mo147b() {
        int b = super.mo147b();
        if (this.f22387a != null) {
            this.f22387a.booleanValue();
            b += nyu.h(2) + 1;
        }
        if (this.f22388b != null) {
            b += nyu.d(3, this.f22388b);
        }
        if (this.f22389c != null) {
            b += nyu.b(4, this.f22389c);
        }
        if (this.f22390d != null) {
            return b + nyu.b(5, this.f22390d);
        }
        return b;
    }

    private kmr m26577b(nyt nyt) {
        while (true) {
            int a = nyt.a();
            switch (a) {
                case 0:
                    break;
                case 16:
                    this.f22387a = Boolean.valueOf(nyt.i());
                    continue;
                case wi.dx /*26*/:
                    if (this.f22388b == null) {
                        this.f22388b = new oxq();
                    }
                    nyt.a(this.f22388b);
                    continue;
                case 34:
                    this.f22389c = nyt.j();
                    continue;
                case 42:
                    this.f22390d = nyt.j();
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
