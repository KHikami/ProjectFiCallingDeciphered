import android.os.Binder;
import android.os.IBinder;
import android.os.Parcel;
import com.google.android.gms.location.LocationAvailability;
import com.google.android.gms.location.LocationResult;

public abstract class cpz extends Binder implements cpy {
    public IBinder asBinder() {
        return this;
    }

    public boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) {
        LocationAvailability locationAvailability = null;
        switch (i) {
            case rq.b /*1*/:
                LocationResult locationResult;
                parcel.enforceInterface("com.google.android.gms.location.ILocationCallback");
                if (parcel.readInt() != 0) {
                    locationResult = (LocationResult) LocationResult.CREATOR.createFromParcel(parcel);
                }
                a(locationResult);
                return true;
            case rq.c /*2*/:
                parcel.enforceInterface("com.google.android.gms.location.ILocationCallback");
                if (parcel.readInt() != 0) {
                    col col = LocationAvailability.CREATOR;
                    locationAvailability = col.a(parcel);
                }
                a(locationAvailability);
                return true;
            case 1598968902:
                parcel2.writeString("com.google.android.gms.location.ILocationCallback");
                return true;
            default:
                return super.onTransact(i, parcel, parcel2, i2);
        }
    }
}
