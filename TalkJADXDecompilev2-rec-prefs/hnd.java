package p000;

import android.os.IBinder;
import android.os.Parcel;

final class hnd implements hnb {
    private IBinder f17095a;

    hnd(IBinder iBinder) {
        this.f17095a = iBinder;
    }

    public gyj mo2783a(hqm hqm) {
        Parcel obtain = Parcel.obtain();
        Parcel obtain2 = Parcel.obtain();
        try {
            obtain.writeInterfaceToken("com.google.android.gms.maps.internal.IInfoWindowAdapter");
            obtain.writeStrongBinder(hqm != null ? hqm.asBinder() : null);
            this.f17095a.transact(1, obtain, obtain2, 0);
            obtain2.readException();
            gyj a = gyk.m18960a(obtain2.readStrongBinder());
            return a;
        } finally {
            obtain2.recycle();
            obtain.recycle();
        }
    }

    public IBinder asBinder() {
        return this.f17095a;
    }

    public gyj mo2784b(hqm hqm) {
        Parcel obtain = Parcel.obtain();
        Parcel obtain2 = Parcel.obtain();
        try {
            obtain.writeInterfaceToken("com.google.android.gms.maps.internal.IInfoWindowAdapter");
            obtain.writeStrongBinder(hqm != null ? hqm.asBinder() : null);
            this.f17095a.transact(2, obtain, obtain2, 0);
            obtain2.readException();
            gyj a = gyk.m18960a(obtain2.readStrongBinder());
            return a;
        } finally {
            obtain2.recycle();
            obtain.recycle();
        }
    }
}
