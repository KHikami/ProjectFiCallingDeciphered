package p000;

public final class ldb extends nyx<ldb> {
    public String f24646a;
    public String f24647b;

    public /* synthetic */ nzf mo150a(nyt nyt) {
        return m28697b(nyt);
    }

    public ldb() {
        m28698d();
    }

    private ldb m28698d() {
        this.f24646a = null;
        this.f24647b = null;
        this.unknownFieldData = null;
        this.cachedSize = -1;
        return this;
    }

    public void mo146a(nyu nyu) {
        if (this.f24646a != null) {
            nyu.a(1, this.f24646a);
        }
        if (this.f24647b != null) {
            nyu.a(2, this.f24647b);
        }
        super.mo146a(nyu);
    }

    protected int mo147b() {
        int b = super.mo147b();
        if (this.f24646a != null) {
            b += nyu.b(1, this.f24646a);
        }
        if (this.f24647b != null) {
            return b + nyu.b(2, this.f24647b);
        }
        return b;
    }

    private ldb m28697b(nyt nyt) {
        while (true) {
            int a = nyt.a();
            switch (a) {
                case 0:
                    break;
                case 10:
                    this.f24646a = nyt.j();
                    continue;
                case wi.dH /*18*/:
                    this.f24647b = nyt.j();
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
