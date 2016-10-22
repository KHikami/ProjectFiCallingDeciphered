public final class klx extends nyx<klx> {
    private static volatile klx[] c;
    public klk a;
    public int[] b;

    public /* synthetic */ nzf a(nyt nyt) {
        return b(nyt);
    }

    public static klx[] d() {
        if (c == null) {
            synchronized (nzc.c) {
                if (c == null) {
                    c = new klx[0];
                }
            }
        }
        return c;
    }

    public klx() {
        g();
    }

    private klx g() {
        this.a = null;
        this.b = nzl.a;
        this.unknownFieldData = null;
        this.cachedSize = -1;
        return this;
    }

    public void a(nyu nyu) {
        if (this.a != null) {
            nyu.b(1, this.a);
        }
        if (this.b != null && this.b.length > 0) {
            for (int a : this.b) {
                nyu.a(2, a);
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
        if (this.b == null || this.b.length <= 0) {
            return b;
        }
        int i2 = 0;
        while (i < this.b.length) {
            i2 += nyu.g(this.b[i]);
            i++;
        }
        return (b + i2) + (this.b.length * 1);
    }

    private klx b(nyt nyt) {
        while (true) {
            int a = nyt.a();
            int i;
            int i2;
            switch (a) {
                case wi.w /*0*/:
                    break;
                case wi.dr /*10*/:
                    if (this.a == null) {
                        this.a = new klk();
                    }
                    nyt.a(this.a);
                    continue;
                case wi.dI /*16*/:
                    int b = nzl.b(nyt, 16);
                    Object obj = new int[b];
                    i = 0;
                    i2 = 0;
                    while (i < b) {
                        if (i != 0) {
                            nyt.a();
                        }
                        int f = nyt.f();
                        switch (f) {
                            case wi.w /*0*/:
                            case wi.j /*1*/:
                            case wi.l /*2*/:
                            case wi.z /*3*/:
                            case wi.h /*4*/:
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
                        a = this.b == null ? 0 : this.b.length;
                        if (a != 0 || i2 != obj.length) {
                            Object obj2 = new int[(a + i2)];
                            if (a != 0) {
                                System.arraycopy(this.b, 0, obj2, 0, a);
                            }
                            System.arraycopy(obj, 0, obj2, a, i2);
                            this.b = obj2;
                            break;
                        }
                        this.b = obj;
                        break;
                    }
                    continue;
                case wi.dH /*18*/:
                    i = nyt.d(nyt.r());
                    i2 = nyt.u();
                    a = 0;
                    while (nyt.s() > 0) {
                        switch (nyt.f()) {
                            case wi.w /*0*/:
                            case wi.j /*1*/:
                            case wi.l /*2*/:
                            case wi.z /*3*/:
                            case wi.h /*4*/:
                                a++;
                                break;
                            default:
                                break;
                        }
                    }
                    if (a != 0) {
                        nyt.f(i2);
                        if (this.b == null) {
                            i2 = 0;
                        } else {
                            i2 = this.b.length;
                        }
                        Object obj3 = new int[(a + i2)];
                        if (i2 != 0) {
                            System.arraycopy(this.b, 0, obj3, 0, i2);
                        }
                        while (nyt.s() > 0) {
                            int f2 = nyt.f();
                            switch (f2) {
                                case wi.w /*0*/:
                                case wi.j /*1*/:
                                case wi.l /*2*/:
                                case wi.z /*3*/:
                                case wi.h /*4*/:
                                    a = i2 + 1;
                                    obj3[i2] = f2;
                                    i2 = a;
                                    break;
                                default:
                                    break;
                            }
                        }
                        this.b = obj3;
                    }
                    nyt.e(i);
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
