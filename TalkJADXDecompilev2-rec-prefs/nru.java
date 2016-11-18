package p000;

public final class nru extends nyx<nru> {
    public String f30620a;

    public /* synthetic */ nzf m36305a(nyt nyt) {
        return m36304b(nyt);
    }

    public nru() {
        this.f30620a = null;
        this.cachedSize = -1;
    }

    public void m36306a(nyu nyu) {
        if (this.f30620a != null) {
            nyu.m37170a(1, this.f30620a);
        }
        super.a(nyu);
    }

    protected int m36307b() {
        int b = super.b();
        if (this.f30620a != null) {
            return b + nyu.m37137b(1, this.f30620a);
        }
        return b;
    }

    private nru m36304b(nyt nyt) {
        while (true) {
            int a = nyt.m37099a();
            switch (a) {
                case 0:
                    break;
                case 10:
                    this.f30620a = nyt.m37117j();
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
