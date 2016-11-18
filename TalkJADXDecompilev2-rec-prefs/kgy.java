package p000;

public final class kgy extends nyx<kgy> {
    public String f21671a;
    public Integer f21672b;

    public /* synthetic */ nzf mo150a(nyt nyt) {
        return m25788b(nyt);
    }

    public kgy() {
        this.f21671a = null;
        this.f21672b = null;
        this.cachedSize = -1;
    }

    public void mo146a(nyu nyu) {
        if (this.f21671a != null) {
            nyu.a(1, this.f21671a);
        }
        if (this.f21672b != null) {
            nyu.a(2, this.f21672b.intValue());
        }
        super.mo146a(nyu);
    }

    protected int mo147b() {
        int b = super.mo147b();
        if (this.f21671a != null) {
            b += nyu.b(1, this.f21671a);
        }
        if (this.f21672b != null) {
            return b + nyu.f(2, this.f21672b.intValue());
        }
        return b;
    }

    private kgy m25788b(nyt nyt) {
        while (true) {
            int a = nyt.a();
            switch (a) {
                case 0:
                    break;
                case 10:
                    this.f21671a = nyt.j();
                    continue;
                case 16:
                    this.f21672b = Integer.valueOf(nyt.f());
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
