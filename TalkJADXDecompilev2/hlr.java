package defpackage;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;

public abstract class hlr extends Binder implements hlq {
    public boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) {
        switch (i) {
            case 1:
                hnw hnw;
                parcel.enforceInterface("com.google.android.gms.maps.internal.ILocationSourceDelegate");
                IBinder readStrongBinder = parcel.readStrongBinder();
                if (readStrongBinder == null) {
                    hnw = null;
                } else {
                    IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("com.google.android.gms.maps.internal.IOnLocationChangeListener");
                    hnw = (queryLocalInterface == null || !(queryLocalInterface instanceof hnw)) ? new hny(readStrongBinder) : (hnw) queryLocalInterface;
                }
                a(hnw);
                parcel2.writeNoException();
                return true;
            case 2:
                parcel.enforceInterface("com.google.android.gms.maps.internal.ILocationSourceDelegate");
                a();
                parcel2.writeNoException();
                return true;
            case 1598968902:
                parcel2.writeString("com.google.android.gms.maps.internal.ILocationSourceDelegate");
                return true;
            default:
                return super.onTransact(i, parcel, parcel2, i2);
        }
    }
}
