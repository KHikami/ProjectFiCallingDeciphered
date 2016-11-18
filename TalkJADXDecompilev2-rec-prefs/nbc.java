package p000;

public final class nbc extends nyx<nbc> {
    public String f29416a;
    public Integer f29417b;

    public /* synthetic */ nzf m34151a(nyt nyt) {
        return m34149b(nyt);
    }

    public nbc() {
        m34150d();
    }

    private nbc m34150d() {
        this.f29416a = null;
        this.f29417b = null;
        this.unknownFieldData = null;
        this.cachedSize = -1;
        return this;
    }

    public void m34152a(nyu nyu) {
        if (this.f29416a != null) {
            nyu.m37170a(1, this.f29416a);
        }
        if (this.f29417b != null) {
            nyu.m37168a(2, this.f29417b.intValue());
        }
        super.a(nyu);
    }

    protected int m34153b() {
        int b = super.b();
        if (this.f29416a != null) {
            b += nyu.m37137b(1, this.f29416a);
        }
        if (this.f29417b != null) {
            return b + nyu.m37147f(2, this.f29417b.intValue());
        }
        return b;
    }

    private nbc m34149b(nyt nyt) {
        while (true) {
            int a = nyt.m37099a();
            switch (a) {
                case 0:
                    break;
                case 10:
                    this.f29416a = nyt.m37117j();
                    continue;
                case 16:
                    this.f29417b = Integer.valueOf(nyt.m37112f());
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
