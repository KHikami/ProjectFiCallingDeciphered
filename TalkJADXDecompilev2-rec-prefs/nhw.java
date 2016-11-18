package p000;

public final class nhw extends nyx<nhw> {
    public Long f29853a;

    public /* synthetic */ nzf m35024a(nyt nyt) {
        return m35022b(nyt);
    }

    public nhw() {
        m35023d();
    }

    private nhw m35023d() {
        this.f29853a = null;
        this.unknownFieldData = null;
        this.cachedSize = -1;
        return this;
    }

    public void m35025a(nyu nyu) {
        if (this.f29853a != null) {
            nyu.m37181b(1, this.f29853a.longValue());
        }
        super.a(nyu);
    }

    protected int m35026b() {
        int b = super.b();
        if (this.f29853a != null) {
            return b + nyu.m37148f(1, this.f29853a.longValue());
        }
        return b;
    }

    private nhw m35022b(nyt nyt) {
        while (true) {
            int a = nyt.m37099a();
            switch (a) {
                case 0:
                    break;
                case 8:
                    this.f29853a = Long.valueOf(nyt.m37110e());
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
