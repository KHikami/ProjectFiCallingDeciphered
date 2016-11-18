package p000;

public final class opb extends nyx<opb> {
    private static volatile opb[] f33518c;
    public String f33519a;
    public String f33520b;

    public /* synthetic */ nzf m39003a(nyt nyt) {
        return m39000b(nyt);
    }

    public static opb[] m39001d() {
        if (f33518c == null) {
            synchronized (nzc.f31309c) {
                if (f33518c == null) {
                    f33518c = new opb[0];
                }
            }
        }
        return f33518c;
    }

    public opb() {
        m39002g();
    }

    private opb m39002g() {
        this.f33519a = null;
        this.f33520b = null;
        this.unknownFieldData = null;
        this.cachedSize = -1;
        return this;
    }

    public void m39004a(nyu nyu) {
        if (this.f33519a != null) {
            nyu.m37170a(1, this.f33519a);
        }
        if (this.f33520b != null) {
            nyu.m37170a(2, this.f33520b);
        }
        super.a(nyu);
    }

    protected int m39005b() {
        int b = super.b();
        if (this.f33519a != null) {
            b += nyu.m37137b(1, this.f33519a);
        }
        if (this.f33520b != null) {
            return b + nyu.m37137b(2, this.f33520b);
        }
        return b;
    }

    private opb m39000b(nyt nyt) {
        while (true) {
            int a = nyt.m37099a();
            switch (a) {
                case 0:
                    break;
                case 10:
                    this.f33519a = nyt.m37117j();
                    continue;
                case wi.dH /*18*/:
                    this.f33520b = nyt.m37117j();
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
