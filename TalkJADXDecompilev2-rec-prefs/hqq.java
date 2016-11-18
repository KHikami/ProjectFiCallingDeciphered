package p000;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.google.android.gms.maps.model.LatLng;
import java.util.List;

public abstract class hqq extends Binder implements hqp {
    public static hqp m20678a(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.maps.model.internal.IPolygonDelegate");
        return (queryLocalInterface == null || !(queryLocalInterface instanceof hqp)) ? new hqr(iBinder) : (hqp) queryLocalInterface;
    }

    public boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) {
        int i3 = 0;
        List c;
        float e;
        boolean z;
        boolean i4;
        switch (i) {
            case 1:
                parcel.enforceInterface("com.google.android.gms.maps.model.internal.IPolygonDelegate");
                mo2907a();
                parcel2.writeNoException();
                return true;
            case 2:
                parcel.enforceInterface("com.google.android.gms.maps.model.internal.IPolygonDelegate");
                String b = mo2913b();
                parcel2.writeNoException();
                parcel2.writeString(b);
                return true;
            case 3:
                parcel.enforceInterface("com.google.android.gms.maps.model.internal.IPolygonDelegate");
                mo2910a(parcel.createTypedArrayList(LatLng.CREATOR));
                parcel2.writeNoException();
                return true;
            case 4:
                parcel.enforceInterface("com.google.android.gms.maps.model.internal.IPolygonDelegate");
                c = mo2918c();
                parcel2.writeNoException();
                parcel2.writeTypedList(c);
                return true;
            case 5:
                parcel.enforceInterface("com.google.android.gms.maps.model.internal.IPolygonDelegate");
                mo2916b(parcel.readArrayList(getClass().getClassLoader()));
                parcel2.writeNoException();
                return true;
            case 6:
                parcel.enforceInterface("com.google.android.gms.maps.model.internal.IPolygonDelegate");
                c = mo2920d();
                parcel2.writeNoException();
                parcel2.writeList(c);
                return true;
            case 7:
                parcel.enforceInterface("com.google.android.gms.maps.model.internal.IPolygonDelegate");
                mo2908a(parcel.readFloat());
                parcel2.writeNoException();
                return true;
            case 8:
                parcel.enforceInterface("com.google.android.gms.maps.model.internal.IPolygonDelegate");
                e = mo2921e();
                parcel2.writeNoException();
                parcel2.writeFloat(e);
                return true;
            case 9:
                parcel.enforceInterface("com.google.android.gms.maps.model.internal.IPolygonDelegate");
                mo2909a(parcel.readInt());
                parcel2.writeNoException();
                return true;
            case 10:
                parcel.enforceInterface("com.google.android.gms.maps.model.internal.IPolygonDelegate");
                i3 = mo2922f();
                parcel2.writeNoException();
                parcel2.writeInt(i3);
                return true;
            case 11:
                parcel.enforceInterface("com.google.android.gms.maps.model.internal.IPolygonDelegate");
                mo2915b(parcel.readInt());
                parcel2.writeNoException();
                return true;
            case 12:
                parcel.enforceInterface("com.google.android.gms.maps.model.internal.IPolygonDelegate");
                i3 = mo2923g();
                parcel2.writeNoException();
                parcel2.writeInt(i3);
                return true;
            case 13:
                parcel.enforceInterface("com.google.android.gms.maps.model.internal.IPolygonDelegate");
                mo2914b(parcel.readFloat());
                parcel2.writeNoException();
                return true;
            case 14:
                parcel.enforceInterface("com.google.android.gms.maps.model.internal.IPolygonDelegate");
                e = mo2924h();
                parcel2.writeNoException();
                parcel2.writeFloat(e);
                return true;
            case 15:
                parcel.enforceInterface("com.google.android.gms.maps.model.internal.IPolygonDelegate");
                if (parcel.readInt() != 0) {
                    z = true;
                }
                mo2911a(z);
                parcel2.writeNoException();
                return true;
            case 16:
                parcel.enforceInterface("com.google.android.gms.maps.model.internal.IPolygonDelegate");
                i4 = mo2925i();
                parcel2.writeNoException();
                if (i4) {
                    i3 = 1;
                }
                parcel2.writeInt(i3);
                return true;
            case wi.dK /*17*/:
                parcel.enforceInterface("com.google.android.gms.maps.model.internal.IPolygonDelegate");
                if (parcel.readInt() != 0) {
                    z = true;
                }
                mo2917b(z);
                parcel2.writeNoException();
                return true;
            case wi.dH /*18*/:
                parcel.enforceInterface("com.google.android.gms.maps.model.internal.IPolygonDelegate");
                i4 = mo2926j();
                parcel2.writeNoException();
                if (i4) {
                    i3 = 1;
                }
                parcel2.writeInt(i3);
                return true;
            case wi.dL /*19*/:
                parcel.enforceInterface("com.google.android.gms.maps.model.internal.IPolygonDelegate");
                i4 = mo2912a(hqq.m20678a(parcel.readStrongBinder()));
                parcel2.writeNoException();
                if (i4) {
                    i3 = 1;
                }
                parcel2.writeInt(i3);
                return true;
            case 20:
                parcel.enforceInterface("com.google.android.gms.maps.model.internal.IPolygonDelegate");
                i3 = mo2927k();
                parcel2.writeNoException();
                parcel2.writeInt(i3);
                return true;
            case 21:
                parcel.enforceInterface("com.google.android.gms.maps.model.internal.IPolygonDelegate");
                if (parcel.readInt() != 0) {
                    z = true;
                }
                mo2919c(z);
                parcel2.writeNoException();
                return true;
            case 22:
                parcel.enforceInterface("com.google.android.gms.maps.model.internal.IPolygonDelegate");
                i4 = mo2928l();
                parcel2.writeNoException();
                if (i4) {
                    i3 = 1;
                }
                parcel2.writeInt(i3);
                return true;
            case 1598968902:
                parcel2.writeString("com.google.android.gms.maps.model.internal.IPolygonDelegate");
                return true;
            default:
                return super.onTransact(i, parcel, parcel2, i2);
        }
    }
}
