package defpackage;

import java.math.RoundingMode;

/* compiled from: PG */
/* renamed from: dcb */
public final class dcb {
    public static int a(int i, RoundingMode roundingMode) {
        int i2 = 1;
        buf.e("x", i);
        switch (dcc.a[roundingMode.ordinal()]) {
            case rq.b /*1*/:
                int i3;
                if (i > 0) {
                    i3 = 1;
                } else {
                    i3 = 0;
                }
                if (((i - 1) & i) != 0) {
                    i2 = 0;
                }
                buf.f(i2 & i3);
                break;
            case rq.c /*2*/:
            case rl.e /*3*/:
                break;
            case rl.f /*4*/:
            case rl.g /*5*/:
                return 32 - Integer.numberOfLeadingZeros(i - 1);
            case rl.i /*6*/:
            case rl.h /*7*/:
            case rl.j /*8*/:
                i2 = Integer.numberOfLeadingZeros(i);
                return (31 - i2) + (((((-1257966797 >>> i2) - i) ^ -1) ^ -1) >>> 31);
            default:
                throw new AssertionError();
        }
        return 31 - Integer.numberOfLeadingZeros(i);
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static int a(int r7, int r8, java.math.RoundingMode r9) {
        /*
        r0 = 1;
        r1 = 0;
        defpackage.cob.i(r9);
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
        r4 = defpackage.dcc.a;
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
        defpackage.buf.f(r0);
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
        throw new UnsupportedOperationException("Method not decompiled: dcb.a(int, int, java.math.RoundingMode):int");
    }
}
