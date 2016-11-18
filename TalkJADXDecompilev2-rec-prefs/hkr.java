package p000;

import android.os.Binder;
import android.os.IBinder;
import android.os.Parcel;
import com.google.android.gms.location.LocationAvailability;
import com.google.android.gms.location.LocationResult;

public abstract class hkr extends Binder implements hkq {
    public IBinder asBinder() {
        return this;
    }

    public boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) {
        LocationAvailability locationAvailability = null;
        switch (i) {
            case 1:
                LocationResult locationResult;
                parcel.enforceInterface("com.google.android.gms.location.ILocationCallback");
                if (parcel.readInt() != 0) {
                    locationResult = (LocationResult) LocationResult.CREATOR.createFromParcel(parcel);
                }
                mo2598a(locationResult);
                return true;
            case 2:
                parcel.enforceInterface("com.google.android.gms.location.ILocationCallback");
                if (parcel.readInt() != 0) {
                    locationAvailability = (LocationAvailability) LocationAvailability.CREATOR.createFromParcel(parcel);
                }
                mo2597a(locationAvailability);
                return true;
            case 1598968902:
                parcel2.writeString("com.google.android.gms.location.ILocationCallback");
                return true;
            default:
                return super.onTransact(i, parcel, parcel2, i2);
        }
    }
}
