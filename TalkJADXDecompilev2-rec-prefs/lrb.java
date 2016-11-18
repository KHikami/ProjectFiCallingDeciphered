package p000;

public final class lrb extends nyx<lrb> {
    public low f26192a;
    public Boolean f26193b;
    public Boolean f26194c;
    public lqk f26195d;
    public lqk f26196e;
    public Integer f26197f;
    public Integer f26198g;
    public Boolean f26199h;
    public lup requestHeader;

    public /* synthetic */ nzf mo150a(nyt nyt) {
        return m30135b(nyt);
    }

    public lrb() {
        m30136d();
    }

    private lrb m30136d() {
        this.requestHeader = null;
        this.f26192a = null;
        this.f26193b = null;
        this.f26194c = null;
        this.f26195d = null;
        this.f26196e = null;
        this.f26197f = null;
        this.f26199h = null;
        this.unknownFieldData = null;
        this.cachedSize = -1;
        return this;
    }

    public void mo146a(nyu nyu) {
        if (this.requestHeader != null) {
            nyu.b(1, this.requestHeader);
        }
        if (this.f26192a != null) {
            nyu.b(2, this.f26192a);
        }
        if (this.f26193b != null) {
            nyu.a(3, this.f26193b.booleanValue());
        }
        if (this.f26194c != null) {
            nyu.a(4, this.f26194c.booleanValue());
        }
        if (this.f26197f != null) {
            nyu.a(6, this.f26197f.intValue());
        }
        if (this.f26195d != null) {
            nyu.b(7, this.f26195d);
        }
        if (this.f26199h != null) {
            nyu.a(8, this.f26199h.booleanValue());
        }
        if (this.f26198g != null) {
            nyu.a(9, this.f26198g.intValue());
        }
        if (this.f26196e != null) {
            nyu.b(11, this.f26196e);
        }
        super.mo146a(nyu);
    }

    protected int mo147b() {
        int b = super.mo147b();
        if (this.requestHeader != null) {
            b += nyu.d(1, this.requestHeader);
        }
        if (this.f26192a != null) {
            b += nyu.d(2, this.f26192a);
        }
        if (this.f26193b != null) {
            this.f26193b.booleanValue();
            b += nyu.h(3) + 1;
        }
        if (this.f26194c != null) {
            this.f26194c.booleanValue();
            b += nyu.h(4) + 1;
        }
        if (this.f26197f != null) {
            b += nyu.f(6, this.f26197f.intValue());
        }
        if (this.f26195d != null) {
            b += nyu.d(7, this.f26195d);
        }
        if (this.f26199h != null) {
            this.f26199h.booleanValue();
            b += nyu.h(8) + 1;
        }
        if (this.f26198g != null) {
            b += nyu.f(9, this.f26198g.intValue());
        }
        if (this.f26196e != null) {
            return b + nyu.d(11, this.f26196e);
        }
        return b;
    }

    private lrb m30135b(nyt nyt) {
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
                    if (this.f26192a == null) {
                        this.f26192a = new low();
                    }
                    nyt.a(this.f26192a);
                    continue;
                case wi.dA /*24*/:
                    this.f26193b = Boolean.valueOf(nyt.i());
                    continue;
                case 32:
                    this.f26194c = Boolean.valueOf(nyt.i());
                    continue;
                case 48:
                    this.f26197f = Integer.valueOf(nyt.f());
                    continue;
                case 58:
                    if (this.f26195d == null) {
                        this.f26195d = new lqk();
                    }
                    nyt.a(this.f26195d);
                    continue;
                case 64:
                    this.f26199h = Boolean.valueOf(nyt.i());
                    continue;
                case 72:
                    a = nyt.f();
                    switch (a) {
                        case 0:
                        case 1:
                            this.f26198g = Integer.valueOf(a);
                            break;
                        default:
                            continue;
                    }
                case 90:
                    if (this.f26196e == null) {
                        this.f26196e = new lqk();
                    }
                    nyt.a(this.f26196e);
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
