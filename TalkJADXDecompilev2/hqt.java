package defpackage;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;

public abstract class hqt extends Binder implements hqs {
    public static hqs a(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.maps.model.internal.ITileOverlayDelegate");
        return (queryLocalInterface == null || !(queryLocalInterface instanceof hqs)) ? new hqu(iBinder) : (hqs) queryLocalInterface;
    }

    public boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) {
        int i3 = 0;
        boolean z;
        boolean e;
        switch (i) {
            case 1:
                parcel.enforceInterface("com.google.android.gms.maps.model.internal.ITileOverlayDelegate");
                a();
                parcel2.writeNoException();
                return true;
            case 2:
                parcel.enforceInterface("com.google.android.gms.maps.model.internal.ITileOverlayDelegate");
                b();
                parcel2.writeNoException();
                return true;
            case 3:
                parcel.enforceInterface("com.google.android.gms.maps.model.internal.ITileOverlayDelegate");
                String c = c();
                parcel2.writeNoException();
                parcel2.writeString(c);
                return true;
            case 4:
                parcel.enforceInterface("com.google.android.gms.maps.model.internal.ITileOverlayDelegate");
                a(parcel.readFloat());
                parcel2.writeNoException();
                return true;
            case 5:
                parcel.enforceInterface("com.google.android.gms.maps.model.internal.ITileOverlayDelegate");
                float d = d();
                parcel2.writeNoException();
                parcel2.writeFloat(d);
                return true;
            case 6:
                parcel.enforceInterface("com.google.android.gms.maps.model.internal.ITileOverlayDelegate");
                if (parcel.readInt() != 0) {
                    z = true;
                }
                a(z);
                parcel2.writeNoException();
                return true;
            case 7:
                parcel.enforceInterface("com.google.android.gms.maps.model.internal.ITileOverlayDelegate");
                e = e();
                parcel2.writeNoException();
                if (e) {
                    i3 = 1;
                }
                parcel2.writeInt(i3);
                return true;
            case 8:
                parcel.enforceInterface("com.google.android.gms.maps.model.internal.ITileOverlayDelegate");
                e = a(hqt.a(parcel.readStrongBinder()));
                parcel2.writeNoException();
                if (e) {
                    i3 = 1;
                }
                parcel2.writeInt(i3);
                return true;
            case 9:
                parcel.enforceInterface("com.google.android.gms.maps.model.internal.ITileOverlayDelegate");
                i3 = f();
                parcel2.writeNoException();
                parcel2.writeInt(i3);
                return true;
            case 10:
                parcel.enforceInterface("com.google.android.gms.maps.model.internal.ITileOverlayDelegate");
                if (parcel.readInt() != 0) {
                    z = true;
                }
                b(z);
                parcel2.writeNoException();
                return true;
            case 11:
                parcel.enforceInterface("com.google.android.gms.maps.model.internal.ITileOverlayDelegate");
                e = g();
                parcel2.writeNoException();
                if (e) {
                    i3 = 1;
                }
                parcel2.writeInt(i3);
                return true;
            case 1598968902:
                parcel2.writeString("com.google.android.gms.maps.model.internal.ITileOverlayDelegate");
                return true;
            default:
                return super.onTransact(i, parcel, parcel2, i2);
        }
    }
}
