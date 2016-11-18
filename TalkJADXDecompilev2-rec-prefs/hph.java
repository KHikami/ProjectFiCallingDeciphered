package p000;

import android.os.Binder;
import android.os.Parcel;
import com.google.android.gms.maps.model.StreetViewPanoramaCamera;

public abstract class hph extends Binder implements hpg {
    public boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) {
        switch (i) {
            case 1:
                parcel.enforceInterface("com.google.android.gms.maps.internal.IOnStreetViewPanoramaCameraChangeListener");
                mo2805a(parcel.readInt() != 0 ? (StreetViewPanoramaCamera) StreetViewPanoramaCamera.CREATOR.createFromParcel(parcel) : null);
                parcel2.writeNoException();
                return true;
            case 1598968902:
                parcel2.writeString("com.google.android.gms.maps.internal.IOnStreetViewPanoramaCameraChangeListener");
                return true;
            default:
                return super.onTransact(i, parcel, parcel2, i2);
        }
    }
}
