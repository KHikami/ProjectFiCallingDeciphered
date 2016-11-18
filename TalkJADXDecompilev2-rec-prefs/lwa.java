package p000;

public final class lwa extends nyx<lwa> {
    public muu f26631a;
    public Integer f26632b;
    public lwb f26633c;
    public lup requestHeader;

    public /* synthetic */ nzf mo150a(nyt nyt) {
        return m30821b(nyt);
    }

    public lwa() {
        m30822d();
    }

    private lwa m30822d() {
        this.requestHeader = null;
        this.f26631a = null;
        this.f26633c = null;
        this.unknownFieldData = null;
        this.cachedSize = -1;
        return this;
    }

    public void mo146a(nyu nyu) {
        if (this.requestHeader != null) {
            nyu.b(1, this.requestHeader);
        }
        if (this.f26631a != null) {
            nyu.b(2, this.f26631a);
        }
        if (this.f26632b != null) {
            nyu.a(3, this.f26632b.intValue());
        }
        if (this.f26633c != null) {
            nyu.b(4, this.f26633c);
        }
        super.mo146a(nyu);
    }

    protected int mo147b() {
        int b = super.mo147b();
        if (this.requestHeader != null) {
            b += nyu.d(1, this.requestHeader);
        }
        if (this.f26631a != null) {
            b += nyu.d(2, this.f26631a);
        }
        if (this.f26632b != null) {
            b += nyu.f(3, this.f26632b.intValue());
        }
        if (this.f26633c != null) {
            return b + nyu.d(4, this.f26633c);
        }
        return b;
    }

    private lwa m30821b(nyt nyt) {
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
                    if (this.f26631a == null) {
                        this.f26631a = new muu();
                    }
                    nyt.a(this.f26631a);
                    continue;
                case wi.dA /*24*/:
                    a = nyt.f();
                    switch (a) {
                        case 0:
                        case 1:
                        case 2:
                            this.f26632b = Integer.valueOf(a);
                            break;
                        default:
                            continue;
                    }
                case 34:
                    if (this.f26633c == null) {
                        this.f26633c = new lwb();
                    }
                    nyt.a(this.f26633c);
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
