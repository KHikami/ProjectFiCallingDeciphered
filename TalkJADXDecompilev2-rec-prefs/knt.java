package p000;

public final class knt extends nyx<knt> {
    public knp f22441a;

    public /* synthetic */ nzf mo150a(nyt nyt) {
        return m26715b(nyt);
    }

    public knt() {
        m26716d();
    }

    private knt m26716d() {
        this.f22441a = null;
        this.unknownFieldData = null;
        this.cachedSize = -1;
        return this;
    }

    public void mo146a(nyu nyu) {
        if (this.f22441a != null) {
            nyu.b(1, this.f22441a);
        }
        super.mo146a(nyu);
    }

    protected int mo147b() {
        int b = super.mo147b();
        if (this.f22441a != null) {
            return b + nyu.d(1, this.f22441a);
        }
        return b;
    }

    private knt m26715b(nyt nyt) {
        while (true) {
            int a = nyt.a();
            switch (a) {
                case 0:
                    break;
                case 10:
                    if (this.f22441a == null) {
                        this.f22441a = new knp();
                    }
                    nyt.a(this.f22441a);
                    continue;
                default:
                    if (!super.m1039a(nyt, a)) {
                        break;
                    }
                    continue;
            }
            return this;
        }
    }
}
