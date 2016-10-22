package defpackage;

import android.os.Parcel;

/* renamed from: ckw */
public class ckw implements ht {
    protected final int a(Object obj) {
        throw new IllegalArgumentException("Unknown type " + 0);
    }

    protected final void a(Object obj, ckt ckt) {
        try {
            ckt.c(0);
            throw new IllegalArgumentException("Unknown type " + 0);
        } catch (Throwable e) {
            throw new IllegalStateException(e);
        }
    }

    public static r b(Parcel parcel, ClassLoader classLoader) {
        return new r(parcel, classLoader);
    }

    public static r[] b(int i) {
        return new r[i];
    }

    public /* synthetic */ Object[] a(int i) {
        return ckw.b(i);
    }

    public /* synthetic */ Object a(Parcel parcel, ClassLoader classLoader) {
        return ckw.b(parcel, classLoader);
    }
}
