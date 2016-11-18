package p000;

public final class ksb extends nyx<ksb> {
    private static volatile ksb[] f22961c;
    public int[] f22962a;
    public String f22963b;

    public /* synthetic */ nzf mo150a(nyt nyt) {
        return m27274b(nyt);
    }

    public static ksb[] m27275d() {
        if (f22961c == null) {
            synchronized (nzc.c) {
                if (f22961c == null) {
                    f22961c = new ksb[0];
                }
            }
        }
        return f22961c;
    }

    public ksb() {
        this.f22962a = nzl.a;
        this.f22963b = null;
        this.cachedSize = -1;
    }

    public void mo146a(nyu nyu) {
        if (this.f22962a != null && this.f22962a.length > 0) {
            for (int a : this.f22962a) {
                nyu.a(1, a);
            }
        }
        if (this.f22963b != null) {
            nyu.a(2, this.f22963b);
        }
        super.mo146a(nyu);
    }

    protected int mo147b() {
        int i = 0;
        int b = super.mo147b();
        if (this.f22962a == null || this.f22962a.length <= 0) {
            i = b;
        } else {
            int i2 = 0;
            while (i < this.f22962a.length) {
                i2 += nyu.g(this.f22962a[i]);
                i++;
            }
            i = (b + i2) + (this.f22962a.length * 1);
        }
        if (this.f22963b != null) {
            return i + nyu.b(2, this.f22963b);
        }
        return i;
    }

    private ksb m27274b(nyt nyt) {
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
                            case 4:
                            case 5:
                            case 6:
                            case 7:
                            case 8:
                            case 9:
                            case 10:
                            case 11:
                            case 12:
                            case 13:
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
                        a = this.f22962a == null ? 0 : this.f22962a.length;
                        if (a != 0 || i2 != obj.length) {
                            Object obj2 = new int[(a + i2)];
                            if (a != 0) {
                                System.arraycopy(this.f22962a, 0, obj2, 0, a);
                            }
                            System.arraycopy(obj, 0, obj2, a, i2);
                            this.f22962a = obj2;
                            break;
                        }
                        this.f22962a = obj;
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
                            case 4:
                            case 5:
                            case 6:
                            case 7:
                            case 8:
                            case 9:
                            case 10:
                            case 11:
                            case 12:
                            case 13:
                                a++;
                                break;
                            default:
                                break;
                        }
                    }
                    if (a != 0) {
                        nyt.f(i2);
                        if (this.f22962a == null) {
                            i2 = 0;
                        } else {
                            i2 = this.f22962a.length;
                        }
                        Object obj3 = new int[(a + i2)];
                        if (i2 != 0) {
                            System.arraycopy(this.f22962a, 0, obj3, 0, i2);
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
                                case 10:
                                case 11:
                                case 12:
                                case 13:
                                    a = i2 + 1;
                                    obj3[i2] = f2;
                                    i2 = a;
                                    break;
                                default:
                                    break;
                            }
                        }
                        this.f22962a = obj3;
                    }
                    nyt.e(i);
                    continue;
                case wi.dH /*18*/:
                    this.f22963b = nyt.j();
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
