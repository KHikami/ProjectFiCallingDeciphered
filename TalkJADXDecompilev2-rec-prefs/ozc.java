package p000;

public final class ozc extends nyx<ozc> {
    public Integer f34682a;

    public /* synthetic */ nzf m39993a(nyt nyt) {
        return m39991b(nyt);
    }

    public ozc() {
        m39992d();
    }

    private ozc m39992d() {
        this.unknownFieldData = null;
        this.cachedSize = -1;
        return this;
    }

    public void m39994a(nyu nyu) {
        if (this.f34682a != null) {
            nyu.m37168a(1, this.f34682a.intValue());
        }
        super.a(nyu);
    }

    protected int m39995b() {
        int b = super.b();
        if (this.f34682a != null) {
            return b + nyu.m37147f(1, this.f34682a.intValue());
        }
        return b;
    }

    private ozc m39991b(nyt nyt) {
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
                            this.f34682a = Integer.valueOf(a);
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
