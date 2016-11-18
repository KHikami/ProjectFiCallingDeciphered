package p000;

public final class osm extends nyx<osm> {
    public oqu f34157a;
    public osn f34158b;
    public Long f34159c;
    public Long f34160d;
    public Integer f34161e;
    public osn[] f34162f;
    public oqu f34163g;

    public /* synthetic */ nzf m39584a(nyt nyt) {
        return m39582b(nyt);
    }

    public osm() {
        m39583d();
    }

    private osm m39583d() {
        this.f34157a = null;
        this.f34158b = null;
        this.f34159c = null;
        this.f34160d = null;
        this.f34161e = null;
        this.f34162f = osn.m39588d();
        this.f34163g = null;
        this.unknownFieldData = null;
        this.cachedSize = -1;
        return this;
    }

    public void m39585a(nyu nyu) {
        if (this.f34157a != null) {
            nyu.m37182b(1, this.f34157a);
        }
        if (this.f34158b != null) {
            nyu.m37182b(2, this.f34158b);
        }
        if (this.f34159c != null) {
            nyu.m37181b(3, this.f34159c.longValue());
        }
        if (this.f34160d != null) {
            nyu.m37181b(4, this.f34160d.longValue());
        }
        if (this.f34161e != null) {
            nyu.m37186c(5, this.f34161e.intValue());
        }
        if (this.f34162f != null && this.f34162f.length > 0) {
            for (nzf nzf : this.f34162f) {
                if (nzf != null) {
                    nyu.m37182b(6, nzf);
                }
            }
        }
        if (this.f34163g != null) {
            nyu.m37182b(7, this.f34163g);
        }
        super.a(nyu);
    }

    protected int m39586b() {
        int b = super.b();
        if (this.f34157a != null) {
            b += nyu.m37145d(1, this.f34157a);
        }
        if (this.f34158b != null) {
            b += nyu.m37145d(2, this.f34158b);
        }
        if (this.f34159c != null) {
            b += nyu.m37148f(3, this.f34159c.longValue());
        }
        if (this.f34160d != null) {
            b += nyu.m37148f(4, this.f34160d.longValue());
        }
        if (this.f34161e != null) {
            b += nyu.m37151g(5, this.f34161e.intValue());
        }
        if (this.f34162f != null && this.f34162f.length > 0) {
            int i = b;
            for (nzf nzf : this.f34162f) {
                if (nzf != null) {
                    i += nyu.m37145d(6, nzf);
                }
            }
            b = i;
        }
        if (this.f34163g != null) {
            return b + nyu.m37145d(7, this.f34163g);
        }
        return b;
    }

    private osm m39582b(nyt nyt) {
        while (true) {
            int a = nyt.m37099a();
            switch (a) {
                case 0:
                    break;
                case 10:
                    if (this.f34157a == null) {
                        this.f34157a = new oqu();
                    }
                    nyt.m37101a(this.f34157a);
                    continue;
                case wi.dH /*18*/:
                    if (this.f34158b == null) {
                        this.f34158b = new osn();
                    }
                    nyt.m37101a(this.f34158b);
                    continue;
                case wi.dA /*24*/:
                    this.f34159c = Long.valueOf(nyt.m37110e());
                    continue;
                case 32:
                    this.f34160d = Long.valueOf(nyt.m37110e());
                    continue;
                case 40:
                    this.f34161e = Integer.valueOf(nyt.m37119l());
                    continue;
                case 50:
                    int b = nzl.m37265b(nyt, 50);
                    if (this.f34162f == null) {
                        a = 0;
                    } else {
                        a = this.f34162f.length;
                    }
                    Object obj = new osn[(b + a)];
                    if (a != 0) {
                        System.arraycopy(this.f34162f, 0, obj, 0, a);
                    }
                    while (a < obj.length - 1) {
                        obj[a] = new osn();
                        nyt.m37101a(obj[a]);
                        nyt.m37099a();
                        a++;
                    }
                    obj[a] = new osn();
                    nyt.m37101a(obj[a]);
                    this.f34162f = obj;
                    continue;
                case 58:
                    if (this.f34163g == null) {
                        this.f34163g = new oqu();
                    }
                    nyt.m37101a(this.f34163g);
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
