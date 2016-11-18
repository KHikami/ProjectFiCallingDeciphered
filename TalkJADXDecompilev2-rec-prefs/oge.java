package p000;

public final class oge extends nyx<oge> {
    public Boolean f32703a;

    public /* synthetic */ nzf m38167a(nyt nyt) {
        return m38165b(nyt);
    }

    public oge() {
        m38166d();
    }

    private oge m38166d() {
        this.f32703a = null;
        this.unknownFieldData = null;
        this.cachedSize = -1;
        return this;
    }

    public void m38168a(nyu nyu) {
        if (this.f32703a != null) {
            nyu.m37172a(1, this.f32703a.booleanValue());
        }
        super.a(nyu);
    }

    protected int m38169b() {
        int b = super.b();
        if (this.f32703a == null) {
            return b;
        }
        this.f32703a.booleanValue();
        return b + (nyu.m37154h(1) + 1);
    }

    private oge m38165b(nyt nyt) {
        while (true) {
            int a = nyt.m37099a();
            switch (a) {
                case 0:
                    break;
                case 8:
                    this.f32703a = Boolean.valueOf(nyt.m37116i());
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
