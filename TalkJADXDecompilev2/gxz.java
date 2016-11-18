package defpackage;

import java.lang.ref.WeakReference;

abstract class gxz extends gxx {
    private static final WeakReference<byte[]> b = new WeakReference(null);
    private WeakReference<byte[]> a = b;

    gxz(byte[] bArr) {
        super(bArr);
    }

    byte[] c() {
        byte[] bArr;
        synchronized (this) {
            bArr = (byte[]) this.a.get();
            if (bArr == null) {
                bArr = d();
                this.a = new WeakReference(bArr);
            }
        }
        return bArr;
    }

    protected abstract byte[] d();
}
