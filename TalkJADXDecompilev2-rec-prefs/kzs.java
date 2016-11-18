package p000;

public final class kzs extends nyx<kzs> {
    public ldm f24296a;
    public Integer f24297b;

    public /* synthetic */ nzf mo150a(nyt nyt) {
        return m28275b(nyt);
    }

    public kzs() {
        m28276d();
    }

    private kzs m28276d() {
        this.f24296a = null;
        this.f24297b = null;
        this.unknownFieldData = null;
        this.cachedSize = -1;
        return this;
    }

    public void mo146a(nyu nyu) {
        if (this.f24296a != null) {
            nyu.b(1, this.f24296a);
        }
        if (this.f24297b != null) {
            nyu.a(2, this.f24297b.intValue());
        }
        super.mo146a(nyu);
    }

    protected int mo147b() {
        int b = super.mo147b();
        if (this.f24296a != null) {
            b += nyu.d(1, this.f24296a);
        }
        if (this.f24297b != null) {
            return b + nyu.f(2, this.f24297b.intValue());
        }
        return b;
    }

    private kzs m28275b(nyt nyt) {
        while (true) {
            int a = nyt.a();
            switch (a) {
                case 0:
                    break;
                case 10:
                    if (this.f24296a == null) {
                        this.f24296a = new ldm();
                    }
                    nyt.a(this.f24296a);
                    continue;
                case 16:
                    this.f24297b = Integer.valueOf(nyt.f());
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
