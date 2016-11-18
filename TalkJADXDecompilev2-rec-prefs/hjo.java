package p000;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.google.android.gms.location.internal.FusedLocationProviderResult;

public abstract class hjo extends Binder implements hjn {
    public static hjn m19911a(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.location.internal.IFusedLocationProviderCallback");
        return (queryLocalInterface == null || !(queryLocalInterface instanceof hjn)) ? new hjp(iBinder) : (hjn) queryLocalInterface;
    }

    public boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) {
        switch (i) {
            case 1:
                parcel.enforceInterface("com.google.android.gms.location.internal.IFusedLocationProviderCallback");
                mo2561a(parcel.readInt() != 0 ? (FusedLocationProviderResult) FusedLocationProviderResult.CREATOR.createFromParcel(parcel) : null);
                return true;
            case 1598968902:
                parcel2.writeString("com.google.android.gms.location.internal.IFusedLocationProviderCallback");
                return true;
            default:
                return super.onTransact(i, parcel, parcel2, i2);
        }
    }
}
