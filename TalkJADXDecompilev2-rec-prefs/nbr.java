package p000;

public final class nbr extends nyx<nbr> {
    public String f29455a;
    public Integer f29456b;

    public /* synthetic */ nzf m34217a(nyt nyt) {
        return m34216b(nyt);
    }

    public nbr() {
        this.f29455a = null;
        this.f29456b = null;
        this.cachedSize = -1;
    }

    public void m34218a(nyu nyu) {
        if (this.f29455a != null) {
            nyu.m37170a(1, this.f29455a);
        }
        if (this.f29456b != null) {
            nyu.m37168a(2, this.f29456b.intValue());
        }
        super.a(nyu);
    }

    protected int m34219b() {
        int b = super.b();
        if (this.f29455a != null) {
            b += nyu.m37137b(1, this.f29455a);
        }
        if (this.f29456b != null) {
            return b + nyu.m37147f(2, this.f29456b.intValue());
        }
        return b;
    }

    private nbr m34216b(nyt nyt) {
        while (true) {
            int a = nyt.m37099a();
            switch (a) {
                case 0:
                    break;
                case 10:
                    this.f29455a = nyt.m37117j();
                    continue;
                case 16:
                    this.f29456b = Integer.valueOf(nyt.m37112f());
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
