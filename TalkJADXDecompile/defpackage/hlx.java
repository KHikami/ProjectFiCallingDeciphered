package defpackage;

import android.os.Binder;
import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;

/* renamed from: hlx */
public abstract class hlx extends Binder implements hlw {
    public boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) {
        Bundle bundle = null;
        IBinder asBinder;
        switch (i) {
            case wi.j /*1*/:
                parcel.enforceInterface("com.google.android.gms.maps.internal.IMapViewDelegate");
                hln a = a();
                parcel2.writeNoException();
                if (a != null) {
                    asBinder = a.asBinder();
                }
                parcel2.writeStrongBinder(asBinder);
                return true;
            case wi.l /*2*/:
                parcel.enforceInterface("com.google.android.gms.maps.internal.IMapViewDelegate");
                if (parcel.readInt() != 0) {
                    bundle = (Bundle) Bundle.CREATOR.createFromParcel(parcel);
                }
                a(bundle);
                parcel2.writeNoException();
                return true;
            case wi.z /*3*/:
                parcel.enforceInterface("com.google.android.gms.maps.internal.IMapViewDelegate");
                b();
                parcel2.writeNoException();
                return true;
            case wi.h /*4*/:
                parcel.enforceInterface("com.google.android.gms.maps.internal.IMapViewDelegate");
                c();
                parcel2.writeNoException();
                return true;
            case wi.p /*5*/:
                parcel.enforceInterface("com.google.android.gms.maps.internal.IMapViewDelegate");
                d();
                parcel2.writeNoException();
                return true;
            case wi.s /*6*/:
                parcel.enforceInterface("com.google.android.gms.maps.internal.IMapViewDelegate");
                e();
                parcel2.writeNoException();
                return true;
            case wi.q /*7*/:
                parcel.enforceInterface("com.google.android.gms.maps.internal.IMapViewDelegate");
                if (parcel.readInt() != 0) {
                    bundle = (Bundle) Bundle.CREATOR.createFromParcel(parcel);
                }
                b(bundle);
                parcel2.writeNoException();
                if (bundle != null) {
                    parcel2.writeInt(1);
                    bundle.writeToParcel(parcel2, 1);
                } else {
                    parcel2.writeInt(0);
                }
                return true;
            case wi.m /*8*/:
                parcel.enforceInterface("com.google.android.gms.maps.internal.IMapViewDelegate");
                gyj f = f();
                parcel2.writeNoException();
                if (f != null) {
                    asBinder = f.asBinder();
                }
                parcel2.writeStrongBinder(asBinder);
                return true;
            case wi.n /*9*/:
                parcel.enforceInterface("com.google.android.gms.maps.internal.IMapViewDelegate");
                a(hoj.a(parcel.readStrongBinder()));
                parcel2.writeNoException();
                return true;
            case wi.dr /*10*/:
                parcel.enforceInterface("com.google.android.gms.maps.internal.IMapViewDelegate");
                if (parcel.readInt() != 0) {
                    bundle = (Bundle) Bundle.CREATOR.createFromParcel(parcel);
                }
                c(bundle);
                parcel2.writeNoException();
                return true;
            case wi.dB /*11*/:
                parcel.enforceInterface("com.google.android.gms.maps.internal.IMapViewDelegate");
                g();
                parcel2.writeNoException();
                return true;
            case 1598968902:
                parcel2.writeString("com.google.android.gms.maps.internal.IMapViewDelegate");
                return true;
            default:
                return super.onTransact(i, parcel, parcel2, i2);
        }
    }
}
