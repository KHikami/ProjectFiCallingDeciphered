package defpackage;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.google.android.gms.maps.model.LatLng;

public abstract class hqe extends Binder implements hqd {
    public static hqd a(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.maps.model.internal.ICircleDelegate");
        return (queryLocalInterface == null || !(queryLocalInterface instanceof hqd)) ? new hqf(iBinder) : (hqd) queryLocalInterface;
    }

    public boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) {
        int i3 = 0;
        float e;
        boolean i4;
        switch (i) {
            case 1:
                parcel.enforceInterface("com.google.android.gms.maps.model.internal.ICircleDelegate");
                a();
                parcel2.writeNoException();
                return true;
            case 2:
                parcel.enforceInterface("com.google.android.gms.maps.model.internal.ICircleDelegate");
                String b = b();
                parcel2.writeNoException();
                parcel2.writeString(b);
                return true;
            case 3:
                parcel.enforceInterface("com.google.android.gms.maps.model.internal.ICircleDelegate");
                a(parcel.readInt() != 0 ? (LatLng) LatLng.CREATOR.createFromParcel(parcel) : null);
                parcel2.writeNoException();
                return true;
            case 4:
                parcel.enforceInterface("com.google.android.gms.maps.model.internal.ICircleDelegate");
                LatLng c = c();
                parcel2.writeNoException();
                if (c != null) {
                    parcel2.writeInt(1);
                    c.writeToParcel(parcel2, 1);
                    return true;
                }
                parcel2.writeInt(0);
                return true;
            case 5:
                parcel.enforceInterface("com.google.android.gms.maps.model.internal.ICircleDelegate");
                a(parcel.readDouble());
                parcel2.writeNoException();
                return true;
            case 6:
                parcel.enforceInterface("com.google.android.gms.maps.model.internal.ICircleDelegate");
                double d = d();
                parcel2.writeNoException();
                parcel2.writeDouble(d);
                return true;
            case 7:
                parcel.enforceInterface("com.google.android.gms.maps.model.internal.ICircleDelegate");
                a(parcel.readFloat());
                parcel2.writeNoException();
                return true;
            case 8:
                parcel.enforceInterface("com.google.android.gms.maps.model.internal.ICircleDelegate");
                e = e();
                parcel2.writeNoException();
                parcel2.writeFloat(e);
                return true;
            case 9:
                parcel.enforceInterface("com.google.android.gms.maps.model.internal.ICircleDelegate");
                a(parcel.readInt());
                parcel2.writeNoException();
                return true;
            case 10:
                parcel.enforceInterface("com.google.android.gms.maps.model.internal.ICircleDelegate");
                i3 = f();
                parcel2.writeNoException();
                parcel2.writeInt(i3);
                return true;
            case 11:
                parcel.enforceInterface("com.google.android.gms.maps.model.internal.ICircleDelegate");
                b(parcel.readInt());
                parcel2.writeNoException();
                return true;
            case 12:
                parcel.enforceInterface("com.google.android.gms.maps.model.internal.ICircleDelegate");
                i3 = g();
                parcel2.writeNoException();
                parcel2.writeInt(i3);
                return true;
            case 13:
                parcel.enforceInterface("com.google.android.gms.maps.model.internal.ICircleDelegate");
                b(parcel.readFloat());
                parcel2.writeNoException();
                return true;
            case 14:
                parcel.enforceInterface("com.google.android.gms.maps.model.internal.ICircleDelegate");
                e = h();
                parcel2.writeNoException();
                parcel2.writeFloat(e);
                return true;
            case 15:
                boolean z;
                parcel.enforceInterface("com.google.android.gms.maps.model.internal.ICircleDelegate");
                if (parcel.readInt() != 0) {
                    z = true;
                }
                a(z);
                parcel2.writeNoException();
                return true;
            case 16:
                parcel.enforceInterface("com.google.android.gms.maps.model.internal.ICircleDelegate");
                i4 = i();
                parcel2.writeNoException();
                if (i4) {
                    i3 = 1;
                }
                parcel2.writeInt(i3);
                return true;
            case wi.dK /*17*/:
                parcel.enforceInterface("com.google.android.gms.maps.model.internal.ICircleDelegate");
                i4 = a(hqe.a(parcel.readStrongBinder()));
                parcel2.writeNoException();
                if (i4) {
                    i3 = 1;
                }
                parcel2.writeInt(i3);
                return true;
            case wi.dH /*18*/:
                parcel.enforceInterface("com.google.android.gms.maps.model.internal.ICircleDelegate");
                i3 = j();
                parcel2.writeNoException();
                parcel2.writeInt(i3);
                return true;
            case 1598968902:
                parcel2.writeString("com.google.android.gms.maps.model.internal.ICircleDelegate");
                return true;
            default:
                return super.onTransact(i, parcel, parcel2, i2);
        }
    }
}
