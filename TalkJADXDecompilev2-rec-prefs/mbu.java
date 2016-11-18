package p000;

public final class mbu extends nyx<mbu> {
    public mbq f27272a;
    public Integer f27273b;
    public lzj f27274c;
    public luq responseHeader;

    public /* synthetic */ nzf mo150a(nyt nyt) {
        return m31634b(nyt);
    }

    public mbu() {
        m31635d();
    }

    private mbu m31635d() {
        this.responseHeader = null;
        this.f27272a = null;
        this.f27274c = null;
        this.unknownFieldData = null;
        this.cachedSize = -1;
        return this;
    }

    public void mo146a(nyu nyu) {
        if (this.responseHeader != null) {
            nyu.b(1, this.responseHeader);
        }
        if (this.f27272a != null) {
            nyu.b(2, this.f27272a);
        }
        if (this.f27273b != null) {
            nyu.a(3, this.f27273b.intValue());
        }
        if (this.f27274c != null) {
            nyu.b(4, this.f27274c);
        }
        super.mo146a(nyu);
    }

    protected int mo147b() {
        int b = super.mo147b();
        if (this.responseHeader != null) {
            b += nyu.d(1, this.responseHeader);
        }
        if (this.f27272a != null) {
            b += nyu.d(2, this.f27272a);
        }
        if (this.f27273b != null) {
            b += nyu.f(3, this.f27273b.intValue());
        }
        if (this.f27274c != null) {
            return b + nyu.d(4, this.f27274c);
        }
        return b;
    }

    private mbu m31634b(nyt nyt) {
        while (true) {
            int a = nyt.a();
            switch (a) {
                case 0:
                    break;
                case 10:
                    if (this.responseHeader == null) {
                        this.responseHeader = new luq();
                    }
                    nyt.a(this.responseHeader);
                    continue;
                case wi.dH /*18*/:
                    if (this.f27272a == null) {
                        this.f27272a = new mbq();
                    }
                    nyt.a(this.f27272a);
                    continue;
                case wi.dA /*24*/:
                    a = nyt.f();
                    switch (a) {
                        case 1:
                            this.f27273b = Integer.valueOf(a);
                            break;
                        default:
                            continue;
                    }
                case 34:
                    if (this.f27274c == null) {
                        this.f27274c = new lzj();
                    }
                    nyt.a(this.f27274c);
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
