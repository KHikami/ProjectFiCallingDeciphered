package p000;

public final class lbn extends nyx<lbn> {
    public laa f24497a;
    public lbp f24498b;

    public /* synthetic */ nzf mo150a(nyt nyt) {
        return m28495b(nyt);
    }

    public lbn() {
        this.cachedSize = -1;
    }

    public void mo146a(nyu nyu) {
        if (this.f24497a != null) {
            nyu.b(1, this.f24497a);
        }
        if (this.f24498b != null) {
            nyu.b(2, this.f24498b);
        }
        super.mo146a(nyu);
    }

    protected int mo147b() {
        int b = super.mo147b();
        if (this.f24497a != null) {
            b += nyu.d(1, this.f24497a);
        }
        if (this.f24498b != null) {
            return b + nyu.d(2, this.f24498b);
        }
        return b;
    }

    private lbn m28495b(nyt nyt) {
        while (true) {
            int a = nyt.a();
            switch (a) {
                case 0:
                    break;
                case 10:
                    if (this.f24497a == null) {
                        this.f24497a = new laa();
                    }
                    nyt.a(this.f24497a);
                    continue;
                case wi.dH /*18*/:
                    if (this.f24498b == null) {
                        this.f24498b = new lbp();
                    }
                    nyt.a(this.f24498b);
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
