package p000;

public final class nyt {
    private final byte[] f31282a;
    private int f31283b;
    private int f31284c;
    private int f31285d;
    private int f31286e;
    private int f31287f;
    private int f31288g = Integer.MAX_VALUE;
    private int f31289h;
    private int f31290i = 64;
    private int f31291j = 67108864;

    public static nyt m37091a(byte[] bArr) {
        return nyt.m37092a(bArr, 0, bArr.length);
    }

    public static nyt m37092a(byte[] bArr, int i, int i2) {
        return new nyt(bArr, i, i2);
    }

    public int m37099a() {
        if (m37127t()) {
            this.f31287f = 0;
            return 0;
        }
        this.f31287f = m37125r();
        if (this.f31287f != 0) {
            return this.f31287f;
        }
        throw new nzd("Protocol message contained an invalid tag (zero).");
    }

    public void m37100a(int i) {
        if (this.f31287f != i) {
            throw new nzd("Protocol message end-group tag did not match expected tag.");
        }
    }

    private void m37094v() {
        int a;
        do {
            a = m37099a();
            if (a == 0) {
                return;
            }
        } while (m37105b(a));
    }

    public double m37104b() {
        return Double.longBitsToDouble(m37097y());
    }

    public float m37106c() {
        return Float.intBitsToFloat(m37096x());
    }

    public long m37109d() {
        return m37095w();
    }

    public long m37110e() {
        return m37095w();
    }

    public int m37112f() {
        return m37125r();
    }

    public long m37114g() {
        return m37097y();
    }

    public int m37115h() {
        return m37096x();
    }

    public boolean m37116i() {
        return m37125r() != 0;
    }

    public String m37117j() {
        int r = m37125r();
        if (r < 0) {
            throw nzd.b();
        } else if (r > this.f31284c - this.f31286e) {
            throw nzd.a();
        } else {
            String str = new String(this.f31282a, this.f31286e, r, nzc.f31307a);
            this.f31286e = r + this.f31286e;
            return str;
        }
    }

    public void m37102a(nzf nzf, int i) {
        if (this.f31289h >= this.f31290i) {
            throw nzd.d();
        }
        this.f31289h++;
        nzf.a(this);
        m37100a(4 | (i << 3));
        this.f31289h--;
    }

    public void m37101a(nzf nzf) {
        int r = m37125r();
        if (this.f31289h >= this.f31290i) {
            throw nzd.d();
        }
        r = m37108d(r);
        this.f31289h++;
        nzf.a(this);
        m37100a(0);
        this.f31289h--;
        m37111e(r);
    }

    public byte[] m37118k() {
        int r = m37125r();
        if (r < 0) {
            throw nzd.b();
        } else if (r == 0) {
            return nzl.f31334h;
        } else {
            if (r > this.f31284c - this.f31286e) {
                throw nzd.a();
            }
            byte[] bArr = new byte[r];
            System.arraycopy(this.f31282a, this.f31286e, bArr, 0, r);
            this.f31286e = r + this.f31286e;
            return bArr;
        }
    }

    public int m37119l() {
        return m37125r();
    }

    public int m37120m() {
        return m37125r();
    }

    public int m37121n() {
        return m37096x();
    }

    public long m37122o() {
        return m37097y();
    }

    public int m37123p() {
        int r = m37125r();
        return (-(r & 1)) ^ (r >>> 1);
    }

    public long m37124q() {
        long w = m37095w();
        return (-(w & 1)) ^ (w >>> 1);
    }

    public int m37125r() {
        byte A = m37090A();
        if (A >= (byte) 0) {
            return A;
        }
        int i = A & 127;
        byte A2 = m37090A();
        if (A2 >= (byte) 0) {
            return i | (A2 << 7);
        }
        i |= (A2 & 127) << 7;
        A2 = m37090A();
        if (A2 >= (byte) 0) {
            return i | (A2 << 14);
        }
        i |= (A2 & 127) << 14;
        A2 = m37090A();
        if (A2 >= (byte) 0) {
            return i | (A2 << 21);
        }
        i |= (A2 & 127) << 21;
        A2 = m37090A();
        i |= A2 << 28;
        if (A2 >= (byte) 0) {
            return i;
        }
        for (int i2 = 0; i2 < 5; i2++) {
            if (m37090A() >= (byte) 0) {
                return i;
            }
        }
        throw nzd.c();
    }

    private long m37095w() {
        long j = 0;
        for (int i = 0; i < 64; i += 7) {
            byte A = m37090A();
            j |= ((long) (A & 127)) << i;
            if ((A & 128) == 0) {
                return j;
            }
        }
        throw nzd.c();
    }

    private int m37096x() {
        return (((m37090A() & 255) | ((m37090A() & 255) << 8)) | ((m37090A() & 255) << 16)) | ((m37090A() & 255) << 24);
    }

    private long m37097y() {
        byte A = m37090A();
        byte A2 = m37090A();
        return ((((((((((long) A2) & 255) << 8) | (((long) A) & 255)) | ((((long) m37090A()) & 255) << 16)) | ((((long) m37090A()) & 255) << 24)) | ((((long) m37090A()) & 255) << 32)) | ((((long) m37090A()) & 255) << 40)) | ((((long) m37090A()) & 255) << 48)) | ((((long) m37090A()) & 255) << 56);
    }

    private nyt(byte[] bArr, int i, int i2) {
        this.f31282a = bArr;
        this.f31283b = i;
        this.f31284c = i + i2;
        this.f31286e = i;
    }

    public int m37107c(int i) {
        int i2 = this.f31291j;
        this.f31291j = Integer.MAX_VALUE;
        return i2;
    }

    public int m37108d(int i) {
        if (i < 0) {
            throw nzd.b();
        }
        int i2 = this.f31286e + i;
        int i3 = this.f31288g;
        if (i2 > i3) {
            throw nzd.a();
        }
        this.f31288g = i2;
        m37098z();
        return i3;
    }

    private void m37098z() {
        this.f31284c += this.f31285d;
        int i = this.f31284c;
        if (i > this.f31288g) {
            this.f31285d = i - this.f31288g;
            this.f31284c -= this.f31285d;
            return;
        }
        this.f31285d = 0;
    }

    public void m37111e(int i) {
        this.f31288g = i;
        m37098z();
    }

    public int m37126s() {
        if (this.f31288g == Integer.MAX_VALUE) {
            return -1;
        }
        return this.f31288g - this.f31286e;
    }

    public boolean m37127t() {
        return this.f31286e == this.f31284c;
    }

    public int m37128u() {
        return this.f31286e - this.f31283b;
    }

    public byte[] m37103a(int i, int i2) {
        if (i2 == 0) {
            return nzl.f31334h;
        }
        byte[] bArr = new byte[i2];
        System.arraycopy(this.f31282a, this.f31283b + i, bArr, 0, i2);
        return bArr;
    }

    public void m37113f(int i) {
        if (i > this.f31286e - this.f31283b) {
            throw new IllegalArgumentException("Position " + i + " is beyond current " + (this.f31286e - this.f31283b));
        } else if (i < 0) {
            throw new IllegalArgumentException("Bad position " + i);
        } else {
            this.f31286e = this.f31283b + i;
        }
    }

    private byte m37090A() {
        if (this.f31286e == this.f31284c) {
            throw nzd.a();
        }
        byte[] bArr = this.f31282a;
        int i = this.f31286e;
        this.f31286e = i + 1;
        return bArr[i];
    }

    private void m37093g(int i) {
        if (i < 0) {
            throw nzd.b();
        } else if (this.f31286e + i > this.f31288g) {
            m37093g(this.f31288g - this.f31286e);
            throw nzd.a();
        } else if (i <= this.f31284c - this.f31286e) {
            this.f31286e += i;
        } else {
            throw nzd.a();
        }
    }

    public boolean m37105b(int i) {
        switch (i & 7) {
            case 0:
                m37112f();
                return true;
            case 1:
                m37097y();
                return true;
            case 2:
                m37093g(m37125r());
                return true;
            case 3:
                m37094v();
                m37100a(((i >>> 3) << 3) | 4);
                return true;
            case 4:
                return false;
            case 5:
                m37096x();
                return true;
            default:
                throw new nzd("Protocol message tag had invalid wire type.");
        }
    }
}
