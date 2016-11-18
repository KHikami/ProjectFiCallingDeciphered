package p000;

public final class lce extends nyx<lce> {
    public String f24564a;
    public lcf f24565b;

    public /* synthetic */ nzf mo150a(nyt nyt) {
        return m28579b(nyt);
    }

    public lce() {
        m28580d();
    }

    private lce m28580d() {
        this.f24564a = null;
        this.f24565b = null;
        this.unknownFieldData = null;
        this.cachedSize = -1;
        return this;
    }

    public void mo146a(nyu nyu) {
        if (this.f24564a != null) {
            nyu.a(1, this.f24564a);
        }
        if (this.f24565b != null) {
            nyu.b(2, this.f24565b);
        }
        super.mo146a(nyu);
    }

    protected int mo147b() {
        int b = super.mo147b();
        if (this.f24564a != null) {
            b += nyu.b(1, this.f24564a);
        }
        if (this.f24565b != null) {
            return b + nyu.d(2, this.f24565b);
        }
        return b;
    }

    private lce m28579b(nyt nyt) {
        while (true) {
            int a = nyt.a();
            switch (a) {
                case 0:
                    break;
                case 10:
                    this.f24564a = nyt.j();
                    continue;
                case wi.dH /*18*/:
                    if (this.f24565b == null) {
                        this.f24565b = new lcf();
                    }
                    nyt.a(this.f24565b);
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
