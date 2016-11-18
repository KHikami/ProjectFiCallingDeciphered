package p000;

import java.util.logging.Logger;

public abstract class nvy extends nvm {
    static final Logger f31153a = Logger.getLogger(nvy.class.getName());
    static final boolean f31154b = nxz.f31234c;
    static final long f31155c = nxz.f31235d;

    public abstract void mo4016a(byte b);

    public abstract void mo4017a(int i);

    public abstract void mo4018a(int i, int i2);

    public abstract void mo4019a(int i, long j);

    public abstract void mo4020a(int i, String str);

    public abstract void mo4021a(int i, nvn nvn);

    public abstract void mo4022a(int i, nxi nxi);

    public abstract void mo4023a(int i, boolean z);

    public abstract void mo4024a(long j);

    public abstract void mo4025a(String str);

    public abstract void mo4026a(nvn nvn);

    public abstract void mo4027a(nxi nxi);

    public abstract void mo4015a(byte[] bArr, int i, int i2);

    public abstract void mo4028b(int i);

    public abstract void mo4029b(int i, int i2);

    public abstract void mo4030b(int i, long j);

    public abstract void mo4031b(int i, nxi nxi);

    public abstract void mo4032b(long j);

    abstract void mo4033b(byte[] bArr, int i, int i2);

    public abstract void mo4034c(int i);

    public abstract void mo4035c(int i, int i2);

    public abstract void mo4036d(int i, int i2);

    public abstract int mo4037h();

    public static nvy m36826a(byte[] bArr) {
        return new nvz(bArr, 0, bArr.length);
    }

    nvy() {
    }

    public final void m36865a(int i, double d) {
        mo4030b(i, Double.doubleToRawLongBits(d));
    }

    public static int m36848e(int i, int i2) {
        return nvy.m36842d(i) + nvy.m36847e(i2);
    }

    public static int m36853f(int i, int i2) {
        return nvy.m36842d(i) + nvy.m36852f(i2);
    }

    public static int m36858g(int i, int i2) {
        return nvy.m36842d(i) + 4;
    }

    public static int m36837c(int i, long j) {
        return nvy.m36842d(i) + nvy.m36845d(j);
    }

    public static int m36843d(int i, long j) {
        return nvy.m36842d(i) + nvy.m36845d(j);
    }

    public static int m36849e(int i, long j) {
        return nvy.m36842d(i) + 8;
    }

    public static int m36828b(int i, double d) {
        return nvy.m36842d(i) + 8;
    }

    public static int m36831b(int i, boolean z) {
        return nvy.m36842d(i) + 1;
    }

    public static int m36860h(int i, int i2) {
        return nvy.m36842d(i) + nvy.m36847e(i2);
    }

    public static int m36829b(int i, String str) {
        return nvy.m36842d(i) + nvy.m36832b(str);
    }

    public static int m36830b(int i, nvn nvn) {
        int d = nvy.m36842d(i);
        int b = nvn.b();
        return d + (b + nvy.m36852f(b));
    }

    public static int m36838c(int i, nxi nxi) {
        return nvy.m36842d(i) + nvy.m36834b(nxi);
    }

    public static int m36844d(int i, nxi nxi) {
        return ((nvy.m36842d(1) << 1) + nvy.m36853f(2, i)) + nvy.m36838c(3, nxi);
    }

    public static int m36824a(int i, nxh nxh) {
        int d = (nvy.m36842d(1) << 1) + nvy.m36853f(2, i);
        int d2 = nvy.m36842d(3);
        int b = nxh.m37024b();
        return d + (d2 + (b + nvy.m36852f(b)));
    }

    public static int m36842d(int i) {
        return nvy.m36852f(0 | (i << 3));
    }

    public static int m36847e(int i) {
        if (i >= 0) {
            return nvy.m36852f(i);
        }
        return 10;
    }

    public static int m36852f(int i) {
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

    public static int m36857g(int i) {
        return nvy.m36852f(nvy.m36861i(i));
    }

    public static int m36823a() {
        return 4;
    }

    public static int m36827b() {
        return 4;
    }

    public static int m36839c(long j) {
        return nvy.m36845d(j);
    }

    public static int m36845d(long j) {
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

    public static int m36850e(long j) {
        return nvy.m36845d(nvy.m36855f(j));
    }

    public static int m36836c() {
        return 8;
    }

    public static int m36841d() {
        return 8;
    }

    public static int m36846e() {
        return 4;
    }

    public static int m36851f() {
        return 8;
    }

    public static int m36856g() {
        return 1;
    }

    public static int m36859h(int i) {
        return nvy.m36847e(i);
    }

    public static int m36832b(String str) {
        int a;
        try {
            a = nyb.m37063a((CharSequence) str);
        } catch (nye e) {
            a = str.getBytes(nwv.f31198a).length;
        }
        return a + nvy.m36852f(a);
    }

    public static int m36825a(nxh nxh) {
        int b = nxh.m37024b();
        return b + nvy.m36852f(b);
    }

    public static int m36833b(nvn nvn) {
        int b = nvn.b();
        return b + nvy.m36852f(b);
    }

    public static int m36835b(byte[] bArr) {
        int length = bArr.length;
        return length + nvy.m36852f(length);
    }

    public static int m36834b(nxi nxi) {
        int l = nxi.l();
        return l + nvy.m36852f(l);
    }

    public static int m36861i(int i) {
        return (i << 1) ^ (i >> 31);
    }

    public static long m36855f(long j) {
        return (j << 1) ^ (j >> 63);
    }

    @Deprecated
    public final void m36886e(int i, nxi nxi) {
        mo4018a(i, 3);
        nxi.a(this);
        mo4018a(i, 4);
    }

    @Deprecated
    public static int m36854f(int i, nxi nxi) {
        return (nvy.m36842d(i) << 1) + nxi.l();
    }

    @Deprecated
    public static int m36840c(nxi nxi) {
        return nxi.l();
    }

    @Deprecated
    public static int m36862j(int i) {
        return nvy.m36852f(i);
    }
}
