package p000;

public final class hci {
    private final byte[] f16597a;
    private int f16598b;
    private int f16599c;
    private int f16600d;
    private int f16601e;
    private int f16602f;
    private int f16603g = Integer.MAX_VALUE;
    private int f16604h;
    private int f16605i = 64;
    private int f16606j = 67108864;

    hci(byte[] bArr, int i, int i2) {
        this.f16597a = bArr;
        this.f16598b = i;
        this.f16599c = i + i2;
        this.f16601e = i;
    }

    private void m19238f(int i) {
        if (i < 0) {
            throw hcp.m19347b();
        } else if (this.f16601e + i > this.f16603g) {
            m19238f(this.f16603g - this.f16601e);
            throw hcp.m19346a();
        } else if (i <= this.f16599c - this.f16601e) {
            this.f16601e += i;
        } else {
            throw hcp.m19346a();
        }
    }

    private void m19239n() {
        int a;
        do {
            a = m19246a();
            if (a == 0) {
                return;
            }
        } while (m19251b(a));
    }

    private long m19240o() {
        long j = 0;
        for (int i = 0; i < 64; i += 7) {
            byte t = m19245t();
            j |= ((long) (t & 127)) << i;
            if ((t & 128) == 0) {
                return j;
            }
        }
        throw hcp.m19348c();
    }

    private int m19241p() {
        return (((m19245t() & 255) | ((m19245t() & 255) << 8)) | ((m19245t() & 255) << 16)) | ((m19245t() & 255) << 24);
    }

    private long m19242q() {
        byte t = m19245t();
        byte t2 = m19245t();
        return ((((((((((long) t2) & 255) << 8) | (((long) t) & 255)) | ((((long) m19245t()) & 255) << 16)) | ((((long) m19245t()) & 255) << 24)) | ((((long) m19245t()) & 255) << 32)) | ((((long) m19245t()) & 255) << 40)) | ((((long) m19245t()) & 255) << 48)) | ((((long) m19245t()) & 255) << 56);
    }

    private void m19243r() {
        this.f16599c += this.f16600d;
        int i = this.f16599c;
        if (i > this.f16603g) {
            this.f16600d = i - this.f16603g;
            this.f16599c -= this.f16600d;
            return;
        }
        this.f16600d = 0;
    }

    private boolean m19244s() {
        return this.f16601e == this.f16599c;
    }

    private byte m19245t() {
        if (this.f16601e == this.f16599c) {
            throw hcp.m19346a();
        }
        byte[] bArr = this.f16597a;
        int i = this.f16601e;
        this.f16601e = i + 1;
        return bArr[i];
    }

    public int m19246a() {
        if (m19244s()) {
            this.f16602f = 0;
            return 0;
        }
        this.f16602f = m19263k();
        if (this.f16602f != 0) {
            return this.f16602f;
        }
        throw new hcp("Protocol message contained an invalid tag (zero).");
    }

    public void m19247a(int i) {
        if (this.f16602f != i) {
            throw new hcp("Protocol message end-group tag did not match expected tag.");
        }
    }

    public void m19248a(hcq hcq) {
        int k = m19263k();
        if (this.f16604h >= this.f16605i) {
            throw new hcp("Protocol message had too many levels of nesting.  May be malicious.  Use CodedInputStream.setRecursionLimit() to increase the depth limit.");
        }
        k = m19253c(k);
        this.f16604h++;
        hcq.mo2452a(this);
        m19247a(0);
        this.f16604h--;
        m19255d(k);
    }

    public byte[] m19249a(int i, int i2) {
        if (i2 == 0) {
            return hcs.f16632h;
        }
        Object obj = new byte[i2];
        System.arraycopy(this.f16597a, this.f16598b + i, obj, 0, i2);
        return obj;
    }

    public double m19250b() {
        return Double.longBitsToDouble(m19242q());
    }

    public float m19252c() {
        return Float.intBitsToFloat(m19241p());
    }

    public int m19253c(int i) {
        if (i < 0) {
            throw hcp.m19347b();
        }
        int i2 = this.f16601e + i;
        int i3 = this.f16603g;
        if (i2 > i3) {
            throw hcp.m19346a();
        }
        this.f16603g = i2;
        m19243r();
        return i3;
    }

    public long m19254d() {
        return m19240o();
    }

    public void m19255d(int i) {
        this.f16603g = i;
        m19243r();
    }

    public int m19256e() {
        return m19263k();
    }

    public void m19257e(int i) {
        if (i > this.f16601e - this.f16598b) {
            throw new IllegalArgumentException("Position " + i + " is beyond current " + (this.f16601e - this.f16598b));
        } else if (i < 0) {
            throw new IllegalArgumentException("Bad position " + i);
        } else {
            this.f16601e = this.f16598b + i;
        }
    }

    public boolean m19258f() {
        return m19263k() != 0;
    }

    public String m19259g() {
        int k = m19263k();
        if (k < 0) {
            throw hcp.m19347b();
        } else if (k > this.f16599c - this.f16601e) {
            throw hcp.m19346a();
        } else {
            String str = new String(this.f16597a, this.f16601e, k, hco.f16620a);
            this.f16601e = k + this.f16601e;
            return str;
        }
    }

    public byte[] m19260h() {
        int k = m19263k();
        if (k < 0) {
            throw hcp.m19347b();
        } else if (k == 0) {
            return hcs.f16632h;
        } else {
            if (k > this.f16599c - this.f16601e) {
                throw hcp.m19346a();
            }
            Object obj = new byte[k];
            System.arraycopy(this.f16597a, this.f16601e, obj, 0, k);
            this.f16601e = k + this.f16601e;
            return obj;
        }
    }

    public int m19261i() {
        int k = m19263k();
        return (-(k & 1)) ^ (k >>> 1);
    }

    public long m19262j() {
        long o = m19240o();
        return (-(o & 1)) ^ (o >>> 1);
    }

    public int m19263k() {
        byte t = m19245t();
        if (t >= (byte) 0) {
            return t;
        }
        int i = t & 127;
        byte t2 = m19245t();
        if (t2 >= (byte) 0) {
            return i | (t2 << 7);
        }
        i |= (t2 & 127) << 7;
        t2 = m19245t();
        if (t2 >= (byte) 0) {
            return i | (t2 << 14);
        }
        i |= (t2 & 127) << 14;
        t2 = m19245t();
        if (t2 >= (byte) 0) {
            return i | (t2 << 21);
        }
        i |= (t2 & 127) << 21;
        t2 = m19245t();
        i |= t2 << 28;
        if (t2 >= (byte) 0) {
            return i;
        }
        for (int i2 = 0; i2 < 5; i2++) {
            if (m19245t() >= (byte) 0) {
                return i;
            }
        }
        throw hcp.m19348c();
    }

    public int m19264l() {
        if (this.f16603g == Integer.MAX_VALUE) {
            return -1;
        }
        return this.f16603g - this.f16601e;
    }

    public int m19265m() {
        return this.f16601e - this.f16598b;
    }

    public boolean m19251b(int i) {
        switch (i & 7) {
            case 0:
                m19256e();
                return true;
            case 1:
                m19242q();
                return true;
            case 2:
                m19238f(m19263k());
                return true;
            case 3:
                m19239n();
                m19247a(((i >>> 3) << 3) | 4);
                return true;
            case 4:
                return false;
            case 5:
                m19241p();
                return true;
            default:
                throw new hcp("Protocol message tag had invalid wire type.");
        }
    }
}
