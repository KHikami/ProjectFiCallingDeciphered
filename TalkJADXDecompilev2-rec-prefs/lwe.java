package p000;

public final class lwe extends nyx<lwe> {
    public Integer f26668a;
    public ltj f26669b;
    public Long f26670c;
    public Long f26671d;
    public lnr f26672e;
    public byte[] f26673f;
    public String f26674g;
    public String f26675h;

    public /* synthetic */ nzf mo150a(nyt nyt) {
        return m30842b(nyt);
    }

    public lwe() {
        m30843d();
    }

    private lwe m30843d() {
        this.f26669b = null;
        this.f26670c = null;
        this.f26671d = null;
        this.f26672e = null;
        this.f26673f = null;
        this.f26674g = null;
        this.f26675h = null;
        this.unknownFieldData = null;
        this.cachedSize = -1;
        return this;
    }

    public void mo146a(nyu nyu) {
        if (this.f26668a != null) {
            nyu.a(1, this.f26668a.intValue());
        }
        if (this.f26673f != null) {
            nyu.a(2, this.f26673f);
        }
        if (this.f26670c != null) {
            nyu.a(3, this.f26670c.longValue());
        }
        if (this.f26669b != null) {
            nyu.b(4, this.f26669b);
        }
        if (this.f26671d != null) {
            nyu.a(5, this.f26671d.longValue());
        }
        if (this.f26672e != null) {
            nyu.b(6, this.f26672e);
        }
        if (this.f26674g != null) {
            nyu.a(7, this.f26674g);
        }
        if (this.f26675h != null) {
            nyu.a(8, this.f26675h);
        }
        super.mo146a(nyu);
    }

    protected int mo147b() {
        int b = super.mo147b();
        if (this.f26668a != null) {
            b += nyu.f(1, this.f26668a.intValue());
        }
        if (this.f26673f != null) {
            b += nyu.b(2, this.f26673f);
        }
        if (this.f26670c != null) {
            b += nyu.e(3, this.f26670c.longValue());
        }
        if (this.f26669b != null) {
            b += nyu.d(4, this.f26669b);
        }
        if (this.f26671d != null) {
            b += nyu.e(5, this.f26671d.longValue());
        }
        if (this.f26672e != null) {
            b += nyu.d(6, this.f26672e);
        }
        if (this.f26674g != null) {
            b += nyu.b(7, this.f26674g);
        }
        if (this.f26675h != null) {
            return b + nyu.b(8, this.f26675h);
        }
        return b;
    }

    private lwe m30842b(nyt nyt) {
        while (true) {
            int a = nyt.a();
            switch (a) {
                case 0:
                    break;
                case 8:
                    a = nyt.f();
                    switch (a) {
                        case 0:
                        case 1:
                        case 2:
                            this.f26668a = Integer.valueOf(a);
                            break;
                        default:
                            continue;
                    }
                case wi.dH /*18*/:
                    this.f26673f = nyt.k();
                    continue;
                case wi.dA /*24*/:
                    this.f26670c = Long.valueOf(nyt.d());
                    continue;
                case 34:
                    if (this.f26669b == null) {
                        this.f26669b = new ltj();
                    }
                    nyt.a(this.f26669b);
                    continue;
                case 40:
                    this.f26671d = Long.valueOf(nyt.d());
                    continue;
                case 50:
                    if (this.f26672e == null) {
                        this.f26672e = new lnr();
                    }
                    nyt.a(this.f26672e);
                    continue;
                case 58:
                    this.f26674g = nyt.j();
                    continue;
                case 66:
                    this.f26675h = nyt.j();
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
