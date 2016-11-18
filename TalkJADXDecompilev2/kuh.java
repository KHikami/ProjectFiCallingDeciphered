package defpackage;

public final class kuh extends nyx<kuh> {
    private static volatile kuh[] r;
    public String a;
    public kul b;
    public kti c;
    public int d;
    public kuf e;
    public kug f;
    public kul g;
    public kti h;
    public String[] i;
    public kul[] j;
    public kti[] k;
    public Boolean l;
    public Boolean m;
    public Boolean n;
    public int o;
    public kup p;
    public String q;

    public /* synthetic */ nzf a(nyt nyt) {
        return b(nyt);
    }

    public static kuh[] d() {
        if (r == null) {
            synchronized (nzc.c) {
                if (r == null) {
                    r = new kuh[0];
                }
            }
        }
        return r;
    }

    public kuh() {
        this.a = null;
        this.d = nzf.UNSET_ENUM_VALUE;
        this.i = nzl.f;
        this.j = kul.d();
        this.k = kti.d();
        this.l = null;
        this.m = null;
        this.n = null;
        this.o = nzf.UNSET_ENUM_VALUE;
        this.q = null;
        this.cachedSize = -1;
    }

    public void a(nyu nyu) {
        int i = 0;
        nyu.a(1, this.a);
        if (this.b != null) {
            nyu.b(2, this.b);
        }
        if (this.d != nzf.UNSET_ENUM_VALUE) {
            nyu.a(3, this.d);
        }
        if (this.e != null) {
            nyu.b(4, this.e);
        }
        if (this.g != null) {
            nyu.b(5, this.g);
        }
        if (this.i != null && this.i.length > 0) {
            for (String str : this.i) {
                if (str != null) {
                    nyu.a(6, str);
                }
            }
        }
        if (this.j != null && this.j.length > 0) {
            for (nzf nzf : this.j) {
                if (nzf != null) {
                    nyu.b(7, nzf);
                }
            }
        }
        if (this.l != null) {
            nyu.a(8, this.l.booleanValue());
        }
        if (this.m != null) {
            nyu.a(9, this.m.booleanValue());
        }
        if (this.o != nzf.UNSET_ENUM_VALUE) {
            nyu.a(10, this.o);
        }
        if (this.p != null) {
            nyu.b(11, this.p);
        }
        if (this.f != null) {
            nyu.b(12, this.f);
        }
        if (this.n != null) {
            nyu.a(13, this.n.booleanValue());
        }
        if (this.q != null) {
            nyu.a(14, this.q);
        }
        if (this.c != null) {
            nyu.b(15, this.c);
        }
        if (this.h != null) {
            nyu.b(16, this.h);
        }
        if (this.k != null && this.k.length > 0) {
            while (i < this.k.length) {
                nzf nzf2 = this.k[i];
                if (nzf2 != null) {
                    nyu.b(17, nzf2);
                }
                i++;
            }
        }
        super.a(nyu);
    }

    protected int b() {
        int i;
        int i2 = 0;
        int b = super.b() + nyu.b(1, this.a);
        if (this.b != null) {
            b += nyu.d(2, this.b);
        }
        if (this.d != nzf.UNSET_ENUM_VALUE) {
            b += nyu.f(3, this.d);
        }
        if (this.e != null) {
            b += nyu.d(4, this.e);
        }
        if (this.g != null) {
            b += nyu.d(5, this.g);
        }
        if (this.i != null && this.i.length > 0) {
            int i3 = 0;
            int i4 = 0;
            for (String str : this.i) {
                if (str != null) {
                    i4++;
                    i3 += nyu.b(str);
                }
            }
            b = (b + i3) + (i4 * 1);
        }
        if (this.j != null && this.j.length > 0) {
            i = b;
            for (nzf nzf : this.j) {
                if (nzf != null) {
                    i += nyu.d(7, nzf);
                }
            }
            b = i;
        }
        if (this.l != null) {
            this.l.booleanValue();
            b += nyu.h(8) + 1;
        }
        if (this.m != null) {
            this.m.booleanValue();
            b += nyu.h(9) + 1;
        }
        if (this.o != nzf.UNSET_ENUM_VALUE) {
            b += nyu.f(10, this.o);
        }
        if (this.p != null) {
            b += nyu.d(11, this.p);
        }
        if (this.f != null) {
            b += nyu.d(12, this.f);
        }
        if (this.n != null) {
            this.n.booleanValue();
            b += nyu.h(13) + 1;
        }
        if (this.q != null) {
            b += nyu.b(14, this.q);
        }
        if (this.c != null) {
            b += nyu.d(15, this.c);
        }
        if (this.h != null) {
            b += nyu.d(16, this.h);
        }
        if (this.k != null && this.k.length > 0) {
            while (i2 < this.k.length) {
                nzf nzf2 = this.k[i2];
                if (nzf2 != null) {
                    b += nyu.d(17, nzf2);
                }
                i2++;
            }
        }
        return b;
    }

    private kuh b(nyt nyt) {
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
                case wi.dH /*18*/:
                    if (this.b == null) {
                        this.b = new kul();
                    }
                    nyt.a(this.b);
                    continue;
                case wi.dA /*24*/:
                    a = nyt.f();
                    switch (a) {
                        case 0:
                        case 1:
                        case 2:
                        case 3:
                        case 4:
                        case 5:
                            this.d = a;
                            break;
                        default:
                            continue;
                    }
                case 34:
                    if (this.e == null) {
                        this.e = new kuf();
                    }
                    nyt.a(this.e);
                    continue;
                case 42:
                    if (this.g == null) {
                        this.g = new kul();
                    }
                    nyt.a(this.g);
                    continue;
                case 50:
                    b = nzl.b(nyt, 50);
                    a = this.i == null ? 0 : this.i.length;
                    obj = new String[(b + a)];
                    if (a != 0) {
                        System.arraycopy(this.i, 0, obj, 0, a);
                    }
                    while (a < obj.length - 1) {
                        obj[a] = nyt.j();
                        nyt.a();
                        a++;
                    }
                    obj[a] = nyt.j();
                    this.i = obj;
                    continue;
                case 58:
                    b = nzl.b(nyt, 58);
                    if (this.j == null) {
                        a = 0;
                    } else {
                        a = this.j.length;
                    }
                    obj = new kul[(b + a)];
                    if (a != 0) {
                        System.arraycopy(this.j, 0, obj, 0, a);
                    }
                    while (a < obj.length - 1) {
                        obj[a] = new kul();
                        nyt.a(obj[a]);
                        nyt.a();
                        a++;
                    }
                    obj[a] = new kul();
                    nyt.a(obj[a]);
                    this.j = obj;
                    continue;
                case 64:
                    this.l = Boolean.valueOf(nyt.i());
                    continue;
                case 72:
                    this.m = Boolean.valueOf(nyt.i());
                    continue;
                case 80:
                    a = nyt.f();
                    switch (a) {
                        case 1:
                        case 2:
                            this.o = a;
                            break;
                        default:
                            continue;
                    }
                case 90:
                    if (this.p == null) {
                        this.p = new kup();
                    }
                    nyt.a(this.p);
                    continue;
                case 98:
                    if (this.f == null) {
                        this.f = new kug();
                    }
                    nyt.a(this.f);
                    continue;
                case 104:
                    this.n = Boolean.valueOf(nyt.i());
                    continue;
                case 114:
                    this.q = nyt.j();
                    continue;
                case 122:
                    if (this.c == null) {
                        this.c = new kti();
                    }
                    nyt.a(this.c);
                    continue;
                case 130:
                    if (this.h == null) {
                        this.h = new kti();
                    }
                    nyt.a(this.h);
                    continue;
                case 138:
                    b = nzl.b(nyt, 138);
                    if (this.k == null) {
                        a = 0;
                    } else {
                        a = this.k.length;
                    }
                    obj = new kti[(b + a)];
                    if (a != 0) {
                        System.arraycopy(this.k, 0, obj, 0, a);
                    }
                    while (a < obj.length - 1) {
                        obj[a] = new kti();
                        nyt.a(obj[a]);
                        nyt.a();
                        a++;
                    }
                    obj[a] = new kti();
                    nyt.a(obj[a]);
                    this.k = obj;
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
