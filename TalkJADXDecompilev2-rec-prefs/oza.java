package p000;

public final class oza extends nyx<oza> {
    public Integer f34681a;

    public /* synthetic */ nzf m39985a(nyt nyt) {
        return m39983b(nyt);
    }

    public oza() {
        m39984d();
    }

    private oza m39984d() {
        this.unknownFieldData = null;
        this.cachedSize = -1;
        return this;
    }

    public void m39986a(nyu nyu) {
        if (this.f34681a != null) {
            nyu.m37168a(1, this.f34681a.intValue());
        }
        super.a(nyu);
    }

    protected int m39987b() {
        int b = super.b();
        if (this.f34681a != null) {
            return b + nyu.m37147f(1, this.f34681a.intValue());
        }
        return b;
    }

    private oza m39983b(nyt nyt) {
        while (true) {
            int a = nyt.m37099a();
            switch (a) {
                case 0:
                    break;
                case 8:
                    a = nyt.m37112f();
                    switch (a) {
                        case 0:
                        case 1:
                        case 2:
                        case 3:
                            this.f34681a = Integer.valueOf(a);
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
