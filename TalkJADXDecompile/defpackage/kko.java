package defpackage;

import nyt;
import nyu;
import nzc;
import nzl;

/* renamed from: kko */
public final class kko extends nyx<kko> {
    private static volatile kko[] f;
    public klk a;
    public int[] b;
    public Integer c;
    public String d;
    public kkp[] e;

    public /* synthetic */ nzf a(nyt nyt) {
        return b(nyt);
    }

    public static kko[] d() {
        if (f == null) {
            synchronized (nzc.c) {
                if (f == null) {
                    f = new kko[0];
                }
            }
        }
        return f;
    }

    public kko() {
        g();
    }

    private kko g() {
        this.a = null;
        this.b = nzl.a;
        this.d = null;
        this.e = kkp.d();
        this.unknownFieldData = null;
        this.cachedSize = -1;
        return this;
    }

    public void a(nyu nyu) {
        int i = 0;
        if (this.a != null) {
            nyu.b(1, this.a);
        }
        if (this.b != null && this.b.length > 0) {
            for (int a : this.b) {
                nyu.a(2, a);
            }
        }
        if (this.c != null) {
            nyu.a(3, this.c.intValue());
        }
        if (this.d != null) {
            nyu.a(4, this.d);
        }
        if (this.e != null && this.e.length > 0) {
            while (i < this.e.length) {
                nzf nzf = this.e[i];
                if (nzf != null) {
                    nyu.b(5, nzf);
                }
                i++;
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
        if (this.b != null && this.b.length > 0) {
            int i2 = 0;
            for (int g : this.b) {
                i2 += nyu.g(g);
            }
            b = (b + i2) + (this.b.length * 1);
        }
        if (this.c != null) {
            b += nyu.f(3, this.c.intValue());
        }
        if (this.d != null) {
            b += nyu.b(4, this.d);
        }
        if (this.e != null && this.e.length > 0) {
            while (i < this.e.length) {
                nzf nzf = this.e[i];
                if (nzf != null) {
                    b += nyu.d(5, nzf);
                }
                i++;
            }
        }
        return b;
    }

    private kko b(nyt nyt) {
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
                            case wi.s /*6*/:
                            case wi.dB /*11*/:
                            case wi.dD /*13*/:
                            case wi.dJ /*15*/:
                            case wi.dI /*16*/:
                            case wi.dL /*19*/:
                            case wi.k /*20*/:
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
                            case wi.s /*6*/:
                            case wi.dB /*11*/:
                            case wi.dD /*13*/:
                            case wi.dJ /*15*/:
                            case wi.dI /*16*/:
                            case wi.dL /*19*/:
                            case wi.k /*20*/:
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
                                case wi.s /*6*/:
                                case wi.dB /*11*/:
                                case wi.dD /*13*/:
                                case wi.dJ /*15*/:
                                case wi.dI /*16*/:
                                case wi.dL /*19*/:
                                case wi.k /*20*/:
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
                        case wi.l /*2*/:
                            this.c = Integer.valueOf(a);
                            break;
                        default:
                            continue;
                    }
                case 34:
                    this.d = nyt.j();
                    continue;
                case 42:
                    i2 = nzl.b(nyt, 42);
                    if (this.e == null) {
                        a = 0;
                    } else {
                        a = this.e.length;
                    }
                    Object obj4 = new kkp[(i2 + a)];
                    if (a != 0) {
                        System.arraycopy(this.e, 0, obj4, 0, a);
                    }
                    while (a < obj4.length - 1) {
                        obj4[a] = new kkp();
                        nyt.a(obj4[a]);
                        nyt.a();
                        a++;
                    }
                    obj4[a] = new kkp();
                    nyt.a(obj4[a]);
                    this.e = obj4;
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
