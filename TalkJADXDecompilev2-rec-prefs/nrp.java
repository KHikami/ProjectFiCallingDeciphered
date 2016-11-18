package p000;

public final class nrp extends nyx<nrp> {
    private static volatile nrp[] f30610d;
    public String f30611a;
    public String f30612b;
    public int f30613c;

    public /* synthetic */ nzf m36285a(nyt nyt) {
        return m36283b(nyt);
    }

    public static nrp[] m36284d() {
        if (f30610d == null) {
            synchronized (nzc.f31309c) {
                if (f30610d == null) {
                    f30610d = new nrp[0];
                }
            }
        }
        return f30610d;
    }

    public nrp() {
        this.f30611a = null;
        this.f30612b = null;
        this.f30613c = nzf.UNSET_ENUM_VALUE;
        this.cachedSize = -1;
    }

    public void m36286a(nyu nyu) {
        if (this.f30611a != null) {
            nyu.m37170a(1, this.f30611a);
        }
        if (this.f30612b != null) {
            nyu.m37170a(2, this.f30612b);
        }
        if (this.f30613c != nzf.UNSET_ENUM_VALUE) {
            nyu.m37168a(3, this.f30613c);
        }
        super.a(nyu);
    }

    protected int m36287b() {
        int b = super.b();
        if (this.f30611a != null) {
            b += nyu.m37137b(1, this.f30611a);
        }
        if (this.f30612b != null) {
            b += nyu.m37137b(2, this.f30612b);
        }
        if (this.f30613c != nzf.UNSET_ENUM_VALUE) {
            return b + nyu.m37147f(3, this.f30613c);
        }
        return b;
    }

    private nrp m36283b(nyt nyt) {
        while (true) {
            int a = nyt.m37099a();
            switch (a) {
                case 0:
                    break;
                case 10:
                    this.f30611a = nyt.m37117j();
                    continue;
                case wi.dH /*18*/:
                    this.f30612b = nyt.m37117j();
                    continue;
                case wi.dA /*24*/:
                    a = nyt.m37112f();
                    switch (a) {
                        case 0:
                        case 1:
                        case 2:
                        case 3:
                            this.f30613c = a;
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
