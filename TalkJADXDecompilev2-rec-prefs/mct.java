package p000;

public final class mct extends nyx<mct> {
    public Long f27367a;
    public String[] f27368b;
    public mcj[] f27369c;
    public Boolean f27370d;
    public String f27371e;
    public Boolean f27372f;
    public mdd f27373g;

    public /* synthetic */ nzf mo150a(nyt nyt) {
        return m31764b(nyt);
    }

    public mct() {
        m31765d();
    }

    private mct m31765d() {
        this.f27367a = null;
        this.f27368b = nzl.f;
        this.f27369c = mcj.m31712d();
        this.f27370d = null;
        this.f27371e = null;
        this.f27372f = null;
        this.f27373g = null;
        this.unknownFieldData = null;
        this.cachedSize = -1;
        return this;
    }

    public void mo146a(nyu nyu) {
        int i = 0;
        if (this.f27367a != null) {
            nyu.b(1, this.f27367a.longValue());
        }
        if (this.f27368b != null && this.f27368b.length > 0) {
            for (String str : this.f27368b) {
                if (str != null) {
                    nyu.a(2, str);
                }
            }
        }
        if (this.f27370d != null) {
            nyu.a(3, this.f27370d.booleanValue());
        }
        if (this.f27371e != null) {
            nyu.a(4, this.f27371e);
        }
        if (this.f27372f != null) {
            nyu.a(5, this.f27372f.booleanValue());
        }
        if (this.f27369c != null && this.f27369c.length > 0) {
            while (i < this.f27369c.length) {
                nzf nzf = this.f27369c[i];
                if (nzf != null) {
                    nyu.b(6, nzf);
                }
                i++;
            }
        }
        if (this.f27373g != null) {
            nyu.b(7, this.f27373g);
        }
        super.mo146a(nyu);
    }

    protected int mo147b() {
        int i = 0;
        int b = super.mo147b();
        if (this.f27367a != null) {
            b += nyu.f(1, this.f27367a.longValue());
        }
        if (this.f27368b != null && this.f27368b.length > 0) {
            int i2 = 0;
            int i3 = 0;
            for (String str : this.f27368b) {
                if (str != null) {
                    i3++;
                    i2 += nyu.b(str);
                }
            }
            b = (b + i2) + (i3 * 1);
        }
        if (this.f27370d != null) {
            this.f27370d.booleanValue();
            b += nyu.h(3) + 1;
        }
        if (this.f27371e != null) {
            b += nyu.b(4, this.f27371e);
        }
        if (this.f27372f != null) {
            this.f27372f.booleanValue();
            b += nyu.h(5) + 1;
        }
        if (this.f27369c != null && this.f27369c.length > 0) {
            while (i < this.f27369c.length) {
                nzf nzf = this.f27369c[i];
                if (nzf != null) {
                    b += nyu.d(6, nzf);
                }
                i++;
            }
        }
        if (this.f27373g != null) {
            return b + nyu.d(7, this.f27373g);
        }
        return b;
    }

    private mct m31764b(nyt nyt) {
        while (true) {
            int a = nyt.a();
            int b;
            Object obj;
            switch (a) {
                case 0:
                    break;
                case 8:
                    this.f27367a = Long.valueOf(nyt.e());
                    continue;
                case wi.dH /*18*/:
                    b = nzl.b(nyt, 18);
                    a = this.f27368b == null ? 0 : this.f27368b.length;
                    obj = new String[(b + a)];
                    if (a != 0) {
                        System.arraycopy(this.f27368b, 0, obj, 0, a);
                    }
                    while (a < obj.length - 1) {
                        obj[a] = nyt.j();
                        nyt.a();
                        a++;
                    }
                    obj[a] = nyt.j();
                    this.f27368b = obj;
                    continue;
                case wi.dA /*24*/:
                    this.f27370d = Boolean.valueOf(nyt.i());
                    continue;
                case 34:
                    this.f27371e = nyt.j();
                    continue;
                case 40:
                    this.f27372f = Boolean.valueOf(nyt.i());
                    continue;
                case 50:
                    b = nzl.b(nyt, 50);
                    if (this.f27369c == null) {
                        a = 0;
                    } else {
                        a = this.f27369c.length;
                    }
                    obj = new mcj[(b + a)];
                    if (a != 0) {
                        System.arraycopy(this.f27369c, 0, obj, 0, a);
                    }
                    while (a < obj.length - 1) {
                        obj[a] = new mcj();
                        nyt.a(obj[a]);
                        nyt.a();
                        a++;
                    }
                    obj[a] = new mcj();
                    nyt.a(obj[a]);
                    this.f27369c = obj;
                    continue;
                case 58:
                    if (this.f27373g == null) {
                        this.f27373g = new mdd();
                    }
                    nyt.a(this.f27373g);
                    continue;
                default:
                    if (!super.m1039a(nyt, a)) {
                        break;
                    }
                    continue;
            }
            return this;
        }
    }
}
