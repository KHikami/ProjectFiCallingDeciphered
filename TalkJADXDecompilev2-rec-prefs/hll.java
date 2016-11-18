package p000;

import android.os.Binder;
import android.os.IBinder;
import android.os.Parcel;
import com.google.android.gms.maps.model.CameraPosition;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.LatLngBounds;

public abstract class hll extends Binder implements hlk {
    public boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) {
        IBinder iBinder = null;
        gyj a;
        switch (i) {
            case 1:
                parcel.enforceInterface("com.google.android.gms.maps.internal.ICameraUpdateFactoryDelegate");
                a = mo2609a();
                parcel2.writeNoException();
                parcel2.writeStrongBinder(a != null ? a.asBinder() : null);
                return true;
            case 2:
                parcel.enforceInterface("com.google.android.gms.maps.internal.ICameraUpdateFactoryDelegate");
                a = mo2618b();
                parcel2.writeNoException();
                if (a != null) {
                    iBinder = a.asBinder();
                }
                parcel2.writeStrongBinder(iBinder);
                return true;
            case 3:
                parcel.enforceInterface("com.google.android.gms.maps.internal.ICameraUpdateFactoryDelegate");
                a = mo2611a(parcel.readFloat(), parcel.readFloat());
                parcel2.writeNoException();
                if (a != null) {
                    iBinder = a.asBinder();
                }
                parcel2.writeStrongBinder(iBinder);
                return true;
            case 4:
                parcel.enforceInterface("com.google.android.gms.maps.internal.ICameraUpdateFactoryDelegate");
                a = mo2610a(parcel.readFloat());
                parcel2.writeNoException();
                if (a != null) {
                    iBinder = a.asBinder();
                }
                parcel2.writeStrongBinder(iBinder);
                return true;
            case 5:
                parcel.enforceInterface("com.google.android.gms.maps.internal.ICameraUpdateFactoryDelegate");
                a = mo2619b(parcel.readFloat());
                parcel2.writeNoException();
                if (a != null) {
                    iBinder = a.asBinder();
                }
                parcel2.writeStrongBinder(iBinder);
                return true;
            case 6:
                parcel.enforceInterface("com.google.android.gms.maps.internal.ICameraUpdateFactoryDelegate");
                a = mo2612a(parcel.readFloat(), parcel.readInt(), parcel.readInt());
                parcel2.writeNoException();
                if (a != null) {
                    iBinder = a.asBinder();
                }
                parcel2.writeStrongBinder(iBinder);
                return true;
            case 7:
                parcel.enforceInterface("com.google.android.gms.maps.internal.ICameraUpdateFactoryDelegate");
                a = mo2613a(parcel.readInt() != 0 ? (CameraPosition) CameraPosition.CREATOR.createFromParcel(parcel) : null);
                parcel2.writeNoException();
                if (a != null) {
                    iBinder = a.asBinder();
                }
                parcel2.writeStrongBinder(iBinder);
                return true;
            case 8:
                parcel.enforceInterface("com.google.android.gms.maps.internal.ICameraUpdateFactoryDelegate");
                a = mo2614a(parcel.readInt() != 0 ? (LatLng) LatLng.CREATOR.createFromParcel(parcel) : null);
                parcel2.writeNoException();
                if (a != null) {
                    iBinder = a.asBinder();
                }
                parcel2.writeStrongBinder(iBinder);
                return true;
            case 9:
                parcel.enforceInterface("com.google.android.gms.maps.internal.ICameraUpdateFactoryDelegate");
                a = mo2615a(parcel.readInt() != 0 ? (LatLng) LatLng.CREATOR.createFromParcel(parcel) : null, parcel.readFloat());
                parcel2.writeNoException();
                if (a != null) {
                    iBinder = a.asBinder();
                }
                parcel2.writeStrongBinder(iBinder);
                return true;
            case 10:
                parcel.enforceInterface("com.google.android.gms.maps.internal.ICameraUpdateFactoryDelegate");
                a = mo2616a(parcel.readInt() != 0 ? (LatLngBounds) LatLngBounds.CREATOR.createFromParcel(parcel) : null, parcel.readInt());
                parcel2.writeNoException();
                if (a != null) {
                    iBinder = a.asBinder();
                }
                parcel2.writeStrongBinder(iBinder);
                return true;
            case 11:
                parcel.enforceInterface("com.google.android.gms.maps.internal.ICameraUpdateFactoryDelegate");
                a = mo2617a(parcel.readInt() != 0 ? (LatLngBounds) LatLngBounds.CREATOR.createFromParcel(parcel) : null, parcel.readInt(), parcel.readInt(), parcel.readInt());
                parcel2.writeNoException();
                if (a != null) {
                    iBinder = a.asBinder();
                }
                parcel2.writeStrongBinder(iBinder);
                return true;
            case 1598968902:
                parcel2.writeString("com.google.android.gms.maps.internal.ICameraUpdateFactoryDelegate");
                return true;
            default:
                return super.onTransact(i, parcel, parcel2, i2);
        }
    }
}
