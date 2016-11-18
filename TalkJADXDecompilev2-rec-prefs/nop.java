package p000;

public final class nop extends nyx<nop> {
    public String f30390a;
    public Float f30391b;

    public /* synthetic */ nzf m35934a(nyt nyt) {
        return m35933b(nyt);
    }

    public nop() {
        this.f30390a = null;
        this.f30391b = null;
        this.cachedSize = -1;
    }

    public void m35935a(nyu nyu) {
        if (this.f30390a != null) {
            nyu.m37170a(1, this.f30390a);
        }
        if (this.f30391b != null) {
            nyu.m37167a(2, this.f30391b.floatValue());
        }
        super.a(nyu);
    }

    protected int m35936b() {
        int b = super.b();
        if (this.f30390a != null) {
            b += nyu.m37137b(1, this.f30390a);
        }
        if (this.f30391b == null) {
            return b;
        }
        this.f30391b.floatValue();
        return b + (nyu.m37154h(2) + 4);
    }

    private nop m35933b(nyt nyt) {
        while (true) {
            int a = nyt.m37099a();
            switch (a) {
                case 0:
                    break;
                case 10:
                    this.f30390a = nyt.m37117j();
                    continue;
                case 21:
                    this.f30391b = Float.valueOf(nyt.m37106c());
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
