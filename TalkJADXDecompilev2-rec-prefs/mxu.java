package p000;

public final class mxu extends nyx<mxu> {
    public Double f29094a;
    public Double f29095b;
    public Double f29096c;
    public Double f29097d;
    public Double f29098e;
    public Double f29099f;

    public /* synthetic */ nzf m33734a(nyt nyt) {
        return m33733b(nyt);
    }

    public mxu() {
        this.f29094a = null;
        this.f29095b = null;
        this.f29096c = null;
        this.f29097d = null;
        this.f29098e = null;
        this.f29099f = null;
        this.cachedSize = -1;
    }

    public void m33735a(nyu nyu) {
        if (this.f29094a != null) {
            nyu.m37166a(1, this.f29094a.doubleValue());
        }
        if (this.f29095b != null) {
            nyu.m37166a(2, this.f29095b.doubleValue());
        }
        if (this.f29096c != null) {
            nyu.m37166a(3, this.f29096c.doubleValue());
        }
        if (this.f29097d != null) {
            nyu.m37166a(4, this.f29097d.doubleValue());
        }
        if (this.f29098e != null) {
            nyu.m37166a(5, this.f29098e.doubleValue());
        }
        if (this.f29099f != null) {
            nyu.m37166a(6, this.f29099f.doubleValue());
        }
        super.a(nyu);
    }

    protected int m33736b() {
        int b = super.b();
        if (this.f29094a != null) {
            this.f29094a.doubleValue();
            b += nyu.m37154h(1) + 8;
        }
        if (this.f29095b != null) {
            this.f29095b.doubleValue();
            b += nyu.m37154h(2) + 8;
        }
        if (this.f29096c != null) {
            this.f29096c.doubleValue();
            b += nyu.m37154h(3) + 8;
        }
        if (this.f29097d != null) {
            this.f29097d.doubleValue();
            b += nyu.m37154h(4) + 8;
        }
        if (this.f29098e != null) {
            this.f29098e.doubleValue();
            b += nyu.m37154h(5) + 8;
        }
        if (this.f29099f == null) {
            return b;
        }
        this.f29099f.doubleValue();
        return b + (nyu.m37154h(6) + 8);
    }

    private mxu m33733b(nyt nyt) {
        while (true) {
            int a = nyt.m37099a();
            switch (a) {
                case 0:
                    break;
                case 9:
                    this.f29094a = Double.valueOf(nyt.m37104b());
                    continue;
                case wi.dK /*17*/:
                    this.f29095b = Double.valueOf(nyt.m37104b());
                    continue;
                case wi.dz /*25*/:
                    this.f29096c = Double.valueOf(nyt.m37104b());
                    continue;
                case 33:
                    this.f29097d = Double.valueOf(nyt.m37104b());
                    continue;
                case 41:
                    this.f29098e = Double.valueOf(nyt.m37104b());
                    continue;
                case 49:
                    this.f29099f = Double.valueOf(nyt.m37104b());
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
