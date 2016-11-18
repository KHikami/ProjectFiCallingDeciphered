package p000;

import java.io.IOException;

public abstract class nzf {
    public static final int UNSET_ENUM_VALUE = Integer.MIN_VALUE;
    public volatile int cachedSize = -1;

    public abstract nzf mo150a(nyt nyt);

    public /* synthetic */ Object clone() {
        return mo149f();
    }

    public int e_() {
        if (this.cachedSize < 0) {
            mo1951c();
        }
        return this.cachedSize;
    }

    public int mo1951c() {
        int b = mo147b();
        this.cachedSize = b;
        return b;
    }

    public int mo147b() {
        return 0;
    }

    public void mo146a(nyu nyu) {
    }

    public static final byte[] m1029a(nzf nzf) {
        byte[] bArr = new byte[nzf.mo1951c()];
        nzf.m1028a(nzf, bArr, 0, bArr.length);
        return bArr;
    }

    public static final void m1028a(nzf nzf, byte[] bArr, int i, int i2) {
        try {
            nyu a = nyu.a(bArr, 0, i2);
            nzf.mo146a(a);
            a.a();
        } catch (Throwable e) {
            throw new RuntimeException("Serializing to a byte array threw an IOException (should never happen).", e);
        }
    }

    public static final <T extends nzf> T m1027a(T t, byte[] bArr) {
        return nzf.m1030b(t, bArr, 0, bArr.length);
    }

    private static <T extends nzf> T m1030b(T t, byte[] bArr, int i, int i2) {
        try {
            nyt a = nyt.a(bArr, 0, i2);
            t.mo150a(a);
            a.a(0);
            return t;
        } catch (nzd e) {
            throw e;
        } catch (IOException e2) {
            throw new RuntimeException("Reading from a byte array threw an IOException (should never happen).");
        }
    }

    public String toString() {
        return gwb.m1675a(this);
    }

    public nzf mo149f() {
        return (nzf) super.clone();
    }
}
