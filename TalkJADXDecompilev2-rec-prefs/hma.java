package p000;

import android.os.Binder;
import android.os.IBinder;
import android.os.Parcel;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.VisibleRegion;

public abstract class hma extends Binder implements hlz {
    public boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) {
        IBinder iBinder = null;
        switch (i) {
            case 1:
                parcel.enforceInterface("com.google.android.gms.maps.internal.IProjectionDelegate");
                LatLng a = mo2707a(gyk.m18960a(parcel.readStrongBinder()));
                parcel2.writeNoException();
                if (a != null) {
                    parcel2.writeInt(1);
                    a.writeToParcel(parcel2, 1);
                } else {
                    parcel2.writeInt(0);
                }
                return true;
            case 2:
                parcel.enforceInterface("com.google.android.gms.maps.internal.IProjectionDelegate");
                gyj a2 = mo2709a(parcel.readInt() != 0 ? (LatLng) LatLng.CREATOR.createFromParcel(parcel) : null);
                parcel2.writeNoException();
                if (a2 != null) {
                    iBinder = a2.asBinder();
                }
                parcel2.writeStrongBinder(iBinder);
                return true;
            case 3:
                parcel.enforceInterface("com.google.android.gms.maps.internal.IProjectionDelegate");
                VisibleRegion a3 = mo2708a();
                parcel2.writeNoException();
                if (a3 != null) {
                    parcel2.writeInt(1);
                    a3.writeToParcel(parcel2, 1);
                } else {
                    parcel2.writeInt(0);
                }
                return true;
            case 1598968902:
                parcel2.writeString("com.google.android.gms.maps.internal.IProjectionDelegate");
                return true;
            default:
                return super.onTransact(i, parcel, parcel2, i2);
        }
    }
}
