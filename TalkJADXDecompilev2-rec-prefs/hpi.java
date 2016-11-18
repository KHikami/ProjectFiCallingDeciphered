package p000;

import android.os.IBinder;
import android.os.Parcel;
import com.google.android.gms.maps.model.StreetViewPanoramaCamera;

final class hpi implements hpg {
    private IBinder f17115a;

    hpi(IBinder iBinder) {
        this.f17115a = iBinder;
    }

    public void mo2805a(StreetViewPanoramaCamera streetViewPanoramaCamera) {
        Parcel obtain = Parcel.obtain();
        Parcel obtain2 = Parcel.obtain();
        try {
            obtain.writeInterfaceToken("com.google.android.gms.maps.internal.IOnStreetViewPanoramaCameraChangeListener");
            if (streetViewPanoramaCamera != null) {
                obtain.writeInt(1);
                streetViewPanoramaCamera.writeToParcel(obtain, 0);
            } else {
                obtain.writeInt(0);
            }
            this.f17115a.transact(1, obtain, obtain2, 0);
            obtain2.readException();
        } finally {
            obtain2.recycle();
            obtain.recycle();
        }
    }

    public IBinder asBinder() {
        return this.f17115a;
    }
}
