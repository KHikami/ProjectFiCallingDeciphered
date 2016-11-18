package p000;

public final class nua extends nyx<nua> {
    private static volatile nua[] f30807c;
    public String f30808a;
    public nub f30809b;

    public /* synthetic */ nzf m36553a(nyt nyt) {
        return m36550b(nyt);
    }

    public static nua[] m36551d() {
        if (f30807c == null) {
            synchronized (nzc.f31309c) {
                if (f30807c == null) {
                    f30807c = new nua[0];
                }
            }
        }
        return f30807c;
    }

    public nua() {
        m36552g();
    }

    private nua m36552g() {
        this.f30808a = null;
        this.f30809b = null;
        this.unknownFieldData = null;
        this.cachedSize = -1;
        return this;
    }

    public void m36554a(nyu nyu) {
        if (this.f30808a != null) {
            nyu.m37170a(1, this.f30808a);
        }
        if (this.f30809b != null) {
            nyu.m37182b(2, this.f30809b);
        }
        super.a(nyu);
    }

    protected int m36555b() {
        int b = super.b();
        if (this.f30808a != null) {
            b += nyu.m37137b(1, this.f30808a);
        }
        if (this.f30809b != null) {
            return b + nyu.m37145d(2, this.f30809b);
        }
        return b;
    }

    private nua m36550b(nyt nyt) {
        while (true) {
            int a = nyt.m37099a();
            switch (a) {
                case 0:
                    break;
                case 10:
                    this.f30808a = nyt.m37117j();
                    continue;
                case wi.dH /*18*/:
                    if (this.f30809b == null) {
                        this.f30809b = new nub();
                    }
                    nyt.m37101a(this.f30809b);
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
