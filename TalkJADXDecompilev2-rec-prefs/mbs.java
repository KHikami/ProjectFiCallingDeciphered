package p000;

public final class mbs extends nyx<mbs> {
    public mbr f27269a;
    public lup requestHeader;

    public /* synthetic */ nzf mo150a(nyt nyt) {
        return m31624b(nyt);
    }

    public mbs() {
        m31625d();
    }

    private mbs m31625d() {
        this.requestHeader = null;
        this.f27269a = null;
        this.unknownFieldData = null;
        this.cachedSize = -1;
        return this;
    }

    public void mo146a(nyu nyu) {
        if (this.requestHeader != null) {
            nyu.b(1, this.requestHeader);
        }
        if (this.f27269a != null) {
            nyu.b(2, this.f27269a);
        }
        super.mo146a(nyu);
    }

    protected int mo147b() {
        int b = super.mo147b();
        if (this.requestHeader != null) {
            b += nyu.d(1, this.requestHeader);
        }
        if (this.f27269a != null) {
            return b + nyu.d(2, this.f27269a);
        }
        return b;
    }

    private mbs m31624b(nyt nyt) {
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
                    if (this.f27269a == null) {
                        this.f27269a = new mbr();
                    }
                    nyt.a(this.f27269a);
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
