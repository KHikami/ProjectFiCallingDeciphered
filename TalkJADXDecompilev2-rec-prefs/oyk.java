package p000;

public final class oyk extends nyx<oyk> {
    public oys f34645a;
    public Integer f34646b;

    public /* synthetic */ nzf m39917a(nyt nyt) {
        return m39915b(nyt);
    }

    public oyk() {
        m39916d();
    }

    private oyk m39916d() {
        this.f34645a = null;
        this.unknownFieldData = null;
        this.cachedSize = -1;
        return this;
    }

    public void m39918a(nyu nyu) {
        if (this.f34645a != null) {
            nyu.m37182b(1, this.f34645a);
        }
        if (this.f34646b != null) {
            nyu.m37168a(2, this.f34646b.intValue());
        }
        super.a(nyu);
    }

    protected int m39919b() {
        int b = super.b();
        if (this.f34645a != null) {
            b += nyu.m37145d(1, this.f34645a);
        }
        if (this.f34646b != null) {
            return b + nyu.m37147f(2, this.f34646b.intValue());
        }
        return b;
    }

    private oyk m39915b(nyt nyt) {
        while (true) {
            int a = nyt.m37099a();
            switch (a) {
                case 0:
                    break;
                case 10:
                    if (this.f34645a == null) {
                        this.f34645a = new oys();
                    }
                    nyt.m37101a(this.f34645a);
                    continue;
                case 16:
                    a = nyt.m37112f();
                    switch (a) {
                        case 0:
                        case 1:
                        case 2:
                            this.f34646b = Integer.valueOf(a);
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
