package p000;

public final class npj extends nyx<npj> {
    public Boolean f30436a;
    public Float f30437b;

    public /* synthetic */ nzf m36032a(nyt nyt) {
        return m36031b(nyt);
    }

    public npj() {
        this.f30436a = null;
        this.f30437b = null;
        this.cachedSize = -1;
    }

    public void m36033a(nyu nyu) {
        if (this.f30436a != null) {
            nyu.m37172a(1, this.f30436a.booleanValue());
        }
        if (this.f30437b != null) {
            nyu.m37167a(2, this.f30437b.floatValue());
        }
        super.a(nyu);
    }

    protected int m36034b() {
        int b = super.b();
        if (this.f30436a != null) {
            this.f30436a.booleanValue();
            b += nyu.m37154h(1) + 1;
        }
        if (this.f30437b == null) {
            return b;
        }
        this.f30437b.floatValue();
        return b + (nyu.m37154h(2) + 4);
    }

    private npj m36031b(nyt nyt) {
        while (true) {
            int a = nyt.m37099a();
            switch (a) {
                case 0:
                    break;
                case 8:
                    this.f30436a = Boolean.valueOf(nyt.m37116i());
                    continue;
                case 21:
                    this.f30437b = Float.valueOf(nyt.m37106c());
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
