package p000;

public final class lby extends nyx<lby> {
    public String f24532a;

    public /* synthetic */ nzf mo150a(nyt nyt) {
        return m28539b(nyt);
    }

    public lby() {
        this.f24532a = null;
        this.cachedSize = -1;
    }

    public void mo146a(nyu nyu) {
        if (this.f24532a != null) {
            nyu.a(1, this.f24532a);
        }
        super.mo146a(nyu);
    }

    protected int mo147b() {
        int b = super.mo147b();
        if (this.f24532a != null) {
            return b + nyu.b(1, this.f24532a);
        }
        return b;
    }

    private lby m28539b(nyt nyt) {
        while (true) {
            int a = nyt.a();
            switch (a) {
                case 0:
                    break;
                case 10:
                    this.f24532a = nyt.j();
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
