package p000;

public final class krk extends nyx<krk> {
    public Integer f22900a;
    public Integer f22901b;
    public Integer f22902c;
    public Long f22903d;
    public int[] f22904e;
    public krj f22905f;
    public Boolean f22906g;
    public Boolean f22907h;

    public /* synthetic */ nzf mo150a(nyt nyt) {
        return m27199b(nyt);
    }

    public krk() {
        m27200d();
    }

    private krk m27200d() {
        this.f22901b = null;
        this.f22903d = null;
        this.f22904e = nzl.a;
        this.f22905f = null;
        this.f22906g = null;
        this.f22907h = null;
        this.unknownFieldData = null;
        this.cachedSize = -1;
        return this;
    }

    public void mo146a(nyu nyu) {
        if (this.f22900a != null) {
            nyu.a(1, this.f22900a.intValue());
        }
        if (this.f22901b != null) {
            nyu.a(3, this.f22901b.intValue());
        }
        if (this.f22902c != null) {
            nyu.a(4, this.f22902c.intValue());
        }
        if (this.f22903d != null) {
            nyu.b(5, this.f22903d.longValue());
        }
        if (this.f22904e != null && this.f22904e.length > 0) {
            for (int a : this.f22904e) {
                nyu.a(6, a);
            }
        }
        if (this.f22905f != null) {
            nyu.b(8, this.f22905f);
        }
        if (this.f22906g != null) {
            nyu.a(9, this.f22906g.booleanValue());
        }
        if (this.f22907h != null) {
            nyu.a(10, this.f22907h.booleanValue());
        }
        super.mo146a(nyu);
    }

    protected int mo147b() {
        int i = 0;
        int b = super.mo147b();
        if (this.f22900a != null) {
            b += nyu.f(1, this.f22900a.intValue());
        }
        if (this.f22901b != null) {
            b += nyu.f(3, this.f22901b.intValue());
        }
        if (this.f22902c != null) {
            b += nyu.f(4, this.f22902c.intValue());
        }
        if (this.f22903d != null) {
            b += nyu.f(5, this.f22903d.longValue());
        }
        if (this.f22904e != null && this.f22904e.length > 0) {
            int i2 = 0;
            while (i < this.f22904e.length) {
                i2 += nyu.g(this.f22904e[i]);
                i++;
            }
            b = (b + i2) + (this.f22904e.length * 1);
        }
        if (this.f22905f != null) {
            b += nyu.d(8, this.f22905f);
        }
        if (this.f22906g != null) {
            this.f22906g.booleanValue();
            b += nyu.h(9) + 1;
        }
        if (this.f22907h == null) {
            return b;
        }
        this.f22907h.booleanValue();
        return b + (nyu.h(10) + 1);
    }

    private krk m27199b(nyt nyt) {
        while (true) {
            int a = nyt.a();
            int i;
            int i2;
            switch (a) {
                case 0:
                    break;
                case 8:
                    a = nyt.f();
                    switch (a) {
                        case 1:
                        case 2:
                        case 3:
                        case 4:
                            this.f22900a = Integer.valueOf(a);
                            break;
                        default:
                            continue;
                    }
                case wi.dA /*24*/:
                    this.f22901b = Integer.valueOf(nyt.f());
                    continue;
                case 32:
                    a = nyt.f();
                    switch (a) {
                        case 0:
                        case 1:
                        case 2:
                        case 3:
                            this.f22902c = Integer.valueOf(a);
                            break;
                        default:
                            continue;
                    }
                case 40:
                    this.f22903d = Long.valueOf(nyt.e());
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
                        a = this.f22904e == null ? 0 : this.f22904e.length;
                        if (a != 0 || i2 != obj.length) {
                            Object obj2 = new int[(a + i2)];
                            if (a != 0) {
                                System.arraycopy(this.f22904e, 0, obj2, 0, a);
                            }
                            System.arraycopy(obj, 0, obj2, a, i2);
                            this.f22904e = obj2;
                            break;
                        }
                        this.f22904e = obj;
                        break;
                    }
                    continue;
                case 50:
                    i = nyt.d(nyt.r());
                    i2 = nyt.u();
                    a = 0;
                    while (nyt.s() > 0) {
                        switch (nyt.f()) {
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
                                a++;
                                break;
                            default:
                                break;
                        }
                    }
                    if (a != 0) {
                        nyt.f(i2);
                        if (this.f22904e == null) {
                            i2 = 0;
                        } else {
                            i2 = this.f22904e.length;
                        }
                        Object obj3 = new int[(a + i2)];
                        if (i2 != 0) {
                            System.arraycopy(this.f22904e, 0, obj3, 0, i2);
                        }
                        while (nyt.s() > 0) {
                            int f2 = nyt.f();
                            switch (f2) {
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
                                    a = i2 + 1;
                                    obj3[i2] = f2;
                                    i2 = a;
                                    break;
                                default:
                                    break;
                            }
                        }
                        this.f22904e = obj3;
                    }
                    nyt.e(i);
                    continue;
                case 66:
                    if (this.f22905f == null) {
                        this.f22905f = new krj();
                    }
                    nyt.a(this.f22905f);
                    continue;
                case 72:
                    this.f22906g = Boolean.valueOf(nyt.i());
                    continue;
                case 80:
                    this.f22907h = Boolean.valueOf(nyt.i());
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
