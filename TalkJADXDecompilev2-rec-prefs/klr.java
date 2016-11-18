package p000;

public final class klr extends nyx<klr> {
    private static volatile klr[] f22285l;
    public klk f22286a;
    public String f22287b;
    public int[] f22288c;
    public Integer f22289d;
    public Integer f22290e;
    public int[] f22291f;
    public int[] f22292g;
    public Boolean f22293h;
    public klp f22294i;
    public Integer f22295j;
    public kjk f22296k;

    public /* synthetic */ nzf mo150a(nyt nyt) {
        return m26434b(nyt);
    }

    public static klr[] m26435d() {
        if (f22285l == null) {
            synchronized (nzc.c) {
                if (f22285l == null) {
                    f22285l = new klr[0];
                }
            }
        }
        return f22285l;
    }

    public klr() {
        m26436g();
    }

    private klr m26436g() {
        this.f22286a = null;
        this.f22287b = null;
        this.f22288c = nzl.a;
        this.f22291f = nzl.a;
        this.f22292g = nzl.a;
        this.f22293h = null;
        this.f22294i = null;
        this.f22296k = null;
        this.unknownFieldData = null;
        this.cachedSize = -1;
        return this;
    }

    public void mo146a(nyu nyu) {
        int i = 0;
        if (this.f22286a != null) {
            nyu.b(1, this.f22286a);
        }
        if (this.f22287b != null) {
            nyu.a(2, this.f22287b);
        }
        if (this.f22288c != null && this.f22288c.length > 0) {
            for (int a : this.f22288c) {
                nyu.a(3, a);
            }
        }
        if (this.f22289d != null) {
            nyu.a(4, this.f22289d.intValue());
        }
        if (this.f22290e != null) {
            nyu.a(5, this.f22290e.intValue());
        }
        if (this.f22291f != null && this.f22291f.length > 0) {
            for (int a2 : this.f22291f) {
                nyu.a(6, a2);
            }
        }
        if (this.f22292g != null && this.f22292g.length > 0) {
            while (i < this.f22292g.length) {
                nyu.a(7, this.f22292g[i]);
                i++;
            }
        }
        if (this.f22293h != null) {
            nyu.a(8, this.f22293h.booleanValue());
        }
        if (this.f22294i != null) {
            nyu.b(9, this.f22294i);
        }
        if (this.f22295j != null) {
            nyu.a(10, this.f22295j.intValue());
        }
        if (this.f22296k != null) {
            nyu.b(11, this.f22296k);
        }
        super.mo146a(nyu);
    }

    protected int mo147b() {
        int i;
        int i2;
        int i3 = 0;
        int b = super.mo147b();
        if (this.f22286a != null) {
            b += nyu.d(1, this.f22286a);
        }
        if (this.f22287b != null) {
            b += nyu.b(2, this.f22287b);
        }
        if (this.f22288c != null && this.f22288c.length > 0) {
            i = 0;
            for (int g : this.f22288c) {
                i += nyu.g(g);
            }
            b = (b + i) + (this.f22288c.length * 1);
        }
        if (this.f22289d != null) {
            b += nyu.f(4, this.f22289d.intValue());
        }
        if (this.f22290e != null) {
            b += nyu.f(5, this.f22290e.intValue());
        }
        if (this.f22291f != null && this.f22291f.length > 0) {
            i = 0;
            for (int g2 : this.f22291f) {
                i += nyu.g(g2);
            }
            b = (b + i) + (this.f22291f.length * 1);
        }
        if (this.f22292g != null && this.f22292g.length > 0) {
            i2 = 0;
            while (i3 < this.f22292g.length) {
                i2 += nyu.g(this.f22292g[i3]);
                i3++;
            }
            b = (b + i2) + (this.f22292g.length * 1);
        }
        if (this.f22293h != null) {
            this.f22293h.booleanValue();
            b += nyu.h(8) + 1;
        }
        if (this.f22294i != null) {
            b += nyu.d(9, this.f22294i);
        }
        if (this.f22295j != null) {
            b += nyu.f(10, this.f22295j.intValue());
        }
        if (this.f22296k != null) {
            return b + nyu.d(11, this.f22296k);
        }
        return b;
    }

    private klr m26434b(nyt nyt) {
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
                    if (this.f22286a == null) {
                        this.f22286a = new klk();
                    }
                    nyt.a(this.f22286a);
                    continue;
                case wi.dH /*18*/:
                    this.f22287b = nyt.j();
                    continue;
                case wi.dA /*24*/:
                    b = nzl.b(nyt, 24);
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
                        a = this.f22288c == null ? 0 : this.f22288c.length;
                        if (a != 0 || i2 != obj.length) {
                            obj2 = new int[(a + i2)];
                            if (a != 0) {
                                System.arraycopy(this.f22288c, 0, obj2, 0, a);
                            }
                            System.arraycopy(obj, 0, obj2, a, i2);
                            this.f22288c = obj2;
                            break;
                        }
                        this.f22288c = obj;
                        break;
                    }
                    continue;
                case wi.dx /*26*/:
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
                        if (this.f22288c == null) {
                            i2 = 0;
                        } else {
                            i2 = this.f22288c.length;
                        }
                        obj3 = new int[(a + i2)];
                        if (i2 != 0) {
                            System.arraycopy(this.f22288c, 0, obj3, 0, i2);
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
                        this.f22288c = obj3;
                    }
                    nyt.e(i);
                    continue;
                case 32:
                    a = nyt.f();
                    switch (a) {
                        case 0:
                        case 1:
                        case 2:
                            this.f22289d = Integer.valueOf(a);
                            break;
                        default:
                            continue;
                    }
                case 40:
                    a = nyt.f();
                    switch (a) {
                        case 0:
                        case 1:
                        case 2:
                        case 3:
                        case 4:
                        case 5:
                        case 6:
                        case 7:
                        case 8:
                            this.f22290e = Integer.valueOf(a);
                            break;
                        default:
                            continue;
                    }
                case 48:
                    b = nzl.b(nyt, 48);
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
                            case 2:
                            case 3:
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
                        a = this.f22291f == null ? 0 : this.f22291f.length;
                        if (a != 0 || i2 != obj.length) {
                            obj2 = new int[(a + i2)];
                            if (a != 0) {
                                System.arraycopy(this.f22291f, 0, obj2, 0, a);
                            }
                            System.arraycopy(obj, 0, obj2, a, i2);
                            this.f22291f = obj2;
                            break;
                        }
                        this.f22291f = obj;
                        break;
                    }
                    continue;
                case 50:
                    i = nyt.d(nyt.r());
                    i2 = nyt.u();
                    a = 0;
                    while (nyt.s() > 0) {
                        switch (nyt.f()) {
                            case 0:
                            case 2:
                            case 3:
                                a++;
                                break;
                            default:
                                break;
                        }
                    }
                    if (a != 0) {
                        nyt.f(i2);
                        if (this.f22291f == null) {
                            i2 = 0;
                        } else {
                            i2 = this.f22291f.length;
                        }
                        obj3 = new int[(a + i2)];
                        if (i2 != 0) {
                            System.arraycopy(this.f22291f, 0, obj3, 0, i2);
                        }
                        while (nyt.s() > 0) {
                            f2 = nyt.f();
                            switch (f2) {
                                case 0:
                                case 2:
                                case 3:
                                    a = i2 + 1;
                                    obj3[i2] = f2;
                                    i2 = a;
                                    break;
                                default:
                                    break;
                            }
                        }
                        this.f22291f = obj3;
                    }
                    nyt.e(i);
                    continue;
                case 56:
                    b = nzl.b(nyt, 56);
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
                            case 2:
                            case 3:
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
                        a = this.f22292g == null ? 0 : this.f22292g.length;
                        if (a != 0 || i2 != obj.length) {
                            obj2 = new int[(a + i2)];
                            if (a != 0) {
                                System.arraycopy(this.f22292g, 0, obj2, 0, a);
                            }
                            System.arraycopy(obj, 0, obj2, a, i2);
                            this.f22292g = obj2;
                            break;
                        }
                        this.f22292g = obj;
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
                            case 2:
                            case 3:
                                a++;
                                break;
                            default:
                                break;
                        }
                    }
                    if (a != 0) {
                        nyt.f(i2);
                        if (this.f22292g == null) {
                            i2 = 0;
                        } else {
                            i2 = this.f22292g.length;
                        }
                        obj3 = new int[(a + i2)];
                        if (i2 != 0) {
                            System.arraycopy(this.f22292g, 0, obj3, 0, i2);
                        }
                        while (nyt.s() > 0) {
                            f2 = nyt.f();
                            switch (f2) {
                                case 0:
                                case 2:
                                case 3:
                                    a = i2 + 1;
                                    obj3[i2] = f2;
                                    i2 = a;
                                    break;
                                default:
                                    break;
                            }
                        }
                        this.f22292g = obj3;
                    }
                    nyt.e(i);
                    continue;
                case 64:
                    this.f22293h = Boolean.valueOf(nyt.i());
                    continue;
                case 74:
                    if (this.f22294i == null) {
                        this.f22294i = new klp();
                    }
                    nyt.a(this.f22294i);
                    continue;
                case 80:
                    a = nyt.f();
                    switch (a) {
                        case 0:
                        case 1:
                        case 2:
                            this.f22295j = Integer.valueOf(a);
                            break;
                        default:
                            continue;
                    }
                case 90:
                    if (this.f22296k == null) {
                        this.f22296k = new kjk();
                    }
                    nyt.a(this.f22296k);
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
