package p000;

public final class ogr extends nyx<ogr> {
    public String f32748a;
    public Long f32749b;
    public String f32750c;

    public /* synthetic */ nzf m38226a(nyt nyt) {
        return m38225b(nyt);
    }

    public ogr() {
        this.f32748a = null;
        this.f32749b = null;
        this.f32750c = null;
        this.cachedSize = -1;
    }

    public void m38227a(nyu nyu) {
        if (this.f32748a != null) {
            nyu.m37170a(1, this.f32748a);
        }
        if (this.f32749b != null) {
            nyu.m37169a(2, this.f32749b.longValue());
        }
        if (this.f32750c != null) {
            nyu.m37170a(3, this.f32750c);
        }
        super.a(nyu);
    }

    protected int m38228b() {
        int b = super.b();
        if (this.f32748a != null) {
            b += nyu.m37137b(1, this.f32748a);
        }
        if (this.f32749b != null) {
            b += nyu.m37146e(2, this.f32749b.longValue());
        }
        if (this.f32750c != null) {
            return b + nyu.m37137b(3, this.f32750c);
        }
        return b;
    }

    private ogr m38225b(nyt nyt) {
        while (true) {
            int a = nyt.m37099a();
            switch (a) {
                case 0:
                    break;
                case 10:
                    this.f32748a = nyt.m37117j();
                    continue;
                case 16:
                    this.f32749b = Long.valueOf(nyt.m37109d());
                    continue;
                case wi.dx /*26*/:
                    this.f32750c = nyt.m37117j();
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
