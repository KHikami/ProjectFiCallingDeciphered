package p000;

public final class kvo extends nyx<kvo> {
    public ofx f23650a;
    public String f23651b;
    public String f23652c;
    public String f23653d;
    public Integer f23654e;
    public String f23655f;

    public /* synthetic */ nzf mo150a(nyt nyt) {
        return m27712b(nyt);
    }

    public kvo() {
        this.f23651b = null;
        this.f23652c = null;
        this.f23653d = null;
        this.f23654e = null;
        this.f23655f = null;
        this.cachedSize = -1;
    }

    public void mo146a(nyu nyu) {
        if (this.f23650a != null) {
            nyu.b(1, this.f23650a);
        }
        if (this.f23651b != null) {
            nyu.a(2, this.f23651b);
        }
        if (this.f23652c != null) {
            nyu.a(3, this.f23652c);
        }
        if (this.f23653d != null) {
            nyu.a(4, this.f23653d);
        }
        if (this.f23654e != null) {
            nyu.a(5, this.f23654e.intValue());
        }
        if (this.f23655f != null) {
            nyu.a(6, this.f23655f);
        }
        super.mo146a(nyu);
    }

    protected int mo147b() {
        int b = super.mo147b();
        if (this.f23650a != null) {
            b += nyu.d(1, this.f23650a);
        }
        if (this.f23651b != null) {
            b += nyu.b(2, this.f23651b);
        }
        if (this.f23652c != null) {
            b += nyu.b(3, this.f23652c);
        }
        if (this.f23653d != null) {
            b += nyu.b(4, this.f23653d);
        }
        if (this.f23654e != null) {
            b += nyu.f(5, this.f23654e.intValue());
        }
        if (this.f23655f != null) {
            return b + nyu.b(6, this.f23655f);
        }
        return b;
    }

    private kvo m27712b(nyt nyt) {
        while (true) {
            int a = nyt.a();
            switch (a) {
                case 0:
                    break;
                case 10:
                    if (this.f23650a == null) {
                        this.f23650a = new ofx();
                    }
                    nyt.a(this.f23650a);
                    continue;
                case wi.dH /*18*/:
                    this.f23651b = nyt.j();
                    continue;
                case wi.dx /*26*/:
                    this.f23652c = nyt.j();
                    continue;
                case 34:
                    this.f23653d = nyt.j();
                    continue;
                case 40:
                    this.f23654e = Integer.valueOf(nyt.f());
                    continue;
                case 50:
                    this.f23655f = nyt.j();
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
