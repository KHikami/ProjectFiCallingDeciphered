package defpackage;

public final class osm extends nyx<osm> {
    public oqu a;
    public osn b;
    public Long c;
    public Long d;
    public Integer e;
    public osn[] f;
    public oqu g;

    public /* synthetic */ nzf a(nyt nyt) {
        return b(nyt);
    }

    public osm() {
        d();
    }

    private osm d() {
        this.a = null;
        this.b = null;
        this.c = null;
        this.d = null;
        this.e = null;
        this.f = osn.d();
        this.g = null;
        this.unknownFieldData = null;
        this.cachedSize = -1;
        return this;
    }

    public void a(nyu nyu) {
        if (this.a != null) {
            nyu.b(1, this.a);
        }
        if (this.b != null) {
            nyu.b(2, this.b);
        }
        if (this.c != null) {
            nyu.b(3, this.c.longValue());
        }
        if (this.d != null) {
            nyu.b(4, this.d.longValue());
        }
        if (this.e != null) {
            nyu.c(5, this.e.intValue());
        }
        if (this.f != null && this.f.length > 0) {
            for (nzf nzf : this.f) {
                if (nzf != null) {
                    nyu.b(6, nzf);
                }
            }
        }
        if (this.g != null) {
            nyu.b(7, this.g);
        }
        super.a(nyu);
    }

    protected int b() {
        int b = super.b();
        if (this.a != null) {
            b += nyu.d(1, this.a);
        }
        if (this.b != null) {
            b += nyu.d(2, this.b);
        }
        if (this.c != null) {
            b += nyu.f(3, this.c.longValue());
        }
        if (this.d != null) {
            b += nyu.f(4, this.d.longValue());
        }
        if (this.e != null) {
            b += nyu.g(5, this.e.intValue());
        }
        if (this.f != null && this.f.length > 0) {
            int i = b;
            for (nzf nzf : this.f) {
                if (nzf != null) {
                    i += nyu.d(6, nzf);
                }
            }
            b = i;
        }
        if (this.g != null) {
            return b + nyu.d(7, this.g);
        }
        return b;
    }

    private osm b(nyt nyt) {
        while (true) {
            int a = nyt.a();
            switch (a) {
                case 0:
                    break;
                case 10:
                    if (this.a == null) {
                        this.a = new oqu();
                    }
                    nyt.a(this.a);
                    continue;
                case wi.dH /*18*/:
                    if (this.b == null) {
                        this.b = new osn();
                    }
                    nyt.a(this.b);
                    continue;
                case wi.dA /*24*/:
                    this.c = Long.valueOf(nyt.e());
                    continue;
                case 32:
                    this.d = Long.valueOf(nyt.e());
                    continue;
                case 40:
                    this.e = Integer.valueOf(nyt.l());
                    continue;
                case 50:
                    int b = nzl.b(nyt, 50);
                    if (this.f == null) {
                        a = 0;
                    } else {
                        a = this.f.length;
                    }
                    Object obj = new osn[(b + a)];
                    if (a != 0) {
                        System.arraycopy(this.f, 0, obj, 0, a);
                    }
                    while (a < obj.length - 1) {
                        obj[a] = new osn();
                        nyt.a(obj[a]);
                        nyt.a();
                        a++;
                    }
                    obj[a] = new osn();
                    nyt.a(obj[a]);
                    this.f = obj;
                    continue;
                case 58:
                    if (this.g == null) {
                        this.g = new oqu();
                    }
                    nyt.a(this.g);
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
