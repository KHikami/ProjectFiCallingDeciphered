package p000;

public final class lrp extends nyx<lrp> {
    public Integer f26258a;
    public byte[] f26259b;

    public /* synthetic */ nzf mo150a(nyt nyt) {
        return m30206b(nyt);
    }

    public lrp() {
        m30207d();
    }

    private lrp m30207d() {
        this.f26258a = null;
        this.f26259b = null;
        this.unknownFieldData = null;
        this.cachedSize = -1;
        return this;
    }

    public void mo146a(nyu nyu) {
        if (this.f26258a != null) {
            nyu.a(1, this.f26258a.intValue());
        }
        if (this.f26259b != null) {
            nyu.a(2, this.f26259b);
        }
        super.mo146a(nyu);
    }

    protected int mo147b() {
        int b = super.mo147b();
        if (this.f26258a != null) {
            b += nyu.f(1, this.f26258a.intValue());
        }
        if (this.f26259b != null) {
            return b + nyu.b(2, this.f26259b);
        }
        return b;
    }

    private lrp m30206b(nyt nyt) {
        while (true) {
            int a = nyt.a();
            switch (a) {
                case 0:
                    break;
                case 8:
                    this.f26258a = Integer.valueOf(nyt.f());
                    continue;
                case wi.dH /*18*/:
                    this.f26259b = nyt.k();
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
