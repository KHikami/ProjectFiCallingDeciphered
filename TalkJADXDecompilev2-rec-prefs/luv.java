package p000;

public final class luv extends nyx<luv> {
    public String f26536a;
    public Integer f26537b;
    public Integer f26538c;
    public Boolean f26539d;
    public Boolean f26540e;
    public int[] f26541f;
    public byte[][] f26542g;
    public Boolean f26543h;
    public lup requestHeader;

    public /* synthetic */ nzf mo150a(nyt nyt) {
        return m30663b(nyt);
    }

    public luv() {
        m30664d();
    }

    private luv m30664d() {
        this.requestHeader = null;
        this.f26536a = null;
        this.f26537b = null;
        this.f26538c = null;
        this.f26539d = null;
        this.f26540e = null;
        this.f26541f = nzl.a;
        this.f26542g = nzl.g;
        this.f26543h = null;
        this.unknownFieldData = null;
        this.cachedSize = -1;
        return this;
    }

    public void mo146a(nyu nyu) {
        int i = 0;
        if (this.requestHeader != null) {
            nyu.b(1, this.requestHeader);
        }
        if (this.f26542g != null && this.f26542g.length > 0) {
            for (byte[] bArr : this.f26542g) {
                if (bArr != null) {
                    nyu.a(2, bArr);
                }
            }
        }
        if (this.f26536a != null) {
            nyu.a(3, this.f26536a);
        }
        if (this.f26537b != null) {
            nyu.a(4, this.f26537b.intValue());
        }
        if (this.f26543h != null) {
            nyu.a(5, this.f26543h.booleanValue());
        }
        if (this.f26539d != null) {
            nyu.a(6, this.f26539d.booleanValue());
        }
        if (this.f26540e != null) {
            nyu.a(7, this.f26540e.booleanValue());
        }
        if (this.f26541f != null && this.f26541f.length > 0) {
            while (i < this.f26541f.length) {
                nyu.a(8, this.f26541f[i]);
                i++;
            }
        }
        if (this.f26538c != null) {
            nyu.a(9, this.f26538c.intValue());
        }
        super.mo146a(nyu);
    }

    protected int mo147b() {
        int i;
        int i2 = 0;
        int b = super.mo147b();
        if (this.requestHeader != null) {
            b += nyu.d(1, this.requestHeader);
        }
        if (this.f26542g != null && this.f26542g.length > 0) {
            int i3 = 0;
            int i4 = 0;
            for (byte[] bArr : this.f26542g) {
                if (bArr != null) {
                    i4++;
                    i3 += nyu.b(bArr);
                }
            }
            b = (b + i3) + (i4 * 1);
        }
        if (this.f26536a != null) {
            b += nyu.b(3, this.f26536a);
        }
        if (this.f26537b != null) {
            b += nyu.f(4, this.f26537b.intValue());
        }
        if (this.f26543h != null) {
            this.f26543h.booleanValue();
            b += nyu.h(5) + 1;
        }
        if (this.f26539d != null) {
            this.f26539d.booleanValue();
            b += nyu.h(6) + 1;
        }
        if (this.f26540e != null) {
            this.f26540e.booleanValue();
            b += nyu.h(7) + 1;
        }
        if (this.f26541f != null && this.f26541f.length > 0) {
            i = 0;
            while (i2 < this.f26541f.length) {
                i += nyu.g(this.f26541f[i2]);
                i2++;
            }
            b = (b + i) + (this.f26541f.length * 1);
        }
        if (this.f26538c != null) {
            return b + nyu.f(9, this.f26538c.intValue());
        }
        return b;
    }

    private luv m30663b(nyt nyt) {
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
                    a = this.f26542g == null ? 0 : this.f26542g.length;
                    Object obj = new byte[(b + a)][];
                    if (a != 0) {
                        System.arraycopy(this.f26542g, 0, obj, 0, a);
                    }
                    while (a < obj.length - 1) {
                        obj[a] = nyt.k();
                        nyt.a();
                        a++;
                    }
                    obj[a] = nyt.k();
                    this.f26542g = obj;
                    continue;
                case wi.dx /*26*/:
                    this.f26536a = nyt.j();
                    continue;
                case 32:
                    this.f26537b = Integer.valueOf(nyt.f());
                    continue;
                case 40:
                    this.f26543h = Boolean.valueOf(nyt.i());
                    continue;
                case 48:
                    this.f26539d = Boolean.valueOf(nyt.i());
                    continue;
                case 56:
                    this.f26540e = Boolean.valueOf(nyt.i());
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
                        a = this.f26541f == null ? 0 : this.f26541f.length;
                        if (a != 0 || b != obj2.length) {
                            Object obj3 = new int[(a + b)];
                            if (a != 0) {
                                System.arraycopy(this.f26541f, 0, obj3, 0, a);
                            }
                            System.arraycopy(obj2, 0, obj3, a, b);
                            this.f26541f = obj3;
                            break;
                        }
                        this.f26541f = obj2;
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
                        if (this.f26541f == null) {
                            b = 0;
                        } else {
                            b = this.f26541f.length;
                        }
                        Object obj4 = new int[(a + b)];
                        if (b != 0) {
                            System.arraycopy(this.f26541f, 0, obj4, 0, b);
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
                        this.f26541f = obj4;
                    }
                    nyt.e(i);
                    continue;
                case 72:
                    this.f26538c = Integer.valueOf(nyt.f());
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
