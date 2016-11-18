package p000;

import android.os.IBinder;
import android.os.Parcel;

final class hoe implements hoc {
    private IBinder f17105a;

    hoe(IBinder iBinder) {
        this.f17105a = iBinder;
    }

    public void mo2794a() {
        Parcel obtain = Parcel.obtain();
        Parcel obtain2 = Parcel.obtain();
        try {
            obtain.writeInterfaceToken("com.google.android.gms.maps.internal.IOnMapLoadedCallback");
            this.f17105a.transact(1, obtain, obtain2, 0);
            obtain2.readException();
        } finally {
            obtain2.recycle();
            obtain.recycle();
        }
    }

    public IBinder asBinder() {
        return this.f17105a;
    }
}
