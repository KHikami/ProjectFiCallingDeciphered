package p000;

final class nyf extends nyc {
    nyf() {
    }

    int mo4073a(int i, byte[] bArr, int i2, int i3) {
        if (((i2 | i3) | (bArr.length - i3)) < 0) {
            throw new ArrayIndexOutOfBoundsException(String.format("Array length=%d, index=%d, limit=%d", new Object[]{Integer.valueOf(bArr.length), Integer.valueOf(i2), Integer.valueOf(i3)}));
        }
        long j = nxz.f31235d + ((long) i2);
        return nyf.m37071a(bArr, j, (int) ((nxz.f31235d + ((long) i3)) - j));
    }

    private static int m37070a(byte[] bArr, int i, long j, int i2) {
        switch (i2) {
            case 0:
                return nyb.m37060a(i);
            case 1:
                return nyb.m37061a(i, nxz.m37052a(bArr, j));
            case 2:
                return nyb.m37062a(i, nxz.m37052a(bArr, j), nxz.m37052a(bArr, 1 + j));
            default:
                throw new AssertionError();
        }
    }

    int mo4074a(CharSequence charSequence, byte[] bArr, int i, int i2) {
        long j = ((long) i) + nxz.f31235d;
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
            nxz.m37055a(bArr, j, (byte) charAt);
            i3++;
            j = j3;
        }
        if (i3 == length) {
            return (int) (j - nxz.f31235d);
        }
        j3 = j;
        while (i3 < length) {
            charAt = charSequence.charAt(i3);
            if (charAt < '' && j3 < j2) {
                j = 1 + j3;
                nxz.m37055a(bArr, j3, (byte) charAt);
            } else if (charAt < 'ࠀ' && j3 <= j2 - 2) {
                r12 = j3 + 1;
                nxz.m37055a(bArr, j3, (byte) ((charAt >>> 6) | 960));
                j = 1 + r12;
                nxz.m37055a(bArr, r12, (byte) ((charAt & 63) | 128));
            } else if ((charAt < '?' || '?' < charAt) && j3 <= j2 - 3) {
                j = 1 + j3;
                nxz.m37055a(bArr, j3, (byte) ((charAt >>> 12) | 480));
                j3 = 1 + j;
                nxz.m37055a(bArr, j, (byte) (((charAt >>> 6) & 63) | 128));
                j = 1 + j3;
                nxz.m37055a(bArr, j3, (byte) ((charAt & 63) | 128));
            } else if (j3 <= j2 - 4) {
                if (i3 + 1 != length) {
                    i3++;
                    char charAt2 = charSequence.charAt(i3);
                    if (Character.isSurrogatePair(charAt, charAt2)) {
                        int toCodePoint = Character.toCodePoint(charAt, charAt2);
                        j = 1 + j3;
                        nxz.m37055a(bArr, j3, (byte) ((toCodePoint >>> 18) | 240));
                        j3 = 1 + j;
                        nxz.m37055a(bArr, j, (byte) (((toCodePoint >>> 12) & 63) | 128));
                        r12 = j3 + 1;
                        nxz.m37055a(bArr, j3, (byte) (((toCodePoint >>> 6) & 63) | 128));
                        j = 1 + r12;
                        nxz.m37055a(bArr, r12, (byte) ((toCodePoint & 63) | 128));
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
        return (int) (j3 - nxz.f31235d);
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static int m37071a(byte[] bArr, long j, int i) {
        int i2;
        int i3;
        long j2;
        long j3;
        if (i < 16) {
            i2 = 0;
        } else {
            i3 = ((int) j) & 7;
            i2 = i3;
            j2 = j;
            while (i2 > 0) {
                j3 = 1 + j2;
                if (nxz.m37052a(bArr, j2) < (byte) 0) {
                    i2 = i3 - i2;
                    break;
                }
                i2--;
                j2 = j3;
            }
            i2 = i - i3;
            while (i2 >= 8 && (nxz.f31232a.getLong(bArr, j2) & -9187201950435737472L) == 0) {
                j2 += 8;
                i2 -= 8;
            }
            i2 = i - i2;
        }
        j2 = ((long) i2) + j;
        i2 = i - i2;
        while (true) {
            i3 = (byte) 0;
            j3 = j2;
            while (i2 > 0) {
                j2 = 1 + j3;
                i3 = nxz.m37052a(bArr, j3);
                if (i3 < 0) {
                    j3 = j2;
                    break;
                }
                i2--;
                j3 = j2;
            }
            if (i2 != 0) {
                i2--;
                if (i3 >= -32) {
                    if (i3 >= -16) {
                        if (i2 >= 3) {
                            i2 -= 3;
                            j2 = 1 + j3;
                            byte a = nxz.m37052a(bArr, j3);
                            if (a > (byte) -65 || (((i3 << 28) + (a + 112)) >> 30) != 0) {
                                break;
                            }
                            j3 = 1 + j2;
                            if (nxz.m37052a(bArr, j2) > (byte) -65) {
                                break;
                            }
                            j2 = 1 + j3;
                            if (nxz.m37052a(bArr, j3) > (byte) -65) {
                                break;
                            }
                        } else {
                            return nyf.m37070a(bArr, i3, j3, i2);
                        }
                    } else if (i2 >= 2) {
                        i2 -= 2;
                        long j4 = j3 + 1;
                        byte a2 = nxz.m37052a(bArr, j3);
                        if (a2 > (byte) -65 || ((i3 == -32 && a2 < (byte) -96) || (i3 == -19 && a2 >= (byte) -96))) {
                            break;
                        }
                        j2 = 1 + j4;
                        if (nxz.m37052a(bArr, j4) > (byte) -65) {
                            break;
                        }
                    } else {
                        return nyf.m37070a(bArr, i3, j3, i2);
                    }
                } else if (i2 != 0) {
                    i2--;
                    if (i3 < -62) {
                        break;
                    }
                    j2 = 1 + j3;
                    if (nxz.m37052a(bArr, j3) > (byte) -65) {
                        break;
                    }
                } else {
                    return i3;
                }
            }
            return 0;
        }
        return -1;
    }
}
