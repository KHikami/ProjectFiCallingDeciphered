package p000;

public final class ope extends nyx<ope> {
    public String f33535a;
    public String f33536b;
    public String f33537c;
    public String f33538d;
    public Boolean f33539e;

    public /* synthetic */ nzf m39019a(nyt nyt) {
        return m39017b(nyt);
    }

    public ope() {
        m39018d();
    }

    private ope m39018d() {
        this.f33535a = null;
        this.f33536b = null;
        this.f33537c = null;
        this.f33538d = null;
        this.f33539e = null;
        this.unknownFieldData = null;
        this.cachedSize = -1;
        return this;
    }

    public void m39020a(nyu nyu) {
        if (this.f33535a != null) {
            nyu.m37170a(1, this.f33535a);
        }
        if (this.f33536b != null) {
            nyu.m37170a(2, this.f33536b);
        }
        if (this.f33537c != null) {
            nyu.m37170a(3, this.f33537c);
        }
        if (this.f33538d != null) {
            nyu.m37170a(4, this.f33538d);
        }
        if (this.f33539e != null) {
            nyu.m37172a(5, this.f33539e.booleanValue());
        }
        super.a(nyu);
    }

    protected int m39021b() {
        int b = super.b();
        if (this.f33535a != null) {
            b += nyu.m37137b(1, this.f33535a);
        }
        if (this.f33536b != null) {
            b += nyu.m37137b(2, this.f33536b);
        }
        if (this.f33537c != null) {
            b += nyu.m37137b(3, this.f33537c);
        }
        if (this.f33538d != null) {
            b += nyu.m37137b(4, this.f33538d);
        }
        if (this.f33539e == null) {
            return b;
        }
        this.f33539e.booleanValue();
        return b + (nyu.m37154h(5) + 1);
    }

    private ope m39017b(nyt nyt) {
        while (true) {
            int a = nyt.m37099a();
            switch (a) {
                case 0:
                    break;
                case 10:
                    this.f33535a = nyt.m37117j();
                    continue;
                case wi.dH /*18*/:
                    this.f33536b = nyt.m37117j();
                    continue;
                case wi.dx /*26*/:
                    this.f33537c = nyt.m37117j();
                    continue;
                case 34:
                    this.f33538d = nyt.m37117j();
                    continue;
                case 40:
                    this.f33539e = Boolean.valueOf(nyt.m37116i());
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
