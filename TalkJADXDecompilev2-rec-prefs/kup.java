package p000;

public final class kup extends nyx<kup> {
    public kuf f23479a;
    public Long f23480b;
    public Integer f23481c;
    public Integer f23482d;
    public String f23483e;
    public String f23484f;

    public /* synthetic */ nzf mo150a(nyt nyt) {
        return m27596b(nyt);
    }

    public kup() {
        this.f23480b = null;
        this.f23481c = null;
        this.f23482d = null;
        this.f23483e = null;
        this.f23484f = null;
        this.cachedSize = -1;
    }

    public void mo146a(nyu nyu) {
        if (this.f23479a != null) {
            nyu.b(1, this.f23479a);
        }
        nyu.b(2, this.f23480b.longValue());
        if (this.f23481c != null) {
            nyu.a(3, this.f23481c.intValue());
        }
        if (this.f23482d != null) {
            nyu.a(4, this.f23482d.intValue());
        }
        if (this.f23483e != null) {
            nyu.a(5, this.f23483e);
        }
        if (this.f23484f != null) {
            nyu.a(6, this.f23484f);
        }
        super.mo146a(nyu);
    }

    protected int mo147b() {
        int b = super.mo147b();
        if (this.f23479a != null) {
            b += nyu.d(1, this.f23479a);
        }
        b += nyu.f(2, this.f23480b.longValue());
        if (this.f23481c != null) {
            b += nyu.f(3, this.f23481c.intValue());
        }
        if (this.f23482d != null) {
            b += nyu.f(4, this.f23482d.intValue());
        }
        if (this.f23483e != null) {
            b += nyu.b(5, this.f23483e);
        }
        if (this.f23484f != null) {
            return b + nyu.b(6, this.f23484f);
        }
        return b;
    }

    private kup m27596b(nyt nyt) {
        while (true) {
            int a = nyt.a();
            switch (a) {
                case 0:
                    break;
                case 10:
                    if (this.f23479a == null) {
                        this.f23479a = new kuf();
                    }
                    nyt.a(this.f23479a);
                    continue;
                case 16:
                    this.f23480b = Long.valueOf(nyt.e());
                    continue;
                case wi.dA /*24*/:
                    this.f23481c = Integer.valueOf(nyt.f());
                    continue;
                case 32:
                    this.f23482d = Integer.valueOf(nyt.f());
                    continue;
                case 42:
                    this.f23483e = nyt.j();
                    continue;
                case 50:
                    this.f23484f = nyt.j();
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
