package defpackage;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;

/* renamed from: gkp */
final class gkp<T> extends Binder implements IInterface {
    T a;

    gkp(T t) {
        this.a = t;
    }

    public IBinder asBinder() {
        return this;
    }
}
