package defpackage;

public final class lla extends nyx<lla> {
    private static volatile lla[] n;
    public String a;
    public String b;
    public String c;
    public String d;
    public String e;
    public Integer f;
    public Integer g;
    public llb[] h;
    public llb[] i;
    public llb[] j;
    public llb[] k;
    public llb[] l;
    public llb[] m;

    public /* synthetic */ nzf a(nyt nyt) {
        return b(nyt);
    }

    public static lla[] d() {
        if (n == null) {
            synchronized (nzc.c) {
                if (n == null) {
                    n = new lla[0];
                }
            }
        }
        return n;
    }

    public lla() {
        g();
    }

    private lla g() {
        this.a = null;
        this.b = null;
        this.c = null;
        this.d = null;
        this.e = null;
        this.h = llb.d();
        this.i = llb.d();
        this.j = llb.d();
        this.k = llb.d();
        this.l = llb.d();
        this.m = llb.d();
        this.unknownFieldData = null;
        this.cachedSize = -1;
        return this;
    }

    public void a(nyu nyu) {
        int i = 0;
        if (this.a != null) {
            nyu.a(2, this.a);
        }
        if (this.b != null) {
            nyu.a(3, this.b);
        }
        if (this.c != null) {
            nyu.a(4, this.c);
        }
        if (this.d != null) {
            nyu.a(5, this.d);
        }
        if (this.e != null) {
            nyu.a(6, this.e);
        }
        if (this.f != null) {
            nyu.a(7, this.f.intValue());
        }
        if (this.g != null) {
            nyu.a(8, this.g.intValue());
        }
        if (this.h != null && this.h.length > 0) {
            for (nzf nzf : this.h) {
                if (nzf != null) {
                    nyu.b(9, nzf);
                }
            }
        }
        if (this.i != null && this.i.length > 0) {
            for (nzf nzf2 : this.i) {
                if (nzf2 != null) {
                    nyu.b(10, nzf2);
                }
            }
        }
        if (this.j != null && this.j.length > 0) {
            for (nzf nzf22 : this.j) {
                if (nzf22 != null) {
                    nyu.b(11, nzf22);
                }
            }
        }
        if (this.k != null && this.k.length > 0) {
            for (nzf nzf222 : this.k) {
                if (nzf222 != null) {
                    nyu.b(12, nzf222);
                }
            }
        }
        if (this.l != null && this.l.length > 0) {
            for (nzf nzf2222 : this.l) {
                if (nzf2222 != null) {
                    nyu.b(13, nzf2222);
                }
            }
        }
        if (this.m != null && this.m.length > 0) {
            while (i < this.m.length) {
                nzf nzf3 = this.m[i];
                if (nzf3 != null) {
                    nyu.b(14, nzf3);
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
            b += nyu.b(2, this.a);
        }
        if (this.b != null) {
            b += nyu.b(3, this.b);
        }
        if (this.c != null) {
            b += nyu.b(4, this.c);
        }
        if (this.d != null) {
            b += nyu.b(5, this.d);
        }
        if (this.e != null) {
            b += nyu.b(6, this.e);
        }
        if (this.f != null) {
            b += nyu.f(7, this.f.intValue());
        }
        if (this.g != null) {
            b += nyu.f(8, this.g.intValue());
        }
        if (this.h != null && this.h.length > 0) {
            i = b;
            for (nzf nzf : this.h) {
                if (nzf != null) {
                    i += nyu.d(9, nzf);
                }
            }
            b = i;
        }
        if (this.i != null && this.i.length > 0) {
            i = b;
            for (nzf nzf2 : this.i) {
                if (nzf2 != null) {
                    i += nyu.d(10, nzf2);
                }
            }
            b = i;
        }
        if (this.j != null && this.j.length > 0) {
            i = b;
            for (nzf nzf22 : this.j) {
                if (nzf22 != null) {
                    i += nyu.d(11, nzf22);
                }
            }
            b = i;
        }
        if (this.k != null && this.k.length > 0) {
            i = b;
            for (nzf nzf222 : this.k) {
                if (nzf222 != null) {
                    i += nyu.d(12, nzf222);
                }
            }
            b = i;
        }
        if (this.l != null && this.l.length > 0) {
            i = b;
            for (nzf nzf2222 : this.l) {
                if (nzf2222 != null) {
                    i += nyu.d(13, nzf2222);
                }
            }
            b = i;
        }
        if (this.m != null && this.m.length > 0) {
            while (i2 < this.m.length) {
                nzf nzf3 = this.m[i2];
                if (nzf3 != null) {
                    b += nyu.d(14, nzf3);
                }
                i2++;
            }
        }
        return b;
    }

    private lla b(nyt nyt) {
        while (true) {
            int a = nyt.a();
            int b;
            Object obj;
            switch (a) {
                case 0:
                    break;
                case wi.dH /*18*/:
                    this.a = nyt.j();
                    continue;
                case wi.dx /*26*/:
                    this.b = nyt.j();
                    continue;
                case 34:
                    this.c = nyt.j();
                    continue;
                case 42:
                    this.d = nyt.j();
                    continue;
                case 50:
                    this.e = nyt.j();
                    continue;
                case 56:
                    a = nyt.f();
                    switch (a) {
                        case 0:
                        case 1:
                        case 2:
                        case 3:
                            this.f = Integer.valueOf(a);
                            break;
                        default:
                            continue;
                    }
                case 64:
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
                case 74:
                    b = nzl.b(nyt, 74);
                    if (this.h == null) {
                        a = 0;
                    } else {
                        a = this.h.length;
                    }
                    obj = new llb[(b + a)];
                    if (a != 0) {
                        System.arraycopy(this.h, 0, obj, 0, a);
                    }
                    while (a < obj.length - 1) {
                        obj[a] = new llb();
                        nyt.a(obj[a]);
                        nyt.a();
                        a++;
                    }
                    obj[a] = new llb();
                    nyt.a(obj[a]);
                    this.h = obj;
                    continue;
                case 82:
                    b = nzl.b(nyt, 82);
                    if (this.i == null) {
                        a = 0;
                    } else {
                        a = this.i.length;
                    }
                    obj = new llb[(b + a)];
                    if (a != 0) {
                        System.arraycopy(this.i, 0, obj, 0, a);
                    }
                    while (a < obj.length - 1) {
                        obj[a] = new llb();
                        nyt.a(obj[a]);
                        nyt.a();
                        a++;
                    }
                    obj[a] = new llb();
                    nyt.a(obj[a]);
                    this.i = obj;
                    continue;
                case 90:
                    b = nzl.b(nyt, 90);
                    if (this.j == null) {
                        a = 0;
                    } else {
                        a = this.j.length;
                    }
                    obj = new llb[(b + a)];
                    if (a != 0) {
                        System.arraycopy(this.j, 0, obj, 0, a);
                    }
                    while (a < obj.length - 1) {
                        obj[a] = new llb();
                        nyt.a(obj[a]);
                        nyt.a();
                        a++;
                    }
                    obj[a] = new llb();
                    nyt.a(obj[a]);
                    this.j = obj;
                    continue;
                case 98:
                    b = nzl.b(nyt, 98);
                    if (this.k == null) {
                        a = 0;
                    } else {
                        a = this.k.length;
                    }
                    obj = new llb[(b + a)];
                    if (a != 0) {
                        System.arraycopy(this.k, 0, obj, 0, a);
                    }
                    while (a < obj.length - 1) {
                        obj[a] = new llb();
                        nyt.a(obj[a]);
                        nyt.a();
                        a++;
                    }
                    obj[a] = new llb();
                    nyt.a(obj[a]);
                    this.k = obj;
                    continue;
                case 106:
                    b = nzl.b(nyt, 106);
                    if (this.l == null) {
                        a = 0;
                    } else {
                        a = this.l.length;
                    }
                    obj = new llb[(b + a)];
                    if (a != 0) {
                        System.arraycopy(this.l, 0, obj, 0, a);
                    }
                    while (a < obj.length - 1) {
                        obj[a] = new llb();
                        nyt.a(obj[a]);
                        nyt.a();
                        a++;
                    }
                    obj[a] = new llb();
                    nyt.a(obj[a]);
                    this.l = obj;
                    continue;
                case 114:
                    b = nzl.b(nyt, 114);
                    if (this.m == null) {
                        a = 0;
                    } else {
                        a = this.m.length;
                    }
                    obj = new llb[(b + a)];
                    if (a != 0) {
                        System.arraycopy(this.m, 0, obj, 0, a);
                    }
                    while (a < obj.length - 1) {
                        obj[a] = new llb();
                        nyt.a(obj[a]);
                        nyt.a();
                        a++;
                    }
                    obj[a] = new llb();
                    nyt.a(obj[a]);
                    this.m = obj;
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
