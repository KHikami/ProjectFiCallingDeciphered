package p000;

final class nyb {
    static final nyc f31237a;

    static int m37060a(int i) {
        return i > -12 ? -1 : i;
    }

    static int m37061a(int i, int i2) {
        return (i > -12 || i2 > -65) ? -1 : (i2 << 8) ^ i;
    }

    static int m37062a(int i, int i2, int i3) {
        return (i > -12 || i2 > -65 || i3 > -65) ? -1 : ((i2 << 8) ^ i) ^ (i3 << 16);
    }

    static int m37065a(byte[] bArr, int i, int i2) {
        int i3 = bArr[i - 1];
        switch (i2 - i) {
            case 0:
                return nyb.m37060a(i3);
            case 1:
                return nyb.m37061a(i3, bArr[i]);
            case 2:
                return nyb.m37062a(i3, bArr[i], bArr[i + 1]);
            default:
                throw new AssertionError();
        }
    }

    static int m37063a(CharSequence charSequence) {
        int i = 0;
        int length = charSequence.length();
        int i2 = 0;
        while (i2 < length && charSequence.charAt(i2) < '') {
            i2++;
        }
        int i3 = length;
        while (i2 < length) {
            char charAt = charSequence.charAt(i2);
            if (charAt < 'ࠀ') {
                i3 += (127 - charAt) >>> 31;
                i2++;
            } else {
                int length2 = charSequence.length();
                while (i2 < length2) {
                    char charAt2 = charSequence.charAt(i2);
                    if (charAt2 < 'ࠀ') {
                        i += (127 - charAt2) >>> 31;
                    } else {
                        i += 2;
                        if ('?' <= charAt2 && charAt2 <= '?') {
                            if (Character.codePointAt(charSequence, i2) < 65536) {
                                throw new nye(i2, length2);
                            }
                            i2++;
                        }
                    }
                    i2++;
                }
                i2 = i3 + i;
                if (i2 < length) {
                    return i2;
                }
                throw new IllegalArgumentException("UTF-8 length does not fit in int: " + (((long) i2) + 4294967296L));
            }
        }
        i2 = i3;
        if (i2 < length) {
            return i2;
        }
        throw new IllegalArgumentException("UTF-8 length does not fit in int: " + (((long) i2) + 4294967296L));
    }

    static int m37064a(CharSequence charSequence, byte[] bArr, int i, int i2) {
        return f31237a.mo4074a(charSequence, bArr, i, i2);
    }

    static {
        Object obj;
        if (nxz.f31234c && nxz.f31233b) {
            obj = 1;
        } else {
            obj = null;
        }
        f31237a = obj != null ? new nyf() : new nyd();
    }
}
