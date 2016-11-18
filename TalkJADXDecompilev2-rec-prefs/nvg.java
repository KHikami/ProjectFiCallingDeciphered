package p000;

public final class nvg extends nyx<nvg> {
    private static volatile nvg[] f31124d;
    public byte[] f31125a;
    public Integer f31126b;
    public int f31127c;

    public /* synthetic */ nzf m36710a(nyt nyt) {
        return m36708b(nyt);
    }

    public static nvg[] m36709d() {
        if (f31124d == null) {
            synchronized (nzc.f31309c) {
                if (f31124d == null) {
                    f31124d = new nvg[0];
                }
            }
        }
        return f31124d;
    }

    public nvg() {
        this.f31125a = null;
        this.f31126b = null;
        this.f31127c = nzf.UNSET_ENUM_VALUE;
        this.cachedSize = -1;
    }

    public void m36711a(nyu nyu) {
        if (this.f31125a != null) {
            nyu.m37173a(1, this.f31125a);
        }
        if (this.f31126b != null) {
            nyu.m37186c(2, this.f31126b.intValue());
        }
        if (this.f31127c != nzf.UNSET_ENUM_VALUE) {
            nyu.m37168a(3, this.f31127c);
        }
        super.a(nyu);
    }

    protected int m36712b() {
        int b = super.b();
        if (this.f31125a != null) {
            b += nyu.m37139b(1, this.f31125a);
        }
        if (this.f31126b != null) {
            b += nyu.m37151g(2, this.f31126b.intValue());
        }
        if (this.f31127c != nzf.UNSET_ENUM_VALUE) {
            return b + nyu.m37147f(3, this.f31127c);
        }
        return b;
    }

    private nvg m36708b(nyt nyt) {
        while (true) {
            int a = nyt.m37099a();
            switch (a) {
                case 0:
                    break;
                case 10:
                    this.f31125a = nyt.m37118k();
                    continue;
                case 16:
                    this.f31126b = Integer.valueOf(nyt.m37119l());
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
                            this.f31127c = a;
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
