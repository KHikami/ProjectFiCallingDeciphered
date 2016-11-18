package defpackage;

import android.location.Location;
import android.os.Binder;
import android.os.Parcel;

public abstract class hnx extends Binder implements hnw {
    public boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) {
        switch (i) {
            case 1:
                parcel.enforceInterface("com.google.android.gms.maps.internal.IOnLocationChangeListener");
                a(gyk.a(parcel.readStrongBinder()));
                parcel2.writeNoException();
                return true;
            case 2:
                parcel.enforceInterface("com.google.android.gms.maps.internal.IOnLocationChangeListener");
                a(parcel.readInt() != 0 ? (Location) Location.CREATOR.createFromParcel(parcel) : null);
                parcel2.writeNoException();
                return true;
            case 1598968902:
                parcel2.writeString("com.google.android.gms.maps.internal.IOnLocationChangeListener");
                return true;
            default:
                return super.onTransact(i, parcel, parcel2, i2);
        }
    }
}
