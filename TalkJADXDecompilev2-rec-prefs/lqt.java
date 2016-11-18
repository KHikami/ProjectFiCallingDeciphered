package p000;

public final class lqt extends nyx<lqt> {
    public String f26167a;
    public Integer f26168b;
    public Integer f26169c;
    public String f26170d;
    public String f26171e;
    public String f26172f;
    public lod f26173g;

    public /* synthetic */ nzf mo150a(nyt nyt) {
        return m30092b(nyt);
    }

    public lqt() {
        m30093d();
    }

    private lqt m30093d() {
        this.f26167a = null;
        this.f26168b = null;
        this.f26169c = null;
        this.f26170d = null;
        this.f26171e = null;
        this.f26172f = null;
        this.f26173g = null;
        this.unknownFieldData = null;
        this.cachedSize = -1;
        return this;
    }

    public void mo146a(nyu nyu) {
        if (this.f26167a != null) {
            nyu.a(1, this.f26167a);
        }
        if (this.f26168b != null) {
            nyu.a(2, this.f26168b.intValue());
        }
        if (this.f26169c != null) {
            nyu.a(3, this.f26169c.intValue());
        }
        if (this.f26170d != null) {
            nyu.a(4, this.f26170d);
        }
        if (this.f26171e != null) {
            nyu.a(5, this.f26171e);
        }
        if (this.f26172f != null) {
            nyu.a(6, this.f26172f);
        }
        if (this.f26173g != null) {
            nyu.b(7, this.f26173g);
        }
        super.mo146a(nyu);
    }

    protected int mo147b() {
        int b = super.mo147b();
        if (this.f26167a != null) {
            b += nyu.b(1, this.f26167a);
        }
        if (this.f26168b != null) {
            b += nyu.f(2, this.f26168b.intValue());
        }
        if (this.f26169c != null) {
            b += nyu.f(3, this.f26169c.intValue());
        }
        if (this.f26170d != null) {
            b += nyu.b(4, this.f26170d);
        }
        if (this.f26171e != null) {
            b += nyu.b(5, this.f26171e);
        }
        if (this.f26172f != null) {
            b += nyu.b(6, this.f26172f);
        }
        if (this.f26173g != null) {
            return b + nyu.d(7, this.f26173g);
        }
        return b;
    }

    private lqt m30092b(nyt nyt) {
        while (true) {
            int a = nyt.a();
            switch (a) {
                case 0:
                    break;
                case 10:
                    this.f26167a = nyt.j();
                    continue;
                case 16:
                    this.f26168b = Integer.valueOf(nyt.f());
                    continue;
                case wi.dA /*24*/:
                    this.f26169c = Integer.valueOf(nyt.f());
                    continue;
                case 34:
                    this.f26170d = nyt.j();
                    continue;
                case 42:
                    this.f26171e = nyt.j();
                    continue;
                case 50:
                    this.f26172f = nyt.j();
                    continue;
                case 58:
                    if (this.f26173g == null) {
                        this.f26173g = new lod();
                    }
                    nyt.a(this.f26173g);
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
