package p000;

public final class mzi extends nyx<mzi> {
    public Float f29245a;
    public Float f29246b;
    public mzj f29247c;

    public /* synthetic */ nzf m33936a(nyt nyt) {
        return m33935b(nyt);
    }

    public mzi() {
        this.f29245a = null;
        this.f29246b = null;
        this.cachedSize = -1;
    }

    public void m33937a(nyu nyu) {
        if (this.f29245a != null) {
            nyu.m37167a(1, this.f29245a.floatValue());
        }
        if (this.f29246b != null) {
            nyu.m37167a(2, this.f29246b.floatValue());
        }
        if (this.f29247c != null) {
            nyu.m37182b(3, this.f29247c);
        }
        super.a(nyu);
    }

    protected int m33938b() {
        int b = super.b();
        if (this.f29245a != null) {
            this.f29245a.floatValue();
            b += nyu.m37154h(1) + 4;
        }
        if (this.f29246b != null) {
            this.f29246b.floatValue();
            b += nyu.m37154h(2) + 4;
        }
        if (this.f29247c != null) {
            return b + nyu.m37145d(3, this.f29247c);
        }
        return b;
    }

    private mzi m33935b(nyt nyt) {
        while (true) {
            int a = nyt.m37099a();
            switch (a) {
                case 0:
                    break;
                case 13:
                    this.f29245a = Float.valueOf(nyt.m37106c());
                    continue;
                case 21:
                    this.f29246b = Float.valueOf(nyt.m37106c());
                    continue;
                case wi.dx /*26*/:
                    if (this.f29247c == null) {
                        this.f29247c = new mzj();
                    }
                    nyt.m37101a(this.f29247c);
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
