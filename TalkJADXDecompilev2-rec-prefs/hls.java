package p000;

import android.os.IBinder;
import android.os.Parcel;

final class hls implements hlq {
    private IBinder f17081a;

    hls(IBinder iBinder) {
        this.f17081a = iBinder;
    }

    public void mo2680a() {
        Parcel obtain = Parcel.obtain();
        Parcel obtain2 = Parcel.obtain();
        try {
            obtain.writeInterfaceToken("com.google.android.gms.maps.internal.ILocationSourceDelegate");
            this.f17081a.transact(2, obtain, obtain2, 0);
            obtain2.readException();
        } finally {
            obtain2.recycle();
            obtain.recycle();
        }
    }

    public void mo2681a(hnw hnw) {
        Parcel obtain = Parcel.obtain();
        Parcel obtain2 = Parcel.obtain();
        try {
            obtain.writeInterfaceToken("com.google.android.gms.maps.internal.ILocationSourceDelegate");
            obtain.writeStrongBinder(hnw != null ? hnw.asBinder() : null);
            this.f17081a.transact(1, obtain, obtain2, 0);
            obtain2.readException();
        } finally {
            obtain2.recycle();
            obtain.recycle();
        }
    }

    public IBinder asBinder() {
        return this.f17081a;
    }
}
