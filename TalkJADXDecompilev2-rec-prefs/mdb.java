package p000;

public final class mdb extends nyx<mdb> {
    public Integer f27435a;
    public Integer f27436b;
    public Integer f27437c;

    public /* synthetic */ nzf mo150a(nyt nyt) {
        return m31805b(nyt);
    }

    public mdb() {
        m31806d();
    }

    private mdb m31806d() {
        this.f27436b = null;
        this.f27437c = null;
        this.unknownFieldData = null;
        this.cachedSize = -1;
        return this;
    }

    public void mo146a(nyu nyu) {
        if (this.f27435a != null) {
            nyu.a(1, this.f27435a.intValue());
        }
        if (this.f27436b != null) {
            nyu.c(2, this.f27436b.intValue());
        }
        if (this.f27437c != null) {
            nyu.c(3, this.f27437c.intValue());
        }
        super.mo146a(nyu);
    }

    protected int mo147b() {
        int b = super.mo147b();
        if (this.f27435a != null) {
            b += nyu.f(1, this.f27435a.intValue());
        }
        if (this.f27436b != null) {
            b += nyu.g(2, this.f27436b.intValue());
        }
        if (this.f27437c != null) {
            return b + nyu.g(3, this.f27437c.intValue());
        }
        return b;
    }

    private mdb m31805b(nyt nyt) {
        while (true) {
            int a = nyt.a();
            switch (a) {
                case 0:
                    break;
                case 8:
                    a = nyt.f();
                    switch (a) {
                        case 1:
                        case 2:
                        case 3:
                            this.f27435a = Integer.valueOf(a);
                            break;
                        default:
                            continue;
                    }
                case 16:
                    this.f27436b = Integer.valueOf(nyt.l());
                    continue;
                case wi.dA /*24*/:
                    this.f27437c = Integer.valueOf(nyt.l());
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
