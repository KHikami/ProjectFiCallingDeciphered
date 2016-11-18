package p000;

public final class myk extends nyx<myk> {
    public myn f29151a;
    public mym f29152b;
    public myp f29153c;

    public /* synthetic */ nzf m33815a(nyt nyt) {
        return m33813b(nyt);
    }

    public myk() {
        m33814d();
    }

    private myk m33814d() {
        this.f29151a = null;
        this.f29152b = null;
        this.f29153c = null;
        this.unknownFieldData = null;
        this.cachedSize = -1;
        return this;
    }

    public void m33816a(nyu nyu) {
        if (this.f29151a != null) {
            nyu.m37182b(1, this.f29151a);
        }
        if (this.f29152b != null) {
            nyu.m37182b(2, this.f29152b);
        }
        if (this.f29153c != null) {
            nyu.m37182b(3, this.f29153c);
        }
        super.a(nyu);
    }

    protected int m33817b() {
        int b = super.b();
        if (this.f29151a != null) {
            b += nyu.m37145d(1, this.f29151a);
        }
        if (this.f29152b != null) {
            b += nyu.m37145d(2, this.f29152b);
        }
        if (this.f29153c != null) {
            return b + nyu.m37145d(3, this.f29153c);
        }
        return b;
    }

    private myk m33813b(nyt nyt) {
        while (true) {
            int a = nyt.m37099a();
            switch (a) {
                case 0:
                    break;
                case 10:
                    if (this.f29151a == null) {
                        this.f29151a = new myn();
                    }
                    nyt.m37101a(this.f29151a);
                    continue;
                case wi.dH /*18*/:
                    if (this.f29152b == null) {
                        this.f29152b = new mym();
                    }
                    nyt.m37101a(this.f29152b);
                    continue;
                case wi.dx /*26*/:
                    if (this.f29153c == null) {
                        this.f29153c = new myp();
                    }
                    nyt.m37101a(this.f29153c);
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
