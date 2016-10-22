package defpackage;

import nyt;
import nyu;
import nzl;

/* renamed from: lom */
public final class lom extends nyx<lom> {
    public lor a;
    public lqs b;
    public Integer c;
    public String d;
    public String e;
    public lon f;
    public lxf[] g;
    public Boolean h;
    public Integer i;
    public Integer j;
    public ltr[] k;
    public lot[] l;
    public Boolean m;
    public Boolean n;
    public int[] o;
    public Integer p;
    public byte[][] q;
    public byte[][] r;
    public Boolean s;
    public Integer t;

    public /* synthetic */ nzf a(nyt nyt) {
        return b(nyt);
    }

    public lom() {
        d();
    }

    private lom d() {
        this.a = null;
        this.b = null;
        this.d = null;
        this.e = null;
        this.f = null;
        this.g = lxf.d();
        this.h = null;
        this.k = ltr.d();
        this.l = lot.d();
        this.m = null;
        this.n = null;
        this.o = nzl.a;
        this.q = nzl.g;
        this.r = nzl.g;
        this.s = null;
        this.unknownFieldData = null;
        this.cachedSize = -1;
        return this;
    }

    public void a(nyu nyu) {
        int i = 0;
        if (this.a != null) {
            nyu.b(1, this.a);
        }
        if (this.c != null) {
            nyu.a(2, this.c.intValue());
        }
        if (this.d != null) {
            nyu.a(3, this.d);
        }
        if (this.f != null) {
            nyu.b(4, this.f);
        }
        if (this.q != null && this.q.length > 0) {
            for (byte[] bArr : this.q) {
                if (bArr != null) {
                    nyu.a(5, bArr);
                }
            }
        }
        if (this.r != null && this.r.length > 0) {
            for (byte[] bArr2 : this.r) {
                if (bArr2 != null) {
                    nyu.a(6, bArr2);
                }
            }
        }
        if (this.g != null && this.g.length > 0) {
            for (nzf nzf : this.g) {
                if (nzf != null) {
                    nyu.b(8, nzf);
                }
            }
        }
        if (this.h != null) {
            nyu.a(9, this.h.booleanValue());
        }
        if (this.i != null) {
            nyu.a(10, this.i.intValue());
        }
        if (this.j != null) {
            nyu.a(11, this.j.intValue());
        }
        if (this.s != null) {
            nyu.a(12, this.s.booleanValue());
        }
        if (this.k != null && this.k.length > 0) {
            for (nzf nzf2 : this.k) {
                if (nzf2 != null) {
                    nyu.b(13, nzf2);
                }
            }
        }
        if (this.l != null && this.l.length > 0) {
            for (nzf nzf22 : this.l) {
                if (nzf22 != null) {
                    nyu.b(14, nzf22);
                }
            }
        }
        if (this.m != null) {
            nyu.a(15, this.m.booleanValue());
        }
        if (this.n != null) {
            nyu.a(16, this.n.booleanValue());
        }
        if (this.b != null) {
            nyu.b(17, this.b);
        }
        if (this.o != null && this.o.length > 0) {
            while (i < this.o.length) {
                nyu.a(18, this.o[i]);
                i++;
            }
        }
        if (this.p != null) {
            nyu.a(19, this.p.intValue());
        }
        if (this.e != null) {
            nyu.a(20, this.e);
        }
        if (this.t != null) {
            nyu.a(22, this.t.intValue());
        }
        super.a(nyu);
    }

    protected int b() {
        int i;
        int i2;
        int i3;
        int i4 = 0;
        int b = super.b();
        if (this.a != null) {
            b += nyu.d(1, this.a);
        }
        if (this.c != null) {
            b += nyu.f(2, this.c.intValue());
        }
        if (this.d != null) {
            b += nyu.b(3, this.d);
        }
        if (this.f != null) {
            b += nyu.d(4, this.f);
        }
        if (this.q != null && this.q.length > 0) {
            i = 0;
            i2 = 0;
            for (byte[] bArr : this.q) {
                if (bArr != null) {
                    i2++;
                    i += nyu.b(bArr);
                }
            }
            b = (b + i) + (i2 * 1);
        }
        if (this.r != null && this.r.length > 0) {
            i = 0;
            i2 = 0;
            for (byte[] bArr2 : this.r) {
                if (bArr2 != null) {
                    i2++;
                    i += nyu.b(bArr2);
                }
            }
            b = (b + i) + (i2 * 1);
        }
        if (this.g != null && this.g.length > 0) {
            i3 = b;
            for (nzf nzf : this.g) {
                if (nzf != null) {
                    i3 += nyu.d(8, nzf);
                }
            }
            b = i3;
        }
        if (this.h != null) {
            this.h.booleanValue();
            b += nyu.h(9) + 1;
        }
        if (this.i != null) {
            b += nyu.f(10, this.i.intValue());
        }
        if (this.j != null) {
            b += nyu.f(11, this.j.intValue());
        }
        if (this.s != null) {
            this.s.booleanValue();
            b += nyu.h(12) + 1;
        }
        if (this.k != null && this.k.length > 0) {
            i3 = b;
            for (nzf nzf2 : this.k) {
                if (nzf2 != null) {
                    i3 += nyu.d(13, nzf2);
                }
            }
            b = i3;
        }
        if (this.l != null && this.l.length > 0) {
            i3 = b;
            for (nzf nzf22 : this.l) {
                if (nzf22 != null) {
                    i3 += nyu.d(14, nzf22);
                }
            }
            b = i3;
        }
        if (this.m != null) {
            this.m.booleanValue();
            b += nyu.h(15) + 1;
        }
        if (this.n != null) {
            this.n.booleanValue();
            b += nyu.h(16) + 1;
        }
        if (this.b != null) {
            b += nyu.d(17, this.b);
        }
        if (this.o != null && this.o.length > 0) {
            i3 = 0;
            while (i4 < this.o.length) {
                i3 += nyu.g(this.o[i4]);
                i4++;
            }
            b = (b + i3) + (this.o.length * 2);
        }
        if (this.p != null) {
            b += nyu.f(19, this.p.intValue());
        }
        if (this.e != null) {
            b += nyu.b(20, this.e);
        }
        if (this.t != null) {
            return b + nyu.f(22, this.t.intValue());
        }
        return b;
    }

    private lom b(nyt nyt) {
        while (true) {
            int a = nyt.a();
            int b;
            Object obj;
            int i;
            switch (a) {
                case wi.w /*0*/:
                    break;
                case wi.dr /*10*/:
                    if (this.a == null) {
                        this.a = new lor();
                    }
                    nyt.a(this.a);
                    continue;
                case wi.dI /*16*/:
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
                case wi.dx /*26*/:
                    this.d = nyt.j();
                    continue;
                case 34:
                    if (this.f == null) {
                        this.f = new lon();
                    }
                    nyt.a(this.f);
                    continue;
                case 42:
                    b = nzl.b(nyt, 42);
                    a = this.q == null ? 0 : this.q.length;
                    obj = new byte[(b + a)][];
                    if (a != 0) {
                        System.arraycopy(this.q, 0, obj, 0, a);
                    }
                    while (a < obj.length - 1) {
                        obj[a] = nyt.k();
                        nyt.a();
                        a++;
                    }
                    obj[a] = nyt.k();
                    this.q = obj;
                    continue;
                case 50:
                    b = nzl.b(nyt, 50);
                    a = this.r == null ? 0 : this.r.length;
                    obj = new byte[(b + a)][];
                    if (a != 0) {
                        System.arraycopy(this.r, 0, obj, 0, a);
                    }
                    while (a < obj.length - 1) {
                        obj[a] = nyt.k();
                        nyt.a();
                        a++;
                    }
                    obj[a] = nyt.k();
                    this.r = obj;
                    continue;
                case 66:
                    b = nzl.b(nyt, 66);
                    if (this.g == null) {
                        a = 0;
                    } else {
                        a = this.g.length;
                    }
                    obj = new lxf[(b + a)];
                    if (a != 0) {
                        System.arraycopy(this.g, 0, obj, 0, a);
                    }
                    while (a < obj.length - 1) {
                        obj[a] = new lxf();
                        nyt.a(obj[a]);
                        nyt.a();
                        a++;
                    }
                    obj[a] = new lxf();
                    nyt.a(obj[a]);
                    this.g = obj;
                    continue;
                case 72:
                    this.h = Boolean.valueOf(nyt.i());
                    continue;
                case 80:
                    a = nyt.f();
                    switch (a) {
                        case wi.j /*1*/:
                        case wi.l /*2*/:
                            this.i = Integer.valueOf(a);
                            break;
                        default:
                            continue;
                    }
                case 88:
                    a = nyt.f();
                    switch (a) {
                        case wi.j /*1*/:
                        case wi.l /*2*/:
                            this.j = Integer.valueOf(a);
                            break;
                        default:
                            continue;
                    }
                case 96:
                    this.s = Boolean.valueOf(nyt.i());
                    continue;
                case 106:
                    b = nzl.b(nyt, 106);
                    if (this.k == null) {
                        a = 0;
                    } else {
                        a = this.k.length;
                    }
                    obj = new ltr[(b + a)];
                    if (a != 0) {
                        System.arraycopy(this.k, 0, obj, 0, a);
                    }
                    while (a < obj.length - 1) {
                        obj[a] = new ltr();
                        nyt.a(obj[a]);
                        nyt.a();
                        a++;
                    }
                    obj[a] = new ltr();
                    nyt.a(obj[a]);
                    this.k = obj;
                    continue;
                case 114:
                    b = nzl.b(nyt, 114);
                    if (this.l == null) {
                        a = 0;
                    } else {
                        a = this.l.length;
                    }
                    obj = new lot[(b + a)];
                    if (a != 0) {
                        System.arraycopy(this.l, 0, obj, 0, a);
                    }
                    while (a < obj.length - 1) {
                        obj[a] = new lot();
                        nyt.a(obj[a]);
                        nyt.a();
                        a++;
                    }
                    obj[a] = new lot();
                    nyt.a(obj[a]);
                    this.l = obj;
                    continue;
                case 120:
                    this.m = Boolean.valueOf(nyt.i());
                    continue;
                case 128:
                    this.n = Boolean.valueOf(nyt.i());
                    continue;
                case 138:
                    if (this.b == null) {
                        this.b = new lqs();
                    }
                    nyt.a(this.b);
                    continue;
                case 144:
                    int b2 = nzl.b(nyt, 144);
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
                            case wi.l /*2*/:
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
                        a = this.o == null ? 0 : this.o.length;
                        if (a != 0 || b != obj2.length) {
                            Object obj3 = new int[(a + b)];
                            if (a != 0) {
                                System.arraycopy(this.o, 0, obj3, 0, a);
                            }
                            System.arraycopy(obj2, 0, obj3, a, b);
                            this.o = obj3;
                            break;
                        }
                        this.o = obj2;
                        break;
                    }
                    continue;
                case 146:
                    i = nyt.d(nyt.r());
                    b = nyt.u();
                    a = 0;
                    while (nyt.s() > 0) {
                        switch (nyt.f()) {
                            case wi.w /*0*/:
                            case wi.j /*1*/:
                            case wi.l /*2*/:
                                a++;
                                break;
                            default:
                                break;
                        }
                    }
                    if (a != 0) {
                        nyt.f(b);
                        if (this.o == null) {
                            b = 0;
                        } else {
                            b = this.o.length;
                        }
                        Object obj4 = new int[(a + b)];
                        if (b != 0) {
                            System.arraycopy(this.o, 0, obj4, 0, b);
                        }
                        while (nyt.s() > 0) {
                            int f2 = nyt.f();
                            switch (f2) {
                                case wi.w /*0*/:
                                case wi.j /*1*/:
                                case wi.l /*2*/:
                                    a = b + 1;
                                    obj4[b] = f2;
                                    b = a;
                                    break;
                                default:
                                    break;
                            }
                        }
                        this.o = obj4;
                    }
                    nyt.e(i);
                    continue;
                case 152:
                    a = nyt.f();
                    switch (a) {
                        case wi.w /*0*/:
                        case wi.j /*1*/:
                        case wi.l /*2*/:
                        case wi.z /*3*/:
                            this.p = Integer.valueOf(a);
                            break;
                        default:
                            continue;
                    }
                case 162:
                    this.e = nyt.j();
                    continue;
                case 176:
                    a = nyt.f();
                    switch (a) {
                        case wi.w /*0*/:
                        case wi.j /*1*/:
                        case wi.l /*2*/:
                        case wi.z /*3*/:
                            this.t = Integer.valueOf(a);
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
