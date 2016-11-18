package p000;

public final class lnw extends nyx<lnw> {
    public String f25830a;
    public Long f25831b;
    public Long f25832c;
    public Long f25833d;

    public /* synthetic */ nzf mo150a(nyt nyt) {
        return m29679b(nyt);
    }

    public lnw() {
        m29680d();
    }

    private lnw m29680d() {
        this.f25830a = null;
        this.f25831b = null;
        this.f25832c = null;
        this.f25833d = null;
        this.unknownFieldData = null;
        this.cachedSize = -1;
        return this;
    }

    public void mo146a(nyu nyu) {
        if (this.f25830a != null) {
            nyu.a(1, this.f25830a);
        }
        if (this.f25831b != null) {
            nyu.a(2, this.f25831b.longValue());
        }
        if (this.f25832c != null) {
            nyu.a(3, this.f25832c.longValue());
        }
        if (this.f25833d != null) {
            nyu.a(4, this.f25833d.longValue());
        }
        super.mo146a(nyu);
    }

    protected int mo147b() {
        int b = super.mo147b();
        if (this.f25830a != null) {
            b += nyu.b(1, this.f25830a);
        }
        if (this.f25831b != null) {
            b += nyu.e(2, this.f25831b.longValue());
        }
        if (this.f25832c != null) {
            b += nyu.e(3, this.f25832c.longValue());
        }
        if (this.f25833d != null) {
            return b + nyu.e(4, this.f25833d.longValue());
        }
        return b;
    }

    private lnw m29679b(nyt nyt) {
        while (true) {
            int a = nyt.a();
            switch (a) {
                case 0:
                    break;
                case 10:
                    this.f25830a = nyt.j();
                    continue;
                case 16:
                    this.f25831b = Long.valueOf(nyt.d());
                    continue;
                case wi.dA /*24*/:
                    this.f25832c = Long.valueOf(nyt.d());
                    continue;
                case 32:
                    this.f25833d = Long.valueOf(nyt.d());
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
