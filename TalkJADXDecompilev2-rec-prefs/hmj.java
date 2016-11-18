package p000;

import android.os.Binder;
import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;

public abstract class hmj extends Binder implements hmi {
    public boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) {
        IBinder iBinder = null;
        Bundle bundle;
        switch (i) {
            case 1:
                parcel.enforceInterface("com.google.android.gms.maps.internal.IStreetViewPanoramaViewDelegate");
                hmc a = mo2742a();
                parcel2.writeNoException();
                if (a != null) {
                    iBinder = a.asBinder();
                }
                parcel2.writeStrongBinder(iBinder);
                return true;
            case 2:
                parcel.enforceInterface("com.google.android.gms.maps.internal.IStreetViewPanoramaViewDelegate");
                if (parcel.readInt() != 0) {
                    bundle = (Bundle) Bundle.CREATOR.createFromParcel(parcel);
                }
                mo2743a(bundle);
                parcel2.writeNoException();
                return true;
            case 3:
                parcel.enforceInterface("com.google.android.gms.maps.internal.IStreetViewPanoramaViewDelegate");
                mo2745b();
                parcel2.writeNoException();
                return true;
            case 4:
                parcel.enforceInterface("com.google.android.gms.maps.internal.IStreetViewPanoramaViewDelegate");
                mo2747c();
                parcel2.writeNoException();
                return true;
            case 5:
                parcel.enforceInterface("com.google.android.gms.maps.internal.IStreetViewPanoramaViewDelegate");
                mo2748d();
                parcel2.writeNoException();
                return true;
            case 6:
                parcel.enforceInterface("com.google.android.gms.maps.internal.IStreetViewPanoramaViewDelegate");
                mo2749e();
                parcel2.writeNoException();
                return true;
            case 7:
                parcel.enforceInterface("com.google.android.gms.maps.internal.IStreetViewPanoramaViewDelegate");
                if (parcel.readInt() != 0) {
                    bundle = (Bundle) Bundle.CREATOR.createFromParcel(parcel);
                }
                mo2746b(bundle);
                parcel2.writeNoException();
                if (bundle != null) {
                    parcel2.writeInt(1);
                    bundle.writeToParcel(parcel2, 1);
                } else {
                    parcel2.writeInt(0);
                }
                return true;
            case 8:
                parcel.enforceInterface("com.google.android.gms.maps.internal.IStreetViewPanoramaViewDelegate");
                gyj f = mo2750f();
                parcel2.writeNoException();
                if (f != null) {
                    iBinder = f.asBinder();
                }
                parcel2.writeStrongBinder(iBinder);
                return true;
            case 9:
                parcel.enforceInterface("com.google.android.gms.maps.internal.IStreetViewPanoramaViewDelegate");
                mo2744a(hmp.m20354a(parcel.readStrongBinder()));
                parcel2.writeNoException();
                return true;
            case 1598968902:
                parcel2.writeString("com.google.android.gms.maps.internal.IStreetViewPanoramaViewDelegate");
                return true;
            default:
                return super.onTransact(i, parcel, parcel2, i2);
        }
    }
}
