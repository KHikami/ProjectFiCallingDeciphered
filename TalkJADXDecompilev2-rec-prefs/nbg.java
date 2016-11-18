package p000;

public final class nbg extends nyx<nbg> {
    private static volatile nbg[] f29425c;
    public String f29426a;
    public nca f29427b;

    public /* synthetic */ nzf m34170a(nyt nyt) {
        return m34168b(nyt);
    }

    public static nbg[] m34169d() {
        if (f29425c == null) {
            synchronized (nzc.f31309c) {
                if (f29425c == null) {
                    f29425c = new nbg[0];
                }
            }
        }
        return f29425c;
    }

    public nbg() {
        this.f29426a = null;
        this.cachedSize = -1;
    }

    public void m34171a(nyu nyu) {
        if (this.f29426a != null) {
            nyu.m37170a(1, this.f29426a);
        }
        if (this.f29427b != null) {
            nyu.m37182b(2, this.f29427b);
        }
        super.a(nyu);
    }

    protected int m34172b() {
        int b = super.b();
        if (this.f29426a != null) {
            b += nyu.m37137b(1, this.f29426a);
        }
        if (this.f29427b != null) {
            return b + nyu.m37145d(2, this.f29427b);
        }
        return b;
    }

    private nbg m34168b(nyt nyt) {
        while (true) {
            int a = nyt.m37099a();
            switch (a) {
                case 0:
                    break;
                case 10:
                    this.f29426a = nyt.m37117j();
                    continue;
                case wi.dH /*18*/:
                    if (this.f29427b == null) {
                        this.f29427b = new nca();
                    }
                    nyt.m37101a(this.f29427b);
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
