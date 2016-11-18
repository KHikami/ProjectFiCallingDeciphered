package p000;

public final class kun extends nyx<kun> {
    public String f23463a;
    public int f23464b;
    public kuo[] f23465c;
    public Long f23466d;
    public kuj f23467e;
    public String f23468f;
    public Boolean f23469g;
    public kuo f23470h;
    public int f23471i;
    public kuo[] f23472j;
    public int[] f23473k;

    public /* synthetic */ nzf mo150a(nyt nyt) {
        return m27587b(nyt);
    }

    public kun() {
        this.f23463a = null;
        this.f23464b = nzf.UNSET_ENUM_VALUE;
        this.f23465c = kuo.m27592d();
        this.f23466d = null;
        this.f23468f = null;
        this.f23469g = null;
        this.f23471i = nzf.UNSET_ENUM_VALUE;
        this.f23472j = kuo.m27592d();
        this.f23473k = nzl.a;
        this.cachedSize = -1;
    }

    public void mo146a(nyu nyu) {
        int i = 0;
        if (this.f23463a != null) {
            nyu.a(1, this.f23463a);
        }
        if (this.f23464b != nzf.UNSET_ENUM_VALUE) {
            nyu.a(2, this.f23464b);
        }
        if (this.f23465c != null && this.f23465c.length > 0) {
            for (nzf nzf : this.f23465c) {
                if (nzf != null) {
                    nyu.b(3, nzf);
                }
            }
        }
        if (this.f23466d != null) {
            nyu.b(4, this.f23466d.longValue());
        }
        if (this.f23467e != null) {
            nyu.b(5, this.f23467e);
        }
        if (this.f23468f != null) {
            nyu.a(6, this.f23468f);
        }
        if (this.f23469g != null) {
            nyu.a(7, this.f23469g.booleanValue());
        }
        if (this.f23470h != null) {
            nyu.b(8, this.f23470h);
        }
        if (this.f23471i != nzf.UNSET_ENUM_VALUE) {
            nyu.a(9, this.f23471i);
        }
        if (this.f23472j != null && this.f23472j.length > 0) {
            for (nzf nzf2 : this.f23472j) {
                if (nzf2 != null) {
                    nyu.b(10, nzf2);
                }
            }
        }
        if (this.f23473k != null && this.f23473k.length > 0) {
            while (i < this.f23473k.length) {
                nyu.a(11, this.f23473k[i]);
                i++;
            }
        }
        super.mo146a(nyu);
    }

    protected int mo147b() {
        int i;
        int i2 = 0;
        int b = super.mo147b();
        if (this.f23463a != null) {
            b += nyu.b(1, this.f23463a);
        }
        if (this.f23464b != nzf.UNSET_ENUM_VALUE) {
            b += nyu.f(2, this.f23464b);
        }
        if (this.f23465c != null && this.f23465c.length > 0) {
            i = b;
            for (nzf nzf : this.f23465c) {
                if (nzf != null) {
                    i += nyu.d(3, nzf);
                }
            }
            b = i;
        }
        if (this.f23466d != null) {
            b += nyu.f(4, this.f23466d.longValue());
        }
        if (this.f23467e != null) {
            b += nyu.d(5, this.f23467e);
        }
        if (this.f23468f != null) {
            b += nyu.b(6, this.f23468f);
        }
        if (this.f23469g != null) {
            this.f23469g.booleanValue();
            b += nyu.h(7) + 1;
        }
        if (this.f23470h != null) {
            b += nyu.d(8, this.f23470h);
        }
        if (this.f23471i != nzf.UNSET_ENUM_VALUE) {
            b += nyu.f(9, this.f23471i);
        }
        if (this.f23472j != null && this.f23472j.length > 0) {
            i = b;
            for (nzf nzf2 : this.f23472j) {
                if (nzf2 != null) {
                    i += nyu.d(10, nzf2);
                }
            }
            b = i;
        }
        if (this.f23473k == null || this.f23473k.length <= 0) {
            return b;
        }
        i = 0;
        while (i2 < this.f23473k.length) {
            i += nyu.g(this.f23473k[i2]);
            i2++;
        }
        return (b + i) + (this.f23473k.length * 1);
    }

    private kun m27587b(nyt nyt) {
        while (true) {
            int a = nyt.a();
            int b;
            Object obj;
            int i;
            switch (a) {
                case 0:
                    break;
                case 10:
                    this.f23463a = nyt.j();
                    continue;
                case 16:
                    a = nyt.f();
                    switch (a) {
                        case 0:
                        case 1:
                        case 2:
                        case 3:
                        case 4:
                            this.f23464b = a;
                            break;
                        default:
                            continue;
                    }
                case wi.dx /*26*/:
                    b = nzl.b(nyt, 26);
                    if (this.f23465c == null) {
                        a = 0;
                    } else {
                        a = this.f23465c.length;
                    }
                    obj = new kuo[(b + a)];
                    if (a != 0) {
                        System.arraycopy(this.f23465c, 0, obj, 0, a);
                    }
                    while (a < obj.length - 1) {
                        obj[a] = new kuo();
                        nyt.a(obj[a]);
                        nyt.a();
                        a++;
                    }
                    obj[a] = new kuo();
                    nyt.a(obj[a]);
                    this.f23465c = obj;
                    continue;
                case 32:
                    this.f23466d = Long.valueOf(nyt.e());
                    continue;
                case 42:
                    if (this.f23467e == null) {
                        this.f23467e = new kuj();
                    }
                    nyt.a(this.f23467e);
                    continue;
                case 50:
                    this.f23468f = nyt.j();
                    continue;
                case 56:
                    this.f23469g = Boolean.valueOf(nyt.i());
                    continue;
                case 66:
                    if (this.f23470h == null) {
                        this.f23470h = new kuo();
                    }
                    nyt.a(this.f23470h);
                    continue;
                case 72:
                    a = nyt.f();
                    switch (a) {
                        case 0:
                        case 1:
                        case 2:
                        case 3:
                        case 4:
                            this.f23471i = a;
                            break;
                        default:
                            continue;
                    }
                case 82:
                    b = nzl.b(nyt, 82);
                    if (this.f23472j == null) {
                        a = 0;
                    } else {
                        a = this.f23472j.length;
                    }
                    obj = new kuo[(b + a)];
                    if (a != 0) {
                        System.arraycopy(this.f23472j, 0, obj, 0, a);
                    }
                    while (a < obj.length - 1) {
                        obj[a] = new kuo();
                        nyt.a(obj[a]);
                        nyt.a();
                        a++;
                    }
                    obj[a] = new kuo();
                    nyt.a(obj[a]);
                    this.f23472j = obj;
                    continue;
                case 88:
                    int b2 = nzl.b(nyt, 88);
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
                        a = this.f23473k == null ? 0 : this.f23473k.length;
                        if (a != 0 || b != obj2.length) {
                            Object obj3 = new int[(a + b)];
                            if (a != 0) {
                                System.arraycopy(this.f23473k, 0, obj3, 0, a);
                            }
                            System.arraycopy(obj2, 0, obj3, a, b);
                            this.f23473k = obj3;
                            break;
                        }
                        this.f23473k = obj2;
                        break;
                    }
                    continue;
                case 90:
                    i = nyt.d(nyt.r());
                    b = nyt.u();
                    a = 0;
                    while (nyt.s() > 0) {
                        switch (nyt.f()) {
                            case 0:
                            case 1:
                                a++;
                                break;
                            default:
                                break;
                        }
                    }
                    if (a != 0) {
                        nyt.f(b);
                        if (this.f23473k == null) {
                            b = 0;
                        } else {
                            b = this.f23473k.length;
                        }
                        Object obj4 = new int[(a + b)];
                        if (b != 0) {
                            System.arraycopy(this.f23473k, 0, obj4, 0, b);
                        }
                        while (nyt.s() > 0) {
                            int f2 = nyt.f();
                            switch (f2) {
                                case 0:
                                case 1:
                                    a = b + 1;
                                    obj4[b] = f2;
                                    b = a;
                                    break;
                                default:
                                    break;
                            }
                        }
                        this.f23473k = obj4;
                    }
                    nyt.e(i);
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
