package p000;

public final class lrk extends nyx<lrk> {
    public muu f26217a;
    public muu f26218b;
    public lup requestHeader;

    public /* synthetic */ nzf mo150a(nyt nyt) {
        return m30181b(nyt);
    }

    public lrk() {
        m30182d();
    }

    private lrk m30182d() {
        this.requestHeader = null;
        this.f26217a = null;
        this.f26218b = null;
        this.unknownFieldData = null;
        this.cachedSize = -1;
        return this;
    }

    public void mo146a(nyu nyu) {
        if (this.requestHeader != null) {
            nyu.b(1, this.requestHeader);
        }
        if (this.f26217a != null) {
            nyu.b(2, this.f26217a);
        }
        if (this.f26218b != null) {
            nyu.b(3, this.f26218b);
        }
        super.mo146a(nyu);
    }

    protected int mo147b() {
        int b = super.mo147b();
        if (this.requestHeader != null) {
            b += nyu.d(1, this.requestHeader);
        }
        if (this.f26217a != null) {
            b += nyu.d(2, this.f26217a);
        }
        if (this.f26218b != null) {
            return b + nyu.d(3, this.f26218b);
        }
        return b;
    }

    private lrk m30181b(nyt nyt) {
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
                    if (this.f26217a == null) {
                        this.f26217a = new muu();
                    }
                    nyt.a(this.f26217a);
                    continue;
                case wi.dx /*26*/:
                    if (this.f26218b == null) {
                        this.f26218b = new muu();
                    }
                    nyt.a(this.f26218b);
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
