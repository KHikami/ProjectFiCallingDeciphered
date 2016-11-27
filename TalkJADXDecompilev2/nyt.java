package defpackage;

//appears to process byte data; probably deals with sent/received data packets

public final class nyt {
    private final byte[] a;
    private int b;
    private int c;
    private int d;
    private int e;
    private int f;
    private int g = Integer.MAX_VALUE;
    private int h;
    private int i = 64;
    private int j = 67108864;

    public static nyt a(byte[] bArr) {
        return nyt.a(bArr, 0, bArr.length);
    }

    public static nyt a(byte[] bArr, int i, int i2) {
        return new nyt(bArr, i, i2);
    }

    public int a() {
        if (t()) {
            this.f = 0;
            return 0;
        }
        this.f = r();
        if (this.f != 0) {
            return this.f;
        }
        throw new nzd("Protocol message contained an invalid tag (zero).");
    }

    public void a(int i) {
        if (this.f != i) {
            throw new nzd("Protocol message end-group tag did not match expected tag.");
        }
    }

    private void v() {
        int a;
        do {
            a = a();
            if (a == 0) {
                return;
            }
        } while (b(a));
    }

    public double b() {
        return Double.longBitsToDouble(y());
    }

    public float c() {
        return Float.intBitsToFloat(x());
    }

    public long d() {
        return w();
    }

    public long e() {
        return w();
    }

    public int f() { //used for setting value of lkt.b (% packets lost)
        return r();
    }

    public long g() {
        return y();
    }

    public int h() {
        return x();
    }

    public boolean i() {
        return r() != 0;
    }

    public String j() {
        int r = r();
        if (r < 0) {
            throw nzd.b();
        } else if (r > this.c - this.e) {
            throw nzd.a();
        } else {
            String str = new String(this.a, this.e, r, nzc.a);
            this.e = r + this.e;
            return str;
        }
    }

    public void a(nzf nzf, int i) {
        if (this.h >= this.i) {
            throw nzd.d();
        }
        this.h++;
        nzf.a(this);
        a(4 | (i << 3));
        this.h--;
    }

    public void a(nzf nzf) {
        int r = r();
        if (this.h >= this.i) {
            throw nzd.d();
        }
        r = d(r);
        this.h++;
        nzf.a(this);
        a(0);
        this.h--;
        e(r);
    }

    public byte[] k() {
        int r = r();
        if (r < 0) {
            throw nzd.b();
        } else if (r == 0) {
            return nzl.h;
        } else {
            if (r > this.c - this.e) {
                throw nzd.a();
            }
            byte[] bArr = new byte[r];
            System.arraycopy(this.a, this.e, bArr, 0, r);
            this.e = r + this.e;
            return bArr;
        }
    }

    public int l() {
        return r();
    }

    public int m() {
        return r();
    }

    public int n() {
        return x();
    }

    public long o() {
        return y();
    }

    public int p() {
        int r = r();
        return (-(r & 1)) ^ (r >>> 1);
    }

    public long q() {
        long w = w();
        return (-(w & 1)) ^ (w >>> 1);
    }

    public int r() {
        byte A = A();
        if (A >= (byte) 0) {
            return A;
        }
        int i = A & 127;
        byte A2 = A();
        if (A2 >= (byte) 0) {
            return i | (A2 << 7);
        }
        i |= (A2 & 127) << 7;
        A2 = A();
        if (A2 >= (byte) 0) {
            return i | (A2 << 14);
        }
        i |= (A2 & 127) << 14;
        A2 = A();
        if (A2 >= (byte) 0) {
            return i | (A2 << 21);
        }
        i |= (A2 & 127) << 21;
        A2 = A();
        i |= A2 << 28;
        if (A2 >= (byte) 0) {
            return i;
        }
        for (int i2 = 0; i2 < 5; i2++) {
            if (A() >= (byte) 0) {
                return i;
            }
        }
        throw nzd.c();
    }

    private long w() {
        long j = 0;
        for (int i = 0; i < 64; i += 7) {
            byte A = A();
            j |= ((long) (A & 127)) << i;
            if ((A & 128) == 0) {
                return j;
            }
        }
        throw nzd.c();
    }

    private int x() {
        return (((A() & 255) | ((A() & 255) << 8)) | ((A() & 255) << 16)) | ((A() & 255) << 24);
    }

    private long y() {
        byte A = A();
        byte A2 = A();
        return ((((((((((long) A2) & 255) << 8) | (((long) A) & 255)) | ((((long) A()) & 255) << 16)) | ((((long) A()) & 255) << 24)) | ((((long) A()) & 255) << 32)) | ((((long) A()) & 255) << 40)) | ((((long) A()) & 255) << 48)) | ((((long) A()) & 255) << 56);
    }

    private nyt(byte[] bArr, int i, int i2) {
        this.a = bArr;
        this.b = i;
        this.c = i + i2;
        this.e = i;
    }

    public int c(int i) {
        int i2 = this.j;
        this.j = Integer.MAX_VALUE;
        return i2;
    }

    public int d(int i) {
        if (i < 0) {
            throw nzd.b();
        }
        int i2 = this.e + i;
        int i3 = this.g;
        if (i2 > i3) {
            throw nzd.a();
        }
        this.g = i2;
        z();
        return i3;
    }

    private void z() {
        this.c += this.d;
        int i = this.c;
        if (i > this.g) {
            this.d = i - this.g;
            this.c -= this.d;
            return;
        }
        this.d = 0;
    }

    public void e(int i) {
        this.g = i;
        z();
    }

    public int s() {
        if (this.g == Integer.MAX_VALUE) {
            return -1;
        }
        return this.g - this.e;
    }

    public boolean t() {
        return this.e == this.c;
    }

    public int u() {
        return this.e - this.b;
    }

    public byte[] a(int i, int i2) {
        if (i2 == 0) {
            return nzl.h;
        }
        byte[] bArr = new byte[i2];
        System.arraycopy(this.a, this.b + i, bArr, 0, i2);
        return bArr;
    }

    public void f(int i) {
        if (i > this.e - this.b) {
            throw new IllegalArgumentException("Position " + i + " is beyond current " + (this.e - this.b));
        } else if (i < 0) {
            throw new IllegalArgumentException("Bad position " + i);
        } else {
            this.e = this.b + i;
        }
    }

    private byte A() {
        if (this.e == this.c) {
            throw nzd.a();
        }
        byte[] bArr = this.a;
        int i = this.e;
        this.e = i + 1;
        return bArr[i];
    }

    private void g(int i) {
        if (i < 0) {
            throw nzd.b();
        } else if (this.e + i > this.g) {
            g(this.g - this.e);
            throw nzd.a();
        } else if (i <= this.c - this.e) {
            this.e += i;
        } else {
            throw nzd.a();
        }
    }

    public boolean b(int i) {
        switch (i & 7) {
            case 0:
                f();
                return true;
            case 1:
                y();
                return true;
            case 2:
                g(r());
                return true;
            case 3:
                v();
                a(((i >>> 3) << 3) | 4);
                return true;
            case 4:
                return false;
            case 5:
                x();
                return true;
            default:
                throw new nzd("Protocol message tag had invalid wire type.");
        }
    }
}
