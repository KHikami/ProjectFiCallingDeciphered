package p000;

import android.os.IBinder;
import android.os.Parcel;

final class hnm implements hnk {
    private IBinder f17098a;

    hnm(IBinder iBinder) {
        this.f17098a = iBinder;
    }

    public void mo2787a() {
        Parcel obtain = Parcel.obtain();
        Parcel obtain2 = Parcel.obtain();
        try {
            obtain.writeInterfaceToken("com.google.android.gms.maps.internal.IOnIndoorStateChangeListener");
            this.f17098a.transact(1, obtain, obtain2, 0);
            obtain2.readException();
        } finally {
            obtain2.recycle();
            obtain.recycle();
        }
    }

    public void mo2788a(hqj hqj) {
        Parcel obtain = Parcel.obtain();
        Parcel obtain2 = Parcel.obtain();
        try {
            obtain.writeInterfaceToken("com.google.android.gms.maps.internal.IOnIndoorStateChangeListener");
            obtain.writeStrongBinder(hqj != null ? hqj.asBinder() : null);
            this.f17098a.transact(2, obtain, obtain2, 0);
            obtain2.readException();
        } finally {
            obtain2.recycle();
            obtain.recycle();
        }
    }

    public IBinder asBinder() {
        return this.f17098a;
    }
}
