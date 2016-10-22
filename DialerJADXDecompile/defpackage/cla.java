package defpackage;

/* renamed from: cla */
public class cla {
    public volatile int b;

    public cla() {
        this.b = -1;
    }

    public static final byte[] a(cla cla) {
        byte[] bArr = new byte[cla.c()];
        try {
            ckt a = ckt.a(bArr, 0, bArr.length);
            cla.a(a);
            if (a.a.remaining() == 0) {
                return bArr;
            }
            throw new IllegalStateException("Did not write as much data as expected.");
        } catch (Throwable e) {
            throw new RuntimeException("Serializing to a byte array threw an IOException (should never happen).", e);
        }
    }

    protected int a() {
        return 0;
    }

    public void a(ckt ckt) {
    }

    public cla b() {
        return (cla) super.clone();
    }

    public final int c() {
        int a = a();
        this.b = a;
        return a;
    }

    public /* synthetic */ Object clone() {
        return b();
    }

    public String toString() {
        return buf.a(this);
    }
}
