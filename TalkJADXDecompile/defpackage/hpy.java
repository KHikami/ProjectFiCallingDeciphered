package defpackage;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.google.android.gms.maps.model.LatLng;
import java.util.List;

/* renamed from: hpy */
public abstract class hpy extends Binder implements hpx {
    public static hpx a(IBinder iBinder) {
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
            case wi.j /*1*/:
                parcel.enforceInterface("com.google.android.gms.maps.model.internal.IPolylineDelegate");
                a();
                parcel2.writeNoException();
                return true;
            case wi.l /*2*/:
                parcel.enforceInterface("com.google.android.gms.maps.model.internal.IPolylineDelegate");
                String b = b();
                parcel2.writeNoException();
                parcel2.writeString(b);
                return true;
            case wi.z /*3*/:
                parcel.enforceInterface("com.google.android.gms.maps.model.internal.IPolylineDelegate");
                a(parcel.createTypedArrayList(LatLng.CREATOR));
                parcel2.writeNoException();
                return true;
            case wi.h /*4*/:
                parcel.enforceInterface("com.google.android.gms.maps.model.internal.IPolylineDelegate");
                List c = c();
                parcel2.writeNoException();
                parcel2.writeTypedList(c);
                return true;
            case wi.p /*5*/:
                parcel.enforceInterface("com.google.android.gms.maps.model.internal.IPolylineDelegate");
                a(parcel.readFloat());
                parcel2.writeNoException();
                return true;
            case wi.s /*6*/:
                parcel.enforceInterface("com.google.android.gms.maps.model.internal.IPolylineDelegate");
                d = d();
                parcel2.writeNoException();
                parcel2.writeFloat(d);
                return true;
            case wi.q /*7*/:
                parcel.enforceInterface("com.google.android.gms.maps.model.internal.IPolylineDelegate");
                a(parcel.readInt());
                parcel2.writeNoException();
                return true;
            case wi.m /*8*/:
                parcel.enforceInterface("com.google.android.gms.maps.model.internal.IPolylineDelegate");
                i3 = e();
                parcel2.writeNoException();
                parcel2.writeInt(i3);
                return true;
            case wi.n /*9*/:
                parcel.enforceInterface("com.google.android.gms.maps.model.internal.IPolylineDelegate");
                b(parcel.readFloat());
                parcel2.writeNoException();
                return true;
            case wi.dr /*10*/:
                parcel.enforceInterface("com.google.android.gms.maps.model.internal.IPolylineDelegate");
                d = f();
                parcel2.writeNoException();
                parcel2.writeFloat(d);
                return true;
            case wi.dB /*11*/:
                parcel.enforceInterface("com.google.android.gms.maps.model.internal.IPolylineDelegate");
                if (parcel.readInt() != 0) {
                    z = true;
                }
                a(z);
                parcel2.writeNoException();
                return true;
            case wi.dM /*12*/:
                parcel.enforceInterface("com.google.android.gms.maps.model.internal.IPolylineDelegate");
                g = g();
                parcel2.writeNoException();
                if (g) {
                    i3 = 1;
                }
                parcel2.writeInt(i3);
                return true;
            case wi.dD /*13*/:
                parcel.enforceInterface("com.google.android.gms.maps.model.internal.IPolylineDelegate");
                if (parcel.readInt() != 0) {
                    z = true;
                }
                b(z);
                parcel2.writeNoException();
                return true;
            case wi.g /*14*/:
                parcel.enforceInterface("com.google.android.gms.maps.model.internal.IPolylineDelegate");
                g = h();
                parcel2.writeNoException();
                if (g) {
                    i3 = 1;
                }
                parcel2.writeInt(i3);
                return true;
            case wi.dJ /*15*/:
                parcel.enforceInterface("com.google.android.gms.maps.model.internal.IPolylineDelegate");
                g = a(hpy.a(parcel.readStrongBinder()));
                parcel2.writeNoException();
                if (g) {
                    i3 = 1;
                }
                parcel2.writeInt(i3);
                return true;
            case wi.dI /*16*/:
                parcel.enforceInterface("com.google.android.gms.maps.model.internal.IPolylineDelegate");
                i3 = i();
                parcel2.writeNoException();
                parcel2.writeInt(i3);
                return true;
            case wi.dK /*17*/:
                parcel.enforceInterface("com.google.android.gms.maps.model.internal.IPolylineDelegate");
                if (parcel.readInt() != 0) {
                    z = true;
                }
                c(z);
                parcel2.writeNoException();
                return true;
            case wi.dH /*18*/:
                parcel.enforceInterface("com.google.android.gms.maps.model.internal.IPolylineDelegate");
                g = j();
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
