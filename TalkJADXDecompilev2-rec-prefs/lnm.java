package p000;

public final class lnm extends nyx<lnm> {
    public String f25786a;
    public lnn f25787b;
    public int f25788c;
    public int f25789d;

    public /* synthetic */ nzf mo150a(nyt nyt) {
        return m29627b(nyt);
    }

    public lnm() {
        m29628d();
    }

    private lnm m29628d() {
        this.f25786a = "";
        this.f25787b = null;
        this.f25788c = 0;
        this.f25789d = 0;
        this.unknownFieldData = null;
        this.cachedSize = -1;
        return this;
    }

    public void mo146a(nyu nyu) {
        if (!(this.f25786a == null || this.f25786a.equals(""))) {
            nyu.a(1, this.f25786a);
        }
        if (this.f25787b != null) {
            nyu.b(2, this.f25787b);
        }
        if (this.f25788c != 0) {
            nyu.a(3, this.f25788c);
        }
        if (this.f25789d != 0) {
            nyu.a(4, this.f25789d);
        }
        super.mo146a(nyu);
    }

    protected int mo147b() {
        int b = super.mo147b();
        if (!(this.f25786a == null || this.f25786a.equals(""))) {
            b += nyu.b(1, this.f25786a);
        }
        if (this.f25787b != null) {
            b += nyu.d(2, this.f25787b);
        }
        if (this.f25788c != 0) {
            b += nyu.f(3, this.f25788c);
        }
        if (this.f25789d != 0) {
            return b + nyu.f(4, this.f25789d);
        }
        return b;
    }

    private lnm m29627b(nyt nyt) {
        while (true) {
            int a = nyt.a();
            switch (a) {
                case 0:
                    break;
                case 10:
                    this.f25786a = nyt.j();
                    continue;
                case wi.dH /*18*/:
                    if (this.f25787b == null) {
                        this.f25787b = new lnn();
                    }
                    nyt.a(this.f25787b);
                    continue;
                case wi.dA /*24*/:
                    this.f25788c = nyt.f();
                    continue;
                case 32:
                    this.f25789d = nyt.f();
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
