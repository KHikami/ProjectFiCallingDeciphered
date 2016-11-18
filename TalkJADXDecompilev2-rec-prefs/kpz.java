package p000;

public final class kpz extends nyx<kpz> {
    private static volatile kpz[] f22719c;
    public String f22720a;
    public String f22721b;

    public /* synthetic */ nzf mo150a(nyt nyt) {
        return m27000b(nyt);
    }

    public static kpz[] m27001d() {
        if (f22719c == null) {
            synchronized (nzc.c) {
                if (f22719c == null) {
                    f22719c = new kpz[0];
                }
            }
        }
        return f22719c;
    }

    public kpz() {
        m27002g();
    }

    private kpz m27002g() {
        this.f22720a = null;
        this.f22721b = null;
        this.unknownFieldData = null;
        this.cachedSize = -1;
        return this;
    }

    public void mo146a(nyu nyu) {
        nyu.a(1, this.f22720a);
        nyu.a(2, this.f22721b);
        super.mo146a(nyu);
    }

    protected int mo147b() {
        return (super.mo147b() + nyu.b(1, this.f22720a)) + nyu.b(2, this.f22721b);
    }

    private kpz m27000b(nyt nyt) {
        while (true) {
            int a = nyt.a();
            switch (a) {
                case 0:
                    break;
                case 10:
                    this.f22720a = nyt.j();
                    continue;
                case wi.dH /*18*/:
                    this.f22721b = nyt.j();
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
