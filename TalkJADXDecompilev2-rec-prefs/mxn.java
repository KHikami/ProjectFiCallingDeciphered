package p000;

public final class mxn extends nyx<mxn> {
    public Long f28692a;
    public String f28693b;
    public String f28694c;
    public String f28695d;

    public /* synthetic */ nzf mo150a(nyt nyt) {
        return m33351b(nyt);
    }

    public mxn() {
        m33352d();
    }

    private mxn m33352d() {
        this.f28692a = null;
        this.f28693b = null;
        this.f28694c = null;
        this.f28695d = null;
        this.unknownFieldData = null;
        this.cachedSize = -1;
        return this;
    }

    public void mo146a(nyu nyu) {
        if (this.f28692a != null) {
            nyu.c(1, this.f28692a.longValue());
        }
        if (this.f28693b != null) {
            nyu.a(2, this.f28693b);
        }
        if (this.f28694c != null) {
            nyu.a(3, this.f28694c);
        }
        if (this.f28695d != null) {
            nyu.a(4, this.f28695d);
        }
        super.mo146a(nyu);
    }

    protected int mo147b() {
        int b = super.mo147b();
        if (this.f28692a != null) {
            this.f28692a.longValue();
            b += nyu.h(1) + 8;
        }
        if (this.f28693b != null) {
            b += nyu.b(2, this.f28693b);
        }
        if (this.f28694c != null) {
            b += nyu.b(3, this.f28694c);
        }
        if (this.f28695d != null) {
            return b + nyu.b(4, this.f28695d);
        }
        return b;
    }

    private mxn m33351b(nyt nyt) {
        while (true) {
            int a = nyt.a();
            switch (a) {
                case 0:
                    break;
                case 9:
                    this.f28692a = Long.valueOf(nyt.g());
                    continue;
                case wi.dH /*18*/:
                    this.f28693b = nyt.j();
                    continue;
                case wi.dx /*26*/:
                    this.f28694c = nyt.j();
                    continue;
                case 34:
                    this.f28695d = nyt.j();
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
