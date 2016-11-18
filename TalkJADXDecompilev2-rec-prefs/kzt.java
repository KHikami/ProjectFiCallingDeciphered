package p000;

public final class kzt extends nyx<kzt> {
    public laa f24298a;
    public Integer f24299b;

    public /* synthetic */ nzf mo150a(nyt nyt) {
        return m28280b(nyt);
    }

    public kzt() {
        this.f24299b = null;
        this.cachedSize = -1;
    }

    public void mo146a(nyu nyu) {
        if (this.f24298a != null) {
            nyu.b(1, this.f24298a);
        }
        if (this.f24299b != null) {
            nyu.a(2, this.f24299b.intValue());
        }
        super.mo146a(nyu);
    }

    protected int mo147b() {
        int b = super.mo147b();
        if (this.f24298a != null) {
            b += nyu.d(1, this.f24298a);
        }
        if (this.f24299b != null) {
            return b + nyu.f(2, this.f24299b.intValue());
        }
        return b;
    }

    private kzt m28280b(nyt nyt) {
        while (true) {
            int a = nyt.a();
            switch (a) {
                case 0:
                    break;
                case 10:
                    if (this.f24298a == null) {
                        this.f24298a = new laa();
                    }
                    nyt.a(this.f24298a);
                    continue;
                case 16:
                    this.f24299b = Integer.valueOf(nyt.f());
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
