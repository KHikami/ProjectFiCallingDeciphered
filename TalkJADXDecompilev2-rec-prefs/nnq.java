package p000;

public final class nnq extends nyx<nnq> {
    private static volatile nnq[] f30302d;
    public String f30303a;
    public String f30304b;
    public Boolean f30305c;

    public /* synthetic */ nzf m35808a(nyt nyt) {
        return m35805b(nyt);
    }

    public static nnq[] m35806d() {
        if (f30302d == null) {
            synchronized (nzc.f31309c) {
                if (f30302d == null) {
                    f30302d = new nnq[0];
                }
            }
        }
        return f30302d;
    }

    public nnq() {
        m35807g();
    }

    private nnq m35807g() {
        this.f30303a = null;
        this.f30304b = null;
        this.f30305c = null;
        this.unknownFieldData = null;
        this.cachedSize = -1;
        return this;
    }

    public void m35809a(nyu nyu) {
        if (this.f30303a != null) {
            nyu.m37170a(1, this.f30303a);
        }
        if (this.f30304b != null) {
            nyu.m37170a(2, this.f30304b);
        }
        if (this.f30305c != null) {
            nyu.m37172a(3, this.f30305c.booleanValue());
        }
        super.a(nyu);
    }

    protected int m35810b() {
        int b = super.b();
        if (this.f30303a != null) {
            b += nyu.m37137b(1, this.f30303a);
        }
        if (this.f30304b != null) {
            b += nyu.m37137b(2, this.f30304b);
        }
        if (this.f30305c == null) {
            return b;
        }
        this.f30305c.booleanValue();
        return b + (nyu.m37154h(3) + 1);
    }

    private nnq m35805b(nyt nyt) {
        while (true) {
            int a = nyt.m37099a();
            switch (a) {
                case 0:
                    break;
                case 10:
                    this.f30303a = nyt.m37117j();
                    continue;
                case wi.dH /*18*/:
                    this.f30304b = nyt.m37117j();
                    continue;
                case wi.dA /*24*/:
                    this.f30305c = Boolean.valueOf(nyt.m37116i());
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
