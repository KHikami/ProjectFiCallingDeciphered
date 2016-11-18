package p000;

public final class lro extends nyx<lro> {
    public ltr[] f26244a;
    public Integer f26245b;
    public Boolean f26246c;
    public Boolean f26247d;
    public int[] f26248e;
    public lrp f26249f;
    public lrp f26250g;
    public lrp f26251h;
    public lrp f26252i;
    public lrp f26253j;
    public lrp f26254k;
    public byte[][] f26255l;
    public byte[][] f26256m;
    public Boolean f26257n;
    public lup requestHeader;

    public /* synthetic */ nzf mo150a(nyt nyt) {
        return m30201b(nyt);
    }

    public lro() {
        m30202d();
    }

    private lro m30202d() {
        this.requestHeader = null;
        this.f26244a = ltr.m30492d();
        this.f26245b = null;
        this.f26246c = null;
        this.f26247d = null;
        this.f26248e = nzl.a;
        this.f26249f = null;
        this.f26250g = null;
        this.f26251h = null;
        this.f26252i = null;
        this.f26253j = null;
        this.f26254k = null;
        this.f26255l = nzl.g;
        this.f26256m = nzl.g;
        this.f26257n = null;
        this.unknownFieldData = null;
        this.cachedSize = -1;
        return this;
    }

    public void mo146a(nyu nyu) {
        int i = 0;
        if (this.requestHeader != null) {
            nyu.b(1, this.requestHeader);
        }
        if (this.f26255l != null && this.f26255l.length > 0) {
            for (byte[] bArr : this.f26255l) {
                if (bArr != null) {
                    nyu.a(2, bArr);
                }
            }
        }
        if (this.f26256m != null && this.f26256m.length > 0) {
            for (byte[] bArr2 : this.f26256m) {
                if (bArr2 != null) {
                    nyu.a(3, bArr2);
                }
            }
        }
        if (this.f26245b != null) {
            nyu.a(4, this.f26245b.intValue());
        }
        if (this.f26257n != null) {
            nyu.a(5, this.f26257n.booleanValue());
        }
        if (this.f26244a != null && this.f26244a.length > 0) {
            for (nzf nzf : this.f26244a) {
                if (nzf != null) {
                    nyu.b(6, nzf);
                }
            }
        }
        if (this.f26246c != null) {
            nyu.a(7, this.f26246c.booleanValue());
        }
        if (this.f26250g != null) {
            nyu.b(8, this.f26250g);
        }
        if (this.f26251h != null) {
            nyu.b(9, this.f26251h);
        }
        if (this.f26252i != null) {
            nyu.b(10, this.f26252i);
        }
        if (this.f26253j != null) {
            nyu.b(11, this.f26253j);
        }
        if (this.f26254k != null) {
            nyu.b(12, this.f26254k);
        }
        if (this.f26249f != null) {
            nyu.b(13, this.f26249f);
        }
        if (this.f26247d != null) {
            nyu.a(14, this.f26247d.booleanValue());
        }
        if (this.f26248e != null && this.f26248e.length > 0) {
            while (i < this.f26248e.length) {
                nyu.a(15, this.f26248e[i]);
                i++;
            }
        }
        super.mo146a(nyu);
    }

    protected int mo147b() {
        int i;
        int i2;
        int i3;
        int i4 = 0;
        int b = super.mo147b();
        if (this.requestHeader != null) {
            b += nyu.d(1, this.requestHeader);
        }
        if (this.f26255l != null && this.f26255l.length > 0) {
            i = 0;
            i2 = 0;
            for (byte[] bArr : this.f26255l) {
                if (bArr != null) {
                    i2++;
                    i += nyu.b(bArr);
                }
            }
            b = (b + i) + (i2 * 1);
        }
        if (this.f26256m != null && this.f26256m.length > 0) {
            i = 0;
            i2 = 0;
            for (byte[] bArr2 : this.f26256m) {
                if (bArr2 != null) {
                    i2++;
                    i += nyu.b(bArr2);
                }
            }
            b = (b + i) + (i2 * 1);
        }
        if (this.f26245b != null) {
            b += nyu.f(4, this.f26245b.intValue());
        }
        if (this.f26257n != null) {
            this.f26257n.booleanValue();
            b += nyu.h(5) + 1;
        }
        if (this.f26244a != null && this.f26244a.length > 0) {
            i3 = b;
            for (nzf nzf : this.f26244a) {
                if (nzf != null) {
                    i3 += nyu.d(6, nzf);
                }
            }
            b = i3;
        }
        if (this.f26246c != null) {
            this.f26246c.booleanValue();
            b += nyu.h(7) + 1;
        }
        if (this.f26250g != null) {
            b += nyu.d(8, this.f26250g);
        }
        if (this.f26251h != null) {
            b += nyu.d(9, this.f26251h);
        }
        if (this.f26252i != null) {
            b += nyu.d(10, this.f26252i);
        }
        if (this.f26253j != null) {
            b += nyu.d(11, this.f26253j);
        }
        if (this.f26254k != null) {
            b += nyu.d(12, this.f26254k);
        }
        if (this.f26249f != null) {
            b += nyu.d(13, this.f26249f);
        }
        if (this.f26247d != null) {
            this.f26247d.booleanValue();
            b += nyu.h(14) + 1;
        }
        if (this.f26248e == null || this.f26248e.length <= 0) {
            return b;
        }
        i3 = 0;
        while (i4 < this.f26248e.length) {
            i3 += nyu.g(this.f26248e[i4]);
            i4++;
        }
        return (b + i3) + (this.f26248e.length * 1);
    }

    private lro m30201b(nyt nyt) {
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
                    a = this.f26255l == null ? 0 : this.f26255l.length;
                    obj = new byte[(b + a)][];
                    if (a != 0) {
                        System.arraycopy(this.f26255l, 0, obj, 0, a);
                    }
                    while (a < obj.length - 1) {
                        obj[a] = nyt.k();
                        nyt.a();
                        a++;
                    }
                    obj[a] = nyt.k();
                    this.f26255l = obj;
                    continue;
                case wi.dx /*26*/:
                    b = nzl.b(nyt, 26);
                    a = this.f26256m == null ? 0 : this.f26256m.length;
                    obj = new byte[(b + a)][];
                    if (a != 0) {
                        System.arraycopy(this.f26256m, 0, obj, 0, a);
                    }
                    while (a < obj.length - 1) {
                        obj[a] = nyt.k();
                        nyt.a();
                        a++;
                    }
                    obj[a] = nyt.k();
                    this.f26256m = obj;
                    continue;
                case 32:
                    this.f26245b = Integer.valueOf(nyt.f());
                    continue;
                case 40:
                    this.f26257n = Boolean.valueOf(nyt.i());
                    continue;
                case 50:
                    b = nzl.b(nyt, 50);
                    if (this.f26244a == null) {
                        a = 0;
                    } else {
                        a = this.f26244a.length;
                    }
                    obj = new ltr[(b + a)];
                    if (a != 0) {
                        System.arraycopy(this.f26244a, 0, obj, 0, a);
                    }
                    while (a < obj.length - 1) {
                        obj[a] = new ltr();
                        nyt.a(obj[a]);
                        nyt.a();
                        a++;
                    }
                    obj[a] = new ltr();
                    nyt.a(obj[a]);
                    this.f26244a = obj;
                    continue;
                case 56:
                    this.f26246c = Boolean.valueOf(nyt.i());
                    continue;
                case 66:
                    if (this.f26250g == null) {
                        this.f26250g = new lrp();
                    }
                    nyt.a(this.f26250g);
                    continue;
                case 74:
                    if (this.f26251h == null) {
                        this.f26251h = new lrp();
                    }
                    nyt.a(this.f26251h);
                    continue;
                case 82:
                    if (this.f26252i == null) {
                        this.f26252i = new lrp();
                    }
                    nyt.a(this.f26252i);
                    continue;
                case 90:
                    if (this.f26253j == null) {
                        this.f26253j = new lrp();
                    }
                    nyt.a(this.f26253j);
                    continue;
                case 98:
                    if (this.f26254k == null) {
                        this.f26254k = new lrp();
                    }
                    nyt.a(this.f26254k);
                    continue;
                case 106:
                    if (this.f26249f == null) {
                        this.f26249f = new lrp();
                    }
                    nyt.a(this.f26249f);
                    continue;
                case 112:
                    this.f26247d = Boolean.valueOf(nyt.i());
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
                        a = this.f26248e == null ? 0 : this.f26248e.length;
                        if (a != 0 || b != obj2.length) {
                            Object obj3 = new int[(a + b)];
                            if (a != 0) {
                                System.arraycopy(this.f26248e, 0, obj3, 0, a);
                            }
                            System.arraycopy(obj2, 0, obj3, a, b);
                            this.f26248e = obj3;
                            break;
                        }
                        this.f26248e = obj2;
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
                        if (this.f26248e == null) {
                            b = 0;
                        } else {
                            b = this.f26248e.length;
                        }
                        Object obj4 = new int[(a + b)];
                        if (b != 0) {
                            System.arraycopy(this.f26248e, 0, obj4, 0, b);
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
                        this.f26248e = obj4;
                    }
                    nyt.e(i);
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
