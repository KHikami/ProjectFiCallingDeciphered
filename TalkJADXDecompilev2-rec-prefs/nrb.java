package p000;

public final class nrb extends nyx<nrb> {
    public nox[] f30541a;
    public ncd f30542b;
    public String f30543c;
    public String f30544d;
    public ncf[] f30545e;
    public ncu[] f30546f;
    public Long f30547g;
    public int f30548h;
    public Long f30549i;
    public Long f30550j;
    public Long f30551k;
    public Long f30552l;
    public int f30553m;
    public ndg f30554n;
    public nqs f30555o;
    public nop f30556p;
    public ndo f30557q;
    public nqx f30558r;
    public ntm f30559s;
    public nqo[] f30560t;
    public nrd f30561u;
    public nqu f30562v;
    public nrh f30563w;
    public nsg[] f30564x;
    public int f30565y;

    public /* synthetic */ nzf m36227a(nyt nyt) {
        return m36226b(nyt);
    }

    public nrb() {
        this.f30541a = nox.m35966d();
        this.f30543c = null;
        this.f30544d = null;
        this.f30545e = ncf.m34292d();
        this.f30546f = ncu.m34356d();
        this.f30547g = null;
        this.f30548h = nzf.UNSET_ENUM_VALUE;
        this.f30549i = null;
        this.f30550j = null;
        this.f30551k = null;
        this.f30552l = null;
        this.f30553m = nzf.UNSET_ENUM_VALUE;
        this.f30560t = nqo.m36172d();
        this.f30564x = nsg.m36354d();
        this.f30565y = nzf.UNSET_ENUM_VALUE;
        this.cachedSize = -1;
    }

    public void m36228a(nyu nyu) {
        int i = 0;
        if (this.f30541a != null && this.f30541a.length > 0) {
            for (nzf nzf : this.f30541a) {
                if (nzf != null) {
                    nyu.m37182b(1, nzf);
                }
            }
        }
        if (this.f30542b != null) {
            nyu.m37182b(2, this.f30542b);
        }
        if (this.f30543c != null) {
            nyu.m37170a(3, this.f30543c);
        }
        if (this.f30544d != null) {
            nyu.m37170a(4, this.f30544d);
        }
        if (this.f30545e != null && this.f30545e.length > 0) {
            for (nzf nzf2 : this.f30545e) {
                if (nzf2 != null) {
                    nyu.m37182b(5, nzf2);
                }
            }
        }
        if (this.f30546f != null && this.f30546f.length > 0) {
            for (nzf nzf22 : this.f30546f) {
                if (nzf22 != null) {
                    nyu.m37182b(6, nzf22);
                }
            }
        }
        if (this.f30547g != null) {
            nyu.m37181b(7, this.f30547g.longValue());
        }
        if (this.f30549i != null) {
            nyu.m37181b(8, this.f30549i.longValue());
        }
        if (this.f30550j != null) {
            nyu.m37181b(9, this.f30550j.longValue());
        }
        if (this.f30551k != null) {
            nyu.m37181b(10, this.f30551k.longValue());
        }
        if (this.f30553m != nzf.UNSET_ENUM_VALUE) {
            nyu.m37168a(11, this.f30553m);
        }
        if (this.f30554n != null) {
            nyu.m37182b(12, this.f30554n);
        }
        if (this.f30555o != null) {
            nyu.m37182b(13, this.f30555o);
        }
        if (this.f30556p != null) {
            nyu.m37182b(15, this.f30556p);
        }
        if (this.f30559s != null) {
            nyu.m37182b(16, this.f30559s);
        }
        if (this.f30560t != null && this.f30560t.length > 0) {
            for (nzf nzf222 : this.f30560t) {
                if (nzf222 != null) {
                    nyu.m37182b(17, nzf222);
                }
            }
        }
        if (this.f30561u != null) {
            nyu.m37182b(18, this.f30561u);
        }
        if (this.f30548h != nzf.UNSET_ENUM_VALUE) {
            nyu.m37168a(19, this.f30548h);
        }
        if (this.f30562v != null) {
            nyu.m37182b(21, this.f30562v);
        }
        if (this.f30563w != null) {
            nyu.m37182b(22, this.f30563w);
        }
        if (this.f30564x != null && this.f30564x.length > 0) {
            while (i < this.f30564x.length) {
                nzf nzf3 = this.f30564x[i];
                if (nzf3 != null) {
                    nyu.m37182b(23, nzf3);
                }
                i++;
            }
        }
        if (this.f30565y != nzf.UNSET_ENUM_VALUE) {
            nyu.m37168a(24, this.f30565y);
        }
        if (this.f30557q != null) {
            nyu.m37182b(25, this.f30557q);
        }
        if (this.f30552l != null) {
            nyu.m37181b(26, this.f30552l.longValue());
        }
        if (this.f30558r != null) {
            nyu.m37182b(27, this.f30558r);
        }
        super.a(nyu);
    }

    protected int m36229b() {
        int i;
        int i2 = 0;
        int b = super.b();
        if (this.f30541a != null && this.f30541a.length > 0) {
            i = b;
            for (nzf nzf : this.f30541a) {
                if (nzf != null) {
                    i += nyu.m37145d(1, nzf);
                }
            }
            b = i;
        }
        if (this.f30542b != null) {
            b += nyu.m37145d(2, this.f30542b);
        }
        if (this.f30543c != null) {
            b += nyu.m37137b(3, this.f30543c);
        }
        if (this.f30544d != null) {
            b += nyu.m37137b(4, this.f30544d);
        }
        if (this.f30545e != null && this.f30545e.length > 0) {
            i = b;
            for (nzf nzf2 : this.f30545e) {
                if (nzf2 != null) {
                    i += nyu.m37145d(5, nzf2);
                }
            }
            b = i;
        }
        if (this.f30546f != null && this.f30546f.length > 0) {
            i = b;
            for (nzf nzf22 : this.f30546f) {
                if (nzf22 != null) {
                    i += nyu.m37145d(6, nzf22);
                }
            }
            b = i;
        }
        if (this.f30547g != null) {
            b += nyu.m37148f(7, this.f30547g.longValue());
        }
        if (this.f30549i != null) {
            b += nyu.m37148f(8, this.f30549i.longValue());
        }
        if (this.f30550j != null) {
            b += nyu.m37148f(9, this.f30550j.longValue());
        }
        if (this.f30551k != null) {
            b += nyu.m37148f(10, this.f30551k.longValue());
        }
        if (this.f30553m != nzf.UNSET_ENUM_VALUE) {
            b += nyu.m37147f(11, this.f30553m);
        }
        if (this.f30554n != null) {
            b += nyu.m37145d(12, this.f30554n);
        }
        if (this.f30555o != null) {
            b += nyu.m37145d(13, this.f30555o);
        }
        if (this.f30556p != null) {
            b += nyu.m37145d(15, this.f30556p);
        }
        if (this.f30559s != null) {
            b += nyu.m37145d(16, this.f30559s);
        }
        if (this.f30560t != null && this.f30560t.length > 0) {
            i = b;
            for (nzf nzf222 : this.f30560t) {
                if (nzf222 != null) {
                    i += nyu.m37145d(17, nzf222);
                }
            }
            b = i;
        }
        if (this.f30561u != null) {
            b += nyu.m37145d(18, this.f30561u);
        }
        if (this.f30548h != nzf.UNSET_ENUM_VALUE) {
            b += nyu.m37147f(19, this.f30548h);
        }
        if (this.f30562v != null) {
            b += nyu.m37145d(21, this.f30562v);
        }
        if (this.f30563w != null) {
            b += nyu.m37145d(22, this.f30563w);
        }
        if (this.f30564x != null && this.f30564x.length > 0) {
            while (i2 < this.f30564x.length) {
                nzf nzf3 = this.f30564x[i2];
                if (nzf3 != null) {
                    b += nyu.m37145d(23, nzf3);
                }
                i2++;
            }
        }
        if (this.f30565y != nzf.UNSET_ENUM_VALUE) {
            b += nyu.m37147f(24, this.f30565y);
        }
        if (this.f30557q != null) {
            b += nyu.m37145d(25, this.f30557q);
        }
        if (this.f30552l != null) {
            b += nyu.m37148f(26, this.f30552l.longValue());
        }
        if (this.f30558r != null) {
            return b + nyu.m37145d(27, this.f30558r);
        }
        return b;
    }

    private nrb m36226b(nyt nyt) {
        while (true) {
            int a = nyt.m37099a();
            int b;
            Object obj;
            switch (a) {
                case 0:
                    break;
                case 10:
                    b = nzl.m37265b(nyt, 10);
                    if (this.f30541a == null) {
                        a = 0;
                    } else {
                        a = this.f30541a.length;
                    }
                    obj = new nox[(b + a)];
                    if (a != 0) {
                        System.arraycopy(this.f30541a, 0, obj, 0, a);
                    }
                    while (a < obj.length - 1) {
                        obj[a] = new nox();
                        nyt.m37101a(obj[a]);
                        nyt.m37099a();
                        a++;
                    }
                    obj[a] = new nox();
                    nyt.m37101a(obj[a]);
                    this.f30541a = obj;
                    continue;
                case wi.dH /*18*/:
                    if (this.f30542b == null) {
                        this.f30542b = new ncd();
                    }
                    nyt.m37101a(this.f30542b);
                    continue;
                case wi.dx /*26*/:
                    this.f30543c = nyt.m37117j();
                    continue;
                case 34:
                    this.f30544d = nyt.m37117j();
                    continue;
                case 42:
                    b = nzl.m37265b(nyt, 42);
                    if (this.f30545e == null) {
                        a = 0;
                    } else {
                        a = this.f30545e.length;
                    }
                    obj = new ncf[(b + a)];
                    if (a != 0) {
                        System.arraycopy(this.f30545e, 0, obj, 0, a);
                    }
                    while (a < obj.length - 1) {
                        obj[a] = new ncf();
                        nyt.m37101a(obj[a]);
                        nyt.m37099a();
                        a++;
                    }
                    obj[a] = new ncf();
                    nyt.m37101a(obj[a]);
                    this.f30545e = obj;
                    continue;
                case 50:
                    b = nzl.m37265b(nyt, 50);
                    if (this.f30546f == null) {
                        a = 0;
                    } else {
                        a = this.f30546f.length;
                    }
                    obj = new ncu[(b + a)];
                    if (a != 0) {
                        System.arraycopy(this.f30546f, 0, obj, 0, a);
                    }
                    while (a < obj.length - 1) {
                        obj[a] = new ncu();
                        nyt.m37101a(obj[a]);
                        nyt.m37099a();
                        a++;
                    }
                    obj[a] = new ncu();
                    nyt.m37101a(obj[a]);
                    this.f30546f = obj;
                    continue;
                case 56:
                    this.f30547g = Long.valueOf(nyt.m37110e());
                    continue;
                case 64:
                    this.f30549i = Long.valueOf(nyt.m37110e());
                    continue;
                case 72:
                    this.f30550j = Long.valueOf(nyt.m37110e());
                    continue;
                case 80:
                    this.f30551k = Long.valueOf(nyt.m37110e());
                    continue;
                case 88:
                    a = nyt.m37112f();
                    switch (a) {
                        case 0:
                        case 10:
                        case 20:
                        case 100:
                            this.f30553m = a;
                            break;
                        default:
                            continue;
                    }
                case 98:
                    if (this.f30554n == null) {
                        this.f30554n = new ndg();
                    }
                    nyt.m37101a(this.f30554n);
                    continue;
                case 106:
                    if (this.f30555o == null) {
                        this.f30555o = new nqs();
                    }
                    nyt.m37101a(this.f30555o);
                    continue;
                case 122:
                    if (this.f30556p == null) {
                        this.f30556p = new nop();
                    }
                    nyt.m37101a(this.f30556p);
                    continue;
                case 130:
                    if (this.f30559s == null) {
                        this.f30559s = new ntm();
                    }
                    nyt.m37101a(this.f30559s);
                    continue;
                case 138:
                    b = nzl.m37265b(nyt, 138);
                    if (this.f30560t == null) {
                        a = 0;
                    } else {
                        a = this.f30560t.length;
                    }
                    obj = new nqo[(b + a)];
                    if (a != 0) {
                        System.arraycopy(this.f30560t, 0, obj, 0, a);
                    }
                    while (a < obj.length - 1) {
                        obj[a] = new nqo();
                        nyt.m37101a(obj[a]);
                        nyt.m37099a();
                        a++;
                    }
                    obj[a] = new nqo();
                    nyt.m37101a(obj[a]);
                    this.f30560t = obj;
                    continue;
                case 146:
                    if (this.f30561u == null) {
                        this.f30561u = new nrd();
                    }
                    nyt.m37101a(this.f30561u);
                    continue;
                case 152:
                    a = nyt.m37112f();
                    switch (a) {
                        case 0:
                        case 1:
                        case 2:
                            this.f30548h = a;
                            break;
                        default:
                            continue;
                    }
                case 170:
                    if (this.f30562v == null) {
                        this.f30562v = new nqu();
                    }
                    nyt.m37101a(this.f30562v);
                    continue;
                case 178:
                    if (this.f30563w == null) {
                        this.f30563w = new nrh();
                    }
                    nyt.m37101a(this.f30563w);
                    continue;
                case 186:
                    b = nzl.m37265b(nyt, 186);
                    if (this.f30564x == null) {
                        a = 0;
                    } else {
                        a = this.f30564x.length;
                    }
                    obj = new nsg[(b + a)];
                    if (a != 0) {
                        System.arraycopy(this.f30564x, 0, obj, 0, a);
                    }
                    while (a < obj.length - 1) {
                        obj[a] = new nsg();
                        nyt.m37101a(obj[a]);
                        nyt.m37099a();
                        a++;
                    }
                    obj[a] = new nsg();
                    nyt.m37101a(obj[a]);
                    this.f30564x = obj;
                    continue;
                case 192:
                    a = nyt.m37112f();
                    switch (a) {
                        case 0:
                        case 1:
                        case 2:
                        case 3:
                            this.f30565y = a;
                            break;
                        default:
                            continue;
                    }
                case 202:
                    if (this.f30557q == null) {
                        this.f30557q = new ndo();
                    }
                    nyt.m37101a(this.f30557q);
                    continue;
                case 208:
                    this.f30552l = Long.valueOf(nyt.m37110e());
                    continue;
                case 218:
                    if (this.f30558r == null) {
                        this.f30558r = new nqx();
                    }
                    nyt.m37101a(this.f30558r);
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
