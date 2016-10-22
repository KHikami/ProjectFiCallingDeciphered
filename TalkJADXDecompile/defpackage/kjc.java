package defpackage;

import nyt;
import nyu;
import nzl;

/* renamed from: kjc */
public final class kjc extends nyx<kjc> {
    public String a;
    public Integer b;
    public Integer c;
    public kjf d;
    public String[] e;
    public kiw f;
    public int[] g;
    public kjb h;
    public kjh i;
    public int[] j;
    public kje k;
    public kjd l;
    public kit m;

    public /* synthetic */ nzf a(nyt nyt) {
        return b(nyt);
    }

    public kjc() {
        d();
    }

    private kjc d() {
        this.a = null;
        this.d = null;
        this.e = nzl.f;
        this.f = null;
        this.g = nzl.a;
        this.h = null;
        this.i = null;
        this.j = nzl.a;
        this.k = null;
        this.l = null;
        this.m = null;
        this.unknownFieldData = null;
        this.cachedSize = -1;
        return this;
    }

    public void a(nyu nyu) {
        int i = 0;
        nyu.a(1, this.a);
        nyu.a(2, this.b.intValue());
        if (this.c != null) {
            nyu.a(3, this.c.intValue());
        }
        if (this.d != null) {
            nyu.b(4, this.d);
        }
        if (this.e != null && this.e.length > 0) {
            for (String str : this.e) {
                if (str != null) {
                    nyu.a(5, str);
                }
            }
        }
        if (this.f != null) {
            nyu.b(6, this.f);
        }
        if (this.g != null && this.g.length > 0) {
            for (int a : this.g) {
                nyu.a(7, a);
            }
        }
        if (this.h != null) {
            nyu.b(8, this.h);
        }
        if (this.i != null) {
            nyu.b(9, this.i);
        }
        if (this.j != null && this.j.length > 0) {
            while (i < this.j.length) {
                nyu.a(10, this.j[i]);
                i++;
            }
        }
        if (this.k != null) {
            nyu.b(11, this.k);
        }
        if (this.l != null) {
            nyu.b(12, this.l);
        }
        if (this.m != null) {
            nyu.b(13, this.m);
        }
        super.a(nyu);
    }

    protected int b() {
        int i;
        int i2;
        int i3;
        int i4 = 0;
        int b = (super.b() + nyu.b(1, this.a)) + nyu.f(2, this.b.intValue());
        if (this.c != null) {
            b += nyu.f(3, this.c.intValue());
        }
        if (this.d != null) {
            b += nyu.d(4, this.d);
        }
        if (this.e != null && this.e.length > 0) {
            i = 0;
            i2 = 0;
            for (String str : this.e) {
                if (str != null) {
                    i2++;
                    i += nyu.b(str);
                }
            }
            b = (b + i) + (i2 * 1);
        }
        if (this.f != null) {
            b += nyu.d(6, this.f);
        }
        if (this.g != null && this.g.length > 0) {
            i = 0;
            for (int i22 : this.g) {
                i += nyu.g(i22);
            }
            b = (b + i) + (this.g.length * 1);
        }
        if (this.h != null) {
            b += nyu.d(8, this.h);
        }
        if (this.i != null) {
            b += nyu.d(9, this.i);
        }
        if (this.j != null && this.j.length > 0) {
            i3 = 0;
            while (i4 < this.j.length) {
                i3 += nyu.g(this.j[i4]);
                i4++;
            }
            b = (b + i3) + (this.j.length * 1);
        }
        if (this.k != null) {
            b += nyu.d(11, this.k);
        }
        if (this.l != null) {
            b += nyu.d(12, this.l);
        }
        if (this.m != null) {
            return b + nyu.d(13, this.m);
        }
        return b;
    }

    private kjc b(nyt nyt) {
        while (true) {
            int a = nyt.a();
            int b;
            int b2;
            Object obj;
            int i;
            int f;
            Object obj2;
            Object obj3;
            int f2;
            switch (a) {
                case wi.w /*0*/:
                    break;
                case wi.dr /*10*/:
                    this.a = nyt.j();
                    continue;
                case wi.dI /*16*/:
                    a = nyt.f();
                    switch (a) {
                        case wi.j /*1*/:
                        case wi.l /*2*/:
                        case wi.z /*3*/:
                            this.b = Integer.valueOf(a);
                            break;
                        default:
                            continue;
                    }
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
                case 34:
                    if (this.d == null) {
                        this.d = new kjf();
                    }
                    nyt.a(this.d);
                    continue;
                case 42:
                    b = nzl.b(nyt, 42);
                    a = this.e == null ? 0 : this.e.length;
                    Object obj4 = new String[(b + a)];
                    if (a != 0) {
                        System.arraycopy(this.e, 0, obj4, 0, a);
                    }
                    while (a < obj4.length - 1) {
                        obj4[a] = nyt.j();
                        nyt.a();
                        a++;
                    }
                    obj4[a] = nyt.j();
                    this.e = obj4;
                    continue;
                case 50:
                    if (this.f == null) {
                        this.f = new kiw();
                    }
                    nyt.a(this.f);
                    continue;
                case 56:
                    b2 = nzl.b(nyt, 56);
                    obj = new int[b2];
                    i = 0;
                    b = 0;
                    while (i < b2) {
                        if (i != 0) {
                            nyt.a();
                        }
                        f = nyt.f();
                        switch (f) {
                            case wi.w /*0*/:
                            case wi.j /*1*/:
                            case wi.l /*2*/:
                            case wi.z /*3*/:
                                a = b + 1;
                                obj[b] = f;
                                break;
                            default:
                                a = b;
                                break;
                        }
                        i++;
                        b = a;
                    }
                    if (b != 0) {
                        a = this.g == null ? 0 : this.g.length;
                        if (a != 0 || b != obj.length) {
                            obj2 = new int[(a + b)];
                            if (a != 0) {
                                System.arraycopy(this.g, 0, obj2, 0, a);
                            }
                            System.arraycopy(obj, 0, obj2, a, b);
                            this.g = obj2;
                            break;
                        }
                        this.g = obj;
                        break;
                    }
                    continue;
                case 58:
                    i = nyt.d(nyt.r());
                    b = nyt.u();
                    a = 0;
                    while (nyt.s() > 0) {
                        switch (nyt.f()) {
                            case wi.w /*0*/:
                            case wi.j /*1*/:
                            case wi.l /*2*/:
                            case wi.z /*3*/:
                                a++;
                                break;
                            default:
                                break;
                        }
                    }
                    if (a != 0) {
                        nyt.f(b);
                        if (this.g == null) {
                            b = 0;
                        } else {
                            b = this.g.length;
                        }
                        obj3 = new int[(a + b)];
                        if (b != 0) {
                            System.arraycopy(this.g, 0, obj3, 0, b);
                        }
                        while (nyt.s() > 0) {
                            f2 = nyt.f();
                            switch (f2) {
                                case wi.w /*0*/:
                                case wi.j /*1*/:
                                case wi.l /*2*/:
                                case wi.z /*3*/:
                                    a = b + 1;
                                    obj3[b] = f2;
                                    b = a;
                                    break;
                                default:
                                    break;
                            }
                        }
                        this.g = obj3;
                    }
                    nyt.e(i);
                    continue;
                case 66:
                    if (this.h == null) {
                        this.h = new kjb();
                    }
                    nyt.a(this.h);
                    continue;
                case 74:
                    if (this.i == null) {
                        this.i = new kjh();
                    }
                    nyt.a(this.i);
                    continue;
                case 80:
                    b2 = nzl.b(nyt, 80);
                    obj = new int[b2];
                    i = 0;
                    b = 0;
                    while (i < b2) {
                        if (i != 0) {
                            nyt.a();
                        }
                        f = nyt.f();
                        switch (f) {
                            case wi.w /*0*/:
                            case wi.j /*1*/:
                                a = b + 1;
                                obj[b] = f;
                                break;
                            default:
                                a = b;
                                break;
                        }
                        i++;
                        b = a;
                    }
                    if (b != 0) {
                        a = this.j == null ? 0 : this.j.length;
                        if (a != 0 || b != obj.length) {
                            obj2 = new int[(a + b)];
                            if (a != 0) {
                                System.arraycopy(this.j, 0, obj2, 0, a);
                            }
                            System.arraycopy(obj, 0, obj2, a, b);
                            this.j = obj2;
                            break;
                        }
                        this.j = obj;
                        break;
                    }
                    continue;
                case 82:
                    i = nyt.d(nyt.r());
                    b = nyt.u();
                    a = 0;
                    while (nyt.s() > 0) {
                        switch (nyt.f()) {
                            case wi.w /*0*/:
                            case wi.j /*1*/:
                                a++;
                                break;
                            default:
                                break;
                        }
                    }
                    if (a != 0) {
                        nyt.f(b);
                        if (this.j == null) {
                            b = 0;
                        } else {
                            b = this.j.length;
                        }
                        obj3 = new int[(a + b)];
                        if (b != 0) {
                            System.arraycopy(this.j, 0, obj3, 0, b);
                        }
                        while (nyt.s() > 0) {
                            f2 = nyt.f();
                            switch (f2) {
                                case wi.w /*0*/:
                                case wi.j /*1*/:
                                    a = b + 1;
                                    obj3[b] = f2;
                                    b = a;
                                    break;
                                default:
                                    break;
                            }
                        }
                        this.j = obj3;
                    }
                    nyt.e(i);
                    continue;
                case 90:
                    if (this.k == null) {
                        this.k = new kje();
                    }
                    nyt.a(this.k);
                    continue;
                case 98:
                    if (this.l == null) {
                        this.l = new kjd();
                    }
                    nyt.a(this.l);
                    continue;
                case 106:
                    if (this.m == null) {
                        this.m = new kit();
                    }
                    nyt.a(this.m);
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
