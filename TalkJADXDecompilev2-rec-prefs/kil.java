package p000;

public final class kil extends nyx<kil> {
    public String f21858a;
    public String f21859b;
    public String f21860c;
    public String f21861d;
    public String f21862e;
    public Long f21863f;
    public Long f21864g;

    public /* synthetic */ nzf mo150a(nyt nyt) {
        return m25979b(nyt);
    }

    public kil() {
        this.f21858a = null;
        this.f21859b = null;
        this.f21860c = null;
        this.f21861d = null;
        this.f21862e = null;
        this.f21863f = null;
        this.f21864g = null;
        this.cachedSize = -1;
    }

    public void mo146a(nyu nyu) {
        if (this.f21858a != null) {
            nyu.a(1, this.f21858a);
        }
        if (this.f21859b != null) {
            nyu.a(2, this.f21859b);
        }
        if (this.f21860c != null) {
            nyu.a(3, this.f21860c);
        }
        if (this.f21861d != null) {
            nyu.a(4, this.f21861d);
        }
        if (this.f21862e != null) {
            nyu.a(5, this.f21862e);
        }
        if (this.f21863f != null) {
            nyu.b(6, this.f21863f.longValue());
        }
        if (this.f21864g != null) {
            nyu.b(7, this.f21864g.longValue());
        }
        super.mo146a(nyu);
    }

    protected int mo147b() {
        int b = super.mo147b();
        if (this.f21858a != null) {
            b += nyu.b(1, this.f21858a);
        }
        if (this.f21859b != null) {
            b += nyu.b(2, this.f21859b);
        }
        if (this.f21860c != null) {
            b += nyu.b(3, this.f21860c);
        }
        if (this.f21861d != null) {
            b += nyu.b(4, this.f21861d);
        }
        if (this.f21862e != null) {
            b += nyu.b(5, this.f21862e);
        }
        if (this.f21863f != null) {
            b += nyu.f(6, this.f21863f.longValue());
        }
        if (this.f21864g != null) {
            return b + nyu.f(7, this.f21864g.longValue());
        }
        return b;
    }

    private kil m25979b(nyt nyt) {
        while (true) {
            int a = nyt.a();
            switch (a) {
                case 0:
                    break;
                case 10:
                    this.f21858a = nyt.j();
                    continue;
                case wi.dH /*18*/:
                    this.f21859b = nyt.j();
                    continue;
                case wi.dx /*26*/:
                    this.f21860c = nyt.j();
                    continue;
                case 34:
                    this.f21861d = nyt.j();
                    continue;
                case 42:
                    this.f21862e = nyt.j();
                    continue;
                case 48:
                    this.f21863f = Long.valueOf(nyt.e());
                    continue;
                case 56:
                    this.f21864g = Long.valueOf(nyt.e());
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
