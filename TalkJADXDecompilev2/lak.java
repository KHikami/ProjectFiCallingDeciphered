package defpackage;

public final class lak extends nyx<lak> {
    public Integer a;
    public Long b;
    public Long c;
    public oap[] d;
    public Integer e;
    public oax[] f;

    public /* synthetic */ nzf a(nyt nyt) {
        return b(nyt);
    }

    public lak() {
        d();
    }

    private lak d() {
        this.b = null;
        this.c = null;
        this.d = oap.b;
        this.e = null;
        this.f = oax.d();
        this.unknownFieldData = null;
        this.cachedSize = -1;
        return this;
    }

    public void a(nyu nyu) {
        int i = 0;
        if (this.a != null) {
            nyu.a(1, this.a.intValue());
        }
        if (this.b != null) {
            nyu.b(2, this.b.longValue());
        }
        if (this.c != null) {
            nyu.b(3, this.c.longValue());
        }
        if (this.d != null && this.d.length > 0) {
            for (nzf nzf : this.d) {
                if (nzf != null) {
                    nyu.b(4, nzf);
                }
            }
        }
        if (this.e != null) {
            nyu.a(5, this.e.intValue());
        }
        if (this.f != null && this.f.length > 0) {
            while (i < this.f.length) {
                nzf nzf2 = this.f[i];
                if (nzf2 != null) {
                    nyu.b(6, nzf2);
                }
                i++;
            }
        }
        super.a(nyu);
    }

    protected int b() {
        int i = 0;
        int b = super.b();
        if (this.a != null) {
            b += nyu.f(1, this.a.intValue());
        }
        if (this.b != null) {
            b += nyu.f(2, this.b.longValue());
        }
        if (this.c != null) {
            b += nyu.f(3, this.c.longValue());
        }
        if (this.d != null && this.d.length > 0) {
            int i2 = b;
            for (nzf nzf : this.d) {
                if (nzf != null) {
                    i2 += nyu.d(4, nzf);
                }
            }
            b = i2;
        }
        if (this.e != null) {
            b += nyu.f(5, this.e.intValue());
        }
        if (this.f != null && this.f.length > 0) {
            while (i < this.f.length) {
                nzf nzf2 = this.f[i];
                if (nzf2 != null) {
                    b += nyu.d(6, nzf2);
                }
                i++;
            }
        }
        return b;
    }

    private lak b(nyt nyt) {
        while (true) {
            int a = nyt.a();
            int b;
            Object obj;
            switch (a) {
                case 0:
                    break;
                case 8:
                    a = nyt.f();
                    switch (a) {
                        case 1:
                        case 2:
                        case 3:
                        case 4:
                        case 5:
                            this.a = Integer.valueOf(a);
                            break;
                        default:
                            continue;
                    }
                case 16:
                    this.b = Long.valueOf(nyt.e());
                    continue;
                case wi.dA /*24*/:
                    this.c = Long.valueOf(nyt.e());
                    continue;
                case 34:
                    b = nzl.b(nyt, 34);
                    if (this.d == null) {
                        a = 0;
                    } else {
                        a = this.d.length;
                    }
                    obj = new oap[(b + a)];
                    if (a != 0) {
                        System.arraycopy(this.d, 0, obj, 0, a);
                    }
                    while (a < obj.length - 1) {
                        obj[a] = new oap();
                        nyt.a(obj[a]);
                        nyt.a();
                        a++;
                    }
                    obj[a] = new oap();
                    nyt.a(obj[a]);
                    this.d = obj;
                    continue;
                case 40:
                    this.e = Integer.valueOf(nyt.f());
                    continue;
                case 50:
                    b = nzl.b(nyt, 50);
                    if (this.f == null) {
                        a = 0;
                    } else {
                        a = this.f.length;
                    }
                    obj = new oax[(b + a)];
                    if (a != 0) {
                        System.arraycopy(this.f, 0, obj, 0, a);
                    }
                    while (a < obj.length - 1) {
                        obj[a] = new oax();
                        nyt.a(obj[a]);
                        nyt.a();
                        a++;
                    }
                    obj[a] = new oax();
                    nyt.a(obj[a]);
                    this.f = obj;
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
