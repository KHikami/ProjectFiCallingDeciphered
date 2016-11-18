package p000;

import android.os.Binder;
import android.os.IBinder;
import android.os.Parcel;

public abstract class hnc extends Binder implements hnb {
    public boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) {
        IBinder iBinder = null;
        gyj a;
        switch (i) {
            case 1:
                parcel.enforceInterface("com.google.android.gms.maps.internal.IInfoWindowAdapter");
                a = mo2783a(hqn.m20629a(parcel.readStrongBinder()));
                parcel2.writeNoException();
                if (a != null) {
                    iBinder = a.asBinder();
                }
                parcel2.writeStrongBinder(iBinder);
                return true;
            case 2:
                parcel.enforceInterface("com.google.android.gms.maps.internal.IInfoWindowAdapter");
                a = mo2784b(hqn.m20629a(parcel.readStrongBinder()));
                parcel2.writeNoException();
                if (a != null) {
                    iBinder = a.asBinder();
                }
                parcel2.writeStrongBinder(iBinder);
                return true;
            case 1598968902:
                parcel2.writeString("com.google.android.gms.maps.internal.IInfoWindowAdapter");
                return true;
            default:
                return super.onTransact(i, parcel, parcel2, i2);
        }
    }
}
