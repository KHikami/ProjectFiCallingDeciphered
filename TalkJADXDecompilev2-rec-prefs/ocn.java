package p000;

public final class ocn extends nyx<ocn> {
    public ock f32278a;

    public /* synthetic */ nzf m37763a(nyt nyt) {
        return m37762b(nyt);
    }

    public ocn() {
        this.cachedSize = -1;
    }

    public void m37764a(nyu nyu) {
        if (this.f32278a != null) {
            nyu.m37182b(1, this.f32278a);
        }
        super.a(nyu);
    }

    protected int m37765b() {
        int b = super.b();
        if (this.f32278a != null) {
            return b + nyu.m37145d(1, this.f32278a);
        }
        return b;
    }

    private ocn m37762b(nyt nyt) {
        while (true) {
            int a = nyt.m37099a();
            switch (a) {
                case 0:
                    break;
                case 10:
                    if (this.f32278a == null) {
                        this.f32278a = new ock();
                    }
                    nyt.m37101a(this.f32278a);
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
