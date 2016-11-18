package p000;

public final class lcn extends nyx<lcn> {
    private static volatile lcn[] f24595f;
    public Integer f24596a;
    public int[] f24597b;
    public Boolean f24598c;
    public Boolean f24599d;
    public Boolean f24600e;

    public /* synthetic */ nzf mo150a(nyt nyt) {
        return m28621b(nyt);
    }

    public static lcn[] m28622d() {
        if (f24595f == null) {
            synchronized (nzc.c) {
                if (f24595f == null) {
                    f24595f = new lcn[0];
                }
            }
        }
        return f24595f;
    }

    public lcn() {
        m28623g();
    }

    private lcn m28623g() {
        this.f24597b = nzl.a;
        this.f24598c = null;
        this.f24599d = null;
        this.f24600e = null;
        this.unknownFieldData = null;
        this.cachedSize = -1;
        return this;
    }

    public void mo146a(nyu nyu) {
        if (this.f24597b != null && this.f24597b.length > 0) {
            for (int a : this.f24597b) {
                nyu.a(1, a);
            }
        }
        if (this.f24598c != null) {
            nyu.a(2, this.f24598c.booleanValue());
        }
        if (this.f24599d != null) {
            nyu.a(3, this.f24599d.booleanValue());
        }
        if (this.f24596a != null) {
            nyu.a(4, this.f24596a.intValue());
        }
        if (this.f24600e != null) {
            nyu.a(5, this.f24600e.booleanValue());
        }
        super.mo146a(nyu);
    }

    protected int mo147b() {
        int i = 0;
        int b = super.mo147b();
        if (this.f24597b == null || this.f24597b.length <= 0) {
            i = b;
        } else {
            int i2 = 0;
            while (i < this.f24597b.length) {
                i2 += nyu.g(this.f24597b[i]);
                i++;
            }
            i = (b + i2) + (this.f24597b.length * 1);
        }
        if (this.f24598c != null) {
            this.f24598c.booleanValue();
            i += nyu.h(2) + 1;
        }
        if (this.f24599d != null) {
            this.f24599d.booleanValue();
            i += nyu.h(3) + 1;
        }
        if (this.f24596a != null) {
            i += nyu.f(4, this.f24596a.intValue());
        }
        if (this.f24600e == null) {
            return i;
        }
        this.f24600e.booleanValue();
        return i + (nyu.h(5) + 1);
    }

    private lcn m28621b(nyt nyt) {
        while (true) {
            int a = nyt.a();
            int i;
            int i2;
            switch (a) {
                case 0:
                    break;
                case 8:
                    int b = nzl.b(nyt, 8);
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
                            case 3:
                            case 4:
                            case 5:
                            case 6:
                            case 7:
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
                        a = this.f24597b == null ? 0 : this.f24597b.length;
                        if (a != 0 || i2 != obj.length) {
                            Object obj2 = new int[(a + i2)];
                            if (a != 0) {
                                System.arraycopy(this.f24597b, 0, obj2, 0, a);
                            }
                            System.arraycopy(obj, 0, obj2, a, i2);
                            this.f24597b = obj2;
                            break;
                        }
                        this.f24597b = obj;
                        break;
                    }
                    continue;
                case 10:
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
                            case 6:
                            case 7:
                                a++;
                                break;
                            default:
                                break;
                        }
                    }
                    if (a != 0) {
                        nyt.f(i2);
                        if (this.f24597b == null) {
                            i2 = 0;
                        } else {
                            i2 = this.f24597b.length;
                        }
                        Object obj3 = new int[(a + i2)];
                        if (i2 != 0) {
                            System.arraycopy(this.f24597b, 0, obj3, 0, i2);
                        }
                        while (nyt.s() > 0) {
                            int f2 = nyt.f();
                            switch (f2) {
                                case 0:
                                case 1:
                                case 2:
                                case 3:
                                case 4:
                                case 5:
                                case 6:
                                case 7:
                                    a = i2 + 1;
                                    obj3[i2] = f2;
                                    i2 = a;
                                    break;
                                default:
                                    break;
                            }
                        }
                        this.f24597b = obj3;
                    }
                    nyt.e(i);
                    continue;
                case 16:
                    this.f24598c = Boolean.valueOf(nyt.i());
                    continue;
                case wi.dA /*24*/:
                    this.f24599d = Boolean.valueOf(nyt.i());
                    continue;
                case 32:
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
                        case 10:
                        case 11:
                        case 12:
                        case 13:
                        case 14:
                        case 15:
                        case 16:
                        case wi.dK /*17*/:
                        case wi.dH /*18*/:
                        case wi.dL /*19*/:
                        case 20:
                        case 21:
                        case 22:
                        case wi.f29038do /*23*/:
                        case wi.dA /*24*/:
                        case wi.dz /*25*/:
                        case wi.dx /*26*/:
                        case 27:
                        case 28:
                        case 29:
                        case 30:
                        case 31:
                        case 32:
                            this.f24596a = Integer.valueOf(a);
                            break;
                        default:
                            continue;
                    }
                case 40:
                    this.f24600e = Boolean.valueOf(nyt.i());
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
