package p000;

public final class mui extends nyx<mui> {
    private static volatile mui[] f28354h;
    public String f28355a;
    public String f28356b;
    public int[] f28357c;
    public String f28358d;
    public String f28359e;
    public muf f28360f;
    public ozo f28361g;

    public /* synthetic */ nzf mo150a(nyt nyt) {
        return m32945b(nyt);
    }

    public static mui[] m32946d() {
        if (f28354h == null) {
            synchronized (nzc.c) {
                if (f28354h == null) {
                    f28354h = new mui[0];
                }
            }
        }
        return f28354h;
    }

    public mui() {
        m32947g();
    }

    private mui m32947g() {
        this.f28355a = null;
        this.f28356b = null;
        this.f28357c = nzl.a;
        this.f28358d = null;
        this.f28359e = null;
        this.f28360f = null;
        this.f28361g = null;
        this.unknownFieldData = null;
        this.cachedSize = -1;
        return this;
    }

    public void mo146a(nyu nyu) {
        nyu.a(1, this.f28355a);
        if (this.f28356b != null) {
            nyu.a(2, this.f28356b);
        }
        if (this.f28357c != null && this.f28357c.length > 0) {
            for (int a : this.f28357c) {
                nyu.a(3, a);
            }
        }
        if (this.f28358d != null) {
            nyu.a(5, this.f28358d);
        }
        if (this.f28359e != null) {
            nyu.a(6, this.f28359e);
        }
        if (this.f28361g != null) {
            nyu.b(15, this.f28361g);
        }
        if (this.f28360f != null) {
            nyu.b(500, this.f28360f);
        }
        super.mo146a(nyu);
    }

    protected int mo147b() {
        int i = 0;
        int b = super.mo147b() + nyu.b(1, this.f28355a);
        if (this.f28356b != null) {
            b += nyu.b(2, this.f28356b);
        }
        if (this.f28357c != null && this.f28357c.length > 0) {
            int i2 = 0;
            while (i < this.f28357c.length) {
                i2 += nyu.g(this.f28357c[i]);
                i++;
            }
            b = (b + i2) + (this.f28357c.length * 1);
        }
        if (this.f28358d != null) {
            b += nyu.b(5, this.f28358d);
        }
        if (this.f28359e != null) {
            b += nyu.b(6, this.f28359e);
        }
        if (this.f28361g != null) {
            b += nyu.d(15, this.f28361g);
        }
        if (this.f28360f != null) {
            return b + nyu.d(500, this.f28360f);
        }
        return b;
    }

    private mui m32945b(nyt nyt) {
        while (true) {
            int a = nyt.a();
            int i;
            int i2;
            switch (a) {
                case 0:
                    break;
                case 10:
                    this.f28355a = nyt.j();
                    continue;
                case wi.dH /*18*/:
                    this.f28356b = nyt.j();
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
                        a = this.f28357c == null ? 0 : this.f28357c.length;
                        if (a != 0 || i2 != obj.length) {
                            Object obj2 = new int[(a + i2)];
                            if (a != 0) {
                                System.arraycopy(this.f28357c, 0, obj2, 0, a);
                            }
                            System.arraycopy(obj, 0, obj2, a, i2);
                            this.f28357c = obj2;
                            break;
                        }
                        this.f28357c = obj;
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
                        if (this.f28357c == null) {
                            i2 = 0;
                        } else {
                            i2 = this.f28357c.length;
                        }
                        Object obj3 = new int[(a + i2)];
                        if (i2 != 0) {
                            System.arraycopy(this.f28357c, 0, obj3, 0, i2);
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
                        this.f28357c = obj3;
                    }
                    nyt.e(i);
                    continue;
                case 42:
                    this.f28358d = nyt.j();
                    continue;
                case 50:
                    this.f28359e = nyt.j();
                    continue;
                case 122:
                    if (this.f28361g == null) {
                        this.f28361g = new ozo();
                    }
                    nyt.a(this.f28361g);
                    continue;
                case 4002:
                    if (this.f28360f == null) {
                        this.f28360f = new muf();
                    }
                    nyt.a(this.f28360f);
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
