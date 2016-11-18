package p000;

public final class ktr extends nyx<ktr> {
    private static volatile ktr[] f23253c;
    public int[] f23254a;
    public String f23255b;

    public /* synthetic */ nzf mo150a(nyt nyt) {
        return m27489b(nyt);
    }

    public static ktr[] m27490d() {
        if (f23253c == null) {
            synchronized (nzc.c) {
                if (f23253c == null) {
                    f23253c = new ktr[0];
                }
            }
        }
        return f23253c;
    }

    public ktr() {
        m27491g();
    }

    private ktr m27491g() {
        this.f23254a = nzl.a;
        this.f23255b = null;
        this.unknownFieldData = null;
        this.cachedSize = -1;
        return this;
    }

    public void mo146a(nyu nyu) {
        if (this.f23254a != null && this.f23254a.length > 0) {
            for (int a : this.f23254a) {
                nyu.a(1, a);
            }
        }
        if (this.f23255b != null) {
            nyu.a(2, this.f23255b);
        }
        super.mo146a(nyu);
    }

    protected int mo147b() {
        int i = 0;
        int b = super.mo147b();
        if (this.f23254a == null || this.f23254a.length <= 0) {
            i = b;
        } else {
            int i2 = 0;
            while (i < this.f23254a.length) {
                i2 += nyu.g(this.f23254a[i]);
                i++;
            }
            i = (b + i2) + (this.f23254a.length * 1);
        }
        if (this.f23255b != null) {
            return i + nyu.b(2, this.f23255b);
        }
        return i;
    }

    private ktr m27489b(nyt nyt) {
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
                        a = this.f23254a == null ? 0 : this.f23254a.length;
                        if (a != 0 || i2 != obj.length) {
                            Object obj2 = new int[(a + i2)];
                            if (a != 0) {
                                System.arraycopy(this.f23254a, 0, obj2, 0, a);
                            }
                            System.arraycopy(obj, 0, obj2, a, i2);
                            this.f23254a = obj2;
                            break;
                        }
                        this.f23254a = obj;
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
                        if (this.f23254a == null) {
                            i2 = 0;
                        } else {
                            i2 = this.f23254a.length;
                        }
                        Object obj3 = new int[(a + i2)];
                        if (i2 != 0) {
                            System.arraycopy(this.f23254a, 0, obj3, 0, i2);
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
                        this.f23254a = obj3;
                    }
                    nyt.e(i);
                    continue;
                case wi.dH /*18*/:
                    this.f23255b = nyt.j();
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
