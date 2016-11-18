package p000;

public final class keu extends kev {
    static final byte[] f21524a = new byte[]{(byte) 13, (byte) 10};
    private static final byte[] f21525e = new byte[]{(byte) 65, (byte) 66, (byte) 67, (byte) 68, (byte) 69, (byte) 70, (byte) 71, (byte) 72, (byte) 73, (byte) 74, (byte) 75, (byte) 76, (byte) 77, (byte) 78, (byte) 79, (byte) 80, (byte) 81, (byte) 82, (byte) 83, (byte) 84, (byte) 85, (byte) 86, (byte) 87, (byte) 88, (byte) 89, (byte) 90, (byte) 97, (byte) 98, (byte) 99, (byte) 100, (byte) 101, (byte) 102, (byte) 103, (byte) 104, (byte) 105, (byte) 106, (byte) 107, (byte) 108, (byte) 109, (byte) 110, (byte) 111, (byte) 112, (byte) 113, (byte) 114, (byte) 115, (byte) 116, (byte) 117, (byte) 118, (byte) 119, (byte) 120, (byte) 121, (byte) 122, (byte) 48, (byte) 49, (byte) 50, (byte) 51, (byte) 52, (byte) 53, (byte) 54, (byte) 55, (byte) 56, (byte) 57, (byte) 43, (byte) 47};
    private static final byte[] f21526f = new byte[]{(byte) 65, (byte) 66, (byte) 67, (byte) 68, (byte) 69, (byte) 70, (byte) 71, (byte) 72, (byte) 73, (byte) 74, (byte) 75, (byte) 76, (byte) 77, (byte) 78, (byte) 79, (byte) 80, (byte) 81, (byte) 82, (byte) 83, (byte) 84, (byte) 85, (byte) 86, (byte) 87, (byte) 88, (byte) 89, (byte) 90, (byte) 97, (byte) 98, (byte) 99, (byte) 100, (byte) 101, (byte) 102, (byte) 103, (byte) 104, (byte) 105, (byte) 106, (byte) 107, (byte) 108, (byte) 109, (byte) 110, (byte) 111, (byte) 112, (byte) 113, (byte) 114, (byte) 115, (byte) 116, (byte) 117, (byte) 118, (byte) 119, (byte) 120, (byte) 121, (byte) 122, (byte) 48, (byte) 49, (byte) 50, (byte) 51, (byte) 52, (byte) 53, (byte) 54, (byte) 55, (byte) 56, (byte) 57, (byte) 45, (byte) 95};
    private static final byte[] f21527g = new byte[]{(byte) -1, (byte) -1, (byte) -1, (byte) -1, (byte) -1, (byte) -1, (byte) -1, (byte) -1, (byte) -1, (byte) -1, (byte) -1, (byte) -1, (byte) -1, (byte) -1, (byte) -1, (byte) -1, (byte) -1, (byte) -1, (byte) -1, (byte) -1, (byte) -1, (byte) -1, (byte) -1, (byte) -1, (byte) -1, (byte) -1, (byte) -1, (byte) -1, (byte) -1, (byte) -1, (byte) -1, (byte) -1, (byte) -1, (byte) -1, (byte) -1, (byte) -1, (byte) -1, (byte) -1, (byte) -1, (byte) -1, (byte) -1, (byte) -1, (byte) -1, (byte) 62, (byte) -1, (byte) 62, (byte) -1, (byte) 63, (byte) 52, (byte) 53, (byte) 54, (byte) 55, (byte) 56, (byte) 57, (byte) 58, (byte) 59, (byte) 60, (byte) 61, (byte) -1, (byte) -1, (byte) -1, (byte) -1, (byte) -1, (byte) -1, (byte) -1, (byte) 0, (byte) 1, (byte) 2, (byte) 3, (byte) 4, (byte) 5, (byte) 6, (byte) 7, (byte) 8, (byte) 9, (byte) 10, (byte) 11, (byte) 12, (byte) 13, (byte) 14, (byte) 15, (byte) 16, (byte) 17, (byte) 18, (byte) 19, (byte) 20, (byte) 21, (byte) 22, (byte) 23, (byte) 24, (byte) 25, (byte) -1, (byte) -1, (byte) -1, (byte) -1, (byte) 63, (byte) -1, (byte) 26, (byte) 27, (byte) 28, (byte) 29, (byte) 30, (byte) 31, (byte) 32, (byte) 33, (byte) 34, (byte) 35, (byte) 36, (byte) 37, (byte) 38, (byte) 39, (byte) 40, (byte) 41, (byte) 42, (byte) 43, (byte) 44, (byte) 45, (byte) 46, (byte) 47, (byte) 48, (byte) 49, (byte) 50, (byte) 51};
    private final byte[] f21528h;
    private final byte[] f21529i;
    private final byte[] f21530j;
    private final int f21531k;
    private final int f21532l;

    public keu() {
        this(0);
    }

    private keu(boolean z) {
        this(76, f21524a, z);
    }

    private keu(int i) {
        this(0, f21524a);
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
        this.f21529i = f21527g;
        if (bArr == null) {
            this.f21532l = 4;
            this.f21530j = null;
        } else if (m25687d(bArr)) {
            throw new IllegalArgumentException("lineSeparator must not contain base64 characters: [" + gwb.m2197f(bArr) + "]");
        } else if (i > 0) {
            this.f21532l = bArr.length + 4;
            this.f21530j = new byte[bArr.length];
            System.arraycopy(bArr, 0, this.f21530j, 0, bArr.length);
        } else {
            this.f21532l = 4;
            this.f21530j = null;
        }
        this.f21531k = this.f21532l - 1;
        this.f21528h = z ? f21526f : f21525e;
    }

    void mo3668a(byte[] bArr, int i, int i2, kew kew) {
        if (!kew.f21538f) {
            int i3;
            int i4;
            if (i2 < 0) {
                kew.f21538f = true;
                if (kew.f21540h != 0 || this.d != 0) {
                    Object a = m25684a(this.f21532l, kew);
                    i3 = kew.f21536d;
                    switch (kew.f21540h) {
                        case 0:
                            break;
                        case 1:
                            i4 = kew.f21536d;
                            kew.f21536d = i4 + 1;
                            a[i4] = this.f21528h[(kew.f21533a >> 2) & 63];
                            i4 = kew.f21536d;
                            kew.f21536d = i4 + 1;
                            a[i4] = this.f21528h[(kew.f21533a << 4) & 63];
                            if (this.f21528h == f21525e) {
                                i4 = kew.f21536d;
                                kew.f21536d = i4 + 1;
                                a[i4] = this.c;
                                i4 = kew.f21536d;
                                kew.f21536d = i4 + 1;
                                a[i4] = this.c;
                                break;
                            }
                            break;
                        case 2:
                            i4 = kew.f21536d;
                            kew.f21536d = i4 + 1;
                            a[i4] = this.f21528h[(kew.f21533a >> 10) & 63];
                            i4 = kew.f21536d;
                            kew.f21536d = i4 + 1;
                            a[i4] = this.f21528h[(kew.f21533a >> 4) & 63];
                            i4 = kew.f21536d;
                            kew.f21536d = i4 + 1;
                            a[i4] = this.f21528h[(kew.f21533a << 2) & 63];
                            if (this.f21528h == f21525e) {
                                i4 = kew.f21536d;
                                kew.f21536d = i4 + 1;
                                a[i4] = this.c;
                                break;
                            }
                            break;
                        default:
                            throw new IllegalStateException("Impossible modulus " + kew.f21540h);
                    }
                    kew.f21539g = (kew.f21536d - i3) + kew.f21539g;
                    if (this.d > 0 && kew.f21539g > 0) {
                        System.arraycopy(this.f21530j, 0, a, kew.f21536d, this.f21530j.length);
                        kew.f21536d += this.f21530j.length;
                        return;
                    }
                    return;
                }
                return;
            }
            i3 = 0;
            while (i3 < i2) {
                Object a2 = m25684a(this.f21532l, kew);
                kew.f21540h = (kew.f21540h + 1) % 3;
                i4 = i + 1;
                int i5 = bArr[i];
                if (i5 < 0) {
                    i5 += 256;
                }
                kew.f21533a = i5 + (kew.f21533a << 8);
                if (kew.f21540h == 0) {
                    i5 = kew.f21536d;
                    kew.f21536d = i5 + 1;
                    a2[i5] = this.f21528h[(kew.f21533a >> 18) & 63];
                    i5 = kew.f21536d;
                    kew.f21536d = i5 + 1;
                    a2[i5] = this.f21528h[(kew.f21533a >> 12) & 63];
                    i5 = kew.f21536d;
                    kew.f21536d = i5 + 1;
                    a2[i5] = this.f21528h[(kew.f21533a >> 6) & 63];
                    i5 = kew.f21536d;
                    kew.f21536d = i5 + 1;
                    a2[i5] = this.f21528h[kew.f21533a & 63];
                    kew.f21539g += 4;
                    if (this.d > 0 && this.d <= kew.f21539g) {
                        System.arraycopy(this.f21530j, 0, a2, kew.f21536d, this.f21530j.length);
                        kew.f21536d += this.f21530j.length;
                        kew.f21539g = 0;
                    }
                }
                i3++;
                i = i4;
            }
        }
    }

    public static String m25691b(byte[] bArr) {
        return gwb.m2197f(keu.m25690a(bArr, false, true));
    }

    protected boolean mo3669a(byte b) {
        return b >= (byte) 0 && b < this.f21529i.length && this.f21529i[b] != (byte) -1;
    }

    public static String m25689a(byte[] bArr) {
        return gwb.m2197f(keu.m25690a(bArr, false, false));
    }

    private static byte[] m25690a(byte[] bArr, boolean z, boolean z2) {
        if (bArr == null || bArr.length == 0) {
            return bArr;
        }
        keu keu = z ? new keu(z2) : new keu(0, f21524a, z2);
        long e = keu.m25688e(bArr);
        if (e <= 2147483647L) {
            return keu.m25686c(bArr);
        }
        throw new IllegalArgumentException("Input array too big, the output array would be bigger (" + e + ") than the specified maximum size of 2147483647");
    }
}
