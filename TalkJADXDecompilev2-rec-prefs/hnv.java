package p000;

import android.os.IBinder;
import android.os.Parcel;

final class hnv implements hnt {
    private IBinder f17101a;

    hnv(IBinder iBinder) {
        this.f17101a = iBinder;
    }

    public void mo2791a(hqm hqm) {
        Parcel obtain = Parcel.obtain();
        Parcel obtain2 = Parcel.obtain();
        try {
            obtain.writeInterfaceToken("com.google.android.gms.maps.internal.IOnInfoWindowLongClickListener");
            obtain.writeStrongBinder(hqm != null ? hqm.asBinder() : null);
            this.f17101a.transact(1, obtain, obtain2, 0);
            obtain2.readException();
        } finally {
            obtain2.recycle();
            obtain.recycle();
        }
    }

    public IBinder asBinder() {
        return this.f17101a;
    }
}
