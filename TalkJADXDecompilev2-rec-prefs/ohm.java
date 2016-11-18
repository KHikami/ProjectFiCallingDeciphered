package p000;

public final class ohm extends nyx<ohm> {
    private static volatile ohm[] f32890c;
    public String f32891a;
    public String f32892b;

    public /* synthetic */ nzf m38363a(nyt nyt) {
        return m38361b(nyt);
    }

    public static ohm[] m38362d() {
        if (f32890c == null) {
            synchronized (nzc.f31309c) {
                if (f32890c == null) {
                    f32890c = new ohm[0];
                }
            }
        }
        return f32890c;
    }

    public ohm() {
        this.f32891a = null;
        this.f32892b = null;
        this.cachedSize = -1;
    }

    public void m38364a(nyu nyu) {
        nyu.m37170a(1, this.f32891a);
        if (this.f32892b != null) {
            nyu.m37170a(2, this.f32892b);
        }
        super.a(nyu);
    }

    protected int m38365b() {
        int b = super.b() + nyu.m37137b(1, this.f32891a);
        if (this.f32892b != null) {
            return b + nyu.m37137b(2, this.f32892b);
        }
        return b;
    }

    private ohm m38361b(nyt nyt) {
        while (true) {
            int a = nyt.m37099a();
            switch (a) {
                case 0:
                    break;
                case 10:
                    this.f32891a = nyt.m37117j();
                    continue;
                case wi.dH /*18*/:
                    this.f32892b = nyt.m37117j();
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
