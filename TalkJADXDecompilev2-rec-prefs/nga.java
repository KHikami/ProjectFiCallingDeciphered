package p000;

public final class nga extends nyx<nga> {
    public Long f29746a;
    public njl f29747b;
    public Long f29748c;
    public njl f29749d;
    public Long f29750e;
    public String f29751f;
    public Integer f29752g;
    public Long f29753h;

    public /* synthetic */ nzf m34773a(nyt nyt) {
        return m34771b(nyt);
    }

    public nga() {
        m34772d();
    }

    private nga m34772d() {
        this.f29746a = null;
        this.f29747b = null;
        this.f29748c = null;
        this.f29749d = null;
        this.f29750e = null;
        this.f29751f = null;
        this.f29752g = null;
        this.f29753h = null;
        this.unknownFieldData = null;
        this.cachedSize = -1;
        return this;
    }

    public void m34774a(nyu nyu) {
        if (this.f29746a != null) {
            nyu.m37181b(1, this.f29746a.longValue());
        }
        if (this.f29748c != null) {
            nyu.m37181b(2, this.f29748c.longValue());
        }
        if (this.f29751f != null) {
            nyu.m37170a(3, this.f29751f);
        }
        if (this.f29752g != null) {
            nyu.m37168a(4, this.f29752g.intValue());
        }
        if (this.f29750e != null) {
            nyu.m37181b(5, this.f29750e.longValue());
        }
        if (this.f29747b != null) {
            nyu.m37182b(6, this.f29747b);
        }
        if (this.f29749d != null) {
            nyu.m37182b(7, this.f29749d);
        }
        if (this.f29753h != null) {
            nyu.m37181b(8, this.f29753h.longValue());
        }
        super.a(nyu);
    }

    protected int m34775b() {
        int b = super.b();
        if (this.f29746a != null) {
            b += nyu.m37148f(1, this.f29746a.longValue());
        }
        if (this.f29748c != null) {
            b += nyu.m37148f(2, this.f29748c.longValue());
        }
        if (this.f29751f != null) {
            b += nyu.m37137b(3, this.f29751f);
        }
        if (this.f29752g != null) {
            b += nyu.m37147f(4, this.f29752g.intValue());
        }
        if (this.f29750e != null) {
            b += nyu.m37148f(5, this.f29750e.longValue());
        }
        if (this.f29747b != null) {
            b += nyu.m37145d(6, this.f29747b);
        }
        if (this.f29749d != null) {
            b += nyu.m37145d(7, this.f29749d);
        }
        if (this.f29753h != null) {
            return b + nyu.m37148f(8, this.f29753h.longValue());
        }
        return b;
    }

    private nga m34771b(nyt nyt) {
        while (true) {
            int a = nyt.m37099a();
            switch (a) {
                case 0:
                    break;
                case 8:
                    this.f29746a = Long.valueOf(nyt.m37110e());
                    continue;
                case 16:
                    this.f29748c = Long.valueOf(nyt.m37110e());
                    continue;
                case wi.dx /*26*/:
                    this.f29751f = nyt.m37117j();
                    continue;
                case 32:
                    this.f29752g = Integer.valueOf(nyt.m37112f());
                    continue;
                case 40:
                    this.f29750e = Long.valueOf(nyt.m37110e());
                    continue;
                case 50:
                    if (this.f29747b == null) {
                        this.f29747b = new njl();
                    }
                    nyt.m37101a(this.f29747b);
                    continue;
                case 58:
                    if (this.f29749d == null) {
                        this.f29749d = new njl();
                    }
                    nyt.m37101a(this.f29749d);
                    continue;
                case 64:
                    this.f29753h = Long.valueOf(nyt.m37110e());
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
