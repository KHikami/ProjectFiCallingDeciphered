package defpackage;

import android.os.Binder;
import android.os.Parcel;

/* renamed from: hov */
public abstract class hov extends Binder implements hou {
    public boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) {
        switch (i) {
            case wi.j /*1*/:
                parcel.enforceInterface("com.google.android.gms.maps.internal.IOnMyLocationChangeListener");
                a(gyk.a(parcel.readStrongBinder()));
                parcel2.writeNoException();
                return true;
            case 1598968902:
                parcel2.writeString("com.google.android.gms.maps.internal.IOnMyLocationChangeListener");
                return true;
            default:
                return super.onTransact(i, parcel, parcel2, i2);
        }
    }
}
