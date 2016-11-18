package p000;

public final class nst extends nyx<nst> {
    public Integer f30724a;
    public Integer f30725b;
    public Integer f30726c;
    public Integer f30727d;

    public /* synthetic */ nzf m36408a(nyt nyt) {
        return m36407b(nyt);
    }

    public nst() {
        this.f30724a = null;
        this.f30725b = null;
        this.f30726c = null;
        this.f30727d = null;
        this.cachedSize = -1;
    }

    public void m36409a(nyu nyu) {
        if (this.f30724a != null) {
            nyu.m37168a(1, this.f30724a.intValue());
        }
        if (this.f30725b != null) {
            nyu.m37168a(2, this.f30725b.intValue());
        }
        if (this.f30726c != null) {
            nyu.m37168a(3, this.f30726c.intValue());
        }
        if (this.f30727d != null) {
            nyu.m37168a(4, this.f30727d.intValue());
        }
        super.a(nyu);
    }

    protected int m36410b() {
        int b = super.b();
        if (this.f30724a != null) {
            b += nyu.m37147f(1, this.f30724a.intValue());
        }
        if (this.f30725b != null) {
            b += nyu.m37147f(2, this.f30725b.intValue());
        }
        if (this.f30726c != null) {
            b += nyu.m37147f(3, this.f30726c.intValue());
        }
        if (this.f30727d != null) {
            return b + nyu.m37147f(4, this.f30727d.intValue());
        }
        return b;
    }

    private nst m36407b(nyt nyt) {
        while (true) {
            int a = nyt.m37099a();
            switch (a) {
                case 0:
                    break;
                case 8:
                    this.f30724a = Integer.valueOf(nyt.m37112f());
                    continue;
                case 16:
                    this.f30725b = Integer.valueOf(nyt.m37112f());
                    continue;
                case wi.dA /*24*/:
                    this.f30726c = Integer.valueOf(nyt.m37112f());
                    continue;
                case 32:
                    this.f30727d = Integer.valueOf(nyt.m37112f());
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
