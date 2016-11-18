package p000;

import android.os.IBinder;
import android.os.Parcel;
import com.google.android.gms.maps.model.StreetViewPanoramaOrientation;

final class hpo implements hpm {
    private IBinder f17117a;

    hpo(IBinder iBinder) {
        this.f17117a = iBinder;
    }

    public void mo2807a(StreetViewPanoramaOrientation streetViewPanoramaOrientation) {
        Parcel obtain = Parcel.obtain();
        Parcel obtain2 = Parcel.obtain();
        try {
            obtain.writeInterfaceToken("com.google.android.gms.maps.internal.IOnStreetViewPanoramaClickListener");
            if (streetViewPanoramaOrientation != null) {
                obtain.writeInt(1);
                streetViewPanoramaOrientation.writeToParcel(obtain, 0);
            } else {
                obtain.writeInt(0);
            }
            this.f17117a.transact(1, obtain, obtain2, 0);
            obtain2.readException();
        } finally {
            obtain2.recycle();
            obtain.recycle();
        }
    }

    public IBinder asBinder() {
        return this.f17117a;
    }
}
