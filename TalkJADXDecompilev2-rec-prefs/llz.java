package p000;

public final class llz extends nyx<llz> {
    public static final nyy<ozo, llz> f25436a = nyy.a(11, llz.class, 271416946);
    private static final llz[] f25437p = new llz[0];
    public String f25438b;
    public lmd[] f25439c;
    public String[] f25440d;
    public String f25441e;
    public Integer f25442f;
    public Integer f25443g;
    public Long f25444h;
    public Long f25445i;
    public String f25446j;
    public String f25447k;
    public Integer f25448l;
    public Boolean f25449m;
    public String f25450n;
    public Boolean f25451o;

    public /* synthetic */ nzf mo150a(nyt nyt) {
        return m29433b(nyt);
    }

    public llz() {
        m29434d();
    }

    private llz m29434d() {
        this.f25438b = null;
        this.f25439c = lmd.m29456d();
        this.f25440d = nzl.f;
        this.f25441e = null;
        this.f25442f = null;
        this.f25443g = null;
        this.f25444h = null;
        this.f25445i = null;
        this.f25446j = null;
        this.f25447k = null;
        this.f25449m = null;
        this.f25450n = null;
        this.f25451o = null;
        this.unknownFieldData = null;
        this.cachedSize = -1;
        return this;
    }

    public void mo146a(nyu nyu) {
        int i = 0;
        nyu.a(1, this.f25438b);
        if (this.f25440d != null && this.f25440d.length > 0) {
            for (String str : this.f25440d) {
                if (str != null) {
                    nyu.a(4, str);
                }
            }
        }
        if (this.f25441e != null) {
            nyu.a(8, this.f25441e);
        }
        if (this.f25444h != null) {
            nyu.a(9, this.f25444h.longValue());
        }
        if (this.f25439c != null && this.f25439c.length > 0) {
            while (i < this.f25439c.length) {
                nzf nzf = this.f25439c[i];
                if (nzf != null) {
                    nyu.b(10, nzf);
                }
                i++;
            }
        }
        if (this.f25443g != null) {
            nyu.c(11, this.f25443g.intValue());
        }
        if (this.f25442f != null) {
            nyu.c(12, this.f25442f.intValue());
        }
        if (this.f25445i != null) {
            nyu.a(13, this.f25445i.longValue());
        }
        if (this.f25446j != null) {
            nyu.a(15, this.f25446j);
        }
        if (this.f25447k != null) {
            nyu.a(16, this.f25447k);
        }
        if (this.f25448l != null) {
            nyu.a(17, this.f25448l.intValue());
        }
        if (this.f25449m != null) {
            nyu.a(18, this.f25449m.booleanValue());
        }
        if (this.f25450n != null) {
            nyu.a(19, this.f25450n);
        }
        if (this.f25451o != null) {
            nyu.a(20, this.f25451o.booleanValue());
        }
        super.mo146a(nyu);
    }

    protected int mo147b() {
        int i;
        int i2 = 0;
        int b = super.mo147b() + nyu.b(1, this.f25438b);
        if (this.f25440d == null || this.f25440d.length <= 0) {
            i = b;
        } else {
            int i3 = 0;
            int i4 = 0;
            for (String str : this.f25440d) {
                if (str != null) {
                    i4++;
                    i3 += nyu.b(str);
                }
            }
            i = (b + i3) + (i4 * 1);
        }
        if (this.f25441e != null) {
            i += nyu.b(8, this.f25441e);
        }
        if (this.f25444h != null) {
            i += nyu.e(9, this.f25444h.longValue());
        }
        if (this.f25439c != null && this.f25439c.length > 0) {
            while (i2 < this.f25439c.length) {
                nzf nzf = this.f25439c[i2];
                if (nzf != null) {
                    i += nyu.d(10, nzf);
                }
                i2++;
            }
        }
        if (this.f25443g != null) {
            i += nyu.g(11, this.f25443g.intValue());
        }
        if (this.f25442f != null) {
            i += nyu.g(12, this.f25442f.intValue());
        }
        if (this.f25445i != null) {
            i += nyu.e(13, this.f25445i.longValue());
        }
        if (this.f25446j != null) {
            i += nyu.b(15, this.f25446j);
        }
        if (this.f25447k != null) {
            i += nyu.b(16, this.f25447k);
        }
        if (this.f25448l != null) {
            i += nyu.f(17, this.f25448l.intValue());
        }
        if (this.f25449m != null) {
            this.f25449m.booleanValue();
            i += nyu.h(18) + 1;
        }
        if (this.f25450n != null) {
            i += nyu.b(19, this.f25450n);
        }
        if (this.f25451o == null) {
            return i;
        }
        this.f25451o.booleanValue();
        return i + (nyu.h(20) + 1);
    }

    private llz m29433b(nyt nyt) {
        while (true) {
            int a = nyt.a();
            int b;
            Object obj;
            switch (a) {
                case 0:
                    break;
                case 10:
                    this.f25438b = nyt.j();
                    continue;
                case 34:
                    b = nzl.b(nyt, 34);
                    a = this.f25440d == null ? 0 : this.f25440d.length;
                    obj = new String[(b + a)];
                    if (a != 0) {
                        System.arraycopy(this.f25440d, 0, obj, 0, a);
                    }
                    while (a < obj.length - 1) {
                        obj[a] = nyt.j();
                        nyt.a();
                        a++;
                    }
                    obj[a] = nyt.j();
                    this.f25440d = obj;
                    continue;
                case 66:
                    this.f25441e = nyt.j();
                    continue;
                case 72:
                    this.f25444h = Long.valueOf(nyt.d());
                    continue;
                case 82:
                    b = nzl.b(nyt, 82);
                    if (this.f25439c == null) {
                        a = 0;
                    } else {
                        a = this.f25439c.length;
                    }
                    obj = new lmd[(b + a)];
                    if (a != 0) {
                        System.arraycopy(this.f25439c, 0, obj, 0, a);
                    }
                    while (a < obj.length - 1) {
                        obj[a] = new lmd();
                        nyt.a(obj[a]);
                        nyt.a();
                        a++;
                    }
                    obj[a] = new lmd();
                    nyt.a(obj[a]);
                    this.f25439c = obj;
                    continue;
                case 88:
                    this.f25443g = Integer.valueOf(nyt.l());
                    continue;
                case 96:
                    this.f25442f = Integer.valueOf(nyt.l());
                    continue;
                case 104:
                    this.f25445i = Long.valueOf(nyt.d());
                    continue;
                case 122:
                    this.f25446j = nyt.j();
                    continue;
                case 130:
                    this.f25447k = nyt.j();
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
                            this.f25448l = Integer.valueOf(a);
                            break;
                        default:
                            continue;
                    }
                case 144:
                    this.f25449m = Boolean.valueOf(nyt.i());
                    continue;
                case 154:
                    this.f25450n = nyt.j();
                    continue;
                case 160:
                    this.f25451o = Boolean.valueOf(nyt.i());
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
