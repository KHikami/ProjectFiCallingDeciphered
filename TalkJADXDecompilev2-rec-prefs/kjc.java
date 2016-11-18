package p000;

public final class kjc extends nyx<kjc> {
    public String f21901a;
    public Integer f21902b;
    public Integer f21903c;
    public kjf f21904d;
    public String[] f21905e;
    public kiw f21906f;
    public int[] f21907g;
    public kjb f21908h;
    public kjh f21909i;
    public int[] f21910j;
    public kje f21911k;
    public kjd f21912l;
    public kit f21913m;

    public /* synthetic */ nzf mo150a(nyt nyt) {
        return m26056b(nyt);
    }

    public kjc() {
        m26057d();
    }

    private kjc m26057d() {
        this.f21901a = null;
        this.f21904d = null;
        this.f21905e = nzl.f;
        this.f21906f = null;
        this.f21907g = nzl.a;
        this.f21908h = null;
        this.f21909i = null;
        this.f21910j = nzl.a;
        this.f21911k = null;
        this.f21912l = null;
        this.f21913m = null;
        this.unknownFieldData = null;
        this.cachedSize = -1;
        return this;
    }

    public void mo146a(nyu nyu) {
        int i = 0;
        nyu.a(1, this.f21901a);
        nyu.a(2, this.f21902b.intValue());
        if (this.f21903c != null) {
            nyu.a(3, this.f21903c.intValue());
        }
        if (this.f21904d != null) {
            nyu.b(4, this.f21904d);
        }
        if (this.f21905e != null && this.f21905e.length > 0) {
            for (String str : this.f21905e) {
                if (str != null) {
                    nyu.a(5, str);
                }
            }
        }
        if (this.f21906f != null) {
            nyu.b(6, this.f21906f);
        }
        if (this.f21907g != null && this.f21907g.length > 0) {
            for (int a : this.f21907g) {
                nyu.a(7, a);
            }
        }
        if (this.f21908h != null) {
            nyu.b(8, this.f21908h);
        }
        if (this.f21909i != null) {
            nyu.b(9, this.f21909i);
        }
        if (this.f21910j != null && this.f21910j.length > 0) {
            while (i < this.f21910j.length) {
                nyu.a(10, this.f21910j[i]);
                i++;
            }
        }
        if (this.f21911k != null) {
            nyu.b(11, this.f21911k);
        }
        if (this.f21912l != null) {
            nyu.b(12, this.f21912l);
        }
        if (this.f21913m != null) {
            nyu.b(13, this.f21913m);
        }
        super.mo146a(nyu);
    }

    protected int mo147b() {
        int i;
        int i2;
        int i3;
        int i4 = 0;
        int b = (super.mo147b() + nyu.b(1, this.f21901a)) + nyu.f(2, this.f21902b.intValue());
        if (this.f21903c != null) {
            b += nyu.f(3, this.f21903c.intValue());
        }
        if (this.f21904d != null) {
            b += nyu.d(4, this.f21904d);
        }
        if (this.f21905e != null && this.f21905e.length > 0) {
            i = 0;
            i2 = 0;
            for (String str : this.f21905e) {
                if (str != null) {
                    i2++;
                    i += nyu.b(str);
                }
            }
            b = (b + i) + (i2 * 1);
        }
        if (this.f21906f != null) {
            b += nyu.d(6, this.f21906f);
        }
        if (this.f21907g != null && this.f21907g.length > 0) {
            i = 0;
            for (int i22 : this.f21907g) {
                i += nyu.g(i22);
            }
            b = (b + i) + (this.f21907g.length * 1);
        }
        if (this.f21908h != null) {
            b += nyu.d(8, this.f21908h);
        }
        if (this.f21909i != null) {
            b += nyu.d(9, this.f21909i);
        }
        if (this.f21910j != null && this.f21910j.length > 0) {
            i3 = 0;
            while (i4 < this.f21910j.length) {
                i3 += nyu.g(this.f21910j[i4]);
                i4++;
            }
            b = (b + i3) + (this.f21910j.length * 1);
        }
        if (this.f21911k != null) {
            b += nyu.d(11, this.f21911k);
        }
        if (this.f21912l != null) {
            b += nyu.d(12, this.f21912l);
        }
        if (this.f21913m != null) {
            return b + nyu.d(13, this.f21913m);
        }
        return b;
    }

    private kjc m26056b(nyt nyt) {
        while (true) {
            int a = nyt.a();
            int b;
            int b2;
            Object obj;
            int i;
            int f;
            Object obj2;
            Object obj3;
            int f2;
            switch (a) {
                case 0:
                    break;
                case 10:
                    this.f21901a = nyt.j();
                    continue;
                case 16:
                    a = nyt.f();
                    switch (a) {
                        case 1:
                        case 2:
                        case 3:
                            this.f21902b = Integer.valueOf(a);
                            break;
                        default:
                            continue;
                    }
                case wi.dA /*24*/:
                    a = nyt.f();
                    switch (a) {
                        case 0:
                        case 1:
                            this.f21903c = Integer.valueOf(a);
                            break;
                        default:
                            continue;
                    }
                case 34:
                    if (this.f21904d == null) {
                        this.f21904d = new kjf();
                    }
                    nyt.a(this.f21904d);
                    continue;
                case 42:
                    b = nzl.b(nyt, 42);
                    a = this.f21905e == null ? 0 : this.f21905e.length;
                    Object obj4 = new String[(b + a)];
                    if (a != 0) {
                        System.arraycopy(this.f21905e, 0, obj4, 0, a);
                    }
                    while (a < obj4.length - 1) {
                        obj4[a] = nyt.j();
                        nyt.a();
                        a++;
                    }
                    obj4[a] = nyt.j();
                    this.f21905e = obj4;
                    continue;
                case 50:
                    if (this.f21906f == null) {
                        this.f21906f = new kiw();
                    }
                    nyt.a(this.f21906f);
                    continue;
                case 56:
                    b2 = nzl.b(nyt, 56);
                    obj = new int[b2];
                    i = 0;
                    b = 0;
                    while (i < b2) {
                        if (i != 0) {
                            nyt.a();
                        }
                        f = nyt.f();
                        switch (f) {
                            case 0:
                            case 1:
                            case 2:
                            case 3:
                                a = b + 1;
                                obj[b] = f;
                                break;
                            default:
                                a = b;
                                break;
                        }
                        i++;
                        b = a;
                    }
                    if (b != 0) {
                        a = this.f21907g == null ? 0 : this.f21907g.length;
                        if (a != 0 || b != obj.length) {
                            obj2 = new int[(a + b)];
                            if (a != 0) {
                                System.arraycopy(this.f21907g, 0, obj2, 0, a);
                            }
                            System.arraycopy(obj, 0, obj2, a, b);
                            this.f21907g = obj2;
                            break;
                        }
                        this.f21907g = obj;
                        break;
                    }
                    continue;
                case 58:
                    i = nyt.d(nyt.r());
                    b = nyt.u();
                    a = 0;
                    while (nyt.s() > 0) {
                        switch (nyt.f()) {
                            case 0:
                            case 1:
                            case 2:
                            case 3:
                                a++;
                                break;
                            default:
                                break;
                        }
                    }
                    if (a != 0) {
                        nyt.f(b);
                        if (this.f21907g == null) {
                            b = 0;
                        } else {
                            b = this.f21907g.length;
                        }
                        obj3 = new int[(a + b)];
                        if (b != 0) {
                            System.arraycopy(this.f21907g, 0, obj3, 0, b);
                        }
                        while (nyt.s() > 0) {
                            f2 = nyt.f();
                            switch (f2) {
                                case 0:
                                case 1:
                                case 2:
                                case 3:
                                    a = b + 1;
                                    obj3[b] = f2;
                                    b = a;
                                    break;
                                default:
                                    break;
                            }
                        }
                        this.f21907g = obj3;
                    }
                    nyt.e(i);
                    continue;
                case 66:
                    if (this.f21908h == null) {
                        this.f21908h = new kjb();
                    }
                    nyt.a(this.f21908h);
                    continue;
                case 74:
                    if (this.f21909i == null) {
                        this.f21909i = new kjh();
                    }
                    nyt.a(this.f21909i);
                    continue;
                case 80:
                    b2 = nzl.b(nyt, 80);
                    obj = new int[b2];
                    i = 0;
                    b = 0;
                    while (i < b2) {
                        if (i != 0) {
                            nyt.a();
                        }
                        f = nyt.f();
                        switch (f) {
                            case 0:
                            case 1:
                                a = b + 1;
                                obj[b] = f;
                                break;
                            default:
                                a = b;
                                break;
                        }
                        i++;
                        b = a;
                    }
                    if (b != 0) {
                        a = this.f21910j == null ? 0 : this.f21910j.length;
                        if (a != 0 || b != obj.length) {
                            obj2 = new int[(a + b)];
                            if (a != 0) {
                                System.arraycopy(this.f21910j, 0, obj2, 0, a);
                            }
                            System.arraycopy(obj, 0, obj2, a, b);
                            this.f21910j = obj2;
                            break;
                        }
                        this.f21910j = obj;
                        break;
                    }
                    continue;
                case 82:
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
                        if (this.f21910j == null) {
                            b = 0;
                        } else {
                            b = this.f21910j.length;
                        }
                        obj3 = new int[(a + b)];
                        if (b != 0) {
                            System.arraycopy(this.f21910j, 0, obj3, 0, b);
                        }
                        while (nyt.s() > 0) {
                            f2 = nyt.f();
                            switch (f2) {
                                case 0:
                                case 1:
                                    a = b + 1;
                                    obj3[b] = f2;
                                    b = a;
                                    break;
                                default:
                                    break;
                            }
                        }
                        this.f21910j = obj3;
                    }
                    nyt.e(i);
                    continue;
                case 90:
                    if (this.f21911k == null) {
                        this.f21911k = new kje();
                    }
                    nyt.a(this.f21911k);
                    continue;
                case 98:
                    if (this.f21912l == null) {
                        this.f21912l = new kjd();
                    }
                    nyt.a(this.f21912l);
                    continue;
                case 106:
                    if (this.f21913m == null) {
                        this.f21913m = new kit();
                    }
                    nyt.a(this.f21913m);
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
