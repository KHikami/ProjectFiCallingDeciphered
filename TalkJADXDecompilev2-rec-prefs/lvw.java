package p000;

public final class lvw extends nyx<lvw> {
    public lor f26625a;
    public Integer f26626b;
    public lup requestHeader;

    public /* synthetic */ nzf mo150a(nyt nyt) {
        return m30798b(nyt);
    }

    public lvw() {
        m30799d();
    }

    private lvw m30799d() {
        this.requestHeader = null;
        this.f26625a = null;
        this.unknownFieldData = null;
        this.cachedSize = -1;
        return this;
    }

    public void mo146a(nyu nyu) {
        if (this.requestHeader != null) {
            nyu.b(1, this.requestHeader);
        }
        if (this.f26625a != null) {
            nyu.b(2, this.f26625a);
        }
        if (this.f26626b != null) {
            nyu.a(3, this.f26626b.intValue());
        }
        super.mo146a(nyu);
    }

    protected int mo147b() {
        int b = super.mo147b();
        if (this.requestHeader != null) {
            b += nyu.d(1, this.requestHeader);
        }
        if (this.f26625a != null) {
            b += nyu.d(2, this.f26625a);
        }
        if (this.f26626b != null) {
            return b + nyu.f(3, this.f26626b.intValue());
        }
        return b;
    }

    private lvw m30798b(nyt nyt) {
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
                    if (this.f26625a == null) {
                        this.f26625a = new lor();
                    }
                    nyt.a(this.f26625a);
                    continue;
                case wi.dA /*24*/:
                    a = nyt.f();
                    switch (a) {
                        case 1:
                        case 2:
                        case 3:
                            this.f26626b = Integer.valueOf(a);
                            break;
                        default:
                            continue;
                    }
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
