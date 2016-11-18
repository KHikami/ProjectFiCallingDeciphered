package p000;

public final class ocg extends nyx<ocg> {
    private static volatile ocg[] f32239e;
    public String f32240a;
    public String f32241b;
    public och f32242c;
    public String f32243d;

    public /* synthetic */ nzf m37734a(nyt nyt) {
        return m37732b(nyt);
    }

    public static ocg[] m37733d() {
        if (f32239e == null) {
            synchronized (nzc.f31309c) {
                if (f32239e == null) {
                    f32239e = new ocg[0];
                }
            }
        }
        return f32239e;
    }

    public ocg() {
        this.f32240a = null;
        this.f32241b = null;
        this.f32243d = null;
        this.cachedSize = -1;
    }

    public void m37735a(nyu nyu) {
        if (this.f32240a != null) {
            nyu.m37170a(1, this.f32240a);
        }
        if (this.f32241b != null) {
            nyu.m37170a(2, this.f32241b);
        }
        if (this.f32242c != null) {
            nyu.m37182b(3, this.f32242c);
        }
        if (this.f32243d != null) {
            nyu.m37170a(4, this.f32243d);
        }
        super.a(nyu);
    }

    protected int m37736b() {
        int b = super.b();
        if (this.f32240a != null) {
            b += nyu.m37137b(1, this.f32240a);
        }
        if (this.f32241b != null) {
            b += nyu.m37137b(2, this.f32241b);
        }
        if (this.f32242c != null) {
            b += nyu.m37145d(3, this.f32242c);
        }
        if (this.f32243d != null) {
            return b + nyu.m37137b(4, this.f32243d);
        }
        return b;
    }

    private ocg m37732b(nyt nyt) {
        while (true) {
            int a = nyt.m37099a();
            switch (a) {
                case 0:
                    break;
                case 10:
                    this.f32240a = nyt.m37117j();
                    continue;
                case wi.dH /*18*/:
                    this.f32241b = nyt.m37117j();
                    continue;
                case wi.dx /*26*/:
                    if (this.f32242c == null) {
                        this.f32242c = new och();
                    }
                    nyt.m37101a(this.f32242c);
                    continue;
                case 34:
                    this.f32243d = nyt.m37117j();
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
