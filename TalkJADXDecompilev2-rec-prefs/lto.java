package p000;

public final class lto extends nyx<lto> {
    public lqm f26393a;
    public String f26394b;
    public lup requestHeader;

    public /* synthetic */ nzf mo150a(nyt nyt) {
        return m30476b(nyt);
    }

    public lto() {
        m30477d();
    }

    private lto m30477d() {
        this.requestHeader = null;
        this.f26393a = null;
        this.f26394b = null;
        this.unknownFieldData = null;
        this.cachedSize = -1;
        return this;
    }

    public void mo146a(nyu nyu) {
        if (this.requestHeader != null) {
            nyu.b(1, this.requestHeader);
        }
        if (this.f26393a != null) {
            nyu.b(2, this.f26393a);
        }
        if (this.f26394b != null) {
            nyu.a(3, this.f26394b);
        }
        super.mo146a(nyu);
    }

    protected int mo147b() {
        int b = super.mo147b();
        if (this.requestHeader != null) {
            b += nyu.d(1, this.requestHeader);
        }
        if (this.f26393a != null) {
            b += nyu.d(2, this.f26393a);
        }
        if (this.f26394b != null) {
            return b + nyu.b(3, this.f26394b);
        }
        return b;
    }

    private lto m30476b(nyt nyt) {
        while (true) {
            int a = nyt.a();
            switch (a) {
                case 0:
                    break;
                case 10:
                    if (this.requestHeader == null) {
                        this.requestHeader = new lup();
                    }
                    nyt.a(this.requestHeader);
                    continue;
                case wi.dH /*18*/:
                    if (this.f26393a == null) {
                        this.f26393a = new lqm();
                    }
                    nyt.a(this.f26393a);
                    continue;
                case wi.dx /*26*/:
                    this.f26394b = nyt.j();
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
