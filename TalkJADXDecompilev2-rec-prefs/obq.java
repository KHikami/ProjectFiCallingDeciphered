package p000;

public final class obq extends nyx<obq> {
    public String f32028a;
    public Integer f32029b;

    public /* synthetic */ nzf m37658a(nyt nyt) {
        return m37657b(nyt);
    }

    public obq() {
        this.f32028a = null;
        this.f32029b = null;
        this.cachedSize = -1;
    }

    public void m37659a(nyu nyu) {
        if (this.f32028a != null) {
            nyu.m37170a(1, this.f32028a);
        }
        if (this.f32029b != null) {
            nyu.m37168a(2, this.f32029b.intValue());
        }
        super.a(nyu);
    }

    protected int m37660b() {
        int b = super.b();
        if (this.f32028a != null) {
            b += nyu.m37137b(1, this.f32028a);
        }
        if (this.f32029b != null) {
            return b + nyu.m37147f(2, this.f32029b.intValue());
        }
        return b;
    }

    private obq m37657b(nyt nyt) {
        while (true) {
            int a = nyt.m37099a();
            switch (a) {
                case 0:
                    break;
                case 10:
                    this.f32028a = nyt.m37117j();
                    continue;
                case 16:
                    this.f32029b = Integer.valueOf(nyt.m37112f());
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
