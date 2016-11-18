package p000;

import android.os.IBinder;
import android.os.Parcel;
import com.google.android.gms.maps.model.StreetViewPanoramaOrientation;

final class hpr implements hpp {
    private IBinder f17118a;

    hpr(IBinder iBinder) {
        this.f17118a = iBinder;
    }

    public void mo2808a(StreetViewPanoramaOrientation streetViewPanoramaOrientation) {
        Parcel obtain = Parcel.obtain();
        Parcel obtain2 = Parcel.obtain();
        try {
            obtain.writeInterfaceToken("com.google.android.gms.maps.internal.IOnStreetViewPanoramaLongClickListener");
            if (streetViewPanoramaOrientation != null) {
                obtain.writeInt(1);
                streetViewPanoramaOrientation.writeToParcel(obtain, 0);
            } else {
                obtain.writeInt(0);
            }
            this.f17118a.transact(1, obtain, obtain2, 0);
            obtain2.readException();
        } finally {
            obtain2.recycle();
            obtain.recycle();
        }
    }

    public IBinder asBinder() {
        return this.f17118a;
    }
}
