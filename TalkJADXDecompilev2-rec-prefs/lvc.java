package p000;

public final class lvc extends nyx<lvc> {
    public Boolean f26574a;
    public String f26575b;
    public Integer f26576c;
    public Boolean f26577d;
    public lup requestHeader;

    public /* synthetic */ nzf mo150a(nyt nyt) {
        return m30698b(nyt);
    }

    public lvc() {
        m30699d();
    }

    private lvc m30699d() {
        this.requestHeader = null;
        this.f26574a = null;
        this.f26575b = null;
        this.f26576c = null;
        this.f26577d = null;
        this.unknownFieldData = null;
        this.cachedSize = -1;
        return this;
    }

    public void mo146a(nyu nyu) {
        if (this.requestHeader != null) {
            nyu.b(1, this.requestHeader);
        }
        if (this.f26574a != null) {
            nyu.a(2, this.f26574a.booleanValue());
        }
        if (this.f26575b != null) {
            nyu.a(3, this.f26575b);
        }
        if (this.f26576c != null) {
            nyu.c(4, this.f26576c.intValue());
        }
        if (this.f26577d != null) {
            nyu.a(5, this.f26577d.booleanValue());
        }
        super.mo146a(nyu);
    }

    protected int mo147b() {
        int b = super.mo147b();
        if (this.requestHeader != null) {
            b += nyu.d(1, this.requestHeader);
        }
        if (this.f26574a != null) {
            this.f26574a.booleanValue();
            b += nyu.h(2) + 1;
        }
        if (this.f26575b != null) {
            b += nyu.b(3, this.f26575b);
        }
        if (this.f26576c != null) {
            b += nyu.g(4, this.f26576c.intValue());
        }
        if (this.f26577d == null) {
            return b;
        }
        this.f26577d.booleanValue();
        return b + (nyu.h(5) + 1);
    }

    private lvc m30698b(nyt nyt) {
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
                case 16:
                    this.f26574a = Boolean.valueOf(nyt.i());
                    continue;
                case wi.dx /*26*/:
                    this.f26575b = nyt.j();
                    continue;
                case 32:
                    this.f26576c = Integer.valueOf(nyt.l());
                    continue;
                case 40:
                    this.f26577d = Boolean.valueOf(nyt.i());
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
