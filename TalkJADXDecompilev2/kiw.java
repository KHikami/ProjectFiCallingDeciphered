package defpackage;

public final class kiw extends nyx<kiw> {
    public int[] a;
    public Integer b;
    public kiy c;
    public Integer d;
    public Integer e;
    public Integer f;
    public kja g;
    public kiu h;

    public /* synthetic */ nzf a(nyt nyt) {
        return b(nyt);
    }

    public kiw() {
        d();
    }

    private kiw d() {
        this.a = nzl.a;
        this.c = null;
        this.g = null;
        this.h = null;
        this.unknownFieldData = null;
        this.cachedSize = -1;
        return this;
    }

    public void a(nyu nyu) {
        if (this.a != null && this.a.length > 0) {
            for (int a : this.a) {
                nyu.a(7, a);
            }
        }
        if (this.b != null) {
            nyu.a(8, this.b.intValue());
        }
        if (this.c != null) {
            nyu.b(14, this.c);
        }
        if (this.d != null) {
            nyu.a(15, this.d.intValue());
        }
        if (this.e != null) {
            nyu.a(16, this.e.intValue());
        }
        if (this.f != null) {
            nyu.a(17, this.f.intValue());
        }
        if (this.g != null) {
            nyu.b(18, this.g);
        }
        if (this.h != null) {
            nyu.b(19, this.h);
        }
        super.a(nyu);
    }

    protected int b() {
        int i = 0;
        int b = super.b();
        if (this.a == null || this.a.length <= 0) {
            i = b;
        } else {
            int i2 = 0;
            while (i < this.a.length) {
                i2 += nyu.g(this.a[i]);
                i++;
            }
            i = (b + i2) + (this.a.length * 1);
        }
        if (this.b != null) {
            i += nyu.f(8, this.b.intValue());
        }
        if (this.c != null) {
            i += nyu.d(14, this.c);
        }
        if (this.d != null) {
            i += nyu.f(15, this.d.intValue());
        }
        if (this.e != null) {
            i += nyu.f(16, this.e.intValue());
        }
        if (this.f != null) {
            i += nyu.f(17, this.f.intValue());
        }
        if (this.g != null) {
            i += nyu.d(18, this.g);
        }
        if (this.h != null) {
            return i + nyu.d(19, this.h);
        }
        return i;
    }

    private kiw b(nyt nyt) {
        while (true) {
            int a = nyt.a();
            int i;
            int i2;
            switch (a) {
                case 0:
                    break;
                case 56:
                    int b = nzl.b(nyt, 56);
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
                        a = this.a == null ? 0 : this.a.length;
                        if (a != 0 || i2 != obj.length) {
                            Object obj2 = new int[(a + i2)];
                            if (a != 0) {
                                System.arraycopy(this.a, 0, obj2, 0, a);
                            }
                            System.arraycopy(obj, 0, obj2, a, i2);
                            this.a = obj2;
                            break;
                        }
                        this.a = obj;
                        break;
                    }
                    continue;
                case 58:
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
                                a++;
                                break;
                            default:
                                break;
                        }
                    }
                    if (a != 0) {
                        nyt.f(i2);
                        if (this.a == null) {
                            i2 = 0;
                        } else {
                            i2 = this.a.length;
                        }
                        Object obj3 = new int[(a + i2)];
                        if (i2 != 0) {
                            System.arraycopy(this.a, 0, obj3, 0, i2);
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
                                    a = i2 + 1;
                                    obj3[i2] = f2;
                                    i2 = a;
                                    break;
                                default:
                                    break;
                            }
                        }
                        this.a = obj3;
                    }
                    nyt.e(i);
                    continue;
                case 64:
                    a = nyt.f();
                    switch (a) {
                        case 0:
                        case 1:
                            this.b = Integer.valueOf(a);
                            break;
                        default:
                            continue;
                    }
                case 114:
                    if (this.c == null) {
                        this.c = new kiy();
                    }
                    nyt.a(this.c);
                    continue;
                case 120:
                    a = nyt.f();
                    switch (a) {
                        case 0:
                        case 1:
                        case 2:
                            this.d = Integer.valueOf(a);
                            break;
                        default:
                            continue;
                    }
                case 128:
                    a = nyt.f();
                    switch (a) {
                        case 0:
                        case 1:
                        case 2:
                            this.e = Integer.valueOf(a);
                            break;
                        default:
                            continue;
                    }
                case 136:
                    a = nyt.f();
                    switch (a) {
                        case 0:
                        case 1:
                        case 2:
                        case 3:
                            this.f = Integer.valueOf(a);
                            break;
                        default:
                            continue;
                    }
                case 146:
                    if (this.g == null) {
                        this.g = new kja();
                    }
                    nyt.a(this.g);
                    continue;
                case 154:
                    if (this.h == null) {
                        this.h = new kiu();
                    }
                    nyt.a(this.h);
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
