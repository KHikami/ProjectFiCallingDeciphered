package p000;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.google.android.gms.maps.model.LatLng;

public abstract class hqn extends Binder implements hqm {
    public static hqm m20629a(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.maps.model.internal.IMarkerDelegate");
        return (queryLocalInterface == null || !(queryLocalInterface instanceof hqm)) ? new hqo(iBinder) : (hqm) queryLocalInterface;
    }

    public boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) {
        int i3 = 0;
        String b;
        boolean z;
        boolean f;
        float m;
        switch (i) {
            case 1:
                parcel.enforceInterface("com.google.android.gms.maps.model.internal.IMarkerDelegate");
                mo2881a();
                parcel2.writeNoException();
                return true;
            case 2:
                parcel.enforceInterface("com.google.android.gms.maps.model.internal.IMarkerDelegate");
                b = mo2889b();
                parcel2.writeNoException();
                parcel2.writeString(b);
                return true;
            case 3:
                parcel.enforceInterface("com.google.android.gms.maps.model.internal.IMarkerDelegate");
                mo2884a(parcel.readInt() != 0 ? (LatLng) LatLng.CREATOR.createFromParcel(parcel) : null);
                parcel2.writeNoException();
                return true;
            case 4:
                parcel.enforceInterface("com.google.android.gms.maps.model.internal.IMarkerDelegate");
                LatLng c = mo2894c();
                parcel2.writeNoException();
                if (c != null) {
                    parcel2.writeInt(1);
                    c.writeToParcel(parcel2, 1);
                    return true;
                }
                parcel2.writeInt(0);
                return true;
            case 5:
                parcel.enforceInterface("com.google.android.gms.maps.model.internal.IMarkerDelegate");
                mo2886a(parcel.readString());
                parcel2.writeNoException();
                return true;
            case 6:
                parcel.enforceInterface("com.google.android.gms.maps.model.internal.IMarkerDelegate");
                b = mo2896d();
                parcel2.writeNoException();
                parcel2.writeString(b);
                return true;
            case 7:
                parcel.enforceInterface("com.google.android.gms.maps.model.internal.IMarkerDelegate");
                mo2892b(parcel.readString());
                parcel2.writeNoException();
                return true;
            case 8:
                parcel.enforceInterface("com.google.android.gms.maps.model.internal.IMarkerDelegate");
                b = mo2897e();
                parcel2.writeNoException();
                parcel2.writeString(b);
                return true;
            case 9:
                parcel.enforceInterface("com.google.android.gms.maps.model.internal.IMarkerDelegate");
                if (parcel.readInt() != 0) {
                    z = true;
                }
                mo2887a(z);
                parcel2.writeNoException();
                return true;
            case 10:
                parcel.enforceInterface("com.google.android.gms.maps.model.internal.IMarkerDelegate");
                f = mo2898f();
                parcel2.writeNoException();
                if (f) {
                    i3 = 1;
                }
                parcel2.writeInt(i3);
                return true;
            case 11:
                parcel.enforceInterface("com.google.android.gms.maps.model.internal.IMarkerDelegate");
                mo2899g();
                parcel2.writeNoException();
                return true;
            case 12:
                parcel.enforceInterface("com.google.android.gms.maps.model.internal.IMarkerDelegate");
                mo2900h();
                parcel2.writeNoException();
                return true;
            case 13:
                parcel.enforceInterface("com.google.android.gms.maps.model.internal.IMarkerDelegate");
                f = mo2901i();
                parcel2.writeNoException();
                if (f) {
                    i3 = 1;
                }
                parcel2.writeInt(i3);
                return true;
            case 14:
                parcel.enforceInterface("com.google.android.gms.maps.model.internal.IMarkerDelegate");
                if (parcel.readInt() != 0) {
                    z = true;
                }
                mo2893b(z);
                parcel2.writeNoException();
                return true;
            case 15:
                parcel.enforceInterface("com.google.android.gms.maps.model.internal.IMarkerDelegate");
                f = mo2902j();
                parcel2.writeNoException();
                if (f) {
                    i3 = 1;
                }
                parcel2.writeInt(i3);
                return true;
            case 16:
                parcel.enforceInterface("com.google.android.gms.maps.model.internal.IMarkerDelegate");
                f = mo2888a(hqn.m20629a(parcel.readStrongBinder()));
                parcel2.writeNoException();
                if (f) {
                    i3 = 1;
                }
                parcel2.writeInt(i3);
                return true;
            case wi.dK /*17*/:
                parcel.enforceInterface("com.google.android.gms.maps.model.internal.IMarkerDelegate");
                i3 = mo2903k();
                parcel2.writeNoException();
                parcel2.writeInt(i3);
                return true;
            case wi.dH /*18*/:
                parcel.enforceInterface("com.google.android.gms.maps.model.internal.IMarkerDelegate");
                mo2885a(gyk.m18960a(parcel.readStrongBinder()));
                parcel2.writeNoException();
                return true;
            case wi.dL /*19*/:
                parcel.enforceInterface("com.google.android.gms.maps.model.internal.IMarkerDelegate");
                mo2883a(parcel.readFloat(), parcel.readFloat());
                parcel2.writeNoException();
                return true;
            case 20:
                parcel.enforceInterface("com.google.android.gms.maps.model.internal.IMarkerDelegate");
                if (parcel.readInt() != 0) {
                    z = true;
                }
                mo2895c(z);
                parcel2.writeNoException();
                return true;
            case 21:
                parcel.enforceInterface("com.google.android.gms.maps.model.internal.IMarkerDelegate");
                f = mo2904l();
                parcel2.writeNoException();
                if (f) {
                    i3 = 1;
                }
                parcel2.writeInt(i3);
                return true;
            case 22:
                parcel.enforceInterface("com.google.android.gms.maps.model.internal.IMarkerDelegate");
                mo2882a(parcel.readFloat());
                parcel2.writeNoException();
                return true;
            case wi.f29038do /*23*/:
                parcel.enforceInterface("com.google.android.gms.maps.model.internal.IMarkerDelegate");
                m = mo2905m();
                parcel2.writeNoException();
                parcel2.writeFloat(m);
                return true;
            case wi.dA /*24*/:
                parcel.enforceInterface("com.google.android.gms.maps.model.internal.IMarkerDelegate");
                mo2891b(parcel.readFloat(), parcel.readFloat());
                parcel2.writeNoException();
                return true;
            case wi.dz /*25*/:
                parcel.enforceInterface("com.google.android.gms.maps.model.internal.IMarkerDelegate");
                mo2890b(parcel.readFloat());
                parcel2.writeNoException();
                return true;
            case wi.dx /*26*/:
                parcel.enforceInterface("com.google.android.gms.maps.model.internal.IMarkerDelegate");
                m = mo2906n();
                parcel2.writeNoException();
                parcel2.writeFloat(m);
                return true;
            case 1598968902:
                parcel2.writeString("com.google.android.gms.maps.model.internal.IMarkerDelegate");
                return true;
            default:
                return super.onTransact(i, parcel, parcel2, i2);
        }
    }
}
