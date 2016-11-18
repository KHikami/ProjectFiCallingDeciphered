package p000;

public final class njn extends nyx<njn> {
    public Long f29999a;

    public /* synthetic */ nzf m35249a(nyt nyt) {
        return m35247b(nyt);
    }

    public njn() {
        m35248d();
    }

    private njn m35248d() {
        this.f29999a = null;
        this.unknownFieldData = null;
        this.cachedSize = -1;
        return this;
    }

    public void m35250a(nyu nyu) {
        if (this.f29999a != null) {
            nyu.m37181b(1, this.f29999a.longValue());
        }
        super.a(nyu);
    }

    protected int m35251b() {
        int b = super.b();
        if (this.f29999a != null) {
            return b + nyu.m37148f(1, this.f29999a.longValue());
        }
        return b;
    }

    private njn m35247b(nyt nyt) {
        while (true) {
            int a = nyt.m37099a();
            switch (a) {
                case 0:
                    break;
                case 8:
                    this.f29999a = Long.valueOf(nyt.m37110e());
                    continue;
                default:
                    if (!super.a(nyt, a)) {
                        break;
                    }
                    continue;
            }
            return this;
        }
    }
}
