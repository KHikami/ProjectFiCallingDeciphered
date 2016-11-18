package p000;

import android.os.Binder;
import android.os.Parcel;
import com.google.android.gms.location.LocationSettingsResult;

public abstract class hjx extends Binder implements hjw {
    public boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) {
        switch (i) {
            case 1:
                parcel.enforceInterface("com.google.android.gms.location.internal.ISettingsCallbacks");
                mo2596a(parcel.readInt() != 0 ? (LocationSettingsResult) LocationSettingsResult.CREATOR.createFromParcel(parcel) : null);
                return true;
            case 1598968902:
                parcel2.writeString("com.google.android.gms.location.internal.ISettingsCallbacks");
                return true;
            default:
                return super.onTransact(i, parcel, parcel2, i2);
        }
    }
}
