package defpackage;

public final class lqe extends nyx<lqe> {
    public Integer a;
    public String b;
    public String c;
    public String d;
    public String e;
    public String[] f;
    public String[] g;
    public String h;
    public String i;
    public String j;
    public Boolean k;
    public Integer l;
    public Integer m;
    public String[] n;
    public mus[] o;
    public lqf[] p;

    public /* synthetic */ nzf a(nyt nyt) {
        return b(nyt);
    }

    public lqe() {
        d();
    }

    private lqe d() {
        this.b = null;
        this.c = null;
        this.d = null;
        this.e = null;
        this.f = nzl.f;
        this.g = nzl.f;
        this.h = null;
        this.i = null;
        this.j = null;
        this.k = null;
        this.n = nzl.f;
        this.o = mus.d();
        this.p = lqf.d();
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
            nyu.a(2, this.b);
        }
        if (this.c != null) {
            nyu.a(3, this.c);
        }
        if (this.d != null) {
            nyu.a(4, this.d);
        }
        if (this.f != null && this.f.length > 0) {
            for (String str : this.f) {
                if (str != null) {
                    nyu.a(5, str);
                }
            }
        }
        if (this.g != null && this.g.length > 0) {
            for (String str2 : this.g) {
                if (str2 != null) {
                    nyu.a(6, str2);
                }
            }
        }
        if (this.h != null) {
            nyu.a(7, this.h);
        }
        if (this.i != null) {
            nyu.a(8, this.i);
        }
        if (this.j != null) {
            nyu.a(9, this.j);
        }
        if (this.k != null) {
            nyu.a(10, this.k.booleanValue());
        }
        if (this.l != null) {
            nyu.a(11, this.l.intValue());
        }
        if (this.m != null) {
            nyu.a(12, this.m.intValue());
        }
        if (this.n != null && this.n.length > 0) {
            for (String str22 : this.n) {
                if (str22 != null) {
                    nyu.a(13, str22);
                }
            }
        }
        if (this.o != null && this.o.length > 0) {
            for (nzf nzf : this.o) {
                if (nzf != null) {
                    nyu.b(14, nzf);
                }
            }
        }
        if (this.e != null) {
            nyu.a(15, this.e);
        }
        if (this.p != null && this.p.length > 0) {
            while (i < this.p.length) {
                nzf nzf2 = this.p[i];
                if (nzf2 != null) {
                    nyu.b(16, nzf2);
                }
                i++;
            }
        }
        super.a(nyu);
    }

    protected int b() {
        int i;
        int i2;
        int i3;
        int i4 = 0;
        int b = super.b();
        if (this.a != null) {
            b += nyu.f(1, this.a.intValue());
        }
        if (this.b != null) {
            b += nyu.b(2, this.b);
        }
        if (this.c != null) {
            b += nyu.b(3, this.c);
        }
        if (this.d != null) {
            b += nyu.b(4, this.d);
        }
        if (this.f != null && this.f.length > 0) {
            i = 0;
            i2 = 0;
            for (String str : this.f) {
                if (str != null) {
                    i2++;
                    i += nyu.b(str);
                }
            }
            b = (b + i) + (i2 * 1);
        }
        if (this.g != null && this.g.length > 0) {
            i = 0;
            i2 = 0;
            for (String str2 : this.g) {
                if (str2 != null) {
                    i2++;
                    i += nyu.b(str2);
                }
            }
            b = (b + i) + (i2 * 1);
        }
        if (this.h != null) {
            b += nyu.b(7, this.h);
        }
        if (this.i != null) {
            b += nyu.b(8, this.i);
        }
        if (this.j != null) {
            b += nyu.b(9, this.j);
        }
        if (this.k != null) {
            this.k.booleanValue();
            b += nyu.h(10) + 1;
        }
        if (this.l != null) {
            b += nyu.f(11, this.l.intValue());
        }
        if (this.m != null) {
            b += nyu.f(12, this.m.intValue());
        }
        if (this.n != null && this.n.length > 0) {
            i = 0;
            i2 = 0;
            for (String str22 : this.n) {
                if (str22 != null) {
                    i2++;
                    i += nyu.b(str22);
                }
            }
            b = (b + i) + (i2 * 1);
        }
        if (this.o != null && this.o.length > 0) {
            i3 = b;
            for (nzf nzf : this.o) {
                if (nzf != null) {
                    i3 += nyu.d(14, nzf);
                }
            }
            b = i3;
        }
        if (this.e != null) {
            b += nyu.b(15, this.e);
        }
        if (this.p != null && this.p.length > 0) {
            while (i4 < this.p.length) {
                nzf nzf2 = this.p[i4];
                if (nzf2 != null) {
                    b += nyu.d(16, nzf2);
                }
                i4++;
            }
        }
        return b;
    }

    private lqe b(nyt nyt) {
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
                        case 0:
                        case 1:
                        case 2:
                            this.a = Integer.valueOf(a);
                            break;
                        default:
                            continue;
                    }
                case wi.dH /*18*/:
                    this.b = nyt.j();
                    continue;
                case wi.dx /*26*/:
                    this.c = nyt.j();
                    continue;
                case 34:
                    this.d = nyt.j();
                    continue;
                case 42:
                    b = nzl.b(nyt, 42);
                    a = this.f == null ? 0 : this.f.length;
                    obj = new String[(b + a)];
                    if (a != 0) {
                        System.arraycopy(this.f, 0, obj, 0, a);
                    }
                    while (a < obj.length - 1) {
                        obj[a] = nyt.j();
                        nyt.a();
                        a++;
                    }
                    obj[a] = nyt.j();
                    this.f = obj;
                    continue;
                case 50:
                    b = nzl.b(nyt, 50);
                    a = this.g == null ? 0 : this.g.length;
                    obj = new String[(b + a)];
                    if (a != 0) {
                        System.arraycopy(this.g, 0, obj, 0, a);
                    }
                    while (a < obj.length - 1) {
                        obj[a] = nyt.j();
                        nyt.a();
                        a++;
                    }
                    obj[a] = nyt.j();
                    this.g = obj;
                    continue;
                case 58:
                    this.h = nyt.j();
                    continue;
                case 66:
                    this.i = nyt.j();
                    continue;
                case 74:
                    this.j = nyt.j();
                    continue;
                case 80:
                    this.k = Boolean.valueOf(nyt.i());
                    continue;
                case 88:
                    a = nyt.f();
                    switch (a) {
                        case 0:
                        case 1:
                        case 2:
                            this.l = Integer.valueOf(a);
                            break;
                        default:
                            continue;
                    }
                case 96:
                    a = nyt.f();
                    switch (a) {
                        case 0:
                        case 1:
                        case 2:
                            this.m = Integer.valueOf(a);
                            break;
                        default:
                            continue;
                    }
                case 106:
                    b = nzl.b(nyt, 106);
                    a = this.n == null ? 0 : this.n.length;
                    obj = new String[(b + a)];
                    if (a != 0) {
                        System.arraycopy(this.n, 0, obj, 0, a);
                    }
                    while (a < obj.length - 1) {
                        obj[a] = nyt.j();
                        nyt.a();
                        a++;
                    }
                    obj[a] = nyt.j();
                    this.n = obj;
                    continue;
                case 114:
                    b = nzl.b(nyt, 114);
                    if (this.o == null) {
                        a = 0;
                    } else {
                        a = this.o.length;
                    }
                    obj = new mus[(b + a)];
                    if (a != 0) {
                        System.arraycopy(this.o, 0, obj, 0, a);
                    }
                    while (a < obj.length - 1) {
                        obj[a] = new mus();
                        nyt.a(obj[a]);
                        nyt.a();
                        a++;
                    }
                    obj[a] = new mus();
                    nyt.a(obj[a]);
                    this.o = obj;
                    continue;
                case 122:
                    this.e = nyt.j();
                    continue;
                case 130:
                    b = nzl.b(nyt, 130);
                    if (this.p == null) {
                        a = 0;
                    } else {
                        a = this.p.length;
                    }
                    obj = new lqf[(b + a)];
                    if (a != 0) {
                        System.arraycopy(this.p, 0, obj, 0, a);
                    }
                    while (a < obj.length - 1) {
                        obj[a] = new lqf();
                        nyt.a(obj[a]);
                        nyt.a();
                        a++;
                    }
                    obj[a] = new lqf();
                    nyt.a(obj[a]);
                    this.p = obj;
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
