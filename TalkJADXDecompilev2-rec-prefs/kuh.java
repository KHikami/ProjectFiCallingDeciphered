package p000;

public final class kuh extends nyx<kuh> {
    private static volatile kuh[] f23421r;
    public String f23422a;
    public kul f23423b;
    public kti f23424c;
    public int f23425d;
    public kuf f23426e;
    public kug f23427f;
    public kul f23428g;
    public kti f23429h;
    public String[] f23430i;
    public kul[] f23431j;
    public kti[] f23432k;
    public Boolean f23433l;
    public Boolean f23434m;
    public Boolean f23435n;
    public int f23436o;
    public kup f23437p;
    public String f23438q;

    public /* synthetic */ nzf mo150a(nyt nyt) {
        return m27560b(nyt);
    }

    public static kuh[] m27561d() {
        if (f23421r == null) {
            synchronized (nzc.c) {
                if (f23421r == null) {
                    f23421r = new kuh[0];
                }
            }
        }
        return f23421r;
    }

    public kuh() {
        this.f23422a = null;
        this.f23425d = nzf.UNSET_ENUM_VALUE;
        this.f23430i = nzl.f;
        this.f23431j = kul.m27579d();
        this.f23432k = kti.m27445d();
        this.f23433l = null;
        this.f23434m = null;
        this.f23435n = null;
        this.f23436o = nzf.UNSET_ENUM_VALUE;
        this.f23438q = null;
        this.cachedSize = -1;
    }

    public void mo146a(nyu nyu) {
        int i = 0;
        nyu.a(1, this.f23422a);
        if (this.f23423b != null) {
            nyu.b(2, this.f23423b);
        }
        if (this.f23425d != nzf.UNSET_ENUM_VALUE) {
            nyu.a(3, this.f23425d);
        }
        if (this.f23426e != null) {
            nyu.b(4, this.f23426e);
        }
        if (this.f23428g != null) {
            nyu.b(5, this.f23428g);
        }
        if (this.f23430i != null && this.f23430i.length > 0) {
            for (String str : this.f23430i) {
                if (str != null) {
                    nyu.a(6, str);
                }
            }
        }
        if (this.f23431j != null && this.f23431j.length > 0) {
            for (nzf nzf : this.f23431j) {
                if (nzf != null) {
                    nyu.b(7, nzf);
                }
            }
        }
        if (this.f23433l != null) {
            nyu.a(8, this.f23433l.booleanValue());
        }
        if (this.f23434m != null) {
            nyu.a(9, this.f23434m.booleanValue());
        }
        if (this.f23436o != nzf.UNSET_ENUM_VALUE) {
            nyu.a(10, this.f23436o);
        }
        if (this.f23437p != null) {
            nyu.b(11, this.f23437p);
        }
        if (this.f23427f != null) {
            nyu.b(12, this.f23427f);
        }
        if (this.f23435n != null) {
            nyu.a(13, this.f23435n.booleanValue());
        }
        if (this.f23438q != null) {
            nyu.a(14, this.f23438q);
        }
        if (this.f23424c != null) {
            nyu.b(15, this.f23424c);
        }
        if (this.f23429h != null) {
            nyu.b(16, this.f23429h);
        }
        if (this.f23432k != null && this.f23432k.length > 0) {
            while (i < this.f23432k.length) {
                nzf nzf2 = this.f23432k[i];
                if (nzf2 != null) {
                    nyu.b(17, nzf2);
                }
                i++;
            }
        }
        super.mo146a(nyu);
    }

    protected int mo147b() {
        int i;
        int i2 = 0;
        int b = super.mo147b() + nyu.b(1, this.f23422a);
        if (this.f23423b != null) {
            b += nyu.d(2, this.f23423b);
        }
        if (this.f23425d != nzf.UNSET_ENUM_VALUE) {
            b += nyu.f(3, this.f23425d);
        }
        if (this.f23426e != null) {
            b += nyu.d(4, this.f23426e);
        }
        if (this.f23428g != null) {
            b += nyu.d(5, this.f23428g);
        }
        if (this.f23430i != null && this.f23430i.length > 0) {
            int i3 = 0;
            int i4 = 0;
            for (String str : this.f23430i) {
                if (str != null) {
                    i4++;
                    i3 += nyu.b(str);
                }
            }
            b = (b + i3) + (i4 * 1);
        }
        if (this.f23431j != null && this.f23431j.length > 0) {
            i = b;
            for (nzf nzf : this.f23431j) {
                if (nzf != null) {
                    i += nyu.d(7, nzf);
                }
            }
            b = i;
        }
        if (this.f23433l != null) {
            this.f23433l.booleanValue();
            b += nyu.h(8) + 1;
        }
        if (this.f23434m != null) {
            this.f23434m.booleanValue();
            b += nyu.h(9) + 1;
        }
        if (this.f23436o != nzf.UNSET_ENUM_VALUE) {
            b += nyu.f(10, this.f23436o);
        }
        if (this.f23437p != null) {
            b += nyu.d(11, this.f23437p);
        }
        if (this.f23427f != null) {
            b += nyu.d(12, this.f23427f);
        }
        if (this.f23435n != null) {
            this.f23435n.booleanValue();
            b += nyu.h(13) + 1;
        }
        if (this.f23438q != null) {
            b += nyu.b(14, this.f23438q);
        }
        if (this.f23424c != null) {
            b += nyu.d(15, this.f23424c);
        }
        if (this.f23429h != null) {
            b += nyu.d(16, this.f23429h);
        }
        if (this.f23432k != null && this.f23432k.length > 0) {
            while (i2 < this.f23432k.length) {
                nzf nzf2 = this.f23432k[i2];
                if (nzf2 != null) {
                    b += nyu.d(17, nzf2);
                }
                i2++;
            }
        }
        return b;
    }

    private kuh m27560b(nyt nyt) {
        while (true) {
            int a = nyt.a();
            int b;
            Object obj;
            switch (a) {
                case 0:
                    break;
                case 10:
                    this.f23422a = nyt.j();
                    continue;
                case wi.dH /*18*/:
                    if (this.f23423b == null) {
                        this.f23423b = new kul();
                    }
                    nyt.a(this.f23423b);
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
                            this.f23425d = a;
                            break;
                        default:
                            continue;
                    }
                case 34:
                    if (this.f23426e == null) {
                        this.f23426e = new kuf();
                    }
                    nyt.a(this.f23426e);
                    continue;
                case 42:
                    if (this.f23428g == null) {
                        this.f23428g = new kul();
                    }
                    nyt.a(this.f23428g);
                    continue;
                case 50:
                    b = nzl.b(nyt, 50);
                    a = this.f23430i == null ? 0 : this.f23430i.length;
                    obj = new String[(b + a)];
                    if (a != 0) {
                        System.arraycopy(this.f23430i, 0, obj, 0, a);
                    }
                    while (a < obj.length - 1) {
                        obj[a] = nyt.j();
                        nyt.a();
                        a++;
                    }
                    obj[a] = nyt.j();
                    this.f23430i = obj;
                    continue;
                case 58:
                    b = nzl.b(nyt, 58);
                    if (this.f23431j == null) {
                        a = 0;
                    } else {
                        a = this.f23431j.length;
                    }
                    obj = new kul[(b + a)];
                    if (a != 0) {
                        System.arraycopy(this.f23431j, 0, obj, 0, a);
                    }
                    while (a < obj.length - 1) {
                        obj[a] = new kul();
                        nyt.a(obj[a]);
                        nyt.a();
                        a++;
                    }
                    obj[a] = new kul();
                    nyt.a(obj[a]);
                    this.f23431j = obj;
                    continue;
                case 64:
                    this.f23433l = Boolean.valueOf(nyt.i());
                    continue;
                case 72:
                    this.f23434m = Boolean.valueOf(nyt.i());
                    continue;
                case 80:
                    a = nyt.f();
                    switch (a) {
                        case 1:
                        case 2:
                            this.f23436o = a;
                            break;
                        default:
                            continue;
                    }
                case 90:
                    if (this.f23437p == null) {
                        this.f23437p = new kup();
                    }
                    nyt.a(this.f23437p);
                    continue;
                case 98:
                    if (this.f23427f == null) {
                        this.f23427f = new kug();
                    }
                    nyt.a(this.f23427f);
                    continue;
                case 104:
                    this.f23435n = Boolean.valueOf(nyt.i());
                    continue;
                case 114:
                    this.f23438q = nyt.j();
                    continue;
                case 122:
                    if (this.f23424c == null) {
                        this.f23424c = new kti();
                    }
                    nyt.a(this.f23424c);
                    continue;
                case 130:
                    if (this.f23429h == null) {
                        this.f23429h = new kti();
                    }
                    nyt.a(this.f23429h);
                    continue;
                case 138:
                    b = nzl.b(nyt, 138);
                    if (this.f23432k == null) {
                        a = 0;
                    } else {
                        a = this.f23432k.length;
                    }
                    obj = new kti[(b + a)];
                    if (a != 0) {
                        System.arraycopy(this.f23432k, 0, obj, 0, a);
                    }
                    while (a < obj.length - 1) {
                        obj[a] = new kti();
                        nyt.a(obj[a]);
                        nyt.a();
                        a++;
                    }
                    obj[a] = new kti();
                    nyt.a(obj[a]);
                    this.f23432k = obj;
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
