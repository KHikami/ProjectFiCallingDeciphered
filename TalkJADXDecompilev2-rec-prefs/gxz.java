package p000;

import java.lang.ref.WeakReference;

abstract class gxz extends gxx {
    private static final WeakReference<byte[]> f16365b = new WeakReference(null);
    private WeakReference<byte[]> f16366a = f16365b;

    gxz(byte[] bArr) {
        super(bArr);
    }

    byte[] mo2414c() {
        byte[] bArr;
        synchronized (this) {
            bArr = (byte[]) this.f16366a.get();
            if (bArr == null) {
                bArr = mo2415d();
                this.f16366a = new WeakReference(bArr);
            }
        }
        return bArr;
    }

    protected abstract byte[] mo2415d();
}
