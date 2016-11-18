package p000;

public final class lzi extends nyx<lzi> {
    private static volatile lzi[] f26998d;
    public String f26999a;
    public String f27000b;
    public String f27001c;

    public /* synthetic */ nzf mo150a(nyt nyt) {
        return m31272b(nyt);
    }

    public static lzi[] m31273d() {
        if (f26998d == null) {
            synchronized (nzc.c) {
                if (f26998d == null) {
                    f26998d = new lzi[0];
                }
            }
        }
        return f26998d;
    }

    public lzi() {
        m31274g();
    }

    private lzi m31274g() {
        this.f26999a = null;
        this.f27000b = null;
        this.f27001c = null;
        this.unknownFieldData = null;
        this.cachedSize = -1;
        return this;
    }

    public void mo146a(nyu nyu) {
        if (this.f26999a != null) {
            nyu.a(1, this.f26999a);
        }
        if (this.f27000b != null) {
            nyu.a(2, this.f27000b);
        }
        if (this.f27001c != null) {
            nyu.a(3, this.f27001c);
        }
        super.mo146a(nyu);
    }

    protected int mo147b() {
        int b = super.mo147b();
        if (this.f26999a != null) {
            b += nyu.b(1, this.f26999a);
        }
        if (this.f27000b != null) {
            b += nyu.b(2, this.f27000b);
        }
        if (this.f27001c != null) {
            return b + nyu.b(3, this.f27001c);
        }
        return b;
    }

    private lzi m31272b(nyt nyt) {
        while (true) {
            int a = nyt.a();
            switch (a) {
                case 0:
                    break;
                case 10:
                    this.f26999a = nyt.j();
                    continue;
                case wi.dH /*18*/:
                    this.f27000b = nyt.j();
                    continue;
                case wi.dx /*26*/:
                    this.f27001c = nyt.j();
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
