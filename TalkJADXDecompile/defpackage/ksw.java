package defpackage;

import nyt;
import nyu;
import nzl;

/* renamed from: ksw */
public final class ksw extends nyx<ksw> {
    public String a;
    public Integer b;
    public ksx[] c;
    public Long d;
    public kss e;
    public String f;
    public Boolean g;
    public ksx h;
    public Integer i;
    public ksx[] j;
    public int[] k;

    public /* synthetic */ nzf a(nyt nyt) {
        return b(nyt);
    }

    public ksw() {
        d();
    }

    private ksw d() {
        this.a = null;
        this.c = ksx.d();
        this.d = null;
        this.e = null;
        this.f = null;
        this.g = null;
        this.h = null;
        this.j = ksx.d();
        this.k = nzl.a;
        this.unknownFieldData = null;
        this.cachedSize = -1;
        return this;
    }

    public void a(nyu nyu) {
        int i = 0;
        if (this.a != null) {
            nyu.a(1, this.a);
        }
        if (this.b != null) {
            nyu.a(2, this.b.intValue());
        }
        if (this.c != null && this.c.length > 0) {
            for (nzf nzf : this.c) {
                if (nzf != null) {
                    nyu.b(3, nzf);
                }
            }
        }
        if (this.d != null) {
            nyu.b(4, this.d.longValue());
        }
        if (this.e != null) {
            nyu.b(5, this.e);
        }
        if (this.f != null) {
            nyu.a(6, this.f);
        }
        if (this.g != null) {
            nyu.a(7, this.g.booleanValue());
        }
        if (this.h != null) {
            nyu.b(8, this.h);
        }
        if (this.i != null) {
            nyu.a(9, this.i.intValue());
        }
        if (this.j != null && this.j.length > 0) {
            for (nzf nzf2 : this.j) {
                if (nzf2 != null) {
                    nyu.b(10, nzf2);
                }
            }
        }
        if (this.k != null && this.k.length > 0) {
            while (i < this.k.length) {
                nyu.a(11, this.k[i]);
                i++;
            }
        }
        super.a(nyu);
    }

    protected int b() {
        int i;
        int i2 = 0;
        int b = super.b();
        if (this.a != null) {
            b += nyu.b(1, this.a);
        }
        if (this.b != null) {
            b += nyu.f(2, this.b.intValue());
        }
        if (this.c != null && this.c.length > 0) {
            i = b;
            for (nzf nzf : this.c) {
                if (nzf != null) {
                    i += nyu.d(3, nzf);
                }
            }
            b = i;
        }
        if (this.d != null) {
            b += nyu.f(4, this.d.longValue());
        }
        if (this.e != null) {
            b += nyu.d(5, this.e);
        }
        if (this.f != null) {
            b += nyu.b(6, this.f);
        }
        if (this.g != null) {
            this.g.booleanValue();
            b += nyu.h(7) + 1;
        }
        if (this.h != null) {
            b += nyu.d(8, this.h);
        }
        if (this.i != null) {
            b += nyu.f(9, this.i.intValue());
        }
        if (this.j != null && this.j.length > 0) {
            i = b;
            for (nzf nzf2 : this.j) {
                if (nzf2 != null) {
                    i += nyu.d(10, nzf2);
                }
            }
            b = i;
        }
        if (this.k == null || this.k.length <= 0) {
            return b;
        }
        i = 0;
        while (i2 < this.k.length) {
            i += nyu.g(this.k[i2]);
            i2++;
        }
        return (b + i) + (this.k.length * 1);
    }

    private ksw b(nyt nyt) {
        while (true) {
            int a = nyt.a();
            int b;
            Object obj;
            int i;
            switch (a) {
                case wi.w /*0*/:
                    break;
                case wi.dr /*10*/:
                    this.a = nyt.j();
                    continue;
                case wi.dI /*16*/:
                    a = nyt.f();
                    switch (a) {
                        case wi.w /*0*/:
                        case wi.j /*1*/:
                        case wi.l /*2*/:
                        case wi.z /*3*/:
                        case wi.h /*4*/:
                            this.b = Integer.valueOf(a);
                            break;
                        default:
                            continue;
                    }
                case wi.dx /*26*/:
                    b = nzl.b(nyt, 26);
                    if (this.c == null) {
                        a = 0;
                    } else {
                        a = this.c.length;
                    }
                    obj = new ksx[(b + a)];
                    if (a != 0) {
                        System.arraycopy(this.c, 0, obj, 0, a);
                    }
                    while (a < obj.length - 1) {
                        obj[a] = new ksx();
                        nyt.a(obj[a]);
                        nyt.a();
                        a++;
                    }
                    obj[a] = new ksx();
                    nyt.a(obj[a]);
                    this.c = obj;
                    continue;
                case 32:
                    this.d = Long.valueOf(nyt.e());
                    continue;
                case 42:
                    if (this.e == null) {
                        this.e = new kss();
                    }
                    nyt.a(this.e);
                    continue;
                case 50:
                    this.f = nyt.j();
                    continue;
                case 56:
                    this.g = Boolean.valueOf(nyt.i());
                    continue;
                case 66:
                    if (this.h == null) {
                        this.h = new ksx();
                    }
                    nyt.a(this.h);
                    continue;
                case 72:
                    a = nyt.f();
                    switch (a) {
                        case wi.w /*0*/:
                        case wi.j /*1*/:
                        case wi.l /*2*/:
                        case wi.z /*3*/:
                        case wi.h /*4*/:
                            this.i = Integer.valueOf(a);
                            break;
                        default:
                            continue;
                    }
                case 82:
                    b = nzl.b(nyt, 82);
                    if (this.j == null) {
                        a = 0;
                    } else {
                        a = this.j.length;
                    }
                    obj = new ksx[(b + a)];
                    if (a != 0) {
                        System.arraycopy(this.j, 0, obj, 0, a);
                    }
                    while (a < obj.length - 1) {
                        obj[a] = new ksx();
                        nyt.a(obj[a]);
                        nyt.a();
                        a++;
                    }
                    obj[a] = new ksx();
                    nyt.a(obj[a]);
                    this.j = obj;
                    continue;
                case 88:
                    int b2 = nzl.b(nyt, 88);
                    Object obj2 = new int[b2];
                    i = 0;
                    b = 0;
                    while (i < b2) {
                        if (i != 0) {
                            nyt.a();
                        }
                        int f = nyt.f();
                        switch (f) {
                            case wi.w /*0*/:
                            case wi.j /*1*/:
                                a = b + 1;
                                obj2[b] = f;
                                break;
                            default:
                                a = b;
                                break;
                        }
                        i++;
                        b = a;
                    }
                    if (b != 0) {
                        a = this.k == null ? 0 : this.k.length;
                        if (a != 0 || b != obj2.length) {
                            Object obj3 = new int[(a + b)];
                            if (a != 0) {
                                System.arraycopy(this.k, 0, obj3, 0, a);
                            }
                            System.arraycopy(obj2, 0, obj3, a, b);
                            this.k = obj3;
                            break;
                        }
                        this.k = obj2;
                        break;
                    }
                    continue;
                case 90:
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
                        if (this.k == null) {
                            b = 0;
                        } else {
                            b = this.k.length;
                        }
                        Object obj4 = new int[(a + b)];
                        if (b != 0) {
                            System.arraycopy(this.k, 0, obj4, 0, b);
                        }
                        while (nyt.s() > 0) {
                            int f2 = nyt.f();
                            switch (f2) {
                                case wi.w /*0*/:
                                case wi.j /*1*/:
                                    a = b + 1;
                                    obj4[b] = f2;
                                    b = a;
                                    break;
                                default:
                                    break;
                            }
                        }
                        this.k = obj4;
                    }
                    nyt.e(i);
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
