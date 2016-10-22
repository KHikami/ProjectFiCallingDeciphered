import android.os.Binder;
import android.os.IBinder;
import android.os.Parcel;

public abstract class gxf extends Binder implements gxe {
    public boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) {
        IBinder iBinder = null;
        gyj a;
        switch (i) {
            case wi.j /*1*/:
                parcel.enforceInterface("com.google.android.gms.common.internal.IGoogleCertificatesApi");
                a = a();
                parcel2.writeNoException();
                if (a != null) {
                    iBinder = a.asBinder();
                }
                parcel2.writeStrongBinder(iBinder);
                return true;
            case wi.l /*2*/:
                parcel.enforceInterface("com.google.android.gms.common.internal.IGoogleCertificatesApi");
                a = b();
                parcel2.writeNoException();
                if (a != null) {
                    iBinder = a.asBinder();
                }
                parcel2.writeStrongBinder(iBinder);
                return true;
            case 1598968902:
                parcel2.writeString("com.google.android.gms.common.internal.IGoogleCertificatesApi");
                return true;
            default:
                return super.onTransact(i, parcel, parcel2, i2);
        }
    }
}
