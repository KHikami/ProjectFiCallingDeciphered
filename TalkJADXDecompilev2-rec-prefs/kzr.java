package p000;

public final class kzr extends nyx<kzr> {
    private static volatile kzr[] f24290f;
    public int f24291a;
    public int[] f24292b;
    public Boolean f24293c;
    public Boolean f24294d;
    public Boolean f24295e;

    public /* synthetic */ nzf mo150a(nyt nyt) {
        return m28270b(nyt);
    }

    public static kzr[] m28271d() {
        if (f24290f == null) {
            synchronized (nzc.c) {
                if (f24290f == null) {
                    f24290f = new kzr[0];
                }
            }
        }
        return f24290f;
    }

    public kzr() {
        this.f24291a = nzf.UNSET_ENUM_VALUE;
        this.f24292b = nzl.a;
        this.f24293c = null;
        this.f24294d = null;
        this.f24295e = null;
        this.cachedSize = -1;
    }

    public void mo146a(nyu nyu) {
        if (this.f24292b != null && this.f24292b.length > 0) {
            for (int a : this.f24292b) {
                nyu.a(1, a);
            }
        }
        if (this.f24293c != null) {
            nyu.a(2, this.f24293c.booleanValue());
        }
        if (this.f24294d != null) {
            nyu.a(3, this.f24294d.booleanValue());
        }
        if (this.f24291a != nzf.UNSET_ENUM_VALUE) {
            nyu.a(4, this.f24291a);
        }
        if (this.f24295e != null) {
            nyu.a(5, this.f24295e.booleanValue());
        }
        super.mo146a(nyu);
    }

    protected int mo147b() {
        int i = 0;
        int b = super.mo147b();
        if (this.f24292b == null || this.f24292b.length <= 0) {
            i = b;
        } else {
            int i2 = 0;
            while (i < this.f24292b.length) {
                i2 += nyu.g(this.f24292b[i]);
                i++;
            }
            i = (b + i2) + (this.f24292b.length * 1);
        }
        if (this.f24293c != null) {
            this.f24293c.booleanValue();
            i += nyu.h(2) + 1;
        }
        if (this.f24294d != null) {
            this.f24294d.booleanValue();
            i += nyu.h(3) + 1;
        }
        if (this.f24291a != nzf.UNSET_ENUM_VALUE) {
            i += nyu.f(4, this.f24291a);
        }
        if (this.f24295e == null) {
            return i;
        }
        this.f24295e.booleanValue();
        return i + (nyu.h(5) + 1);
    }

    private kzr m28270b(nyt nyt) {
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
                        a = this.f24292b == null ? 0 : this.f24292b.length;
                        if (a != 0 || i2 != obj.length) {
                            Object obj2 = new int[(a + i2)];
                            if (a != 0) {
                                System.arraycopy(this.f24292b, 0, obj2, 0, a);
                            }
                            System.arraycopy(obj, 0, obj2, a, i2);
                            this.f24292b = obj2;
                            break;
                        }
                        this.f24292b = obj;
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
                                a++;
                                break;
                            default:
                                break;
                        }
                    }
                    if (a != 0) {
                        nyt.f(i2);
                        if (this.f24292b == null) {
                            i2 = 0;
                        } else {
                            i2 = this.f24292b.length;
                        }
                        Object obj3 = new int[(a + i2)];
                        if (i2 != 0) {
                            System.arraycopy(this.f24292b, 0, obj3, 0, i2);
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
                                    a = i2 + 1;
                                    obj3[i2] = f2;
                                    i2 = a;
                                    break;
                                default:
                                    break;
                            }
                        }
                        this.f24292b = obj3;
                    }
                    nyt.e(i);
                    continue;
                case 16:
                    this.f24293c = Boolean.valueOf(nyt.i());
                    continue;
                case wi.dA /*24*/:
                    this.f24294d = Boolean.valueOf(nyt.i());
                    continue;
                case 32:
                    a = nyt.f();
                    switch (a) {
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
                        case 14:
                        case 15:
                        case 16:
                        case wi.dK /*17*/:
                        case wi.dH /*18*/:
                        case wi.dL /*19*/:
                        case 20:
                        case 21:
                        case 22:
                        case wi.f29038do /*23*/:
                        case wi.dA /*24*/:
                        case wi.dz /*25*/:
                        case wi.dx /*26*/:
                        case 27:
                        case 28:
                        case 29:
                        case 30:
                        case 31:
                        case 32:
                            this.f24291a = a;
                            break;
                        default:
                            continue;
                    }
                case 40:
                    this.f24295e = Boolean.valueOf(nyt.i());
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
