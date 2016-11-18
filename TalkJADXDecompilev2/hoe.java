package defpackage;

import android.os.IBinder;
import android.os.Parcel;

final class hoe implements hoc {
    private IBinder a;

    hoe(IBinder iBinder) {
        this.a = iBinder;
    }

    public void a() {
        Parcel obtain = Parcel.obtain();
        Parcel obtain2 = Parcel.obtain();
        try {
            obtain.writeInterfaceToken("com.google.android.gms.maps.internal.IOnMapLoadedCallback");
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
