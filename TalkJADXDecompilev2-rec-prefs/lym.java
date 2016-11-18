package p000;

public final class lym extends nyx<lym> {
    private static volatile lym[] f26905y;
    public String f26906a;
    public String f26907b;
    public String f26908c;
    public String f26909d;
    public String f26910e;
    public Boolean f26911f;
    public Boolean f26912g;
    public lyn[] f26913h;
    public String[] f26914i;
    public Boolean f26915j;
    public String f26916k;
    public String f26917l;
    public Integer f26918m;
    public Integer f26919n;
    public Integer f26920o;
    public Integer f26921p;
    public Boolean f26922q;
    public int[] f26923r;
    public Boolean f26924s;
    public muo f26925t;
    public Long f26926u;
    public Integer f26927v;
    public String f26928w;
    public String[] f26929x;

    public /* synthetic */ nzf mo150a(nyt nyt) {
        return m31157b(nyt);
    }

    public static lym[] m31158d() {
        if (f26905y == null) {
            synchronized (nzc.c) {
                if (f26905y == null) {
                    f26905y = new lym[0];
                }
            }
        }
        return f26905y;
    }

    public lym() {
        m31159g();
    }

    private lym m31159g() {
        this.f26906a = null;
        this.f26907b = null;
        this.f26908c = null;
        this.f26909d = null;
        this.f26910e = null;
        this.f26911f = null;
        this.f26912g = null;
        this.f26913h = lyn.m31164d();
        this.f26914i = nzl.f;
        this.f26915j = null;
        this.f26916k = null;
        this.f26917l = null;
        this.f26922q = null;
        this.f26923r = nzl.a;
        this.f26924s = null;
        this.f26925t = null;
        this.f26926u = null;
        this.f26928w = null;
        this.f26929x = nzl.f;
        this.unknownFieldData = null;
        this.cachedSize = -1;
        return this;
    }

    public void mo146a(nyu nyu) {
        int i = 0;
        if (this.f26906a != null) {
            nyu.a(1, this.f26906a);
        }
        if (this.f26907b != null) {
            nyu.a(2, this.f26907b);
        }
        if (this.f26908c != null) {
            nyu.a(3, this.f26908c);
        }
        if (this.f26909d != null) {
            nyu.a(4, this.f26909d);
        }
        if (this.f26910e != null) {
            nyu.a(5, this.f26910e);
        }
        if (this.f26911f != null) {
            nyu.a(6, this.f26911f.booleanValue());
        }
        if (this.f26912g != null) {
            nyu.a(7, this.f26912g.booleanValue());
        }
        if (this.f26914i != null && this.f26914i.length > 0) {
            for (String str : this.f26914i) {
                if (str != null) {
                    nyu.a(8, str);
                }
            }
        }
        if (this.f26915j != null) {
            nyu.a(9, this.f26915j.booleanValue());
        }
        if (this.f26916k != null) {
            nyu.a(10, this.f26916k);
        }
        if (this.f26917l != null) {
            nyu.a(11, this.f26917l);
        }
        if (this.f26918m != null) {
            nyu.a(12, this.f26918m.intValue());
        }
        if (this.f26919n != null) {
            nyu.a(13, this.f26919n.intValue());
        }
        if (this.f26920o != null) {
            nyu.a(14, this.f26920o.intValue());
        }
        if (this.f26921p != null) {
            nyu.a(17, this.f26921p.intValue());
        }
        if (this.f26922q != null) {
            nyu.a(18, this.f26922q.booleanValue());
        }
        if (this.f26923r != null && this.f26923r.length > 0) {
            for (int a : this.f26923r) {
                nyu.a(19, a);
            }
        }
        if (this.f26913h != null && this.f26913h.length > 0) {
            for (nzf nzf : this.f26913h) {
                if (nzf != null) {
                    nyu.b(20, nzf);
                }
            }
        }
        if (this.f26924s != null) {
            nyu.a(21, this.f26924s.booleanValue());
        }
        if (this.f26925t != null) {
            nyu.b(22, this.f26925t);
        }
        if (this.f26926u != null) {
            nyu.b(23, this.f26926u.longValue());
        }
        if (this.f26927v != null) {
            nyu.a(24, this.f26927v.intValue());
        }
        if (this.f26928w != null) {
            nyu.a(25, this.f26928w);
        }
        if (this.f26929x != null && this.f26929x.length > 0) {
            while (i < this.f26929x.length) {
                String str2 = this.f26929x[i];
                if (str2 != null) {
                    nyu.a(26, str2);
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
        if (this.f26906a != null) {
            b += nyu.b(1, this.f26906a);
        }
        if (this.f26907b != null) {
            b += nyu.b(2, this.f26907b);
        }
        if (this.f26908c != null) {
            b += nyu.b(3, this.f26908c);
        }
        if (this.f26909d != null) {
            b += nyu.b(4, this.f26909d);
        }
        if (this.f26910e != null) {
            b += nyu.b(5, this.f26910e);
        }
        if (this.f26911f != null) {
            this.f26911f.booleanValue();
            b += nyu.h(6) + 1;
        }
        if (this.f26912g != null) {
            this.f26912g.booleanValue();
            b += nyu.h(7) + 1;
        }
        if (this.f26914i != null && this.f26914i.length > 0) {
            i = 0;
            i2 = 0;
            for (String str : this.f26914i) {
                if (str != null) {
                    i2++;
                    i += nyu.b(str);
                }
            }
            b = (b + i) + (i2 * 1);
        }
        if (this.f26915j != null) {
            this.f26915j.booleanValue();
            b += nyu.h(9) + 1;
        }
        if (this.f26916k != null) {
            b += nyu.b(10, this.f26916k);
        }
        if (this.f26917l != null) {
            b += nyu.b(11, this.f26917l);
        }
        if (this.f26918m != null) {
            b += nyu.f(12, this.f26918m.intValue());
        }
        if (this.f26919n != null) {
            b += nyu.f(13, this.f26919n.intValue());
        }
        if (this.f26920o != null) {
            b += nyu.f(14, this.f26920o.intValue());
        }
        if (this.f26921p != null) {
            b += nyu.f(17, this.f26921p.intValue());
        }
        if (this.f26922q != null) {
            this.f26922q.booleanValue();
            b += nyu.h(18) + 1;
        }
        if (this.f26923r != null && this.f26923r.length > 0) {
            i = 0;
            for (int i22 : this.f26923r) {
                i += nyu.g(i22);
            }
            b = (b + i) + (this.f26923r.length * 2);
        }
        if (this.f26913h != null && this.f26913h.length > 0) {
            i3 = b;
            for (nzf nzf : this.f26913h) {
                if (nzf != null) {
                    i3 += nyu.d(20, nzf);
                }
            }
            b = i3;
        }
        if (this.f26924s != null) {
            this.f26924s.booleanValue();
            b += nyu.h(21) + 1;
        }
        if (this.f26925t != null) {
            b += nyu.d(22, this.f26925t);
        }
        if (this.f26926u != null) {
            b += nyu.f(23, this.f26926u.longValue());
        }
        if (this.f26927v != null) {
            b += nyu.f(24, this.f26927v.intValue());
        }
        if (this.f26928w != null) {
            b += nyu.b(25, this.f26928w);
        }
        if (this.f26929x == null || this.f26929x.length <= 0) {
            return b;
        }
        i3 = 0;
        i = 0;
        while (i4 < this.f26929x.length) {
            String str2 = this.f26929x[i4];
            if (str2 != null) {
                i++;
                i3 += nyu.b(str2);
            }
            i4++;
        }
        return (b + i3) + (i * 2);
    }

    private lym m31157b(nyt nyt) {
        while (true) {
            int a = nyt.a();
            int b;
            Object obj;
            int i;
            switch (a) {
                case 0:
                    break;
                case 10:
                    this.f26906a = nyt.j();
                    continue;
                case wi.dH /*18*/:
                    this.f26907b = nyt.j();
                    continue;
                case wi.dx /*26*/:
                    this.f26908c = nyt.j();
                    continue;
                case 34:
                    this.f26909d = nyt.j();
                    continue;
                case 42:
                    this.f26910e = nyt.j();
                    continue;
                case 48:
                    this.f26911f = Boolean.valueOf(nyt.i());
                    continue;
                case 56:
                    this.f26912g = Boolean.valueOf(nyt.i());
                    continue;
                case 66:
                    b = nzl.b(nyt, 66);
                    a = this.f26914i == null ? 0 : this.f26914i.length;
                    obj = new String[(b + a)];
                    if (a != 0) {
                        System.arraycopy(this.f26914i, 0, obj, 0, a);
                    }
                    while (a < obj.length - 1) {
                        obj[a] = nyt.j();
                        nyt.a();
                        a++;
                    }
                    obj[a] = nyt.j();
                    this.f26914i = obj;
                    continue;
                case 72:
                    this.f26915j = Boolean.valueOf(nyt.i());
                    continue;
                case 82:
                    this.f26916k = nyt.j();
                    continue;
                case 90:
                    this.f26917l = nyt.j();
                    continue;
                case 96:
                    a = nyt.f();
                    switch (a) {
                        case 0:
                        case 1:
                        case 2:
                        case 3:
                        case 4:
                            this.f26918m = Integer.valueOf(a);
                            break;
                        default:
                            continue;
                    }
                case 104:
                    a = nyt.f();
                    switch (a) {
                        case 1:
                        case 2:
                        case 3:
                        case 4:
                        case 5:
                        case 6:
                            this.f26919n = Integer.valueOf(a);
                            break;
                        default:
                            continue;
                    }
                case 112:
                    a = nyt.f();
                    switch (a) {
                        case 1:
                        case 2:
                        case 3:
                            this.f26920o = Integer.valueOf(a);
                            break;
                        default:
                            continue;
                    }
                case 136:
                    a = nyt.f();
                    switch (a) {
                        case 0:
                        case 1:
                        case 2:
                        case 10:
                        case 11:
                        case 12:
                        case 20:
                        case 21:
                        case 22:
                            this.f26921p = Integer.valueOf(a);
                            break;
                        default:
                            continue;
                    }
                case 144:
                    this.f26922q = Boolean.valueOf(nyt.i());
                    continue;
                case 152:
                    int b2 = nzl.b(nyt, 152);
                    Object obj2 = new int[b2];
                    i = 0;
                    b = 0;
                    while (i < b2) {
                        if (i != 0) {
                            nyt.a();
                        }
                        int f = nyt.f();
                        switch (f) {
                            case 0:
                            case 1:
                            case 2:
                            case 3:
                            case 4:
                                a = b + 1;
                                obj2[b] = f;
                                break;
                            default:
                                a = b;
                                break;
                        }
                        i++;
                        b = a;
                    }
                    if (b != 0) {
                        a = this.f26923r == null ? 0 : this.f26923r.length;
                        if (a != 0 || b != obj2.length) {
                            Object obj3 = new int[(a + b)];
                            if (a != 0) {
                                System.arraycopy(this.f26923r, 0, obj3, 0, a);
                            }
                            System.arraycopy(obj2, 0, obj3, a, b);
                            this.f26923r = obj3;
                            break;
                        }
                        this.f26923r = obj2;
                        break;
                    }
                    continue;
                case 154:
                    i = nyt.d(nyt.r());
                    b = nyt.u();
                    a = 0;
                    while (nyt.s() > 0) {
                        switch (nyt.f()) {
                            case 0:
                            case 1:
                            case 2:
                            case 3:
                            case 4:
                                a++;
                                break;
                            default:
                                break;
                        }
                    }
                    if (a != 0) {
                        nyt.f(b);
                        if (this.f26923r == null) {
                            b = 0;
                        } else {
                            b = this.f26923r.length;
                        }
                        Object obj4 = new int[(a + b)];
                        if (b != 0) {
                            System.arraycopy(this.f26923r, 0, obj4, 0, b);
                        }
                        while (nyt.s() > 0) {
                            int f2 = nyt.f();
                            switch (f2) {
                                case 0:
                                case 1:
                                case 2:
                                case 3:
                                case 4:
                                    a = b + 1;
                                    obj4[b] = f2;
                                    b = a;
                                    break;
                                default:
                                    break;
                            }
                        }
                        this.f26923r = obj4;
                    }
                    nyt.e(i);
                    continue;
                case 162:
                    b = nzl.b(nyt, 162);
                    if (this.f26913h == null) {
                        a = 0;
                    } else {
                        a = this.f26913h.length;
                    }
                    obj = new lyn[(b + a)];
                    if (a != 0) {
                        System.arraycopy(this.f26913h, 0, obj, 0, a);
                    }
                    while (a < obj.length - 1) {
                        obj[a] = new lyn();
                        nyt.a(obj[a]);
                        nyt.a();
                        a++;
                    }
                    obj[a] = new lyn();
                    nyt.a(obj[a]);
                    this.f26913h = obj;
                    continue;
                case 168:
                    this.f26924s = Boolean.valueOf(nyt.i());
                    continue;
                case 178:
                    if (this.f26925t == null) {
                        this.f26925t = new muo();
                    }
                    nyt.a(this.f26925t);
                    continue;
                case 184:
                    this.f26926u = Long.valueOf(nyt.e());
                    continue;
                case 192:
                    a = nyt.f();
                    switch (a) {
                        case 0:
                        case 1:
                        case 2:
                            this.f26927v = Integer.valueOf(a);
                            break;
                        default:
                            continue;
                    }
                case 202:
                    this.f26928w = nyt.j();
                    continue;
                case 210:
                    b = nzl.b(nyt, 210);
                    a = this.f26929x == null ? 0 : this.f26929x.length;
                    obj = new String[(b + a)];
                    if (a != 0) {
                        System.arraycopy(this.f26929x, 0, obj, 0, a);
                    }
                    while (a < obj.length - 1) {
                        obj[a] = nyt.j();
                        nyt.a();
                        a++;
                    }
                    obj[a] = nyt.j();
                    this.f26929x = obj;
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
