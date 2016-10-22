import java.lang.ref.WeakReference;

abstract class ccj extends bwi {
    private static final WeakReference b;
    private WeakReference a;

    static {
        b = new WeakReference(null);
    }

    ccj(byte[] bArr) {
        super(bArr);
        this.a = b;
    }

    final byte[] a() {
        byte[] bArr;
        synchronized (this) {
            bArr = (byte[]) this.a.get();
            if (bArr == null) {
                bArr = b();
                this.a = new WeakReference(bArr);
            }
        }
        return bArr;
    }

    protected abstract byte[] b();
}
