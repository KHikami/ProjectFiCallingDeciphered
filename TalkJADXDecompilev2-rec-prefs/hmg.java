package p000;

import android.os.Binder;
import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;
import com.google.android.gms.maps.StreetViewPanoramaOptions;

public abstract class hmg extends Binder implements hmf {
    public boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) {
        IBinder iBinder = null;
        switch (i) {
            case 1:
                parcel.enforceInterface("com.google.android.gms.maps.internal.IStreetViewPanoramaFragmentDelegate");
                hmc a = mo2731a();
                parcel2.writeNoException();
                parcel2.writeStrongBinder(a != null ? a.asBinder() : null);
                return true;
            case 2:
                parcel.enforceInterface("com.google.android.gms.maps.internal.IStreetViewPanoramaFragmentDelegate");
                mo2733a(gyk.m18960a(parcel.readStrongBinder()), parcel.readInt() != 0 ? (StreetViewPanoramaOptions) StreetViewPanoramaOptions.CREATOR.createFromParcel(parcel) : null, parcel.readInt() != 0 ? (Bundle) Bundle.CREATOR.createFromParcel(parcel) : null);
                parcel2.writeNoException();
                return true;
            case 3:
                parcel.enforceInterface("com.google.android.gms.maps.internal.IStreetViewPanoramaFragmentDelegate");
                mo2732a(parcel.readInt() != 0 ? (Bundle) Bundle.CREATOR.createFromParcel(parcel) : null);
                parcel2.writeNoException();
                return true;
            case 4:
                parcel.enforceInterface("com.google.android.gms.maps.internal.IStreetViewPanoramaFragmentDelegate");
                gyj a2 = mo2730a(gyk.m18960a(parcel.readStrongBinder()), gyk.m18960a(parcel.readStrongBinder()), parcel.readInt() != 0 ? (Bundle) Bundle.CREATOR.createFromParcel(parcel) : null);
                parcel2.writeNoException();
                if (a2 != null) {
                    iBinder = a2.asBinder();
                }
                parcel2.writeStrongBinder(iBinder);
                return true;
            case 5:
                parcel.enforceInterface("com.google.android.gms.maps.internal.IStreetViewPanoramaFragmentDelegate");
                mo2735b();
                parcel2.writeNoException();
                return true;
            case 6:
                parcel.enforceInterface("com.google.android.gms.maps.internal.IStreetViewPanoramaFragmentDelegate");
                mo2737c();
                parcel2.writeNoException();
                return true;
            case 7:
                parcel.enforceInterface("com.google.android.gms.maps.internal.IStreetViewPanoramaFragmentDelegate");
                mo2738d();
                parcel2.writeNoException();
                return true;
            case 8:
                parcel.enforceInterface("com.google.android.gms.maps.internal.IStreetViewPanoramaFragmentDelegate");
                mo2739e();
                parcel2.writeNoException();
                return true;
            case 9:
                parcel.enforceInterface("com.google.android.gms.maps.internal.IStreetViewPanoramaFragmentDelegate");
                mo2740f();
                parcel2.writeNoException();
                return true;
            case 10:
                parcel.enforceInterface("com.google.android.gms.maps.internal.IStreetViewPanoramaFragmentDelegate");
                Bundle bundle = parcel.readInt() != 0 ? (Bundle) Bundle.CREATOR.createFromParcel(parcel) : null;
                mo2736b(bundle);
                parcel2.writeNoException();
                if (bundle != null) {
                    parcel2.writeInt(1);
                    bundle.writeToParcel(parcel2, 1);
                    return true;
                }
                parcel2.writeInt(0);
                return true;
            case 11:
                parcel.enforceInterface("com.google.android.gms.maps.internal.IStreetViewPanoramaFragmentDelegate");
                boolean g = mo2741g();
                parcel2.writeNoException();
                parcel2.writeInt(g ? 1 : 0);
                return true;
            case 12:
                parcel.enforceInterface("com.google.android.gms.maps.internal.IStreetViewPanoramaFragmentDelegate");
                mo2734a(hmp.m20354a(parcel.readStrongBinder()));
                parcel2.writeNoException();
                return true;
            case 1598968902:
                parcel2.writeString("com.google.android.gms.maps.internal.IStreetViewPanoramaFragmentDelegate");
                return true;
            default:
                return super.onTransact(i, parcel, parcel2, i2);
        }
    }
}
