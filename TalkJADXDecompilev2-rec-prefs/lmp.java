package p000;

public final class lmp extends nyx<lmp> {
    public static final nyy<Object, lmp> f25594a = nyy.a(11, lmp.class, 271416946);
    private static final lmp[] f25595p = new lmp[0];
    public String f25596b;
    public lmt[] f25597c;
    public String[] f25598d;
    public String f25599e;
    public Integer f25600f;
    public Integer f25601g;
    public Long f25602h;
    public Long f25603i;
    public String f25604j;
    public String f25605k;
    public int f25606l;
    public Boolean f25607m;
    public String f25608n;
    public Boolean f25609o;

    public /* synthetic */ nzf mo150a(nyt nyt) {
        return m29518b(nyt);
    }

    public lmp() {
        this.f25596b = null;
        this.f25597c = lmt.m29535d();
        this.f25598d = nzl.f;
        this.f25599e = null;
        this.f25600f = null;
        this.f25601g = null;
        this.f25602h = null;
        this.f25603i = null;
        this.f25604j = null;
        this.f25605k = null;
        this.f25606l = nzf.UNSET_ENUM_VALUE;
        this.f25607m = null;
        this.f25608n = null;
        this.f25609o = null;
        this.cachedSize = -1;
    }

    public void mo146a(nyu nyu) {
        int i = 0;
        nyu.a(1, this.f25596b);
        if (this.f25598d != null && this.f25598d.length > 0) {
            for (String str : this.f25598d) {
                if (str != null) {
                    nyu.a(4, str);
                }
            }
        }
        if (this.f25599e != null) {
            nyu.a(8, this.f25599e);
        }
        if (this.f25602h != null) {
            nyu.a(9, this.f25602h.longValue());
        }
        if (this.f25597c != null && this.f25597c.length > 0) {
            while (i < this.f25597c.length) {
                nzf nzf = this.f25597c[i];
                if (nzf != null) {
                    nyu.b(10, nzf);
                }
                i++;
            }
        }
        if (this.f25601g != null) {
            nyu.c(11, this.f25601g.intValue());
        }
        if (this.f25600f != null) {
            nyu.c(12, this.f25600f.intValue());
        }
        if (this.f25603i != null) {
            nyu.a(13, this.f25603i.longValue());
        }
        if (this.f25604j != null) {
            nyu.a(15, this.f25604j);
        }
        if (this.f25605k != null) {
            nyu.a(16, this.f25605k);
        }
        if (this.f25606l != nzf.UNSET_ENUM_VALUE) {
            nyu.a(17, this.f25606l);
        }
        if (this.f25607m != null) {
            nyu.a(18, this.f25607m.booleanValue());
        }
        if (this.f25608n != null) {
            nyu.a(19, this.f25608n);
        }
        if (this.f25609o != null) {
            nyu.a(20, this.f25609o.booleanValue());
        }
        super.mo146a(nyu);
    }

    protected int mo147b() {
        int i;
        int i2 = 0;
        int b = super.mo147b() + nyu.b(1, this.f25596b);
        if (this.f25598d == null || this.f25598d.length <= 0) {
            i = b;
        } else {
            int i3 = 0;
            int i4 = 0;
            for (String str : this.f25598d) {
                if (str != null) {
                    i4++;
                    i3 += nyu.b(str);
                }
            }
            i = (b + i3) + (i4 * 1);
        }
        if (this.f25599e != null) {
            i += nyu.b(8, this.f25599e);
        }
        if (this.f25602h != null) {
            i += nyu.e(9, this.f25602h.longValue());
        }
        if (this.f25597c != null && this.f25597c.length > 0) {
            while (i2 < this.f25597c.length) {
                nzf nzf = this.f25597c[i2];
                if (nzf != null) {
                    i += nyu.d(10, nzf);
                }
                i2++;
            }
        }
        if (this.f25601g != null) {
            i += nyu.g(11, this.f25601g.intValue());
        }
        if (this.f25600f != null) {
            i += nyu.g(12, this.f25600f.intValue());
        }
        if (this.f25603i != null) {
            i += nyu.e(13, this.f25603i.longValue());
        }
        if (this.f25604j != null) {
            i += nyu.b(15, this.f25604j);
        }
        if (this.f25605k != null) {
            i += nyu.b(16, this.f25605k);
        }
        if (this.f25606l != nzf.UNSET_ENUM_VALUE) {
            i += nyu.f(17, this.f25606l);
        }
        if (this.f25607m != null) {
            this.f25607m.booleanValue();
            i += nyu.h(18) + 1;
        }
        if (this.f25608n != null) {
            i += nyu.b(19, this.f25608n);
        }
        if (this.f25609o == null) {
            return i;
        }
        this.f25609o.booleanValue();
        return i + (nyu.h(20) + 1);
    }

    private lmp m29518b(nyt nyt) {
        while (true) {
            int a = nyt.a();
            int b;
            Object obj;
            switch (a) {
                case 0:
                    break;
                case 10:
                    this.f25596b = nyt.j();
                    continue;
                case 34:
                    b = nzl.b(nyt, 34);
                    a = this.f25598d == null ? 0 : this.f25598d.length;
                    obj = new String[(b + a)];
                    if (a != 0) {
                        System.arraycopy(this.f25598d, 0, obj, 0, a);
                    }
                    while (a < obj.length - 1) {
                        obj[a] = nyt.j();
                        nyt.a();
                        a++;
                    }
                    obj[a] = nyt.j();
                    this.f25598d = obj;
                    continue;
                case 66:
                    this.f25599e = nyt.j();
                    continue;
                case 72:
                    this.f25602h = Long.valueOf(nyt.d());
                    continue;
                case 82:
                    b = nzl.b(nyt, 82);
                    if (this.f25597c == null) {
                        a = 0;
                    } else {
                        a = this.f25597c.length;
                    }
                    obj = new lmt[(b + a)];
                    if (a != 0) {
                        System.arraycopy(this.f25597c, 0, obj, 0, a);
                    }
                    while (a < obj.length - 1) {
                        obj[a] = new lmt();
                        nyt.a(obj[a]);
                        nyt.a();
                        a++;
                    }
                    obj[a] = new lmt();
                    nyt.a(obj[a]);
                    this.f25597c = obj;
                    continue;
                case 88:
                    this.f25601g = Integer.valueOf(nyt.l());
                    continue;
                case 96:
                    this.f25600f = Integer.valueOf(nyt.l());
                    continue;
                case 104:
                    this.f25603i = Long.valueOf(nyt.d());
                    continue;
                case 122:
                    this.f25604j = nyt.j();
                    continue;
                case 130:
                    this.f25605k = nyt.j();
                    continue;
                case 136:
                    a = nyt.f();
                    switch (a) {
                        case 0:
                        case 1:
                        case 2:
                        case 3:
                        case 4:
                        case 5:
                            this.f25606l = a;
                            break;
                        default:
                            continue;
                    }
                case 144:
                    this.f25607m = Boolean.valueOf(nyt.i());
                    continue;
                case 154:
                    this.f25608n = nyt.j();
                    continue;
                case 160:
                    this.f25609o = Boolean.valueOf(nyt.i());
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
