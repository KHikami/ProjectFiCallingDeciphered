package p000;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.LatLngBounds;

public abstract class hqh extends Binder implements hqg {
    public static hqg m20566a(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.maps.model.internal.IGroundOverlayDelegate");
        return (queryLocalInterface == null || !(queryLocalInterface instanceof hqg)) ? new hqi(iBinder) : (hqg) queryLocalInterface;
    }

    public boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) {
        LatLngBounds latLngBounds = null;
        int i3 = 0;
        LatLng latLng;
        float d;
        boolean i4;
        switch (i) {
            case 1:
                parcel.enforceInterface("com.google.android.gms.maps.model.internal.IGroundOverlayDelegate");
                mo2852a();
                parcel2.writeNoException();
                return true;
            case 2:
                parcel.enforceInterface("com.google.android.gms.maps.model.internal.IGroundOverlayDelegate");
                String b = mo2860b();
                parcel2.writeNoException();
                parcel2.writeString(b);
                return true;
            case 3:
                parcel.enforceInterface("com.google.android.gms.maps.model.internal.IGroundOverlayDelegate");
                if (parcel.readInt() != 0) {
                    latLng = (LatLng) LatLng.CREATOR.createFromParcel(parcel);
                }
                mo2855a(latLng);
                parcel2.writeNoException();
                return true;
            case 4:
                parcel.enforceInterface("com.google.android.gms.maps.model.internal.IGroundOverlayDelegate");
                latLng = mo2863c();
                parcel2.writeNoException();
                if (latLng != null) {
                    parcel2.writeInt(1);
                    latLng.writeToParcel(parcel2, 1);
                    return true;
                }
                parcel2.writeInt(0);
                return true;
            case 5:
                parcel.enforceInterface("com.google.android.gms.maps.model.internal.IGroundOverlayDelegate");
                mo2853a(parcel.readFloat());
                parcel2.writeNoException();
                return true;
            case 6:
                parcel.enforceInterface("com.google.android.gms.maps.model.internal.IGroundOverlayDelegate");
                mo2854a(parcel.readFloat(), parcel.readFloat());
                parcel2.writeNoException();
                return true;
            case 7:
                parcel.enforceInterface("com.google.android.gms.maps.model.internal.IGroundOverlayDelegate");
                d = mo2865d();
                parcel2.writeNoException();
                parcel2.writeFloat(d);
                return true;
            case 8:
                parcel.enforceInterface("com.google.android.gms.maps.model.internal.IGroundOverlayDelegate");
                d = mo2867e();
                parcel2.writeNoException();
                parcel2.writeFloat(d);
                return true;
            case 9:
                parcel.enforceInterface("com.google.android.gms.maps.model.internal.IGroundOverlayDelegate");
                if (parcel.readInt() != 0) {
                    latLngBounds = (LatLngBounds) LatLngBounds.CREATOR.createFromParcel(parcel);
                }
                mo2856a(latLngBounds);
                parcel2.writeNoException();
                return true;
            case 10:
                parcel.enforceInterface("com.google.android.gms.maps.model.internal.IGroundOverlayDelegate");
                latLngBounds = mo2868f();
                parcel2.writeNoException();
                if (latLngBounds != null) {
                    parcel2.writeInt(1);
                    latLngBounds.writeToParcel(parcel2, 1);
                    return true;
                }
                parcel2.writeInt(0);
                return true;
            case 11:
                parcel.enforceInterface("com.google.android.gms.maps.model.internal.IGroundOverlayDelegate");
                mo2861b(parcel.readFloat());
                parcel2.writeNoException();
                return true;
            case 12:
                parcel.enforceInterface("com.google.android.gms.maps.model.internal.IGroundOverlayDelegate");
                d = mo2869g();
                parcel2.writeNoException();
                parcel2.writeFloat(d);
                return true;
            case 13:
                parcel.enforceInterface("com.google.android.gms.maps.model.internal.IGroundOverlayDelegate");
                mo2864c(parcel.readFloat());
                parcel2.writeNoException();
                return true;
            case 14:
                parcel.enforceInterface("com.google.android.gms.maps.model.internal.IGroundOverlayDelegate");
                d = mo2870h();
                parcel2.writeNoException();
                parcel2.writeFloat(d);
                return true;
            case 15:
                parcel.enforceInterface("com.google.android.gms.maps.model.internal.IGroundOverlayDelegate");
                mo2858a(parcel.readInt() != 0);
                parcel2.writeNoException();
                return true;
            case 16:
                parcel.enforceInterface("com.google.android.gms.maps.model.internal.IGroundOverlayDelegate");
                i4 = mo2871i();
                parcel2.writeNoException();
                if (i4) {
                    i3 = 1;
                }
                parcel2.writeInt(i3);
                return true;
            case wi.dK /*17*/:
                parcel.enforceInterface("com.google.android.gms.maps.model.internal.IGroundOverlayDelegate");
                mo2866d(parcel.readFloat());
                parcel2.writeNoException();
                return true;
            case wi.dH /*18*/:
                parcel.enforceInterface("com.google.android.gms.maps.model.internal.IGroundOverlayDelegate");
                d = mo2872j();
                parcel2.writeNoException();
                parcel2.writeFloat(d);
                return true;
            case wi.dL /*19*/:
                parcel.enforceInterface("com.google.android.gms.maps.model.internal.IGroundOverlayDelegate");
                i4 = mo2859a(hqh.m20566a(parcel.readStrongBinder()));
                parcel2.writeNoException();
                if (i4) {
                    i3 = 1;
                }
                parcel2.writeInt(i3);
                return true;
            case 20:
                parcel.enforceInterface("com.google.android.gms.maps.model.internal.IGroundOverlayDelegate");
                int k = mo2873k();
                parcel2.writeNoException();
                parcel2.writeInt(k);
                return true;
            case 21:
                parcel.enforceInterface("com.google.android.gms.maps.model.internal.IGroundOverlayDelegate");
                mo2857a(gyk.m18960a(parcel.readStrongBinder()));
                parcel2.writeNoException();
                return true;
            case 22:
                boolean z;
                parcel.enforceInterface("com.google.android.gms.maps.model.internal.IGroundOverlayDelegate");
                if (parcel.readInt() != 0) {
                    z = true;
                }
                mo2862b(z);
                parcel2.writeNoException();
                return true;
            case wi.f29038do /*23*/:
                parcel.enforceInterface("com.google.android.gms.maps.model.internal.IGroundOverlayDelegate");
                i4 = mo2874l();
                parcel2.writeNoException();
                if (i4) {
                    i3 = 1;
                }
                parcel2.writeInt(i3);
                return true;
            case 1598968902:
                parcel2.writeString("com.google.android.gms.maps.model.internal.IGroundOverlayDelegate");
                return true;
            default:
                return super.onTransact(i, parcel, parcel2, i2);
        }
    }
}
