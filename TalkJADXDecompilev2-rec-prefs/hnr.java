package p000;

import android.os.Binder;
import android.os.Parcel;

public abstract class hnr extends Binder implements hnq {
    public boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) {
        switch (i) {
            case 1:
                parcel.enforceInterface("com.google.android.gms.maps.internal.IOnInfoWindowCloseListener");
                mo2790a(hqn.m20629a(parcel.readStrongBinder()));
                parcel2.writeNoException();
                return true;
            case 1598968902:
                parcel2.writeString("com.google.android.gms.maps.internal.IOnInfoWindowCloseListener");
                return true;
            default:
                return super.onTransact(i, parcel, parcel2, i2);
        }
    }
}
