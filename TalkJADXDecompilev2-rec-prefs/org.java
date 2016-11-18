package p000;

public final class org extends nyx<org> {
    private static volatile org[] f33986d;
    public Integer f33987a;
    public String f33988b;
    public String f33989c;

    public /* synthetic */ nzf m39413a(nyt nyt) {
        return m39410b(nyt);
    }

    public static org[] m39411d() {
        if (f33986d == null) {
            synchronized (nzc.f31309c) {
                if (f33986d == null) {
                    f33986d = new org[0];
                }
            }
        }
        return f33986d;
    }

    public org() {
        m39412g();
    }

    private org m39412g() {
        this.f33987a = null;
        this.f33988b = null;
        this.f33989c = null;
        this.unknownFieldData = null;
        this.cachedSize = -1;
        return this;
    }

    public void m39414a(nyu nyu) {
        if (this.f33987a != null) {
            nyu.m37168a(1, this.f33987a.intValue());
        }
        if (this.f33988b != null) {
            nyu.m37170a(2, this.f33988b);
        }
        if (this.f33989c != null) {
            nyu.m37170a(3, this.f33989c);
        }
        super.a(nyu);
    }

    protected int m39415b() {
        int b = super.b();
        if (this.f33987a != null) {
            b += nyu.m37147f(1, this.f33987a.intValue());
        }
        if (this.f33988b != null) {
            b += nyu.m37137b(2, this.f33988b);
        }
        if (this.f33989c != null) {
            return b + nyu.m37137b(3, this.f33989c);
        }
        return b;
    }

    private org m39410b(nyt nyt) {
        while (true) {
            int a = nyt.m37099a();
            switch (a) {
                case 0:
                    break;
                case 8:
                    this.f33987a = Integer.valueOf(nyt.m37112f());
                    continue;
                case wi.dH /*18*/:
                    this.f33988b = nyt.m37117j();
                    continue;
                case wi.dx /*26*/:
                    this.f33989c = nyt.m37117j();
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
