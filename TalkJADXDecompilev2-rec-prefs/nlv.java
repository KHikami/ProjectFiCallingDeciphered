package p000;

public final class nlv extends nyx<nlv> {
    public Integer f30184a;
    public Boolean f30185b;

    public /* synthetic */ nzf m35563a(nyt nyt) {
        return m35561b(nyt);
    }

    public nlv() {
        m35562d();
    }

    private nlv m35562d() {
        this.f30185b = null;
        this.unknownFieldData = null;
        this.cachedSize = -1;
        return this;
    }

    public void m35564a(nyu nyu) {
        if (this.f30184a != null) {
            nyu.m37168a(1, this.f30184a.intValue());
        }
        if (this.f30185b != null) {
            nyu.m37172a(2, this.f30185b.booleanValue());
        }
        super.a(nyu);
    }

    protected int m35565b() {
        int b = super.b();
        if (this.f30184a != null) {
            b += nyu.m37147f(1, this.f30184a.intValue());
        }
        if (this.f30185b == null) {
            return b;
        }
        this.f30185b.booleanValue();
        return b + (nyu.m37154h(2) + 1);
    }

    private nlv m35561b(nyt nyt) {
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
                            this.f30184a = Integer.valueOf(a);
                            break;
                        default:
                            continue;
                    }
                case 16:
                    this.f30185b = Boolean.valueOf(nyt.m37116i());
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
