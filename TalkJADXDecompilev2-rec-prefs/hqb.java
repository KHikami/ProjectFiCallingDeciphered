package p000;

import android.graphics.Bitmap;
import android.os.Binder;
import android.os.IBinder;
import android.os.Parcel;

public abstract class hqb extends Binder implements hqa {
    public boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) {
        IBinder iBinder = null;
        gyj a;
        switch (i) {
            case 1:
                parcel.enforceInterface("com.google.android.gms.maps.model.internal.IBitmapDescriptorFactoryDelegate");
                a = mo2829a(parcel.readInt());
                parcel2.writeNoException();
                parcel2.writeStrongBinder(a != null ? a.asBinder() : null);
                return true;
            case 2:
                parcel.enforceInterface("com.google.android.gms.maps.model.internal.IBitmapDescriptorFactoryDelegate");
                a = mo2831a(parcel.readString());
                parcel2.writeNoException();
                if (a != null) {
                    iBinder = a.asBinder();
                }
                parcel2.writeStrongBinder(iBinder);
                return true;
            case 3:
                parcel.enforceInterface("com.google.android.gms.maps.model.internal.IBitmapDescriptorFactoryDelegate");
                a = mo2832b(parcel.readString());
                parcel2.writeNoException();
                if (a != null) {
                    iBinder = a.asBinder();
                }
                parcel2.writeStrongBinder(iBinder);
                return true;
            case 4:
                parcel.enforceInterface("com.google.android.gms.maps.model.internal.IBitmapDescriptorFactoryDelegate");
                a = mo2827a();
                parcel2.writeNoException();
                if (a != null) {
                    iBinder = a.asBinder();
                }
                parcel2.writeStrongBinder(iBinder);
                return true;
            case 5:
                parcel.enforceInterface("com.google.android.gms.maps.model.internal.IBitmapDescriptorFactoryDelegate");
                a = mo2828a(parcel.readFloat());
                parcel2.writeNoException();
                if (a != null) {
                    iBinder = a.asBinder();
                }
                parcel2.writeStrongBinder(iBinder);
                return true;
            case 6:
                parcel.enforceInterface("com.google.android.gms.maps.model.internal.IBitmapDescriptorFactoryDelegate");
                a = mo2830a(parcel.readInt() != 0 ? (Bitmap) Bitmap.CREATOR.createFromParcel(parcel) : null);
                parcel2.writeNoException();
                if (a != null) {
                    iBinder = a.asBinder();
                }
                parcel2.writeStrongBinder(iBinder);
                return true;
            case 7:
                parcel.enforceInterface("com.google.android.gms.maps.model.internal.IBitmapDescriptorFactoryDelegate");
                a = mo2833c(parcel.readString());
                parcel2.writeNoException();
                if (a != null) {
                    iBinder = a.asBinder();
                }
                parcel2.writeStrongBinder(iBinder);
                return true;
            case 1598968902:
                parcel2.writeString("com.google.android.gms.maps.model.internal.IBitmapDescriptorFactoryDelegate");
                return true;
            default:
                return super.onTransact(i, parcel, parcel2, i2);
        }
    }
}
