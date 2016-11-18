package p000;

public final class lxj extends nyx<lxj> {
    public String f26775a;
    public Long f26776b;
    public String f26777c;
    public String f26778d;

    public /* synthetic */ nzf mo150a(nyt nyt) {
        return m31003b(nyt);
    }

    public lxj() {
        m31004d();
    }

    private lxj m31004d() {
        this.f26775a = null;
        this.f26776b = null;
        this.f26777c = null;
        this.f26778d = null;
        this.unknownFieldData = null;
        this.cachedSize = -1;
        return this;
    }

    public void mo146a(nyu nyu) {
        if (this.f26775a != null) {
            nyu.a(1, this.f26775a);
        }
        if (this.f26776b != null) {
            nyu.b(2, this.f26776b.longValue());
        }
        if (this.f26777c != null) {
            nyu.a(3, this.f26777c);
        }
        if (this.f26778d != null) {
            nyu.a(4, this.f26778d);
        }
        super.mo146a(nyu);
    }

    protected int mo147b() {
        int b = super.mo147b();
        if (this.f26775a != null) {
            b += nyu.b(1, this.f26775a);
        }
        if (this.f26776b != null) {
            b += nyu.f(2, this.f26776b.longValue());
        }
        if (this.f26777c != null) {
            b += nyu.b(3, this.f26777c);
        }
        if (this.f26778d != null) {
            return b + nyu.b(4, this.f26778d);
        }
        return b;
    }

    private lxj m31003b(nyt nyt) {
        while (true) {
            int a = nyt.a();
            switch (a) {
                case 0:
                    break;
                case 10:
                    this.f26775a = nyt.j();
                    continue;
                case 16:
                    this.f26776b = Long.valueOf(nyt.e());
                    continue;
                case wi.dx /*26*/:
                    this.f26777c = nyt.j();
                    continue;
                case 34:
                    this.f26778d = nyt.j();
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
