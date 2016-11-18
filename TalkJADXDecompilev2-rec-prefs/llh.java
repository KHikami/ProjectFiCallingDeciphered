package p000;

public final class llh extends nyx<llh> {
    public String f25336a;
    public String f25337b;
    public String f25338c;

    public /* synthetic */ nzf mo150a(nyt nyt) {
        return m29341b(nyt);
    }

    public llh() {
        m29342d();
    }

    private llh m29342d() {
        this.f25336a = null;
        this.f25337b = null;
        this.f25338c = null;
        this.unknownFieldData = null;
        this.cachedSize = -1;
        return this;
    }

    public void mo146a(nyu nyu) {
        if (this.f25336a != null) {
            nyu.a(1, this.f25336a);
        }
        if (this.f25337b != null) {
            nyu.a(2, this.f25337b);
        }
        if (this.f25338c != null) {
            nyu.a(3, this.f25338c);
        }
        super.mo146a(nyu);
    }

    protected int mo147b() {
        int b = super.mo147b();
        if (this.f25336a != null) {
            b += nyu.b(1, this.f25336a);
        }
        if (this.f25337b != null) {
            b += nyu.b(2, this.f25337b);
        }
        if (this.f25338c != null) {
            return b + nyu.b(3, this.f25338c);
        }
        return b;
    }

    private llh m29341b(nyt nyt) {
        while (true) {
            int a = nyt.a();
            switch (a) {
                case 0:
                    break;
                case 10:
                    this.f25336a = nyt.j();
                    continue;
                case wi.dH /*18*/:
                    this.f25337b = nyt.j();
                    continue;
                case wi.dx /*26*/:
                    this.f25338c = nyt.j();
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
