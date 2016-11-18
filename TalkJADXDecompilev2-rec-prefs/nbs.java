package p000;

public final class nbs extends nyx<nbs> {
    public String f29457a;
    public Integer f29458b;

    public /* synthetic */ nzf m34221a(nyt nyt) {
        return m34220b(nyt);
    }

    public nbs() {
        this.f29457a = null;
        this.f29458b = null;
        this.cachedSize = -1;
    }

    public void m34222a(nyu nyu) {
        if (this.f29457a != null) {
            nyu.m37170a(1, this.f29457a);
        }
        if (this.f29458b != null) {
            nyu.m37168a(2, this.f29458b.intValue());
        }
        super.a(nyu);
    }

    protected int m34223b() {
        int b = super.b();
        if (this.f29457a != null) {
            b += nyu.m37137b(1, this.f29457a);
        }
        if (this.f29458b != null) {
            return b + nyu.m37147f(2, this.f29458b.intValue());
        }
        return b;
    }

    private nbs m34220b(nyt nyt) {
        while (true) {
            int a = nyt.m37099a();
            switch (a) {
                case 0:
                    break;
                case 10:
                    this.f29457a = nyt.m37117j();
                    continue;
                case 16:
                    this.f29458b = Integer.valueOf(nyt.m37112f());
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
