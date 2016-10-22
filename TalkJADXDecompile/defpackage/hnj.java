package defpackage;

import android.os.IBinder;
import android.os.Parcel;

/* renamed from: hnj */
final class hnj implements hnh {
    private IBinder a;

    hnj(IBinder iBinder) {
        this.a = iBinder;
    }

    public void a(hqg hqg) {
        Parcel obtain = Parcel.obtain();
        Parcel obtain2 = Parcel.obtain();
        try {
            obtain.writeInterfaceToken("com.google.android.gms.maps.internal.IOnGroundOverlayClickListener");
            obtain.writeStrongBinder(hqg != null ? hqg.asBinder() : null);
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
