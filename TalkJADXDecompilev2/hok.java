package defpackage;

import android.os.IBinder;
import android.os.Parcel;

final class hok implements hoi {
    private IBinder a;

    hok(IBinder iBinder) {
        this.a = iBinder;
    }

    public void a(hln hln) {
        Parcel obtain = Parcel.obtain();
        Parcel obtain2 = Parcel.obtain();
        try {
            obtain.writeInterfaceToken("com.google.android.gms.maps.internal.IOnMapReadyCallback");
            obtain.writeStrongBinder(hln != null ? hln.asBinder() : null);
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
