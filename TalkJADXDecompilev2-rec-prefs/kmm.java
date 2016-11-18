package p000;

public final class kmm extends nyx<kmm> {
    public kmn f22372a;

    public /* synthetic */ nzf mo150a(nyt nyt) {
        return m26552b(nyt);
    }

    public kmm() {
        m26553d();
    }

    private kmm m26553d() {
        this.f22372a = null;
        this.unknownFieldData = null;
        this.cachedSize = -1;
        return this;
    }

    public void mo146a(nyu nyu) {
        if (this.f22372a != null) {
            nyu.b(1, this.f22372a);
        }
        super.mo146a(nyu);
    }

    protected int mo147b() {
        int b = super.mo147b();
        if (this.f22372a != null) {
            return b + nyu.d(1, this.f22372a);
        }
        return b;
    }

    private kmm m26552b(nyt nyt) {
        while (true) {
            int a = nyt.a();
            switch (a) {
                case 0:
                    break;
                case 10:
                    if (this.f22372a == null) {
                        this.f22372a = new kmn();
                    }
                    nyt.a(this.f22372a);
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
