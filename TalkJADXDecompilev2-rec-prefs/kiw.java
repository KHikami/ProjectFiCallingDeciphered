package p000;

public final class kiw extends nyx<kiw> {
    public int[] f21886a;
    public Integer f21887b;
    public kiy f21888c;
    public Integer f21889d;
    public Integer f21890e;
    public Integer f21891f;
    public kja f21892g;
    public kiu f21893h;

    public /* synthetic */ nzf mo150a(nyt nyt) {
        return m26025b(nyt);
    }

    public kiw() {
        m26026d();
    }

    private kiw m26026d() {
        this.f21886a = nzl.a;
        this.f21888c = null;
        this.f21892g = null;
        this.f21893h = null;
        this.unknownFieldData = null;
        this.cachedSize = -1;
        return this;
    }

    public void mo146a(nyu nyu) {
        if (this.f21886a != null && this.f21886a.length > 0) {
            for (int a : this.f21886a) {
                nyu.a(7, a);
            }
        }
        if (this.f21887b != null) {
            nyu.a(8, this.f21887b.intValue());
        }
        if (this.f21888c != null) {
            nyu.b(14, this.f21888c);
        }
        if (this.f21889d != null) {
            nyu.a(15, this.f21889d.intValue());
        }
        if (this.f21890e != null) {
            nyu.a(16, this.f21890e.intValue());
        }
        if (this.f21891f != null) {
            nyu.a(17, this.f21891f.intValue());
        }
        if (this.f21892g != null) {
            nyu.b(18, this.f21892g);
        }
        if (this.f21893h != null) {
            nyu.b(19, this.f21893h);
        }
        super.mo146a(nyu);
    }

    protected int mo147b() {
        int i = 0;
        int b = super.mo147b();
        if (this.f21886a == null || this.f21886a.length <= 0) {
            i = b;
        } else {
            int i2 = 0;
            while (i < this.f21886a.length) {
                i2 += nyu.g(this.f21886a[i]);
                i++;
            }
            i = (b + i2) + (this.f21886a.length * 1);
        }
        if (this.f21887b != null) {
            i += nyu.f(8, this.f21887b.intValue());
        }
        if (this.f21888c != null) {
            i += nyu.d(14, this.f21888c);
        }
        if (this.f21889d != null) {
            i += nyu.f(15, this.f21889d.intValue());
        }
        if (this.f21890e != null) {
            i += nyu.f(16, this.f21890e.intValue());
        }
        if (this.f21891f != null) {
            i += nyu.f(17, this.f21891f.intValue());
        }
        if (this.f21892g != null) {
            i += nyu.d(18, this.f21892g);
        }
        if (this.f21893h != null) {
            return i + nyu.d(19, this.f21893h);
        }
        return i;
    }

    private kiw m26025b(nyt nyt) {
        while (true) {
            int a = nyt.a();
            int i;
            int i2;
            switch (a) {
                case 0:
                    break;
                case 56:
                    int b = nzl.b(nyt, 56);
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
                            case 8:
                            case 9:
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
                        a = this.f21886a == null ? 0 : this.f21886a.length;
                        if (a != 0 || i2 != obj.length) {
                            Object obj2 = new int[(a + i2)];
                            if (a != 0) {
                                System.arraycopy(this.f21886a, 0, obj2, 0, a);
                            }
                            System.arraycopy(obj, 0, obj2, a, i2);
                            this.f21886a = obj2;
                            break;
                        }
                        this.f21886a = obj;
                        break;
                    }
                    continue;
                case 58:
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
                            case 8:
                            case 9:
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
                                a++;
                                break;
                            default:
                                break;
                        }
                    }
                    if (a != 0) {
                        nyt.f(i2);
                        if (this.f21886a == null) {
                            i2 = 0;
                        } else {
                            i2 = this.f21886a.length;
                        }
                        Object obj3 = new int[(a + i2)];
                        if (i2 != 0) {
                            System.arraycopy(this.f21886a, 0, obj3, 0, i2);
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
                                case 8:
                                case 9:
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
                                    a = i2 + 1;
                                    obj3[i2] = f2;
                                    i2 = a;
                                    break;
                                default:
                                    break;
                            }
                        }
                        this.f21886a = obj3;
                    }
                    nyt.e(i);
                    continue;
                case 64:
                    a = nyt.f();
                    switch (a) {
                        case 0:
                        case 1:
                            this.f21887b = Integer.valueOf(a);
                            break;
                        default:
                            continue;
                    }
                case 114:
                    if (this.f21888c == null) {
                        this.f21888c = new kiy();
                    }
                    nyt.a(this.f21888c);
                    continue;
                case 120:
                    a = nyt.f();
                    switch (a) {
                        case 0:
                        case 1:
                        case 2:
                            this.f21889d = Integer.valueOf(a);
                            break;
                        default:
                            continue;
                    }
                case 128:
                    a = nyt.f();
                    switch (a) {
                        case 0:
                        case 1:
                        case 2:
                            this.f21890e = Integer.valueOf(a);
                            break;
                        default:
                            continue;
                    }
                case 136:
                    a = nyt.f();
                    switch (a) {
                        case 0:
                        case 1:
                        case 2:
                        case 3:
                            this.f21891f = Integer.valueOf(a);
                            break;
                        default:
                            continue;
                    }
                case 146:
                    if (this.f21892g == null) {
                        this.f21892g = new kja();
                    }
                    nyt.a(this.f21892g);
                    continue;
                case 154:
                    if (this.f21893h == null) {
                        this.f21893h = new kiu();
                    }
                    nyt.a(this.f21893h);
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
