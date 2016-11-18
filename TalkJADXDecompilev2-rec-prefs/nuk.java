package p000;

public final class nuk extends nyx<nuk> {
    public Boolean f30895a;

    public /* synthetic */ nzf m36601a(nyt nyt) {
        return m36600b(nyt);
    }

    public nuk() {
        this.f30895a = null;
        this.cachedSize = -1;
    }

    public void m36602a(nyu nyu) {
        if (this.f30895a != null) {
            nyu.m37172a(1, this.f30895a.booleanValue());
        }
        super.a(nyu);
    }

    protected int m36603b() {
        int b = super.b();
        if (this.f30895a == null) {
            return b;
        }
        this.f30895a.booleanValue();
        return b + (nyu.m37154h(1) + 1);
    }

    private nuk m36600b(nyt nyt) {
        while (true) {
            int a = nyt.m37099a();
            switch (a) {
                case 0:
                    break;
                case 8:
                    this.f30895a = Boolean.valueOf(nyt.m37116i());
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
