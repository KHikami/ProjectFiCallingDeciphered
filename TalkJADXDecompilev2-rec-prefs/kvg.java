package p000;

public final class kvg extends nyx<kvg> {
    public String f23578a;
    public int f23579b;
    public String f23580c;
    public kve f23581d;
    public String f23582e;
    public String f23583f;
    public Double f23584g;
    public kvh f23585h;
    public String f23586i;
    public String f23587j;
    public String f23588k;
    public kvd[] f23589l;
    public Boolean f23590m;
    public Boolean f23591n;
    public String f23592o;
    public String f23593p;
    public String f23594q;
    public Integer f23595r;
    public Integer f23596s;
    public kvf[] f23597t;
    public Boolean f23598u;
    public String f23599v;
    public Boolean f23600w;

    public /* synthetic */ nzf mo150a(nyt nyt) {
        return m27678b(nyt);
    }

    public kvg() {
        this.f23578a = null;
        this.f23579b = nzf.UNSET_ENUM_VALUE;
        this.f23580c = null;
        this.f23582e = null;
        this.f23583f = null;
        this.f23584g = null;
        this.f23586i = null;
        this.f23587j = null;
        this.f23588k = null;
        this.f23589l = kvd.m27665d();
        this.f23590m = null;
        this.f23591n = null;
        this.f23592o = null;
        this.f23593p = null;
        this.f23594q = null;
        this.f23595r = null;
        this.f23596s = null;
        this.f23597t = kvf.m27674d();
        this.f23598u = null;
        this.f23599v = null;
        this.f23600w = null;
        this.cachedSize = -1;
    }

    public void mo146a(nyu nyu) {
        int i = 0;
        if (this.f23578a != null) {
            nyu.a(1, this.f23578a);
        }
        if (this.f23579b != nzf.UNSET_ENUM_VALUE) {
            nyu.a(2, this.f23579b);
        }
        if (this.f23580c != null) {
            nyu.a(3, this.f23580c);
        }
        if (this.f23581d != null) {
            nyu.b(4, this.f23581d);
        }
        if (this.f23582e != null) {
            nyu.a(5, this.f23582e);
        }
        if (this.f23583f != null) {
            nyu.a(6, this.f23583f);
        }
        if (this.f23584g != null) {
            nyu.a(7, this.f23584g.doubleValue());
        }
        if (this.f23585h != null) {
            nyu.b(8, this.f23585h);
        }
        if (this.f23586i != null) {
            nyu.a(10, this.f23586i);
        }
        if (this.f23587j != null) {
            nyu.a(11, this.f23587j);
        }
        if (this.f23588k != null) {
            nyu.a(12, this.f23588k);
        }
        if (this.f23589l != null && this.f23589l.length > 0) {
            for (nzf nzf : this.f23589l) {
                if (nzf != null) {
                    nyu.b(13, nzf);
                }
            }
        }
        if (this.f23590m != null) {
            nyu.a(14, this.f23590m.booleanValue());
        }
        if (this.f23592o != null) {
            nyu.a(15, this.f23592o);
        }
        if (this.f23593p != null) {
            nyu.a(16, this.f23593p);
        }
        if (this.f23595r != null) {
            nyu.a(17, this.f23595r.intValue());
        }
        if (this.f23597t != null && this.f23597t.length > 0) {
            while (i < this.f23597t.length) {
                nzf nzf2 = this.f23597t[i];
                if (nzf2 != null) {
                    nyu.b(18, nzf2);
                }
                i++;
            }
        }
        if (this.f23598u != null) {
            nyu.a(19, this.f23598u.booleanValue());
        }
        if (this.f23596s != null) {
            nyu.a(20, this.f23596s.intValue());
        }
        if (this.f23591n != null) {
            nyu.a(21, this.f23591n.booleanValue());
        }
        if (this.f23594q != null) {
            nyu.a(22, this.f23594q);
        }
        if (this.f23599v != null) {
            nyu.a(23, this.f23599v);
        }
        if (this.f23600w != null) {
            nyu.a(24, this.f23600w.booleanValue());
        }
        super.mo146a(nyu);
    }

    protected int mo147b() {
        int i = 0;
        int b = super.mo147b();
        if (this.f23578a != null) {
            b += nyu.b(1, this.f23578a);
        }
        if (this.f23579b != nzf.UNSET_ENUM_VALUE) {
            b += nyu.f(2, this.f23579b);
        }
        if (this.f23580c != null) {
            b += nyu.b(3, this.f23580c);
        }
        if (this.f23581d != null) {
            b += nyu.d(4, this.f23581d);
        }
        if (this.f23582e != null) {
            b += nyu.b(5, this.f23582e);
        }
        if (this.f23583f != null) {
            b += nyu.b(6, this.f23583f);
        }
        if (this.f23584g != null) {
            this.f23584g.doubleValue();
            b += nyu.h(7) + 8;
        }
        if (this.f23585h != null) {
            b += nyu.d(8, this.f23585h);
        }
        if (this.f23586i != null) {
            b += nyu.b(10, this.f23586i);
        }
        if (this.f23587j != null) {
            b += nyu.b(11, this.f23587j);
        }
        if (this.f23588k != null) {
            b += nyu.b(12, this.f23588k);
        }
        if (this.f23589l != null && this.f23589l.length > 0) {
            int i2 = b;
            for (nzf nzf : this.f23589l) {
                if (nzf != null) {
                    i2 += nyu.d(13, nzf);
                }
            }
            b = i2;
        }
        if (this.f23590m != null) {
            this.f23590m.booleanValue();
            b += nyu.h(14) + 1;
        }
        if (this.f23592o != null) {
            b += nyu.b(15, this.f23592o);
        }
        if (this.f23593p != null) {
            b += nyu.b(16, this.f23593p);
        }
        if (this.f23595r != null) {
            b += nyu.f(17, this.f23595r.intValue());
        }
        if (this.f23597t != null && this.f23597t.length > 0) {
            while (i < this.f23597t.length) {
                nzf nzf2 = this.f23597t[i];
                if (nzf2 != null) {
                    b += nyu.d(18, nzf2);
                }
                i++;
            }
        }
        if (this.f23598u != null) {
            this.f23598u.booleanValue();
            b += nyu.h(19) + 1;
        }
        if (this.f23596s != null) {
            b += nyu.f(20, this.f23596s.intValue());
        }
        if (this.f23591n != null) {
            this.f23591n.booleanValue();
            b += nyu.h(21) + 1;
        }
        if (this.f23594q != null) {
            b += nyu.b(22, this.f23594q);
        }
        if (this.f23599v != null) {
            b += nyu.b(23, this.f23599v);
        }
        if (this.f23600w == null) {
            return b;
        }
        this.f23600w.booleanValue();
        return b + (nyu.h(24) + 1);
    }

    private kvg m27678b(nyt nyt) {
        while (true) {
            int a = nyt.a();
            int b;
            Object obj;
            switch (a) {
                case 0:
                    break;
                case 10:
                    this.f23578a = nyt.j();
                    continue;
                case 16:
                    a = nyt.f();
                    switch (a) {
                        case 1:
                        case 2:
                        case 3:
                        case 4:
                        case 5:
                        case 6:
                        case 7:
                        case 8:
                        case 9:
                            this.f23579b = a;
                            break;
                        default:
                            continue;
                    }
                case wi.dx /*26*/:
                    this.f23580c = nyt.j();
                    continue;
                case 34:
                    if (this.f23581d == null) {
                        this.f23581d = new kve();
                    }
                    nyt.a(this.f23581d);
                    continue;
                case 42:
                    this.f23582e = nyt.j();
                    continue;
                case 50:
                    this.f23583f = nyt.j();
                    continue;
                case 57:
                    this.f23584g = Double.valueOf(nyt.b());
                    continue;
                case 66:
                    if (this.f23585h == null) {
                        this.f23585h = new kvh();
                    }
                    nyt.a(this.f23585h);
                    continue;
                case 82:
                    this.f23586i = nyt.j();
                    continue;
                case 90:
                    this.f23587j = nyt.j();
                    continue;
                case 98:
                    this.f23588k = nyt.j();
                    continue;
                case 106:
                    b = nzl.b(nyt, 106);
                    if (this.f23589l == null) {
                        a = 0;
                    } else {
                        a = this.f23589l.length;
                    }
                    obj = new kvd[(b + a)];
                    if (a != 0) {
                        System.arraycopy(this.f23589l, 0, obj, 0, a);
                    }
                    while (a < obj.length - 1) {
                        obj[a] = new kvd();
                        nyt.a(obj[a]);
                        nyt.a();
                        a++;
                    }
                    obj[a] = new kvd();
                    nyt.a(obj[a]);
                    this.f23589l = obj;
                    continue;
                case 112:
                    this.f23590m = Boolean.valueOf(nyt.i());
                    continue;
                case 122:
                    this.f23592o = nyt.j();
                    continue;
                case 130:
                    this.f23593p = nyt.j();
                    continue;
                case 136:
                    this.f23595r = Integer.valueOf(nyt.f());
                    continue;
                case 146:
                    b = nzl.b(nyt, 146);
                    if (this.f23597t == null) {
                        a = 0;
                    } else {
                        a = this.f23597t.length;
                    }
                    obj = new kvf[(b + a)];
                    if (a != 0) {
                        System.arraycopy(this.f23597t, 0, obj, 0, a);
                    }
                    while (a < obj.length - 1) {
                        obj[a] = new kvf();
                        nyt.a(obj[a]);
                        nyt.a();
                        a++;
                    }
                    obj[a] = new kvf();
                    nyt.a(obj[a]);
                    this.f23597t = obj;
                    continue;
                case 152:
                    this.f23598u = Boolean.valueOf(nyt.i());
                    continue;
                case 160:
                    this.f23596s = Integer.valueOf(nyt.f());
                    continue;
                case 168:
                    this.f23591n = Boolean.valueOf(nyt.i());
                    continue;
                case 178:
                    this.f23594q = nyt.j();
                    continue;
                case 186:
                    this.f23599v = nyt.j();
                    continue;
                case 192:
                    this.f23600w = Boolean.valueOf(nyt.i());
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
