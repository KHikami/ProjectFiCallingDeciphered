package p000;

import android.os.IBinder;
import android.os.Parcel;

final class hnp implements hnn {
    private IBinder f17099a;

    hnp(IBinder iBinder) {
        this.f17099a = iBinder;
    }

    public void mo2789a(hqm hqm) {
        Parcel obtain = Parcel.obtain();
        Parcel obtain2 = Parcel.obtain();
        try {
            obtain.writeInterfaceToken("com.google.android.gms.maps.internal.IOnInfoWindowClickListener");
            obtain.writeStrongBinder(hqm != null ? hqm.asBinder() : null);
            this.f17099a.transact(1, obtain, obtain2, 0);
            obtain2.readException();
        } finally {
            obtain2.recycle();
            obtain.recycle();
        }
    }

    public IBinder asBinder() {
        return this.f17099a;
    }
}
