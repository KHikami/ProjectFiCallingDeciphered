package p000;

import java.math.RoundingMode;

public final class mru {
    static final byte[] f28231a = new byte[]{(byte) 9, (byte) 9, (byte) 9, (byte) 8, (byte) 8, (byte) 8, (byte) 7, (byte) 7, (byte) 7, (byte) 6, (byte) 6, (byte) 6, (byte) 6, (byte) 5, (byte) 5, (byte) 5, (byte) 4, (byte) 4, (byte) 4, (byte) 3, (byte) 3, (byte) 3, (byte) 3, (byte) 2, (byte) 2, (byte) 2, (byte) 1, (byte) 1, (byte) 1, (byte) 0, (byte) 0, (byte) 0, (byte) 0};
    static final int[] f28232b = new int[]{1, 10, 100, 1000, 10000, 100000, 1000000, 10000000, 100000000, 1000000000};
    static final int[] f28233c = new int[]{3, 31, 316, 3162, 31622, 316227, 3162277, 31622776, 316227766, Integer.MAX_VALUE};
    static int[] f28234d = new int[]{Integer.MAX_VALUE, Integer.MAX_VALUE, 65536, 2345, 477, 193, 110, 75, 58, 49, 43, 39, 37, 35, 34, 34, 33};
    private static final int[] f28235e = new int[]{1, 1, 2, 6, 24, 120, 720, 5040, 40320, 362880, 3628800, 39916800, 479001600};

    public static int m32810a(int i, RoundingMode roundingMode) {
        int i2 = 1;
        gwb.m2162e("x", i);
        switch (mrv.f28236a[roundingMode.ordinal()]) {
            case 1:
                int i3;
                if (i > 0) {
                    i3 = 1;
                } else {
                    i3 = 0;
                }
                if (((i - 1) & i) != 0) {
                    i2 = 0;
                }
                gwb.m2148d(i2 & i3);
                break;
            case 2:
            case 3:
                break;
            case 4:
            case 5:
                return 32 - Integer.numberOfLeadingZeros(i - 1);
            case 6:
            case 7:
            case 8:
                i2 = Integer.numberOfLeadingZeros(i);
                return (31 - i2) + (((((-1257966797 >>> i2) - i) ^ -1) ^ -1) >>> 31);
            default:
                throw new AssertionError();
        }
        return 31 - Integer.numberOfLeadingZeros(i);
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static int m32809a(int i, int i2, RoundingMode roundingMode) {
        boolean z = true;
        boolean z2 = false;
        bm.m6122a((Object) roundingMode);
        if (i2 == 0) {
            throw new ArithmeticException("/ by zero");
        }
        int i3 = i / i2;
        int i4 = i - (i2 * i3);
        if (i4 == 0) {
            return i3;
        }
        int i5 = ((i ^ i2) >> 31) | 1;
        switch (mrv.f28236a[roundingMode.ordinal()]) {
            case 1:
                if (i4 != 0) {
                    z = false;
                }
                gwb.m2148d(z);
                break;
            case 2:
                break;
            case 3:
                if (i5 >= 0) {
                    z = false;
                    break;
                }
                break;
            case 4:
                break;
            case 5:
                if (i5 <= 0) {
                    z = false;
                    break;
                }
                break;
            case 6:
            case 7:
            case 8:
                i4 = Math.abs(i4);
                i4 -= Math.abs(i2) - i4;
                if (i4 != 0) {
                    if (i4 <= 0) {
                        z = false;
                        break;
                    }
                }
                if (roundingMode != RoundingMode.HALF_UP) {
                    break;
                }
                z2 = true;
                z = z2;
                break;
                break;
            default:
                throw new AssertionError();
        }
        z = false;
        if (z) {
            return i3 + i5;
        }
        return i3;
    }
}
