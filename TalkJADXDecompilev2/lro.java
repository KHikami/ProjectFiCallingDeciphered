package defpackage;

public final class lro extends nyx<lro> {
    public ltr[] a;
    public Integer b;
    public Boolean c;
    public Boolean d;
    public int[] e;
    public lrp f;
    public lrp g;
    public lrp h;
    public lrp i;
    public lrp j;
    public lrp k;
    public byte[][] l;
    public byte[][] m;
    public Boolean n;
    public lup requestHeader;

    public /* synthetic */ nzf a(nyt nyt) {
        return b(nyt);
    }

    public lro() {
        d();
    }

    private lro d() {
        this.requestHeader = null;
        this.a = ltr.d();
        this.b = null;
        this.c = null;
        this.d = null;
        this.e = nzl.a;
        this.f = null;
        this.g = null;
        this.h = null;
        this.i = null;
        this.j = null;
        this.k = null;
        this.l = nzl.g;
        this.m = nzl.g;
        this.n = null;
        this.unknownFieldData = null;
        this.cachedSize = -1;
        return this;
    }

    public void a(nyu nyu) {
        int i = 0;
        if (this.requestHeader != null) {
            nyu.b(1, this.requestHeader);
        }
        if (this.l != null && this.l.length > 0) {
            for (byte[] bArr : this.l) {
                if (bArr != null) {
                    nyu.a(2, bArr);
                }
            }
        }
        if (this.m != null && this.m.length > 0) {
            for (byte[] bArr2 : this.m) {
                if (bArr2 != null) {
                    nyu.a(3, bArr2);
                }
            }
        }
        if (this.b != null) {
            nyu.a(4, this.b.intValue());
        }
        if (this.n != null) {
            nyu.a(5, this.n.booleanValue());
        }
        if (this.a != null && this.a.length > 0) {
            for (nzf nzf : this.a) {
                if (nzf != null) {
                    nyu.b(6, nzf);
                }
            }
        }
        if (this.c != null) {
            nyu.a(7, this.c.booleanValue());
        }
        if (this.g != null) {
            nyu.b(8, this.g);
        }
        if (this.h != null) {
            nyu.b(9, this.h);
        }
        if (this.i != null) {
            nyu.b(10, this.i);
        }
        if (this.j != null) {
            nyu.b(11, this.j);
        }
        if (this.k != null) {
            nyu.b(12, this.k);
        }
        if (this.f != null) {
            nyu.b(13, this.f);
        }
        if (this.d != null) {
            nyu.a(14, this.d.booleanValue());
        }
        if (this.e != null && this.e.length > 0) {
            while (i < this.e.length) {
                nyu.a(15, this.e[i]);
                i++;
            }
        }
        super.a(nyu);
    }

    protected int b() {
        int i;
        int i2;
        int i3;
        int i4 = 0;
        int b = super.b();
        if (this.requestHeader != null) {
            b += nyu.d(1, this.requestHeader);
        }
        if (this.l != null && this.l.length > 0) {
            i = 0;
            i2 = 0;
            for (byte[] bArr : this.l) {
                if (bArr != null) {
                    i2++;
                    i += nyu.b(bArr);
                }
            }
            b = (b + i) + (i2 * 1);
        }
        if (this.m != null && this.m.length > 0) {
            i = 0;
            i2 = 0;
            for (byte[] bArr2 : this.m) {
                if (bArr2 != null) {
                    i2++;
                    i += nyu.b(bArr2);
                }
            }
            b = (b + i) + (i2 * 1);
        }
        if (this.b != null) {
            b += nyu.f(4, this.b.intValue());
        }
        if (this.n != null) {
            this.n.booleanValue();
            b += nyu.h(5) + 1;
        }
        if (this.a != null && this.a.length > 0) {
            i3 = b;
            for (nzf nzf : this.a) {
                if (nzf != null) {
                    i3 += nyu.d(6, nzf);
                }
            }
            b = i3;
        }
        if (this.c != null) {
            this.c.booleanValue();
            b += nyu.h(7) + 1;
        }
        if (this.g != null) {
            b += nyu.d(8, this.g);
        }
        if (this.h != null) {
            b += nyu.d(9, this.h);
        }
        if (this.i != null) {
            b += nyu.d(10, this.i);
        }
        if (this.j != null) {
            b += nyu.d(11, this.j);
        }
        if (this.k != null) {
            b += nyu.d(12, this.k);
        }
        if (this.f != null) {
            b += nyu.d(13, this.f);
        }
        if (this.d != null) {
            this.d.booleanValue();
            b += nyu.h(14) + 1;
        }
        if (this.e == null || this.e.length <= 0) {
            return b;
        }
        i3 = 0;
        while (i4 < this.e.length) {
            i3 += nyu.g(this.e[i4]);
            i4++;
        }
        return (b + i3) + (this.e.length * 1);
    }

    private lro b(nyt nyt) {
        while (true) {
            int a = nyt.a();
            int b;
            Object obj;
            int i;
            switch (a) {
                case 0:
                    break;
                case 10:
                    if (this.requestHeader == null) {
                        this.requestHeader = new lup();
                    }
                    nyt.a(this.requestHeader);
                    continue;
                case wi.dH /*18*/:
                    b = nzl.b(nyt, 18);
                    a = this.l == null ? 0 : this.l.length;
                    obj = new byte[(b + a)][];
                    if (a != 0) {
                        System.arraycopy(this.l, 0, obj, 0, a);
                    }
                    while (a < obj.length - 1) {
                        obj[a] = nyt.k();
                        nyt.a();
                        a++;
                    }
                    obj[a] = nyt.k();
                    this.l = obj;
                    continue;
                case wi.dx /*26*/:
                    b = nzl.b(nyt, 26);
                    a = this.m == null ? 0 : this.m.length;
                    obj = new byte[(b + a)][];
                    if (a != 0) {
                        System.arraycopy(this.m, 0, obj, 0, a);
                    }
                    while (a < obj.length - 1) {
                        obj[a] = nyt.k();
                        nyt.a();
                        a++;
                    }
                    obj[a] = nyt.k();
                    this.m = obj;
                    continue;
                case 32:
                    this.b = Integer.valueOf(nyt.f());
                    continue;
                case 40:
                    this.n = Boolean.valueOf(nyt.i());
                    continue;
                case 50:
                    b = nzl.b(nyt, 50);
                    if (this.a == null) {
                        a = 0;
                    } else {
                        a = this.a.length;
                    }
                    obj = new ltr[(b + a)];
                    if (a != 0) {
                        System.arraycopy(this.a, 0, obj, 0, a);
                    }
                    while (a < obj.length - 1) {
                        obj[a] = new ltr();
                        nyt.a(obj[a]);
                        nyt.a();
                        a++;
                    }
                    obj[a] = new ltr();
                    nyt.a(obj[a]);
                    this.a = obj;
                    continue;
                case 56:
                    this.c = Boolean.valueOf(nyt.i());
                    continue;
                case 66:
                    if (this.g == null) {
                        this.g = new lrp();
                    }
                    nyt.a(this.g);
                    continue;
                case 74:
                    if (this.h == null) {
                        this.h = new lrp();
                    }
                    nyt.a(this.h);
                    continue;
                case 82:
                    if (this.i == null) {
                        this.i = new lrp();
                    }
                    nyt.a(this.i);
                    continue;
                case 90:
                    if (this.j == null) {
                        this.j = new lrp();
                    }
                    nyt.a(this.j);
                    continue;
                case 98:
                    if (this.k == null) {
                        this.k = new lrp();
                    }
                    nyt.a(this.k);
                    continue;
                case 106:
                    if (this.f == null) {
                        this.f = new lrp();
                    }
                    nyt.a(this.f);
                    continue;
                case 112:
                    this.d = Boolean.valueOf(nyt.i());
                    continue;
                case 120:
                    int b2 = nzl.b(nyt, 120);
                    Object obj2 = new int[b2];
                    i = 0;
                    b = 0;
                    while (i < b2) {
                        if (i != 0) {
                            nyt.a();
                        }
                        int f = nyt.f();
                        switch (f) {
                            case 0:
                            case 1:
                            case 2:
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
                        a = this.e == null ? 0 : this.e.length;
                        if (a != 0 || b != obj2.length) {
                            Object obj3 = new int[(a + b)];
                            if (a != 0) {
                                System.arraycopy(this.e, 0, obj3, 0, a);
                            }
                            System.arraycopy(obj2, 0, obj3, a, b);
                            this.e = obj3;
                            break;
                        }
                        this.e = obj2;
                        break;
                    }
                    continue;
                case 122:
                    i = nyt.d(nyt.r());
                    b = nyt.u();
                    a = 0;
                    while (nyt.s() > 0) {
                        switch (nyt.f()) {
                            case 0:
                            case 1:
                            case 2:
                                a++;
                                break;
                            default:
                                break;
                        }
                    }
                    if (a != 0) {
                        nyt.f(b);
                        if (this.e == null) {
                            b = 0;
                        } else {
                            b = this.e.length;
                        }
                        Object obj4 = new int[(a + b)];
                        if (b != 0) {
                            System.arraycopy(this.e, 0, obj4, 0, b);
                        }
                        while (nyt.s() > 0) {
                            int f2 = nyt.f();
                            switch (f2) {
                                case 0:
                                case 1:
                                case 2:
                                    a = b + 1;
                                    obj4[b] = f2;
                                    b = a;
                                    break;
                                default:
                                    break;
                            }
                        }
                        this.e = obj4;
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
