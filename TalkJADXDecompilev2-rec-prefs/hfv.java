package p000;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.google.android.gms.common.api.Status;

public abstract class hfv extends Binder implements hfu {
    public static hfu m19692a(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.common.api.internal.IStatusCallback");
        return (queryLocalInterface == null || !(queryLocalInterface instanceof hfu)) ? new hfw(iBinder) : (hfu) queryLocalInterface;
    }

    public boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) {
        switch (i) {
            case 1:
                parcel.enforceInterface("com.google.android.gms.common.api.internal.IStatusCallback");
                mo2527a(parcel.readInt() != 0 ? (Status) Status.CREATOR.createFromParcel(parcel) : null);
                return true;
            case 1598968902:
                parcel2.writeString("com.google.android.gms.common.api.internal.IStatusCallback");
                return true;
            default:
                return super.onTransact(i, parcel, parcel2, i2);
        }
    }
}
