package p000;

import java.util.Arrays;

final class nvx extends nvw {
    private final byte[] f31144d;
    private final boolean f31145e;
    private int f31146f;
    private int f31147g;
    private int f31148h;
    private int f31149i;
    private boolean f31150j = false;
    private int f31151k;
    private int f31152l = Integer.MAX_VALUE;

    public int mo3987a() {
        if (m36794z()) {
            this.f31149i = 0;
            return 0;
        }
        this.f31149i = mo4012s();
        if ((this.f31149i >>> 3) != 0) {
            return this.f31149i;
        }
        throw new nxc("Protocol message contained an invalid tag (zero).");
    }

    public void mo3990a(int i) {
        if (this.f31149i != i) {
            throw new nxc("Protocol message end-group tag did not match expected tag.");
        }
    }

    public double mo3993b() {
        return Double.longBitsToDouble(m36792x());
    }

    public float mo3995c() {
        return Float.intBitsToFloat(m36791w());
    }

    public long mo3997d() {
        return m36790v();
    }

    public long mo3998e() {
        return m36790v();
    }

    public int mo3999f() {
        return mo4012s();
    }

    public long mo4000g() {
        return m36792x();
    }

    public int mo4001h() {
        return m36791w();
    }

    public boolean mo4002i() {
        return m36790v() != 0;
    }

    public String mo4003j() {
        int s = mo4012s();
        if (s <= this.f31146f - this.f31148h && s > 0) {
            String str = new String(this.f31144d, this.f31148h, s, nwv.f31198a);
            this.f31148h = s + this.f31148h;
            return str;
        } else if (s == 0) {
            return "";
        } else {
            if (s > this.f31146f) {
                return new String(m36788e(s), nwv.f31198a);
            }
            throw nxc.m37018a();
        }
    }

    public String mo4004k() {
        byte[] bArr;
        int i = 0;
        int s = mo4012s();
        int i2 = this.f31148h;
        if (s <= this.f31146f - i2 && s > 0) {
            bArr = this.f31144d;
            this.f31148h = i2 + s;
        } else if (s == 0) {
            return "";
        } else {
            if (s <= this.f31146f) {
                throw nxc.m37018a();
            }
            bArr = m36788e(s);
            i2 = 0;
        }
        if (nyb.f31237a.mo4073a(0, bArr, i2, i2 + s) == 0) {
            i = 1;
        }
        if (i != 0) {
            return new String(bArr, i2, s, nwv.f31198a);
        }
        throw new nxc("Protocol message had invalid UTF-8.");
    }

    public void mo3991a(int i, nxj nxj, nwd nwd) {
        if (this.a >= this.b) {
            throw nxc.m37021d();
        }
        this.a++;
        nxj.mo3975b(this, nwd);
        mo3990a(4 | (i << 3));
        this.a--;
    }

    public <T extends nwi<T, ?>> T mo3988a(int i, T t, nwd nwd) {
        if (this.a >= this.b) {
            throw nxc.m37021d();
        }
        this.a++;
        T a = nwi.a(t, this, nwd);
        mo3990a(4 | (i << 3));
        this.a--;
        return a;
    }

    public void mo3992a(nxj nxj, nwd nwd) {
        int s = mo4012s();
        if (this.a >= this.b) {
            throw nxc.m37021d();
        }
        s = mo3994b(s);
        this.a++;
        nxj.mo3975b(this, nwd);
        mo3990a(0);
        this.a--;
        mo3996c(s);
    }

    public <T extends nwi<T, ?>> T mo3989a(T t, nwd nwd) {
        int s = mo4012s();
        if (this.a >= this.b) {
            throw nxc.m37021d();
        }
        s = mo3994b(s);
        this.a++;
        T a = nwi.a(t, this, nwd);
        mo3990a(0);
        this.a--;
        mo3996c(s);
        return a;
    }

    public nvn mo4005l() {
        int s = mo4012s();
        if (s <= this.f31146f - this.f31148h && s > 0) {
            nvn b;
            if (this.f31145e && this.f31150j) {
                b = nvn.b(this.f31144d, this.f31148h, s);
            } else {
                b = nvn.a(this.f31144d, this.f31148h, s);
            }
            this.f31148h = s + this.f31148h;
            return b;
        } else if (s == 0) {
            return nvn.a;
        } else {
            return nvn.a(m36787d(s));
        }
    }

    public int mo4006m() {
        return mo4012s();
    }

    public int mo4007n() {
        return mo4012s();
    }

    public int mo4008o() {
        return m36791w();
    }

    public long mo4009p() {
        return m36792x();
    }

    public int mo4010q() {
        int s = mo4012s();
        return (-(s & 1)) ^ (s >>> 1);
    }

    public long mo4011r() {
        long v = m36790v();
        return (-(v & 1)) ^ (v >>> 1);
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public int mo4012s() {
        int i = this.f31148h;
        if (this.f31146f != i) {
            byte[] bArr = this.f31144d;
            int i2 = i + 1;
            byte b = bArr[i];
            if (b >= (byte) 0) {
                this.f31148h = i2;
                return b;
            } else if (this.f31146f - i2 >= 9) {
                int i3 = i2 + 1;
                i = b ^ (bArr[i2] << 7);
                if (i < 0) {
                    i ^= -128;
                } else {
                    i2 = i3 + 1;
                    i ^= bArr[i3] << 14;
                    if (i >= 0) {
                        i ^= 16256;
                        i3 = i2;
                    } else {
                        i3 = i2 + 1;
                        i ^= bArr[i2] << 21;
                        if (i < 0) {
                            i ^= -2080896;
                        } else {
                            i2 = i3 + 1;
                            byte b2 = bArr[i3];
                            i = (i ^ (b2 << 28)) ^ 266354560;
                            if (b2 < (byte) 0) {
                                i3 = i2 + 1;
                                if (bArr[i2] < (byte) 0) {
                                    i2 = i3 + 1;
                                    if (bArr[i3] < (byte) 0) {
                                        i3 = i2 + 1;
                                        if (bArr[i2] < (byte) 0) {
                                            i2 = i3 + 1;
                                            if (bArr[i3] < (byte) 0) {
                                                i3 = i2 + 1;
                                            }
                                        }
                                    }
                                }
                            }
                            i3 = i2;
                        }
                    }
                }
                this.f31148h = i3;
                return i;
            }
        }
        return (int) mo4013t();
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private long m36790v() {
        int i = this.f31148h;
        if (this.f31146f != i) {
            byte[] bArr = this.f31144d;
            int i2 = i + 1;
            byte b = bArr[i];
            if (b >= (byte) 0) {
                this.f31148h = i2;
                return (long) b;
            } else if (this.f31146f - i2 >= 9) {
                long j;
                int i3 = i2 + 1;
                i = b ^ (bArr[i2] << 7);
                if (i < 0) {
                    j = (long) (i ^ -128);
                } else {
                    int i4 = i3 + 1;
                    i ^= bArr[i3] << 14;
                    if (i >= 0) {
                        j = (long) (i ^ 16256);
                        i3 = i4;
                    } else {
                        i3 = i4 + 1;
                        i ^= bArr[i4] << 21;
                        if (i < 0) {
                            j = (long) (i ^ -2080896);
                        } else {
                            i4 = i3 + 1;
                            j = ((long) i) ^ (((long) bArr[i3]) << 28);
                            if (j >= 0) {
                                j ^= 266354560;
                                i3 = i4;
                            } else {
                                i3 = i4 + 1;
                                j ^= ((long) bArr[i4]) << 35;
                                if (j < 0) {
                                    j ^= -34093383808L;
                                } else {
                                    i4 = i3 + 1;
                                    j ^= ((long) bArr[i3]) << 42;
                                    if (j >= 0) {
                                        j ^= 4363953127296L;
                                        i3 = i4;
                                    } else {
                                        i3 = i4 + 1;
                                        j ^= ((long) bArr[i4]) << 49;
                                        if (j < 0) {
                                            j ^= -558586000294016L;
                                        } else {
                                            i4 = i3 + 1;
                                            j = (j ^ (((long) bArr[i3]) << 56)) ^ 71499008037633920L;
                                            if (j < 0) {
                                                i3 = i4 + 1;
                                            } else {
                                                i3 = i4;
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
                this.f31148h = i3;
                return j;
            }
        }
        return mo4013t();
    }

    long mo4013t() {
        long j = 0;
        for (int i = 0; i < 64; i += 7) {
            byte A = m36786A();
            j |= ((long) (A & 127)) << i;
            if ((A & 128) == 0) {
                return j;
            }
        }
        throw new nxc("CodedInputStream encountered a malformed varint.");
    }

    private int m36791w() {
        int i = this.f31148h;
        if (this.f31146f - i < 4) {
            throw nxc.m37018a();
        }
        byte[] bArr = this.f31144d;
        this.f31148h = i + 4;
        return ((bArr[i + 3] & 255) << 24) | (((bArr[i] & 255) | ((bArr[i + 1] & 255) << 8)) | ((bArr[i + 2] & 255) << 16));
    }

    private long m36792x() {
        int i = this.f31148h;
        if (this.f31146f - i < 8) {
            throw nxc.m37018a();
        }
        byte[] bArr = this.f31144d;
        this.f31148h = i + 8;
        return ((((long) bArr[i + 7]) & 255) << 56) | (((((((((long) bArr[i]) & 255) | ((((long) bArr[i + 1]) & 255) << 8)) | ((((long) bArr[i + 2]) & 255) << 16)) | ((((long) bArr[i + 3]) & 255) << 24)) | ((((long) bArr[i + 4]) & 255) << 32)) | ((((long) bArr[i + 5]) & 255) << 40)) | ((((long) bArr[i + 6]) & 255) << 48));
    }

    public int mo3994b(int i) {
        if (i < 0) {
            throw nxc.m37019b();
        }
        int i2 = (this.f31151k + this.f31148h) + i;
        int i3 = this.f31152l;
        if (i2 > i3) {
            throw nxc.m37018a();
        }
        this.f31152l = i2;
        m36793y();
        return i3;
    }

    private void m36793y() {
        this.f31146f += this.f31147g;
        int i = this.f31151k + this.f31146f;
        if (i > this.f31152l) {
            this.f31147g = i - this.f31152l;
            this.f31146f -= this.f31147g;
            return;
        }
        this.f31147g = 0;
    }

    public void mo3996c(int i) {
        this.f31152l = i;
        m36793y();
    }

    public int mo4014u() {
        if (this.f31152l == Integer.MAX_VALUE) {
            return -1;
        }
        return this.f31152l - (this.f31151k + this.f31148h);
    }

    private boolean m36794z() {
        return this.f31148h == this.f31146f;
    }

    private byte m36786A() {
        if (this.f31148h == this.f31146f) {
            throw nxc.m37018a();
        }
        byte[] bArr = this.f31144d;
        int i = this.f31148h;
        this.f31148h = i + 1;
        return bArr[i];
    }

    private byte[] m36787d(int i) {
        if (i <= 0 || i > this.f31146f - this.f31148h) {
            return m36788e(i);
        }
        int i2 = this.f31148h;
        this.f31148h += i;
        return Arrays.copyOfRange(this.f31144d, i2, this.f31148h);
    }

    private byte[] m36788e(int i) {
        if (i > 0) {
            int i2 = (this.f31151k + this.f31148h) + i;
            if (i2 > this.c) {
                throw new nxc("Protocol message was too large.  May be malicious.  Use CodedInputStream.setSizeLimit() to increase the size limit.");
            }
            if (i2 > this.f31152l) {
                m36789f((this.f31152l - this.f31151k) - this.f31148h);
            }
            throw nxc.m37018a();
        } else if (i == 0) {
            return nwv.f31200c;
        } else {
            throw nxc.m37019b();
        }
    }

    private void m36789f(int i) {
        if (i >= 0 && i <= this.f31146f - this.f31148h) {
            this.f31148h += i;
        } else if (i < 0) {
            throw nxc.m37019b();
        } else {
            throw nxc.m37018a();
        }
    }

    nvx(byte[] bArr, int i, int i2, boolean z) {
        this.f31144d = bArr;
        this.f31146f = i + i2;
        this.f31148h = i;
        this.f31151k = -this.f31148h;
        this.f31145e = z;
    }
}
