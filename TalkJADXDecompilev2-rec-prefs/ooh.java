package p000;

public final class ooh extends nyx<ooh> {
    private static volatile ooh[] f33383d;
    public Integer f33384a;
    public Integer f33385b;
    public onp f33386c;

    public /* synthetic */ nzf m38901a(nyt nyt) {
        return m38899b(nyt);
    }

    public static ooh[] m38900d() {
        if (f33383d == null) {
            synchronized (nzc.f31309c) {
                if (f33383d == null) {
                    f33383d = new ooh[0];
                }
            }
        }
        return f33383d;
    }

    public ooh() {
        this.f33384a = null;
        this.f33385b = null;
        this.cachedSize = -1;
    }

    public void m38902a(nyu nyu) {
        if (this.f33384a != null) {
            nyu.m37168a(1, this.f33384a.intValue());
        }
        if (this.f33385b != null) {
            nyu.m37168a(2, this.f33385b.intValue());
        }
        if (this.f33386c != null) {
            nyu.m37182b(3, this.f33386c);
        }
        super.a(nyu);
    }

    protected int m38903b() {
        int b = super.b();
        if (this.f33384a != null) {
            b += nyu.m37147f(1, this.f33384a.intValue());
        }
        if (this.f33385b != null) {
            b += nyu.m37147f(2, this.f33385b.intValue());
        }
        if (this.f33386c != null) {
            return b + nyu.m37145d(3, this.f33386c);
        }
        return b;
    }

    private ooh m38899b(nyt nyt) {
        while (true) {
            int a = nyt.m37099a();
            switch (a) {
                case 0:
                    break;
                case 8:
                    this.f33384a = Integer.valueOf(nyt.m37112f());
                    continue;
                case 16:
                    this.f33385b = Integer.valueOf(nyt.m37112f());
                    continue;
                case wi.dx /*26*/:
                    if (this.f33386c == null) {
                        this.f33386c = new onp();
                    }
                    nyt.m37101a(this.f33386c);
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
