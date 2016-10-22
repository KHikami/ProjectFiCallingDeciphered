import java.math.RoundingMode;

public final class mru {
    static final byte[] a;
    static final int[] b;
    static final int[] c;
    static int[] d;
    private static final int[] e;

    public static int a(int i, RoundingMode roundingMode) {
        int i2 = 1;
        gwb.e("x", i);
        switch (mrv.a[roundingMode.ordinal()]) {
            case wi.j /*1*/:
                int i3;
                if (i > 0) {
                    i3 = 1;
                } else {
                    i3 = 0;
                }
                if (((i - 1) & i) != 0) {
                    i2 = 0;
                }
                gwb.d(i2 & i3);
                break;
            case wi.l /*2*/:
            case wi.z /*3*/:
                break;
            case wi.h /*4*/:
            case wi.p /*5*/:
                return 32 - Integer.numberOfLeadingZeros(i - 1);
            case wi.s /*6*/:
            case wi.q /*7*/:
            case wi.m /*8*/:
                i2 = Integer.numberOfLeadingZeros(i);
                return (31 - i2) + (((((-1257966797 >>> i2) - i) ^ -1) ^ -1) >>> 31);
            default:
                throw new AssertionError();
        }
        return 31 - Integer.numberOfLeadingZeros(i);
    }

    static {
        a = new byte[]{(byte) 9, (byte) 9, (byte) 9, (byte) 8, (byte) 8, (byte) 8, (byte) 7, (byte) 7, (byte) 7, (byte) 6, (byte) 6, (byte) 6, (byte) 6, (byte) 5, (byte) 5, (byte) 5, (byte) 4, (byte) 4, (byte) 4, (byte) 3, (byte) 3, (byte) 3, (byte) 3, (byte) 2, (byte) 2, (byte) 2, (byte) 1, (byte) 1, (byte) 1, (byte) 0, (byte) 0, (byte) 0, (byte) 0};
        b = new int[]{1, 10, 100, 1000, 10000, 100000, 1000000, 10000000, 100000000, 1000000000};
        c = new int[]{3, 31, 316, 3162, 31622, 316227, 3162277, 31622776, 316227766, Integer.MAX_VALUE};
        e = new int[]{1, 1, 2, 6, 24, 120, 720, 5040, 40320, 362880, 3628800, 39916800, 479001600};
        d = new int[]{Integer.MAX_VALUE, Integer.MAX_VALUE, 65536, 2345, 477, 193, 110, 75, 58, 49, 43, 39, 37, 35, 34, 34, 33};
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static int a(int r7, int r8, java.math.RoundingMode r9) {
        /*
        r0 = 1;
        r1 = 0;
        bm.a(r9);
        if (r8 != 0) goto L_0x000f;
    L_0x0007:
        r0 = new java.lang.ArithmeticException;
        r1 = "/ by zero";
        r0.<init>(r1);
        throw r0;
    L_0x000f:
        r2 = r7 / r8;
        r3 = r8 * r2;
        r3 = r7 - r3;
        if (r3 != 0) goto L_0x0019;
    L_0x0017:
        r0 = r2;
    L_0x0018:
        return r0;
    L_0x0019:
        r4 = r7 ^ r8;
        r4 = r4 >> 31;
        r5 = r4 | 1;
        r4 = mrv.a;
        r6 = r9.ordinal();
        r4 = r4[r6];
        switch(r4) {
            case 1: goto L_0x0030;
            case 2: goto L_0x0035;
            case 3: goto L_0x0041;
            case 4: goto L_0x0036;
            case 5: goto L_0x003d;
            case 6: goto L_0x0045;
            case 7: goto L_0x0045;
            case 8: goto L_0x0045;
            default: goto L_0x002a;
        };
    L_0x002a:
        r0 = new java.lang.AssertionError;
        r0.<init>();
        throw r0;
    L_0x0030:
        if (r3 != 0) goto L_0x003b;
    L_0x0032:
        gwb.d(r0);
    L_0x0035:
        r0 = r1;
    L_0x0036:
        if (r0 == 0) goto L_0x006d;
    L_0x0038:
        r0 = r2 + r5;
        goto L_0x0018;
    L_0x003b:
        r0 = r1;
        goto L_0x0032;
    L_0x003d:
        if (r5 > 0) goto L_0x0036;
    L_0x003f:
        r0 = r1;
        goto L_0x0036;
    L_0x0041:
        if (r5 < 0) goto L_0x0036;
    L_0x0043:
        r0 = r1;
        goto L_0x0036;
    L_0x0045:
        r3 = java.lang.Math.abs(r3);
        r4 = java.lang.Math.abs(r8);
        r4 = r4 - r3;
        r3 = r3 - r4;
        if (r3 != 0) goto L_0x0069;
    L_0x0051:
        r3 = java.math.RoundingMode.HALF_UP;
        if (r9 == r3) goto L_0x0062;
    L_0x0055:
        r3 = java.math.RoundingMode.HALF_EVEN;
        if (r9 != r3) goto L_0x0065;
    L_0x0059:
        r4 = r0;
    L_0x005a:
        r3 = r2 & 1;
        if (r3 == 0) goto L_0x0067;
    L_0x005e:
        r3 = r0;
    L_0x005f:
        r3 = r3 & r4;
        if (r3 == 0) goto L_0x0063;
    L_0x0062:
        r1 = r0;
    L_0x0063:
        r0 = r1;
        goto L_0x0036;
    L_0x0065:
        r4 = r1;
        goto L_0x005a;
    L_0x0067:
        r3 = r1;
        goto L_0x005f;
    L_0x0069:
        if (r3 > 0) goto L_0x0036;
    L_0x006b:
        r0 = r1;
        goto L_0x0036;
    L_0x006d:
        r0 = r2;
        goto L_0x0018;
        */
        throw new UnsupportedOperationException("Method not decompiled: mru.a(int, int, java.math.RoundingMode):int");
    }
}
