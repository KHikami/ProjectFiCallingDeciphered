package defpackage;

import android.os.IBinder;
import android.os.Parcel;

/* renamed from: hmq */
final class hmq implements hmo {
    private IBinder a;

    hmq(IBinder iBinder) {
        this.a = iBinder;
    }

    public void a(hmc hmc) {
        Parcel obtain = Parcel.obtain();
        Parcel obtain2 = Parcel.obtain();
        try {
            obtain.writeInterfaceToken("com.google.android.gms.maps.internal.IOnStreetViewPanoramaReadyCallback");
            obtain.writeStrongBinder(hmc != null ? hmc.asBinder() : null);
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
