package p000;

public final class mcs extends nyx<mcs> {
    private static volatile mcs[] f27363d;
    public int[] f27364a;
    public Integer f27365b;
    public Integer f27366c;

    public /* synthetic */ nzf mo150a(nyt nyt) {
        return m31758b(nyt);
    }

    public static mcs[] m31759d() {
        if (f27363d == null) {
            synchronized (nzc.c) {
                if (f27363d == null) {
                    f27363d = new mcs[0];
                }
            }
        }
        return f27363d;
    }

    public mcs() {
        m31760g();
    }

    private mcs m31760g() {
        this.f27364a = nzl.a;
        this.f27366c = null;
        this.unknownFieldData = null;
        this.cachedSize = -1;
        return this;
    }

    public void mo146a(nyu nyu) {
        if (this.f27364a != null && this.f27364a.length > 0) {
            for (int a : this.f27364a) {
                nyu.a(1, a);
            }
        }
        if (this.f27365b != null) {
            nyu.a(2, this.f27365b.intValue());
        }
        if (this.f27366c != null) {
            nyu.c(3, this.f27366c.intValue());
        }
        super.mo146a(nyu);
    }

    protected int mo147b() {
        int i = 0;
        int b = super.mo147b();
        if (this.f27364a == null || this.f27364a.length <= 0) {
            i = b;
        } else {
            int i2 = 0;
            while (i < this.f27364a.length) {
                i2 += nyu.g(this.f27364a[i]);
                i++;
            }
            i = (b + i2) + (this.f27364a.length * 1);
        }
        if (this.f27365b != null) {
            i += nyu.f(2, this.f27365b.intValue());
        }
        if (this.f27366c != null) {
            return i + nyu.g(3, this.f27366c.intValue());
        }
        return i;
    }

    private mcs m31758b(nyt nyt) {
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
                        a = this.f27364a == null ? 0 : this.f27364a.length;
                        if (a != 0 || i2 != obj.length) {
                            Object obj2 = new int[(a + i2)];
                            if (a != 0) {
                                System.arraycopy(this.f27364a, 0, obj2, 0, a);
                            }
                            System.arraycopy(obj, 0, obj2, a, i2);
                            this.f27364a = obj2;
                            break;
                        }
                        this.f27364a = obj;
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
                                a++;
                                break;
                            default:
                                break;
                        }
                    }
                    if (a != 0) {
                        nyt.f(i2);
                        if (this.f27364a == null) {
                            i2 = 0;
                        } else {
                            i2 = this.f27364a.length;
                        }
                        Object obj3 = new int[(a + i2)];
                        if (i2 != 0) {
                            System.arraycopy(this.f27364a, 0, obj3, 0, i2);
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
                        this.f27364a = obj3;
                    }
                    nyt.e(i);
                    continue;
                case 16:
                    a = nyt.f();
                    switch (a) {
                        case 0:
                        case 1:
                        case 2:
                            this.f27365b = Integer.valueOf(a);
                            break;
                        default:
                            continue;
                    }
                case wi.dA /*24*/:
                    this.f27366c = Integer.valueOf(nyt.l());
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
