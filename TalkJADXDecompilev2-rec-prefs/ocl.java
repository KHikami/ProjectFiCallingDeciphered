package p000;

public final class ocl extends nyx<ocl> {
    public String f32268a;
    public String f32269b;
    public String f32270c;
    public String f32271d;
    public String f32272e;

    public /* synthetic */ nzf m37755a(nyt nyt) {
        return m37754b(nyt);
    }

    public ocl() {
        this.f32268a = null;
        this.f32269b = null;
        this.f32270c = null;
        this.f32271d = null;
        this.f32272e = null;
        this.cachedSize = -1;
    }

    public void m37756a(nyu nyu) {
        if (this.f32268a != null) {
            nyu.m37170a(1, this.f32268a);
        }
        if (this.f32269b != null) {
            nyu.m37170a(2, this.f32269b);
        }
        if (this.f32270c != null) {
            nyu.m37170a(3, this.f32270c);
        }
        if (this.f32271d != null) {
            nyu.m37170a(4, this.f32271d);
        }
        if (this.f32272e != null) {
            nyu.m37170a(5, this.f32272e);
        }
        super.a(nyu);
    }

    protected int m37757b() {
        int b = super.b();
        if (this.f32268a != null) {
            b += nyu.m37137b(1, this.f32268a);
        }
        if (this.f32269b != null) {
            b += nyu.m37137b(2, this.f32269b);
        }
        if (this.f32270c != null) {
            b += nyu.m37137b(3, this.f32270c);
        }
        if (this.f32271d != null) {
            b += nyu.m37137b(4, this.f32271d);
        }
        if (this.f32272e != null) {
            return b + nyu.m37137b(5, this.f32272e);
        }
        return b;
    }

    private ocl m37754b(nyt nyt) {
        while (true) {
            int a = nyt.m37099a();
            switch (a) {
                case 0:
                    break;
                case 10:
                    this.f32268a = nyt.m37117j();
                    continue;
                case wi.dH /*18*/:
                    this.f32269b = nyt.m37117j();
                    continue;
                case wi.dx /*26*/:
                    this.f32270c = nyt.m37117j();
                    continue;
                case 34:
                    this.f32271d = nyt.m37117j();
                    continue;
                case 42:
                    this.f32272e = nyt.m37117j();
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
