package p000;

import android.os.Binder;
import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;
import com.google.android.gms.maps.GoogleMapOptions;

public abstract class hlu extends Binder implements hlt {
    public boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) {
        IBinder iBinder = null;
        switch (i) {
            case 1:
                parcel.enforceInterface("com.google.android.gms.maps.internal.IMapFragmentDelegate");
                hln a = mo2683a();
                parcel2.writeNoException();
                parcel2.writeStrongBinder(a != null ? a.asBinder() : null);
                return true;
            case 2:
                parcel.enforceInterface("com.google.android.gms.maps.internal.IMapFragmentDelegate");
                mo2685a(gyk.m18960a(parcel.readStrongBinder()), parcel.readInt() != 0 ? (GoogleMapOptions) GoogleMapOptions.CREATOR.createFromParcel(parcel) : null, parcel.readInt() != 0 ? (Bundle) Bundle.CREATOR.createFromParcel(parcel) : null);
                parcel2.writeNoException();
                return true;
            case 3:
                parcel.enforceInterface("com.google.android.gms.maps.internal.IMapFragmentDelegate");
                mo2684a(parcel.readInt() != 0 ? (Bundle) Bundle.CREATOR.createFromParcel(parcel) : null);
                parcel2.writeNoException();
                return true;
            case 4:
                parcel.enforceInterface("com.google.android.gms.maps.internal.IMapFragmentDelegate");
                gyj a2 = mo2682a(gyk.m18960a(parcel.readStrongBinder()), gyk.m18960a(parcel.readStrongBinder()), parcel.readInt() != 0 ? (Bundle) Bundle.CREATOR.createFromParcel(parcel) : null);
                parcel2.writeNoException();
                if (a2 != null) {
                    iBinder = a2.asBinder();
                }
                parcel2.writeStrongBinder(iBinder);
                return true;
            case 5:
                parcel.enforceInterface("com.google.android.gms.maps.internal.IMapFragmentDelegate");
                mo2687b();
                parcel2.writeNoException();
                return true;
            case 6:
                parcel.enforceInterface("com.google.android.gms.maps.internal.IMapFragmentDelegate");
                mo2689c();
                parcel2.writeNoException();
                return true;
            case 7:
                parcel.enforceInterface("com.google.android.gms.maps.internal.IMapFragmentDelegate");
                mo2691d();
                parcel2.writeNoException();
                return true;
            case 8:
                parcel.enforceInterface("com.google.android.gms.maps.internal.IMapFragmentDelegate");
                mo2692e();
                parcel2.writeNoException();
                return true;
            case 9:
                parcel.enforceInterface("com.google.android.gms.maps.internal.IMapFragmentDelegate");
                mo2693f();
                parcel2.writeNoException();
                return true;
            case 10:
                parcel.enforceInterface("com.google.android.gms.maps.internal.IMapFragmentDelegate");
                Bundle bundle = parcel.readInt() != 0 ? (Bundle) Bundle.CREATOR.createFromParcel(parcel) : null;
                mo2688b(bundle);
                parcel2.writeNoException();
                if (bundle != null) {
                    parcel2.writeInt(1);
                    bundle.writeToParcel(parcel2, 1);
                    return true;
                }
                parcel2.writeInt(0);
                return true;
            case 11:
                parcel.enforceInterface("com.google.android.gms.maps.internal.IMapFragmentDelegate");
                boolean g = mo2694g();
                parcel2.writeNoException();
                parcel2.writeInt(g ? 1 : 0);
                return true;
            case 12:
                parcel.enforceInterface("com.google.android.gms.maps.internal.IMapFragmentDelegate");
                mo2686a(hoj.m20022a(parcel.readStrongBinder()));
                parcel2.writeNoException();
                return true;
            case 13:
                parcel.enforceInterface("com.google.android.gms.maps.internal.IMapFragmentDelegate");
                mo2690c(parcel.readInt() != 0 ? (Bundle) Bundle.CREATOR.createFromParcel(parcel) : null);
                parcel2.writeNoException();
                return true;
            case 14:
                parcel.enforceInterface("com.google.android.gms.maps.internal.IMapFragmentDelegate");
                mo2695h();
                parcel2.writeNoException();
                return true;
            case 1598968902:
                parcel2.writeString("com.google.android.gms.maps.internal.IMapFragmentDelegate");
                return true;
            default:
                return super.onTransact(i, parcel, parcel2, i2);
        }
    }
}
