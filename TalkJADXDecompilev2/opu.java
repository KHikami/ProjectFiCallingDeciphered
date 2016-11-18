package defpackage;

public final class opu extends nyx<opu> {
    public oox[] a;
    public oox[] b;
    public Integer c;
    public Integer d;
    public Integer e;
    public oox[] f;
    public opv[] g;
    public oqa[] h;

    public /* synthetic */ nzf a(nyt nyt) {
        return b(nyt);
    }

    public opu() {
        d();
    }

    private opu d() {
        this.a = oox.d();
        this.b = oox.d();
        this.c = null;
        this.d = null;
        this.e = null;
        this.f = oox.d();
        this.g = opv.d();
        this.h = oqa.d();
        this.unknownFieldData = null;
        this.cachedSize = -1;
        return this;
    }

    public void a(nyu nyu) {
        int i = 0;
        if (this.a != null && this.a.length > 0) {
            for (nzf nzf : this.a) {
                if (nzf != null) {
                    nyu.b(1, nzf);
                }
            }
        }
        if (this.b != null && this.b.length > 0) {
            for (nzf nzf2 : this.b) {
                if (nzf2 != null) {
                    nyu.b(2, nzf2);
                }
            }
        }
        if (this.c != null) {
            nyu.a(3, this.c.intValue());
        }
        if (this.f != null && this.f.length > 0) {
            for (nzf nzf22 : this.f) {
                if (nzf22 != null) {
                    nyu.b(4, nzf22);
                }
            }
        }
        if (this.g != null && this.g.length > 0) {
            for (nzf nzf222 : this.g) {
                if (nzf222 != null) {
                    nyu.b(5, nzf222);
                }
            }
        }
        if (this.d != null) {
            nyu.a(6, this.d.intValue());
        }
        if (this.h != null && this.h.length > 0) {
            while (i < this.h.length) {
                nzf nzf3 = this.h[i];
                if (nzf3 != null) {
                    nyu.b(7, nzf3);
                }
                i++;
            }
        }
        if (this.e != null) {
            nyu.a(8, this.e.intValue());
        }
        super.a(nyu);
    }

    protected int b() {
        int i;
        int i2 = 0;
        int b = super.b();
        if (this.a != null && this.a.length > 0) {
            i = b;
            for (nzf nzf : this.a) {
                if (nzf != null) {
                    i += nyu.d(1, nzf);
                }
            }
            b = i;
        }
        if (this.b != null && this.b.length > 0) {
            i = b;
            for (nzf nzf2 : this.b) {
                if (nzf2 != null) {
                    i += nyu.d(2, nzf2);
                }
            }
            b = i;
        }
        if (this.c != null) {
            b += nyu.f(3, this.c.intValue());
        }
        if (this.f != null && this.f.length > 0) {
            i = b;
            for (nzf nzf22 : this.f) {
                if (nzf22 != null) {
                    i += nyu.d(4, nzf22);
                }
            }
            b = i;
        }
        if (this.g != null && this.g.length > 0) {
            i = b;
            for (nzf nzf222 : this.g) {
                if (nzf222 != null) {
                    i += nyu.d(5, nzf222);
                }
            }
            b = i;
        }
        if (this.d != null) {
            b += nyu.f(6, this.d.intValue());
        }
        if (this.h != null && this.h.length > 0) {
            while (i2 < this.h.length) {
                nzf nzf3 = this.h[i2];
                if (nzf3 != null) {
                    b += nyu.d(7, nzf3);
                }
                i2++;
            }
        }
        if (this.e != null) {
            return b + nyu.f(8, this.e.intValue());
        }
        return b;
    }

    private opu b(nyt nyt) {
        while (true) {
            int a = nyt.a();
            int b;
            Object obj;
            switch (a) {
                case 0:
                    break;
                case 10:
                    b = nzl.b(nyt, 10);
                    if (this.a == null) {
                        a = 0;
                    } else {
                        a = this.a.length;
                    }
                    obj = new oox[(b + a)];
                    if (a != 0) {
                        System.arraycopy(this.a, 0, obj, 0, a);
                    }
                    while (a < obj.length - 1) {
                        obj[a] = new oox();
                        nyt.a(obj[a]);
                        nyt.a();
                        a++;
                    }
                    obj[a] = new oox();
                    nyt.a(obj[a]);
                    this.a = obj;
                    continue;
                case wi.dH /*18*/:
                    b = nzl.b(nyt, 18);
                    if (this.b == null) {
                        a = 0;
                    } else {
                        a = this.b.length;
                    }
                    obj = new oox[(b + a)];
                    if (a != 0) {
                        System.arraycopy(this.b, 0, obj, 0, a);
                    }
                    while (a < obj.length - 1) {
                        obj[a] = new oox();
                        nyt.a(obj[a]);
                        nyt.a();
                        a++;
                    }
                    obj[a] = new oox();
                    nyt.a(obj[a]);
                    this.b = obj;
                    continue;
                case wi.dA /*24*/:
                    this.c = Integer.valueOf(nyt.f());
                    continue;
                case 34:
                    b = nzl.b(nyt, 34);
                    if (this.f == null) {
                        a = 0;
                    } else {
                        a = this.f.length;
                    }
                    obj = new oox[(b + a)];
                    if (a != 0) {
                        System.arraycopy(this.f, 0, obj, 0, a);
                    }
                    while (a < obj.length - 1) {
                        obj[a] = new oox();
                        nyt.a(obj[a]);
                        nyt.a();
                        a++;
                    }
                    obj[a] = new oox();
                    nyt.a(obj[a]);
                    this.f = obj;
                    continue;
                case 42:
                    b = nzl.b(nyt, 42);
                    if (this.g == null) {
                        a = 0;
                    } else {
                        a = this.g.length;
                    }
                    obj = new opv[(b + a)];
                    if (a != 0) {
                        System.arraycopy(this.g, 0, obj, 0, a);
                    }
                    while (a < obj.length - 1) {
                        obj[a] = new opv();
                        nyt.a(obj[a]);
                        nyt.a();
                        a++;
                    }
                    obj[a] = new opv();
                    nyt.a(obj[a]);
                    this.g = obj;
                    continue;
                case 48:
                    this.d = Integer.valueOf(nyt.f());
                    continue;
                case 58:
                    b = nzl.b(nyt, 58);
                    if (this.h == null) {
                        a = 0;
                    } else {
                        a = this.h.length;
                    }
                    obj = new oqa[(b + a)];
                    if (a != 0) {
                        System.arraycopy(this.h, 0, obj, 0, a);
                    }
                    while (a < obj.length - 1) {
                        obj[a] = new oqa();
                        nyt.a(obj[a]);
                        nyt.a();
                        a++;
                    }
                    obj[a] = new oqa();
                    nyt.a(obj[a]);
                    this.h = obj;
                    continue;
                case 64:
                    this.e = Integer.valueOf(nyt.f());
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
