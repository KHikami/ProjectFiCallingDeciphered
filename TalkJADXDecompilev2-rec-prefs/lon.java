package p000;

public final class lon extends nyx<lon> {
    public Integer f25906a;
    public Long f25907b;
    public Integer f25908c;
    public int[] f25909d;
    public ltr f25910e;
    public lsn f25911f;
    public lxf f25912g;
    public Long f25913h;
    public Long f25914i;
    public Long f25915j;
    public Integer f25916k;
    public Boolean f25917l;
    public loo[] f25918m;
    public Integer f25919n;
    public lwt f25920o;
    public Boolean f25921p;

    public /* synthetic */ nzf mo150a(nyt nyt) {
        return m29770b(nyt);
    }

    public lon() {
        m29771d();
    }

    private lon m29771d() {
        this.f25907b = null;
        this.f25909d = nzl.a;
        this.f25910e = null;
        this.f25911f = null;
        this.f25912g = null;
        this.f25913h = null;
        this.f25914i = null;
        this.f25915j = null;
        this.f25917l = null;
        this.f25918m = loo.m29776d();
        this.f25920o = null;
        this.f25921p = null;
        this.unknownFieldData = null;
        this.cachedSize = -1;
        return this;
    }

    public void mo146a(nyu nyu) {
        int i = 0;
        if (this.f25907b != null) {
            nyu.a(2, this.f25907b.longValue());
        }
        if (this.f25912g != null) {
            nyu.b(7, this.f25912g);
        }
        if (this.f25906a != null) {
            nyu.a(8, this.f25906a.intValue());
        }
        if (this.f25908c != null) {
            nyu.a(9, this.f25908c.intValue());
        }
        if (this.f25909d != null && this.f25909d.length > 0) {
            for (int a : this.f25909d) {
                nyu.a(10, a);
            }
        }
        if (this.f25910e != null) {
            nyu.b(11, this.f25910e);
        }
        if (this.f25913h != null) {
            nyu.a(12, this.f25913h.longValue());
        }
        if (this.f25915j != null) {
            nyu.a(13, this.f25915j.longValue());
        }
        if (this.f25914i != null) {
            nyu.a(14, this.f25914i.longValue());
        }
        if (this.f25916k != null) {
            nyu.a(15, this.f25916k.intValue());
        }
        if (this.f25917l != null) {
            nyu.a(16, this.f25917l.booleanValue());
        }
        if (this.f25918m != null && this.f25918m.length > 0) {
            while (i < this.f25918m.length) {
                nzf nzf = this.f25918m[i];
                if (nzf != null) {
                    nyu.b(17, nzf);
                }
                i++;
            }
        }
        if (this.f25919n != null) {
            nyu.a(18, this.f25919n.intValue());
        }
        if (this.f25911f != null) {
            nyu.b(19, this.f25911f);
        }
        if (this.f25920o != null) {
            nyu.b(20, this.f25920o);
        }
        if (this.f25921p != null) {
            nyu.a(21, this.f25921p.booleanValue());
        }
        super.mo146a(nyu);
    }

    protected int mo147b() {
        int i = 0;
        int b = super.mo147b();
        if (this.f25907b != null) {
            b += nyu.e(2, this.f25907b.longValue());
        }
        if (this.f25912g != null) {
            b += nyu.d(7, this.f25912g);
        }
        if (this.f25906a != null) {
            b += nyu.f(8, this.f25906a.intValue());
        }
        if (this.f25908c != null) {
            b += nyu.f(9, this.f25908c.intValue());
        }
        if (this.f25909d != null && this.f25909d.length > 0) {
            int i2 = 0;
            for (int g : this.f25909d) {
                i2 += nyu.g(g);
            }
            b = (b + i2) + (this.f25909d.length * 1);
        }
        if (this.f25910e != null) {
            b += nyu.d(11, this.f25910e);
        }
        if (this.f25913h != null) {
            b += nyu.e(12, this.f25913h.longValue());
        }
        if (this.f25915j != null) {
            b += nyu.e(13, this.f25915j.longValue());
        }
        if (this.f25914i != null) {
            b += nyu.e(14, this.f25914i.longValue());
        }
        if (this.f25916k != null) {
            b += nyu.f(15, this.f25916k.intValue());
        }
        if (this.f25917l != null) {
            this.f25917l.booleanValue();
            b += nyu.h(16) + 1;
        }
        if (this.f25918m != null && this.f25918m.length > 0) {
            while (i < this.f25918m.length) {
                nzf nzf = this.f25918m[i];
                if (nzf != null) {
                    b += nyu.d(17, nzf);
                }
                i++;
            }
        }
        if (this.f25919n != null) {
            b += nyu.f(18, this.f25919n.intValue());
        }
        if (this.f25911f != null) {
            b += nyu.d(19, this.f25911f);
        }
        if (this.f25920o != null) {
            b += nyu.d(20, this.f25920o);
        }
        if (this.f25921p == null) {
            return b;
        }
        this.f25921p.booleanValue();
        return b + (nyu.h(21) + 1);
    }

    private lon m29770b(nyt nyt) {
        while (true) {
            int a = nyt.a();
            int i;
            int i2;
            switch (a) {
                case 0:
                    break;
                case 16:
                    this.f25907b = Long.valueOf(nyt.d());
                    continue;
                case 58:
                    if (this.f25912g == null) {
                        this.f25912g = new lxf();
                    }
                    nyt.a(this.f25912g);
                    continue;
                case 64:
                    a = nyt.f();
                    switch (a) {
                        case 0:
                        case 1:
                        case 2:
                        case 3:
                            this.f25906a = Integer.valueOf(a);
                            break;
                        default:
                            continue;
                    }
                case 72:
                    a = nyt.f();
                    switch (a) {
                        case 10:
                        case 20:
                        case wi.dz /*25*/:
                        case 30:
                        case 100:
                            this.f25908c = Integer.valueOf(a);
                            break;
                        default:
                            continue;
                    }
                case 80:
                    int b = nzl.b(nyt, 80);
                    Object obj = new int[b];
                    i = 0;
                    i2 = 0;
                    while (i < b) {
                        if (i != 0) {
                            nyt.a();
                        }
                        int f = nyt.f();
                        switch (f) {
                            case 0:
                            case 1:
                            case 2:
                                a = i2 + 1;
                                obj[i2] = f;
                                break;
                            default:
                                a = i2;
                                break;
                        }
                        i++;
                        i2 = a;
                    }
                    if (i2 != 0) {
                        a = this.f25909d == null ? 0 : this.f25909d.length;
                        if (a != 0 || i2 != obj.length) {
                            Object obj2 = new int[(a + i2)];
                            if (a != 0) {
                                System.arraycopy(this.f25909d, 0, obj2, 0, a);
                            }
                            System.arraycopy(obj, 0, obj2, a, i2);
                            this.f25909d = obj2;
                            break;
                        }
                        this.f25909d = obj;
                        break;
                    }
                    continue;
                case 82:
                    i = nyt.d(nyt.r());
                    i2 = nyt.u();
                    a = 0;
                    while (nyt.s() > 0) {
                        switch (nyt.f()) {
                            case 0:
                            case 1:
                            case 2:
                                a++;
                                break;
                            default:
                                break;
                        }
                    }
                    if (a != 0) {
                        nyt.f(i2);
                        if (this.f25909d == null) {
                            i2 = 0;
                        } else {
                            i2 = this.f25909d.length;
                        }
                        Object obj3 = new int[(a + i2)];
                        if (i2 != 0) {
                            System.arraycopy(this.f25909d, 0, obj3, 0, i2);
                        }
                        while (nyt.s() > 0) {
                            int f2 = nyt.f();
                            switch (f2) {
                                case 0:
                                case 1:
                                case 2:
                                    a = i2 + 1;
                                    obj3[i2] = f2;
                                    i2 = a;
                                    break;
                                default:
                                    break;
                            }
                        }
                        this.f25909d = obj3;
                    }
                    nyt.e(i);
                    continue;
                case 90:
                    if (this.f25910e == null) {
                        this.f25910e = new ltr();
                    }
                    nyt.a(this.f25910e);
                    continue;
                case 96:
                    this.f25913h = Long.valueOf(nyt.d());
                    continue;
                case 104:
                    this.f25915j = Long.valueOf(nyt.d());
                    continue;
                case 112:
                    this.f25914i = Long.valueOf(nyt.d());
                    continue;
                case 120:
                    a = nyt.f();
                    switch (a) {
                        case 0:
                        case 1:
                        case 2:
                            this.f25916k = Integer.valueOf(a);
                            break;
                        default:
                            continue;
                    }
                case 128:
                    this.f25917l = Boolean.valueOf(nyt.i());
                    continue;
                case 138:
                    i2 = nzl.b(nyt, 138);
                    if (this.f25918m == null) {
                        a = 0;
                    } else {
                        a = this.f25918m.length;
                    }
                    Object obj4 = new loo[(i2 + a)];
                    if (a != 0) {
                        System.arraycopy(this.f25918m, 0, obj4, 0, a);
                    }
                    while (a < obj4.length - 1) {
                        obj4[a] = new loo();
                        nyt.a(obj4[a]);
                        nyt.a();
                        a++;
                    }
                    obj4[a] = new loo();
                    nyt.a(obj4[a]);
                    this.f25918m = obj4;
                    continue;
                case 144:
                    a = nyt.f();
                    switch (a) {
                        case 0:
                        case 1:
                        case 2:
                        case 3:
                            this.f25919n = Integer.valueOf(a);
                            break;
                        default:
                            continue;
                    }
                case 154:
                    if (this.f25911f == null) {
                        this.f25911f = new lsn();
                    }
                    nyt.a(this.f25911f);
                    continue;
                case 162:
                    if (this.f25920o == null) {
                        this.f25920o = new lwt();
                    }
                    nyt.a(this.f25920o);
                    continue;
                case 168:
                    this.f25921p = Boolean.valueOf(nyt.i());
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
