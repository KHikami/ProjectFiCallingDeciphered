package p000;

public final class nux extends nyx<nux> {
    public Float f31046a;
    public Float f31047b;
    public Float f31048c;
    public Float f31049d;
    public Float f31050e;
    public Float f31051f;
    public Float f31052g;
    public Float f31053h;
    public Float f31054i;

    public /* synthetic */ nzf m36662a(nyt nyt) {
        return m36661b(nyt);
    }

    public nux() {
        this.f31046a = null;
        this.f31047b = null;
        this.f31048c = null;
        this.f31049d = null;
        this.f31050e = null;
        this.f31051f = null;
        this.f31052g = null;
        this.f31053h = null;
        this.f31054i = null;
        this.cachedSize = -1;
    }

    public void m36663a(nyu nyu) {
        nyu.m37167a(1, this.f31046a.floatValue());
        nyu.m37167a(2, this.f31047b.floatValue());
        nyu.m37167a(3, this.f31048c.floatValue());
        nyu.m37167a(4, this.f31049d.floatValue());
        nyu.m37167a(5, this.f31050e.floatValue());
        nyu.m37167a(6, this.f31051f.floatValue());
        nyu.m37167a(7, this.f31052g.floatValue());
        nyu.m37167a(8, this.f31053h.floatValue());
        nyu.m37167a(9, this.f31054i.floatValue());
        super.a(nyu);
    }

    protected int m36664b() {
        int b = super.b();
        this.f31046a.floatValue();
        b += nyu.m37154h(1) + 4;
        this.f31047b.floatValue();
        b += nyu.m37154h(2) + 4;
        this.f31048c.floatValue();
        b += nyu.m37154h(3) + 4;
        this.f31049d.floatValue();
        b += nyu.m37154h(4) + 4;
        this.f31050e.floatValue();
        b += nyu.m37154h(5) + 4;
        this.f31051f.floatValue();
        b += nyu.m37154h(6) + 4;
        this.f31052g.floatValue();
        b += nyu.m37154h(7) + 4;
        this.f31053h.floatValue();
        b += nyu.m37154h(8) + 4;
        this.f31054i.floatValue();
        return b + (nyu.m37154h(9) + 4);
    }

    private nux m36661b(nyt nyt) {
        while (true) {
            int a = nyt.m37099a();
            switch (a) {
                case 0:
                    break;
                case 13:
                    this.f31046a = Float.valueOf(nyt.m37106c());
                    continue;
                case 21:
                    this.f31047b = Float.valueOf(nyt.m37106c());
                    continue;
                case 29:
                    this.f31048c = Float.valueOf(nyt.m37106c());
                    continue;
                case 37:
                    this.f31049d = Float.valueOf(nyt.m37106c());
                    continue;
                case 45:
                    this.f31050e = Float.valueOf(nyt.m37106c());
                    continue;
                case 53:
                    this.f31051f = Float.valueOf(nyt.m37106c());
                    continue;
                case 61:
                    this.f31052g = Float.valueOf(nyt.m37106c());
                    continue;
                case 69:
                    this.f31053h = Float.valueOf(nyt.m37106c());
                    continue;
                case 77:
                    this.f31054i = Float.valueOf(nyt.m37106c());
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
