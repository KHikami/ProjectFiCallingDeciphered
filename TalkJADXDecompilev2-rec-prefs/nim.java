package p000;

public final class nim extends nyx<nim> {
    public ofv f29895a;
    public Long f29896b;

    public /* synthetic */ nzf m35111a(nyt nyt) {
        return m35109b(nyt);
    }

    public nim() {
        m35110d();
    }

    private nim m35110d() {
        this.f29895a = null;
        this.f29896b = null;
        this.unknownFieldData = null;
        this.cachedSize = -1;
        return this;
    }

    public void m35112a(nyu nyu) {
        if (this.f29895a != null) {
            nyu.m37182b(1, this.f29895a);
        }
        if (this.f29896b != null) {
            nyu.m37181b(2, this.f29896b.longValue());
        }
        super.a(nyu);
    }

    protected int m35113b() {
        int b = super.b();
        if (this.f29895a != null) {
            b += nyu.m37145d(1, this.f29895a);
        }
        if (this.f29896b != null) {
            return b + nyu.m37148f(2, this.f29896b.longValue());
        }
        return b;
    }

    private nim m35109b(nyt nyt) {
        while (true) {
            int a = nyt.m37099a();
            switch (a) {
                case 0:
                    break;
                case 10:
                    if (this.f29895a == null) {
                        this.f29895a = new ofv();
                    }
                    nyt.m37101a(this.f29895a);
                    continue;
                case 16:
                    this.f29896b = Long.valueOf(nyt.m37110e());
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
