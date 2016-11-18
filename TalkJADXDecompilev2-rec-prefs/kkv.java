package p000;

public final class kkv extends nyx<kkv> {
    public Double f22098a;
    public Double f22099b;

    public /* synthetic */ nzf mo150a(nyt nyt) {
        return m26309b(nyt);
    }

    public kkv() {
        m26310d();
    }

    private kkv m26310d() {
        this.f22098a = null;
        this.f22099b = null;
        this.unknownFieldData = null;
        this.cachedSize = -1;
        return this;
    }

    public void mo146a(nyu nyu) {
        if (this.f22098a != null) {
            nyu.a(1, this.f22098a.doubleValue());
        }
        if (this.f22099b != null) {
            nyu.a(2, this.f22099b.doubleValue());
        }
        super.mo146a(nyu);
    }

    protected int mo147b() {
        int b = super.mo147b();
        if (this.f22098a != null) {
            this.f22098a.doubleValue();
            b += nyu.h(1) + 8;
        }
        if (this.f22099b == null) {
            return b;
        }
        this.f22099b.doubleValue();
        return b + (nyu.h(2) + 8);
    }

    private kkv m26309b(nyt nyt) {
        while (true) {
            int a = nyt.a();
            switch (a) {
                case 0:
                    break;
                case 9:
                    this.f22098a = Double.valueOf(nyt.b());
                    continue;
                case wi.dK /*17*/:
                    this.f22099b = Double.valueOf(nyt.b());
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
