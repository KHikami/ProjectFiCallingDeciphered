package p000;

public final class oyo extends nyx<oyo> {
    public nuy[] f34658a;
    public Integer f34659b;
    public Integer f34660c;
    public oyd[] f34661d;

    public /* synthetic */ nzf m39937a(nyt nyt) {
        return m39935b(nyt);
    }

    public oyo() {
        m39936d();
    }

    private oyo m39936d() {
        this.f34658a = nuy.m36666d();
        this.f34659b = null;
        this.f34660c = null;
        this.f34661d = oyd.m39878d();
        this.unknownFieldData = null;
        this.cachedSize = -1;
        return this;
    }

    public void m39938a(nyu nyu) {
        int i = 0;
        if (this.f34658a != null && this.f34658a.length > 0) {
            for (nzf nzf : this.f34658a) {
                if (nzf != null) {
                    nyu.m37182b(1, nzf);
                }
            }
        }
        if (this.f34659b != null) {
            nyu.m37168a(2, this.f34659b.intValue());
        }
        if (this.f34660c != null) {
            nyu.m37168a(3, this.f34660c.intValue());
        }
        if (this.f34661d != null && this.f34661d.length > 0) {
            while (i < this.f34661d.length) {
                nzf nzf2 = this.f34661d[i];
                if (nzf2 != null) {
                    nyu.m37182b(4, nzf2);
                }
                i++;
            }
        }
        super.a(nyu);
    }

    protected int m39939b() {
        int i = 0;
        int b = super.b();
        if (this.f34658a != null && this.f34658a.length > 0) {
            int i2 = b;
            for (nzf nzf : this.f34658a) {
                if (nzf != null) {
                    i2 += nyu.m37145d(1, nzf);
                }
            }
            b = i2;
        }
        if (this.f34659b != null) {
            b += nyu.m37147f(2, this.f34659b.intValue());
        }
        if (this.f34660c != null) {
            b += nyu.m37147f(3, this.f34660c.intValue());
        }
        if (this.f34661d != null && this.f34661d.length > 0) {
            while (i < this.f34661d.length) {
                nzf nzf2 = this.f34661d[i];
                if (nzf2 != null) {
                    b += nyu.m37145d(4, nzf2);
                }
                i++;
            }
        }
        return b;
    }

    private oyo m39935b(nyt nyt) {
        while (true) {
            int a = nyt.m37099a();
            int b;
            Object obj;
            switch (a) {
                case 0:
                    break;
                case 10:
                    b = nzl.m37265b(nyt, 10);
                    if (this.f34658a == null) {
                        a = 0;
                    } else {
                        a = this.f34658a.length;
                    }
                    obj = new nuy[(b + a)];
                    if (a != 0) {
                        System.arraycopy(this.f34658a, 0, obj, 0, a);
                    }
                    while (a < obj.length - 1) {
                        obj[a] = new nuy();
                        nyt.m37101a(obj[a]);
                        nyt.m37099a();
                        a++;
                    }
                    obj[a] = new nuy();
                    nyt.m37101a(obj[a]);
                    this.f34658a = obj;
                    continue;
                case 16:
                    this.f34659b = Integer.valueOf(nyt.m37112f());
                    continue;
                case wi.dA /*24*/:
                    this.f34660c = Integer.valueOf(nyt.m37112f());
                    continue;
                case 34:
                    b = nzl.m37265b(nyt, 34);
                    if (this.f34661d == null) {
                        a = 0;
                    } else {
                        a = this.f34661d.length;
                    }
                    obj = new oyd[(b + a)];
                    if (a != 0) {
                        System.arraycopy(this.f34661d, 0, obj, 0, a);
                    }
                    while (a < obj.length - 1) {
                        obj[a] = new oyd();
                        nyt.m37101a(obj[a]);
                        nyt.m37099a();
                        a++;
                    }
                    obj[a] = new oyd();
                    nyt.m37101a(obj[a]);
                    this.f34661d = obj;
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
