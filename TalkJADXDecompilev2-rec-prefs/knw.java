package p000;

public final class knw extends nyx<knw> {
    public oro f22452a;

    public /* synthetic */ nzf mo150a(nyt nyt) {
        return m26729b(nyt);
    }

    public knw() {
        m26730d();
    }

    private knw m26730d() {
        this.f22452a = null;
        this.unknownFieldData = null;
        this.cachedSize = -1;
        return this;
    }

    public void mo146a(nyu nyu) {
        if (this.f22452a != null) {
            nyu.b(1, this.f22452a);
        }
        super.mo146a(nyu);
    }

    protected int mo147b() {
        int b = super.mo147b();
        if (this.f22452a != null) {
            return b + nyu.d(1, this.f22452a);
        }
        return b;
    }

    private knw m26729b(nyt nyt) {
        while (true) {
            int a = nyt.a();
            switch (a) {
                case 0:
                    break;
                case 10:
                    if (this.f22452a == null) {
                        this.f22452a = new oro();
                    }
                    nyt.a(this.f22452a);
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
