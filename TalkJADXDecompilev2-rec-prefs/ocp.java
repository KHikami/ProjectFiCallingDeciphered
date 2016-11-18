package p000;

public final class ocp extends nyx<ocp> {
    public String f32282a;
    public ock f32283b;

    public /* synthetic */ nzf m37771a(nyt nyt) {
        return m37770b(nyt);
    }

    public ocp() {
        this.f32282a = null;
        this.cachedSize = -1;
    }

    public void m37772a(nyu nyu) {
        if (this.f32282a != null) {
            nyu.m37170a(1, this.f32282a);
        }
        if (this.f32283b != null) {
            nyu.m37182b(2, this.f32283b);
        }
        super.a(nyu);
    }

    protected int m37773b() {
        int b = super.b();
        if (this.f32282a != null) {
            b += nyu.m37137b(1, this.f32282a);
        }
        if (this.f32283b != null) {
            return b + nyu.m37145d(2, this.f32283b);
        }
        return b;
    }

    private ocp m37770b(nyt nyt) {
        while (true) {
            int a = nyt.m37099a();
            switch (a) {
                case 0:
                    break;
                case 10:
                    this.f32282a = nyt.m37117j();
                    continue;
                case wi.dH /*18*/:
                    if (this.f32283b == null) {
                        this.f32283b = new ock();
                    }
                    nyt.m37101a(this.f32283b);
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
