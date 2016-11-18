package p000;

public final class noq extends nyx<noq> {
    public Boolean f30392a;

    public /* synthetic */ nzf m35938a(nyt nyt) {
        return m35937b(nyt);
    }

    public noq() {
        this.f30392a = null;
        this.cachedSize = -1;
    }

    public void m35939a(nyu nyu) {
        if (this.f30392a != null) {
            nyu.m37172a(1, this.f30392a.booleanValue());
        }
        super.a(nyu);
    }

    protected int m35940b() {
        int b = super.b();
        if (this.f30392a == null) {
            return b;
        }
        this.f30392a.booleanValue();
        return b + (nyu.m37154h(1) + 1);
    }

    private noq m35937b(nyt nyt) {
        while (true) {
            int a = nyt.m37099a();
            switch (a) {
                case 0:
                    break;
                case 8:
                    this.f30392a = Boolean.valueOf(nyt.m37116i());
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
