package defpackage;

public final class mui extends nyx<mui> {
    private static volatile mui[] h;
    public String a;
    public String b;
    public int[] c;
    public String d;
    public String e;
    public muf f;
    public ozo g;

    public /* synthetic */ nzf a(nyt nyt) {
        return b(nyt);
    }

    public static mui[] d() {
        if (h == null) {
            synchronized (nzc.c) {
                if (h == null) {
                    h = new mui[0];
                }
            }
        }
        return h;
    }

    public mui() {
        g();
    }

    private mui g() {
        this.a = null;
        this.b = null;
        this.c = nzl.a;
        this.d = null;
        this.e = null;
        this.f = null;
        this.g = null;
        this.unknownFieldData = null;
        this.cachedSize = -1;
        return this;
    }

    public void a(nyu nyu) {
        nyu.a(1, this.a);
        if (this.b != null) {
            nyu.a(2, this.b);
        }
        if (this.c != null && this.c.length > 0) {
            for (int a : this.c) {
                nyu.a(3, a);
            }
        }
        if (this.d != null) {
            nyu.a(5, this.d);
        }
        if (this.e != null) {
            nyu.a(6, this.e);
        }
        if (this.g != null) {
            nyu.b(15, this.g);
        }
        if (this.f != null) {
            nyu.b(500, this.f);
        }
        super.a(nyu);
    }

    protected int b() {
        int i = 0;
        int b = super.b() + nyu.b(1, this.a);
        if (this.b != null) {
            b += nyu.b(2, this.b);
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
            b += nyu.b(5, this.d);
        }
        if (this.e != null) {
            b += nyu.b(6, this.e);
        }
        if (this.g != null) {
            b += nyu.d(15, this.g);
        }
        if (this.f != null) {
            return b + nyu.d(500, this.f);
        }
        return b;
    }

    private mui b(nyt nyt) {
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
                case wi.dH /*18*/:
                    this.b = nyt.j();
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
                            case 9:
                            case 10:
                            case 11:
                            case 12:
                            case 81:
                            case 82:
                            case 83:
                            case 84:
                            case 85:
                            case 129:
                            case 161:
                            case 163:
                            case 164:
                            case 165:
                            case 166:
                            case 167:
                            case 168:
                            case 169:
                            case 209:
                            case 211:
                            case 212:
                            case 213:
                            case 215:
                            case 216:
                            case 1297:
                            case 1298:
                            case 2705:
                            case 20753:
                            case 20769:
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
                            case 9:
                            case 10:
                            case 11:
                            case 12:
                            case 81:
                            case 82:
                            case 83:
                            case 84:
                            case 85:
                            case 129:
                            case 161:
                            case 163:
                            case 164:
                            case 165:
                            case 166:
                            case 167:
                            case 168:
                            case 169:
                            case 209:
                            case 211:
                            case 212:
                            case 213:
                            case 215:
                            case 216:
                            case 1297:
                            case 1298:
                            case 2705:
                            case 20753:
                            case 20769:
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
                                case 9:
                                case 10:
                                case 11:
                                case 12:
                                case 81:
                                case 82:
                                case 83:
                                case 84:
                                case 85:
                                case 129:
                                case 161:
                                case 163:
                                case 164:
                                case 165:
                                case 166:
                                case 167:
                                case 168:
                                case 169:
                                case 209:
                                case 211:
                                case 212:
                                case 213:
                                case 215:
                                case 216:
                                case 1297:
                                case 1298:
                                case 2705:
                                case 20753:
                                case 20769:
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
                case 42:
                    this.d = nyt.j();
                    continue;
                case 50:
                    this.e = nyt.j();
                    continue;
                case 122:
                    if (this.g == null) {
                        this.g = new ozo();
                    }
                    nyt.a(this.g);
                    continue;
                case 4002:
                    if (this.f == null) {
                        this.f = new muf();
                    }
                    nyt.a(this.f);
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
