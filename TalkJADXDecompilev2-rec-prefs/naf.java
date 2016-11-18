package p000;

public final class naf extends nyx<naf> {
    public Long f29349a;
    public odr[] f29350b;
    public nur f29351c;

    public /* synthetic */ nzf m34031a(nyt nyt) {
        return m34030b(nyt);
    }

    public naf() {
        this.f29349a = null;
        this.f29350b = odr.m37890d();
        this.cachedSize = -1;
    }

    public void m34032a(nyu nyu) {
        if (this.f29349a != null) {
            nyu.m37181b(1, this.f29349a.longValue());
        }
        if (this.f29350b != null && this.f29350b.length > 0) {
            for (nzf nzf : this.f29350b) {
                if (nzf != null) {
                    nyu.m37182b(2, nzf);
                }
            }
        }
        if (this.f29351c != null) {
            nyu.m37182b(3, this.f29351c);
        }
        super.a(nyu);
    }

    protected int m34033b() {
        int b = super.b();
        if (this.f29349a != null) {
            b += nyu.m37148f(1, this.f29349a.longValue());
        }
        if (this.f29350b != null && this.f29350b.length > 0) {
            int i = b;
            for (nzf nzf : this.f29350b) {
                if (nzf != null) {
                    i += nyu.m37145d(2, nzf);
                }
            }
            b = i;
        }
        if (this.f29351c != null) {
            return b + nyu.m37145d(3, this.f29351c);
        }
        return b;
    }

    private naf m34030b(nyt nyt) {
        while (true) {
            int a = nyt.m37099a();
            switch (a) {
                case 0:
                    break;
                case 8:
                    this.f29349a = Long.valueOf(nyt.m37110e());
                    continue;
                case wi.dH /*18*/:
                    int b = nzl.m37265b(nyt, 18);
                    if (this.f29350b == null) {
                        a = 0;
                    } else {
                        a = this.f29350b.length;
                    }
                    Object obj = new odr[(b + a)];
                    if (a != 0) {
                        System.arraycopy(this.f29350b, 0, obj, 0, a);
                    }
                    while (a < obj.length - 1) {
                        obj[a] = new odr();
                        nyt.m37101a(obj[a]);
                        nyt.m37099a();
                        a++;
                    }
                    obj[a] = new odr();
                    nyt.m37101a(obj[a]);
                    this.f29350b = obj;
                    continue;
                case wi.dx /*26*/:
                    if (this.f29351c == null) {
                        this.f29351c = new nur();
                    }
                    nyt.m37101a(this.f29351c);
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
