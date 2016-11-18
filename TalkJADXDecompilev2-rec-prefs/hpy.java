package p000;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.google.android.gms.maps.model.LatLng;
import java.util.List;

public abstract class hpy extends Binder implements hpx {
    public static hpx m20462a(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.maps.model.internal.IPolylineDelegate");
        return (queryLocalInterface == null || !(queryLocalInterface instanceof hpx)) ? new hpz(iBinder) : (hpx) queryLocalInterface;
    }

    public boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) {
        int i3 = 0;
        float d;
        boolean z;
        boolean g;
        switch (i) {
            case 1:
                parcel.enforceInterface("com.google.android.gms.maps.model.internal.IPolylineDelegate");
                mo2809a();
                parcel2.writeNoException();
                return true;
            case 2:
                parcel.enforceInterface("com.google.android.gms.maps.model.internal.IPolylineDelegate");
                String b = mo2815b();
                parcel2.writeNoException();
                parcel2.writeString(b);
                return true;
            case 3:
                parcel.enforceInterface("com.google.android.gms.maps.model.internal.IPolylineDelegate");
                mo2812a(parcel.createTypedArrayList(LatLng.CREATOR));
                parcel2.writeNoException();
                return true;
            case 4:
                parcel.enforceInterface("com.google.android.gms.maps.model.internal.IPolylineDelegate");
                List c = mo2818c();
                parcel2.writeNoException();
                parcel2.writeTypedList(c);
                return true;
            case 5:
                parcel.enforceInterface("com.google.android.gms.maps.model.internal.IPolylineDelegate");
                mo2810a(parcel.readFloat());
                parcel2.writeNoException();
                return true;
            case 6:
                parcel.enforceInterface("com.google.android.gms.maps.model.internal.IPolylineDelegate");
                d = mo2820d();
                parcel2.writeNoException();
                parcel2.writeFloat(d);
                return true;
            case 7:
                parcel.enforceInterface("com.google.android.gms.maps.model.internal.IPolylineDelegate");
                mo2811a(parcel.readInt());
                parcel2.writeNoException();
                return true;
            case 8:
                parcel.enforceInterface("com.google.android.gms.maps.model.internal.IPolylineDelegate");
                i3 = mo2821e();
                parcel2.writeNoException();
                parcel2.writeInt(i3);
                return true;
            case 9:
                parcel.enforceInterface("com.google.android.gms.maps.model.internal.IPolylineDelegate");
                mo2816b(parcel.readFloat());
                parcel2.writeNoException();
                return true;
            case 10:
                parcel.enforceInterface("com.google.android.gms.maps.model.internal.IPolylineDelegate");
                d = mo2822f();
                parcel2.writeNoException();
                parcel2.writeFloat(d);
                return true;
            case 11:
                parcel.enforceInterface("com.google.android.gms.maps.model.internal.IPolylineDelegate");
                if (parcel.readInt() != 0) {
                    z = true;
                }
                mo2813a(z);
                parcel2.writeNoException();
                return true;
            case 12:
                parcel.enforceInterface("com.google.android.gms.maps.model.internal.IPolylineDelegate");
                g = mo2823g();
                parcel2.writeNoException();
                if (g) {
                    i3 = 1;
                }
                parcel2.writeInt(i3);
                return true;
            case 13:
                parcel.enforceInterface("com.google.android.gms.maps.model.internal.IPolylineDelegate");
                if (parcel.readInt() != 0) {
                    z = true;
                }
                mo2817b(z);
                parcel2.writeNoException();
                return true;
            case 14:
                parcel.enforceInterface("com.google.android.gms.maps.model.internal.IPolylineDelegate");
                g = mo2824h();
                parcel2.writeNoException();
                if (g) {
                    i3 = 1;
                }
                parcel2.writeInt(i3);
                return true;
            case 15:
                parcel.enforceInterface("com.google.android.gms.maps.model.internal.IPolylineDelegate");
                g = mo2814a(hpy.m20462a(parcel.readStrongBinder()));
                parcel2.writeNoException();
                if (g) {
                    i3 = 1;
                }
                parcel2.writeInt(i3);
                return true;
            case 16:
                parcel.enforceInterface("com.google.android.gms.maps.model.internal.IPolylineDelegate");
                i3 = mo2825i();
                parcel2.writeNoException();
                parcel2.writeInt(i3);
                return true;
            case wi.dK /*17*/:
                parcel.enforceInterface("com.google.android.gms.maps.model.internal.IPolylineDelegate");
                if (parcel.readInt() != 0) {
                    z = true;
                }
                mo2819c(z);
                parcel2.writeNoException();
                return true;
            case wi.dH /*18*/:
                parcel.enforceInterface("com.google.android.gms.maps.model.internal.IPolylineDelegate");
                g = mo2826j();
                parcel2.writeNoException();
                if (g) {
                    i3 = 1;
                }
                parcel2.writeInt(i3);
                return true;
            case 1598968902:
                parcel2.writeString("com.google.android.gms.maps.model.internal.IPolylineDelegate");
                return true;
            default:
                return super.onTransact(i, parcel, parcel2, i2);
        }
    }
}
