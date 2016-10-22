public final class hci {
    private final byte[] a;
    private int b;
    private int c;
    private int d;
    private int e;
    private int f;
    private int g;
    private int h;
    private int i;
    private int j;

    hci(byte[] bArr, int i, int i2) {
        this.g = Integer.MAX_VALUE;
        this.i = 64;
        this.j = 67108864;
        this.a = bArr;
        this.b = i;
        this.c = i + i2;
        this.e = i;
    }

    private void f(int i) {
        if (i < 0) {
            throw hcp.b();
        } else if (this.e + i > this.g) {
            f(this.g - this.e);
            throw hcp.a();
        } else if (i <= this.c - this.e) {
            this.e += i;
        } else {
            throw hcp.a();
        }
    }

    private void n() {
        int a;
        do {
            a = a();
            if (a == 0) {
                return;
            }
        } while (b(a));
    }

    private long o() {
        long j = 0;
        for (int i = 0; i < 64; i += 7) {
            byte t = t();
            j |= ((long) (t & 127)) << i;
            if ((t & 128) == 0) {
                return j;
            }
        }
        throw hcp.c();
    }

    private int p() {
        return (((t() & 255) | ((t() & 255) << 8)) | ((t() & 255) << 16)) | ((t() & 255) << 24);
    }

    private long q() {
        byte t = t();
        byte t2 = t();
        return ((((((((((long) t2) & 255) << 8) | (((long) t) & 255)) | ((((long) t()) & 255) << 16)) | ((((long) t()) & 255) << 24)) | ((((long) t()) & 255) << 32)) | ((((long) t()) & 255) << 40)) | ((((long) t()) & 255) << 48)) | ((((long) t()) & 255) << 56);
    }

    private void r() {
        this.c += this.d;
        int i = this.c;
        if (i > this.g) {
            this.d = i - this.g;
            this.c -= this.d;
            return;
        }
        this.d = 0;
    }

    private boolean s() {
        return this.e == this.c;
    }

    private byte t() {
        if (this.e == this.c) {
            throw hcp.a();
        }
        byte[] bArr = this.a;
        int i = this.e;
        this.e = i + 1;
        return bArr[i];
    }

    public int a() {
        if (s()) {
            this.f = 0;
            return 0;
        }
        this.f = k();
        if (this.f != 0) {
            return this.f;
        }
        throw new hcp("Protocol message contained an invalid tag (zero).");
    }

    public void a(int i) {
        if (this.f != i) {
            throw new hcp("Protocol message end-group tag did not match expected tag.");
        }
    }

    public void a(hcq hcq) {
        int k = k();
        if (this.h >= this.i) {
            throw new hcp("Protocol message had too many levels of nesting.  May be malicious.  Use CodedInputStream.setRecursionLimit() to increase the depth limit.");
        }
        k = c(k);
        this.h++;
        hcq.a(this);
        a(0);
        this.h--;
        d(k);
    }

    public byte[] a(int i, int i2) {
        if (i2 == 0) {
            return hcs.h;
        }
        Object obj = new byte[i2];
        System.arraycopy(this.a, this.b + i, obj, 0, i2);
        return obj;
    }

    public double b() {
        return Double.longBitsToDouble(q());
    }

    public float c() {
        return Float.intBitsToFloat(p());
    }

    public int c(int i) {
        if (i < 0) {
            throw hcp.b();
        }
        int i2 = this.e + i;
        int i3 = this.g;
        if (i2 > i3) {
            throw hcp.a();
        }
        this.g = i2;
        r();
        return i3;
    }

    public long d() {
        return o();
    }

    public void d(int i) {
        this.g = i;
        r();
    }

    public int e() {
        return k();
    }

    public void e(int i) {
        if (i > this.e - this.b) {
            throw new IllegalArgumentException("Position " + i + " is beyond current " + (this.e - this.b));
        } else if (i < 0) {
            throw new IllegalArgumentException("Bad position " + i);
        } else {
            this.e = this.b + i;
        }
    }

    public boolean f() {
        return k() != 0;
    }

    public String g() {
        int k = k();
        if (k < 0) {
            throw hcp.b();
        } else if (k > this.c - this.e) {
            throw hcp.a();
        } else {
            String str = new String(this.a, this.e, k, hco.a);
            this.e = k + this.e;
            return str;
        }
    }

    public byte[] h() {
        int k = k();
        if (k < 0) {
            throw hcp.b();
        } else if (k == 0) {
            return hcs.h;
        } else {
            if (k > this.c - this.e) {
                throw hcp.a();
            }
            Object obj = new byte[k];
            System.arraycopy(this.a, this.e, obj, 0, k);
            this.e = k + this.e;
            return obj;
        }
    }

    public int i() {
        int k = k();
        return (-(k & 1)) ^ (k >>> 1);
    }

    public long j() {
        long o = o();
        return (-(o & 1)) ^ (o >>> 1);
    }

    public int k() {
        byte t = t();
        if (t >= null) {
            return t;
        }
        int i = t & 127;
        byte t2 = t();
        if (t2 >= null) {
            return i | (t2 << 7);
        }
        i |= (t2 & 127) << 7;
        t2 = t();
        if (t2 >= null) {
            return i | (t2 << 14);
        }
        i |= (t2 & 127) << 14;
        t2 = t();
        if (t2 >= null) {
            return i | (t2 << 21);
        }
        i |= (t2 & 127) << 21;
        t2 = t();
        i |= t2 << 28;
        if (t2 >= null) {
            return i;
        }
        for (int i2 = 0; i2 < 5; i2++) {
            if (t() >= null) {
                return i;
            }
        }
        throw hcp.c();
    }

    public int l() {
        if (this.g == Integer.MAX_VALUE) {
            return -1;
        }
        return this.g - this.e;
    }

    public int m() {
        return this.e - this.b;
    }

    public boolean b(int i) {
        switch (i & 7) {
            case wi.w /*0*/:
                e();
                return true;
            case wi.j /*1*/:
                q();
                return true;
            case wi.l /*2*/:
                f(k());
                return true;
            case wi.z /*3*/:
                n();
                a(((i >>> 3) << 3) | 4);
                return true;
            case wi.h /*4*/:
                return false;
            case wi.p /*5*/:
                p();
                return true;
            default:
                throw new hcp("Protocol message tag had invalid wire type.");
        }
    }
}
