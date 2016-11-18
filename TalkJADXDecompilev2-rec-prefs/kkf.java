package p000;

public final class kkf extends nyx<kkf> {
    public Boolean f22039a;
    public kkj f22040b;
    public Boolean f22041c;
    public kkg f22042d;

    public /* synthetic */ nzf mo150a(nyt nyt) {
        return m26220b(nyt);
    }

    public kkf() {
        m26221d();
    }

    private kkf m26221d() {
        this.f22039a = null;
        this.f22040b = null;
        this.f22041c = null;
        this.f22042d = null;
        this.unknownFieldData = null;
        this.cachedSize = -1;
        return this;
    }

    public void mo146a(nyu nyu) {
        if (this.f22039a != null) {
            nyu.a(1, this.f22039a.booleanValue());
        }
        if (this.f22040b != null) {
            nyu.b(2, this.f22040b);
        }
        if (this.f22041c != null) {
            nyu.a(3, this.f22041c.booleanValue());
        }
        if (this.f22042d != null) {
            nyu.b(4, this.f22042d);
        }
        super.mo146a(nyu);
    }

    protected int mo147b() {
        int b = super.mo147b();
        if (this.f22039a != null) {
            this.f22039a.booleanValue();
            b += nyu.h(1) + 1;
        }
        if (this.f22040b != null) {
            b += nyu.d(2, this.f22040b);
        }
        if (this.f22041c != null) {
            this.f22041c.booleanValue();
            b += nyu.h(3) + 1;
        }
        if (this.f22042d != null) {
            return b + nyu.d(4, this.f22042d);
        }
        return b;
    }

    private kkf m26220b(nyt nyt) {
        while (true) {
            int a = nyt.a();
            switch (a) {
                case 0:
                    break;
                case 8:
                    this.f22039a = Boolean.valueOf(nyt.i());
                    continue;
                case wi.dH /*18*/:
                    if (this.f22040b == null) {
                        this.f22040b = new kkj();
                    }
                    nyt.a(this.f22040b);
                    continue;
                case wi.dA /*24*/:
                    this.f22041c = Boolean.valueOf(nyt.i());
                    continue;
                case 34:
                    if (this.f22042d == null) {
                        this.f22042d = new kkg();
                    }
                    nyt.a(this.f22042d);
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
