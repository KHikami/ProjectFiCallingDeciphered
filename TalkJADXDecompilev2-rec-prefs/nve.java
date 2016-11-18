package p000;

public final class nve extends nyx<nve> {
    private static volatile nve[] f31118d;
    public byte[] f31119a;
    public Integer f31120b;
    public Integer f31121c;

    public /* synthetic */ nzf m36701a(nyt nyt) {
        return m36698b(nyt);
    }

    public static nve[] m36699d() {
        if (f31118d == null) {
            synchronized (nzc.f31309c) {
                if (f31118d == null) {
                    f31118d = new nve[0];
                }
            }
        }
        return f31118d;
    }

    public nve() {
        m36700g();
    }

    private nve m36700g() {
        this.f31119a = null;
        this.f31120b = null;
        this.unknownFieldData = null;
        this.cachedSize = -1;
        return this;
    }

    public void m36702a(nyu nyu) {
        if (this.f31119a != null) {
            nyu.m37173a(1, this.f31119a);
        }
        if (this.f31120b != null) {
            nyu.m37186c(2, this.f31120b.intValue());
        }
        if (this.f31121c != null) {
            nyu.m37168a(3, this.f31121c.intValue());
        }
        super.a(nyu);
    }

    protected int m36703b() {
        int b = super.b();
        if (this.f31119a != null) {
            b += nyu.m37139b(1, this.f31119a);
        }
        if (this.f31120b != null) {
            b += nyu.m37151g(2, this.f31120b.intValue());
        }
        if (this.f31121c != null) {
            return b + nyu.m37147f(3, this.f31121c.intValue());
        }
        return b;
    }

    private nve m36698b(nyt nyt) {
        while (true) {
            int a = nyt.m37099a();
            switch (a) {
                case 0:
                    break;
                case 10:
                    this.f31119a = nyt.m37118k();
                    continue;
                case 16:
                    this.f31120b = Integer.valueOf(nyt.m37119l());
                    continue;
                case wi.dA /*24*/:
                    a = nyt.m37112f();
                    switch (a) {
                        case 0:
                        case 4:
                        case 5:
                        case 6:
                        case 7:
                        case 8:
                        case 9:
                            this.f31121c = Integer.valueOf(a);
                            break;
                        default:
                            continue;
                    }
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
