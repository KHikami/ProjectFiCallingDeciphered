package p000;

public final class mcm extends nyx<mcm> {
    public Integer f27335a;
    public String f27336b;
    public Integer f27337c;
    public Integer f27338d;
    public lks f27339e;

    public /* synthetic */ nzf mo150a(nyt nyt) {
        return m31727b(nyt);
    }

    public mcm() {
        m31728d();
    }

    private mcm m31728d() {
        this.f27335a = null;
        this.f27336b = null;
        this.f27337c = null;
        this.f27338d = null;
        this.f27339e = null;
        this.unknownFieldData = null;
        this.cachedSize = -1;
        return this;
    }

    public void mo146a(nyu nyu) {
        if (this.f27335a != null) {
            nyu.a(1, this.f27335a.intValue());
        }
        if (this.f27336b != null) {
            nyu.a(2, this.f27336b);
        }
        if (this.f27337c != null) {
            nyu.a(3, this.f27337c.intValue());
        }
        if (this.f27338d != null) {
            nyu.a(4, this.f27338d.intValue());
        }
        if (this.f27339e != null) {
            nyu.b(5, this.f27339e);
        }
        super.mo146a(nyu);
    }

    protected int mo147b() {
        int b = super.mo147b();
        if (this.f27335a != null) {
            b += nyu.f(1, this.f27335a.intValue());
        }
        if (this.f27336b != null) {
            b += nyu.b(2, this.f27336b);
        }
        if (this.f27337c != null) {
            b += nyu.f(3, this.f27337c.intValue());
        }
        if (this.f27338d != null) {
            b += nyu.f(4, this.f27338d.intValue());
        }
        if (this.f27339e != null) {
            return b + nyu.d(5, this.f27339e);
        }
        return b;
    }

    private mcm m31727b(nyt nyt) {
        while (true) {
            int a = nyt.a();
            switch (a) {
                case 0:
                    break;
                case 8:
                    this.f27335a = Integer.valueOf(nyt.f());
                    continue;
                case wi.dH /*18*/:
                    this.f27336b = nyt.j();
                    continue;
                case wi.dA /*24*/:
                    this.f27337c = Integer.valueOf(nyt.f());
                    continue;
                case 32:
                    this.f27338d = Integer.valueOf(nyt.f());
                    continue;
                case 42:
                    if (this.f27339e == null) {
                        this.f27339e = new lks();
                    }
                    nyt.a(this.f27339e);
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
