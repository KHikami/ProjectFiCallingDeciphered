package p000;

public final class myr extends nyx<myr> {
    private static volatile myr[] f29170d;
    public int f29171a;
    public String[] f29172b;
    public myq f29173c;

    public /* synthetic */ nzf m33850a(nyt nyt) {
        return m33848b(nyt);
    }

    public static myr[] m33849d() {
        if (f29170d == null) {
            synchronized (nzc.f31309c) {
                if (f29170d == null) {
                    f29170d = new myr[0];
                }
            }
        }
        return f29170d;
    }

    public myr() {
        this.f29171a = nzf.UNSET_ENUM_VALUE;
        this.f29172b = nzl.f31332f;
        this.cachedSize = -1;
    }

    public void m33851a(nyu nyu) {
        if (this.f29171a != nzf.UNSET_ENUM_VALUE) {
            nyu.m37168a(1, this.f29171a);
        }
        if (this.f29172b != null && this.f29172b.length > 0) {
            for (String str : this.f29172b) {
                if (str != null) {
                    nyu.m37170a(2, str);
                }
            }
        }
        if (this.f29173c != null) {
            nyu.m37182b(3, this.f29173c);
        }
        super.a(nyu);
    }

    protected int m33852b() {
        int i = 0;
        int b = super.b();
        if (this.f29171a != nzf.UNSET_ENUM_VALUE) {
            b += nyu.m37147f(1, this.f29171a);
        }
        if (this.f29172b != null && this.f29172b.length > 0) {
            int i2 = 0;
            int i3 = 0;
            while (i < this.f29172b.length) {
                String str = this.f29172b[i];
                if (str != null) {
                    i3++;
                    i2 += nyu.m37140b(str);
                }
                i++;
            }
            b = (b + i2) + (i3 * 1);
        }
        if (this.f29173c != null) {
            return b + nyu.m37145d(3, this.f29173c);
        }
        return b;
    }

    private myr m33848b(nyt nyt) {
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
                        case 4:
                            this.f29171a = a;
                            break;
                        default:
                            continue;
                    }
                case wi.dH /*18*/:
                    int b = nzl.m37265b(nyt, 18);
                    a = this.f29172b == null ? 0 : this.f29172b.length;
                    Object obj = new String[(b + a)];
                    if (a != 0) {
                        System.arraycopy(this.f29172b, 0, obj, 0, a);
                    }
                    while (a < obj.length - 1) {
                        obj[a] = nyt.m37117j();
                        nyt.m37099a();
                        a++;
                    }
                    obj[a] = nyt.m37117j();
                    this.f29172b = obj;
                    continue;
                case wi.dx /*26*/:
                    if (this.f29173c == null) {
                        this.f29173c = new myq();
                    }
                    nyt.m37101a(this.f29173c);
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
