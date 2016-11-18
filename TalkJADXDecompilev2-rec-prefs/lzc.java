package p000;

public final class lzc extends nyx<lzc> {
    public String f26979a;
    public Integer f26980b;
    public String f26981c;
    public lzj f26982d;
    public luq responseHeader;

    public /* synthetic */ nzf mo150a(nyt nyt) {
        return m31239b(nyt);
    }

    public lzc() {
        m31240d();
    }

    private lzc m31240d() {
        this.responseHeader = null;
        this.f26979a = null;
        this.f26981c = null;
        this.f26982d = null;
        this.unknownFieldData = null;
        this.cachedSize = -1;
        return this;
    }

    public void mo146a(nyu nyu) {
        if (this.responseHeader != null) {
            nyu.b(1, this.responseHeader);
        }
        if (this.f26979a != null) {
            nyu.a(2, this.f26979a);
        }
        if (this.f26980b != null) {
            nyu.a(3, this.f26980b.intValue());
        }
        if (this.f26981c != null) {
            nyu.a(4, this.f26981c);
        }
        if (this.f26982d != null) {
            nyu.b(5, this.f26982d);
        }
        super.mo146a(nyu);
    }

    protected int mo147b() {
        int b = super.mo147b();
        if (this.responseHeader != null) {
            b += nyu.d(1, this.responseHeader);
        }
        if (this.f26979a != null) {
            b += nyu.b(2, this.f26979a);
        }
        if (this.f26980b != null) {
            b += nyu.f(3, this.f26980b.intValue());
        }
        if (this.f26981c != null) {
            b += nyu.b(4, this.f26981c);
        }
        if (this.f26982d != null) {
            return b + nyu.d(5, this.f26982d);
        }
        return b;
    }

    private lzc m31239b(nyt nyt) {
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
                    this.f26979a = nyt.j();
                    continue;
                case wi.dA /*24*/:
                    a = nyt.f();
                    switch (a) {
                        case 0:
                        case 1:
                        case 2:
                            this.f26980b = Integer.valueOf(a);
                            break;
                        default:
                            continue;
                    }
                case 34:
                    this.f26981c = nyt.j();
                    continue;
                case 42:
                    if (this.f26982d == null) {
                        this.f26982d = new lzj();
                    }
                    nyt.a(this.f26982d);
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
