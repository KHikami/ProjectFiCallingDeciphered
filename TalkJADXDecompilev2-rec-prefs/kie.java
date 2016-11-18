package p000;

public final class kie extends nyx<kie> {
    public String f21830a;
    public String f21831b;
    public String f21832c;
    public String f21833d;
    public String f21834e;
    public Long f21835f;
    public Long f21836g;

    public /* synthetic */ nzf mo150a(nyt nyt) {
        return m25945b(nyt);
    }

    public kie() {
        m25946d();
    }

    private kie m25946d() {
        this.f21830a = null;
        this.f21831b = null;
        this.f21832c = null;
        this.f21833d = null;
        this.f21834e = null;
        this.f21835f = null;
        this.f21836g = null;
        this.unknownFieldData = null;
        this.cachedSize = -1;
        return this;
    }

    public void mo146a(nyu nyu) {
        if (this.f21830a != null) {
            nyu.a(1, this.f21830a);
        }
        if (this.f21831b != null) {
            nyu.a(2, this.f21831b);
        }
        if (this.f21832c != null) {
            nyu.a(3, this.f21832c);
        }
        if (this.f21833d != null) {
            nyu.a(4, this.f21833d);
        }
        if (this.f21834e != null) {
            nyu.a(5, this.f21834e);
        }
        if (this.f21835f != null) {
            nyu.b(6, this.f21835f.longValue());
        }
        if (this.f21836g != null) {
            nyu.b(7, this.f21836g.longValue());
        }
        super.mo146a(nyu);
    }

    protected int mo147b() {
        int b = super.mo147b();
        if (this.f21830a != null) {
            b += nyu.b(1, this.f21830a);
        }
        if (this.f21831b != null) {
            b += nyu.b(2, this.f21831b);
        }
        if (this.f21832c != null) {
            b += nyu.b(3, this.f21832c);
        }
        if (this.f21833d != null) {
            b += nyu.b(4, this.f21833d);
        }
        if (this.f21834e != null) {
            b += nyu.b(5, this.f21834e);
        }
        if (this.f21835f != null) {
            b += nyu.f(6, this.f21835f.longValue());
        }
        if (this.f21836g != null) {
            return b + nyu.f(7, this.f21836g.longValue());
        }
        return b;
    }

    private kie m25945b(nyt nyt) {
        while (true) {
            int a = nyt.a();
            switch (a) {
                case 0:
                    break;
                case 10:
                    this.f21830a = nyt.j();
                    continue;
                case wi.dH /*18*/:
                    this.f21831b = nyt.j();
                    continue;
                case wi.dx /*26*/:
                    this.f21832c = nyt.j();
                    continue;
                case 34:
                    this.f21833d = nyt.j();
                    continue;
                case 42:
                    this.f21834e = nyt.j();
                    continue;
                case 48:
                    this.f21835f = Long.valueOf(nyt.e());
                    continue;
                case 56:
                    this.f21836g = Long.valueOf(nyt.e());
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
