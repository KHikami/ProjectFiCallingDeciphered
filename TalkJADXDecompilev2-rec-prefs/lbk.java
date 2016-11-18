package p000;

public final class lbk extends nyx<lbk> {
    public Boolean f24478a;
    public ldm f24479b;
    public ldm f24480c;
    public ldm f24481d;
    public lbe f24482e;

    public /* synthetic */ nzf mo150a(nyt nyt) {
        return m28481b(nyt);
    }

    public lbk() {
        m28482d();
    }

    private lbk m28482d() {
        this.f24478a = null;
        this.f24479b = null;
        this.f24480c = null;
        this.f24481d = null;
        this.f24482e = null;
        this.unknownFieldData = null;
        this.cachedSize = -1;
        return this;
    }

    public void mo146a(nyu nyu) {
        if (this.f24478a != null) {
            nyu.a(5, this.f24478a.booleanValue());
        }
        if (this.f24479b != null) {
            nyu.b(6, this.f24479b);
        }
        if (this.f24480c != null) {
            nyu.b(7, this.f24480c);
        }
        if (this.f24481d != null) {
            nyu.b(8, this.f24481d);
        }
        if (this.f24482e != null) {
            nyu.b(9, this.f24482e);
        }
        super.mo146a(nyu);
    }

    protected int mo147b() {
        int b = super.mo147b();
        if (this.f24478a != null) {
            this.f24478a.booleanValue();
            b += nyu.h(5) + 1;
        }
        if (this.f24479b != null) {
            b += nyu.d(6, this.f24479b);
        }
        if (this.f24480c != null) {
            b += nyu.d(7, this.f24480c);
        }
        if (this.f24481d != null) {
            b += nyu.d(8, this.f24481d);
        }
        if (this.f24482e != null) {
            return b + nyu.d(9, this.f24482e);
        }
        return b;
    }

    private lbk m28481b(nyt nyt) {
        while (true) {
            int a = nyt.a();
            switch (a) {
                case 0:
                    break;
                case 40:
                    this.f24478a = Boolean.valueOf(nyt.i());
                    continue;
                case 50:
                    if (this.f24479b == null) {
                        this.f24479b = new ldm();
                    }
                    nyt.a(this.f24479b);
                    continue;
                case 58:
                    if (this.f24480c == null) {
                        this.f24480c = new ldm();
                    }
                    nyt.a(this.f24480c);
                    continue;
                case 66:
                    if (this.f24481d == null) {
                        this.f24481d = new ldm();
                    }
                    nyt.a(this.f24481d);
                    continue;
                case 74:
                    if (this.f24482e == null) {
                        this.f24482e = new lbe();
                    }
                    nyt.a(this.f24482e);
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
