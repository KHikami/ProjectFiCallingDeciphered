package p000;

public final class lop extends nyx<lop> {
    public ltr f25926a;
    public lor f25927b;
    public String f25928c;

    public /* synthetic */ nzf mo150a(nyt nyt) {
        return m29781b(nyt);
    }

    public lop() {
        m29782d();
    }

    private lop m29782d() {
        this.f25926a = null;
        this.f25927b = null;
        this.f25928c = null;
        this.unknownFieldData = null;
        this.cachedSize = -1;
        return this;
    }

    public void mo146a(nyu nyu) {
        if (this.f25926a != null) {
            nyu.b(1, this.f25926a);
        }
        if (this.f25927b != null) {
            nyu.b(2, this.f25927b);
        }
        if (this.f25928c != null) {
            nyu.a(3, this.f25928c);
        }
        super.mo146a(nyu);
    }

    protected int mo147b() {
        int b = super.mo147b();
        if (this.f25926a != null) {
            b += nyu.d(1, this.f25926a);
        }
        if (this.f25927b != null) {
            b += nyu.d(2, this.f25927b);
        }
        if (this.f25928c != null) {
            return b + nyu.b(3, this.f25928c);
        }
        return b;
    }

    private lop m29781b(nyt nyt) {
        while (true) {
            int a = nyt.a();
            switch (a) {
                case 0:
                    break;
                case 10:
                    if (this.f25926a == null) {
                        this.f25926a = new ltr();
                    }
                    nyt.a(this.f25926a);
                    continue;
                case wi.dH /*18*/:
                    if (this.f25927b == null) {
                        this.f25927b = new lor();
                    }
                    nyt.a(this.f25927b);
                    continue;
                case wi.dx /*26*/:
                    this.f25928c = nyt.j();
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
