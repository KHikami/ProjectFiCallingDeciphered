package p000;

public final class mdu extends nyx<mdu> {
    public muu f27534a;
    public byte[] f27535b;
    public Long f27536c;

    public /* synthetic */ nzf mo150a(nyt nyt) {
        return m31905b(nyt);
    }

    public mdu() {
        m31906d();
    }

    private mdu m31906d() {
        this.f27534a = null;
        this.f27535b = null;
        this.f27536c = null;
        this.unknownFieldData = null;
        this.cachedSize = -1;
        return this;
    }

    public void mo146a(nyu nyu) {
        if (this.f27534a != null) {
            nyu.b(1, this.f27534a);
        }
        if (this.f27535b != null) {
            nyu.a(2, this.f27535b);
        }
        if (this.f27536c != null) {
            nyu.a(3, this.f27536c.longValue());
        }
        super.mo146a(nyu);
    }

    protected int mo147b() {
        int b = super.mo147b();
        if (this.f27534a != null) {
            b += nyu.d(1, this.f27534a);
        }
        if (this.f27535b != null) {
            b += nyu.b(2, this.f27535b);
        }
        if (this.f27536c != null) {
            return b + nyu.e(3, this.f27536c.longValue());
        }
        return b;
    }

    private mdu m31905b(nyt nyt) {
        while (true) {
            int a = nyt.a();
            switch (a) {
                case 0:
                    break;
                case 10:
                    if (this.f27534a == null) {
                        this.f27534a = new muu();
                    }
                    nyt.a(this.f27534a);
                    continue;
                case wi.dH /*18*/:
                    this.f27535b = nyt.k();
                    continue;
                case wi.dA /*24*/:
                    this.f27536c = Long.valueOf(nyt.d());
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
