package p000;

public final class kuq extends nyx<kuq> {
    public Long f23485a;
    public Long f23486b;
    public String f23487c;
    public Integer f23488d;
    public kur f23489e;

    public /* synthetic */ nzf mo150a(nyt nyt) {
        return m27600b(nyt);
    }

    public kuq() {
        m27601d();
    }

    private kuq m27601d() {
        this.f23485a = null;
        this.f23486b = null;
        this.f23487c = null;
        this.f23488d = null;
        this.f23489e = null;
        this.unknownFieldData = null;
        this.cachedSize = -1;
        return this;
    }

    public void mo146a(nyu nyu) {
        if (this.f23485a != null) {
            nyu.b(1, this.f23485a.longValue());
        }
        if (this.f23486b != null) {
            nyu.b(2, this.f23486b.longValue());
        }
        if (this.f23487c != null) {
            nyu.a(3, this.f23487c);
        }
        if (this.f23489e != null) {
            nyu.b(4, this.f23489e);
        }
        if (this.f23488d != null) {
            nyu.a(5, this.f23488d.intValue());
        }
        super.mo146a(nyu);
    }

    protected int mo147b() {
        int b = super.mo147b();
        if (this.f23485a != null) {
            b += nyu.f(1, this.f23485a.longValue());
        }
        if (this.f23486b != null) {
            b += nyu.f(2, this.f23486b.longValue());
        }
        if (this.f23487c != null) {
            b += nyu.b(3, this.f23487c);
        }
        if (this.f23489e != null) {
            b += nyu.d(4, this.f23489e);
        }
        if (this.f23488d != null) {
            return b + nyu.f(5, this.f23488d.intValue());
        }
        return b;
    }

    private kuq m27600b(nyt nyt) {
        while (true) {
            int a = nyt.a();
            switch (a) {
                case 0:
                    break;
                case 8:
                    this.f23485a = Long.valueOf(nyt.e());
                    continue;
                case 16:
                    this.f23486b = Long.valueOf(nyt.e());
                    continue;
                case wi.dx /*26*/:
                    this.f23487c = nyt.j();
                    continue;
                case 34:
                    if (this.f23489e == null) {
                        this.f23489e = new kur();
                    }
                    nyt.a(this.f23489e);
                    continue;
                case 40:
                    this.f23488d = Integer.valueOf(nyt.f());
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
