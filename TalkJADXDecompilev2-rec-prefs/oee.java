package p000;

public final class oee extends nyx<oee> {
    public String f32462a;

    public /* synthetic */ nzf m37941a(nyt nyt) {
        return m37940b(nyt);
    }

    public oee() {
        this.f32462a = null;
        this.cachedSize = -1;
    }

    public void m37942a(nyu nyu) {
        if (this.f32462a != null) {
            nyu.m37170a(1, this.f32462a);
        }
        super.a(nyu);
    }

    protected int m37943b() {
        int b = super.b();
        if (this.f32462a != null) {
            return b + nyu.m37137b(1, this.f32462a);
        }
        return b;
    }

    private oee m37940b(nyt nyt) {
        while (true) {
            int a = nyt.m37099a();
            switch (a) {
                case 0:
                    break;
                case 10:
                    this.f32462a = nyt.m37117j();
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
