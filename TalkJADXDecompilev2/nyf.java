package defpackage;

final class nyf extends nyc {
    nyf() {
    }

    int a(int i, byte[] bArr, int i2, int i3) {
        if (((i2 | i3) | (bArr.length - i3)) < 0) {
            throw new ArrayIndexOutOfBoundsException(String.format("Array length=%d, index=%d, limit=%d", new Object[]{Integer.valueOf(bArr.length), Integer.valueOf(i2), Integer.valueOf(i3)}));
        }
        long j = nxz.d + ((long) i2);
        return nyf.a(bArr, j, (int) ((nxz.d + ((long) i3)) - j));
    }

    private static int a(byte[] bArr, int i, long j, int i2) {
        switch (i2) {
            case 0:
                return nyb.a(i);
            case 1:
                return nyb.a(i, nxz.a(bArr, j));
            case 2:
                return nyb.a(i, nxz.a(bArr, j), nxz.a(bArr, 1 + j));
            default:
                throw new AssertionError();
        }
    }

    int a(CharSequence charSequence, byte[] bArr, int i, int i2) {
        long j = ((long) i) + nxz.d;
        long j2 = j + ((long) i2);
        int length = charSequence.length();
        if (length > i2 || bArr.length - i2 < i) {
            throw new ArrayIndexOutOfBoundsException("Failed writing " + charSequence.charAt(length - 1) + " at index " + (i + i2));
        }
        int i3 = 0;
        while (i3 < length) {
            char charAt = charSequence.charAt(i3);
            if (charAt >= '') {
                break;
            }
            long j3 = 1 + j;
            nxz.a(bArr, j, (byte) charAt);
            i3++;
            j = j3;
        }
        if (i3 == length) {
            return (int) (j - nxz.d);
        }
        j3 = j;
        while (i3 < length) {
            charAt = charSequence.charAt(i3);
            if (charAt < '' && j3 < j2) {
                j = 1 + j3;
                nxz.a(bArr, j3, (byte) charAt);
            } else if (charAt < 'ࠀ' && j3 <= j2 - 2) {
                r12 = j3 + 1;
                nxz.a(bArr, j3, (byte) ((charAt >>> 6) | 960));
                j = 1 + r12;
                nxz.a(bArr, r12, (byte) ((charAt & 63) | 128));
            } else if ((charAt < '?' || '?' < charAt) && j3 <= j2 - 3) {
                j = 1 + j3;
                nxz.a(bArr, j3, (byte) ((charAt >>> 12) | 480));
                j3 = 1 + j;
                nxz.a(bArr, j, (byte) (((charAt >>> 6) & 63) | 128));
                j = 1 + j3;
                nxz.a(bArr, j3, (byte) ((charAt & 63) | 128));
            } else if (j3 <= j2 - 4) {
                if (i3 + 1 != length) {
                    i3++;
                    char charAt2 = charSequence.charAt(i3);
                    if (Character.isSurrogatePair(charAt, charAt2)) {
                        int toCodePoint = Character.toCodePoint(charAt, charAt2);
                        j = 1 + j3;
                        nxz.a(bArr, j3, (byte) ((toCodePoint >>> 18) | 240));
                        j3 = 1 + j;
                        nxz.a(bArr, j, (byte) (((toCodePoint >>> 12) & 63) | 128));
                        r12 = j3 + 1;
                        nxz.a(bArr, j3, (byte) (((toCodePoint >>> 6) & 63) | 128));
                        j = 1 + r12;
                        nxz.a(bArr, r12, (byte) ((toCodePoint & 63) | 128));
                    }
                }
                throw new nye(i3 - 1, length);
            } else if ('?' > charAt || charAt > '?' || (i3 + 1 != length && Character.isSurrogatePair(charAt, charSequence.charAt(i3 + 1)))) {
                throw new ArrayIndexOutOfBoundsException("Failed writing " + charAt + " at index " + j3);
            } else {
                throw new nye(i3, length);
            }
            i3++;
            j3 = j;
        }
        return (int) (j3 - nxz.d);
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static int a(byte[] r9, long r10, int r12) {
        /*
        r0 = 16;
        if (r12 >= r0) goto L_0x001b;
    L_0x0004:
        r0 = 0;
    L_0x0005:
        r1 = r12 - r0;
        r2 = (long) r0;
        r2 = r2 + r10;
        r0 = r1;
    L_0x000a:
        r1 = 0;
        r4 = r2;
    L_0x000c:
        if (r0 <= 0) goto L_0x0054;
    L_0x000e:
        r2 = 1;
        r2 = r2 + r4;
        r1 = defpackage.nxz.a(r9, r4);
        if (r1 < 0) goto L_0x0053;
    L_0x0017:
        r0 = r0 + -1;
        r4 = r2;
        goto L_0x000c;
    L_0x001b:
        r0 = (int) r10;
        r1 = r0 & 7;
        r0 = r1;
        r2 = r10;
    L_0x0020:
        if (r0 <= 0) goto L_0x0032;
    L_0x0022:
        r4 = 1;
        r4 = r4 + r2;
        r2 = defpackage.nxz.a(r9, r2);
        if (r2 >= 0) goto L_0x002e;
    L_0x002b:
        r0 = r1 - r0;
        goto L_0x0005;
    L_0x002e:
        r0 = r0 + -1;
        r2 = r4;
        goto L_0x0020;
    L_0x0032:
        r0 = r12 - r1;
    L_0x0034:
        r1 = 8;
        if (r0 < r1) goto L_0x0050;
    L_0x0038:
        r1 = defpackage.nxz.a;
        r4 = r1.getLong(r9, r2);
        r6 = -9187201950435737472; // 0x8080808080808080 float:-1.180104E-38 double:-2.937446524422997E-306;
        r4 = r4 & r6;
        r6 = 0;
        r1 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1));
        if (r1 != 0) goto L_0x0050;
    L_0x004a:
        r4 = 8;
        r2 = r2 + r4;
        r0 = r0 + -8;
        goto L_0x0034;
    L_0x0050:
        r0 = r12 - r0;
        goto L_0x0005;
    L_0x0053:
        r4 = r2;
    L_0x0054:
        if (r0 != 0) goto L_0x0058;
    L_0x0056:
        r0 = 0;
    L_0x0057:
        return r0;
    L_0x0058:
        r0 = r0 + -1;
        r2 = -32;
        if (r1 >= r2) goto L_0x0075;
    L_0x005e:
        if (r0 != 0) goto L_0x0062;
    L_0x0060:
        r0 = r1;
        goto L_0x0057;
    L_0x0062:
        r0 = r0 + -1;
        r2 = -62;
        if (r1 < r2) goto L_0x0073;
    L_0x0068:
        r2 = 1;
        r2 = r2 + r4;
        r1 = defpackage.nxz.a(r9, r4);
        r4 = -65;
        if (r1 <= r4) goto L_0x000a;
    L_0x0073:
        r0 = -1;
        goto L_0x0057;
    L_0x0075:
        r2 = -16;
        if (r1 >= r2) goto L_0x00ac;
    L_0x0079:
        r2 = 2;
        if (r0 >= r2) goto L_0x0081;
    L_0x007c:
        r0 = defpackage.nyf.a(r9, r1, r4, r0);
        goto L_0x0057;
    L_0x0081:
        r0 = r0 + -2;
        r2 = 1;
        r6 = r4 + r2;
        r2 = defpackage.nxz.a(r9, r4);
        r3 = -65;
        if (r2 > r3) goto L_0x00aa;
    L_0x008f:
        r3 = -32;
        if (r1 != r3) goto L_0x0097;
    L_0x0093:
        r3 = -96;
        if (r2 < r3) goto L_0x00aa;
    L_0x0097:
        r3 = -19;
        if (r1 != r3) goto L_0x009f;
    L_0x009b:
        r1 = -96;
        if (r2 >= r1) goto L_0x00aa;
    L_0x009f:
        r2 = 1;
        r2 = r2 + r6;
        r1 = defpackage.nxz.a(r9, r6);
        r4 = -65;
        if (r1 <= r4) goto L_0x000a;
    L_0x00aa:
        r0 = -1;
        goto L_0x0057;
    L_0x00ac:
        r2 = 3;
        if (r0 >= r2) goto L_0x00b4;
    L_0x00af:
        r0 = defpackage.nyf.a(r9, r1, r4, r0);
        goto L_0x0057;
    L_0x00b4:
        r0 = r0 + -3;
        r2 = 1;
        r2 = r2 + r4;
        r4 = defpackage.nxz.a(r9, r4);
        r5 = -65;
        if (r4 > r5) goto L_0x00e0;
    L_0x00c1:
        r1 = r1 << 28;
        r4 = r4 + 112;
        r1 = r1 + r4;
        r1 = r1 >> 30;
        if (r1 != 0) goto L_0x00e0;
    L_0x00ca:
        r4 = 1;
        r4 = r4 + r2;
        r1 = defpackage.nxz.a(r9, r2);
        r2 = -65;
        if (r1 > r2) goto L_0x00e0;
    L_0x00d5:
        r2 = 1;
        r2 = r2 + r4;
        r1 = defpackage.nxz.a(r9, r4);
        r4 = -65;
        if (r1 <= r4) goto L_0x000a;
    L_0x00e0:
        r0 = -1;
        goto L_0x0057;
        */
        throw new UnsupportedOperationException("Method not decompiled: nyf.a(byte[], long, int):int");
    }
}
