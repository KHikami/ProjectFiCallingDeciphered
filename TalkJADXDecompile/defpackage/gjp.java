package defpackage;

import android.os.Handler.Callback;
import android.os.HandlerThread;

/* renamed from: gjp */
final class gjp extends HandlerThread implements Callback {
    public gjp() {
        super("GifDecoder");
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean handleMessage(android.os.Message r23) {
        /*
        r22 = this;
        r0 = r23;
        r2 = r0.obj;
        r2 = (defpackage.gjo) r2;
        if (r2 == 0) goto L_0x0010;
    L_0x0008:
        r3 = r2.z;
        if (r3 == 0) goto L_0x0010;
    L_0x000c:
        r3 = r2.C;
        if (r3 == 0) goto L_0x0012;
    L_0x0010:
        r2 = 1;
    L_0x0011:
        return r2;
    L_0x0012:
        r0 = r23;
        r3 = r0.what;
        switch(r3) {
            case 10: goto L_0x001b;
            case 11: goto L_0x0019;
            case 12: goto L_0x03f5;
            default: goto L_0x0019;
        };
    L_0x0019:
        r2 = 0;
        goto L_0x0011;
    L_0x001b:
        r3 = r2.p;	 Catch:{ ArrayIndexOutOfBoundsException -> 0x0053 }
        switch(r3) {
            case 0: goto L_0x008a;
            case 1: goto L_0x008a;
            case 2: goto L_0x009f;
            case 3: goto L_0x008e;
            default: goto L_0x0020;
        };	 Catch:{ ArrayIndexOutOfBoundsException -> 0x0053 }
    L_0x0020:
        r3 = 0;
        r2.p = r3;	 Catch:{ ArrayIndexOutOfBoundsException -> 0x0053 }
        r3 = 0;
        r2.q = r3;	 Catch:{ ArrayIndexOutOfBoundsException -> 0x0053 }
        r3 = 0;
        r2.D = r3;	 Catch:{ ArrayIndexOutOfBoundsException -> 0x0053 }
        r3 = 100;
        r2.A = r3;	 Catch:{ ArrayIndexOutOfBoundsException -> 0x0053 }
        r3 = 0;
        r2.g = r3;	 Catch:{ ArrayIndexOutOfBoundsException -> 0x0053 }
    L_0x0030:
        r3 = r2.E;	 Catch:{ ArrayIndexOutOfBoundsException -> 0x0053 }
        r4 = r2.L;	 Catch:{ ArrayIndexOutOfBoundsException -> 0x0053 }
        r5 = r4 + 1;
        r2.L = r5;	 Catch:{ ArrayIndexOutOfBoundsException -> 0x0053 }
        r3 = r3[r4];	 Catch:{ ArrayIndexOutOfBoundsException -> 0x0053 }
        r3 = r3 & 255;
        switch(r3) {
            case 0: goto L_0x0030;
            case 33: goto L_0x0040;
            case 44: goto L_0x0146;
            case 59: goto L_0x03d3;
            default: goto L_0x003f;
        };	 Catch:{ ArrayIndexOutOfBoundsException -> 0x0053 }
    L_0x003f:
        goto L_0x0030;
    L_0x0040:
        r3 = r2.E;	 Catch:{ ArrayIndexOutOfBoundsException -> 0x0053 }
        r4 = r2.L;	 Catch:{ ArrayIndexOutOfBoundsException -> 0x0053 }
        r5 = r4 + 1;
        r2.L = r5;	 Catch:{ ArrayIndexOutOfBoundsException -> 0x0053 }
        r3 = r3[r4];	 Catch:{ ArrayIndexOutOfBoundsException -> 0x0053 }
        r3 = r3 & 255;
        switch(r3) {
            case 1: goto L_0x0141;
            case 249: goto L_0x00c8;
            case 254: goto L_0x013c;
            case 255: goto L_0x0111;
            default: goto L_0x004f;
        };	 Catch:{ ArrayIndexOutOfBoundsException -> 0x0053 }
    L_0x004f:
        r2.m();	 Catch:{ ArrayIndexOutOfBoundsException -> 0x0053 }
        goto L_0x0030;
    L_0x0053:
        r3 = move-exception;
        r3 = 1;
        r2.D = r3;
    L_0x0057:
        r3 = r2.D;
        if (r3 == 0) goto L_0x006c;
    L_0x005b:
        r3 = r2.y;
        if (r3 != 0) goto L_0x03d8;
    L_0x005f:
        r3 = 1;
        r2.b = r3;
        r3 = "Babel";
        r4 = "Could not read first frame of the gif.";
        r5 = 0;
        r5 = new java.lang.Object[r5];
        defpackage.glk.d(r3, r4, r5);
    L_0x006c:
        r3 = r2.D;
        if (r3 == 0) goto L_0x0078;
    L_0x0070:
        r3 = r2.b;
        if (r3 != 0) goto L_0x0078;
    L_0x0074:
        r3 = r2.c;
        if (r3 == 0) goto L_0x001b;
    L_0x0078:
        r3 = r2.B;
        r4 = r2.B;
        r5 = 11;
        r2 = r2.A;
        r6 = 0;
        r2 = r4.obtainMessage(r5, r2, r6);
        r3.sendMessage(r2);
        r2 = 1;
        goto L_0x0011;
    L_0x008a:
        r3 = 0;
        r2.w = r3;	 Catch:{ ArrayIndexOutOfBoundsException -> 0x0053 }
        goto L_0x0020;
    L_0x008e:
        r3 = r2.w;	 Catch:{ ArrayIndexOutOfBoundsException -> 0x0053 }
        if (r3 == 0) goto L_0x0020;
    L_0x0092:
        r3 = r2.x;	 Catch:{ ArrayIndexOutOfBoundsException -> 0x0053 }
        r4 = 0;
        r5 = r2.H;	 Catch:{ ArrayIndexOutOfBoundsException -> 0x0053 }
        r6 = 0;
        r7 = r2.x;	 Catch:{ ArrayIndexOutOfBoundsException -> 0x0053 }
        r7 = r7.length;	 Catch:{ ArrayIndexOutOfBoundsException -> 0x0053 }
        java.lang.System.arraycopy(r3, r4, r5, r6, r7);	 Catch:{ ArrayIndexOutOfBoundsException -> 0x0053 }
        goto L_0x0020;
    L_0x009f:
        r3 = 0;
        r2.w = r3;	 Catch:{ ArrayIndexOutOfBoundsException -> 0x0053 }
        r3 = 0;
        r4 = r2.q;	 Catch:{ ArrayIndexOutOfBoundsException -> 0x0053 }
        if (r4 != 0) goto L_0x00a9;
    L_0x00a7:
        r3 = r2.d;	 Catch:{ ArrayIndexOutOfBoundsException -> 0x0053 }
    L_0x00a9:
        r4 = 0;
        r5 = r4;
    L_0x00ab:
        r4 = r2.m;	 Catch:{ ArrayIndexOutOfBoundsException -> 0x0053 }
        if (r5 >= r4) goto L_0x0020;
    L_0x00af:
        r4 = r2.k;	 Catch:{ ArrayIndexOutOfBoundsException -> 0x0053 }
        r4 = r4 + r5;
        r6 = r2.F;	 Catch:{ ArrayIndexOutOfBoundsException -> 0x0053 }
        r4 = r4 * r6;
        r6 = r2.j;	 Catch:{ ArrayIndexOutOfBoundsException -> 0x0053 }
        r4 = r4 + r6;
        r6 = r2.l;	 Catch:{ ArrayIndexOutOfBoundsException -> 0x0053 }
        r6 = r6 + r4;
    L_0x00bb:
        if (r4 >= r6) goto L_0x00c4;
    L_0x00bd:
        r7 = r2.H;	 Catch:{ ArrayIndexOutOfBoundsException -> 0x0053 }
        r7[r4] = r3;	 Catch:{ ArrayIndexOutOfBoundsException -> 0x0053 }
        r4 = r4 + 1;
        goto L_0x00bb;
    L_0x00c4:
        r4 = r5 + 1;
        r5 = r4;
        goto L_0x00ab;
    L_0x00c8:
        r3 = r2.L;	 Catch:{ ArrayIndexOutOfBoundsException -> 0x0053 }
        r3 = r3 + 1;
        r2.L = r3;	 Catch:{ ArrayIndexOutOfBoundsException -> 0x0053 }
        r3 = r2.E;	 Catch:{ ArrayIndexOutOfBoundsException -> 0x0053 }
        r4 = r2.L;	 Catch:{ ArrayIndexOutOfBoundsException -> 0x0053 }
        r5 = r4 + 1;
        r2.L = r5;	 Catch:{ ArrayIndexOutOfBoundsException -> 0x0053 }
        r3 = r3[r4];	 Catch:{ ArrayIndexOutOfBoundsException -> 0x0053 }
        r3 = r3 & 255;
        r4 = r3 & 28;
        r4 = r4 >> 2;
        r2.p = r4;	 Catch:{ ArrayIndexOutOfBoundsException -> 0x0053 }
        r3 = r3 & 1;
        if (r3 == 0) goto L_0x010f;
    L_0x00e4:
        r3 = 1;
    L_0x00e5:
        r2.q = r3;	 Catch:{ ArrayIndexOutOfBoundsException -> 0x0053 }
        r3 = r2.l();	 Catch:{ ArrayIndexOutOfBoundsException -> 0x0053 }
        r3 = r3 * 10;
        r2.A = r3;	 Catch:{ ArrayIndexOutOfBoundsException -> 0x0053 }
        r3 = r2.A;	 Catch:{ ArrayIndexOutOfBoundsException -> 0x0053 }
        r4 = 10;
        if (r3 > r4) goto L_0x00f9;
    L_0x00f5:
        r3 = 100;
        r2.A = r3;	 Catch:{ ArrayIndexOutOfBoundsException -> 0x0053 }
    L_0x00f9:
        r3 = r2.E;	 Catch:{ ArrayIndexOutOfBoundsException -> 0x0053 }
        r4 = r2.L;	 Catch:{ ArrayIndexOutOfBoundsException -> 0x0053 }
        r5 = r4 + 1;
        r2.L = r5;	 Catch:{ ArrayIndexOutOfBoundsException -> 0x0053 }
        r3 = r3[r4];	 Catch:{ ArrayIndexOutOfBoundsException -> 0x0053 }
        r3 = r3 & 255;
        r2.r = r3;	 Catch:{ ArrayIndexOutOfBoundsException -> 0x0053 }
        r3 = r2.L;	 Catch:{ ArrayIndexOutOfBoundsException -> 0x0053 }
        r3 = r3 + 1;
        r2.L = r3;	 Catch:{ ArrayIndexOutOfBoundsException -> 0x0053 }
        goto L_0x0030;
    L_0x010f:
        r3 = 0;
        goto L_0x00e5;
    L_0x0111:
        r2.k();	 Catch:{ ArrayIndexOutOfBoundsException -> 0x0053 }
        r3 = 1;
        r4 = 0;
    L_0x0116:
        r5 = defpackage.gjo.a;	 Catch:{ ArrayIndexOutOfBoundsException -> 0x0053 }
        r5 = r5.length;	 Catch:{ ArrayIndexOutOfBoundsException -> 0x0053 }
        if (r4 >= r5) goto L_0x0126;
    L_0x011b:
        r5 = r2.o;	 Catch:{ ArrayIndexOutOfBoundsException -> 0x0053 }
        r5 = r5[r4];	 Catch:{ ArrayIndexOutOfBoundsException -> 0x0053 }
        r6 = defpackage.gjo.a;	 Catch:{ ArrayIndexOutOfBoundsException -> 0x0053 }
        r6 = r6[r4];	 Catch:{ ArrayIndexOutOfBoundsException -> 0x0053 }
        if (r5 == r6) goto L_0x0134;
    L_0x0125:
        r3 = 0;
    L_0x0126:
        if (r3 == 0) goto L_0x0137;
    L_0x0128:
        r3 = r2.k();	 Catch:{ ArrayIndexOutOfBoundsException -> 0x0053 }
        if (r3 <= 0) goto L_0x0030;
    L_0x012e:
        r3 = r2.b;	 Catch:{ ArrayIndexOutOfBoundsException -> 0x0053 }
        if (r3 == 0) goto L_0x0128;
    L_0x0132:
        goto L_0x0030;
    L_0x0134:
        r4 = r4 + 1;
        goto L_0x0116;
    L_0x0137:
        r2.m();	 Catch:{ ArrayIndexOutOfBoundsException -> 0x0053 }
        goto L_0x0030;
    L_0x013c:
        r2.m();	 Catch:{ ArrayIndexOutOfBoundsException -> 0x0053 }
        goto L_0x0030;
    L_0x0141:
        r2.m();	 Catch:{ ArrayIndexOutOfBoundsException -> 0x0053 }
        goto L_0x0030;
    L_0x0146:
        r3 = r2.l();	 Catch:{ ArrayIndexOutOfBoundsException -> 0x0053 }
        r2.j = r3;	 Catch:{ ArrayIndexOutOfBoundsException -> 0x0053 }
        r3 = r2.l();	 Catch:{ ArrayIndexOutOfBoundsException -> 0x0053 }
        r2.k = r3;	 Catch:{ ArrayIndexOutOfBoundsException -> 0x0053 }
        r3 = r2.l();	 Catch:{ ArrayIndexOutOfBoundsException -> 0x0053 }
        r4 = r2.l();	 Catch:{ ArrayIndexOutOfBoundsException -> 0x0053 }
        r5 = r2.F;	 Catch:{ ArrayIndexOutOfBoundsException -> 0x0053 }
        r6 = r2.j;	 Catch:{ ArrayIndexOutOfBoundsException -> 0x0053 }
        r5 = r5 - r6;
        r5 = java.lang.Math.min(r3, r5);	 Catch:{ ArrayIndexOutOfBoundsException -> 0x0053 }
        r2.l = r5;	 Catch:{ ArrayIndexOutOfBoundsException -> 0x0053 }
        r5 = r2.G;	 Catch:{ ArrayIndexOutOfBoundsException -> 0x0053 }
        r6 = r2.k;	 Catch:{ ArrayIndexOutOfBoundsException -> 0x0053 }
        r5 = r5 - r6;
        r5 = java.lang.Math.min(r4, r5);	 Catch:{ ArrayIndexOutOfBoundsException -> 0x0053 }
        r2.m = r5;	 Catch:{ ArrayIndexOutOfBoundsException -> 0x0053 }
        r2.n = r3;	 Catch:{ ArrayIndexOutOfBoundsException -> 0x0053 }
        r3 = r3 * r4;
        r4 = r2.v;	 Catch:{ ArrayIndexOutOfBoundsException -> 0x0053 }
        r4 = r4.length;	 Catch:{ ArrayIndexOutOfBoundsException -> 0x0053 }
        if (r3 <= r4) goto L_0x017c;
    L_0x0178:
        r3 = new byte[r3];	 Catch:{ ArrayIndexOutOfBoundsException -> 0x0053 }
        r2.v = r3;	 Catch:{ ArrayIndexOutOfBoundsException -> 0x0053 }
    L_0x017c:
        r3 = r2.E;	 Catch:{ ArrayIndexOutOfBoundsException -> 0x0053 }
        r4 = r2.L;	 Catch:{ ArrayIndexOutOfBoundsException -> 0x0053 }
        r5 = r4 + 1;
        r2.L = r5;	 Catch:{ ArrayIndexOutOfBoundsException -> 0x0053 }
        r3 = r3[r4];	 Catch:{ ArrayIndexOutOfBoundsException -> 0x0053 }
        r4 = r3 & 255;
        r3 = r4 & 64;
        if (r3 == 0) goto L_0x0220;
    L_0x018c:
        r3 = 1;
    L_0x018d:
        r2.i = r3;	 Catch:{ ArrayIndexOutOfBoundsException -> 0x0053 }
        r3 = r4 & 128;
        if (r3 == 0) goto L_0x0223;
    L_0x0193:
        r3 = 1;
    L_0x0194:
        r2.e = r3;	 Catch:{ ArrayIndexOutOfBoundsException -> 0x0053 }
        r6 = 4611686018427387904; // 0x4000000000000000 float:0.0 double:2.0;
        r3 = r4 & 7;
        r3 = r3 + 1;
        r4 = (double) r3;	 Catch:{ ArrayIndexOutOfBoundsException -> 0x0053 }
        r4 = java.lang.Math.pow(r6, r4);	 Catch:{ ArrayIndexOutOfBoundsException -> 0x0053 }
        r3 = (int) r4;	 Catch:{ ArrayIndexOutOfBoundsException -> 0x0053 }
        r2.f = r3;	 Catch:{ ArrayIndexOutOfBoundsException -> 0x0053 }
        r3 = r2.e;	 Catch:{ ArrayIndexOutOfBoundsException -> 0x0053 }
        if (r3 == 0) goto L_0x0226;
    L_0x01a8:
        r3 = r2.g;	 Catch:{ ArrayIndexOutOfBoundsException -> 0x0053 }
        if (r3 != 0) goto L_0x01b2;
    L_0x01ac:
        r3 = 256; // 0x100 float:3.59E-43 double:1.265E-321;
        r3 = new int[r3];	 Catch:{ ArrayIndexOutOfBoundsException -> 0x0053 }
        r2.g = r3;	 Catch:{ ArrayIndexOutOfBoundsException -> 0x0053 }
    L_0x01b2:
        r3 = r2.E;	 Catch:{ ArrayIndexOutOfBoundsException -> 0x0053 }
        r4 = r2.g;	 Catch:{ ArrayIndexOutOfBoundsException -> 0x0053 }
        r5 = r2.f;	 Catch:{ ArrayIndexOutOfBoundsException -> 0x0053 }
        r6 = r2.L;	 Catch:{ ArrayIndexOutOfBoundsException -> 0x0053 }
        r3 = defpackage.gjo.a(r3, r4, r5, r6);	 Catch:{ ArrayIndexOutOfBoundsException -> 0x0053 }
        r2.L = r3;	 Catch:{ ArrayIndexOutOfBoundsException -> 0x0053 }
        r3 = r2.g;	 Catch:{ ArrayIndexOutOfBoundsException -> 0x0053 }
        r2.h = r3;	 Catch:{ ArrayIndexOutOfBoundsException -> 0x0053 }
    L_0x01c4:
        r3 = 0;
        r4 = r2.q;	 Catch:{ ArrayIndexOutOfBoundsException -> 0x0053 }
        if (r4 == 0) goto L_0x01d6;
    L_0x01c9:
        r3 = r2.h;	 Catch:{ ArrayIndexOutOfBoundsException -> 0x0053 }
        r4 = r2.r;	 Catch:{ ArrayIndexOutOfBoundsException -> 0x0053 }
        r3 = r3[r4];	 Catch:{ ArrayIndexOutOfBoundsException -> 0x0053 }
        r4 = r2.h;	 Catch:{ ArrayIndexOutOfBoundsException -> 0x0053 }
        r5 = r2.r;	 Catch:{ ArrayIndexOutOfBoundsException -> 0x0053 }
        r6 = 0;
        r4[r5] = r6;	 Catch:{ ArrayIndexOutOfBoundsException -> 0x0053 }
    L_0x01d6:
        r14 = r3;
        r3 = r2.h;	 Catch:{ ArrayIndexOutOfBoundsException -> 0x0053 }
        if (r3 != 0) goto L_0x01e8;
    L_0x01db:
        r3 = 1;
        r2.b = r3;	 Catch:{ ArrayIndexOutOfBoundsException -> 0x0053 }
        r3 = "Babel";
        r4 = "Could not read color table from the gif. Abort.";
        r5 = 0;
        r5 = new java.lang.Object[r5];	 Catch:{ ArrayIndexOutOfBoundsException -> 0x0053 }
        defpackage.glk.d(r3, r4, r5);	 Catch:{ ArrayIndexOutOfBoundsException -> 0x0053 }
    L_0x01e8:
        r3 = r2.b;	 Catch:{ ArrayIndexOutOfBoundsException -> 0x0053 }
        if (r3 != 0) goto L_0x0057;
    L_0x01ec:
        r3 = r2.l;	 Catch:{ ArrayIndexOutOfBoundsException -> 0x0053 }
        r4 = r2.m;	 Catch:{ ArrayIndexOutOfBoundsException -> 0x0053 }
        r15 = r3 * r4;
        r3 = r2.E;	 Catch:{ ArrayIndexOutOfBoundsException -> 0x0053 }
        r4 = r2.L;	 Catch:{ ArrayIndexOutOfBoundsException -> 0x0053 }
        r5 = r4 + 1;
        r2.L = r5;	 Catch:{ ArrayIndexOutOfBoundsException -> 0x0053 }
        r3 = r3[r4];	 Catch:{ ArrayIndexOutOfBoundsException -> 0x0053 }
        r0 = r3 & 255;
        r16 = r0;
        r3 = 1;
        r17 = r3 << r16;
        r18 = r17 + 1;
        r11 = r17 + 2;
        r8 = -1;
        r4 = r16 + 1;
        r3 = 1;
        r3 = r3 << r4;
        r5 = r3 + -1;
        r3 = 0;
    L_0x020f:
        r0 = r17;
        if (r3 >= r0) goto L_0x0234;
    L_0x0213:
        r6 = r2.s;	 Catch:{ ArrayIndexOutOfBoundsException -> 0x0053 }
        r7 = 0;
        r6[r3] = r7;	 Catch:{ ArrayIndexOutOfBoundsException -> 0x0053 }
        r6 = r2.t;	 Catch:{ ArrayIndexOutOfBoundsException -> 0x0053 }
        r7 = (byte) r3;	 Catch:{ ArrayIndexOutOfBoundsException -> 0x0053 }
        r6[r3] = r7;	 Catch:{ ArrayIndexOutOfBoundsException -> 0x0053 }
        r3 = r3 + 1;
        goto L_0x020f;
    L_0x0220:
        r3 = 0;
        goto L_0x018d;
    L_0x0223:
        r3 = 0;
        goto L_0x0194;
    L_0x0226:
        r3 = r2.J;	 Catch:{ ArrayIndexOutOfBoundsException -> 0x0053 }
        r2.h = r3;	 Catch:{ ArrayIndexOutOfBoundsException -> 0x0053 }
        r3 = r2.K;	 Catch:{ ArrayIndexOutOfBoundsException -> 0x0053 }
        r4 = r2.r;	 Catch:{ ArrayIndexOutOfBoundsException -> 0x0053 }
        if (r3 != r4) goto L_0x01c4;
    L_0x0230:
        r3 = 0;
        r2.d = r3;	 Catch:{ ArrayIndexOutOfBoundsException -> 0x0053 }
        goto L_0x01c4;
    L_0x0234:
        r12 = 0;
        r7 = 0;
        r9 = 0;
        r10 = 0;
        r3 = 0;
    L_0x0239:
        if (r3 >= r15) goto L_0x03a4;
    L_0x023b:
        r6 = r2.E;	 Catch:{ ArrayIndexOutOfBoundsException -> 0x0053 }
        r13 = r2.L;	 Catch:{ ArrayIndexOutOfBoundsException -> 0x0053 }
        r19 = r13 + 1;
        r0 = r19;
        r2.L = r0;	 Catch:{ ArrayIndexOutOfBoundsException -> 0x0053 }
        r6 = r6[r13];	 Catch:{ ArrayIndexOutOfBoundsException -> 0x0053 }
        r6 = r6 & 255;
        if (r6 == 0) goto L_0x03a4;
    L_0x024b:
        r13 = r2.L;	 Catch:{ ArrayIndexOutOfBoundsException -> 0x0053 }
        r19 = r13 + r6;
        r6 = r3;
        r3 = r7;
        r7 = r4;
    L_0x0252:
        r4 = r2.L;	 Catch:{ ArrayIndexOutOfBoundsException -> 0x0053 }
        r0 = r19;
        if (r4 >= r0) goto L_0x039f;
    L_0x0258:
        r4 = r2.E;	 Catch:{ ArrayIndexOutOfBoundsException -> 0x0053 }
        r13 = r2.L;	 Catch:{ ArrayIndexOutOfBoundsException -> 0x0053 }
        r20 = r13 + 1;
        r0 = r20;
        r2.L = r0;	 Catch:{ ArrayIndexOutOfBoundsException -> 0x0053 }
        r4 = r4[r13];	 Catch:{ ArrayIndexOutOfBoundsException -> 0x0053 }
        r4 = r4 & 255;
        r4 = r4 << r3;
        r4 = r4 + r12;
        r3 = r3 + 8;
        r12 = r4;
        r4 = r7;
        r7 = r3;
        r3 = r5;
        r5 = r11;
        r11 = r9;
    L_0x0270:
        if (r7 < r4) goto L_0x0415;
    L_0x0272:
        r9 = r12 & r3;
        r13 = r12 >> r4;
        r12 = r7 - r4;
        r0 = r17;
        if (r9 != r0) goto L_0x0289;
    L_0x027c:
        r4 = r16 + 1;
        r3 = 1;
        r3 = r3 << r4;
        r3 = r3 + -1;
        r5 = r17 + 2;
        r9 = -1;
        r7 = r12;
        r8 = r9;
        r12 = r13;
        goto L_0x0270;
    L_0x0289:
        r0 = r18;
        if (r9 != r0) goto L_0x02e8;
    L_0x028d:
        r0 = r19;
        r2.L = r0;	 Catch:{ ArrayIndexOutOfBoundsException -> 0x0053 }
    L_0x0291:
        r2.m();	 Catch:{ ArrayIndexOutOfBoundsException -> 0x0053 }
        r3 = r2.b;	 Catch:{ ArrayIndexOutOfBoundsException -> 0x0053 }
        if (r3 != 0) goto L_0x0057;
    L_0x0298:
        r3 = r2.p;	 Catch:{ ArrayIndexOutOfBoundsException -> 0x0053 }
        r4 = 3;
        if (r3 != r4) goto L_0x02a0;
    L_0x029d:
        r2.i();	 Catch:{ ArrayIndexOutOfBoundsException -> 0x0053 }
    L_0x02a0:
        r5 = 1;
        r4 = 8;
        r3 = 0;
        r6 = 0;
    L_0x02a5:
        r7 = r2.m;	 Catch:{ ArrayIndexOutOfBoundsException -> 0x0053 }
        if (r6 >= r7) goto L_0x03c1;
    L_0x02a9:
        r7 = r2.i;	 Catch:{ ArrayIndexOutOfBoundsException -> 0x0053 }
        if (r7 == 0) goto L_0x0405;
    L_0x02ad:
        r7 = r2.m;	 Catch:{ ArrayIndexOutOfBoundsException -> 0x0053 }
        if (r3 < r7) goto L_0x02b6;
    L_0x02b1:
        r5 = r5 + 1;
        switch(r5) {
            case 2: goto L_0x03af;
            case 3: goto L_0x03b2;
            case 4: goto L_0x03b6;
            default: goto L_0x02b6;
        };	 Catch:{ ArrayIndexOutOfBoundsException -> 0x0053 }
    L_0x02b6:
        r7 = r3 + r4;
        r8 = r4;
        r9 = r5;
    L_0x02ba:
        r4 = r2.k;	 Catch:{ ArrayIndexOutOfBoundsException -> 0x0053 }
        r3 = r3 + r4;
        r4 = r2.G;	 Catch:{ ArrayIndexOutOfBoundsException -> 0x0053 }
        if (r3 >= r4) goto L_0x03ba;
    L_0x02c1:
        r4 = r2.F;	 Catch:{ ArrayIndexOutOfBoundsException -> 0x0053 }
        r3 = r3 * r4;
        r4 = r2.j;	 Catch:{ ArrayIndexOutOfBoundsException -> 0x0053 }
        r4 = r4 + r3;
        r3 = r2.l;	 Catch:{ ArrayIndexOutOfBoundsException -> 0x0053 }
        r10 = r4 + r3;
        r3 = r2.n;	 Catch:{ ArrayIndexOutOfBoundsException -> 0x0053 }
        r3 = r3 * r6;
        r5 = r4;
    L_0x02cf:
        if (r5 >= r10) goto L_0x03ba;
    L_0x02d1:
        r11 = r2.v;	 Catch:{ ArrayIndexOutOfBoundsException -> 0x0053 }
        r4 = r3 + 1;
        r3 = r11[r3];	 Catch:{ ArrayIndexOutOfBoundsException -> 0x0053 }
        r3 = r3 & 255;
        r11 = r2.h;	 Catch:{ ArrayIndexOutOfBoundsException -> 0x0053 }
        r3 = r11[r3];	 Catch:{ ArrayIndexOutOfBoundsException -> 0x0053 }
        if (r3 == 0) goto L_0x02e3;
    L_0x02df:
        r11 = r2.H;	 Catch:{ ArrayIndexOutOfBoundsException -> 0x0053 }
        r11[r5] = r3;	 Catch:{ ArrayIndexOutOfBoundsException -> 0x0053 }
    L_0x02e3:
        r3 = r5 + 1;
        r5 = r3;
        r3 = r4;
        goto L_0x02cf;
    L_0x02e8:
        r7 = -1;
        if (r8 != r7) goto L_0x02fc;
    L_0x02eb:
        r8 = r2.v;	 Catch:{ ArrayIndexOutOfBoundsException -> 0x0053 }
        r7 = r6 + 1;
        r11 = r2.t;	 Catch:{ ArrayIndexOutOfBoundsException -> 0x0053 }
        r11 = r11[r9];	 Catch:{ ArrayIndexOutOfBoundsException -> 0x0053 }
        r8[r6] = r11;	 Catch:{ ArrayIndexOutOfBoundsException -> 0x0053 }
        r6 = r7;
        r11 = r9;
        r8 = r9;
        r7 = r12;
        r12 = r13;
        goto L_0x0270;
    L_0x02fc:
        if (r9 < r5) goto L_0x0412;
    L_0x02fe:
        r0 = r2.u;	 Catch:{ ArrayIndexOutOfBoundsException -> 0x0053 }
        r20 = r0;
        r7 = r10 + 1;
        r11 = (byte) r11;	 Catch:{ ArrayIndexOutOfBoundsException -> 0x0053 }
        r20[r10] = r11;	 Catch:{ ArrayIndexOutOfBoundsException -> 0x0053 }
        r10 = 4097; // 0x1001 float:5.741E-42 double:2.024E-320;
        if (r7 != r10) goto L_0x040e;
    L_0x030b:
        r3 = 1;
        r2.b = r3;	 Catch:{ ArrayIndexOutOfBoundsException -> 0x0053 }
        r3 = "Babel";
        r4 = "Error while decoding Gif.";
        r5 = 0;
        r5 = new java.lang.Object[r5];	 Catch:{ ArrayIndexOutOfBoundsException -> 0x0053 }
        defpackage.glk.d(r3, r4, r5);	 Catch:{ ArrayIndexOutOfBoundsException -> 0x0053 }
        goto L_0x0291;
    L_0x031a:
        r10 = r11;
    L_0x031b:
        r0 = r17;
        if (r7 < r0) goto L_0x035d;
    L_0x031f:
        r11 = 4097; // 0x1001 float:5.741E-42 double:2.024E-320;
        if (r7 >= r11) goto L_0x0329;
    L_0x0323:
        r11 = r2.s;	 Catch:{ ArrayIndexOutOfBoundsException -> 0x0053 }
        r11 = r11[r7];	 Catch:{ ArrayIndexOutOfBoundsException -> 0x0053 }
        if (r7 != r11) goto L_0x0338;
    L_0x0329:
        r3 = 1;
        r2.b = r3;	 Catch:{ ArrayIndexOutOfBoundsException -> 0x0053 }
        r3 = "Babel";
        r4 = "Error while decoding Gif.";
        r5 = 0;
        r5 = new java.lang.Object[r5];	 Catch:{ ArrayIndexOutOfBoundsException -> 0x0053 }
        defpackage.glk.d(r3, r4, r5);	 Catch:{ ArrayIndexOutOfBoundsException -> 0x0053 }
        goto L_0x0291;
    L_0x0338:
        r0 = r2.u;	 Catch:{ ArrayIndexOutOfBoundsException -> 0x0053 }
        r20 = r0;
        r11 = r10 + 1;
        r0 = r2.t;	 Catch:{ ArrayIndexOutOfBoundsException -> 0x0053 }
        r21 = r0;
        r21 = r21[r7];	 Catch:{ ArrayIndexOutOfBoundsException -> 0x0053 }
        r20[r10] = r21;	 Catch:{ ArrayIndexOutOfBoundsException -> 0x0053 }
        r10 = r2.s;	 Catch:{ ArrayIndexOutOfBoundsException -> 0x0053 }
        r7 = r10[r7];	 Catch:{ ArrayIndexOutOfBoundsException -> 0x0053 }
        r10 = 4097; // 0x1001 float:5.741E-42 double:2.024E-320;
        if (r11 != r10) goto L_0x031a;
    L_0x034e:
        r3 = 1;
        r2.b = r3;	 Catch:{ ArrayIndexOutOfBoundsException -> 0x0053 }
        r3 = "Babel";
        r4 = "Error while decoding Gif.";
        r5 = 0;
        r5 = new java.lang.Object[r5];	 Catch:{ ArrayIndexOutOfBoundsException -> 0x0053 }
        defpackage.glk.d(r3, r4, r5);	 Catch:{ ArrayIndexOutOfBoundsException -> 0x0053 }
        goto L_0x0291;
    L_0x035d:
        r11 = r2.t;	 Catch:{ ArrayIndexOutOfBoundsException -> 0x0053 }
        r11 = r11[r7];	 Catch:{ ArrayIndexOutOfBoundsException -> 0x0053 }
        r0 = r2.u;	 Catch:{ ArrayIndexOutOfBoundsException -> 0x0053 }
        r20 = r0;
        r7 = r10 + 1;
        r0 = (byte) r11;	 Catch:{ ArrayIndexOutOfBoundsException -> 0x0053 }
        r21 = r0;
        r20[r10] = r21;	 Catch:{ ArrayIndexOutOfBoundsException -> 0x0053 }
        r10 = 4096; // 0x1000 float:5.74E-42 double:2.0237E-320;
        if (r5 >= r10) goto L_0x0387;
    L_0x0370:
        r10 = r2.s;	 Catch:{ ArrayIndexOutOfBoundsException -> 0x0053 }
        r8 = (short) r8;	 Catch:{ ArrayIndexOutOfBoundsException -> 0x0053 }
        r10[r5] = r8;	 Catch:{ ArrayIndexOutOfBoundsException -> 0x0053 }
        r8 = r2.t;	 Catch:{ ArrayIndexOutOfBoundsException -> 0x0053 }
        r10 = (byte) r11;	 Catch:{ ArrayIndexOutOfBoundsException -> 0x0053 }
        r8[r5] = r10;	 Catch:{ ArrayIndexOutOfBoundsException -> 0x0053 }
        r5 = r5 + 1;
        r8 = r5 & r3;
        if (r8 != 0) goto L_0x0387;
    L_0x0380:
        r8 = 4096; // 0x1000 float:5.74E-42 double:2.0237E-320;
        if (r5 >= r8) goto L_0x0387;
    L_0x0384:
        r4 = r4 + 1;
        r3 = r3 + r5;
    L_0x0387:
        r8 = r7;
    L_0x0388:
        r10 = r2.v;	 Catch:{ ArrayIndexOutOfBoundsException -> 0x0053 }
        r7 = r6 + 1;
        r0 = r2.u;	 Catch:{ ArrayIndexOutOfBoundsException -> 0x0053 }
        r20 = r0;
        r8 = r8 + -1;
        r20 = r20[r8];	 Catch:{ ArrayIndexOutOfBoundsException -> 0x0053 }
        r10[r6] = r20;	 Catch:{ ArrayIndexOutOfBoundsException -> 0x0053 }
        if (r8 > 0) goto L_0x040b;
    L_0x0398:
        r6 = r7;
        r10 = r8;
        r7 = r12;
        r8 = r9;
        r12 = r13;
        goto L_0x0270;
    L_0x039f:
        r4 = r7;
        r7 = r3;
        r3 = r6;
        goto L_0x0239;
    L_0x03a4:
        if (r3 >= r15) goto L_0x0291;
    L_0x03a6:
        r5 = r2.v;	 Catch:{ ArrayIndexOutOfBoundsException -> 0x0053 }
        r4 = r3 + 1;
        r6 = 0;
        r5[r3] = r6;	 Catch:{ ArrayIndexOutOfBoundsException -> 0x0053 }
        r3 = r4;
        goto L_0x03a4;
    L_0x03af:
        r3 = 4;
        goto L_0x02b6;
    L_0x03b2:
        r3 = 2;
        r4 = 4;
        goto L_0x02b6;
    L_0x03b6:
        r3 = 1;
        r4 = 2;
        goto L_0x02b6;
    L_0x03ba:
        r6 = r6 + 1;
        r3 = r7;
        r4 = r8;
        r5 = r9;
        goto L_0x02a5;
    L_0x03c1:
        r3 = r2.q;	 Catch:{ ArrayIndexOutOfBoundsException -> 0x0053 }
        if (r3 == 0) goto L_0x03cb;
    L_0x03c5:
        r3 = r2.h;	 Catch:{ ArrayIndexOutOfBoundsException -> 0x0053 }
        r4 = r2.r;	 Catch:{ ArrayIndexOutOfBoundsException -> 0x0053 }
        r3[r4] = r14;	 Catch:{ ArrayIndexOutOfBoundsException -> 0x0053 }
    L_0x03cb:
        r3 = r2.y;	 Catch:{ ArrayIndexOutOfBoundsException -> 0x0053 }
        r3 = r3 + 1;
        r2.y = r3;	 Catch:{ ArrayIndexOutOfBoundsException -> 0x0053 }
        goto L_0x0057;
    L_0x03d3:
        r3 = 1;
        r2.D = r3;	 Catch:{ ArrayIndexOutOfBoundsException -> 0x0053 }
        goto L_0x0057;
    L_0x03d8:
        r3 = r2.y;
        r4 = 1;
        if (r3 <= r4) goto L_0x03f0;
    L_0x03dd:
        r3 = r2.M;
        if (r3 == 0) goto L_0x03f0;
    L_0x03e1:
        r3 = r2.I;
        r2.L = r3;
        r3 = 0;
        r2.w = r3;
        r3 = 0;
        r2.y = r3;
        r3 = 0;
        r2.p = r3;
        goto L_0x006c;
    L_0x03f0:
        r3 = 1;
        r2.c = r3;
        goto L_0x006c;
    L_0x03f5:
        r3 = r2.I;
        r2.L = r3;
        r3 = 0;
        r2.w = r3;
        r3 = 0;
        r2.y = r3;
        r3 = 0;
        r2.p = r3;
        r2 = 1;
        goto L_0x0011;
    L_0x0405:
        r7 = r3;
        r8 = r4;
        r9 = r5;
        r3 = r6;
        goto L_0x02ba;
    L_0x040b:
        r6 = r7;
        goto L_0x0388;
    L_0x040e:
        r10 = r7;
        r7 = r8;
        goto L_0x031b;
    L_0x0412:
        r7 = r9;
        goto L_0x031b;
    L_0x0415:
        r9 = r11;
        r11 = r5;
        r5 = r3;
        r3 = r7;
        r7 = r4;
        goto L_0x0252;
        */
        throw new UnsupportedOperationException("Method not decompiled: gjp.handleMessage(android.os.Message):boolean");
    }
}
