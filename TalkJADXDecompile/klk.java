public final class klk extends nyx<klk> {
    public Boolean a;
    public Integer b;
    public Long c;
    public String d;
    public Boolean e;
    public Boolean f;
    public kjw[] g;
    public Integer h;
    public Boolean i;
    public kjm[] j;
    public Long k;
    public kkd l;
    public Boolean m;
    public kky[] n;

    public /* synthetic */ nzf a(nyt nyt) {
        return b(nyt);
    }

    public klk() {
        d();
    }

    private klk d() {
        this.a = null;
        this.c = null;
        this.d = null;
        this.e = null;
        this.f = null;
        this.g = kjw.d();
        this.i = null;
        this.j = kjm.d();
        this.k = null;
        this.l = null;
        this.m = null;
        this.n = kky.d();
        this.unknownFieldData = null;
        this.cachedSize = -1;
        return this;
    }

    public void a(nyu nyu) {
        int i = 0;
        if (this.a != null) {
            nyu.a(1, this.a.booleanValue());
        }
        if (this.b != null) {
            nyu.a(2, this.b.intValue());
        }
        if (this.e != null) {
            nyu.a(3, this.e.booleanValue());
        }
        if (this.f != null) {
            nyu.a(4, this.f.booleanValue());
        }
        if (this.k != null) {
            nyu.b(5, this.k.longValue());
        }
        if (this.h != null) {
            nyu.a(6, this.h.intValue());
        }
        if (this.i != null) {
            nyu.a(7, this.i.booleanValue());
        }
        if (this.c != null) {
            nyu.b(8, this.c.longValue());
        }
        if (this.d != null) {
            nyu.a(9, this.d);
        }
        if (this.j != null && this.j.length > 0) {
            for (nzf nzf : this.j) {
                if (nzf != null) {
                    nyu.b(10, nzf);
                }
            }
        }
        if (this.l != null) {
            nyu.b(11, this.l);
        }
        if (this.m != null) {
            nyu.a(12, this.m.booleanValue());
        }
        if (this.g != null && this.g.length > 0) {
            for (nzf nzf2 : this.g) {
                if (nzf2 != null) {
                    nyu.b(13, nzf2);
                }
            }
        }
        if (this.n != null && this.n.length > 0) {
            while (i < this.n.length) {
                nzf nzf3 = this.n[i];
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
            this.a.booleanValue();
            b += nyu.h(1) + 1;
        }
        if (this.b != null) {
            b += nyu.f(2, this.b.intValue());
        }
        if (this.e != null) {
            this.e.booleanValue();
            b += nyu.h(3) + 1;
        }
        if (this.f != null) {
            this.f.booleanValue();
            b += nyu.h(4) + 1;
        }
        if (this.k != null) {
            b += nyu.f(5, this.k.longValue());
        }
        if (this.h != null) {
            b += nyu.f(6, this.h.intValue());
        }
        if (this.i != null) {
            this.i.booleanValue();
            b += nyu.h(7) + 1;
        }
        if (this.c != null) {
            b += nyu.f(8, this.c.longValue());
        }
        if (this.d != null) {
            b += nyu.b(9, this.d);
        }
        if (this.j != null && this.j.length > 0) {
            i = b;
            for (nzf nzf : this.j) {
                if (nzf != null) {
                    i += nyu.d(10, nzf);
                }
            }
            b = i;
        }
        if (this.l != null) {
            b += nyu.d(11, this.l);
        }
        if (this.m != null) {
            this.m.booleanValue();
            b += nyu.h(12) + 1;
        }
        if (this.g != null && this.g.length > 0) {
            i = b;
            for (nzf nzf2 : this.g) {
                if (nzf2 != null) {
                    i += nyu.d(13, nzf2);
                }
            }
            b = i;
        }
        if (this.n != null && this.n.length > 0) {
            while (i2 < this.n.length) {
                nzf nzf3 = this.n[i2];
                if (nzf3 != null) {
                    b += nyu.d(14, nzf3);
                }
                i2++;
            }
        }
        return b;
    }

    private klk b(nyt nyt) {
        while (true) {
            int a = nyt.a();
            int b;
            Object obj;
            switch (a) {
                case wi.w /*0*/:
                    break;
                case wi.m /*8*/:
                    this.a = Boolean.valueOf(nyt.i());
                    continue;
                case wi.dI /*16*/:
                    a = nyt.f();
                    switch (a) {
                        case wi.w /*0*/:
                        case wi.j /*1*/:
                        case wi.l /*2*/:
                        case wi.z /*3*/:
                        case wi.h /*4*/:
                        case wi.p /*5*/:
                        case wi.s /*6*/:
                        case wi.q /*7*/:
                        case wi.m /*8*/:
                        case wi.n /*9*/:
                        case wi.dr /*10*/:
                        case wi.dB /*11*/:
                        case wi.dM /*12*/:
                            this.b = Integer.valueOf(a);
                            break;
                        default:
                            continue;
                    }
                case wi.dA /*24*/:
                    this.e = Boolean.valueOf(nyt.i());
                    continue;
                case 32:
                    this.f = Boolean.valueOf(nyt.i());
                    continue;
                case 40:
                    this.k = Long.valueOf(nyt.e());
                    continue;
                case 48:
                    a = nyt.f();
                    switch (a) {
                        case wi.w /*0*/:
                        case wi.j /*1*/:
                        case wi.l /*2*/:
                            this.h = Integer.valueOf(a);
                            break;
                        default:
                            continue;
                    }
                case 56:
                    this.i = Boolean.valueOf(nyt.i());
                    continue;
                case 64:
                    this.c = Long.valueOf(nyt.e());
                    continue;
                case 74:
                    this.d = nyt.j();
                    continue;
                case 82:
                    b = nzl.b(nyt, 82);
                    if (this.j == null) {
                        a = 0;
                    } else {
                        a = this.j.length;
                    }
                    obj = new kjm[(b + a)];
                    if (a != 0) {
                        System.arraycopy(this.j, 0, obj, 0, a);
                    }
                    while (a < obj.length - 1) {
                        obj[a] = new kjm();
                        nyt.a(obj[a]);
                        nyt.a();
                        a++;
                    }
                    obj[a] = new kjm();
                    nyt.a(obj[a]);
                    this.j = obj;
                    continue;
                case 90:
                    if (this.l == null) {
                        this.l = new kkd();
                    }
                    nyt.a(this.l);
                    continue;
                case 96:
                    this.m = Boolean.valueOf(nyt.i());
                    continue;
                case 106:
                    b = nzl.b(nyt, 106);
                    if (this.g == null) {
                        a = 0;
                    } else {
                        a = this.g.length;
                    }
                    obj = new kjw[(b + a)];
                    if (a != 0) {
                        System.arraycopy(this.g, 0, obj, 0, a);
                    }
                    while (a < obj.length - 1) {
                        obj[a] = new kjw();
                        nyt.a(obj[a]);
                        nyt.a();
                        a++;
                    }
                    obj[a] = new kjw();
                    nyt.a(obj[a]);
                    this.g = obj;
                    continue;
                case 114:
                    b = nzl.b(nyt, 114);
                    if (this.n == null) {
                        a = 0;
                    } else {
                        a = this.n.length;
                    }
                    obj = new kky[(b + a)];
                    if (a != 0) {
                        System.arraycopy(this.n, 0, obj, 0, a);
                    }
                    while (a < obj.length - 1) {
                        obj[a] = new kky();
                        nyt.a(obj[a]);
                        nyt.a();
                        a++;
                    }
                    obj[a] = new kky();
                    nyt.a(obj[a]);
                    this.n = obj;
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
