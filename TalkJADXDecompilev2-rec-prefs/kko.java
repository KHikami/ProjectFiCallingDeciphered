package p000;

public final class kko extends nyx<kko> {
    private static volatile kko[] f22071f;
    public klk f22072a;
    public int[] f22073b;
    public Integer f22074c;
    public String f22075d;
    public kkp[] f22076e;

    public /* synthetic */ nzf mo150a(nyt nyt) {
        return m26268b(nyt);
    }

    public static kko[] m26269d() {
        if (f22071f == null) {
            synchronized (nzc.c) {
                if (f22071f == null) {
                    f22071f = new kko[0];
                }
            }
        }
        return f22071f;
    }

    public kko() {
        m26270g();
    }

    private kko m26270g() {
        this.f22072a = null;
        this.f22073b = nzl.a;
        this.f22075d = null;
        this.f22076e = kkp.m26275d();
        this.unknownFieldData = null;
        this.cachedSize = -1;
        return this;
    }

    public void mo146a(nyu nyu) {
        int i = 0;
        if (this.f22072a != null) {
            nyu.b(1, this.f22072a);
        }
        if (this.f22073b != null && this.f22073b.length > 0) {
            for (int a : this.f22073b) {
                nyu.a(2, a);
            }
        }
        if (this.f22074c != null) {
            nyu.a(3, this.f22074c.intValue());
        }
        if (this.f22075d != null) {
            nyu.a(4, this.f22075d);
        }
        if (this.f22076e != null && this.f22076e.length > 0) {
            while (i < this.f22076e.length) {
                nzf nzf = this.f22076e[i];
                if (nzf != null) {
                    nyu.b(5, nzf);
                }
                i++;
            }
        }
        super.mo146a(nyu);
    }

    protected int mo147b() {
        int i = 0;
        int b = super.mo147b();
        if (this.f22072a != null) {
            b += nyu.d(1, this.f22072a);
        }
        if (this.f22073b != null && this.f22073b.length > 0) {
            int i2 = 0;
            for (int g : this.f22073b) {
                i2 += nyu.g(g);
            }
            b = (b + i2) + (this.f22073b.length * 1);
        }
        if (this.f22074c != null) {
            b += nyu.f(3, this.f22074c.intValue());
        }
        if (this.f22075d != null) {
            b += nyu.b(4, this.f22075d);
        }
        if (this.f22076e != null && this.f22076e.length > 0) {
            while (i < this.f22076e.length) {
                nzf nzf = this.f22076e[i];
                if (nzf != null) {
                    b += nyu.d(5, nzf);
                }
                i++;
            }
        }
        return b;
    }

    private kko m26268b(nyt nyt) {
        while (true) {
            int a = nyt.a();
            int i;
            int i2;
            switch (a) {
                case 0:
                    break;
                case 10:
                    if (this.f22072a == null) {
                        this.f22072a = new klk();
                    }
                    nyt.a(this.f22072a);
                    continue;
                case 16:
                    int b = nzl.b(nyt, 16);
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
                            case 6:
                            case 11:
                            case 13:
                            case 15:
                            case 16:
                            case wi.dL /*19*/:
                            case 20:
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
                        a = this.f22073b == null ? 0 : this.f22073b.length;
                        if (a != 0 || i2 != obj.length) {
                            Object obj2 = new int[(a + i2)];
                            if (a != 0) {
                                System.arraycopy(this.f22073b, 0, obj2, 0, a);
                            }
                            System.arraycopy(obj, 0, obj2, a, i2);
                            this.f22073b = obj2;
                            break;
                        }
                        this.f22073b = obj;
                        break;
                    }
                    continue;
                case wi.dH /*18*/:
                    i = nyt.d(nyt.r());
                    i2 = nyt.u();
                    a = 0;
                    while (nyt.s() > 0) {
                        switch (nyt.f()) {
                            case 0:
                            case 6:
                            case 11:
                            case 13:
                            case 15:
                            case 16:
                            case wi.dL /*19*/:
                            case 20:
                                a++;
                                break;
                            default:
                                break;
                        }
                    }
                    if (a != 0) {
                        nyt.f(i2);
                        if (this.f22073b == null) {
                            i2 = 0;
                        } else {
                            i2 = this.f22073b.length;
                        }
                        Object obj3 = new int[(a + i2)];
                        if (i2 != 0) {
                            System.arraycopy(this.f22073b, 0, obj3, 0, i2);
                        }
                        while (nyt.s() > 0) {
                            int f2 = nyt.f();
                            switch (f2) {
                                case 0:
                                case 6:
                                case 11:
                                case 13:
                                case 15:
                                case 16:
                                case wi.dL /*19*/:
                                case 20:
                                    a = i2 + 1;
                                    obj3[i2] = f2;
                                    i2 = a;
                                    break;
                                default:
                                    break;
                            }
                        }
                        this.f22073b = obj3;
                    }
                    nyt.e(i);
                    continue;
                case wi.dA /*24*/:
                    a = nyt.f();
                    switch (a) {
                        case 0:
                        case 1:
                        case 2:
                            this.f22074c = Integer.valueOf(a);
                            break;
                        default:
                            continue;
                    }
                case 34:
                    this.f22075d = nyt.j();
                    continue;
                case 42:
                    i2 = nzl.b(nyt, 42);
                    if (this.f22076e == null) {
                        a = 0;
                    } else {
                        a = this.f22076e.length;
                    }
                    Object obj4 = new kkp[(i2 + a)];
                    if (a != 0) {
                        System.arraycopy(this.f22076e, 0, obj4, 0, a);
                    }
                    while (a < obj4.length - 1) {
                        obj4[a] = new kkp();
                        nyt.a(obj4[a]);
                        nyt.a();
                        a++;
                    }
                    obj4[a] = new kkp();
                    nyt.a(obj4[a]);
                    this.f22076e = obj4;
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
