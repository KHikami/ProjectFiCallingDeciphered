package p000;

import android.os.IBinder;
import android.os.Parcel;

final class hon implements hol {
    private IBinder f17108a;

    hon(IBinder iBinder) {
        this.f17108a = iBinder;
    }

    public boolean mo2796a(hqm hqm) {
        boolean z = true;
        Parcel obtain = Parcel.obtain();
        Parcel obtain2 = Parcel.obtain();
        try {
            obtain.writeInterfaceToken("com.google.android.gms.maps.internal.IOnMarkerClickListener");
            obtain.writeStrongBinder(hqm != null ? hqm.asBinder() : null);
            this.f17108a.transact(1, obtain, obtain2, 0);
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
        return this.f17108a;
    }
}
