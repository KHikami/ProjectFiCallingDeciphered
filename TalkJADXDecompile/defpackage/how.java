package defpackage;

import android.os.IBinder;
import android.os.Parcel;

/* renamed from: how */
final class how implements hou {
    private IBinder a;

    how(IBinder iBinder) {
        this.a = iBinder;
    }

    public void a(gyj gyj) {
        Parcel obtain = Parcel.obtain();
        Parcel obtain2 = Parcel.obtain();
        try {
            obtain.writeInterfaceToken("com.google.android.gms.maps.internal.IOnMyLocationChangeListener");
            obtain.writeStrongBinder(gyj != null ? gyj.asBinder() : null);
            this.a.transact(1, obtain, obtain2, 0);
            obtain2.readException();
        } finally {
            obtain2.recycle();
            obtain.recycle();
        }
    }

    public IBinder asBinder() {
        return this.a;
    }
}
