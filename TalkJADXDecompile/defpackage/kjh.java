package defpackage;

import nyt;
import nyu;
import nzl;

/* renamed from: kjh */
public final class kjh extends nyx<kjh> {
    public int[] a;
    public int[] b;
    public Integer c;

    public /* synthetic */ nzf a(nyt nyt) {
        return b(nyt);
    }

    public kjh() {
        d();
    }

    private kjh d() {
        this.a = nzl.a;
        this.b = nzl.a;
        this.unknownFieldData = null;
        this.cachedSize = -1;
        return this;
    }

    public void a(nyu nyu) {
        int i = 0;
        if (this.a != null && this.a.length > 0) {
            for (int a : this.a) {
                nyu.a(1, a);
            }
        }
        if (this.b != null && this.b.length > 0) {
            while (i < this.b.length) {
                nyu.a(2, this.b[i]);
                i++;
            }
        }
        if (this.c != null) {
            nyu.a(3, this.c.intValue());
        }
        super.a(nyu);
    }

    protected int b() {
        int i;
        int i2;
        int i3 = 0;
        int b = super.b();
        if (this.a == null || this.a.length <= 0) {
            i = b;
        } else {
            i2 = 0;
            for (int g : this.a) {
                i2 += nyu.g(g);
            }
            i = (b + i2) + (this.a.length * 1);
        }
        if (this.b != null && this.b.length > 0) {
            i2 = 0;
            while (i3 < this.b.length) {
                i2 += nyu.g(this.b[i3]);
                i3++;
            }
            i = (i + i2) + (this.b.length * 1);
        }
        if (this.c != null) {
            return i + nyu.f(3, this.c.intValue());
        }
        return i;
    }

    private kjh b(nyt nyt) {
        while (true) {
            int a = nyt.a();
            int b;
            Object obj;
            int i;
            int i2;
            int f;
            Object obj2;
            Object obj3;
            int f2;
            switch (a) {
                case wi.w /*0*/:
                    break;
                case wi.m /*8*/:
                    b = nzl.b(nyt, 8);
                    obj = new int[b];
                    i = 0;
                    i2 = 0;
                    while (i < b) {
                        if (i != 0) {
                            nyt.a();
                        }
                        f = nyt.f();
                        switch (f) {
                            case wi.w /*0*/:
                            case wi.j /*1*/:
                            case wi.l /*2*/:
                            case wi.z /*3*/:
                            case wi.h /*4*/:
                            case wi.p /*5*/:
                            case wi.s /*6*/:
                            case wi.q /*7*/:
                            case wi.m /*8*/:
                            case wi.n /*9*/:
                            case wi.dr /*10*/:
                            case wi.dB /*11*/:
                            case wi.dM /*12*/:
                            case wi.dD /*13*/:
                            case wi.g /*14*/:
                            case wi.dJ /*15*/:
                            case wi.dI /*16*/:
                            case wi.dK /*17*/:
                            case wi.dH /*18*/:
                            case wi.dL /*19*/:
                            case wi.k /*20*/:
                            case wi.f /*21*/:
                            case wi.e /*22*/:
                            case wi.do /*23*/:
                            case wi.dA /*24*/:
                            case wi.dz /*25*/:
                            case wi.dx /*26*/:
                            case wi.i /*27*/:
                            case wi.o /*28*/:
                            case 29:
                            case 30:
                            case 31:
                            case 32:
                            case 33:
                            case 34:
                            case 35:
                            case 36:
                            case 37:
                            case 38:
                            case 39:
                            case 40:
                            case 41:
                            case 42:
                            case 43:
                            case 44:
                            case 45:
                            case 46:
                            case 47:
                            case 99:
                            case 100:
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
                            obj2 = new int[(a + i2)];
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
                case wi.dr /*10*/:
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
                            case wi.p /*5*/:
                            case wi.s /*6*/:
                            case wi.q /*7*/:
                            case wi.m /*8*/:
                            case wi.n /*9*/:
                            case wi.dr /*10*/:
                            case wi.dB /*11*/:
                            case wi.dM /*12*/:
                            case wi.dD /*13*/:
                            case wi.g /*14*/:
                            case wi.dJ /*15*/:
                            case wi.dI /*16*/:
                            case wi.dK /*17*/:
                            case wi.dH /*18*/:
                            case wi.dL /*19*/:
                            case wi.k /*20*/:
                            case wi.f /*21*/:
                            case wi.e /*22*/:
                            case wi.do /*23*/:
                            case wi.dA /*24*/:
                            case wi.dz /*25*/:
                            case wi.dx /*26*/:
                            case wi.i /*27*/:
                            case wi.o /*28*/:
                            case 29:
                            case 30:
                            case 31:
                            case 32:
                            case 33:
                            case 34:
                            case 35:
                            case 36:
                            case 37:
                            case 38:
                            case 39:
                            case 40:
                            case 41:
                            case 42:
                            case 43:
                            case 44:
                            case 45:
                            case 46:
                            case 47:
                            case 99:
                            case 100:
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
                        obj3 = new int[(a + i2)];
                        if (i2 != 0) {
                            System.arraycopy(this.a, 0, obj3, 0, i2);
                        }
                        while (nyt.s() > 0) {
                            f2 = nyt.f();
                            switch (f2) {
                                case wi.w /*0*/:
                                case wi.j /*1*/:
                                case wi.l /*2*/:
                                case wi.z /*3*/:
                                case wi.h /*4*/:
                                case wi.p /*5*/:
                                case wi.s /*6*/:
                                case wi.q /*7*/:
                                case wi.m /*8*/:
                                case wi.n /*9*/:
                                case wi.dr /*10*/:
                                case wi.dB /*11*/:
                                case wi.dM /*12*/:
                                case wi.dD /*13*/:
                                case wi.g /*14*/:
                                case wi.dJ /*15*/:
                                case wi.dI /*16*/:
                                case wi.dK /*17*/:
                                case wi.dH /*18*/:
                                case wi.dL /*19*/:
                                case wi.k /*20*/:
                                case wi.f /*21*/:
                                case wi.e /*22*/:
                                case wi.do /*23*/:
                                case wi.dA /*24*/:
                                case wi.dz /*25*/:
                                case wi.dx /*26*/:
                                case wi.i /*27*/:
                                case wi.o /*28*/:
                                case 29:
                                case 30:
                                case 31:
                                case 32:
                                case 33:
                                case 34:
                                case 35:
                                case 36:
                                case 37:
                                case 38:
                                case 39:
                                case 40:
                                case 41:
                                case 42:
                                case 43:
                                case 44:
                                case 45:
                                case 46:
                                case 47:
                                case 99:
                                case 100:
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
                case wi.dI /*16*/:
                    b = nzl.b(nyt, 16);
                    obj = new int[b];
                    i = 0;
                    i2 = 0;
                    while (i < b) {
                        if (i != 0) {
                            nyt.a();
                        }
                        f = nyt.f();
                        switch (f) {
                            case wi.w /*0*/:
                            case wi.j /*1*/:
                            case wi.l /*2*/:
                            case wi.z /*3*/:
                            case wi.h /*4*/:
                            case wi.p /*5*/:
                            case wi.s /*6*/:
                            case wi.q /*7*/:
                            case wi.m /*8*/:
                            case wi.n /*9*/:
                            case wi.dr /*10*/:
                            case wi.dB /*11*/:
                            case wi.dM /*12*/:
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
                            obj2 = new int[(a + i2)];
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
                            case wi.p /*5*/:
                            case wi.s /*6*/:
                            case wi.q /*7*/:
                            case wi.m /*8*/:
                            case wi.n /*9*/:
                            case wi.dr /*10*/:
                            case wi.dB /*11*/:
                            case wi.dM /*12*/:
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
                        obj3 = new int[(a + i2)];
                        if (i2 != 0) {
                            System.arraycopy(this.b, 0, obj3, 0, i2);
                        }
                        while (nyt.s() > 0) {
                            f2 = nyt.f();
                            switch (f2) {
                                case wi.w /*0*/:
                                case wi.j /*1*/:
                                case wi.l /*2*/:
                                case wi.z /*3*/:
                                case wi.h /*4*/:
                                case wi.p /*5*/:
                                case wi.s /*6*/:
                                case wi.q /*7*/:
                                case wi.m /*8*/:
                                case wi.n /*9*/:
                                case wi.dr /*10*/:
                                case wi.dB /*11*/:
                                case wi.dM /*12*/:
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
                case wi.dA /*24*/:
                    a = nyt.f();
                    switch (a) {
                        case wi.w /*0*/:
                        case wi.j /*1*/:
                            this.c = Integer.valueOf(a);
                            break;
                        default:
                            continue;
                    }
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
