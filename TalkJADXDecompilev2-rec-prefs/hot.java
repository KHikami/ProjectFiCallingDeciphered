package p000;

import android.os.IBinder;
import android.os.Parcel;

final class hot implements hor {
    private IBinder f17110a;

    hot(IBinder iBinder) {
        this.f17110a = iBinder;
    }

    public boolean mo2800a() {
        boolean z = true;
        Parcel obtain = Parcel.obtain();
        Parcel obtain2 = Parcel.obtain();
        try {
            obtain.writeInterfaceToken("com.google.android.gms.maps.internal.IOnMyLocationButtonClickListener");
            this.f17110a.transact(1, obtain, obtain2, 0);
            obtain2.readException();
            if (obtain2.readInt() == 0) {
                z = false;
            }
            obtain2.recycle();
            obtain.recycle();
            return z;
        } catch (Throwable th) {
            obtain2.recycle();
            obtain.recycle();
        }
    }

    public IBinder asBinder() {
        return this.f17110a;
    }
}
