package p000;

public final class lzx extends nyx<lzx> {
    private static volatile lzx[] f27064d;
    public Integer f27065a;
    public String f27066b;
    public Integer f27067c;

    public /* synthetic */ nzf mo150a(nyt nyt) {
        return m31356b(nyt);
    }

    public static lzx[] m31357d() {
        if (f27064d == null) {
            synchronized (nzc.c) {
                if (f27064d == null) {
                    f27064d = new lzx[0];
                }
            }
        }
        return f27064d;
    }

    public lzx() {
        m31358g();
    }

    private lzx m31358g() {
        this.f27065a = null;
        this.f27066b = null;
        this.unknownFieldData = null;
        this.cachedSize = -1;
        return this;
    }

    public void mo146a(nyu nyu) {
        if (this.f27065a != null) {
            nyu.a(1, this.f27065a.intValue());
        }
        if (this.f27066b != null) {
            nyu.a(2, this.f27066b);
        }
        if (this.f27067c != null) {
            nyu.a(3, this.f27067c.intValue());
        }
        super.mo146a(nyu);
    }

    protected int mo147b() {
        int b = super.mo147b();
        if (this.f27065a != null) {
            b += nyu.f(1, this.f27065a.intValue());
        }
        if (this.f27066b != null) {
            b += nyu.b(2, this.f27066b);
        }
        if (this.f27067c != null) {
            return b + nyu.f(3, this.f27067c.intValue());
        }
        return b;
    }

    private lzx m31356b(nyt nyt) {
        while (true) {
            int a = nyt.a();
            switch (a) {
                case 0:
                    break;
                case 8:
                    this.f27065a = Integer.valueOf(nyt.f());
                    continue;
                case wi.dH /*18*/:
                    this.f27066b = nyt.j();
                    continue;
                case wi.dA /*24*/:
                    a = nyt.f();
                    switch (a) {
                        case 1:
                        case 2:
                        case 3:
                        case 4:
                            this.f27067c = Integer.valueOf(a);
                            break;
                        default:
                            continue;
                    }
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
