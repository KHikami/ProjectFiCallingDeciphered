package p000;

public final class lxg extends nyx<lxg> {
    public ltr f26754a;
    public lor f26755b;
    public Long f26756c;

    public /* synthetic */ nzf mo150a(nyt nyt) {
        return m30987b(nyt);
    }

    public lxg() {
        m30988d();
    }

    private lxg m30988d() {
        this.f26754a = null;
        this.f26755b = null;
        this.f26756c = null;
        this.unknownFieldData = null;
        this.cachedSize = -1;
        return this;
    }

    public void mo146a(nyu nyu) {
        if (this.f26754a != null) {
            nyu.b(1, this.f26754a);
        }
        if (this.f26755b != null) {
            nyu.b(2, this.f26755b);
        }
        if (this.f26756c != null) {
            nyu.a(3, this.f26756c.longValue());
        }
        super.mo146a(nyu);
    }

    protected int mo147b() {
        int b = super.mo147b();
        if (this.f26754a != null) {
            b += nyu.d(1, this.f26754a);
        }
        if (this.f26755b != null) {
            b += nyu.d(2, this.f26755b);
        }
        if (this.f26756c != null) {
            return b + nyu.e(3, this.f26756c.longValue());
        }
        return b;
    }

    private lxg m30987b(nyt nyt) {
        while (true) {
            int a = nyt.a();
            switch (a) {
                case 0:
                    break;
                case 10:
                    if (this.f26754a == null) {
                        this.f26754a = new ltr();
                    }
                    nyt.a(this.f26754a);
                    continue;
                case wi.dH /*18*/:
                    if (this.f26755b == null) {
                        this.f26755b = new lor();
                    }
                    nyt.a(this.f26755b);
                    continue;
                case wi.dA /*24*/:
                    this.f26756c = Long.valueOf(nyt.d());
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
