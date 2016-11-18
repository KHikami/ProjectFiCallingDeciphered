package p000;

public final class ksa extends nyx<ksa> {
    public Integer f22960a;

    public /* synthetic */ nzf mo150a(nyt nyt) {
        return m27270b(nyt);
    }

    public ksa() {
        this.f22960a = null;
        this.cachedSize = -1;
    }

    public void mo146a(nyu nyu) {
        if (this.f22960a != null) {
            nyu.a(1, this.f22960a.intValue());
        }
        super.mo146a(nyu);
    }

    protected int mo147b() {
        int b = super.mo147b();
        if (this.f22960a != null) {
            return b + nyu.f(1, this.f22960a.intValue());
        }
        return b;
    }

    private ksa m27270b(nyt nyt) {
        while (true) {
            int a = nyt.a();
            switch (a) {
                case 0:
                    break;
                case 8:
                    this.f22960a = Integer.valueOf(nyt.f());
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
