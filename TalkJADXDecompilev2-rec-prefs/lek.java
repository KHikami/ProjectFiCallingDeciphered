package p000;

public final class lek extends nyx<lek> {
    public String f24832a;
    public Integer f24833b;
    public Integer f24834c;

    public /* synthetic */ nzf mo150a(nyt nyt) {
        return m28876b(nyt);
    }

    public lek() {
        m28877d();
    }

    private lek m28877d() {
        this.f24832a = null;
        this.f24833b = null;
        this.f24834c = null;
        this.unknownFieldData = null;
        this.cachedSize = -1;
        return this;
    }

    public void mo146a(nyu nyu) {
        nyu.a(1, this.f24832a);
        if (this.f24833b != null) {
            nyu.a(2, this.f24833b.intValue());
        }
        if (this.f24834c != null) {
            nyu.a(3, this.f24834c.intValue());
        }
        super.mo146a(nyu);
    }

    protected int mo147b() {
        int b = super.mo147b() + nyu.b(1, this.f24832a);
        if (this.f24833b != null) {
            b += nyu.f(2, this.f24833b.intValue());
        }
        if (this.f24834c != null) {
            return b + nyu.f(3, this.f24834c.intValue());
        }
        return b;
    }

    private lek m28876b(nyt nyt) {
        while (true) {
            int a = nyt.a();
            switch (a) {
                case 0:
                    break;
                case 10:
                    this.f24832a = nyt.j();
                    continue;
                case 16:
                    this.f24833b = Integer.valueOf(nyt.f());
                    continue;
                case wi.dA /*24*/:
                    this.f24834c = Integer.valueOf(nyt.f());
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
