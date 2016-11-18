package defpackage;

public final class pbs extends nyx<pbs> {
    public pbt a;
    public pbt[] b;
    public pbu c;
    public int[] d;

    public /* synthetic */ nzf a(nyt nyt) {
        return b(nyt);
    }

    public pbs() {
        this.b = pbt.d();
        this.d = nzl.a;
        this.cachedSize = -1;
    }

    public void a(nyu nyu) {
        int i = 0;
        if (this.a != null) {
            nyu.b(1, this.a);
        }
        if (this.c != null) {
            nyu.b(2, this.c);
        }
        if (this.d != null && this.d.length > 0) {
            for (int a : this.d) {
                nyu.a(3, a);
            }
        }
        if (this.b != null && this.b.length > 0) {
            while (i < this.b.length) {
                nzf nzf = this.b[i];
                if (nzf != null) {
                    nyu.b(4, nzf);
                }
                i++;
            }
        }
        super.a(nyu);
    }

    protected int b() {
        int i = 0;
        int b = super.b();
        if (this.a != null) {
            b += nyu.d(1, this.a);
        }
        if (this.c != null) {
            b += nyu.d(2, this.c);
        }
        if (this.d != null && this.d.length > 0) {
            int i2 = 0;
            for (int g : this.d) {
                i2 += nyu.g(g);
            }
            b = (b + i2) + (this.d.length * 1);
        }
        if (this.b != null && this.b.length > 0) {
            while (i < this.b.length) {
                nzf nzf = this.b[i];
                if (nzf != null) {
                    b += nyu.d(4, nzf);
                }
                i++;
            }
        }
        return b;
    }

    private pbs b(nyt nyt) {
        while (true) {
            int a = nyt.a();
            int i;
            int i2;
            switch (a) {
                case 0:
                    break;
                case 10:
                    if (this.a == null) {
                        this.a = new pbt();
                    }
                    nyt.a(this.a);
                    continue;
                case wi.dH /*18*/:
                    if (this.c == null) {
                        this.c = new pbu();
                    }
                    nyt.a(this.c);
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
                            Object obj2 = new int[(a + i2)];
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
                        Object obj3 = new int[(a + i2)];
                        if (i2 != 0) {
                            System.arraycopy(this.d, 0, obj3, 0, i2);
                        }
                        while (nyt.s() > 0) {
                            int f2 = nyt.f();
                            switch (f2) {
                                case 0:
                                case 1:
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
                        this.d = obj3;
                    }
                    nyt.e(i);
                    continue;
                case 34:
                    i2 = nzl.b(nyt, 34);
                    if (this.b == null) {
                        a = 0;
                    } else {
                        a = this.b.length;
                    }
                    Object obj4 = new pbt[(i2 + a)];
                    if (a != 0) {
                        System.arraycopy(this.b, 0, obj4, 0, a);
                    }
                    while (a < obj4.length - 1) {
                        obj4[a] = new pbt();
                        nyt.a(obj4[a]);
                        nyt.a();
                        a++;
                    }
                    obj4[a] = new pbt();
                    nyt.a(obj4[a]);
                    this.b = obj4;
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
