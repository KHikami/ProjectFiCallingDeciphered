package defpackage;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.google.android.gms.maps.model.LatLng;

public abstract class hqn extends Binder implements hqm {
    public static hqm a(IBinder iBinder) {
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
                a();
                parcel2.writeNoException();
                return true;
            case 2:
                parcel.enforceInterface("com.google.android.gms.maps.model.internal.IMarkerDelegate");
                b = b();
                parcel2.writeNoException();
                parcel2.writeString(b);
                return true;
            case 3:
                parcel.enforceInterface("com.google.android.gms.maps.model.internal.IMarkerDelegate");
                a(parcel.readInt() != 0 ? (LatLng) LatLng.CREATOR.createFromParcel(parcel) : null);
                parcel2.writeNoException();
                return true;
            case 4:
                parcel.enforceInterface("com.google.android.gms.maps.model.internal.IMarkerDelegate");
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
                parcel.enforceInterface("com.google.android.gms.maps.model.internal.IMarkerDelegate");
                a(parcel.readString());
                parcel2.writeNoException();
                return true;
            case 6:
                parcel.enforceInterface("com.google.android.gms.maps.model.internal.IMarkerDelegate");
                b = d();
                parcel2.writeNoException();
                parcel2.writeString(b);
                return true;
            case 7:
                parcel.enforceInterface("com.google.android.gms.maps.model.internal.IMarkerDelegate");
                b(parcel.readString());
                parcel2.writeNoException();
                return true;
            case 8:
                parcel.enforceInterface("com.google.android.gms.maps.model.internal.IMarkerDelegate");
                b = e();
                parcel2.writeNoException();
                parcel2.writeString(b);
                return true;
            case 9:
                parcel.enforceInterface("com.google.android.gms.maps.model.internal.IMarkerDelegate");
                if (parcel.readInt() != 0) {
                    z = true;
                }
                a(z);
                parcel2.writeNoException();
                return true;
            case 10:
                parcel.enforceInterface("com.google.android.gms.maps.model.internal.IMarkerDelegate");
                f = f();
                parcel2.writeNoException();
                if (f) {
                    i3 = 1;
                }
                parcel2.writeInt(i3);
                return true;
            case 11:
                parcel.enforceInterface("com.google.android.gms.maps.model.internal.IMarkerDelegate");
                g();
                parcel2.writeNoException();
                return true;
            case 12:
                parcel.enforceInterface("com.google.android.gms.maps.model.internal.IMarkerDelegate");
                h();
                parcel2.writeNoException();
                return true;
            case 13:
                parcel.enforceInterface("com.google.android.gms.maps.model.internal.IMarkerDelegate");
                f = i();
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
                b(z);
                parcel2.writeNoException();
                return true;
            case 15:
                parcel.enforceInterface("com.google.android.gms.maps.model.internal.IMarkerDelegate");
                f = j();
                parcel2.writeNoException();
                if (f) {
                    i3 = 1;
                }
                parcel2.writeInt(i3);
                return true;
            case 16:
                parcel.enforceInterface("com.google.android.gms.maps.model.internal.IMarkerDelegate");
                f = a(hqn.a(parcel.readStrongBinder()));
                parcel2.writeNoException();
                if (f) {
                    i3 = 1;
                }
                parcel2.writeInt(i3);
                return true;
            case wi.dK /*17*/:
                parcel.enforceInterface("com.google.android.gms.maps.model.internal.IMarkerDelegate");
                i3 = k();
                parcel2.writeNoException();
                parcel2.writeInt(i3);
                return true;
            case wi.dH /*18*/:
                parcel.enforceInterface("com.google.android.gms.maps.model.internal.IMarkerDelegate");
                a(gyk.a(parcel.readStrongBinder()));
                parcel2.writeNoException();
                return true;
            case wi.dL /*19*/:
                parcel.enforceInterface("com.google.android.gms.maps.model.internal.IMarkerDelegate");
                a(parcel.readFloat(), parcel.readFloat());
                parcel2.writeNoException();
                return true;
            case 20:
                parcel.enforceInterface("com.google.android.gms.maps.model.internal.IMarkerDelegate");
                if (parcel.readInt() != 0) {
                    z = true;
                }
                c(z);
                parcel2.writeNoException();
                return true;
            case 21:
                parcel.enforceInterface("com.google.android.gms.maps.model.internal.IMarkerDelegate");
                f = l();
                parcel2.writeNoException();
                if (f) {
                    i3 = 1;
                }
                parcel2.writeInt(i3);
                return true;
            case 22:
                parcel.enforceInterface("com.google.android.gms.maps.model.internal.IMarkerDelegate");
                a(parcel.readFloat());
                parcel2.writeNoException();
                return true;
            case wi.do /*23*/:
                parcel.enforceInterface("com.google.android.gms.maps.model.internal.IMarkerDelegate");
                m = m();
                parcel2.writeNoException();
                parcel2.writeFloat(m);
                return true;
            case wi.dA /*24*/:
                parcel.enforceInterface("com.google.android.gms.maps.model.internal.IMarkerDelegate");
                b(parcel.readFloat(), parcel.readFloat());
                parcel2.writeNoException();
                return true;
            case wi.dz /*25*/:
                parcel.enforceInterface("com.google.android.gms.maps.model.internal.IMarkerDelegate");
                b(parcel.readFloat());
                parcel2.writeNoException();
                return true;
            case wi.dx /*26*/:
                parcel.enforceInterface("com.google.android.gms.maps.model.internal.IMarkerDelegate");
                m = n();
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
