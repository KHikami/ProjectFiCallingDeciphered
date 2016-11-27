import java.io.IOException;

//data input/output

public abstract class nzf {
    public static final int UNSET_ENUM_VALUE = Integer.MIN_VALUE;
    public volatile int cachedSize;

    public abstract nzf a(nyt nyt);

    public nzf() {
        this.cachedSize = -1;
    }

    public /* synthetic */ Object clone() {
        return f();
    }

    public int e_() {
        if (this.cachedSize < 0) {
            c();
        }
        return this.cachedSize;
    }

    public int c() {
        int b = b();
        this.cachedSize = b;
        return b;
    }

    public int b() {
        return 0;
    }

    public void a(nyu nyu) {
    }

    public static final byte[] a(nzf nzf) {
        byte[] bArr = new byte[nzf.c()];
        a(nzf, bArr, 0, bArr.length);
        return bArr;
    }

    public static final void a(nzf nzf, byte[] bArr, int i, int i2) {
        try {
            nyu a = nyu.a(bArr, 0, i2);
            nzf.a(a);
            a.a();
        } catch (Throwable e) {
            throw new RuntimeException("Serializing to a byte array threw an IOException (should never happen).", e);
        }
    }

    public static final <T extends nzf> T a(T t, byte[] bArr) {
        return b(t, bArr, 0, bArr.length);
    }

    private static <T extends nzf> T b(T t, byte[] bArr, int i, int i2) {
        try {
            nyt a = nyt.a(bArr, 0, i2);
            t.a(a);
            a.a(0);
            return t;
        } catch (nzd e) {
            throw e;
        } catch (IOException e2) {
            throw new RuntimeException("Reading from a byte array threw an IOException (should never happen).");
        }
    }

    public String toString() {
        return gwb.a(this);
    }

    public nzf f() {
        return (nzf) super.clone();
    }
}
