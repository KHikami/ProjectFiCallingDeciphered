package defpackage;

import java.lang.ref.WeakReference;

/* renamed from: gxz */
abstract class gxz extends gxx {
    private static final WeakReference<byte[]> b;
    private WeakReference<byte[]> a;

    static {
        b = new WeakReference(null);
    }

    gxz(byte[] bArr) {
        super(bArr);
        this.a = b;
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
