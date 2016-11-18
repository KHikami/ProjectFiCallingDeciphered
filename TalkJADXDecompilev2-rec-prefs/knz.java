package p000;

public final class knz extends nyx<knz> {
    private static volatile knz[] f22463c;
    public String f22464a;
    public String f22465b;

    public /* synthetic */ nzf mo150a(nyt nyt) {
        return m26744b(nyt);
    }

    public static knz[] m26745d() {
        if (f22463c == null) {
            synchronized (nzc.c) {
                if (f22463c == null) {
                    f22463c = new knz[0];
                }
            }
        }
        return f22463c;
    }

    public knz() {
        m26746g();
    }

    private knz m26746g() {
        this.f22464a = null;
        this.f22465b = null;
        this.unknownFieldData = null;
        this.cachedSize = -1;
        return this;
    }

    public void mo146a(nyu nyu) {
        if (this.f22464a != null) {
            nyu.a(1, this.f22464a);
        }
        if (this.f22465b != null) {
            nyu.a(2, this.f22465b);
        }
        super.mo146a(nyu);
    }

    protected int mo147b() {
        int b = super.mo147b();
        if (this.f22464a != null) {
            b += nyu.b(1, this.f22464a);
        }
        if (this.f22465b != null) {
            return b + nyu.b(2, this.f22465b);
        }
        return b;
    }

    private knz m26744b(nyt nyt) {
        while (true) {
            int a = nyt.a();
            switch (a) {
                case 0:
                    break;
                case 10:
                    this.f22464a = nyt.j();
                    continue;
                case wi.dH /*18*/:
                    this.f22465b = nyt.j();
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
