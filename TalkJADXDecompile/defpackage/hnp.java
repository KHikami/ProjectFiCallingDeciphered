package defpackage;

import android.os.IBinder;
import android.os.Parcel;

/* renamed from: hnp */
final class hnp implements hnn {
    private IBinder a;

    hnp(IBinder iBinder) {
        this.a = iBinder;
    }

    public void a(hqm hqm) {
        Parcel obtain = Parcel.obtain();
        Parcel obtain2 = Parcel.obtain();
        try {
            obtain.writeInterfaceToken("com.google.android.gms.maps.internal.IOnInfoWindowClickListener");
            obtain.writeStrongBinder(hqm != null ? hqm.asBinder() : null);
            this.a.transact(1, obtain, obtain2, 0);
            obtain2.readException();
        } finally {
            obtain2.recycle();
            obtain.recycle();
        }
    }

    public IBinder asBinder() {
        return this.a;
    }
}
