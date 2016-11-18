package p000;

public final class ogi extends nyx<ogi> {
    public Double f32721a;

    public /* synthetic */ nzf m38188a(nyt nyt) {
        return m38186b(nyt);
    }

    public ogi() {
        m38187d();
    }

    private ogi m38187d() {
        this.f32721a = null;
        this.unknownFieldData = null;
        this.cachedSize = -1;
        return this;
    }

    public void m38189a(nyu nyu) {
        if (this.f32721a != null) {
            nyu.m37166a(1, this.f32721a.doubleValue());
        }
        super.a(nyu);
    }

    protected int m38190b() {
        int b = super.b();
        if (this.f32721a == null) {
            return b;
        }
        this.f32721a.doubleValue();
        return b + (nyu.m37154h(1) + 8);
    }

    private ogi m38186b(nyt nyt) {
        while (true) {
            int a = nyt.m37099a();
            switch (a) {
                case 0:
                    break;
                case 9:
                    this.f32721a = Double.valueOf(nyt.m37104b());
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
