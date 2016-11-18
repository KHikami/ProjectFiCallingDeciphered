package defpackage;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import java.util.List;

public abstract class hqk extends Binder implements hqj {
    public static hqj a(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.maps.model.internal.IIndoorBuildingDelegate");
        return (queryLocalInterface == null || !(queryLocalInterface instanceof hqj)) ? new hql(iBinder) : (hqj) queryLocalInterface;
    }

    public boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) {
        int i3 = 0;
        boolean d;
        switch (i) {
            case 1:
                parcel.enforceInterface("com.google.android.gms.maps.model.internal.IIndoorBuildingDelegate");
                i3 = a();
                parcel2.writeNoException();
                parcel2.writeInt(i3);
                return true;
            case 2:
                parcel.enforceInterface("com.google.android.gms.maps.model.internal.IIndoorBuildingDelegate");
                i3 = b();
                parcel2.writeNoException();
                parcel2.writeInt(i3);
                return true;
            case 3:
                parcel.enforceInterface("com.google.android.gms.maps.model.internal.IIndoorBuildingDelegate");
                List c = c();
                parcel2.writeNoException();
                parcel2.writeBinderList(c);
                return true;
            case 4:
                parcel.enforceInterface("com.google.android.gms.maps.model.internal.IIndoorBuildingDelegate");
                d = d();
                parcel2.writeNoException();
                if (d) {
                    i3 = 1;
                }
                parcel2.writeInt(i3);
                return true;
            case 5:
                parcel.enforceInterface("com.google.android.gms.maps.model.internal.IIndoorBuildingDelegate");
                d = a(hqk.a(parcel.readStrongBinder()));
                parcel2.writeNoException();
                if (d) {
                    i3 = 1;
                }
                parcel2.writeInt(i3);
                return true;
            case 6:
                parcel.enforceInterface("com.google.android.gms.maps.model.internal.IIndoorBuildingDelegate");
                i3 = e();
                parcel2.writeNoException();
                parcel2.writeInt(i3);
                return true;
            case 1598968902:
                parcel2.writeString("com.google.android.gms.maps.model.internal.IIndoorBuildingDelegate");
                return true;
            default:
                return super.onTransact(i, parcel, parcel2, i2);
        }
    }
}
