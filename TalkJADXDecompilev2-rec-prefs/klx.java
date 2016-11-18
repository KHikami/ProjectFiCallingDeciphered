package p000;

public final class klx extends nyx<klx> {
    private static volatile klx[] f22318c;
    public klk f22319a;
    public int[] f22320b;

    public /* synthetic */ nzf mo150a(nyt nyt) {
        return m26470b(nyt);
    }

    public static klx[] m26471d() {
        if (f22318c == null) {
            synchronized (nzc.c) {
                if (f22318c == null) {
                    f22318c = new klx[0];
                }
            }
        }
        return f22318c;
    }

    public klx() {
        m26472g();
    }

    private klx m26472g() {
        this.f22319a = null;
        this.f22320b = nzl.a;
        this.unknownFieldData = null;
        this.cachedSize = -1;
        return this;
    }

    public void mo146a(nyu nyu) {
        if (this.f22319a != null) {
            nyu.b(1, this.f22319a);
        }
        if (this.f22320b != null && this.f22320b.length > 0) {
            for (int a : this.f22320b) {
                nyu.a(2, a);
            }
        }
        super.mo146a(nyu);
    }

    protected int mo147b() {
        int i = 0;
        int b = super.mo147b();
        if (this.f22319a != null) {
            b += nyu.d(1, this.f22319a);
        }
        if (this.f22320b == null || this.f22320b.length <= 0) {
            return b;
        }
        int i2 = 0;
        while (i < this.f22320b.length) {
            i2 += nyu.g(this.f22320b[i]);
            i++;
        }
        return (b + i2) + (this.f22320b.length * 1);
    }

    private klx m26470b(nyt nyt) {
        while (true) {
            int a = nyt.a();
            int i;
            int i2;
            switch (a) {
                case 0:
                    break;
                case 10:
                    if (this.f22319a == null) {
                        this.f22319a = new klk();
                    }
                    nyt.a(this.f22319a);
                    continue;
                case 16:
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
                            case 0:
                            case 1:
                            case 2:
                            case 3:
                            case 4:
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
                        a = this.f22320b == null ? 0 : this.f22320b.length;
                        if (a != 0 || i2 != obj.length) {
                            Object obj2 = new int[(a + i2)];
                            if (a != 0) {
                                System.arraycopy(this.f22320b, 0, obj2, 0, a);
                            }
                            System.arraycopy(obj, 0, obj2, a, i2);
                            this.f22320b = obj2;
                            break;
                        }
                        this.f22320b = obj;
                        break;
                    }
                    continue;
                case wi.dH /*18*/:
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
                                a++;
                                break;
                            default:
                                break;
                        }
                    }
                    if (a != 0) {
                        nyt.f(i2);
                        if (this.f22320b == null) {
                            i2 = 0;
                        } else {
                            i2 = this.f22320b.length;
                        }
                        Object obj3 = new int[(a + i2)];
                        if (i2 != 0) {
                            System.arraycopy(this.f22320b, 0, obj3, 0, i2);
                        }
                        while (nyt.s() > 0) {
                            int f2 = nyt.f();
                            switch (f2) {
                                case 0:
                                case 1:
                                case 2:
                                case 3:
                                case 4:
                                    a = i2 + 1;
                                    obj3[i2] = f2;
                                    i2 = a;
                                    break;
                                default:
                                    break;
                            }
                        }
                        this.f22320b = obj3;
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
