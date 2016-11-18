package p000;

public final class lwq extends nyx<lwq> {
    public Long f26711a;
    public Integer f26712b;
    public Integer f26713c;
    public int[] f26714d;
    public Integer f26715e;
    public Boolean f26716f;
    public int[] f26717g;
    public lup requestHeader;

    public /* synthetic */ nzf mo150a(nyt nyt) {
        return m30903b(nyt);
    }

    public lwq() {
        m30904d();
    }

    private lwq m30904d() {
        this.requestHeader = null;
        this.f26711a = null;
        this.f26712b = null;
        this.f26713c = null;
        this.f26714d = nzl.a;
        this.f26716f = null;
        this.f26717g = nzl.a;
        this.unknownFieldData = null;
        this.cachedSize = -1;
        return this;
    }

    public void mo146a(nyu nyu) {
        int i = 0;
        if (this.requestHeader != null) {
            nyu.b(1, this.requestHeader);
        }
        if (this.f26711a != null) {
            nyu.b(2, this.f26711a.longValue());
        }
        if (this.f26712b != null) {
            nyu.a(3, this.f26712b.intValue());
        }
        if (this.f26713c != null) {
            nyu.a(4, this.f26713c.intValue());
        }
        if (this.f26714d != null && this.f26714d.length > 0) {
            for (int a : this.f26714d) {
                nyu.a(5, a);
            }
        }
        if (this.f26715e != null) {
            nyu.a(6, this.f26715e.intValue());
        }
        if (this.f26716f != null) {
            nyu.a(7, this.f26716f.booleanValue());
        }
        if (this.f26717g != null && this.f26717g.length > 0) {
            while (i < this.f26717g.length) {
                nyu.a(8, this.f26717g[i]);
                i++;
            }
        }
        super.mo146a(nyu);
    }

    protected int mo147b() {
        int i;
        int i2 = 0;
        int b = super.mo147b();
        if (this.requestHeader != null) {
            b += nyu.d(1, this.requestHeader);
        }
        if (this.f26711a != null) {
            b += nyu.f(2, this.f26711a.longValue());
        }
        if (this.f26712b != null) {
            b += nyu.f(3, this.f26712b.intValue());
        }
        if (this.f26713c != null) {
            b += nyu.f(4, this.f26713c.intValue());
        }
        if (this.f26714d != null && this.f26714d.length > 0) {
            int i3 = 0;
            for (int g : this.f26714d) {
                i3 += nyu.g(g);
            }
            b = (b + i3) + (this.f26714d.length * 1);
        }
        if (this.f26715e != null) {
            b += nyu.f(6, this.f26715e.intValue());
        }
        if (this.f26716f != null) {
            this.f26716f.booleanValue();
            b += nyu.h(7) + 1;
        }
        if (this.f26717g == null || this.f26717g.length <= 0) {
            return b;
        }
        i = 0;
        while (i2 < this.f26717g.length) {
            i += nyu.g(this.f26717g[i2]);
            i2++;
        }
        return (b + i) + (this.f26717g.length * 1);
    }

    private lwq m30903b(nyt nyt) {
        while (true) {
            int a = nyt.a();
            int b;
            Object obj;
            int i;
            int i2;
            int f;
            Object obj2;
            Object obj3;
            int f2;
            switch (a) {
                case 0:
                    break;
                case 10:
                    if (this.requestHeader == null) {
                        this.requestHeader = new lup();
                    }
                    nyt.a(this.requestHeader);
                    continue;
                case 16:
                    this.f26711a = Long.valueOf(nyt.e());
                    continue;
                case wi.dA /*24*/:
                    this.f26712b = Integer.valueOf(nyt.f());
                    continue;
                case 32:
                    this.f26713c = Integer.valueOf(nyt.f());
                    continue;
                case 40:
                    b = nzl.b(nyt, 40);
                    obj = new int[b];
                    i = 0;
                    i2 = 0;
                    while (i < b) {
                        if (i != 0) {
                            nyt.a();
                        }
                        f = nyt.f();
                        switch (f) {
                            case 0:
                            case 1:
                            case 2:
                            case 3:
                            case 4:
                            case 5:
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
                        a = this.f26714d == null ? 0 : this.f26714d.length;
                        if (a != 0 || i2 != obj.length) {
                            obj2 = new int[(a + i2)];
                            if (a != 0) {
                                System.arraycopy(this.f26714d, 0, obj2, 0, a);
                            }
                            System.arraycopy(obj, 0, obj2, a, i2);
                            this.f26714d = obj2;
                            break;
                        }
                        this.f26714d = obj;
                        break;
                    }
                    continue;
                case 42:
                    i = nyt.d(nyt.r());
                    i2 = nyt.u();
                    a = 0;
                    while (nyt.s() > 0) {
                        switch (nyt.f()) {
                            case 0:
                            case 1:
                            case 2:
                            case 3:
                            case 4:
                            case 5:
                                a++;
                                break;
                            default:
                                break;
                        }
                    }
                    if (a != 0) {
                        nyt.f(i2);
                        if (this.f26714d == null) {
                            i2 = 0;
                        } else {
                            i2 = this.f26714d.length;
                        }
                        obj3 = new int[(a + i2)];
                        if (i2 != 0) {
                            System.arraycopy(this.f26714d, 0, obj3, 0, i2);
                        }
                        while (nyt.s() > 0) {
                            f2 = nyt.f();
                            switch (f2) {
                                case 0:
                                case 1:
                                case 2:
                                case 3:
                                case 4:
                                case 5:
                                    a = i2 + 1;
                                    obj3[i2] = f2;
                                    i2 = a;
                                    break;
                                default:
                                    break;
                            }
                        }
                        this.f26714d = obj3;
                    }
                    nyt.e(i);
                    continue;
                case 48:
                    a = nyt.f();
                    switch (a) {
                        case 0:
                        case 1:
                            this.f26715e = Integer.valueOf(a);
                            break;
                        default:
                            continue;
                    }
                case 56:
                    this.f26716f = Boolean.valueOf(nyt.i());
                    continue;
                case 64:
                    b = nzl.b(nyt, 64);
                    obj = new int[b];
                    i = 0;
                    i2 = 0;
                    while (i < b) {
                        if (i != 0) {
                            nyt.a();
                        }
                        f = nyt.f();
                        switch (f) {
                            case 0:
                            case 1:
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
                        a = this.f26717g == null ? 0 : this.f26717g.length;
                        if (a != 0 || i2 != obj.length) {
                            obj2 = new int[(a + i2)];
                            if (a != 0) {
                                System.arraycopy(this.f26717g, 0, obj2, 0, a);
                            }
                            System.arraycopy(obj, 0, obj2, a, i2);
                            this.f26717g = obj2;
                            break;
                        }
                        this.f26717g = obj;
                        break;
                    }
                    continue;
                case 66:
                    i = nyt.d(nyt.r());
                    i2 = nyt.u();
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
                        nyt.f(i2);
                        if (this.f26717g == null) {
                            i2 = 0;
                        } else {
                            i2 = this.f26717g.length;
                        }
                        obj3 = new int[(a + i2)];
                        if (i2 != 0) {
                            System.arraycopy(this.f26717g, 0, obj3, 0, i2);
                        }
                        while (nyt.s() > 0) {
                            f2 = nyt.f();
                            switch (f2) {
                                case 0:
                                case 1:
                                    a = i2 + 1;
                                    obj3[i2] = f2;
                                    i2 = a;
                                    break;
                                default:
                                    break;
                            }
                        }
                        this.f26717g = obj3;
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
