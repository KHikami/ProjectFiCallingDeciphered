package defpackage;

public final class luv extends nyx<luv> {
    public String a;
    public Integer b;
    public Integer c;
    public Boolean d;
    public Boolean e;
    public int[] f;
    public byte[][] g;
    public Boolean h;
    public lup requestHeader;

    public /* synthetic */ nzf a(nyt nyt) {
        return b(nyt);
    }

    public luv() {
        d();
    }

    private luv d() {
        this.requestHeader = null;
        this.a = null;
        this.b = null;
        this.c = null;
        this.d = null;
        this.e = null;
        this.f = nzl.a;
        this.g = nzl.g;
        this.h = null;
        this.unknownFieldData = null;
        this.cachedSize = -1;
        return this;
    }

    public void a(nyu nyu) {
        int i = 0;
        if (this.requestHeader != null) {
            nyu.b(1, this.requestHeader);
        }
        if (this.g != null && this.g.length > 0) {
            for (byte[] bArr : this.g) {
                if (bArr != null) {
                    nyu.a(2, bArr);
                }
            }
        }
        if (this.a != null) {
            nyu.a(3, this.a);
        }
        if (this.b != null) {
            nyu.a(4, this.b.intValue());
        }
        if (this.h != null) {
            nyu.a(5, this.h.booleanValue());
        }
        if (this.d != null) {
            nyu.a(6, this.d.booleanValue());
        }
        if (this.e != null) {
            nyu.a(7, this.e.booleanValue());
        }
        if (this.f != null && this.f.length > 0) {
            while (i < this.f.length) {
                nyu.a(8, this.f[i]);
                i++;
            }
        }
        if (this.c != null) {
            nyu.a(9, this.c.intValue());
        }
        super.a(nyu);
    }

    protected int b() {
        int i;
        int i2 = 0;
        int b = super.b();
        if (this.requestHeader != null) {
            b += nyu.d(1, this.requestHeader);
        }
        if (this.g != null && this.g.length > 0) {
            int i3 = 0;
            int i4 = 0;
            for (byte[] bArr : this.g) {
                if (bArr != null) {
                    i4++;
                    i3 += nyu.b(bArr);
                }
            }
            b = (b + i3) + (i4 * 1);
        }
        if (this.a != null) {
            b += nyu.b(3, this.a);
        }
        if (this.b != null) {
            b += nyu.f(4, this.b.intValue());
        }
        if (this.h != null) {
            this.h.booleanValue();
            b += nyu.h(5) + 1;
        }
        if (this.d != null) {
            this.d.booleanValue();
            b += nyu.h(6) + 1;
        }
        if (this.e != null) {
            this.e.booleanValue();
            b += nyu.h(7) + 1;
        }
        if (this.f != null && this.f.length > 0) {
            i = 0;
            while (i2 < this.f.length) {
                i += nyu.g(this.f[i2]);
                i2++;
            }
            b = (b + i) + (this.f.length * 1);
        }
        if (this.c != null) {
            return b + nyu.f(9, this.c.intValue());
        }
        return b;
    }

    private luv b(nyt nyt) {
        while (true) {
            int a = nyt.a();
            int b;
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
                    a = this.g == null ? 0 : this.g.length;
                    Object obj = new byte[(b + a)][];
                    if (a != 0) {
                        System.arraycopy(this.g, 0, obj, 0, a);
                    }
                    while (a < obj.length - 1) {
                        obj[a] = nyt.k();
                        nyt.a();
                        a++;
                    }
                    obj[a] = nyt.k();
                    this.g = obj;
                    continue;
                case wi.dx /*26*/:
                    this.a = nyt.j();
                    continue;
                case 32:
                    this.b = Integer.valueOf(nyt.f());
                    continue;
                case 40:
                    this.h = Boolean.valueOf(nyt.i());
                    continue;
                case 48:
                    this.d = Boolean.valueOf(nyt.i());
                    continue;
                case 56:
                    this.e = Boolean.valueOf(nyt.i());
                    continue;
                case 64:
                    int b2 = nzl.b(nyt, 64);
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
                        a = this.f == null ? 0 : this.f.length;
                        if (a != 0 || b != obj2.length) {
                            Object obj3 = new int[(a + b)];
                            if (a != 0) {
                                System.arraycopy(this.f, 0, obj3, 0, a);
                            }
                            System.arraycopy(obj2, 0, obj3, a, b);
                            this.f = obj3;
                            break;
                        }
                        this.f = obj2;
                        break;
                    }
                    continue;
                case 66:
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
                        if (this.f == null) {
                            b = 0;
                        } else {
                            b = this.f.length;
                        }
                        Object obj4 = new int[(a + b)];
                        if (b != 0) {
                            System.arraycopy(this.f, 0, obj4, 0, b);
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
                        this.f = obj4;
                    }
                    nyt.e(i);
                    continue;
                case 72:
                    this.c = Integer.valueOf(nyt.f());
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
