package p000;

import android.os.Binder;
import android.os.Parcel;

public abstract class hos extends Binder implements hor {
    public boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) {
        switch (i) {
            case 1:
                parcel.enforceInterface("com.google.android.gms.maps.internal.IOnMyLocationButtonClickListener");
                boolean a = mo2800a();
                parcel2.writeNoException();
                parcel2.writeInt(a ? 1 : 0);
                return true;
            case 1598968902:
                parcel2.writeString("com.google.android.gms.maps.internal.IOnMyLocationButtonClickListener");
                return true;
            default:
                return super.onTransact(i, parcel, parcel2, i2);
        }
    }
}
