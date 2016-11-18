package p000;

public final class nnw extends nyx<nnw> {
    public Long f30315a;

    public /* synthetic */ nzf m35838a(nyt nyt) {
        return m35836b(nyt);
    }

    public nnw() {
        m35837d();
    }

    private nnw m35837d() {
        this.f30315a = null;
        this.unknownFieldData = null;
        this.cachedSize = -1;
        return this;
    }

    public void m35839a(nyu nyu) {
        if (this.f30315a != null) {
            nyu.m37181b(1, this.f30315a.longValue());
        }
        super.a(nyu);
    }

    protected int m35840b() {
        int b = super.b();
        if (this.f30315a != null) {
            return b + nyu.m37148f(1, this.f30315a.longValue());
        }
        return b;
    }

    private nnw m35836b(nyt nyt) {
        while (true) {
            int a = nyt.m37099a();
            switch (a) {
                case 0:
                    break;
                case 8:
                    this.f30315a = Long.valueOf(nyt.m37110e());
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
