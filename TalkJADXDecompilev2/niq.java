package defpackage;

public final class niq extends nyx<niq> {
    public String a;
    public nmm[] b;
    public Long c;
    public Long d;
    public niz e;
    public nir[] f;
    public Integer g;
    public int[] h;

    public /* synthetic */ nzf a(nyt nyt) {
        return b(nyt);
    }

    public niq() {
        d();
    }

    private niq d() {
        this.a = null;
        this.b = nmm.d();
        this.c = null;
        this.d = null;
        this.e = null;
        this.f = nir.d();
        this.h = nzl.a;
        this.unknownFieldData = null;
        this.cachedSize = -1;
        return this;
    }

    public void a(nyu nyu) {
        int i = 0;
        if (this.a != null) {
            nyu.a(1, this.a);
        }
        if (this.c != null) {
            nyu.b(2, this.c.longValue());
        }
        if (this.d != null) {
            nyu.b(3, this.d.longValue());
        }
        if (this.f != null && this.f.length > 0) {
            for (nzf nzf : this.f) {
                if (nzf != null) {
                    nyu.b(5, nzf);
                }
            }
        }
        if (this.g != null) {
            nyu.a(6, this.g.intValue());
        }
        if (this.b != null && this.b.length > 0) {
            for (nzf nzf2 : this.b) {
                if (nzf2 != null) {
                    nyu.b(7, nzf2);
                }
            }
        }
        if (this.e != null) {
            nyu.b(9, this.e);
        }
        if (this.h != null && this.h.length > 0) {
            while (i < this.h.length) {
                nyu.a(10, this.h[i]);
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
            b += nyu.b(1, this.a);
        }
        if (this.c != null) {
            b += nyu.f(2, this.c.longValue());
        }
        if (this.d != null) {
            b += nyu.f(3, this.d.longValue());
        }
        if (this.f != null && this.f.length > 0) {
            i = b;
            for (nzf nzf : this.f) {
                if (nzf != null) {
                    i += nyu.d(5, nzf);
                }
            }
            b = i;
        }
        if (this.g != null) {
            b += nyu.f(6, this.g.intValue());
        }
        if (this.b != null && this.b.length > 0) {
            i = b;
            for (nzf nzf2 : this.b) {
                if (nzf2 != null) {
                    i += nyu.d(7, nzf2);
                }
            }
            b = i;
        }
        if (this.e != null) {
            b += nyu.d(9, this.e);
        }
        if (this.h == null || this.h.length <= 0) {
            return b;
        }
        i = 0;
        while (i2 < this.h.length) {
            i += nyu.g(this.h[i2]);
            i2++;
        }
        return (b + i) + (this.h.length * 1);
    }

    private niq b(nyt nyt) {
        while (true) {
            int a = nyt.a();
            int b;
            Object obj;
            switch (a) {
                case 0:
                    break;
                case 10:
                    this.a = nyt.j();
                    continue;
                case 16:
                    this.c = Long.valueOf(nyt.e());
                    continue;
                case wi.dA /*24*/:
                    this.d = Long.valueOf(nyt.e());
                    continue;
                case 42:
                    b = nzl.b(nyt, 42);
                    if (this.f == null) {
                        a = 0;
                    } else {
                        a = this.f.length;
                    }
                    obj = new nir[(b + a)];
                    if (a != 0) {
                        System.arraycopy(this.f, 0, obj, 0, a);
                    }
                    while (a < obj.length - 1) {
                        obj[a] = new nir();
                        nyt.a(obj[a]);
                        nyt.a();
                        a++;
                    }
                    obj[a] = new nir();
                    nyt.a(obj[a]);
                    this.f = obj;
                    continue;
                case 48:
                    a = nyt.f();
                    switch (a) {
                        case 0:
                        case 1:
                        case 2:
                            this.g = Integer.valueOf(a);
                            break;
                        default:
                            continue;
                    }
                case 58:
                    b = nzl.b(nyt, 58);
                    if (this.b == null) {
                        a = 0;
                    } else {
                        a = this.b.length;
                    }
                    obj = new nmm[(b + a)];
                    if (a != 0) {
                        System.arraycopy(this.b, 0, obj, 0, a);
                    }
                    while (a < obj.length - 1) {
                        obj[a] = new nmm();
                        nyt.a(obj[a]);
                        nyt.a();
                        a++;
                    }
                    obj[a] = new nmm();
                    nyt.a(obj[a]);
                    this.b = obj;
                    continue;
                case 74:
                    if (this.e == null) {
                        this.e = new niz();
                    }
                    nyt.a(this.e);
                    continue;
                case 80:
                    b = nzl.b(nyt, 80);
                    a = this.h == null ? 0 : this.h.length;
                    obj = new int[(b + a)];
                    if (a != 0) {
                        System.arraycopy(this.h, 0, obj, 0, a);
                    }
                    while (a < obj.length - 1) {
                        obj[a] = nyt.f();
                        nyt.a();
                        a++;
                    }
                    obj[a] = nyt.f();
                    this.h = obj;
                    continue;
                case 82:
                    int d = nyt.d(nyt.r());
                    b = nyt.u();
                    a = 0;
                    while (nyt.s() > 0) {
                        nyt.f();
                        a++;
                    }
                    nyt.f(b);
                    b = this.h == null ? 0 : this.h.length;
                    Object obj2 = new int[(a + b)];
                    if (b != 0) {
                        System.arraycopy(this.h, 0, obj2, 0, b);
                    }
                    while (b < obj2.length) {
                        obj2[b] = nyt.f();
                        b++;
                    }
                    this.h = obj2;
                    nyt.e(d);
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
