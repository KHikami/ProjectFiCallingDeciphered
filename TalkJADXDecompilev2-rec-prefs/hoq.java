package p000;

import android.os.IBinder;
import android.os.Parcel;

final class hoq implements hoo {
    private IBinder f17109a;

    hoq(IBinder iBinder) {
        this.f17109a = iBinder;
    }

    public void mo2797a(hqm hqm) {
        Parcel obtain = Parcel.obtain();
        Parcel obtain2 = Parcel.obtain();
        try {
            obtain.writeInterfaceToken("com.google.android.gms.maps.internal.IOnMarkerDragListener");
            obtain.writeStrongBinder(hqm != null ? hqm.asBinder() : null);
            this.f17109a.transact(1, obtain, obtain2, 0);
            obtain2.readException();
        } finally {
            obtain2.recycle();
            obtain.recycle();
        }
    }

    public IBinder asBinder() {
        return this.f17109a;
    }

    public void mo2798b(hqm hqm) {
        Parcel obtain = Parcel.obtain();
        Parcel obtain2 = Parcel.obtain();
        try {
            obtain.writeInterfaceToken("com.google.android.gms.maps.internal.IOnMarkerDragListener");
            obtain.writeStrongBinder(hqm != null ? hqm.asBinder() : null);
            this.f17109a.transact(2, obtain, obtain2, 0);
            obtain2.readException();
        } finally {
            obtain2.recycle();
            obtain.recycle();
        }
    }

    public void mo2799c(hqm hqm) {
        Parcel obtain = Parcel.obtain();
        Parcel obtain2 = Parcel.obtain();
        try {
            obtain.writeInterfaceToken("com.google.android.gms.maps.internal.IOnMarkerDragListener");
            obtain.writeStrongBinder(hqm != null ? hqm.asBinder() : null);
            this.f17109a.transact(3, obtain, obtain2, 0);
            obtain2.readException();
        } finally {
            obtain2.recycle();
            obtain.recycle();
        }
    }
}
