package p000;

public final class kzm extends nyx<kzm> {
    public kzn f24251a;

    public /* synthetic */ nzf mo150a(nyt nyt) {
        return m28245b(nyt);
    }

    public kzm() {
        m28246d();
    }

    private kzm m28246d() {
        this.f24251a = null;
        this.unknownFieldData = null;
        this.cachedSize = -1;
        return this;
    }

    public void mo146a(nyu nyu) {
        if (this.f24251a != null) {
            nyu.b(1, this.f24251a);
        }
        super.mo146a(nyu);
    }

    protected int mo147b() {
        int b = super.mo147b();
        if (this.f24251a != null) {
            return b + nyu.d(1, this.f24251a);
        }
        return b;
    }

    private kzm m28245b(nyt nyt) {
        while (true) {
            int a = nyt.a();
            switch (a) {
                case 0:
                    break;
                case 10:
                    if (this.f24251a == null) {
                        this.f24251a = new kzn();
                    }
                    nyt.a(this.f24251a);
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
