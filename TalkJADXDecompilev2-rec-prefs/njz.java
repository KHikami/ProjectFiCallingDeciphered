package p000;

public final class njz extends nyx<njz> {
    private static volatile njz[] f30023c;
    public String f30024a;
    public nka f30025b;

    public /* synthetic */ nzf m35310a(nyt nyt) {
        return m35307b(nyt);
    }

    public static njz[] m35308d() {
        if (f30023c == null) {
            synchronized (nzc.f31309c) {
                if (f30023c == null) {
                    f30023c = new njz[0];
                }
            }
        }
        return f30023c;
    }

    public njz() {
        m35309g();
    }

    private njz m35309g() {
        this.f30024a = null;
        this.f30025b = null;
        this.unknownFieldData = null;
        this.cachedSize = -1;
        return this;
    }

    public void m35311a(nyu nyu) {
        if (this.f30024a != null) {
            nyu.m37170a(1, this.f30024a);
        }
        if (this.f30025b != null) {
            nyu.m37182b(2, this.f30025b);
        }
        super.a(nyu);
    }

    protected int m35312b() {
        int b = super.b();
        if (this.f30024a != null) {
            b += nyu.m37137b(1, this.f30024a);
        }
        if (this.f30025b != null) {
            return b + nyu.m37145d(2, this.f30025b);
        }
        return b;
    }

    private njz m35307b(nyt nyt) {
        while (true) {
            int a = nyt.m37099a();
            switch (a) {
                case 0:
                    break;
                case 10:
                    this.f30024a = nyt.m37117j();
                    continue;
                case wi.dH /*18*/:
                    if (this.f30025b == null) {
                        this.f30025b = new nka();
                    }
                    nyt.m37101a(this.f30025b);
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
