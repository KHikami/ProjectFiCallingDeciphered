package p000;

public final class nos extends nyx<nos> {
    public String f30395a;

    public /* synthetic */ nzf m35946a(nyt nyt) {
        return m35945b(nyt);
    }

    public nos() {
        this.f30395a = null;
        this.cachedSize = -1;
    }

    public void m35947a(nyu nyu) {
        if (this.f30395a != null) {
            nyu.m37170a(1, this.f30395a);
        }
        super.a(nyu);
    }

    protected int m35948b() {
        int b = super.b();
        if (this.f30395a != null) {
            return b + nyu.m37137b(1, this.f30395a);
        }
        return b;
    }

    private nos m35945b(nyt nyt) {
        while (true) {
            int a = nyt.m37099a();
            switch (a) {
                case 0:
                    break;
                case 10:
                    this.f30395a = nyt.m37117j();
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
