package p000;

public final class kuf extends nyx<kuf> {
    public kue f23415a;
    public kue f23416b;

    public /* synthetic */ nzf mo150a(nyt nyt) {
        return m27552b(nyt);
    }

    public kuf() {
        this.cachedSize = -1;
    }

    public void mo146a(nyu nyu) {
        if (this.f23415a != null) {
            nyu.b(1, this.f23415a);
        }
        if (this.f23416b != null) {
            nyu.b(2, this.f23416b);
        }
        super.mo146a(nyu);
    }

    protected int mo147b() {
        int b = super.mo147b();
        if (this.f23415a != null) {
            b += nyu.d(1, this.f23415a);
        }
        if (this.f23416b != null) {
            return b + nyu.d(2, this.f23416b);
        }
        return b;
    }

    private kuf m27552b(nyt nyt) {
        while (true) {
            int a = nyt.a();
            switch (a) {
                case 0:
                    break;
                case 10:
                    if (this.f23415a == null) {
                        this.f23415a = new kue();
                    }
                    nyt.a(this.f23415a);
                    continue;
                case wi.dH /*18*/:
                    if (this.f23416b == null) {
                        this.f23416b = new kue();
                    }
                    nyt.a(this.f23416b);
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
