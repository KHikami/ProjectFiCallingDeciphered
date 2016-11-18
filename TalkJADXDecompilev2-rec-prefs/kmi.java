package p000;

public final class kmi extends nyx<kmi> {
    public Long f22356a;
    public Integer f22357b;
    public Long f22358c;
    public Integer f22359d;

    public /* synthetic */ nzf mo150a(nyt nyt) {
        return m26532b(nyt);
    }

    public kmi() {
        m26533d();
    }

    private kmi m26533d() {
        this.f22356a = null;
        this.f22357b = null;
        this.f22358c = null;
        this.f22359d = null;
        this.unknownFieldData = null;
        this.cachedSize = -1;
        return this;
    }

    public void mo146a(nyu nyu) {
        if (this.f22356a != null) {
            nyu.b(1, this.f22356a.longValue());
        }
        if (this.f22357b != null) {
            nyu.a(2, this.f22357b.intValue());
        }
        if (this.f22358c != null) {
            nyu.b(3, this.f22358c.longValue());
        }
        if (this.f22359d != null) {
            nyu.a(4, this.f22359d.intValue());
        }
        super.mo146a(nyu);
    }

    protected int mo147b() {
        int b = super.mo147b();
        if (this.f22356a != null) {
            b += nyu.f(1, this.f22356a.longValue());
        }
        if (this.f22357b != null) {
            b += nyu.f(2, this.f22357b.intValue());
        }
        if (this.f22358c != null) {
            b += nyu.f(3, this.f22358c.longValue());
        }
        if (this.f22359d != null) {
            return b + nyu.f(4, this.f22359d.intValue());
        }
        return b;
    }

    private kmi m26532b(nyt nyt) {
        while (true) {
            int a = nyt.a();
            switch (a) {
                case 0:
                    break;
                case 8:
                    this.f22356a = Long.valueOf(nyt.e());
                    continue;
                case 16:
                    this.f22357b = Integer.valueOf(nyt.f());
                    continue;
                case wi.dA /*24*/:
                    this.f22358c = Long.valueOf(nyt.e());
                    continue;
                case 32:
                    this.f22359d = Integer.valueOf(nyt.f());
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
