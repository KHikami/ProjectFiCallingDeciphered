package p000;

public final class lvi extends nyx<lvi> {
    public lor f26588a;
    public Integer f26589b;
    public Integer f26590c;
    public Long f26591d;

    public /* synthetic */ nzf mo150a(nyt nyt) {
        return m30728b(nyt);
    }

    public lvi() {
        m30729d();
    }

    private lvi m30729d() {
        this.f26588a = null;
        this.f26590c = null;
        this.f26591d = null;
        this.unknownFieldData = null;
        this.cachedSize = -1;
        return this;
    }

    public void mo146a(nyu nyu) {
        if (this.f26588a != null) {
            nyu.b(1, this.f26588a);
        }
        if (this.f26589b != null) {
            nyu.a(2, this.f26589b.intValue());
        }
        if (this.f26590c != null) {
            nyu.a(3, this.f26590c.intValue());
        }
        if (this.f26591d != null) {
            nyu.a(4, this.f26591d.longValue());
        }
        super.mo146a(nyu);
    }

    protected int mo147b() {
        int b = super.mo147b();
        if (this.f26588a != null) {
            b += nyu.d(1, this.f26588a);
        }
        if (this.f26589b != null) {
            b += nyu.f(2, this.f26589b.intValue());
        }
        if (this.f26590c != null) {
            b += nyu.f(3, this.f26590c.intValue());
        }
        if (this.f26591d != null) {
            return b + nyu.e(4, this.f26591d.longValue());
        }
        return b;
    }

    private lvi m30728b(nyt nyt) {
        while (true) {
            int a = nyt.a();
            switch (a) {
                case 0:
                    break;
                case 10:
                    if (this.f26588a == null) {
                        this.f26588a = new lor();
                    }
                    nyt.a(this.f26588a);
                    continue;
                case 16:
                    a = nyt.f();
                    switch (a) {
                        case 10:
                        case 20:
                        case wi.dz /*25*/:
                        case 30:
                        case 100:
                            this.f26589b = Integer.valueOf(a);
                            break;
                        default:
                            continue;
                    }
                case wi.dA /*24*/:
                    this.f26590c = Integer.valueOf(nyt.f());
                    continue;
                case 32:
                    this.f26591d = Long.valueOf(nyt.d());
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
