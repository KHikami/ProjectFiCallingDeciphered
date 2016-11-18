package p000;

public final class nas extends nyx<nas> {
    private static volatile nas[] f29389c;
    public nbb f29390a;
    public nbb f29391b;

    public /* synthetic */ nzf m34099a(nyt nyt) {
        return m34096b(nyt);
    }

    public static nas[] m34097d() {
        if (f29389c == null) {
            synchronized (nzc.f31309c) {
                if (f29389c == null) {
                    f29389c = new nas[0];
                }
            }
        }
        return f29389c;
    }

    public nas() {
        m34098g();
    }

    private nas m34098g() {
        this.f29390a = null;
        this.f29391b = null;
        this.unknownFieldData = null;
        this.cachedSize = -1;
        return this;
    }

    public void m34100a(nyu nyu) {
        if (this.f29390a != null) {
            nyu.m37182b(1, this.f29390a);
        }
        if (this.f29391b != null) {
            nyu.m37182b(2, this.f29391b);
        }
        super.a(nyu);
    }

    protected int m34101b() {
        int b = super.b();
        if (this.f29390a != null) {
            b += nyu.m37145d(1, this.f29390a);
        }
        if (this.f29391b != null) {
            return b + nyu.m37145d(2, this.f29391b);
        }
        return b;
    }

    private nas m34096b(nyt nyt) {
        while (true) {
            int a = nyt.m37099a();
            switch (a) {
                case 0:
                    break;
                case 10:
                    if (this.f29390a == null) {
                        this.f29390a = new nbb();
                    }
                    nyt.m37101a(this.f29390a);
                    continue;
                case wi.dH /*18*/:
                    if (this.f29391b == null) {
                        this.f29391b = new nbb();
                    }
                    nyt.m37101a(this.f29391b);
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
