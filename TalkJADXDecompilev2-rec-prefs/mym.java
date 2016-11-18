package p000;

public final class mym extends nyx<mym> {
    public nak f29158a;
    public Integer f29159b;

    public /* synthetic */ nzf m33826a(nyt nyt) {
        return m33824b(nyt);
    }

    public mym() {
        m33825d();
    }

    private mym m33825d() {
        this.f29158a = null;
        this.unknownFieldData = null;
        this.cachedSize = -1;
        return this;
    }

    public void m33827a(nyu nyu) {
        if (this.f29158a != null) {
            nyu.m37182b(1, this.f29158a);
        }
        if (this.f29159b != null) {
            nyu.m37168a(2, this.f29159b.intValue());
        }
        super.a(nyu);
    }

    protected int m33828b() {
        int b = super.b();
        if (this.f29158a != null) {
            b += nyu.m37145d(1, this.f29158a);
        }
        if (this.f29159b != null) {
            return b + nyu.m37147f(2, this.f29159b.intValue());
        }
        return b;
    }

    private mym m33824b(nyt nyt) {
        while (true) {
            int a = nyt.m37099a();
            switch (a) {
                case 0:
                    break;
                case 10:
                    if (this.f29158a == null) {
                        this.f29158a = new nak();
                    }
                    nyt.m37101a(this.f29158a);
                    continue;
                case 16:
                    a = nyt.m37112f();
                    switch (a) {
                        case 0:
                        case 1:
                        case 2:
                            this.f29159b = Integer.valueOf(a);
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
