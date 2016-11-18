package p000;

public final class kvh extends nyx<kvh> {
    public String f23601a;
    public String f23602b;
    public Boolean f23603c;
    public String f23604d;
    public String f23605e;

    public /* synthetic */ nzf mo150a(nyt nyt) {
        return m27682b(nyt);
    }

    public kvh() {
        this.f23601a = null;
        this.f23602b = null;
        this.f23603c = null;
        this.f23604d = null;
        this.f23605e = null;
        this.cachedSize = -1;
    }

    public void mo146a(nyu nyu) {
        if (this.f23601a != null) {
            nyu.a(1, this.f23601a);
        }
        if (this.f23602b != null) {
            nyu.a(2, this.f23602b);
        }
        if (this.f23603c != null) {
            nyu.a(3, this.f23603c.booleanValue());
        }
        if (this.f23604d != null) {
            nyu.a(4, this.f23604d);
        }
        if (this.f23605e != null) {
            nyu.a(5, this.f23605e);
        }
        super.mo146a(nyu);
    }

    protected int mo147b() {
        int b = super.mo147b();
        if (this.f23601a != null) {
            b += nyu.b(1, this.f23601a);
        }
        if (this.f23602b != null) {
            b += nyu.b(2, this.f23602b);
        }
        if (this.f23603c != null) {
            this.f23603c.booleanValue();
            b += nyu.h(3) + 1;
        }
        if (this.f23604d != null) {
            b += nyu.b(4, this.f23604d);
        }
        if (this.f23605e != null) {
            return b + nyu.b(5, this.f23605e);
        }
        return b;
    }

    private kvh m27682b(nyt nyt) {
        while (true) {
            int a = nyt.a();
            switch (a) {
                case 0:
                    break;
                case 10:
                    this.f23601a = nyt.j();
                    continue;
                case wi.dH /*18*/:
                    this.f23602b = nyt.j();
                    continue;
                case wi.dA /*24*/:
                    this.f23603c = Boolean.valueOf(nyt.i());
                    continue;
                case 34:
                    this.f23604d = nyt.j();
                    continue;
                case 42:
                    this.f23605e = nyt.j();
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
