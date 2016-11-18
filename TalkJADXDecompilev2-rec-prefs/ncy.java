package p000;

public final class ncy extends nyx<ncy> {
    public nou f29540a;

    public /* synthetic */ nzf m34373a(nyt nyt) {
        return m34372b(nyt);
    }

    public ncy() {
        this.cachedSize = -1;
    }

    public void m34374a(nyu nyu) {
        if (this.f29540a != null) {
            nyu.m37182b(1, this.f29540a);
        }
        super.a(nyu);
    }

    protected int m34375b() {
        int b = super.b();
        if (this.f29540a != null) {
            return b + nyu.m37145d(1, this.f29540a);
        }
        return b;
    }

    private ncy m34372b(nyt nyt) {
        while (true) {
            int a = nyt.m37099a();
            switch (a) {
                case 0:
                    break;
                case 10:
                    if (this.f29540a == null) {
                        this.f29540a = new nou();
                    }
                    nyt.m37101a(this.f29540a);
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
