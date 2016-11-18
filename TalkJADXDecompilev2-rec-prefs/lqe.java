package p000;

public final class lqe extends nyx<lqe> {
    public Integer f26085a;
    public String f26086b;
    public String f26087c;
    public String f26088d;
    public String f26089e;
    public String[] f26090f;
    public String[] f26091g;
    public String f26092h;
    public String f26093i;
    public String f26094j;
    public Boolean f26095k;
    public Integer f26096l;
    public Integer f26097m;
    public String[] f26098n;
    public mus[] f26099o;
    public lqf[] f26100p;

    public /* synthetic */ nzf mo150a(nyt nyt) {
        return m30013b(nyt);
    }

    public lqe() {
        m30014d();
    }

    private lqe m30014d() {
        this.f26086b = null;
        this.f26087c = null;
        this.f26088d = null;
        this.f26089e = null;
        this.f26090f = nzl.f;
        this.f26091g = nzl.f;
        this.f26092h = null;
        this.f26093i = null;
        this.f26094j = null;
        this.f26095k = null;
        this.f26098n = nzl.f;
        this.f26099o = mus.m32999d();
        this.f26100p = lqf.m30019d();
        this.unknownFieldData = null;
        this.cachedSize = -1;
        return this;
    }

    public void mo146a(nyu nyu) {
        int i = 0;
        if (this.f26085a != null) {
            nyu.a(1, this.f26085a.intValue());
        }
        if (this.f26086b != null) {
            nyu.a(2, this.f26086b);
        }
        if (this.f26087c != null) {
            nyu.a(3, this.f26087c);
        }
        if (this.f26088d != null) {
            nyu.a(4, this.f26088d);
        }
        if (this.f26090f != null && this.f26090f.length > 0) {
            for (String str : this.f26090f) {
                if (str != null) {
                    nyu.a(5, str);
                }
            }
        }
        if (this.f26091g != null && this.f26091g.length > 0) {
            for (String str2 : this.f26091g) {
                if (str2 != null) {
                    nyu.a(6, str2);
                }
            }
        }
        if (this.f26092h != null) {
            nyu.a(7, this.f26092h);
        }
        if (this.f26093i != null) {
            nyu.a(8, this.f26093i);
        }
        if (this.f26094j != null) {
            nyu.a(9, this.f26094j);
        }
        if (this.f26095k != null) {
            nyu.a(10, this.f26095k.booleanValue());
        }
        if (this.f26096l != null) {
            nyu.a(11, this.f26096l.intValue());
        }
        if (this.f26097m != null) {
            nyu.a(12, this.f26097m.intValue());
        }
        if (this.f26098n != null && this.f26098n.length > 0) {
            for (String str22 : this.f26098n) {
                if (str22 != null) {
                    nyu.a(13, str22);
                }
            }
        }
        if (this.f26099o != null && this.f26099o.length > 0) {
            for (nzf nzf : this.f26099o) {
                if (nzf != null) {
                    nyu.b(14, nzf);
                }
            }
        }
        if (this.f26089e != null) {
            nyu.a(15, this.f26089e);
        }
        if (this.f26100p != null && this.f26100p.length > 0) {
            while (i < this.f26100p.length) {
                nzf nzf2 = this.f26100p[i];
                if (nzf2 != null) {
                    nyu.b(16, nzf2);
                }
                i++;
            }
        }
        super.mo146a(nyu);
    }

    protected int mo147b() {
        int i;
        int i2;
        int i3;
        int i4 = 0;
        int b = super.mo147b();
        if (this.f26085a != null) {
            b += nyu.f(1, this.f26085a.intValue());
        }
        if (this.f26086b != null) {
            b += nyu.b(2, this.f26086b);
        }
        if (this.f26087c != null) {
            b += nyu.b(3, this.f26087c);
        }
        if (this.f26088d != null) {
            b += nyu.b(4, this.f26088d);
        }
        if (this.f26090f != null && this.f26090f.length > 0) {
            i = 0;
            i2 = 0;
            for (String str : this.f26090f) {
                if (str != null) {
                    i2++;
                    i += nyu.b(str);
                }
            }
            b = (b + i) + (i2 * 1);
        }
        if (this.f26091g != null && this.f26091g.length > 0) {
            i = 0;
            i2 = 0;
            for (String str2 : this.f26091g) {
                if (str2 != null) {
                    i2++;
                    i += nyu.b(str2);
                }
            }
            b = (b + i) + (i2 * 1);
        }
        if (this.f26092h != null) {
            b += nyu.b(7, this.f26092h);
        }
        if (this.f26093i != null) {
            b += nyu.b(8, this.f26093i);
        }
        if (this.f26094j != null) {
            b += nyu.b(9, this.f26094j);
        }
        if (this.f26095k != null) {
            this.f26095k.booleanValue();
            b += nyu.h(10) + 1;
        }
        if (this.f26096l != null) {
            b += nyu.f(11, this.f26096l.intValue());
        }
        if (this.f26097m != null) {
            b += nyu.f(12, this.f26097m.intValue());
        }
        if (this.f26098n != null && this.f26098n.length > 0) {
            i = 0;
            i2 = 0;
            for (String str22 : this.f26098n) {
                if (str22 != null) {
                    i2++;
                    i += nyu.b(str22);
                }
            }
            b = (b + i) + (i2 * 1);
        }
        if (this.f26099o != null && this.f26099o.length > 0) {
            i3 = b;
            for (nzf nzf : this.f26099o) {
                if (nzf != null) {
                    i3 += nyu.d(14, nzf);
                }
            }
            b = i3;
        }
        if (this.f26089e != null) {
            b += nyu.b(15, this.f26089e);
        }
        if (this.f26100p != null && this.f26100p.length > 0) {
            while (i4 < this.f26100p.length) {
                nzf nzf2 = this.f26100p[i4];
                if (nzf2 != null) {
                    b += nyu.d(16, nzf2);
                }
                i4++;
            }
        }
        return b;
    }

    private lqe m30013b(nyt nyt) {
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
                            this.f26085a = Integer.valueOf(a);
                            break;
                        default:
                            continue;
                    }
                case wi.dH /*18*/:
                    this.f26086b = nyt.j();
                    continue;
                case wi.dx /*26*/:
                    this.f26087c = nyt.j();
                    continue;
                case 34:
                    this.f26088d = nyt.j();
                    continue;
                case 42:
                    b = nzl.b(nyt, 42);
                    a = this.f26090f == null ? 0 : this.f26090f.length;
                    obj = new String[(b + a)];
                    if (a != 0) {
                        System.arraycopy(this.f26090f, 0, obj, 0, a);
                    }
                    while (a < obj.length - 1) {
                        obj[a] = nyt.j();
                        nyt.a();
                        a++;
                    }
                    obj[a] = nyt.j();
                    this.f26090f = obj;
                    continue;
                case 50:
                    b = nzl.b(nyt, 50);
                    a = this.f26091g == null ? 0 : this.f26091g.length;
                    obj = new String[(b + a)];
                    if (a != 0) {
                        System.arraycopy(this.f26091g, 0, obj, 0, a);
                    }
                    while (a < obj.length - 1) {
                        obj[a] = nyt.j();
                        nyt.a();
                        a++;
                    }
                    obj[a] = nyt.j();
                    this.f26091g = obj;
                    continue;
                case 58:
                    this.f26092h = nyt.j();
                    continue;
                case 66:
                    this.f26093i = nyt.j();
                    continue;
                case 74:
                    this.f26094j = nyt.j();
                    continue;
                case 80:
                    this.f26095k = Boolean.valueOf(nyt.i());
                    continue;
                case 88:
                    a = nyt.f();
                    switch (a) {
                        case 0:
                        case 1:
                        case 2:
                            this.f26096l = Integer.valueOf(a);
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
                            this.f26097m = Integer.valueOf(a);
                            break;
                        default:
                            continue;
                    }
                case 106:
                    b = nzl.b(nyt, 106);
                    a = this.f26098n == null ? 0 : this.f26098n.length;
                    obj = new String[(b + a)];
                    if (a != 0) {
                        System.arraycopy(this.f26098n, 0, obj, 0, a);
                    }
                    while (a < obj.length - 1) {
                        obj[a] = nyt.j();
                        nyt.a();
                        a++;
                    }
                    obj[a] = nyt.j();
                    this.f26098n = obj;
                    continue;
                case 114:
                    b = nzl.b(nyt, 114);
                    if (this.f26099o == null) {
                        a = 0;
                    } else {
                        a = this.f26099o.length;
                    }
                    obj = new mus[(b + a)];
                    if (a != 0) {
                        System.arraycopy(this.f26099o, 0, obj, 0, a);
                    }
                    while (a < obj.length - 1) {
                        obj[a] = new mus();
                        nyt.a(obj[a]);
                        nyt.a();
                        a++;
                    }
                    obj[a] = new mus();
                    nyt.a(obj[a]);
                    this.f26099o = obj;
                    continue;
                case 122:
                    this.f26089e = nyt.j();
                    continue;
                case 130:
                    b = nzl.b(nyt, 130);
                    if (this.f26100p == null) {
                        a = 0;
                    } else {
                        a = this.f26100p.length;
                    }
                    obj = new lqf[(b + a)];
                    if (a != 0) {
                        System.arraycopy(this.f26100p, 0, obj, 0, a);
                    }
                    while (a < obj.length - 1) {
                        obj[a] = new lqf();
                        nyt.a(obj[a]);
                        nyt.a();
                        a++;
                    }
                    obj[a] = new lqf();
                    nyt.a(obj[a]);
                    this.f26100p = obj;
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
