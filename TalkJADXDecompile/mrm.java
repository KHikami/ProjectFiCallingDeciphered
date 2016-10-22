public final class mrm extends nyx<mrm> {
    public byte[] a;
    public int[] b;
    public byte[][] c;
    public byte[][] d;
    public int[] e;
    public Long f;

    public /* synthetic */ nzf a(nyt nyt) {
        return b(nyt);
    }

    public mrm() {
        d();
    }

    private mrm d() {
        this.a = null;
        this.b = nzl.a;
        this.c = nzl.g;
        this.d = nzl.g;
        this.e = nzl.a;
        this.f = null;
        this.unknownFieldData = null;
        this.cachedSize = -1;
        return this;
    }

    public void a(nyu nyu) {
        int i = 0;
        if (this.a != null) {
            nyu.a(1, this.a);
        }
        if (this.b != null && this.b.length > 0) {
            for (int a : this.b) {
                nyu.a(2, a);
            }
        }
        if (this.c != null && this.c.length > 0) {
            for (byte[] bArr : this.c) {
                if (bArr != null) {
                    nyu.a(3, bArr);
                }
            }
        }
        if (this.d != null && this.d.length > 0) {
            for (byte[] bArr2 : this.d) {
                if (bArr2 != null) {
                    nyu.a(4, bArr2);
                }
            }
        }
        if (this.e != null && this.e.length > 0) {
            while (i < this.e.length) {
                nyu.b(5, this.e[i]);
                i++;
            }
        }
        if (this.f != null) {
            nyu.c(6, this.f.longValue());
        }
        super.a(nyu);
    }

    protected int b() {
        int i;
        int i2;
        int i3 = 0;
        int b = super.b();
        if (this.a != null) {
            b += nyu.b(1, this.a);
        }
        if (this.b != null && this.b.length > 0) {
            i = 0;
            for (int g : this.b) {
                int g2;
                i += nyu.g(g2);
            }
            b = (b + i) + (this.b.length * 1);
        }
        if (this.c != null && this.c.length > 0) {
            i = 0;
            g2 = 0;
            for (byte[] bArr : this.c) {
                if (bArr != null) {
                    g2++;
                    i += nyu.b(bArr);
                }
            }
            b = (b + i) + (g2 * 1);
        }
        if (this.d != null && this.d.length > 0) {
            i2 = 0;
            i = 0;
            while (i3 < this.d.length) {
                byte[] bArr2 = this.d[i3];
                if (bArr2 != null) {
                    i++;
                    i2 += nyu.b(bArr2);
                }
                i3++;
            }
            b = (b + i2) + (i * 1);
        }
        if (this.e != null && this.e.length > 0) {
            b = (b + (this.e.length * 4)) + (this.e.length * 1);
        }
        if (this.f == null) {
            return b;
        }
        this.f.longValue();
        return b + (nyu.h(6) + 8);
    }

    private mrm b(nyt nyt) {
        while (true) {
            int a = nyt.a();
            int i;
            int i2;
            Object obj;
            Object obj2;
            switch (a) {
                case wi.w /*0*/:
                    break;
                case wi.dr /*10*/:
                    this.a = nyt.k();
                    continue;
                case wi.dI /*16*/:
                    int b = nzl.b(nyt, 16);
                    Object obj3 = new int[b];
                    i = 0;
                    i2 = 0;
                    while (i < b) {
                        if (i != 0) {
                            nyt.a();
                        }
                        int f = nyt.f();
                        switch (f) {
                            case wi.j /*1*/:
                            case wi.l /*2*/:
                            case wi.z /*3*/:
                                a = i2 + 1;
                                obj3[i2] = f;
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
                        if (a != 0 || i2 != obj3.length) {
                            obj = new int[(a + i2)];
                            if (a != 0) {
                                System.arraycopy(this.b, 0, obj, 0, a);
                            }
                            System.arraycopy(obj3, 0, obj, a, i2);
                            this.b = obj;
                            break;
                        }
                        this.b = obj3;
                        break;
                    }
                    continue;
                    break;
                case wi.dH /*18*/:
                    i = nyt.d(nyt.r());
                    i2 = nyt.u();
                    a = 0;
                    while (nyt.s() > 0) {
                        switch (nyt.f()) {
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
                        nyt.f(i2);
                        if (this.b == null) {
                            i2 = 0;
                        } else {
                            i2 = this.b.length;
                        }
                        Object obj4 = new int[(a + i2)];
                        if (i2 != 0) {
                            System.arraycopy(this.b, 0, obj4, 0, i2);
                        }
                        while (nyt.s() > 0) {
                            int f2 = nyt.f();
                            switch (f2) {
                                case wi.j /*1*/:
                                case wi.l /*2*/:
                                case wi.z /*3*/:
                                    a = i2 + 1;
                                    obj4[i2] = f2;
                                    i2 = a;
                                    break;
                                default:
                                    break;
                            }
                        }
                        this.b = obj4;
                    }
                    nyt.e(i);
                    continue;
                case wi.dx /*26*/:
                    i2 = nzl.b(nyt, 26);
                    a = this.c == null ? 0 : this.c.length;
                    obj2 = new byte[(i2 + a)][];
                    if (a != 0) {
                        System.arraycopy(this.c, 0, obj2, 0, a);
                    }
                    while (a < obj2.length - 1) {
                        obj2[a] = nyt.k();
                        nyt.a();
                        a++;
                    }
                    obj2[a] = nyt.k();
                    this.c = obj2;
                    continue;
                case 34:
                    i2 = nzl.b(nyt, 34);
                    a = this.d == null ? 0 : this.d.length;
                    obj2 = new byte[(i2 + a)][];
                    if (a != 0) {
                        System.arraycopy(this.d, 0, obj2, 0, a);
                    }
                    while (a < obj2.length - 1) {
                        obj2[a] = nyt.k();
                        nyt.a();
                        a++;
                    }
                    obj2[a] = nyt.k();
                    this.d = obj2;
                    continue;
                case 42:
                    a = nyt.r();
                    i2 = nyt.d(a);
                    i = a / 4;
                    a = this.e == null ? 0 : this.e.length;
                    obj = new int[(i + a)];
                    if (a != 0) {
                        System.arraycopy(this.e, 0, obj, 0, a);
                    }
                    while (a < obj.length) {
                        obj[a] = nyt.h();
                        a++;
                    }
                    this.e = obj;
                    nyt.e(i2);
                    continue;
                case 45:
                    i2 = nzl.b(nyt, 45);
                    a = this.e == null ? 0 : this.e.length;
                    obj2 = new int[(i2 + a)];
                    if (a != 0) {
                        System.arraycopy(this.e, 0, obj2, 0, a);
                    }
                    while (a < obj2.length - 1) {
                        obj2[a] = nyt.h();
                        nyt.a();
                        a++;
                    }
                    obj2[a] = nyt.h();
                    this.e = obj2;
                    continue;
                case 49:
                    this.f = Long.valueOf(nyt.g());
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
