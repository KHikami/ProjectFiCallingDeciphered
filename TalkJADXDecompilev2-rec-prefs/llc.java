package p000;

public final class llc extends nyx<llc> {
    public String f25314a;
    public String f25315b;
    public String f25316c;
    public Integer f25317d;
    public Integer f25318e;

    public /* synthetic */ nzf mo150a(nyt nyt) {
        return m29316b(nyt);
    }

    public llc() {
        m29317d();
    }

    private llc m29317d() {
        this.f25314a = null;
        this.f25315b = null;
        this.f25316c = null;
        this.f25317d = null;
        this.f25318e = null;
        this.unknownFieldData = null;
        this.cachedSize = -1;
        return this;
    }

    public void mo146a(nyu nyu) {
        if (this.f25314a != null) {
            nyu.a(1, this.f25314a);
        }
        if (this.f25315b != null) {
            nyu.a(2, this.f25315b);
        }
        if (this.f25316c != null) {
            nyu.a(3, this.f25316c);
        }
        if (this.f25317d != null) {
            nyu.a(4, this.f25317d.intValue());
        }
        if (this.f25318e != null) {
            nyu.a(5, this.f25318e.intValue());
        }
        super.mo146a(nyu);
    }

    protected int mo147b() {
        int b = super.mo147b();
        if (this.f25314a != null) {
            b += nyu.b(1, this.f25314a);
        }
        if (this.f25315b != null) {
            b += nyu.b(2, this.f25315b);
        }
        if (this.f25316c != null) {
            b += nyu.b(3, this.f25316c);
        }
        if (this.f25317d != null) {
            b += nyu.f(4, this.f25317d.intValue());
        }
        if (this.f25318e != null) {
            return b + nyu.f(5, this.f25318e.intValue());
        }
        return b;
    }

    private llc m29316b(nyt nyt) {
        while (true) {
            int a = nyt.a();
            switch (a) {
                case 0:
                    break;
                case 10:
                    this.f25314a = nyt.j();
                    continue;
                case wi.dH /*18*/:
                    this.f25315b = nyt.j();
                    continue;
                case wi.dx /*26*/:
                    this.f25316c = nyt.j();
                    continue;
                case 32:
                    this.f25317d = Integer.valueOf(nyt.f());
                    continue;
                case 40:
                    this.f25318e = Integer.valueOf(nyt.f());
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
