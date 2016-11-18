package p000;

public final class nct extends nyx<nct> {
    public ntr f29525a;

    public /* synthetic */ nzf m34352a(nyt nyt) {
        return m34351b(nyt);
    }

    public nct() {
        this.cachedSize = -1;
    }

    public void m34353a(nyu nyu) {
        if (this.f29525a != null) {
            nyu.m37182b(1, this.f29525a);
        }
        super.a(nyu);
    }

    protected int m34354b() {
        int b = super.b();
        if (this.f29525a != null) {
            return b + nyu.m37145d(1, this.f29525a);
        }
        return b;
    }

    private nct m34351b(nyt nyt) {
        while (true) {
            int a = nyt.m37099a();
            switch (a) {
                case 0:
                    break;
                case 10:
                    if (this.f29525a == null) {
                        this.f29525a = new ntr();
                    }
                    nyt.m37101a(this.f29525a);
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
