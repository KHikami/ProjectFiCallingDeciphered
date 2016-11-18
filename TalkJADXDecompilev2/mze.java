package defpackage;

public final class mze extends nyx<mze> {
    public Integer a;
    public Integer b;
    public Integer c;
    public mzc[] d;
    public mzc[] e;
    public mzb f;
    public myu g;
    public myt[] h;

    public /* synthetic */ nzf a(nyt nyt) {
        return b(nyt);
    }

    public mze() {
        d();
    }

    private mze d() {
        this.a = null;
        this.b = null;
        this.c = null;
        this.d = mzc.d();
        this.e = mzc.d();
        this.f = null;
        this.g = null;
        this.h = myt.d();
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
            nyu.a(2, this.b.intValue());
        }
        if (this.c != null) {
            nyu.a(3, this.c.intValue());
        }
        if (this.d != null && this.d.length > 0) {
            for (nzf nzf : this.d) {
                if (nzf != null) {
                    nyu.b(4, nzf);
                }
            }
        }
        if (this.e != null && this.e.length > 0) {
            for (nzf nzf2 : this.e) {
                if (nzf2 != null) {
                    nyu.b(5, nzf2);
                }
            }
        }
        if (this.f != null) {
            nyu.b(6, this.f);
        }
        if (this.g != null) {
            nyu.b(7, this.g);
        }
        if (this.h != null && this.h.length > 0) {
            while (i < this.h.length) {
                nzf nzf3 = this.h[i];
                if (nzf3 != null) {
                    nyu.b(8, nzf3);
                }
                i++;
            }
        }
        super.a(nyu);
    }

    protected int b() {
        int i;
        int i2 = 0;
        int b = super.b();
        if (this.a != null) {
            b += nyu.f(1, this.a.intValue());
        }
        if (this.b != null) {
            b += nyu.f(2, this.b.intValue());
        }
        if (this.c != null) {
            b += nyu.f(3, this.c.intValue());
        }
        if (this.d != null && this.d.length > 0) {
            i = b;
            for (nzf nzf : this.d) {
                if (nzf != null) {
                    i += nyu.d(4, nzf);
                }
            }
            b = i;
        }
        if (this.e != null && this.e.length > 0) {
            i = b;
            for (nzf nzf2 : this.e) {
                if (nzf2 != null) {
                    i += nyu.d(5, nzf2);
                }
            }
            b = i;
        }
        if (this.f != null) {
            b += nyu.d(6, this.f);
        }
        if (this.g != null) {
            b += nyu.d(7, this.g);
        }
        if (this.h != null && this.h.length > 0) {
            while (i2 < this.h.length) {
                nzf nzf3 = this.h[i2];
                if (nzf3 != null) {
                    b += nyu.d(8, nzf3);
                }
                i2++;
            }
        }
        return b;
    }

    private mze b(nyt nyt) {
        while (true) {
            int a = nyt.a();
            int b;
            Object obj;
            switch (a) {
                case 0:
                    break;
                case 8:
                    this.a = Integer.valueOf(nyt.f());
                    continue;
                case 16:
                    this.b = Integer.valueOf(nyt.f());
                    continue;
                case wi.dA /*24*/:
                    this.c = Integer.valueOf(nyt.f());
                    continue;
                case 34:
                    b = nzl.b(nyt, 34);
                    if (this.d == null) {
                        a = 0;
                    } else {
                        a = this.d.length;
                    }
                    obj = new mzc[(b + a)];
                    if (a != 0) {
                        System.arraycopy(this.d, 0, obj, 0, a);
                    }
                    while (a < obj.length - 1) {
                        obj[a] = new mzc();
                        nyt.a(obj[a]);
                        nyt.a();
                        a++;
                    }
                    obj[a] = new mzc();
                    nyt.a(obj[a]);
                    this.d = obj;
                    continue;
                case 42:
                    b = nzl.b(nyt, 42);
                    if (this.e == null) {
                        a = 0;
                    } else {
                        a = this.e.length;
                    }
                    obj = new mzc[(b + a)];
                    if (a != 0) {
                        System.arraycopy(this.e, 0, obj, 0, a);
                    }
                    while (a < obj.length - 1) {
                        obj[a] = new mzc();
                        nyt.a(obj[a]);
                        nyt.a();
                        a++;
                    }
                    obj[a] = new mzc();
                    nyt.a(obj[a]);
                    this.e = obj;
                    continue;
                case 50:
                    if (this.f == null) {
                        this.f = new mzb();
                    }
                    nyt.a(this.f);
                    continue;
                case 58:
                    if (this.g == null) {
                        this.g = new myu();
                    }
                    nyt.a(this.g);
                    continue;
                case 66:
                    b = nzl.b(nyt, 66);
                    if (this.h == null) {
                        a = 0;
                    } else {
                        a = this.h.length;
                    }
                    obj = new myt[(b + a)];
                    if (a != 0) {
                        System.arraycopy(this.h, 0, obj, 0, a);
                    }
                    while (a < obj.length - 1) {
                        obj[a] = new myt();
                        nyt.a(obj[a]);
                        nyt.a();
                        a++;
                    }
                    obj[a] = new myt();
                    nyt.a(obj[a]);
                    this.h = obj;
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
