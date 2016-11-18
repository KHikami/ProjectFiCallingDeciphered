package p000;

import android.os.IBinder;
import android.os.Parcel;

final class hpc implements hpa {
    private IBinder f17113a;

    hpc(IBinder iBinder) {
        this.f17113a = iBinder;
    }

    public void mo2803a(hqp hqp) {
        Parcel obtain = Parcel.obtain();
        Parcel obtain2 = Parcel.obtain();
        try {
            obtain.writeInterfaceToken("com.google.android.gms.maps.internal.IOnPolygonClickListener");
            obtain.writeStrongBinder(hqp != null ? hqp.asBinder() : null);
            this.f17113a.transact(1, obtain, obtain2, 0);
            obtain2.readException();
        } finally {
            obtain2.recycle();
            obtain.recycle();
        }
    }

    public IBinder asBinder() {
        return this.f17113a;
    }
}
