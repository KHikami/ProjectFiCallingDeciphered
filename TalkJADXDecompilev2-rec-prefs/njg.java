package p000;

public final class njg extends nyx<njg> {
    public ofv f29980a;
    public Long f29981b;

    public /* synthetic */ nzf m35213a(nyt nyt) {
        return m35211b(nyt);
    }

    public njg() {
        m35212d();
    }

    private njg m35212d() {
        this.f29980a = null;
        this.f29981b = null;
        this.unknownFieldData = null;
        this.cachedSize = -1;
        return this;
    }

    public void m35214a(nyu nyu) {
        if (this.f29980a != null) {
            nyu.m37182b(1, this.f29980a);
        }
        if (this.f29981b != null) {
            nyu.m37181b(2, this.f29981b.longValue());
        }
        super.a(nyu);
    }

    protected int m35215b() {
        int b = super.b();
        if (this.f29980a != null) {
            b += nyu.m37145d(1, this.f29980a);
        }
        if (this.f29981b != null) {
            return b + nyu.m37148f(2, this.f29981b.longValue());
        }
        return b;
    }

    private njg m35211b(nyt nyt) {
        while (true) {
            int a = nyt.m37099a();
            switch (a) {
                case 0:
                    break;
                case 10:
                    if (this.f29980a == null) {
                        this.f29980a = new ofv();
                    }
                    nyt.m37101a(this.f29980a);
                    continue;
                case 16:
                    this.f29981b = Long.valueOf(nyt.m37110e());
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
