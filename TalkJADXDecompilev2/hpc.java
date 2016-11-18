package defpackage;

import android.os.IBinder;
import android.os.Parcel;

final class hpc implements hpa {
    private IBinder a;

    hpc(IBinder iBinder) {
        this.a = iBinder;
    }

    public void a(hqp hqp) {
        Parcel obtain = Parcel.obtain();
        Parcel obtain2 = Parcel.obtain();
        try {
            obtain.writeInterfaceToken("com.google.android.gms.maps.internal.IOnPolygonClickListener");
            obtain.writeStrongBinder(hqp != null ? hqp.asBinder() : null);
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
