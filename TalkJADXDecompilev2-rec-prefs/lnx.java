package p000;

public final class lnx extends nyx<lnx> {
    public Boolean f25834a;
    public Boolean f25835b;
    public Integer f25836c;
    public int[] f25837d;

    public /* synthetic */ nzf mo150a(nyt nyt) {
        return m29684b(nyt);
    }

    public lnx() {
        m29685d();
    }

    private lnx m29685d() {
        this.f25834a = null;
        this.f25835b = null;
        this.f25836c = null;
        this.f25837d = nzl.a;
        this.unknownFieldData = null;
        this.cachedSize = -1;
        return this;
    }

    public void mo146a(nyu nyu) {
        if (this.f25834a != null) {
            nyu.a(1, this.f25834a.booleanValue());
        }
        if (this.f25835b != null) {
            nyu.a(2, this.f25835b.booleanValue());
        }
        if (this.f25836c != null) {
            nyu.a(3, this.f25836c.intValue());
        }
        if (this.f25837d != null && this.f25837d.length > 0) {
            for (int a : this.f25837d) {
                nyu.a(4, a);
            }
        }
        super.mo146a(nyu);
    }

    protected int mo147b() {
        int i = 0;
        int b = super.mo147b();
        if (this.f25834a != null) {
            this.f25834a.booleanValue();
            b += nyu.h(1) + 1;
        }
        if (this.f25835b != null) {
            this.f25835b.booleanValue();
            b += nyu.h(2) + 1;
        }
        if (this.f25836c != null) {
            b += nyu.f(3, this.f25836c.intValue());
        }
        if (this.f25837d == null || this.f25837d.length <= 0) {
            return b;
        }
        int i2 = 0;
        while (i < this.f25837d.length) {
            i2 += nyu.g(this.f25837d[i]);
            i++;
        }
        return (b + i2) + (this.f25837d.length * 1);
    }

    private lnx m29684b(nyt nyt) {
        while (true) {
            int a = nyt.a();
            int i;
            int i2;
            switch (a) {
                case 0:
                    break;
                case 8:
                    this.f25834a = Boolean.valueOf(nyt.i());
                    continue;
                case 16:
                    this.f25835b = Boolean.valueOf(nyt.i());
                    continue;
                case wi.dA /*24*/:
                    this.f25836c = Integer.valueOf(nyt.f());
                    continue;
                case 32:
                    int b = nzl.b(nyt, 32);
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
                        a = this.f25837d == null ? 0 : this.f25837d.length;
                        if (a != 0 || i2 != obj.length) {
                            Object obj2 = new int[(a + i2)];
                            if (a != 0) {
                                System.arraycopy(this.f25837d, 0, obj2, 0, a);
                            }
                            System.arraycopy(obj, 0, obj2, a, i2);
                            this.f25837d = obj2;
                            break;
                        }
                        this.f25837d = obj;
                        break;
                    }
                    continue;
                case 34:
                    i = nyt.d(nyt.r());
                    i2 = nyt.u();
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
                        nyt.f(i2);
                        if (this.f25837d == null) {
                            i2 = 0;
                        } else {
                            i2 = this.f25837d.length;
                        }
                        Object obj3 = new int[(a + i2)];
                        if (i2 != 0) {
                            System.arraycopy(this.f25837d, 0, obj3, 0, i2);
                        }
                        while (nyt.s() > 0) {
                            int f2 = nyt.f();
                            switch (f2) {
                                case 0:
                                case 1:
                                    a = i2 + 1;
                                    obj3[i2] = f2;
                                    i2 = a;
                                    break;
                                default:
                                    break;
                            }
                        }
                        this.f25837d = obj3;
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
