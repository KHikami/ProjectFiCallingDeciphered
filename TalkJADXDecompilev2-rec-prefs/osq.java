package p000;

public final class osq extends nyx<osq> {
    public Integer f34174a;
    public Integer f34175b;

    public /* synthetic */ nzf m39605a(nyt nyt) {
        return m39603b(nyt);
    }

    public osq() {
        m39604d();
    }

    private osq m39604d() {
        this.f34175b = null;
        this.unknownFieldData = null;
        this.cachedSize = -1;
        return this;
    }

    public void m39606a(nyu nyu) {
        if (this.f34174a != null) {
            nyu.m37168a(1, this.f34174a.intValue());
        }
        if (this.f34175b != null) {
            nyu.m37186c(2, this.f34175b.intValue());
        }
        super.a(nyu);
    }

    protected int m39607b() {
        int b = super.b();
        if (this.f34174a != null) {
            b += nyu.m37147f(1, this.f34174a.intValue());
        }
        if (this.f34175b != null) {
            return b + nyu.m37151g(2, this.f34175b.intValue());
        }
        return b;
    }

    private osq m39603b(nyt nyt) {
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
                            this.f34174a = Integer.valueOf(a);
                            break;
                        default:
                            continue;
                    }
                case 16:
                    this.f34175b = Integer.valueOf(nyt.m37119l());
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
