package p000;

public final class lsx extends nyx<lsx> {
    public String f26351a;
    public String f26352b;
    public Boolean f26353c;
    public Boolean f26354d;

    public /* synthetic */ nzf mo150a(nyt nyt) {
        return m30387b(nyt);
    }

    public lsx() {
        m30388d();
    }

    private lsx m30388d() {
        this.f26351a = null;
        this.f26352b = null;
        this.f26353c = null;
        this.f26354d = null;
        this.unknownFieldData = null;
        this.cachedSize = -1;
        return this;
    }

    public void mo146a(nyu nyu) {
        if (this.f26351a != null) {
            nyu.a(1, this.f26351a);
        }
        if (this.f26352b != null) {
            nyu.a(2, this.f26352b);
        }
        if (this.f26353c != null) {
            nyu.a(3, this.f26353c.booleanValue());
        }
        if (this.f26354d != null) {
            nyu.a(4, this.f26354d.booleanValue());
        }
        super.mo146a(nyu);
    }

    protected int mo147b() {
        int b = super.mo147b();
        if (this.f26351a != null) {
            b += nyu.b(1, this.f26351a);
        }
        if (this.f26352b != null) {
            b += nyu.b(2, this.f26352b);
        }
        if (this.f26353c != null) {
            this.f26353c.booleanValue();
            b += nyu.h(3) + 1;
        }
        if (this.f26354d == null) {
            return b;
        }
        this.f26354d.booleanValue();
        return b + (nyu.h(4) + 1);
    }

    private lsx m30387b(nyt nyt) {
        while (true) {
            int a = nyt.a();
            switch (a) {
                case 0:
                    break;
                case 10:
                    this.f26351a = nyt.j();
                    continue;
                case wi.dH /*18*/:
                    this.f26352b = nyt.j();
                    continue;
                case wi.dA /*24*/:
                    this.f26353c = Boolean.valueOf(nyt.i());
                    continue;
                case 32:
                    this.f26354d = Boolean.valueOf(nyt.i());
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
