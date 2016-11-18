package defpackage;

import java.util.logging.Logger;

public abstract class nvy extends nvm {
    static final Logger a = Logger.getLogger(nvy.class.getName());
    static final boolean b = nxz.c;
    static final long c = nxz.d;

    public abstract void a(byte b);

    public abstract void a(int i);

    public abstract void a(int i, int i2);

    public abstract void a(int i, long j);

    public abstract void a(int i, String str);

    public abstract void a(int i, nvn nvn);

    public abstract void a(int i, nxi nxi);

    public abstract void a(int i, boolean z);

    public abstract void a(long j);

    public abstract void a(String str);

    public abstract void a(nvn nvn);

    public abstract void a(nxi nxi);

    public abstract void a(byte[] bArr, int i, int i2);

    public abstract void b(int i);

    public abstract void b(int i, int i2);

    public abstract void b(int i, long j);

    public abstract void b(int i, nxi nxi);

    public abstract void b(long j);

    abstract void b(byte[] bArr, int i, int i2);

    public abstract void c(int i);

    public abstract void c(int i, int i2);

    public abstract void d(int i, int i2);

    public abstract int h();

    public static nvy a(byte[] bArr) {
        return new nvz(bArr, 0, bArr.length);
    }

    nvy() {
    }

    public final void a(int i, double d) {
        b(i, Double.doubleToRawLongBits(d));
    }

    public static int e(int i, int i2) {
        return nvy.d(i) + nvy.e(i2);
    }

    public static int f(int i, int i2) {
        return nvy.d(i) + nvy.f(i2);
    }

    public static int g(int i, int i2) {
        return nvy.d(i) + 4;
    }

    public static int c(int i, long j) {
        return nvy.d(i) + nvy.d(j);
    }

    public static int d(int i, long j) {
        return nvy.d(i) + nvy.d(j);
    }

    public static int e(int i, long j) {
        return nvy.d(i) + 8;
    }

    public static int b(int i, double d) {
        return nvy.d(i) + 8;
    }

    public static int b(int i, boolean z) {
        return nvy.d(i) + 1;
    }

    public static int h(int i, int i2) {
        return nvy.d(i) + nvy.e(i2);
    }

    public static int b(int i, String str) {
        return nvy.d(i) + nvy.b(str);
    }

    public static int b(int i, nvn nvn) {
        int d = nvy.d(i);
        int b = nvn.b();
        return d + (b + nvy.f(b));
    }

    public static int c(int i, nxi nxi) {
        return nvy.d(i) + nvy.b(nxi);
    }

    public static int d(int i, nxi nxi) {
        return ((nvy.d(1) << 1) + nvy.f(2, i)) + nvy.c(3, nxi);
    }

    public static int a(int i, nxh nxh) {
        int d = (nvy.d(1) << 1) + nvy.f(2, i);
        int d2 = nvy.d(3);
        int b = nxh.b();
        return d + (d2 + (b + nvy.f(b)));
    }

    public static int d(int i) {
        return nvy.f(0 | (i << 3));
    }

    public static int e(int i) {
        if (i >= 0) {
            return nvy.f(i);
        }
        return 10;
    }

    public static int f(int i) {
        if ((i & -128) == 0) {
            return 1;
        }
        if ((i & -16384) == 0) {
            return 2;
        }
        if ((-2097152 & i) == 0) {
            return 3;
        }
        if ((-268435456 & i) == 0) {
            return 4;
        }
        return 5;
    }

    public static int g(int i) {
        return nvy.f(nvy.i(i));
    }

    public static int a() {
        return 4;
    }

    public static int b() {
        return 4;
    }

    public static int c(long j) {
        return nvy.d(j);
    }

    public static int d(long j) {
        if ((-128 & j) == 0) {
            return 1;
        }
        if (j < 0) {
            return 10;
        }
        long j2;
        int i = 2;
        if ((-34359738368L & j) != 0) {
            i = 6;
            j2 = j >>> 28;
        } else {
            j2 = j;
        }
        if ((-2097152 & j2) != 0) {
            i += 2;
            j2 >>>= 14;
        }
        if ((j2 & -16384) != 0) {
            return i + 1;
        }
        return i;
    }

    public static int e(long j) {
        return nvy.d(nvy.f(j));
    }

    public static int c() {
        return 8;
    }

    public static int d() {
        return 8;
    }

    public static int e() {
        return 4;
    }

    public static int f() {
        return 8;
    }

    public static int g() {
        return 1;
    }

    public static int h(int i) {
        return nvy.e(i);
    }

    public static int b(String str) {
        int a;
        try {
            a = nyb.a((CharSequence) str);
        } catch (nye e) {
            a = str.getBytes(nwv.a).length;
        }
        return a + nvy.f(a);
    }

    public static int a(nxh nxh) {
        int b = nxh.b();
        return b + nvy.f(b);
    }

    public static int b(nvn nvn) {
        int b = nvn.b();
        return b + nvy.f(b);
    }

    public static int b(byte[] bArr) {
        int length = bArr.length;
        return length + nvy.f(length);
    }

    public static int b(nxi nxi) {
        int l = nxi.l();
        return l + nvy.f(l);
    }

    public static int i(int i) {
        return (i << 1) ^ (i >> 31);
    }

    public static long f(long j) {
        return (j << 1) ^ (j >> 63);
    }

    @Deprecated
    public final void e(int i, nxi nxi) {
        a(i, 3);
        nxi.a(this);
        a(i, 4);
    }

    @Deprecated
    public static int f(int i, nxi nxi) {
        return (nvy.d(i) << 1) + nxi.l();
    }

    @Deprecated
    public static int c(nxi nxi) {
        return nxi.l();
    }

    @Deprecated
    public static int j(int i) {
        return nvy.f(i);
    }
}
