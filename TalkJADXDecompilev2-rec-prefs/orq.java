package p000;

public final class orq extends nyx<orq> {
    private static volatile orq[] f34060d;
    public String f34061a;
    public String f34062b;
    public String f34063c;

    public /* synthetic */ nzf m39468a(nyt nyt) {
        return m39465b(nyt);
    }

    public static orq[] m39466d() {
        if (f34060d == null) {
            synchronized (nzc.f31309c) {
                if (f34060d == null) {
                    f34060d = new orq[0];
                }
            }
        }
        return f34060d;
    }

    public orq() {
        m39467g();
    }

    private orq m39467g() {
        this.f34061a = null;
        this.f34062b = null;
        this.f34063c = null;
        this.unknownFieldData = null;
        this.cachedSize = -1;
        return this;
    }

    public void m39469a(nyu nyu) {
        if (this.f34061a != null) {
            nyu.m37170a(1, this.f34061a);
        }
        if (this.f34062b != null) {
            nyu.m37170a(2, this.f34062b);
        }
        if (this.f34063c != null) {
            nyu.m37170a(3, this.f34063c);
        }
        super.a(nyu);
    }

    protected int m39470b() {
        int b = super.b();
        if (this.f34061a != null) {
            b += nyu.m37137b(1, this.f34061a);
        }
        if (this.f34062b != null) {
            b += nyu.m37137b(2, this.f34062b);
        }
        if (this.f34063c != null) {
            return b + nyu.m37137b(3, this.f34063c);
        }
        return b;
    }

    private orq m39465b(nyt nyt) {
        while (true) {
            int a = nyt.m37099a();
            switch (a) {
                case 0:
                    break;
                case 10:
                    this.f34061a = nyt.m37117j();
                    continue;
                case wi.dH /*18*/:
                    this.f34062b = nyt.m37117j();
                    continue;
                case wi.dx /*26*/:
                    this.f34063c = nyt.m37117j();
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
