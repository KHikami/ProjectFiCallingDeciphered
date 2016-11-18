package p000;

public final class ksz extends nyx<ksz> {
    public Long f23189a;
    public Long f23190b;
    public String f23191c;
    public Integer f23192d;
    public kta f23193e;

    public /* synthetic */ nzf mo150a(nyt nyt) {
        return m27400b(nyt);
    }

    public ksz() {
        this.f23189a = null;
        this.f23190b = null;
        this.f23191c = null;
        this.f23192d = null;
        this.cachedSize = -1;
    }

    public void mo146a(nyu nyu) {
        if (this.f23189a != null) {
            nyu.b(1, this.f23189a.longValue());
        }
        if (this.f23190b != null) {
            nyu.b(2, this.f23190b.longValue());
        }
        if (this.f23191c != null) {
            nyu.a(3, this.f23191c);
        }
        if (this.f23193e != null) {
            nyu.b(4, this.f23193e);
        }
        if (this.f23192d != null) {
            nyu.a(5, this.f23192d.intValue());
        }
        super.mo146a(nyu);
    }

    protected int mo147b() {
        int b = super.mo147b();
        if (this.f23189a != null) {
            b += nyu.f(1, this.f23189a.longValue());
        }
        if (this.f23190b != null) {
            b += nyu.f(2, this.f23190b.longValue());
        }
        if (this.f23191c != null) {
            b += nyu.b(3, this.f23191c);
        }
        if (this.f23193e != null) {
            b += nyu.d(4, this.f23193e);
        }
        if (this.f23192d != null) {
            return b + nyu.f(5, this.f23192d.intValue());
        }
        return b;
    }

    private ksz m27400b(nyt nyt) {
        while (true) {
            int a = nyt.a();
            switch (a) {
                case 0:
                    break;
                case 8:
                    this.f23189a = Long.valueOf(nyt.e());
                    continue;
                case 16:
                    this.f23190b = Long.valueOf(nyt.e());
                    continue;
                case wi.dx /*26*/:
                    this.f23191c = nyt.j();
                    continue;
                case 34:
                    if (this.f23193e == null) {
                        this.f23193e = new kta();
                    }
                    nyt.a(this.f23193e);
                    continue;
                case 40:
                    this.f23192d = Integer.valueOf(nyt.f());
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
