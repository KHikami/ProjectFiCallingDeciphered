package p000;

public final class lrn extends nyx<lrn> {
    public lqc f26223a;
    public Boolean f26224b;
    public log[] f26225c;
    public lpu f26226d;
    public lpl f26227e;
    public lpm f26228f;
    public ltt f26229g;
    public loi[] f26230h;
    public Boolean f26231i;
    public Boolean f26232j;
    public lpn f26233k;
    public luu f26234l;
    public Boolean f26235m;
    public Boolean f26236n;
    public Integer f26237o;
    public ltr[] f26238p;
    public Integer f26239q;
    public mut f26240r;
    public luq responseHeader;
    public lqq[] f26241s;
    public lws f26242t;
    public Integer f26243u;

    public /* synthetic */ nzf mo150a(nyt nyt) {
        return m30196b(nyt);
    }

    public lrn() {
        m30197d();
    }

    private lrn m30197d() {
        this.responseHeader = null;
        this.f26223a = null;
        this.f26224b = null;
        this.f26225c = log.m29733d();
        this.f26226d = null;
        this.f26227e = null;
        this.f26228f = null;
        this.f26229g = null;
        this.f26230h = loi.m29744d();
        this.f26231i = null;
        this.f26232j = null;
        this.f26233k = null;
        this.f26234l = null;
        this.f26235m = null;
        this.f26236n = null;
        this.f26238p = ltr.m30492d();
        this.f26240r = null;
        this.f26241s = lqq.m30077d();
        this.f26242t = null;
        this.unknownFieldData = null;
        this.cachedSize = -1;
        return this;
    }

    public void mo146a(nyu nyu) {
        int i = 0;
        if (this.responseHeader != null) {
            nyu.b(1, this.responseHeader);
        }
        if (this.f26223a != null) {
            nyu.b(2, this.f26223a);
        }
        if (this.f26224b != null) {
            nyu.a(3, this.f26224b.booleanValue());
        }
        if (this.f26225c != null && this.f26225c.length > 0) {
            for (nzf nzf : this.f26225c) {
                if (nzf != null) {
                    nyu.b(4, nzf);
                }
            }
        }
        if (this.f26226d != null) {
            nyu.b(5, this.f26226d);
        }
        if (this.f26227e != null) {
            nyu.b(6, this.f26227e);
        }
        if (this.f26229g != null) {
            nyu.b(7, this.f26229g);
        }
        if (this.f26230h != null && this.f26230h.length > 0) {
            for (nzf nzf2 : this.f26230h) {
                if (nzf2 != null) {
                    nyu.b(8, nzf2);
                }
            }
        }
        if (this.f26228f != null) {
            nyu.b(9, this.f26228f);
        }
        if (this.f26231i != null) {
            nyu.a(10, this.f26231i.booleanValue());
        }
        if (this.f26233k != null) {
            nyu.b(11, this.f26233k);
        }
        if (this.f26234l != null) {
            nyu.b(12, this.f26234l);
        }
        if (this.f26232j != null) {
            nyu.a(13, this.f26232j.booleanValue());
        }
        if (this.f26235m != null) {
            nyu.a(14, this.f26235m.booleanValue());
        }
        if (this.f26236n != null) {
            nyu.a(15, this.f26236n.booleanValue());
        }
        if (this.f26237o != null) {
            nyu.a(16, this.f26237o.intValue());
        }
        if (this.f26238p != null && this.f26238p.length > 0) {
            for (nzf nzf22 : this.f26238p) {
                if (nzf22 != null) {
                    nyu.b(17, nzf22);
                }
            }
        }
        if (this.f26239q != null) {
            nyu.a(18, this.f26239q.intValue());
        }
        if (this.f26240r != null) {
            nyu.b(19, this.f26240r);
        }
        if (this.f26241s != null && this.f26241s.length > 0) {
            while (i < this.f26241s.length) {
                nzf nzf3 = this.f26241s[i];
                if (nzf3 != null) {
                    nyu.b(20, nzf3);
                }
                i++;
            }
        }
        if (this.f26242t != null) {
            nyu.b(22, this.f26242t);
        }
        if (this.f26243u != null) {
            nyu.a(24, this.f26243u.intValue());
        }
        super.mo146a(nyu);
    }

    protected int mo147b() {
        int i;
        int i2 = 0;
        int b = super.mo147b();
        if (this.responseHeader != null) {
            b += nyu.d(1, this.responseHeader);
        }
        if (this.f26223a != null) {
            b += nyu.d(2, this.f26223a);
        }
        if (this.f26224b != null) {
            this.f26224b.booleanValue();
            b += nyu.h(3) + 1;
        }
        if (this.f26225c != null && this.f26225c.length > 0) {
            i = b;
            for (nzf nzf : this.f26225c) {
                if (nzf != null) {
                    i += nyu.d(4, nzf);
                }
            }
            b = i;
        }
        if (this.f26226d != null) {
            b += nyu.d(5, this.f26226d);
        }
        if (this.f26227e != null) {
            b += nyu.d(6, this.f26227e);
        }
        if (this.f26229g != null) {
            b += nyu.d(7, this.f26229g);
        }
        if (this.f26230h != null && this.f26230h.length > 0) {
            i = b;
            for (nzf nzf2 : this.f26230h) {
                if (nzf2 != null) {
                    i += nyu.d(8, nzf2);
                }
            }
            b = i;
        }
        if (this.f26228f != null) {
            b += nyu.d(9, this.f26228f);
        }
        if (this.f26231i != null) {
            this.f26231i.booleanValue();
            b += nyu.h(10) + 1;
        }
        if (this.f26233k != null) {
            b += nyu.d(11, this.f26233k);
        }
        if (this.f26234l != null) {
            b += nyu.d(12, this.f26234l);
        }
        if (this.f26232j != null) {
            this.f26232j.booleanValue();
            b += nyu.h(13) + 1;
        }
        if (this.f26235m != null) {
            this.f26235m.booleanValue();
            b += nyu.h(14) + 1;
        }
        if (this.f26236n != null) {
            this.f26236n.booleanValue();
            b += nyu.h(15) + 1;
        }
        if (this.f26237o != null) {
            b += nyu.f(16, this.f26237o.intValue());
        }
        if (this.f26238p != null && this.f26238p.length > 0) {
            i = b;
            for (nzf nzf22 : this.f26238p) {
                if (nzf22 != null) {
                    i += nyu.d(17, nzf22);
                }
            }
            b = i;
        }
        if (this.f26239q != null) {
            b += nyu.f(18, this.f26239q.intValue());
        }
        if (this.f26240r != null) {
            b += nyu.d(19, this.f26240r);
        }
        if (this.f26241s != null && this.f26241s.length > 0) {
            while (i2 < this.f26241s.length) {
                nzf nzf3 = this.f26241s[i2];
                if (nzf3 != null) {
                    b += nyu.d(20, nzf3);
                }
                i2++;
            }
        }
        if (this.f26242t != null) {
            b += nyu.d(22, this.f26242t);
        }
        if (this.f26243u != null) {
            return b + nyu.f(24, this.f26243u.intValue());
        }
        return b;
    }

    private lrn m30196b(nyt nyt) {
        while (true) {
            int a = nyt.a();
            int b;
            Object obj;
            switch (a) {
                case 0:
                    break;
                case 10:
                    if (this.responseHeader == null) {
                        this.responseHeader = new luq();
                    }
                    nyt.a(this.responseHeader);
                    continue;
                case wi.dH /*18*/:
                    if (this.f26223a == null) {
                        this.f26223a = new lqc();
                    }
                    nyt.a(this.f26223a);
                    continue;
                case wi.dA /*24*/:
                    this.f26224b = Boolean.valueOf(nyt.i());
                    continue;
                case 34:
                    b = nzl.b(nyt, 34);
                    if (this.f26225c == null) {
                        a = 0;
                    } else {
                        a = this.f26225c.length;
                    }
                    obj = new log[(b + a)];
                    if (a != 0) {
                        System.arraycopy(this.f26225c, 0, obj, 0, a);
                    }
                    while (a < obj.length - 1) {
                        obj[a] = new log();
                        nyt.a(obj[a]);
                        nyt.a();
                        a++;
                    }
                    obj[a] = new log();
                    nyt.a(obj[a]);
                    this.f26225c = obj;
                    continue;
                case 42:
                    if (this.f26226d == null) {
                        this.f26226d = new lpu();
                    }
                    nyt.a(this.f26226d);
                    continue;
                case 50:
                    if (this.f26227e == null) {
                        this.f26227e = new lpl();
                    }
                    nyt.a(this.f26227e);
                    continue;
                case 58:
                    if (this.f26229g == null) {
                        this.f26229g = new ltt();
                    }
                    nyt.a(this.f26229g);
                    continue;
                case 66:
                    b = nzl.b(nyt, 66);
                    if (this.f26230h == null) {
                        a = 0;
                    } else {
                        a = this.f26230h.length;
                    }
                    obj = new loi[(b + a)];
                    if (a != 0) {
                        System.arraycopy(this.f26230h, 0, obj, 0, a);
                    }
                    while (a < obj.length - 1) {
                        obj[a] = new loi();
                        nyt.a(obj[a]);
                        nyt.a();
                        a++;
                    }
                    obj[a] = new loi();
                    nyt.a(obj[a]);
                    this.f26230h = obj;
                    continue;
                case 74:
                    if (this.f26228f == null) {
                        this.f26228f = new lpm();
                    }
                    nyt.a(this.f26228f);
                    continue;
                case 80:
                    this.f26231i = Boolean.valueOf(nyt.i());
                    continue;
                case 90:
                    if (this.f26233k == null) {
                        this.f26233k = new lpn();
                    }
                    nyt.a(this.f26233k);
                    continue;
                case 98:
                    if (this.f26234l == null) {
                        this.f26234l = new luu();
                    }
                    nyt.a(this.f26234l);
                    continue;
                case 104:
                    this.f26232j = Boolean.valueOf(nyt.i());
                    continue;
                case 112:
                    this.f26235m = Boolean.valueOf(nyt.i());
                    continue;
                case 120:
                    this.f26236n = Boolean.valueOf(nyt.i());
                    continue;
                case 128:
                    a = nyt.f();
                    switch (a) {
                        case 0:
                        case 1:
                        case 2:
                            this.f26237o = Integer.valueOf(a);
                            break;
                        default:
                            continue;
                    }
                case 138:
                    b = nzl.b(nyt, 138);
                    if (this.f26238p == null) {
                        a = 0;
                    } else {
                        a = this.f26238p.length;
                    }
                    obj = new ltr[(b + a)];
                    if (a != 0) {
                        System.arraycopy(this.f26238p, 0, obj, 0, a);
                    }
                    while (a < obj.length - 1) {
                        obj[a] = new ltr();
                        nyt.a(obj[a]);
                        nyt.a();
                        a++;
                    }
                    obj[a] = new ltr();
                    nyt.a(obj[a]);
                    this.f26238p = obj;
                    continue;
                case 144:
                    a = nyt.f();
                    switch (a) {
                        case 0:
                        case 1:
                        case 2:
                        case 3:
                            this.f26239q = Integer.valueOf(a);
                            break;
                        default:
                            continue;
                    }
                case 154:
                    if (this.f26240r == null) {
                        this.f26240r = new mut();
                    }
                    nyt.a(this.f26240r);
                    continue;
                case 162:
                    b = nzl.b(nyt, 162);
                    if (this.f26241s == null) {
                        a = 0;
                    } else {
                        a = this.f26241s.length;
                    }
                    obj = new lqq[(b + a)];
                    if (a != 0) {
                        System.arraycopy(this.f26241s, 0, obj, 0, a);
                    }
                    while (a < obj.length - 1) {
                        obj[a] = new lqq();
                        nyt.a(obj[a]);
                        nyt.a();
                        a++;
                    }
                    obj[a] = new lqq();
                    nyt.a(obj[a]);
                    this.f26241s = obj;
                    continue;
                case 178:
                    if (this.f26242t == null) {
                        this.f26242t = new lws();
                    }
                    nyt.a(this.f26242t);
                    continue;
                case 192:
                    a = nyt.f();
                    switch (a) {
                        case 10:
                        case 20:
                        case wi.dz /*25*/:
                        case 30:
                        case 100:
                            this.f26243u = Integer.valueOf(a);
                            break;
                        default:
                            continue;
                    }
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
