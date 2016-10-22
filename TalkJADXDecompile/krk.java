public final class krk extends nyx<krk> {
    public Integer a;
    public Integer b;
    public Integer c;
    public Long d;
    public int[] e;
    public krj f;
    public Boolean g;
    public Boolean h;

    public /* synthetic */ nzf a(nyt nyt) {
        return b(nyt);
    }

    public krk() {
        d();
    }

    private krk d() {
        this.b = null;
        this.d = null;
        this.e = nzl.a;
        this.f = null;
        this.g = null;
        this.h = null;
        this.unknownFieldData = null;
        this.cachedSize = -1;
        return this;
    }

    public void a(nyu nyu) {
        if (this.a != null) {
            nyu.a(1, this.a.intValue());
        }
        if (this.b != null) {
            nyu.a(3, this.b.intValue());
        }
        if (this.c != null) {
            nyu.a(4, this.c.intValue());
        }
        if (this.d != null) {
            nyu.b(5, this.d.longValue());
        }
        if (this.e != null && this.e.length > 0) {
            for (int a : this.e) {
                nyu.a(6, a);
            }
        }
        if (this.f != null) {
            nyu.b(8, this.f);
        }
        if (this.g != null) {
            nyu.a(9, this.g.booleanValue());
        }
        if (this.h != null) {
            nyu.a(10, this.h.booleanValue());
        }
        super.a(nyu);
    }

    protected int b() {
        int i = 0;
        int b = super.b();
        if (this.a != null) {
            b += nyu.f(1, this.a.intValue());
        }
        if (this.b != null) {
            b += nyu.f(3, this.b.intValue());
        }
        if (this.c != null) {
            b += nyu.f(4, this.c.intValue());
        }
        if (this.d != null) {
            b += nyu.f(5, this.d.longValue());
        }
        if (this.e != null && this.e.length > 0) {
            int i2 = 0;
            while (i < this.e.length) {
                i2 += nyu.g(this.e[i]);
                i++;
            }
            b = (b + i2) + (this.e.length * 1);
        }
        if (this.f != null) {
            b += nyu.d(8, this.f);
        }
        if (this.g != null) {
            this.g.booleanValue();
            b += nyu.h(9) + 1;
        }
        if (this.h == null) {
            return b;
        }
        this.h.booleanValue();
        return b + (nyu.h(10) + 1);
    }

    private krk b(nyt nyt) {
        while (true) {
            int a = nyt.a();
            int i;
            int i2;
            switch (a) {
                case wi.w /*0*/:
                    break;
                case wi.m /*8*/:
                    a = nyt.f();
                    switch (a) {
                        case wi.j /*1*/:
                        case wi.l /*2*/:
                        case wi.z /*3*/:
                        case wi.h /*4*/:
                            this.a = Integer.valueOf(a);
                            break;
                        default:
                            continue;
                    }
                case wi.dA /*24*/:
                    this.b = Integer.valueOf(nyt.f());
                    continue;
                case 32:
                    a = nyt.f();
                    switch (a) {
                        case wi.w /*0*/:
                        case wi.j /*1*/:
                        case wi.l /*2*/:
                        case wi.z /*3*/:
                            this.c = Integer.valueOf(a);
                            break;
                        default:
                            continue;
                    }
                case 40:
                    this.d = Long.valueOf(nyt.e());
                    continue;
                case 48:
                    int b = nzl.b(nyt, 48);
                    Object obj = new int[b];
                    i = 0;
                    i2 = 0;
                    while (i < b) {
                        if (i != 0) {
                            nyt.a();
                        }
                        int f = nyt.f();
                        switch (f) {
                            case wi.j /*1*/:
                            case wi.l /*2*/:
                            case wi.z /*3*/:
                            case wi.h /*4*/:
                            case wi.p /*5*/:
                            case wi.s /*6*/:
                            case wi.q /*7*/:
                            case wi.m /*8*/:
                            case wi.n /*9*/:
                            case wi.dr /*10*/:
                            case wi.dB /*11*/:
                            case wi.dM /*12*/:
                            case wi.dD /*13*/:
                            case wi.g /*14*/:
                            case wi.dJ /*15*/:
                            case wi.dI /*16*/:
                            case wi.dK /*17*/:
                            case wi.dH /*18*/:
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
                        a = this.e == null ? 0 : this.e.length;
                        if (a != 0 || i2 != obj.length) {
                            Object obj2 = new int[(a + i2)];
                            if (a != 0) {
                                System.arraycopy(this.e, 0, obj2, 0, a);
                            }
                            System.arraycopy(obj, 0, obj2, a, i2);
                            this.e = obj2;
                            break;
                        }
                        this.e = obj;
                        break;
                    }
                    continue;
                case 50:
                    i = nyt.d(nyt.r());
                    i2 = nyt.u();
                    a = 0;
                    while (nyt.s() > 0) {
                        switch (nyt.f()) {
                            case wi.j /*1*/:
                            case wi.l /*2*/:
                            case wi.z /*3*/:
                            case wi.h /*4*/:
                            case wi.p /*5*/:
                            case wi.s /*6*/:
                            case wi.q /*7*/:
                            case wi.m /*8*/:
                            case wi.n /*9*/:
                            case wi.dr /*10*/:
                            case wi.dB /*11*/:
                            case wi.dM /*12*/:
                            case wi.dD /*13*/:
                            case wi.g /*14*/:
                            case wi.dJ /*15*/:
                            case wi.dI /*16*/:
                            case wi.dK /*17*/:
                            case wi.dH /*18*/:
                                a++;
                                break;
                            default:
                                break;
                        }
                    }
                    if (a != 0) {
                        nyt.f(i2);
                        if (this.e == null) {
                            i2 = 0;
                        } else {
                            i2 = this.e.length;
                        }
                        Object obj3 = new int[(a + i2)];
                        if (i2 != 0) {
                            System.arraycopy(this.e, 0, obj3, 0, i2);
                        }
                        while (nyt.s() > 0) {
                            int f2 = nyt.f();
                            switch (f2) {
                                case wi.j /*1*/:
                                case wi.l /*2*/:
                                case wi.z /*3*/:
                                case wi.h /*4*/:
                                case wi.p /*5*/:
                                case wi.s /*6*/:
                                case wi.q /*7*/:
                                case wi.m /*8*/:
                                case wi.n /*9*/:
                                case wi.dr /*10*/:
                                case wi.dB /*11*/:
                                case wi.dM /*12*/:
                                case wi.dD /*13*/:
                                case wi.g /*14*/:
                                case wi.dJ /*15*/:
                                case wi.dI /*16*/:
                                case wi.dK /*17*/:
                                case wi.dH /*18*/:
                                    a = i2 + 1;
                                    obj3[i2] = f2;
                                    i2 = a;
                                    break;
                                default:
                                    break;
                            }
                        }
                        this.e = obj3;
                    }
                    nyt.e(i);
                    continue;
                case 66:
                    if (this.f == null) {
                        this.f = new krj();
                    }
                    nyt.a(this.f);
                    continue;
                case 72:
                    this.g = Boolean.valueOf(nyt.i());
                    continue;
                case 80:
                    this.h = Boolean.valueOf(nyt.i());
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
