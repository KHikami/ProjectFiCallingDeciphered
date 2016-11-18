package p000;

public final class noy extends nyx<noy> {
    public Boolean f30410a;

    public /* synthetic */ nzf m35971a(nyt nyt) {
        return m35970b(nyt);
    }

    public noy() {
        this.f30410a = null;
        this.cachedSize = -1;
    }

    public void m35972a(nyu nyu) {
        if (this.f30410a != null) {
            nyu.m37172a(1, this.f30410a.booleanValue());
        }
        super.a(nyu);
    }

    protected int m35973b() {
        int b = super.b();
        if (this.f30410a == null) {
            return b;
        }
        this.f30410a.booleanValue();
        return b + (nyu.m37154h(1) + 1);
    }

    private noy m35970b(nyt nyt) {
        while (true) {
            int a = nyt.m37099a();
            switch (a) {
                case 0:
                    break;
                case 8:
                    this.f30410a = Boolean.valueOf(nyt.m37116i());
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
