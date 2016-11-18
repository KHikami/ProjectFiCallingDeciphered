package p000;

public final class laj extends nyx<laj> {
    public String f24355a;
    public String f24356b;
    public Boolean f24357c;

    public /* synthetic */ nzf mo150a(nyt nyt) {
        return m28357b(nyt);
    }

    public laj() {
        m28358d();
    }

    private laj m28358d() {
        this.f24355a = null;
        this.f24356b = null;
        this.f24357c = null;
        this.unknownFieldData = null;
        this.cachedSize = -1;
        return this;
    }

    public void mo146a(nyu nyu) {
        if (this.f24355a != null) {
            nyu.a(1, this.f24355a);
        }
        if (this.f24356b != null) {
            nyu.a(2, this.f24356b);
        }
        if (this.f24357c != null) {
            nyu.a(3, this.f24357c.booleanValue());
        }
        super.mo146a(nyu);
    }

    protected int mo147b() {
        int b = super.mo147b();
        if (this.f24355a != null) {
            b += nyu.b(1, this.f24355a);
        }
        if (this.f24356b != null) {
            b += nyu.b(2, this.f24356b);
        }
        if (this.f24357c == null) {
            return b;
        }
        this.f24357c.booleanValue();
        return b + (nyu.h(3) + 1);
    }

    private laj m28357b(nyt nyt) {
        while (true) {
            int a = nyt.a();
            switch (a) {
                case 0:
                    break;
                case 10:
                    this.f24355a = nyt.j();
                    continue;
                case wi.dH /*18*/:
                    this.f24356b = nyt.j();
                    continue;
                case wi.dA /*24*/:
                    this.f24357c = Boolean.valueOf(nyt.i());
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
