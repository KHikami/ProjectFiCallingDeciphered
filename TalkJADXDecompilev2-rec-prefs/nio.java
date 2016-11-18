package p000;

public final class nio extends nyx<nio> {
    public Long f29900a;
    public Integer f29901b;

    public /* synthetic */ nzf m35121a(nyt nyt) {
        return m35119b(nyt);
    }

    public nio() {
        m35120d();
    }

    private nio m35120d() {
        this.f29900a = null;
        this.unknownFieldData = null;
        this.cachedSize = -1;
        return this;
    }

    public void m35122a(nyu nyu) {
        if (this.f29900a != null) {
            nyu.m37181b(1, this.f29900a.longValue());
        }
        if (this.f29901b != null) {
            nyu.m37168a(2, this.f29901b.intValue());
        }
        super.a(nyu);
    }

    protected int m35123b() {
        int b = super.b();
        if (this.f29900a != null) {
            b += nyu.m37148f(1, this.f29900a.longValue());
        }
        if (this.f29901b != null) {
            return b + nyu.m37147f(2, this.f29901b.intValue());
        }
        return b;
    }

    private nio m35119b(nyt nyt) {
        while (true) {
            int a = nyt.m37099a();
            switch (a) {
                case 0:
                    break;
                case 8:
                    this.f29900a = Long.valueOf(nyt.m37110e());
                    continue;
                case 16:
                    a = nyt.m37112f();
                    switch (a) {
                        case 0:
                        case 1:
                        case 2:
                            this.f29901b = Integer.valueOf(a);
                            break;
                        default:
                            continue;
                    }
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
