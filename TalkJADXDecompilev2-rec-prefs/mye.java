package p000;

public final class mye extends nyx<mye> {
    public Long f29135a;
    public Long f29136b;

    public /* synthetic */ nzf m33787a(nyt nyt) {
        return m33785b(nyt);
    }

    public mye() {
        m33786d();
    }

    private mye m33786d() {
        this.f29135a = null;
        this.f29136b = null;
        this.unknownFieldData = null;
        this.cachedSize = -1;
        return this;
    }

    public void m33788a(nyu nyu) {
        if (this.f29135a != null) {
            nyu.m37181b(1, this.f29135a.longValue());
        }
        if (this.f29136b != null) {
            nyu.m37181b(2, this.f29136b.longValue());
        }
        super.a(nyu);
    }

    protected int m33789b() {
        int b = super.b();
        if (this.f29135a != null) {
            b += nyu.m37148f(1, this.f29135a.longValue());
        }
        if (this.f29136b != null) {
            return b + nyu.m37148f(2, this.f29136b.longValue());
        }
        return b;
    }

    private mye m33785b(nyt nyt) {
        while (true) {
            int a = nyt.m37099a();
            switch (a) {
                case 0:
                    break;
                case 8:
                    this.f29135a = Long.valueOf(nyt.m37110e());
                    continue;
                case 16:
                    this.f29136b = Long.valueOf(nyt.m37110e());
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
