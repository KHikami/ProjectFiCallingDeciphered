package p000;

public final class lla extends nyx<lla> {
    private static volatile lla[] f25297n;
    public String f25298a;
    public String f25299b;
    public String f25300c;
    public String f25301d;
    public String f25302e;
    public Integer f25303f;
    public Integer f25304g;
    public llb[] f25305h;
    public llb[] f25306i;
    public llb[] f25307j;
    public llb[] f25308k;
    public llb[] f25309l;
    public llb[] f25310m;

    public /* synthetic */ nzf mo150a(nyt nyt) {
        return m29304b(nyt);
    }

    public static lla[] m29305d() {
        if (f25297n == null) {
            synchronized (nzc.c) {
                if (f25297n == null) {
                    f25297n = new lla[0];
                }
            }
        }
        return f25297n;
    }

    public lla() {
        m29306g();
    }

    private lla m29306g() {
        this.f25298a = null;
        this.f25299b = null;
        this.f25300c = null;
        this.f25301d = null;
        this.f25302e = null;
        this.f25305h = llb.m29311d();
        this.f25306i = llb.m29311d();
        this.f25307j = llb.m29311d();
        this.f25308k = llb.m29311d();
        this.f25309l = llb.m29311d();
        this.f25310m = llb.m29311d();
        this.unknownFieldData = null;
        this.cachedSize = -1;
        return this;
    }

    public void mo146a(nyu nyu) {
        int i = 0;
        if (this.f25298a != null) {
            nyu.a(2, this.f25298a);
        }
        if (this.f25299b != null) {
            nyu.a(3, this.f25299b);
        }
        if (this.f25300c != null) {
            nyu.a(4, this.f25300c);
        }
        if (this.f25301d != null) {
            nyu.a(5, this.f25301d);
        }
        if (this.f25302e != null) {
            nyu.a(6, this.f25302e);
        }
        if (this.f25303f != null) {
            nyu.a(7, this.f25303f.intValue());
        }
        if (this.f25304g != null) {
            nyu.a(8, this.f25304g.intValue());
        }
        if (this.f25305h != null && this.f25305h.length > 0) {
            for (nzf nzf : this.f25305h) {
                if (nzf != null) {
                    nyu.b(9, nzf);
                }
            }
        }
        if (this.f25306i != null && this.f25306i.length > 0) {
            for (nzf nzf2 : this.f25306i) {
                if (nzf2 != null) {
                    nyu.b(10, nzf2);
                }
            }
        }
        if (this.f25307j != null && this.f25307j.length > 0) {
            for (nzf nzf22 : this.f25307j) {
                if (nzf22 != null) {
                    nyu.b(11, nzf22);
                }
            }
        }
        if (this.f25308k != null && this.f25308k.length > 0) {
            for (nzf nzf222 : this.f25308k) {
                if (nzf222 != null) {
                    nyu.b(12, nzf222);
                }
            }
        }
        if (this.f25309l != null && this.f25309l.length > 0) {
            for (nzf nzf2222 : this.f25309l) {
                if (nzf2222 != null) {
                    nyu.b(13, nzf2222);
                }
            }
        }
        if (this.f25310m != null && this.f25310m.length > 0) {
            while (i < this.f25310m.length) {
                nzf nzf3 = this.f25310m[i];
                if (nzf3 != null) {
                    nyu.b(14, nzf3);
                }
                i++;
            }
        }
        super.mo146a(nyu);
    }

    protected int mo147b() {
        int i;
        int i2 = 0;
        int b = super.mo147b();
        if (this.f25298a != null) {
            b += nyu.b(2, this.f25298a);
        }
        if (this.f25299b != null) {
            b += nyu.b(3, this.f25299b);
        }
        if (this.f25300c != null) {
            b += nyu.b(4, this.f25300c);
        }
        if (this.f25301d != null) {
            b += nyu.b(5, this.f25301d);
        }
        if (this.f25302e != null) {
            b += nyu.b(6, this.f25302e);
        }
        if (this.f25303f != null) {
            b += nyu.f(7, this.f25303f.intValue());
        }
        if (this.f25304g != null) {
            b += nyu.f(8, this.f25304g.intValue());
        }
        if (this.f25305h != null && this.f25305h.length > 0) {
            i = b;
            for (nzf nzf : this.f25305h) {
                if (nzf != null) {
                    i += nyu.d(9, nzf);
                }
            }
            b = i;
        }
        if (this.f25306i != null && this.f25306i.length > 0) {
            i = b;
            for (nzf nzf2 : this.f25306i) {
                if (nzf2 != null) {
                    i += nyu.d(10, nzf2);
                }
            }
            b = i;
        }
        if (this.f25307j != null && this.f25307j.length > 0) {
            i = b;
            for (nzf nzf22 : this.f25307j) {
                if (nzf22 != null) {
                    i += nyu.d(11, nzf22);
                }
            }
            b = i;
        }
        if (this.f25308k != null && this.f25308k.length > 0) {
            i = b;
            for (nzf nzf222 : this.f25308k) {
                if (nzf222 != null) {
                    i += nyu.d(12, nzf222);
                }
            }
            b = i;
        }
        if (this.f25309l != null && this.f25309l.length > 0) {
            i = b;
            for (nzf nzf2222 : this.f25309l) {
                if (nzf2222 != null) {
                    i += nyu.d(13, nzf2222);
                }
            }
            b = i;
        }
        if (this.f25310m != null && this.f25310m.length > 0) {
            while (i2 < this.f25310m.length) {
                nzf nzf3 = this.f25310m[i2];
                if (nzf3 != null) {
                    b += nyu.d(14, nzf3);
                }
                i2++;
            }
        }
        return b;
    }

    private lla m29304b(nyt nyt) {
        while (true) {
            int a = nyt.a();
            int b;
            Object obj;
            switch (a) {
                case 0:
                    break;
                case wi.dH /*18*/:
                    this.f25298a = nyt.j();
                    continue;
                case wi.dx /*26*/:
                    this.f25299b = nyt.j();
                    continue;
                case 34:
                    this.f25300c = nyt.j();
                    continue;
                case 42:
                    this.f25301d = nyt.j();
                    continue;
                case 50:
                    this.f25302e = nyt.j();
                    continue;
                case 56:
                    a = nyt.f();
                    switch (a) {
                        case 0:
                        case 1:
                        case 2:
                        case 3:
                            this.f25303f = Integer.valueOf(a);
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
                            this.f25304g = Integer.valueOf(a);
                            break;
                        default:
                            continue;
                    }
                case 74:
                    b = nzl.b(nyt, 74);
                    if (this.f25305h == null) {
                        a = 0;
                    } else {
                        a = this.f25305h.length;
                    }
                    obj = new llb[(b + a)];
                    if (a != 0) {
                        System.arraycopy(this.f25305h, 0, obj, 0, a);
                    }
                    while (a < obj.length - 1) {
                        obj[a] = new llb();
                        nyt.a(obj[a]);
                        nyt.a();
                        a++;
                    }
                    obj[a] = new llb();
                    nyt.a(obj[a]);
                    this.f25305h = obj;
                    continue;
                case 82:
                    b = nzl.b(nyt, 82);
                    if (this.f25306i == null) {
                        a = 0;
                    } else {
                        a = this.f25306i.length;
                    }
                    obj = new llb[(b + a)];
                    if (a != 0) {
                        System.arraycopy(this.f25306i, 0, obj, 0, a);
                    }
                    while (a < obj.length - 1) {
                        obj[a] = new llb();
                        nyt.a(obj[a]);
                        nyt.a();
                        a++;
                    }
                    obj[a] = new llb();
                    nyt.a(obj[a]);
                    this.f25306i = obj;
                    continue;
                case 90:
                    b = nzl.b(nyt, 90);
                    if (this.f25307j == null) {
                        a = 0;
                    } else {
                        a = this.f25307j.length;
                    }
                    obj = new llb[(b + a)];
                    if (a != 0) {
                        System.arraycopy(this.f25307j, 0, obj, 0, a);
                    }
                    while (a < obj.length - 1) {
                        obj[a] = new llb();
                        nyt.a(obj[a]);
                        nyt.a();
                        a++;
                    }
                    obj[a] = new llb();
                    nyt.a(obj[a]);
                    this.f25307j = obj;
                    continue;
                case 98:
                    b = nzl.b(nyt, 98);
                    if (this.f25308k == null) {
                        a = 0;
                    } else {
                        a = this.f25308k.length;
                    }
                    obj = new llb[(b + a)];
                    if (a != 0) {
                        System.arraycopy(this.f25308k, 0, obj, 0, a);
                    }
                    while (a < obj.length - 1) {
                        obj[a] = new llb();
                        nyt.a(obj[a]);
                        nyt.a();
                        a++;
                    }
                    obj[a] = new llb();
                    nyt.a(obj[a]);
                    this.f25308k = obj;
                    continue;
                case 106:
                    b = nzl.b(nyt, 106);
                    if (this.f25309l == null) {
                        a = 0;
                    } else {
                        a = this.f25309l.length;
                    }
                    obj = new llb[(b + a)];
                    if (a != 0) {
                        System.arraycopy(this.f25309l, 0, obj, 0, a);
                    }
                    while (a < obj.length - 1) {
                        obj[a] = new llb();
                        nyt.a(obj[a]);
                        nyt.a();
                        a++;
                    }
                    obj[a] = new llb();
                    nyt.a(obj[a]);
                    this.f25309l = obj;
                    continue;
                case 114:
                    b = nzl.b(nyt, 114);
                    if (this.f25310m == null) {
                        a = 0;
                    } else {
                        a = this.f25310m.length;
                    }
                    obj = new llb[(b + a)];
                    if (a != 0) {
                        System.arraycopy(this.f25310m, 0, obj, 0, a);
                    }
                    while (a < obj.length - 1) {
                        obj[a] = new llb();
                        nyt.a(obj[a]);
                        nyt.a();
                        a++;
                    }
                    obj[a] = new llb();
                    nyt.a(obj[a]);
                    this.f25310m = obj;
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
