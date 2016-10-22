public final class keu extends kev {
    static final byte[] a;
    private static final byte[] e;
    private static final byte[] f;
    private static final byte[] g;
    private final byte[] h;
    private final byte[] i;
    private final byte[] j;
    private final int k;
    private final int l;

    static {
        a = new byte[]{(byte) 13, (byte) 10};
        e = new byte[]{(byte) 65, (byte) 66, (byte) 67, (byte) 68, (byte) 69, (byte) 70, (byte) 71, (byte) 72, (byte) 73, (byte) 74, (byte) 75, (byte) 76, (byte) 77, (byte) 78, (byte) 79, (byte) 80, (byte) 81, (byte) 82, (byte) 83, (byte) 84, (byte) 85, (byte) 86, (byte) 87, (byte) 88, (byte) 89, (byte) 90, (byte) 97, (byte) 98, (byte) 99, (byte) 100, (byte) 101, (byte) 102, (byte) 103, (byte) 104, (byte) 105, (byte) 106, (byte) 107, (byte) 108, (byte) 109, (byte) 110, (byte) 111, (byte) 112, (byte) 113, (byte) 114, (byte) 115, (byte) 116, (byte) 117, (byte) 118, (byte) 119, (byte) 120, (byte) 121, (byte) 122, (byte) 48, (byte) 49, (byte) 50, (byte) 51, (byte) 52, (byte) 53, (byte) 54, (byte) 55, (byte) 56, (byte) 57, (byte) 43, (byte) 47};
        f = new byte[]{(byte) 65, (byte) 66, (byte) 67, (byte) 68, (byte) 69, (byte) 70, (byte) 71, (byte) 72, (byte) 73, (byte) 74, (byte) 75, (byte) 76, (byte) 77, (byte) 78, (byte) 79, (byte) 80, (byte) 81, (byte) 82, (byte) 83, (byte) 84, (byte) 85, (byte) 86, (byte) 87, (byte) 88, (byte) 89, (byte) 90, (byte) 97, (byte) 98, (byte) 99, (byte) 100, (byte) 101, (byte) 102, (byte) 103, (byte) 104, (byte) 105, (byte) 106, (byte) 107, (byte) 108, (byte) 109, (byte) 110, (byte) 111, (byte) 112, (byte) 113, (byte) 114, (byte) 115, (byte) 116, (byte) 117, (byte) 118, (byte) 119, (byte) 120, (byte) 121, (byte) 122, (byte) 48, (byte) 49, (byte) 50, (byte) 51, (byte) 52, (byte) 53, (byte) 54, (byte) 55, (byte) 56, (byte) 57, (byte) 45, (byte) 95};
        g = new byte[]{(byte) -1, (byte) -1, (byte) -1, (byte) -1, (byte) -1, (byte) -1, (byte) -1, (byte) -1, (byte) -1, (byte) -1, (byte) -1, (byte) -1, (byte) -1, (byte) -1, (byte) -1, (byte) -1, (byte) -1, (byte) -1, (byte) -1, (byte) -1, (byte) -1, (byte) -1, (byte) -1, (byte) -1, (byte) -1, (byte) -1, (byte) -1, (byte) -1, (byte) -1, (byte) -1, (byte) -1, (byte) -1, (byte) -1, (byte) -1, (byte) -1, (byte) -1, (byte) -1, (byte) -1, (byte) -1, (byte) -1, (byte) -1, (byte) -1, (byte) -1, (byte) 62, (byte) -1, (byte) 62, (byte) -1, (byte) 63, (byte) 52, (byte) 53, (byte) 54, (byte) 55, (byte) 56, (byte) 57, (byte) 58, (byte) 59, (byte) 60, (byte) 61, (byte) -1, (byte) -1, (byte) -1, (byte) -1, (byte) -1, (byte) -1, (byte) -1, (byte) 0, (byte) 1, (byte) 2, (byte) 3, (byte) 4, (byte) 5, (byte) 6, (byte) 7, (byte) 8, (byte) 9, (byte) 10, (byte) 11, (byte) 12, (byte) 13, (byte) 14, (byte) 15, (byte) 16, (byte) 17, (byte) 18, (byte) 19, (byte) 20, (byte) 21, (byte) 22, (byte) 23, (byte) 24, (byte) 25, (byte) -1, (byte) -1, (byte) -1, (byte) -1, (byte) 63, (byte) -1, (byte) 26, (byte) 27, (byte) 28, (byte) 29, (byte) 30, (byte) 31, (byte) 32, (byte) 33, (byte) 34, (byte) 35, (byte) 36, (byte) 37, (byte) 38, (byte) 39, (byte) 40, (byte) 41, (byte) 42, (byte) 43, (byte) 44, (byte) 45, (byte) 46, (byte) 47, (byte) 48, (byte) 49, (byte) 50, (byte) 51};
    }

    public keu() {
        this(0);
    }

    private keu(boolean z) {
        this(76, a, z);
    }

    private keu(int i) {
        this(0, a);
    }

    private keu(int i, byte[] bArr) {
        this(i, bArr, false);
    }

    private keu(int i, byte[] bArr, boolean z) {
        int i2;
        if (bArr == null) {
            i2 = 0;
        } else {
            i2 = bArr.length;
        }
        super(3, 4, i, i2);
        this.i = g;
        if (bArr == null) {
            this.l = 4;
            this.j = null;
        } else if (d(bArr)) {
            throw new IllegalArgumentException("lineSeparator must not contain base64 characters: [" + gwb.f(bArr) + "]");
        } else if (i > 0) {
            this.l = bArr.length + 4;
            this.j = new byte[bArr.length];
            System.arraycopy(bArr, 0, this.j, 0, bArr.length);
        } else {
            this.l = 4;
            this.j = null;
        }
        this.k = this.l - 1;
        this.h = z ? f : e;
    }

    void a(byte[] bArr, int i, int i2, kew kew) {
        if (!kew.f) {
            int i3;
            int i4;
            if (i2 < 0) {
                kew.f = true;
                if (kew.h != 0 || this.d != 0) {
                    Object a = a(this.l, kew);
                    i3 = kew.d;
                    switch (kew.h) {
                        case wi.w /*0*/:
                            break;
                        case wi.j /*1*/:
                            i4 = kew.d;
                            kew.d = i4 + 1;
                            a[i4] = this.h[(kew.a >> 2) & 63];
                            i4 = kew.d;
                            kew.d = i4 + 1;
                            a[i4] = this.h[(kew.a << 4) & 63];
                            if (this.h == e) {
                                i4 = kew.d;
                                kew.d = i4 + 1;
                                a[i4] = this.c;
                                i4 = kew.d;
                                kew.d = i4 + 1;
                                a[i4] = this.c;
                                break;
                            }
                            break;
                        case wi.l /*2*/:
                            i4 = kew.d;
                            kew.d = i4 + 1;
                            a[i4] = this.h[(kew.a >> 10) & 63];
                            i4 = kew.d;
                            kew.d = i4 + 1;
                            a[i4] = this.h[(kew.a >> 4) & 63];
                            i4 = kew.d;
                            kew.d = i4 + 1;
                            a[i4] = this.h[(kew.a << 2) & 63];
                            if (this.h == e) {
                                i4 = kew.d;
                                kew.d = i4 + 1;
                                a[i4] = this.c;
                                break;
                            }
                            break;
                        default:
                            throw new IllegalStateException("Impossible modulus " + kew.h);
                    }
                    kew.g = (kew.d - i3) + kew.g;
                    if (this.d > 0 && kew.g > 0) {
                        System.arraycopy(this.j, 0, a, kew.d, this.j.length);
                        kew.d += this.j.length;
                        return;
                    }
                    return;
                }
                return;
            }
            i3 = 0;
            while (i3 < i2) {
                Object a2 = a(this.l, kew);
                kew.h = (kew.h + 1) % 3;
                i4 = i + 1;
                int i5 = bArr[i];
                if (i5 < 0) {
                    i5 += 256;
                }
                kew.a = i5 + (kew.a << 8);
                if (kew.h == 0) {
                    i5 = kew.d;
                    kew.d = i5 + 1;
                    a2[i5] = this.h[(kew.a >> 18) & 63];
                    i5 = kew.d;
                    kew.d = i5 + 1;
                    a2[i5] = this.h[(kew.a >> 12) & 63];
                    i5 = kew.d;
                    kew.d = i5 + 1;
                    a2[i5] = this.h[(kew.a >> 6) & 63];
                    i5 = kew.d;
                    kew.d = i5 + 1;
                    a2[i5] = this.h[kew.a & 63];
                    kew.g += 4;
                    if (this.d > 0 && this.d <= kew.g) {
                        System.arraycopy(this.j, 0, a2, kew.d, this.j.length);
                        kew.d += this.j.length;
                        kew.g = 0;
                    }
                }
                i3++;
                i = i4;
            }
        }
    }

    public static String b(byte[] bArr) {
        return gwb.f(a(bArr, false, true));
    }

    protected boolean a(byte b) {
        return b >= null && b < this.i.length && this.i[b] != -1;
    }

    public static String a(byte[] bArr) {
        return gwb.f(a(bArr, false, false));
    }

    private static byte[] a(byte[] bArr, boolean z, boolean z2) {
        if (bArr == null || bArr.length == 0) {
            return bArr;
        }
        keu keu = z ? new keu(z2) : new keu(0, a, z2);
        long e = keu.e(bArr);
        if (e <= 2147483647L) {
            return keu.c(bArr);
        }
        throw new IllegalArgumentException("Input array too big, the output array would be bigger (" + e + ") than the specified maximum size of 2147483647");
    }
}
