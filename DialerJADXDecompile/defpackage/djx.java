package defpackage;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/* compiled from: PG */
/* renamed from: djx */
final class djx {
    final List a;
    final dlw b;
    int c;
    int d;
    dju[] e;
    private int f;
    private int g;
    private int h;

    djx(int i, dmh dmh) {
        this.a = new ArrayList();
        this.e = new dju[8];
        this.f = this.e.length - 1;
        this.g = 0;
        this.h = 0;
        this.c = i;
        this.d = i;
        this.b = dly.a(dmh);
    }

    final void a() {
        if (this.d >= this.h) {
            return;
        }
        if (this.d == 0) {
            c();
        } else {
            d(this.h - this.d);
        }
    }

    private final void c() {
        this.a.clear();
        Arrays.fill(this.e, null);
        this.f = this.e.length - 1;
        this.g = 0;
        this.h = 0;
    }

    private final int d(int i) {
        int i2 = 0;
        if (i > 0) {
            for (int length = this.e.length - 1; length >= this.f && i > 0; length--) {
                i -= this.e[length].h;
                this.h -= this.e[length].h;
                this.g--;
                i2++;
            }
            System.arraycopy(this.e, this.f + 1, this.e, (this.f + 1) + i2, this.g);
            this.f += i2;
        }
        return i2;
    }

    final int a(int i) {
        return (this.f + 1) + i;
    }

    final dlx b(int i) {
        if (djx.c(i)) {
            return djw.a[i].f;
        }
        return this.e[a(i - djw.a.length)].f;
    }

    static boolean c(int i) {
        return i >= 0 && i <= djw.a.length - 1;
    }

    final void a(int i, dju dju) {
        this.a.add(dju);
        int i2 = dju.h;
        if (i2 > this.d) {
            c();
            return;
        }
        d((this.h + i2) - this.d);
        if (this.g + 1 > this.e.length) {
            Object obj = new dju[(this.e.length << 1)];
            System.arraycopy(this.e, 0, obj, this.e.length, this.e.length);
            this.f = this.e.length - 1;
            this.e = obj;
        }
        int i3 = this.f;
        this.f = i3 - 1;
        this.e[i3] = dju;
        this.g++;
        this.h = i2 + this.h;
    }

    private final int d() {
        return this.b.c() & 255;
    }

    final int a(int i, int i2) {
        int i3 = i & i2;
        if (i3 < i2) {
            return i3;
        }
        i3 = 0;
        while (true) {
            int d = d();
            if ((d & 128) == 0) {
                return (d << i3) + i2;
            }
            i2 += (d & 127) << i3;
            i3 += 7;
        }
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    final defpackage.dlx b() {
        /*
        r8 = this;
        r1 = 0;
        r2 = r8.d();
        r0 = r2 & 128;
        r3 = 128; // 0x80 float:1.794E-43 double:6.32E-322;
        if (r0 != r3) goto L_0x0050;
    L_0x000b:
        r0 = 1;
    L_0x000c:
        r3 = 127; // 0x7f float:1.78E-43 double:6.27E-322;
        r2 = r8.a(r2, r3);
        if (r0 == 0) goto L_0x0080;
    L_0x0014:
        r4 = defpackage.dkd.a;
        r0 = r8.b;
        r2 = (long) r2;
        r5 = r0.c(r2);
        r6 = new java.io.ByteArrayOutputStream;
        r6.<init>();
        r0 = r4.b;
        r2 = r1;
        r3 = r0;
        r0 = r1;
    L_0x0027:
        r7 = r5.length;
        if (r1 >= r7) goto L_0x0058;
    L_0x002a:
        r7 = r5[r1];
        r7 = r7 & 255;
        r2 = r2 << 8;
        r2 = r2 | r7;
        r0 = r0 + 8;
    L_0x0033:
        r7 = 8;
        if (r0 < r7) goto L_0x0055;
    L_0x0037:
        r7 = r0 + -8;
        r7 = r2 >>> r7;
        r7 = r7 & 255;
        r3 = r3.a;
        r3 = r3[r7];
        r7 = r3.a;
        if (r7 != 0) goto L_0x0052;
    L_0x0045:
        r7 = r3.b;
        r6.write(r7);
        r3 = r3.c;
        r0 = r0 - r3;
        r3 = r4.b;
        goto L_0x0033;
    L_0x0050:
        r0 = r1;
        goto L_0x000c;
    L_0x0052:
        r0 = r0 + -8;
        goto L_0x0033;
    L_0x0055:
        r1 = r1 + 1;
        goto L_0x0027;
    L_0x0058:
        if (r0 <= 0) goto L_0x0077;
    L_0x005a:
        r1 = 8 - r0;
        r1 = r2 << r1;
        r1 = r1 & 255;
        r3 = r3.a;
        r1 = r3[r1];
        r3 = r1.a;
        if (r3 != 0) goto L_0x0077;
    L_0x0068:
        r3 = r1.c;
        if (r3 > r0) goto L_0x0077;
    L_0x006c:
        r3 = r1.b;
        r6.write(r3);
        r1 = r1.c;
        r0 = r0 - r1;
        r3 = r4.b;
        goto L_0x0058;
    L_0x0077:
        r0 = r6.toByteArray();
        r0 = defpackage.dlx.a(r0);
    L_0x007f:
        return r0;
    L_0x0080:
        r0 = r8.b;
        r2 = (long) r2;
        r0 = r0.b(r2);
        goto L_0x007f;
        */
        throw new UnsupportedOperationException("Method not decompiled: djx.b():dlx");
    }
}
