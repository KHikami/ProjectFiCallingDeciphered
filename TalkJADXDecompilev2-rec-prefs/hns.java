package p000;

import android.os.IBinder;
import android.os.Parcel;

final class hns implements hnq {
    private IBinder f17100a;

    hns(IBinder iBinder) {
        this.f17100a = iBinder;
    }

    public void mo2790a(hqm hqm) {
        Parcel obtain = Parcel.obtain();
        Parcel obtain2 = Parcel.obtain();
        try {
            obtain.writeInterfaceToken("com.google.android.gms.maps.internal.IOnInfoWindowCloseListener");
            obtain.writeStrongBinder(hqm != null ? hqm.asBinder() : null);
            this.f17100a.transact(1, obtain, obtain2, 0);
            obtain2.readException();
        } finally {
            obtain2.recycle();
            obtain.recycle();
        }
    }

    public IBinder asBinder() {
        return this.f17100a;
    }
}
