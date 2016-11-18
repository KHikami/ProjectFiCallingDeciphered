package p000;

public final class mzh extends nyx<mzh> {
    public Integer f29237a;
    public Integer f29238b;
    public Integer f29239c;
    public mzf[] f29240d;
    public mzf[] f29241e;
    public myv f29242f;
    public myx f29243g;
    public myw[] f29244h;

    public /* synthetic */ nzf m33932a(nyt nyt) {
        return m33931b(nyt);
    }

    public mzh() {
        this.f29237a = null;
        this.f29238b = null;
        this.f29239c = null;
        this.f29240d = mzf.m33923d();
        this.f29241e = mzf.m33923d();
        this.f29244h = myw.m33874d();
        this.cachedSize = -1;
    }

    public void m33933a(nyu nyu) {
        int i = 0;
        if (this.f29237a != null) {
            nyu.m37168a(1, this.f29237a.intValue());
        }
        if (this.f29238b != null) {
            nyu.m37168a(2, this.f29238b.intValue());
        }
        if (this.f29239c != null) {
            nyu.m37168a(3, this.f29239c.intValue());
        }
        if (this.f29240d != null && this.f29240d.length > 0) {
            for (nzf nzf : this.f29240d) {
                if (nzf != null) {
                    nyu.m37182b(4, nzf);
                }
            }
        }
        if (this.f29241e != null && this.f29241e.length > 0) {
            for (nzf nzf2 : this.f29241e) {
                if (nzf2 != null) {
                    nyu.m37182b(5, nzf2);
                }
            }
        }
        if (this.f29242f != null) {
            nyu.m37182b(6, this.f29242f);
        }
        if (this.f29243g != null) {
            nyu.m37182b(7, this.f29243g);
        }
        if (this.f29244h != null && this.f29244h.length > 0) {
            while (i < this.f29244h.length) {
                nzf nzf3 = this.f29244h[i];
                if (nzf3 != null) {
                    nyu.m37182b(8, nzf3);
                }
                i++;
            }
        }
        super.a(nyu);
    }

    protected int m33934b() {
        int i;
        int i2 = 0;
        int b = super.b();
        if (this.f29237a != null) {
            b += nyu.m37147f(1, this.f29237a.intValue());
        }
        if (this.f29238b != null) {
            b += nyu.m37147f(2, this.f29238b.intValue());
        }
        if (this.f29239c != null) {
            b += nyu.m37147f(3, this.f29239c.intValue());
        }
        if (this.f29240d != null && this.f29240d.length > 0) {
            i = b;
            for (nzf nzf : this.f29240d) {
                if (nzf != null) {
                    i += nyu.m37145d(4, nzf);
                }
            }
            b = i;
        }
        if (this.f29241e != null && this.f29241e.length > 0) {
            i = b;
            for (nzf nzf2 : this.f29241e) {
                if (nzf2 != null) {
                    i += nyu.m37145d(5, nzf2);
                }
            }
            b = i;
        }
        if (this.f29242f != null) {
            b += nyu.m37145d(6, this.f29242f);
        }
        if (this.f29243g != null) {
            b += nyu.m37145d(7, this.f29243g);
        }
        if (this.f29244h != null && this.f29244h.length > 0) {
            while (i2 < this.f29244h.length) {
                nzf nzf3 = this.f29244h[i2];
                if (nzf3 != null) {
                    b += nyu.m37145d(8, nzf3);
                }
                i2++;
            }
        }
        return b;
    }

    private mzh m33931b(nyt nyt) {
        while (true) {
            int a = nyt.m37099a();
            int b;
            Object obj;
            switch (a) {
                case 0:
                    break;
                case 8:
                    this.f29237a = Integer.valueOf(nyt.m37112f());
                    continue;
                case 16:
                    this.f29238b = Integer.valueOf(nyt.m37112f());
                    continue;
                case wi.dA /*24*/:
                    this.f29239c = Integer.valueOf(nyt.m37112f());
                    continue;
                case 34:
                    b = nzl.m37265b(nyt, 34);
                    if (this.f29240d == null) {
                        a = 0;
                    } else {
                        a = this.f29240d.length;
                    }
                    obj = new mzf[(b + a)];
                    if (a != 0) {
                        System.arraycopy(this.f29240d, 0, obj, 0, a);
                    }
                    while (a < obj.length - 1) {
                        obj[a] = new mzf();
                        nyt.m37101a(obj[a]);
                        nyt.m37099a();
                        a++;
                    }
                    obj[a] = new mzf();
                    nyt.m37101a(obj[a]);
                    this.f29240d = obj;
                    continue;
                case 42:
                    b = nzl.m37265b(nyt, 42);
                    if (this.f29241e == null) {
                        a = 0;
                    } else {
                        a = this.f29241e.length;
                    }
                    obj = new mzf[(b + a)];
                    if (a != 0) {
                        System.arraycopy(this.f29241e, 0, obj, 0, a);
                    }
                    while (a < obj.length - 1) {
                        obj[a] = new mzf();
                        nyt.m37101a(obj[a]);
                        nyt.m37099a();
                        a++;
                    }
                    obj[a] = new mzf();
                    nyt.m37101a(obj[a]);
                    this.f29241e = obj;
                    continue;
                case 50:
                    if (this.f29242f == null) {
                        this.f29242f = new myv();
                    }
                    nyt.m37101a(this.f29242f);
                    continue;
                case 58:
                    if (this.f29243g == null) {
                        this.f29243g = new myx();
                    }
                    nyt.m37101a(this.f29243g);
                    continue;
                case 66:
                    b = nzl.m37265b(nyt, 66);
                    if (this.f29244h == null) {
                        a = 0;
                    } else {
                        a = this.f29244h.length;
                    }
                    obj = new myw[(b + a)];
                    if (a != 0) {
                        System.arraycopy(this.f29244h, 0, obj, 0, a);
                    }
                    while (a < obj.length - 1) {
                        obj[a] = new myw();
                        nyt.m37101a(obj[a]);
                        nyt.m37099a();
                        a++;
                    }
                    obj[a] = new myw();
                    nyt.m37101a(obj[a]);
                    this.f29244h = obj;
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
