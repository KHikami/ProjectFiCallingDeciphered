package p000;

public final class nte extends nyx<nte> {
    public ntk f30743a;

    public /* synthetic */ nzf m36454a(nyt nyt) {
        return m36453b(nyt);
    }

    public nte() {
        this.cachedSize = -1;
    }

    public void m36455a(nyu nyu) {
        if (this.f30743a != null) {
            nyu.m37182b(1, this.f30743a);
        }
        super.a(nyu);
    }

    protected int m36456b() {
        int b = super.b();
        if (this.f30743a != null) {
            return b + nyu.m37145d(1, this.f30743a);
        }
        return b;
    }

    private nte m36453b(nyt nyt) {
        while (true) {
            int a = nyt.m37099a();
            switch (a) {
                case 0:
                    break;
                case 10:
                    if (this.f30743a == null) {
                        this.f30743a = new ntk();
                    }
                    nyt.m37101a(this.f30743a);
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
