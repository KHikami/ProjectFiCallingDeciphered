package p000;

public final class ncx extends nyx<ncx> {
    public nou f29539a;

    public /* synthetic */ nzf m34369a(nyt nyt) {
        return m34368b(nyt);
    }

    public ncx() {
        this.cachedSize = -1;
    }

    public void m34370a(nyu nyu) {
        if (this.f29539a != null) {
            nyu.m37182b(1, this.f29539a);
        }
        super.a(nyu);
    }

    protected int m34371b() {
        int b = super.b();
        if (this.f29539a != null) {
            return b + nyu.m37145d(1, this.f29539a);
        }
        return b;
    }

    private ncx m34368b(nyt nyt) {
        while (true) {
            int a = nyt.m37099a();
            switch (a) {
                case 0:
                    break;
                case 10:
                    if (this.f29539a == null) {
                        this.f29539a = new nou();
                    }
                    nyt.m37101a(this.f29539a);
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
