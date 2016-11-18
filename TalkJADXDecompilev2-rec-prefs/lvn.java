package p000;

public final class lvn extends nyx<lvn> {
    public lor f26603a;
    public Integer f26604b;
    public Integer f26605c;
    public Boolean f26606d;
    public lup requestHeader;

    public /* synthetic */ nzf mo150a(nyt nyt) {
        return m30753b(nyt);
    }

    public lvn() {
        m30754d();
    }

    private lvn m30754d() {
        this.requestHeader = null;
        this.f26603a = null;
        this.f26605c = null;
        this.f26606d = null;
        this.unknownFieldData = null;
        this.cachedSize = -1;
        return this;
    }

    public void mo146a(nyu nyu) {
        if (this.requestHeader != null) {
            nyu.b(1, this.requestHeader);
        }
        if (this.f26603a != null) {
            nyu.b(2, this.f26603a);
        }
        if (this.f26604b != null) {
            nyu.a(3, this.f26604b.intValue());
        }
        if (this.f26605c != null) {
            nyu.c(4, this.f26605c.intValue());
        }
        if (this.f26606d != null) {
            nyu.a(6, this.f26606d.booleanValue());
        }
        super.mo146a(nyu);
    }

    protected int mo147b() {
        int b = super.mo147b();
        if (this.requestHeader != null) {
            b += nyu.d(1, this.requestHeader);
        }
        if (this.f26603a != null) {
            b += nyu.d(2, this.f26603a);
        }
        if (this.f26604b != null) {
            b += nyu.f(3, this.f26604b.intValue());
        }
        if (this.f26605c != null) {
            b += nyu.g(4, this.f26605c.intValue());
        }
        if (this.f26606d == null) {
            return b;
        }
        this.f26606d.booleanValue();
        return b + (nyu.h(6) + 1);
    }

    private lvn m30753b(nyt nyt) {
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
                    if (this.f26603a == null) {
                        this.f26603a = new lor();
                    }
                    nyt.a(this.f26603a);
                    continue;
                case wi.dA /*24*/:
                    a = nyt.f();
                    switch (a) {
                        case 1:
                        case 2:
                            this.f26604b = Integer.valueOf(a);
                            break;
                        default:
                            continue;
                    }
                case 32:
                    this.f26605c = Integer.valueOf(nyt.l());
                    continue;
                case 48:
                    this.f26606d = Boolean.valueOf(nyt.i());
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
