import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.google.android.gms.maps.model.LatLng;
import java.util.List;

public abstract class hqq extends Binder implements hqp {
    public static hqp a(IBinder iBinder) {
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
            case wi.j /*1*/:
                parcel.enforceInterface("com.google.android.gms.maps.model.internal.IPolygonDelegate");
                a();
                parcel2.writeNoException();
                return true;
            case wi.l /*2*/:
                parcel.enforceInterface("com.google.android.gms.maps.model.internal.IPolygonDelegate");
                String b = b();
                parcel2.writeNoException();
                parcel2.writeString(b);
                return true;
            case wi.z /*3*/:
                parcel.enforceInterface("com.google.android.gms.maps.model.internal.IPolygonDelegate");
                a(parcel.createTypedArrayList(LatLng.CREATOR));
                parcel2.writeNoException();
                return true;
            case wi.h /*4*/:
                parcel.enforceInterface("com.google.android.gms.maps.model.internal.IPolygonDelegate");
                c = c();
                parcel2.writeNoException();
                parcel2.writeTypedList(c);
                return true;
            case wi.p /*5*/:
                parcel.enforceInterface("com.google.android.gms.maps.model.internal.IPolygonDelegate");
                b(parcel.readArrayList(getClass().getClassLoader()));
                parcel2.writeNoException();
                return true;
            case wi.s /*6*/:
                parcel.enforceInterface("com.google.android.gms.maps.model.internal.IPolygonDelegate");
                c = d();
                parcel2.writeNoException();
                parcel2.writeList(c);
                return true;
            case wi.q /*7*/:
                parcel.enforceInterface("com.google.android.gms.maps.model.internal.IPolygonDelegate");
                a(parcel.readFloat());
                parcel2.writeNoException();
                return true;
            case wi.m /*8*/:
                parcel.enforceInterface("com.google.android.gms.maps.model.internal.IPolygonDelegate");
                e = e();
                parcel2.writeNoException();
                parcel2.writeFloat(e);
                return true;
            case wi.n /*9*/:
                parcel.enforceInterface("com.google.android.gms.maps.model.internal.IPolygonDelegate");
                a(parcel.readInt());
                parcel2.writeNoException();
                return true;
            case wi.dr /*10*/:
                parcel.enforceInterface("com.google.android.gms.maps.model.internal.IPolygonDelegate");
                i3 = f();
                parcel2.writeNoException();
                parcel2.writeInt(i3);
                return true;
            case wi.dB /*11*/:
                parcel.enforceInterface("com.google.android.gms.maps.model.internal.IPolygonDelegate");
                b(parcel.readInt());
                parcel2.writeNoException();
                return true;
            case wi.dM /*12*/:
                parcel.enforceInterface("com.google.android.gms.maps.model.internal.IPolygonDelegate");
                i3 = g();
                parcel2.writeNoException();
                parcel2.writeInt(i3);
                return true;
            case wi.dD /*13*/:
                parcel.enforceInterface("com.google.android.gms.maps.model.internal.IPolygonDelegate");
                b(parcel.readFloat());
                parcel2.writeNoException();
                return true;
            case wi.g /*14*/:
                parcel.enforceInterface("com.google.android.gms.maps.model.internal.IPolygonDelegate");
                e = h();
                parcel2.writeNoException();
                parcel2.writeFloat(e);
                return true;
            case wi.dJ /*15*/:
                parcel.enforceInterface("com.google.android.gms.maps.model.internal.IPolygonDelegate");
                if (parcel.readInt() != 0) {
                    z = true;
                }
                a(z);
                parcel2.writeNoException();
                return true;
            case wi.dI /*16*/:
                parcel.enforceInterface("com.google.android.gms.maps.model.internal.IPolygonDelegate");
                i4 = i();
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
                b(z);
                parcel2.writeNoException();
                return true;
            case wi.dH /*18*/:
                parcel.enforceInterface("com.google.android.gms.maps.model.internal.IPolygonDelegate");
                i4 = j();
                parcel2.writeNoException();
                if (i4) {
                    i3 = 1;
                }
                parcel2.writeInt(i3);
                return true;
            case wi.dL /*19*/:
                parcel.enforceInterface("com.google.android.gms.maps.model.internal.IPolygonDelegate");
                i4 = a(a(parcel.readStrongBinder()));
                parcel2.writeNoException();
                if (i4) {
                    i3 = 1;
                }
                parcel2.writeInt(i3);
                return true;
            case wi.k /*20*/:
                parcel.enforceInterface("com.google.android.gms.maps.model.internal.IPolygonDelegate");
                i3 = k();
                parcel2.writeNoException();
                parcel2.writeInt(i3);
                return true;
            case wi.f /*21*/:
                parcel.enforceInterface("com.google.android.gms.maps.model.internal.IPolygonDelegate");
                if (parcel.readInt() != 0) {
                    z = true;
                }
                c(z);
                parcel2.writeNoException();
                return true;
            case wi.e /*22*/:
                parcel.enforceInterface("com.google.android.gms.maps.model.internal.IPolygonDelegate");
                i4 = l();
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
