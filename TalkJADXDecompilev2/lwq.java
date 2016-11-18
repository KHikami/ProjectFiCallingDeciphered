package defpackage;

public final class lwq extends nyx<lwq> {
    public Long a;
    public Integer b;
    public Integer c;
    public int[] d;
    public Integer e;
    public Boolean f;
    public int[] g;
    public lup requestHeader;

    public /* synthetic */ nzf a(nyt nyt) {
        return b(nyt);
    }

    public lwq() {
        d();
    }

    private lwq d() {
        this.requestHeader = null;
        this.a = null;
        this.b = null;
        this.c = null;
        this.d = nzl.a;
        this.f = null;
        this.g = nzl.a;
        this.unknownFieldData = null;
        this.cachedSize = -1;
        return this;
    }

    public void a(nyu nyu) {
        int i = 0;
        if (this.requestHeader != null) {
            nyu.b(1, this.requestHeader);
        }
        if (this.a != null) {
            nyu.b(2, this.a.longValue());
        }
        if (this.b != null) {
            nyu.a(3, this.b.intValue());
        }
        if (this.c != null) {
            nyu.a(4, this.c.intValue());
        }
        if (this.d != null && this.d.length > 0) {
            for (int a : this.d) {
                nyu.a(5, a);
            }
        }
        if (this.e != null) {
            nyu.a(6, this.e.intValue());
        }
        if (this.f != null) {
            nyu.a(7, this.f.booleanValue());
        }
        if (this.g != null && this.g.length > 0) {
            while (i < this.g.length) {
                nyu.a(8, this.g[i]);
                i++;
            }
        }
        super.a(nyu);
    }

    protected int b() {
        int i;
        int i2 = 0;
        int b = super.b();
        if (this.requestHeader != null) {
            b += nyu.d(1, this.requestHeader);
        }
        if (this.a != null) {
            b += nyu.f(2, this.a.longValue());
        }
        if (this.b != null) {
            b += nyu.f(3, this.b.intValue());
        }
        if (this.c != null) {
            b += nyu.f(4, this.c.intValue());
        }
        if (this.d != null && this.d.length > 0) {
            int i3 = 0;
            for (int g : this.d) {
                i3 += nyu.g(g);
            }
            b = (b + i3) + (this.d.length * 1);
        }
        if (this.e != null) {
            b += nyu.f(6, this.e.intValue());
        }
        if (this.f != null) {
            this.f.booleanValue();
            b += nyu.h(7) + 1;
        }
        if (this.g == null || this.g.length <= 0) {
            return b;
        }
        i = 0;
        while (i2 < this.g.length) {
            i += nyu.g(this.g[i2]);
            i2++;
        }
        return (b + i) + (this.g.length * 1);
    }

    private lwq b(nyt nyt) {
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
                    this.a = Long.valueOf(nyt.e());
                    continue;
                case wi.dA /*24*/:
                    this.b = Integer.valueOf(nyt.f());
                    continue;
                case 32:
                    this.c = Integer.valueOf(nyt.f());
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
                        a = this.d == null ? 0 : this.d.length;
                        if (a != 0 || i2 != obj.length) {
                            obj2 = new int[(a + i2)];
                            if (a != 0) {
                                System.arraycopy(this.d, 0, obj2, 0, a);
                            }
                            System.arraycopy(obj, 0, obj2, a, i2);
                            this.d = obj2;
                            break;
                        }
                        this.d = obj;
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
                        if (this.d == null) {
                            i2 = 0;
                        } else {
                            i2 = this.d.length;
                        }
                        obj3 = new int[(a + i2)];
                        if (i2 != 0) {
                            System.arraycopy(this.d, 0, obj3, 0, i2);
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
                        this.d = obj3;
                    }
                    nyt.e(i);
                    continue;
                case 48:
                    a = nyt.f();
                    switch (a) {
                        case 0:
                        case 1:
                            this.e = Integer.valueOf(a);
                            break;
                        default:
                            continue;
                    }
                case 56:
                    this.f = Boolean.valueOf(nyt.i());
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
                        a = this.g == null ? 0 : this.g.length;
                        if (a != 0 || i2 != obj.length) {
                            obj2 = new int[(a + i2)];
                            if (a != 0) {
                                System.arraycopy(this.g, 0, obj2, 0, a);
                            }
                            System.arraycopy(obj, 0, obj2, a, i2);
                            this.g = obj2;
                            break;
                        }
                        this.g = obj;
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
                        if (this.g == null) {
                            i2 = 0;
                        } else {
                            i2 = this.g.length;
                        }
                        obj3 = new int[(a + i2)];
                        if (i2 != 0) {
                            System.arraycopy(this.g, 0, obj3, 0, i2);
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
                        this.g = obj3;
                    }
                    nyt.e(i);
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
