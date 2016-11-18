package p000;

import android.os.IBinder;
import android.os.Parcel;
import com.google.android.gms.maps.model.StreetViewPanoramaLocation;

final class hpl implements hpj {
    private IBinder f17116a;

    hpl(IBinder iBinder) {
        this.f17116a = iBinder;
    }

    public void mo2806a(StreetViewPanoramaLocation streetViewPanoramaLocation) {
        Parcel obtain = Parcel.obtain();
        Parcel obtain2 = Parcel.obtain();
        try {
            obtain.writeInterfaceToken("com.google.android.gms.maps.internal.IOnStreetViewPanoramaChangeListener");
            if (streetViewPanoramaLocation != null) {
                obtain.writeInt(1);
                streetViewPanoramaLocation.writeToParcel(obtain, 0);
            } else {
                obtain.writeInt(0);
            }
            this.f17116a.transact(1, obtain, obtain2, 0);
            obtain2.readException();
        } finally {
            obtain2.recycle();
            obtain.recycle();
        }
    }

    public IBinder asBinder() {
        return this.f17116a;
    }
}
