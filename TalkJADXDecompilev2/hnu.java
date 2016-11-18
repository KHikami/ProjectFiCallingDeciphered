package defpackage;

import android.os.Binder;
import android.os.Parcel;

public abstract class hnu extends Binder implements hnt {
    public boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) {
        switch (i) {
            case 1:
                parcel.enforceInterface("com.google.android.gms.maps.internal.IOnInfoWindowLongClickListener");
                a(hqn.a(parcel.readStrongBinder()));
                parcel2.writeNoException();
                return true;
            case 1598968902:
                parcel2.writeString("com.google.android.gms.maps.internal.IOnInfoWindowLongClickListener");
                return true;
            default:
                return super.onTransact(i, parcel, parcel2, i2);
        }
    }
}
