package p000;

public final class ksw extends nyx<ksw> {
    public String f23167a;
    public Integer f23168b;
    public ksx[] f23169c;
    public Long f23170d;
    public kss f23171e;
    public String f23172f;
    public Boolean f23173g;
    public ksx f23174h;
    public Integer f23175i;
    public ksx[] f23176j;
    public int[] f23177k;

    public /* synthetic */ nzf mo150a(nyt nyt) {
        return m27384b(nyt);
    }

    public ksw() {
        m27385d();
    }

    private ksw m27385d() {
        this.f23167a = null;
        this.f23169c = ksx.m27390d();
        this.f23170d = null;
        this.f23171e = null;
        this.f23172f = null;
        this.f23173g = null;
        this.f23174h = null;
        this.f23176j = ksx.m27390d();
        this.f23177k = nzl.a;
        this.unknownFieldData = null;
        this.cachedSize = -1;
        return this;
    }

    public void mo146a(nyu nyu) {
        int i = 0;
        if (this.f23167a != null) {
            nyu.a(1, this.f23167a);
        }
        if (this.f23168b != null) {
            nyu.a(2, this.f23168b.intValue());
        }
        if (this.f23169c != null && this.f23169c.length > 0) {
            for (nzf nzf : this.f23169c) {
                if (nzf != null) {
                    nyu.b(3, nzf);
                }
            }
        }
        if (this.f23170d != null) {
            nyu.b(4, this.f23170d.longValue());
        }
        if (this.f23171e != null) {
            nyu.b(5, this.f23171e);
        }
        if (this.f23172f != null) {
            nyu.a(6, this.f23172f);
        }
        if (this.f23173g != null) {
            nyu.a(7, this.f23173g.booleanValue());
        }
        if (this.f23174h != null) {
            nyu.b(8, this.f23174h);
        }
        if (this.f23175i != null) {
            nyu.a(9, this.f23175i.intValue());
        }
        if (this.f23176j != null && this.f23176j.length > 0) {
            for (nzf nzf2 : this.f23176j) {
                if (nzf2 != null) {
                    nyu.b(10, nzf2);
                }
            }
        }
        if (this.f23177k != null && this.f23177k.length > 0) {
            while (i < this.f23177k.length) {
                nyu.a(11, this.f23177k[i]);
                i++;
            }
        }
        super.mo146a(nyu);
    }

    protected int mo147b() {
        int i;
        int i2 = 0;
        int b = super.mo147b();
        if (this.f23167a != null) {
            b += nyu.b(1, this.f23167a);
        }
        if (this.f23168b != null) {
            b += nyu.f(2, this.f23168b.intValue());
        }
        if (this.f23169c != null && this.f23169c.length > 0) {
            i = b;
            for (nzf nzf : this.f23169c) {
                if (nzf != null) {
                    i += nyu.d(3, nzf);
                }
            }
            b = i;
        }
        if (this.f23170d != null) {
            b += nyu.f(4, this.f23170d.longValue());
        }
        if (this.f23171e != null) {
            b += nyu.d(5, this.f23171e);
        }
        if (this.f23172f != null) {
            b += nyu.b(6, this.f23172f);
        }
        if (this.f23173g != null) {
            this.f23173g.booleanValue();
            b += nyu.h(7) + 1;
        }
        if (this.f23174h != null) {
            b += nyu.d(8, this.f23174h);
        }
        if (this.f23175i != null) {
            b += nyu.f(9, this.f23175i.intValue());
        }
        if (this.f23176j != null && this.f23176j.length > 0) {
            i = b;
            for (nzf nzf2 : this.f23176j) {
                if (nzf2 != null) {
                    i += nyu.d(10, nzf2);
                }
            }
            b = i;
        }
        if (this.f23177k == null || this.f23177k.length <= 0) {
            return b;
        }
        i = 0;
        while (i2 < this.f23177k.length) {
            i += nyu.g(this.f23177k[i2]);
            i2++;
        }
        return (b + i) + (this.f23177k.length * 1);
    }

    private ksw m27384b(nyt nyt) {
        while (true) {
            int a = nyt.a();
            int b;
            Object obj;
            int i;
            switch (a) {
                case 0:
                    break;
                case 10:
                    this.f23167a = nyt.j();
                    continue;
                case 16:
                    a = nyt.f();
                    switch (a) {
                        case 0:
                        case 1:
                        case 2:
                        case 3:
                        case 4:
                            this.f23168b = Integer.valueOf(a);
                            break;
                        default:
                            continue;
                    }
                case wi.dx /*26*/:
                    b = nzl.b(nyt, 26);
                    if (this.f23169c == null) {
                        a = 0;
                    } else {
                        a = this.f23169c.length;
                    }
                    obj = new ksx[(b + a)];
                    if (a != 0) {
                        System.arraycopy(this.f23169c, 0, obj, 0, a);
                    }
                    while (a < obj.length - 1) {
                        obj[a] = new ksx();
                        nyt.a(obj[a]);
                        nyt.a();
                        a++;
                    }
                    obj[a] = new ksx();
                    nyt.a(obj[a]);
                    this.f23169c = obj;
                    continue;
                case 32:
                    this.f23170d = Long.valueOf(nyt.e());
                    continue;
                case 42:
                    if (this.f23171e == null) {
                        this.f23171e = new kss();
                    }
                    nyt.a(this.f23171e);
                    continue;
                case 50:
                    this.f23172f = nyt.j();
                    continue;
                case 56:
                    this.f23173g = Boolean.valueOf(nyt.i());
                    continue;
                case 66:
                    if (this.f23174h == null) {
                        this.f23174h = new ksx();
                    }
                    nyt.a(this.f23174h);
                    continue;
                case 72:
                    a = nyt.f();
                    switch (a) {
                        case 0:
                        case 1:
                        case 2:
                        case 3:
                        case 4:
                            this.f23175i = Integer.valueOf(a);
                            break;
                        default:
                            continue;
                    }
                case 82:
                    b = nzl.b(nyt, 82);
                    if (this.f23176j == null) {
                        a = 0;
                    } else {
                        a = this.f23176j.length;
                    }
                    obj = new ksx[(b + a)];
                    if (a != 0) {
                        System.arraycopy(this.f23176j, 0, obj, 0, a);
                    }
                    while (a < obj.length - 1) {
                        obj[a] = new ksx();
                        nyt.a(obj[a]);
                        nyt.a();
                        a++;
                    }
                    obj[a] = new ksx();
                    nyt.a(obj[a]);
                    this.f23176j = obj;
                    continue;
                case 88:
                    int b2 = nzl.b(nyt, 88);
                    Object obj2 = new int[b2];
                    i = 0;
                    b = 0;
                    while (i < b2) {
                        if (i != 0) {
                            nyt.a();
                        }
                        int f = nyt.f();
                        switch (f) {
                            case 0:
                            case 1:
                                a = b + 1;
                                obj2[b] = f;
                                break;
                            default:
                                a = b;
                                break;
                        }
                        i++;
                        b = a;
                    }
                    if (b != 0) {
                        a = this.f23177k == null ? 0 : this.f23177k.length;
                        if (a != 0 || b != obj2.length) {
                            Object obj3 = new int[(a + b)];
                            if (a != 0) {
                                System.arraycopy(this.f23177k, 0, obj3, 0, a);
                            }
                            System.arraycopy(obj2, 0, obj3, a, b);
                            this.f23177k = obj3;
                            break;
                        }
                        this.f23177k = obj2;
                        break;
                    }
                    continue;
                case 90:
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
                        if (this.f23177k == null) {
                            b = 0;
                        } else {
                            b = this.f23177k.length;
                        }
                        Object obj4 = new int[(a + b)];
                        if (b != 0) {
                            System.arraycopy(this.f23177k, 0, obj4, 0, b);
                        }
                        while (nyt.s() > 0) {
                            int f2 = nyt.f();
                            switch (f2) {
                                case 0:
                                case 1:
                                    a = b + 1;
                                    obj4[b] = f2;
                                    b = a;
                                    break;
                                default:
                                    break;
                            }
                        }
                        this.f23177k = obj4;
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
