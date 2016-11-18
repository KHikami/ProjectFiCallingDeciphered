package p000;

import android.os.IBinder;
import android.os.Parcel;

final class hmq implements hmo {
    private IBinder f17089a;

    hmq(IBinder iBinder) {
        this.f17089a = iBinder;
    }

    public void mo2770a(hmc hmc) {
        Parcel obtain = Parcel.obtain();
        Parcel obtain2 = Parcel.obtain();
        try {
            obtain.writeInterfaceToken("com.google.android.gms.maps.internal.IOnStreetViewPanoramaReadyCallback");
            obtain.writeStrongBinder(hmc != null ? hmc.asBinder() : null);
            this.f17089a.transact(1, obtain, obtain2, 0);
            obtain2.readException();
        } finally {
            obtain2.recycle();
            obtain.recycle();
        }
    }

    public IBinder asBinder() {
        return this.f17089a;
    }
}
