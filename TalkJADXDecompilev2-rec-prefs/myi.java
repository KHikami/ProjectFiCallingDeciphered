package p000;

public final class myi extends nyx<myi> {
    public Long f29146a;
    public Long f29147b;

    public /* synthetic */ nzf m33806a(nyt nyt) {
        return m33805b(nyt);
    }

    public myi() {
        this.f29146a = null;
        this.f29147b = null;
        this.cachedSize = -1;
    }

    public void m33807a(nyu nyu) {
        if (this.f29146a != null) {
            nyu.m37181b(1, this.f29146a.longValue());
        }
        if (this.f29147b != null) {
            nyu.m37181b(2, this.f29147b.longValue());
        }
        super.a(nyu);
    }

    protected int m33808b() {
        int b = super.b();
        if (this.f29146a != null) {
            b += nyu.m37148f(1, this.f29146a.longValue());
        }
        if (this.f29147b != null) {
            return b + nyu.m37148f(2, this.f29147b.longValue());
        }
        return b;
    }

    private myi m33805b(nyt nyt) {
        while (true) {
            int a = nyt.m37099a();
            switch (a) {
                case 0:
                    break;
                case 8:
                    this.f29146a = Long.valueOf(nyt.m37110e());
                    continue;
                case 16:
                    this.f29147b = Long.valueOf(nyt.m37110e());
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
