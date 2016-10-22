package defpackage;

import android.os.Binder;
import android.os.IBinder;
import android.os.Parcel;
import com.google.android.gms.location.LocationSettingsResult;

/* renamed from: cpj */
public abstract class cpj extends Binder implements cpi {
    public cpj() {
        attachInterface(this, "com.google.android.gms.location.internal.ISettingsCallbacks");
    }

    public IBinder asBinder() {
        return this;
    }

    public boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) {
        switch (i) {
            case rq.b /*1*/:
                parcel.enforceInterface("com.google.android.gms.location.internal.ISettingsCallbacks");
                a(parcel.readInt() != 0 ? (LocationSettingsResult) LocationSettingsResult.CREATOR.createFromParcel(parcel) : null);
                return true;
            case 1598968902:
                parcel2.writeString("com.google.android.gms.location.internal.ISettingsCallbacks");
                return true;
            default:
                return super.onTransact(i, parcel, parcel2, i2);
        }
    }
}
