package p000;

public final class lpm extends nyx<lpm> {
    public Boolean f26007a;
    public Long f26008b;

    public /* synthetic */ nzf mo150a(nyt nyt) {
        return m29915b(nyt);
    }

    public lpm() {
        m29916d();
    }

    private lpm m29916d() {
        this.f26007a = null;
        this.f26008b = null;
        this.unknownFieldData = null;
        this.cachedSize = -1;
        return this;
    }

    public void mo146a(nyu nyu) {
        if (this.f26007a != null) {
            nyu.a(1, this.f26007a.booleanValue());
        }
        if (this.f26008b != null) {
            nyu.b(2, this.f26008b.longValue());
        }
        super.mo146a(nyu);
    }

    protected int mo147b() {
        int b = super.mo147b();
        if (this.f26007a != null) {
            this.f26007a.booleanValue();
            b += nyu.h(1) + 1;
        }
        if (this.f26008b != null) {
            return b + nyu.f(2, this.f26008b.longValue());
        }
        return b;
    }

    private lpm m29915b(nyt nyt) {
        while (true) {
            int a = nyt.a();
            switch (a) {
                case 0:
                    break;
                case 8:
                    this.f26007a = Boolean.valueOf(nyt.i());
                    continue;
                case 16:
                    this.f26008b = Long.valueOf(nyt.e());
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
