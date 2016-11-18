package p000;

import android.os.IBinder;
import android.os.Parcel;

final class hnj implements hnh {
    private IBinder f17097a;

    hnj(IBinder iBinder) {
        this.f17097a = iBinder;
    }

    public void mo2786a(hqg hqg) {
        Parcel obtain = Parcel.obtain();
        Parcel obtain2 = Parcel.obtain();
        try {
            obtain.writeInterfaceToken("com.google.android.gms.maps.internal.IOnGroundOverlayClickListener");
            obtain.writeStrongBinder(hqg != null ? hqg.asBinder() : null);
            this.f17097a.transact(1, obtain, obtain2, 0);
            obtain2.readException();
        } finally {
            obtain2.recycle();
            obtain.recycle();
        }
    }

    public IBinder asBinder() {
        return this.f17097a;
    }
}
