package defpackage;

public final class kop extends nyx<kop> {
    public String a;
    public Boolean b;
    public int[] c;
    public Integer d;
    public Integer e;
    public Integer f;
    public Integer g;
    public String h;
    public Boolean i;
    public Boolean j;
    public Boolean k;

    public /* synthetic */ nzf a(nyt nyt) {
        return b(nyt);
    }

    public kop() {
        d();
    }

    private kop d() {
        this.a = null;
        this.b = null;
        this.c = nzl.a;
        this.d = null;
        this.e = null;
        this.f = null;
        this.h = null;
        this.i = null;
        this.j = null;
        this.k = null;
        this.unknownFieldData = null;
        this.cachedSize = -1;
        return this;
    }

    public void a(nyu nyu) {
        if (this.a != null) {
            nyu.a(1, this.a);
        }
        if (this.b != null) {
            nyu.a(2, this.b.booleanValue());
        }
        if (this.c != null && this.c.length > 0) {
            for (int a : this.c) {
                nyu.a(3, a);
            }
        }
        if (this.d != null) {
            nyu.a(4, this.d.intValue());
        }
        if (this.e != null) {
            nyu.a(5, this.e.intValue());
        }
        if (this.f != null) {
            nyu.a(6, this.f.intValue());
        }
        if (this.g != null) {
            nyu.a(7, this.g.intValue());
        }
        if (this.h != null) {
            nyu.a(8, this.h);
        }
        if (this.i != null) {
            nyu.a(9, this.i.booleanValue());
        }
        if (this.j != null) {
            nyu.a(10, this.j.booleanValue());
        }
        if (this.k != null) {
            nyu.a(11, this.k.booleanValue());
        }
        super.a(nyu);
    }

    protected int b() {
        int i = 0;
        int b = super.b();
        if (this.a != null) {
            b += nyu.b(1, this.a);
        }
        if (this.b != null) {
            this.b.booleanValue();
            b += nyu.h(2) + 1;
        }
        if (this.c != null && this.c.length > 0) {
            int i2 = 0;
            while (i < this.c.length) {
                i2 += nyu.g(this.c[i]);
                i++;
            }
            b = (b + i2) + (this.c.length * 1);
        }
        if (this.d != null) {
            b += nyu.f(4, this.d.intValue());
        }
        if (this.e != null) {
            b += nyu.f(5, this.e.intValue());
        }
        if (this.f != null) {
            b += nyu.f(6, this.f.intValue());
        }
        if (this.g != null) {
            b += nyu.f(7, this.g.intValue());
        }
        if (this.h != null) {
            b += nyu.b(8, this.h);
        }
        if (this.i != null) {
            this.i.booleanValue();
            b += nyu.h(9) + 1;
        }
        if (this.j != null) {
            this.j.booleanValue();
            b += nyu.h(10) + 1;
        }
        if (this.k == null) {
            return b;
        }
        this.k.booleanValue();
        return b + (nyu.h(11) + 1);
    }

    private kop b(nyt nyt) {
        while (true) {
            int a = nyt.a();
            int i;
            int i2;
            switch (a) {
                case 0:
                    break;
                case 10:
                    this.a = nyt.j();
                    continue;
                case 16:
                    this.b = Boolean.valueOf(nyt.i());
                    continue;
                case wi.dA /*24*/:
                    int b = nzl.b(nyt, 24);
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
                        a = this.c == null ? 0 : this.c.length;
                        if (a != 0 || i2 != obj.length) {
                            Object obj2 = new int[(a + i2)];
                            if (a != 0) {
                                System.arraycopy(this.c, 0, obj2, 0, a);
                            }
                            System.arraycopy(obj, 0, obj2, a, i2);
                            this.c = obj2;
                            break;
                        }
                        this.c = obj;
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
                            case 8:
                                a++;
                                break;
                            default:
                                break;
                        }
                    }
                    if (a != 0) {
                        nyt.f(i2);
                        if (this.c == null) {
                            i2 = 0;
                        } else {
                            i2 = this.c.length;
                        }
                        Object obj3 = new int[(a + i2)];
                        if (i2 != 0) {
                            System.arraycopy(this.c, 0, obj3, 0, i2);
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
                                    a = i2 + 1;
                                    obj3[i2] = f2;
                                    i2 = a;
                                    break;
                                default:
                                    break;
                            }
                        }
                        this.c = obj3;
                    }
                    nyt.e(i);
                    continue;
                case 32:
                    this.d = Integer.valueOf(nyt.f());
                    continue;
                case 40:
                    this.e = Integer.valueOf(nyt.f());
                    continue;
                case 48:
                    this.f = Integer.valueOf(nyt.f());
                    continue;
                case 56:
                    a = nyt.f();
                    switch (a) {
                        case 0:
                        case 1:
                        case 2:
                        case 3:
                            this.g = Integer.valueOf(a);
                            break;
                        default:
                            continue;
                    }
                case 66:
                    this.h = nyt.j();
                    continue;
                case 72:
                    this.i = Boolean.valueOf(nyt.i());
                    continue;
                case 80:
                    this.j = Boolean.valueOf(nyt.i());
                    continue;
                case 88:
                    this.k = Boolean.valueOf(nyt.i());
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
