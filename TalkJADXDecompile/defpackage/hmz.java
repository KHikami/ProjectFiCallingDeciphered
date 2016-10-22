package defpackage;

import android.os.Binder;
import android.os.IBinder;
import android.os.Parcel;
import com.google.android.gms.maps.GoogleMapOptions;
import com.google.android.gms.maps.StreetViewPanoramaOptions;

/* renamed from: hmz */
public abstract class hmz extends Binder implements hmy {
    public boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) {
        IBinder iBinder = null;
        switch (i) {
            case wi.j /*1*/:
                parcel.enforceInterface("com.google.android.gms.maps.internal.ICreator");
                a(gyk.a(parcel.readStrongBinder()));
                parcel2.writeNoException();
                return true;
            case wi.l /*2*/:
                parcel.enforceInterface("com.google.android.gms.maps.internal.ICreator");
                hlt b = b(gyk.a(parcel.readStrongBinder()));
                parcel2.writeNoException();
                parcel2.writeStrongBinder(b != null ? b.asBinder() : null);
                return true;
            case wi.z /*3*/:
                parcel.enforceInterface("com.google.android.gms.maps.internal.ICreator");
                hlw a = a(gyk.a(parcel.readStrongBinder()), parcel.readInt() != 0 ? (GoogleMapOptions) GoogleMapOptions.CREATOR.createFromParcel(parcel) : null);
                parcel2.writeNoException();
                if (a != null) {
                    iBinder = a.asBinder();
                }
                parcel2.writeStrongBinder(iBinder);
                return true;
            case wi.h /*4*/:
                parcel.enforceInterface("com.google.android.gms.maps.internal.ICreator");
                hlk a2 = a();
                parcel2.writeNoException();
                if (a2 != null) {
                    iBinder = a2.asBinder();
                }
                parcel2.writeStrongBinder(iBinder);
                return true;
            case wi.p /*5*/:
                parcel.enforceInterface("com.google.android.gms.maps.internal.ICreator");
                hqa b2 = b();
                parcel2.writeNoException();
                if (b2 != null) {
                    iBinder = b2.asBinder();
                }
                parcel2.writeStrongBinder(iBinder);
                return true;
            case wi.s /*6*/:
                parcel.enforceInterface("com.google.android.gms.maps.internal.ICreator");
                a(gyk.a(parcel.readStrongBinder()), parcel.readInt());
                parcel2.writeNoException();
                return true;
            case wi.q /*7*/:
                parcel.enforceInterface("com.google.android.gms.maps.internal.ICreator");
                hmi a3 = a(gyk.a(parcel.readStrongBinder()), parcel.readInt() != 0 ? (StreetViewPanoramaOptions) StreetViewPanoramaOptions.CREATOR.createFromParcel(parcel) : null);
                parcel2.writeNoException();
                if (a3 != null) {
                    iBinder = a3.asBinder();
                }
                parcel2.writeStrongBinder(iBinder);
                return true;
            case wi.m /*8*/:
                parcel.enforceInterface("com.google.android.gms.maps.internal.ICreator");
                hmf c = c(gyk.a(parcel.readStrongBinder()));
                parcel2.writeNoException();
                if (c != null) {
                    iBinder = c.asBinder();
                }
                parcel2.writeStrongBinder(iBinder);
                return true;
            case 1598968902:
                parcel2.writeString("com.google.android.gms.maps.internal.ICreator");
                return true;
            default:
                return super.onTransact(i, parcel, parcel2, i2);
        }
    }
}
