package p000;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;

final class gkp<T> extends Binder implements IInterface {
    T f15511a;

    gkp(T t) {
        this.f15511a = t;
    }

    public IBinder asBinder() {
        return this;
    }
}
