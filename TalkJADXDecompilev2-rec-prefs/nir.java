package p000;

public final class nir extends nyx<nir> {
    private static volatile nir[] f29911d;
    public Integer f29912a;
    public Integer f29913b;
    public nis f29914c;

    public /* synthetic */ nzf m35137a(nyt nyt) {
        return m35134b(nyt);
    }

    public static nir[] m35135d() {
        if (f29911d == null) {
            synchronized (nzc.f31309c) {
                if (f29911d == null) {
                    f29911d = new nir[0];
                }
            }
        }
        return f29911d;
    }

    public nir() {
        m35136g();
    }

    private nir m35136g() {
        this.f29914c = null;
        this.unknownFieldData = null;
        this.cachedSize = -1;
        return this;
    }

    public void m35138a(nyu nyu) {
        if (this.f29912a != null) {
            nyu.m37168a(1, this.f29912a.intValue());
        }
        if (this.f29913b != null) {
            nyu.m37168a(2, this.f29913b.intValue());
        }
        if (this.f29914c != null) {
            nyu.m37182b(3, this.f29914c);
        }
        super.a(nyu);
    }

    protected int m35139b() {
        int b = super.b();
        if (this.f29912a != null) {
            b += nyu.m37147f(1, this.f29912a.intValue());
        }
        if (this.f29913b != null) {
            b += nyu.m37147f(2, this.f29913b.intValue());
        }
        if (this.f29914c != null) {
            return b + nyu.m37145d(3, this.f29914c);
        }
        return b;
    }

    private nir m35134b(nyt nyt) {
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
                        case 2:
                        case 3:
                            this.f29912a = Integer.valueOf(a);
                            break;
                        default:
                            continue;
                    }
                case 16:
                    a = nyt.m37112f();
                    switch (a) {
                        case 0:
                        case 1:
                        case 2:
                            this.f29913b = Integer.valueOf(a);
                            break;
                        default:
                            continue;
                    }
                case wi.dx /*26*/:
                    if (this.f29914c == null) {
                        this.f29914c = new nis();
                    }
                    nyt.m37101a(this.f29914c);
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
