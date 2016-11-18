package p000;

public final class ori extends nyx<ori> {
    public oso f34008a;
    public orh[] f34009b;
    public Integer f34010c;
    public Integer f34011d;
    public oqu f34012e;
    public osd f34013f;
    public orc f34014g;
    public orf f34015h;
    public orj f34016i;

    public /* synthetic */ nzf m39424a(nyt nyt) {
        return m39422b(nyt);
    }

    public ori() {
        m39423d();
    }

    private ori m39423d() {
        this.f34008a = null;
        this.f34009b = orh.m39417d();
        this.f34010c = null;
        this.f34011d = null;
        this.f34012e = null;
        this.f34013f = null;
        this.f34014g = null;
        this.f34015h = null;
        this.f34016i = null;
        this.unknownFieldData = null;
        this.cachedSize = -1;
        return this;
    }

    public void m39425a(nyu nyu) {
        if (this.f34008a != null) {
            nyu.m37182b(1, this.f34008a);
        }
        if (this.f34009b != null && this.f34009b.length > 0) {
            for (nzf nzf : this.f34009b) {
                if (nzf != null) {
                    nyu.m37182b(2, nzf);
                }
            }
        }
        if (this.f34010c != null) {
            nyu.m37168a(3, this.f34010c.intValue());
        }
        if (this.f34011d != null) {
            nyu.m37168a(4, this.f34011d.intValue());
        }
        if (this.f34012e != null) {
            nyu.m37182b(5, this.f34012e);
        }
        if (this.f34013f != null) {
            nyu.m37182b(6, this.f34013f);
        }
        if (this.f34014g != null) {
            nyu.m37182b(7, this.f34014g);
        }
        if (this.f34015h != null) {
            nyu.m37182b(60, this.f34015h);
        }
        if (this.f34016i != null) {
            nyu.m37182b(61, this.f34016i);
        }
        super.a(nyu);
    }

    protected int m39426b() {
        int b = super.b();
        if (this.f34008a != null) {
            b += nyu.m37145d(1, this.f34008a);
        }
        if (this.f34009b != null && this.f34009b.length > 0) {
            int i = b;
            for (nzf nzf : this.f34009b) {
                if (nzf != null) {
                    i += nyu.m37145d(2, nzf);
                }
            }
            b = i;
        }
        if (this.f34010c != null) {
            b += nyu.m37147f(3, this.f34010c.intValue());
        }
        if (this.f34011d != null) {
            b += nyu.m37147f(4, this.f34011d.intValue());
        }
        if (this.f34012e != null) {
            b += nyu.m37145d(5, this.f34012e);
        }
        if (this.f34013f != null) {
            b += nyu.m37145d(6, this.f34013f);
        }
        if (this.f34014g != null) {
            b += nyu.m37145d(7, this.f34014g);
        }
        if (this.f34015h != null) {
            b += nyu.m37145d(60, this.f34015h);
        }
        if (this.f34016i != null) {
            return b + nyu.m37145d(61, this.f34016i);
        }
        return b;
    }

    private ori m39422b(nyt nyt) {
        while (true) {
            int a = nyt.m37099a();
            switch (a) {
                case 0:
                    break;
                case 10:
                    if (this.f34008a == null) {
                        this.f34008a = new oso();
                    }
                    nyt.m37101a(this.f34008a);
                    continue;
                case wi.dH /*18*/:
                    int b = nzl.m37265b(nyt, 18);
                    if (this.f34009b == null) {
                        a = 0;
                    } else {
                        a = this.f34009b.length;
                    }
                    Object obj = new orh[(b + a)];
                    if (a != 0) {
                        System.arraycopy(this.f34009b, 0, obj, 0, a);
                    }
                    while (a < obj.length - 1) {
                        obj[a] = new orh();
                        nyt.m37101a(obj[a]);
                        nyt.m37099a();
                        a++;
                    }
                    obj[a] = new orh();
                    nyt.m37101a(obj[a]);
                    this.f34009b = obj;
                    continue;
                case wi.dA /*24*/:
                    this.f34010c = Integer.valueOf(nyt.m37112f());
                    continue;
                case 32:
                    this.f34011d = Integer.valueOf(nyt.m37112f());
                    continue;
                case 42:
                    if (this.f34012e == null) {
                        this.f34012e = new oqu();
                    }
                    nyt.m37101a(this.f34012e);
                    continue;
                case 50:
                    if (this.f34013f == null) {
                        this.f34013f = new osd();
                    }
                    nyt.m37101a(this.f34013f);
                    continue;
                case 58:
                    if (this.f34014g == null) {
                        this.f34014g = new orc();
                    }
                    nyt.m37101a(this.f34014g);
                    continue;
                case 482:
                    if (this.f34015h == null) {
                        this.f34015h = new orf();
                    }
                    nyt.m37101a(this.f34015h);
                    continue;
                case 490:
                    if (this.f34016i == null) {
                        this.f34016i = new orj();
                    }
                    nyt.m37101a(this.f34016i);
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
