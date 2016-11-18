package p000;

public final class lom extends nyx<lom> {
    public lor f25886a;
    public lqs f25887b;
    public Integer f25888c;
    public String f25889d;
    public String f25890e;
    public lon f25891f;
    public lxf[] f25892g;
    public Boolean f25893h;
    public Integer f25894i;
    public Integer f25895j;
    public ltr[] f25896k;
    public lot[] f25897l;
    public Boolean f25898m;
    public Boolean f25899n;
    public int[] f25900o;
    public Integer f25901p;
    public byte[][] f25902q;
    public byte[][] f25903r;
    public Boolean f25904s;
    public Integer f25905t;

    public /* synthetic */ nzf mo150a(nyt nyt) {
        return m29765b(nyt);
    }

    public lom() {
        m29766d();
    }

    private lom m29766d() {
        this.f25886a = null;
        this.f25887b = null;
        this.f25889d = null;
        this.f25890e = null;
        this.f25891f = null;
        this.f25892g = lxf.m30982d();
        this.f25893h = null;
        this.f25896k = ltr.m30492d();
        this.f25897l = lot.m29802d();
        this.f25898m = null;
        this.f25899n = null;
        this.f25900o = nzl.a;
        this.f25902q = nzl.g;
        this.f25903r = nzl.g;
        this.f25904s = null;
        this.unknownFieldData = null;
        this.cachedSize = -1;
        return this;
    }

    public void mo146a(nyu nyu) {
        int i = 0;
        if (this.f25886a != null) {
            nyu.b(1, this.f25886a);
        }
        if (this.f25888c != null) {
            nyu.a(2, this.f25888c.intValue());
        }
        if (this.f25889d != null) {
            nyu.a(3, this.f25889d);
        }
        if (this.f25891f != null) {
            nyu.b(4, this.f25891f);
        }
        if (this.f25902q != null && this.f25902q.length > 0) {
            for (byte[] bArr : this.f25902q) {
                if (bArr != null) {
                    nyu.a(5, bArr);
                }
            }
        }
        if (this.f25903r != null && this.f25903r.length > 0) {
            for (byte[] bArr2 : this.f25903r) {
                if (bArr2 != null) {
                    nyu.a(6, bArr2);
                }
            }
        }
        if (this.f25892g != null && this.f25892g.length > 0) {
            for (nzf nzf : this.f25892g) {
                if (nzf != null) {
                    nyu.b(8, nzf);
                }
            }
        }
        if (this.f25893h != null) {
            nyu.a(9, this.f25893h.booleanValue());
        }
        if (this.f25894i != null) {
            nyu.a(10, this.f25894i.intValue());
        }
        if (this.f25895j != null) {
            nyu.a(11, this.f25895j.intValue());
        }
        if (this.f25904s != null) {
            nyu.a(12, this.f25904s.booleanValue());
        }
        if (this.f25896k != null && this.f25896k.length > 0) {
            for (nzf nzf2 : this.f25896k) {
                if (nzf2 != null) {
                    nyu.b(13, nzf2);
                }
            }
        }
        if (this.f25897l != null && this.f25897l.length > 0) {
            for (nzf nzf22 : this.f25897l) {
                if (nzf22 != null) {
                    nyu.b(14, nzf22);
                }
            }
        }
        if (this.f25898m != null) {
            nyu.a(15, this.f25898m.booleanValue());
        }
        if (this.f25899n != null) {
            nyu.a(16, this.f25899n.booleanValue());
        }
        if (this.f25887b != null) {
            nyu.b(17, this.f25887b);
        }
        if (this.f25900o != null && this.f25900o.length > 0) {
            while (i < this.f25900o.length) {
                nyu.a(18, this.f25900o[i]);
                i++;
            }
        }
        if (this.f25901p != null) {
            nyu.a(19, this.f25901p.intValue());
        }
        if (this.f25890e != null) {
            nyu.a(20, this.f25890e);
        }
        if (this.f25905t != null) {
            nyu.a(22, this.f25905t.intValue());
        }
        super.mo146a(nyu);
    }

    protected int mo147b() {
        int i;
        int i2;
        int i3;
        int i4 = 0;
        int b = super.mo147b();
        if (this.f25886a != null) {
            b += nyu.d(1, this.f25886a);
        }
        if (this.f25888c != null) {
            b += nyu.f(2, this.f25888c.intValue());
        }
        if (this.f25889d != null) {
            b += nyu.b(3, this.f25889d);
        }
        if (this.f25891f != null) {
            b += nyu.d(4, this.f25891f);
        }
        if (this.f25902q != null && this.f25902q.length > 0) {
            i = 0;
            i2 = 0;
            for (byte[] bArr : this.f25902q) {
                if (bArr != null) {
                    i2++;
                    i += nyu.b(bArr);
                }
            }
            b = (b + i) + (i2 * 1);
        }
        if (this.f25903r != null && this.f25903r.length > 0) {
            i = 0;
            i2 = 0;
            for (byte[] bArr2 : this.f25903r) {
                if (bArr2 != null) {
                    i2++;
                    i += nyu.b(bArr2);
                }
            }
            b = (b + i) + (i2 * 1);
        }
        if (this.f25892g != null && this.f25892g.length > 0) {
            i3 = b;
            for (nzf nzf : this.f25892g) {
                if (nzf != null) {
                    i3 += nyu.d(8, nzf);
                }
            }
            b = i3;
        }
        if (this.f25893h != null) {
            this.f25893h.booleanValue();
            b += nyu.h(9) + 1;
        }
        if (this.f25894i != null) {
            b += nyu.f(10, this.f25894i.intValue());
        }
        if (this.f25895j != null) {
            b += nyu.f(11, this.f25895j.intValue());
        }
        if (this.f25904s != null) {
            this.f25904s.booleanValue();
            b += nyu.h(12) + 1;
        }
        if (this.f25896k != null && this.f25896k.length > 0) {
            i3 = b;
            for (nzf nzf2 : this.f25896k) {
                if (nzf2 != null) {
                    i3 += nyu.d(13, nzf2);
                }
            }
            b = i3;
        }
        if (this.f25897l != null && this.f25897l.length > 0) {
            i3 = b;
            for (nzf nzf22 : this.f25897l) {
                if (nzf22 != null) {
                    i3 += nyu.d(14, nzf22);
                }
            }
            b = i3;
        }
        if (this.f25898m != null) {
            this.f25898m.booleanValue();
            b += nyu.h(15) + 1;
        }
        if (this.f25899n != null) {
            this.f25899n.booleanValue();
            b += nyu.h(16) + 1;
        }
        if (this.f25887b != null) {
            b += nyu.d(17, this.f25887b);
        }
        if (this.f25900o != null && this.f25900o.length > 0) {
            i3 = 0;
            while (i4 < this.f25900o.length) {
                i3 += nyu.g(this.f25900o[i4]);
                i4++;
            }
            b = (b + i3) + (this.f25900o.length * 2);
        }
        if (this.f25901p != null) {
            b += nyu.f(19, this.f25901p.intValue());
        }
        if (this.f25890e != null) {
            b += nyu.b(20, this.f25890e);
        }
        if (this.f25905t != null) {
            return b + nyu.f(22, this.f25905t.intValue());
        }
        return b;
    }

    private lom m29765b(nyt nyt) {
        while (true) {
            int a = nyt.a();
            int b;
            Object obj;
            int i;
            switch (a) {
                case 0:
                    break;
                case 10:
                    if (this.f25886a == null) {
                        this.f25886a = new lor();
                    }
                    nyt.a(this.f25886a);
                    continue;
                case 16:
                    a = nyt.f();
                    switch (a) {
                        case 0:
                        case 1:
                        case 2:
                            this.f25888c = Integer.valueOf(a);
                            break;
                        default:
                            continue;
                    }
                case wi.dx /*26*/:
                    this.f25889d = nyt.j();
                    continue;
                case 34:
                    if (this.f25891f == null) {
                        this.f25891f = new lon();
                    }
                    nyt.a(this.f25891f);
                    continue;
                case 42:
                    b = nzl.b(nyt, 42);
                    a = this.f25902q == null ? 0 : this.f25902q.length;
                    obj = new byte[(b + a)][];
                    if (a != 0) {
                        System.arraycopy(this.f25902q, 0, obj, 0, a);
                    }
                    while (a < obj.length - 1) {
                        obj[a] = nyt.k();
                        nyt.a();
                        a++;
                    }
                    obj[a] = nyt.k();
                    this.f25902q = obj;
                    continue;
                case 50:
                    b = nzl.b(nyt, 50);
                    a = this.f25903r == null ? 0 : this.f25903r.length;
                    obj = new byte[(b + a)][];
                    if (a != 0) {
                        System.arraycopy(this.f25903r, 0, obj, 0, a);
                    }
                    while (a < obj.length - 1) {
                        obj[a] = nyt.k();
                        nyt.a();
                        a++;
                    }
                    obj[a] = nyt.k();
                    this.f25903r = obj;
                    continue;
                case 66:
                    b = nzl.b(nyt, 66);
                    if (this.f25892g == null) {
                        a = 0;
                    } else {
                        a = this.f25892g.length;
                    }
                    obj = new lxf[(b + a)];
                    if (a != 0) {
                        System.arraycopy(this.f25892g, 0, obj, 0, a);
                    }
                    while (a < obj.length - 1) {
                        obj[a] = new lxf();
                        nyt.a(obj[a]);
                        nyt.a();
                        a++;
                    }
                    obj[a] = new lxf();
                    nyt.a(obj[a]);
                    this.f25892g = obj;
                    continue;
                case 72:
                    this.f25893h = Boolean.valueOf(nyt.i());
                    continue;
                case 80:
                    a = nyt.f();
                    switch (a) {
                        case 1:
                        case 2:
                            this.f25894i = Integer.valueOf(a);
                            break;
                        default:
                            continue;
                    }
                case 88:
                    a = nyt.f();
                    switch (a) {
                        case 1:
                        case 2:
                            this.f25895j = Integer.valueOf(a);
                            break;
                        default:
                            continue;
                    }
                case 96:
                    this.f25904s = Boolean.valueOf(nyt.i());
                    continue;
                case 106:
                    b = nzl.b(nyt, 106);
                    if (this.f25896k == null) {
                        a = 0;
                    } else {
                        a = this.f25896k.length;
                    }
                    obj = new ltr[(b + a)];
                    if (a != 0) {
                        System.arraycopy(this.f25896k, 0, obj, 0, a);
                    }
                    while (a < obj.length - 1) {
                        obj[a] = new ltr();
                        nyt.a(obj[a]);
                        nyt.a();
                        a++;
                    }
                    obj[a] = new ltr();
                    nyt.a(obj[a]);
                    this.f25896k = obj;
                    continue;
                case 114:
                    b = nzl.b(nyt, 114);
                    if (this.f25897l == null) {
                        a = 0;
                    } else {
                        a = this.f25897l.length;
                    }
                    obj = new lot[(b + a)];
                    if (a != 0) {
                        System.arraycopy(this.f25897l, 0, obj, 0, a);
                    }
                    while (a < obj.length - 1) {
                        obj[a] = new lot();
                        nyt.a(obj[a]);
                        nyt.a();
                        a++;
                    }
                    obj[a] = new lot();
                    nyt.a(obj[a]);
                    this.f25897l = obj;
                    continue;
                case 120:
                    this.f25898m = Boolean.valueOf(nyt.i());
                    continue;
                case 128:
                    this.f25899n = Boolean.valueOf(nyt.i());
                    continue;
                case 138:
                    if (this.f25887b == null) {
                        this.f25887b = new lqs();
                    }
                    nyt.a(this.f25887b);
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
                        a = this.f25900o == null ? 0 : this.f25900o.length;
                        if (a != 0 || b != obj2.length) {
                            Object obj3 = new int[(a + b)];
                            if (a != 0) {
                                System.arraycopy(this.f25900o, 0, obj3, 0, a);
                            }
                            System.arraycopy(obj2, 0, obj3, a, b);
                            this.f25900o = obj3;
                            break;
                        }
                        this.f25900o = obj2;
                        break;
                    }
                    continue;
                case 146:
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
                        if (this.f25900o == null) {
                            b = 0;
                        } else {
                            b = this.f25900o.length;
                        }
                        Object obj4 = new int[(a + b)];
                        if (b != 0) {
                            System.arraycopy(this.f25900o, 0, obj4, 0, b);
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
                        this.f25900o = obj4;
                    }
                    nyt.e(i);
                    continue;
                case 152:
                    a = nyt.f();
                    switch (a) {
                        case 0:
                        case 1:
                        case 2:
                        case 3:
                            this.f25901p = Integer.valueOf(a);
                            break;
                        default:
                            continue;
                    }
                case 162:
                    this.f25890e = nyt.j();
                    continue;
                case 176:
                    a = nyt.f();
                    switch (a) {
                        case 0:
                        case 1:
                        case 2:
                        case 3:
                            this.f25905t = Integer.valueOf(a);
                            break;
                        default:
                            continue;
                    }
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
