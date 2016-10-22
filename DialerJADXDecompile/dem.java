/* compiled from: PG */
public abstract class dem {
    public volatile int r;

    public abstract dem a(dee dee);

    public dem() {
        this.r = -1;
    }

    public /* synthetic */ Object clone() {
        return b();
    }

    public final int c() {
        int a = a();
        this.r = a;
        return a;
    }

    public int a() {
        return 0;
    }

    public void a(def def) {
    }

    public static final byte[] a(dem dem) {
        byte[] bArr = new byte[dem.c()];
        try {
            def a = def.a(bArr, 0, bArr.length);
            dem.a(a);
            a.a();
            return bArr;
        } catch (Throwable e) {
            throw new RuntimeException("Serializing to a byte array threw an IOException (should never happen).", e);
        }
    }

    public String toString() {
        return buf.a(this);
    }

    public dem b() {
        return (dem) super.clone();
    }
}
