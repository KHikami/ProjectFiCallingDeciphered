package defpackage;

import java.util.Arrays;

final class nvx extends nvw {
    private final byte[] d;
    private final boolean e;
    private int f;
    private int g;
    private int h;
    private int i;
    private boolean j = false;
    private int k;
    private int l = Integer.MAX_VALUE;

    public int a() {
        if (z()) {
            this.i = 0;
            return 0;
        }
        this.i = s();
        if ((this.i >>> 3) != 0) {
            return this.i;
        }
        throw new nxc("Protocol message contained an invalid tag (zero).");
    }

    public void a(int i) {
        if (this.i != i) {
            throw new nxc("Protocol message end-group tag did not match expected tag.");
        }
    }

    public double b() {
        return Double.longBitsToDouble(x());
    }

    public float c() {
        return Float.intBitsToFloat(w());
    }

    public long d() {
        return v();
    }

    public long e() {
        return v();
    }

    public int f() {
        return s();
    }

    public long g() {
        return x();
    }

    public int h() {
        return w();
    }

    public boolean i() {
        return v() != 0;
    }

    public String j() {
        int s = s();
        if (s <= this.f - this.h && s > 0) {
            String str = new String(this.d, this.h, s, nwv.a);
            this.h = s + this.h;
            return str;
        } else if (s == 0) {
            return "";
        } else {
            if (s > this.f) {
                return new String(e(s), nwv.a);
            }
            throw nxc.a();
        }
    }

    public String k() {
        byte[] bArr;
        int i = 0;
        int s = s();
        int i2 = this.h;
        if (s <= this.f - i2 && s > 0) {
            bArr = this.d;
            this.h = i2 + s;
        } else if (s == 0) {
            return "";
        } else {
            if (s <= this.f) {
                throw nxc.a();
            }
            bArr = e(s);
            i2 = 0;
        }
        if (nyb.a.a(0, bArr, i2, i2 + s) == 0) {
            i = 1;
        }
        if (i != 0) {
            return new String(bArr, i2, s, nwv.a);
        }
        throw new nxc("Protocol message had invalid UTF-8.");
    }

    public void a(int i, nxj nxj, nwd nwd) {
        if (this.a >= this.b) {
            throw nxc.d();
        }
        this.a++;
        nxj.b(this, nwd);
        a(4 | (i << 3));
        this.a--;
    }

    public <T extends nwi<T, ?>> T a(int i, T t, nwd nwd) {
        if (this.a >= this.b) {
            throw nxc.d();
        }
        this.a++;
        T a = nwi.a(t, this, nwd);
        a(4 | (i << 3));
        this.a--;
        return a;
    }

    public void a(nxj nxj, nwd nwd) {
        int s = s();
        if (this.a >= this.b) {
            throw nxc.d();
        }
        s = b(s);
        this.a++;
        nxj.b(this, nwd);
        a(0);
        this.a--;
        c(s);
    }

    public <T extends nwi<T, ?>> T a(T t, nwd nwd) {
        int s = s();
        if (this.a >= this.b) {
            throw nxc.d();
        }
        s = b(s);
        this.a++;
        T a = nwi.a(t, this, nwd);
        a(0);
        this.a--;
        c(s);
        return a;
    }

    public nvn l() {
        int s = s();
        if (s <= this.f - this.h && s > 0) {
            nvn b;
            if (this.e && this.j) {
                b = nvn.b(this.d, this.h, s);
            } else {
                b = nvn.a(this.d, this.h, s);
            }
            this.h = s + this.h;
            return b;
        } else if (s == 0) {
            return nvn.a;
        } else {
            return nvn.a(d(s));
        }
    }

    public int m() {
        return s();
    }

    public int n() {
        return s();
    }

    public int o() {
        return w();
    }

    public long p() {
        return x();
    }

    public int q() {
        int s = s();
        return (-(s & 1)) ^ (s >>> 1);
    }

    public long r() {
        long v = v();
        return (-(v & 1)) ^ (v >>> 1);
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public int s() {
        /*
        r5 = this;
        r0 = r5.h;
        r1 = r5.f;
        if (r1 == r0) goto L_0x006c;
    L_0x0006:
        r3 = r5.d;
        r2 = r0 + 1;
        r0 = r3[r0];
        if (r0 < 0) goto L_0x0011;
    L_0x000e:
        r5.h = r2;
    L_0x0010:
        return r0;
    L_0x0011:
        r1 = r5.f;
        r1 = r1 - r2;
        r4 = 9;
        if (r1 < r4) goto L_0x006c;
    L_0x0018:
        r1 = r2 + 1;
        r2 = r3[r2];
        r2 = r2 << 7;
        r0 = r0 ^ r2;
        if (r0 >= 0) goto L_0x0026;
    L_0x0021:
        r0 = r0 ^ -128;
    L_0x0023:
        r5.h = r1;
        goto L_0x0010;
    L_0x0026:
        r2 = r1 + 1;
        r1 = r3[r1];
        r1 = r1 << 14;
        r0 = r0 ^ r1;
        if (r0 < 0) goto L_0x0033;
    L_0x002f:
        r0 = r0 ^ 16256;
        r1 = r2;
        goto L_0x0023;
    L_0x0033:
        r1 = r2 + 1;
        r2 = r3[r2];
        r2 = r2 << 21;
        r0 = r0 ^ r2;
        if (r0 >= 0) goto L_0x0041;
    L_0x003c:
        r2 = -2080896; // 0xffffffffffe03f80 float:NaN double:NaN;
        r0 = r0 ^ r2;
        goto L_0x0023;
    L_0x0041:
        r2 = r1 + 1;
        r1 = r3[r1];
        r4 = r1 << 28;
        r0 = r0 ^ r4;
        r4 = 266354560; // 0xfe03f80 float:2.2112565E-29 double:1.315966377E-315;
        r0 = r0 ^ r4;
        if (r1 >= 0) goto L_0x0072;
    L_0x004e:
        r1 = r2 + 1;
        r2 = r3[r2];
        if (r2 >= 0) goto L_0x0023;
    L_0x0054:
        r2 = r1 + 1;
        r1 = r3[r1];
        if (r1 >= 0) goto L_0x0072;
    L_0x005a:
        r1 = r2 + 1;
        r2 = r3[r2];
        if (r2 >= 0) goto L_0x0023;
    L_0x0060:
        r2 = r1 + 1;
        r1 = r3[r1];
        if (r1 >= 0) goto L_0x0072;
    L_0x0066:
        r1 = r2 + 1;
        r2 = r3[r2];
        if (r2 >= 0) goto L_0x0023;
    L_0x006c:
        r0 = r5.t();
        r0 = (int) r0;
        goto L_0x0010;
    L_0x0072:
        r1 = r2;
        goto L_0x0023;
        */
        throw new UnsupportedOperationException("Method not decompiled: nvx.s():int");
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private long v() {
        /*
        r10 = this;
        r8 = 0;
        r0 = r10.h;
        r1 = r10.f;
        if (r1 == r0) goto L_0x00b4;
    L_0x0008:
        r4 = r10.d;
        r1 = r0 + 1;
        r0 = r4[r0];
        if (r0 < 0) goto L_0x0014;
    L_0x0010:
        r10.h = r1;
        r0 = (long) r0;
    L_0x0013:
        return r0;
    L_0x0014:
        r2 = r10.f;
        r2 = r2 - r1;
        r3 = 9;
        if (r2 < r3) goto L_0x00b4;
    L_0x001b:
        r2 = r1 + 1;
        r1 = r4[r1];
        r1 = r1 << 7;
        r0 = r0 ^ r1;
        if (r0 >= 0) goto L_0x002a;
    L_0x0024:
        r0 = r0 ^ -128;
        r0 = (long) r0;
    L_0x0027:
        r10.h = r2;
        goto L_0x0013;
    L_0x002a:
        r3 = r2 + 1;
        r1 = r4[r2];
        r1 = r1 << 14;
        r0 = r0 ^ r1;
        if (r0 < 0) goto L_0x0038;
    L_0x0033:
        r0 = r0 ^ 16256;
        r0 = (long) r0;
        r2 = r3;
        goto L_0x0027;
    L_0x0038:
        r2 = r3 + 1;
        r1 = r4[r3];
        r1 = r1 << 21;
        r0 = r0 ^ r1;
        if (r0 >= 0) goto L_0x0047;
    L_0x0041:
        r1 = -2080896; // 0xffffffffffe03f80 float:NaN double:NaN;
        r0 = r0 ^ r1;
        r0 = (long) r0;
        goto L_0x0027;
    L_0x0047:
        r0 = (long) r0;
        r3 = r2 + 1;
        r2 = r4[r2];
        r6 = (long) r2;
        r2 = 28;
        r6 = r6 << r2;
        r0 = r0 ^ r6;
        r2 = (r0 > r8 ? 1 : (r0 == r8 ? 0 : -1));
        if (r2 < 0) goto L_0x005b;
    L_0x0055:
        r4 = 266354560; // 0xfe03f80 float:2.2112565E-29 double:1.315966377E-315;
        r0 = r0 ^ r4;
        r2 = r3;
        goto L_0x0027;
    L_0x005b:
        r2 = r3 + 1;
        r3 = r4[r3];
        r6 = (long) r3;
        r3 = 35;
        r6 = r6 << r3;
        r0 = r0 ^ r6;
        r3 = (r0 > r8 ? 1 : (r0 == r8 ? 0 : -1));
        if (r3 >= 0) goto L_0x006f;
    L_0x0068:
        r4 = -34093383808; // 0xfffffff80fe03f80 float:2.2112565E-29 double:NaN;
        r0 = r0 ^ r4;
        goto L_0x0027;
    L_0x006f:
        r3 = r2 + 1;
        r2 = r4[r2];
        r6 = (long) r2;
        r2 = 42;
        r6 = r6 << r2;
        r0 = r0 ^ r6;
        r2 = (r0 > r8 ? 1 : (r0 == r8 ? 0 : -1));
        if (r2 < 0) goto L_0x0084;
    L_0x007c:
        r4 = 4363953127296; // 0x3f80fe03f80 float:2.2112565E-29 double:2.1560793202584E-311;
        r0 = r0 ^ r4;
        r2 = r3;
        goto L_0x0027;
    L_0x0084:
        r2 = r3 + 1;
        r3 = r4[r3];
        r6 = (long) r3;
        r3 = 49;
        r6 = r6 << r3;
        r0 = r0 ^ r6;
        r3 = (r0 > r8 ? 1 : (r0 == r8 ? 0 : -1));
        if (r3 >= 0) goto L_0x0098;
    L_0x0091:
        r4 = -558586000294016; // 0xfffe03f80fe03f80 float:2.2112565E-29 double:NaN;
        r0 = r0 ^ r4;
        goto L_0x0027;
    L_0x0098:
        r3 = r2 + 1;
        r2 = r4[r2];
        r6 = (long) r2;
        r2 = 56;
        r6 = r6 << r2;
        r0 = r0 ^ r6;
        r6 = 71499008037633920; // 0xfe03f80fe03f80 float:2.2112565E-29 double:6.838959413692434E-304;
        r0 = r0 ^ r6;
        r2 = (r0 > r8 ? 1 : (r0 == r8 ? 0 : -1));
        if (r2 >= 0) goto L_0x00ba;
    L_0x00ab:
        r2 = r3 + 1;
        r3 = r4[r3];
        r4 = (long) r3;
        r3 = (r4 > r8 ? 1 : (r4 == r8 ? 0 : -1));
        if (r3 >= 0) goto L_0x0027;
    L_0x00b4:
        r0 = r10.t();
        goto L_0x0013;
    L_0x00ba:
        r2 = r3;
        goto L_0x0027;
        */
        throw new UnsupportedOperationException("Method not decompiled: nvx.v():long");
    }

    long t() {
        long j = 0;
        for (int i = 0; i < 64; i += 7) {
            byte A = A();
            j |= ((long) (A & 127)) << i;
            if ((A & 128) == 0) {
                return j;
            }
        }
        throw new nxc("CodedInputStream encountered a malformed varint.");
    }

    private int w() {
        int i = this.h;
        if (this.f - i < 4) {
            throw nxc.a();
        }
        byte[] bArr = this.d;
        this.h = i + 4;
        return ((bArr[i + 3] & 255) << 24) | (((bArr[i] & 255) | ((bArr[i + 1] & 255) << 8)) | ((bArr[i + 2] & 255) << 16));
    }

    private long x() {
        int i = this.h;
        if (this.f - i < 8) {
            throw nxc.a();
        }
        byte[] bArr = this.d;
        this.h = i + 8;
        return ((((long) bArr[i + 7]) & 255) << 56) | (((((((((long) bArr[i]) & 255) | ((((long) bArr[i + 1]) & 255) << 8)) | ((((long) bArr[i + 2]) & 255) << 16)) | ((((long) bArr[i + 3]) & 255) << 24)) | ((((long) bArr[i + 4]) & 255) << 32)) | ((((long) bArr[i + 5]) & 255) << 40)) | ((((long) bArr[i + 6]) & 255) << 48));
    }

    public int b(int i) {
        if (i < 0) {
            throw nxc.b();
        }
        int i2 = (this.k + this.h) + i;
        int i3 = this.l;
        if (i2 > i3) {
            throw nxc.a();
        }
        this.l = i2;
        y();
        return i3;
    }

    private void y() {
        this.f += this.g;
        int i = this.k + this.f;
        if (i > this.l) {
            this.g = i - this.l;
            this.f -= this.g;
            return;
        }
        this.g = 0;
    }

    public void c(int i) {
        this.l = i;
        y();
    }

    public int u() {
        if (this.l == Integer.MAX_VALUE) {
            return -1;
        }
        return this.l - (this.k + this.h);
    }

    private boolean z() {
        return this.h == this.f;
    }

    private byte A() {
        if (this.h == this.f) {
            throw nxc.a();
        }
        byte[] bArr = this.d;
        int i = this.h;
        this.h = i + 1;
        return bArr[i];
    }

    private byte[] d(int i) {
        if (i <= 0 || i > this.f - this.h) {
            return e(i);
        }
        int i2 = this.h;
        this.h += i;
        return Arrays.copyOfRange(this.d, i2, this.h);
    }

    private byte[] e(int i) {
        if (i > 0) {
            int i2 = (this.k + this.h) + i;
            if (i2 > this.c) {
                throw new nxc("Protocol message was too large.  May be malicious.  Use CodedInputStream.setSizeLimit() to increase the size limit.");
            }
            if (i2 > this.l) {
                f((this.l - this.k) - this.h);
            }
            throw nxc.a();
        } else if (i == 0) {
            return nwv.c;
        } else {
            throw nxc.b();
        }
    }

    private void f(int i) {
        if (i >= 0 && i <= this.f - this.h) {
            this.h += i;
        } else if (i < 0) {
            throw nxc.b();
        } else {
            throw nxc.a();
        }
    }

    nvx(byte[] bArr, int i, int i2, boolean z) {
        this.d = bArr;
        this.f = i + i2;
        this.h = i;
        this.k = -this.h;
        this.e = z;
    }
}
