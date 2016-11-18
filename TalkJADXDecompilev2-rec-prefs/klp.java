package p000;

public final class klp extends nyx<klp> {
    public Long f22280a;
    public Long f22281b;

    public /* synthetic */ nzf mo150a(nyt nyt) {
        return m26423b(nyt);
    }

    public klp() {
        m26424d();
    }

    private klp m26424d() {
        this.f22280a = null;
        this.f22281b = null;
        this.unknownFieldData = null;
        this.cachedSize = -1;
        return this;
    }

    public void mo146a(nyu nyu) {
        if (this.f22280a != null) {
            nyu.b(1, this.f22280a.longValue());
        }
        if (this.f22281b != null) {
            nyu.b(2, this.f22281b.longValue());
        }
        super.mo146a(nyu);
    }

    protected int mo147b() {
        int b = super.mo147b();
        if (this.f22280a != null) {
            b += nyu.f(1, this.f22280a.longValue());
        }
        if (this.f22281b != null) {
            return b + nyu.f(2, this.f22281b.longValue());
        }
        return b;
    }

    private klp m26423b(nyt nyt) {
        while (true) {
            int a = nyt.a();
            switch (a) {
                case 0:
                    break;
                case 8:
                    this.f22280a = Long.valueOf(nyt.e());
                    continue;
                case 16:
                    this.f22281b = Long.valueOf(nyt.e());
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
