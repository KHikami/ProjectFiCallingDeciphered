package p000;

public final class ncs extends nyx<ncs> {
    private static volatile ncs[] f29521d;
    public int f29522a;
    public nto f29523b;
    public String f29524c;

    public /* synthetic */ nzf m34348a(nyt nyt) {
        return m34346b(nyt);
    }

    public static ncs[] m34347d() {
        if (f29521d == null) {
            synchronized (nzc.f31309c) {
                if (f29521d == null) {
                    f29521d = new ncs[0];
                }
            }
        }
        return f29521d;
    }

    public ncs() {
        this.f29522a = nzf.UNSET_ENUM_VALUE;
        this.f29524c = null;
        this.cachedSize = -1;
    }

    public void m34349a(nyu nyu) {
        if (this.f29522a != nzf.UNSET_ENUM_VALUE) {
            nyu.m37168a(1, this.f29522a);
        }
        if (this.f29523b != null) {
            nyu.m37182b(2, this.f29523b);
        }
        if (this.f29524c != null) {
            nyu.m37170a(3, this.f29524c);
        }
        super.a(nyu);
    }

    protected int m34350b() {
        int b = super.b();
        if (this.f29522a != nzf.UNSET_ENUM_VALUE) {
            b += nyu.m37147f(1, this.f29522a);
        }
        if (this.f29523b != null) {
            b += nyu.m37145d(2, this.f29523b);
        }
        if (this.f29524c != null) {
            return b + nyu.m37137b(3, this.f29524c);
        }
        return b;
    }

    private ncs m34346b(nyt nyt) {
        while (true) {
            int a = nyt.m37099a();
            switch (a) {
                case 0:
                    break;
                case 8:
                    a = nyt.m37112f();
                    switch (a) {
                        case 0:
                        case 1:
                            this.f29522a = a;
                            break;
                        default:
                            continue;
                    }
                case wi.dH /*18*/:
                    if (this.f29523b == null) {
                        this.f29523b = new nto();
                    }
                    nyt.m37101a(this.f29523b);
                    continue;
                case wi.dx /*26*/:
                    this.f29524c = nyt.m37117j();
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
