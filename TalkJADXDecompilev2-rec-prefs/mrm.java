package p000;

public final class mrm extends nyx<mrm> {
    public byte[] f28176a;
    public int[] f28177b;
    public byte[][] f28178c;
    public byte[][] f28179d;
    public int[] f28180e;
    public Long f28181f;

    public /* synthetic */ nzf mo150a(nyt nyt) {
        return m32767b(nyt);
    }

    public mrm() {
        m32768d();
    }

    private mrm m32768d() {
        this.f28176a = null;
        this.f28177b = nzl.a;
        this.f28178c = nzl.g;
        this.f28179d = nzl.g;
        this.f28180e = nzl.a;
        this.f28181f = null;
        this.unknownFieldData = null;
        this.cachedSize = -1;
        return this;
    }

    public void mo146a(nyu nyu) {
        int i = 0;
        if (this.f28176a != null) {
            nyu.a(1, this.f28176a);
        }
        if (this.f28177b != null && this.f28177b.length > 0) {
            for (int a : this.f28177b) {
                nyu.a(2, a);
            }
        }
        if (this.f28178c != null && this.f28178c.length > 0) {
            for (byte[] bArr : this.f28178c) {
                if (bArr != null) {
                    nyu.a(3, bArr);
                }
            }
        }
        if (this.f28179d != null && this.f28179d.length > 0) {
            for (byte[] bArr2 : this.f28179d) {
                if (bArr2 != null) {
                    nyu.a(4, bArr2);
                }
            }
        }
        if (this.f28180e != null && this.f28180e.length > 0) {
            while (i < this.f28180e.length) {
                nyu.b(5, this.f28180e[i]);
                i++;
            }
        }
        if (this.f28181f != null) {
            nyu.c(6, this.f28181f.longValue());
        }
        super.mo146a(nyu);
    }

    protected int mo147b() {
        int i;
        int i2;
        int i3 = 0;
        int b = super.mo147b();
        if (this.f28176a != null) {
            b += nyu.b(1, this.f28176a);
        }
        if (this.f28177b != null && this.f28177b.length > 0) {
            i = 0;
            for (int g : this.f28177b) {
                int g2;
                i += nyu.g(g2);
            }
            b = (b + i) + (this.f28177b.length * 1);
        }
        if (this.f28178c != null && this.f28178c.length > 0) {
            i = 0;
            g2 = 0;
            for (byte[] bArr : this.f28178c) {
                if (bArr != null) {
                    g2++;
                    i += nyu.b(bArr);
                }
            }
            b = (b + i) + (g2 * 1);
        }
        if (this.f28179d != null && this.f28179d.length > 0) {
            i2 = 0;
            i = 0;
            while (i3 < this.f28179d.length) {
                byte[] bArr2 = this.f28179d[i3];
                if (bArr2 != null) {
                    i++;
                    i2 += nyu.b(bArr2);
                }
                i3++;
            }
            b = (b + i2) + (i * 1);
        }
        if (this.f28180e != null && this.f28180e.length > 0) {
            b = (b + (this.f28180e.length * 4)) + (this.f28180e.length * 1);
        }
        if (this.f28181f == null) {
            return b;
        }
        this.f28181f.longValue();
        return b + (nyu.h(6) + 8);
    }

    private mrm m32767b(nyt nyt) {
        while (true) {
            int a = nyt.a();
            int i;
            int i2;
            Object obj;
            Object obj2;
            switch (a) {
                case 0:
                    break;
                case 10:
                    this.f28176a = nyt.k();
                    continue;
                case 16:
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
                            case 1:
                            case 2:
                            case 3:
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
                        a = this.f28177b == null ? 0 : this.f28177b.length;
                        if (a != 0 || i2 != obj3.length) {
                            obj = new int[(a + i2)];
                            if (a != 0) {
                                System.arraycopy(this.f28177b, 0, obj, 0, a);
                            }
                            System.arraycopy(obj3, 0, obj, a, i2);
                            this.f28177b = obj;
                            break;
                        }
                        this.f28177b = obj3;
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
                            case 1:
                            case 2:
                            case 3:
                                a++;
                                break;
                            default:
                                break;
                        }
                    }
                    if (a != 0) {
                        nyt.f(i2);
                        if (this.f28177b == null) {
                            i2 = 0;
                        } else {
                            i2 = this.f28177b.length;
                        }
                        Object obj4 = new int[(a + i2)];
                        if (i2 != 0) {
                            System.arraycopy(this.f28177b, 0, obj4, 0, i2);
                        }
                        while (nyt.s() > 0) {
                            int f2 = nyt.f();
                            switch (f2) {
                                case 1:
                                case 2:
                                case 3:
                                    a = i2 + 1;
                                    obj4[i2] = f2;
                                    i2 = a;
                                    break;
                                default:
                                    break;
                            }
                        }
                        this.f28177b = obj4;
                    }
                    nyt.e(i);
                    continue;
                case wi.dx /*26*/:
                    i2 = nzl.b(nyt, 26);
                    a = this.f28178c == null ? 0 : this.f28178c.length;
                    obj2 = new byte[(i2 + a)][];
                    if (a != 0) {
                        System.arraycopy(this.f28178c, 0, obj2, 0, a);
                    }
                    while (a < obj2.length - 1) {
                        obj2[a] = nyt.k();
                        nyt.a();
                        a++;
                    }
                    obj2[a] = nyt.k();
                    this.f28178c = obj2;
                    continue;
                case 34:
                    i2 = nzl.b(nyt, 34);
                    a = this.f28179d == null ? 0 : this.f28179d.length;
                    obj2 = new byte[(i2 + a)][];
                    if (a != 0) {
                        System.arraycopy(this.f28179d, 0, obj2, 0, a);
                    }
                    while (a < obj2.length - 1) {
                        obj2[a] = nyt.k();
                        nyt.a();
                        a++;
                    }
                    obj2[a] = nyt.k();
                    this.f28179d = obj2;
                    continue;
                case 42:
                    a = nyt.r();
                    i2 = nyt.d(a);
                    i = a / 4;
                    a = this.f28180e == null ? 0 : this.f28180e.length;
                    obj = new int[(i + a)];
                    if (a != 0) {
                        System.arraycopy(this.f28180e, 0, obj, 0, a);
                    }
                    while (a < obj.length) {
                        obj[a] = nyt.h();
                        a++;
                    }
                    this.f28180e = obj;
                    nyt.e(i2);
                    continue;
                case 45:
                    i2 = nzl.b(nyt, 45);
                    a = this.f28180e == null ? 0 : this.f28180e.length;
                    obj2 = new int[(i2 + a)];
                    if (a != 0) {
                        System.arraycopy(this.f28180e, 0, obj2, 0, a);
                    }
                    while (a < obj2.length - 1) {
                        obj2[a] = nyt.h();
                        nyt.a();
                        a++;
                    }
                    obj2[a] = nyt.h();
                    this.f28180e = obj2;
                    continue;
                case 49:
                    this.f28181f = Long.valueOf(nyt.g());
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
