package p000;

public final class lan extends nyx<lan> {
    public String f24395a;
    public String f24396b;
    public String f24397c;
    public Long f24398d;

    public /* synthetic */ nzf mo150a(nyt nyt) {
        return m28376b(nyt);
    }

    public lan() {
        this.f24395a = null;
        this.f24396b = null;
        this.f24397c = null;
        this.f24398d = null;
        this.cachedSize = -1;
    }

    public void mo146a(nyu nyu) {
        if (this.f24395a != null) {
            nyu.a(1, this.f24395a);
        }
        if (this.f24396b != null) {
            nyu.a(2, this.f24396b);
        }
        if (this.f24397c != null) {
            nyu.a(3, this.f24397c);
        }
        if (this.f24398d != null) {
            nyu.b(4, this.f24398d.longValue());
        }
        super.mo146a(nyu);
    }

    protected int mo147b() {
        int b = super.mo147b();
        if (this.f24395a != null) {
            b += nyu.b(1, this.f24395a);
        }
        if (this.f24396b != null) {
            b += nyu.b(2, this.f24396b);
        }
        if (this.f24397c != null) {
            b += nyu.b(3, this.f24397c);
        }
        if (this.f24398d != null) {
            return b + nyu.f(4, this.f24398d.longValue());
        }
        return b;
    }

    private lan m28376b(nyt nyt) {
        while (true) {
            int a = nyt.a();
            switch (a) {
                case 0:
                    break;
                case 10:
                    this.f24395a = nyt.j();
                    continue;
                case wi.dH /*18*/:
                    this.f24396b = nyt.j();
                    continue;
                case wi.dx /*26*/:
                    this.f24397c = nyt.j();
                    continue;
                case 32:
                    this.f24398d = Long.valueOf(nyt.e());
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
