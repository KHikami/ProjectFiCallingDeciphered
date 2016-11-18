package p000;

import android.os.Binder;
import android.os.Bundle;
import android.os.Parcel;
import com.google.android.gms.common.internal.GetServiceRequest;
import com.google.android.gms.common.internal.ValidateAccountRequest;

public abstract class gxc extends Binder implements gxb {
    public boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) {
        ValidateAccountRequest validateAccountRequest = null;
        gwy a;
        int readInt;
        String readString;
        Bundle bundle;
        switch (i) {
            case 1:
                parcel.enforceInterface("com.google.android.gms.common.internal.IGmsServiceBroker");
                mo2373a(gwz.m18740a(parcel.readStrongBinder()), parcel.readInt(), parcel.readString(), parcel.readString(), parcel.createStringArray(), parcel.readString(), parcel.readInt() != 0 ? (Bundle) Bundle.CREATOR.createFromParcel(parcel) : null);
                parcel2.writeNoException();
                return true;
            case 2:
                parcel.enforceInterface("com.google.android.gms.common.internal.IGmsServiceBroker");
                a = gwz.m18740a(parcel.readStrongBinder());
                readInt = parcel.readInt();
                readString = parcel.readString();
                if (parcel.readInt() != 0) {
                    bundle = (Bundle) Bundle.CREATOR.createFromParcel(parcel);
                }
                mo2367a(a, readInt, readString, bundle);
                parcel2.writeNoException();
                return true;
            case 3:
                parcel.enforceInterface("com.google.android.gms.common.internal.IGmsServiceBroker");
                mo2366a(gwz.m18740a(parcel.readStrongBinder()), parcel.readInt(), parcel.readString());
                parcel2.writeNoException();
                return true;
            case 4:
                parcel.enforceInterface("com.google.android.gms.common.internal.IGmsServiceBroker");
                mo2365a(gwz.m18740a(parcel.readStrongBinder()), parcel.readInt());
                parcel2.writeNoException();
                return true;
            case 5:
                parcel.enforceInterface("com.google.android.gms.common.internal.IGmsServiceBroker");
                a = gwz.m18740a(parcel.readStrongBinder());
                readInt = parcel.readInt();
                readString = parcel.readString();
                if (parcel.readInt() != 0) {
                    bundle = (Bundle) Bundle.CREATOR.createFromParcel(parcel);
                }
                mo2379b(a, readInt, readString, bundle);
                parcel2.writeNoException();
                return true;
            case 6:
                parcel.enforceInterface("com.google.android.gms.common.internal.IGmsServiceBroker");
                a = gwz.m18740a(parcel.readStrongBinder());
                readInt = parcel.readInt();
                readString = parcel.readString();
                if (parcel.readInt() != 0) {
                    bundle = (Bundle) Bundle.CREATOR.createFromParcel(parcel);
                }
                mo2381c(a, readInt, readString, bundle);
                parcel2.writeNoException();
                return true;
            case 7:
                parcel.enforceInterface("com.google.android.gms.common.internal.IGmsServiceBroker");
                a = gwz.m18740a(parcel.readStrongBinder());
                readInt = parcel.readInt();
                readString = parcel.readString();
                if (parcel.readInt() != 0) {
                    bundle = (Bundle) Bundle.CREATOR.createFromParcel(parcel);
                }
                mo2383d(a, readInt, readString, bundle);
                parcel2.writeNoException();
                return true;
            case 8:
                parcel.enforceInterface("com.google.android.gms.common.internal.IGmsServiceBroker");
                a = gwz.m18740a(parcel.readStrongBinder());
                readInt = parcel.readInt();
                readString = parcel.readString();
                if (parcel.readInt() != 0) {
                    bundle = (Bundle) Bundle.CREATOR.createFromParcel(parcel);
                }
                mo2385e(a, readInt, readString, bundle);
                parcel2.writeNoException();
                return true;
            case 9:
                parcel.enforceInterface("com.google.android.gms.common.internal.IGmsServiceBroker");
                mo2374a(gwz.m18740a(parcel.readStrongBinder()), parcel.readInt(), parcel.readString(), parcel.readString(), parcel.createStringArray(), parcel.readString(), parcel.readStrongBinder(), parcel.readString(), parcel.readInt() != 0 ? (Bundle) Bundle.CREATOR.createFromParcel(parcel) : null);
                parcel2.writeNoException();
                return true;
            case 10:
                parcel.enforceInterface("com.google.android.gms.common.internal.IGmsServiceBroker");
                mo2371a(gwz.m18740a(parcel.readStrongBinder()), parcel.readInt(), parcel.readString(), parcel.readString(), parcel.createStringArray());
                parcel2.writeNoException();
                return true;
            case 11:
                parcel.enforceInterface("com.google.android.gms.common.internal.IGmsServiceBroker");
                a = gwz.m18740a(parcel.readStrongBinder());
                readInt = parcel.readInt();
                readString = parcel.readString();
                if (parcel.readInt() != 0) {
                    bundle = (Bundle) Bundle.CREATOR.createFromParcel(parcel);
                }
                mo2387f(a, readInt, readString, bundle);
                parcel2.writeNoException();
                return true;
            case 12:
                parcel.enforceInterface("com.google.android.gms.common.internal.IGmsServiceBroker");
                a = gwz.m18740a(parcel.readStrongBinder());
                readInt = parcel.readInt();
                readString = parcel.readString();
                if (parcel.readInt() != 0) {
                    bundle = (Bundle) Bundle.CREATOR.createFromParcel(parcel);
                }
                mo2389g(a, readInt, readString, bundle);
                parcel2.writeNoException();
                return true;
            case 13:
                parcel.enforceInterface("com.google.android.gms.common.internal.IGmsServiceBroker");
                a = gwz.m18740a(parcel.readStrongBinder());
                readInt = parcel.readInt();
                readString = parcel.readString();
                if (parcel.readInt() != 0) {
                    bundle = (Bundle) Bundle.CREATOR.createFromParcel(parcel);
                }
                mo2391h(a, readInt, readString, bundle);
                parcel2.writeNoException();
                return true;
            case 14:
                parcel.enforceInterface("com.google.android.gms.common.internal.IGmsServiceBroker");
                a = gwz.m18740a(parcel.readStrongBinder());
                readInt = parcel.readInt();
                readString = parcel.readString();
                if (parcel.readInt() != 0) {
                    bundle = (Bundle) Bundle.CREATOR.createFromParcel(parcel);
                }
                mo2393i(a, readInt, readString, bundle);
                parcel2.writeNoException();
                return true;
            case 15:
                parcel.enforceInterface("com.google.android.gms.common.internal.IGmsServiceBroker");
                a = gwz.m18740a(parcel.readStrongBinder());
                readInt = parcel.readInt();
                readString = parcel.readString();
                if (parcel.readInt() != 0) {
                    bundle = (Bundle) Bundle.CREATOR.createFromParcel(parcel);
                }
                mo2395j(a, readInt, readString, bundle);
                parcel2.writeNoException();
                return true;
            case 16:
                parcel.enforceInterface("com.google.android.gms.common.internal.IGmsServiceBroker");
                a = gwz.m18740a(parcel.readStrongBinder());
                readInt = parcel.readInt();
                readString = parcel.readString();
                if (parcel.readInt() != 0) {
                    bundle = (Bundle) Bundle.CREATOR.createFromParcel(parcel);
                }
                mo2397k(a, readInt, readString, bundle);
                parcel2.writeNoException();
                return true;
            case wi.dK /*17*/:
                parcel.enforceInterface("com.google.android.gms.common.internal.IGmsServiceBroker");
                a = gwz.m18740a(parcel.readStrongBinder());
                readInt = parcel.readInt();
                readString = parcel.readString();
                if (parcel.readInt() != 0) {
                    bundle = (Bundle) Bundle.CREATOR.createFromParcel(parcel);
                }
                mo2399l(a, readInt, readString, bundle);
                parcel2.writeNoException();
                return true;
            case wi.dH /*18*/:
                parcel.enforceInterface("com.google.android.gms.common.internal.IGmsServiceBroker");
                a = gwz.m18740a(parcel.readStrongBinder());
                readInt = parcel.readInt();
                readString = parcel.readString();
                if (parcel.readInt() != 0) {
                    bundle = (Bundle) Bundle.CREATOR.createFromParcel(parcel);
                }
                mo2401m(a, readInt, readString, bundle);
                parcel2.writeNoException();
                return true;
            case wi.dL /*19*/:
                parcel.enforceInterface("com.google.android.gms.common.internal.IGmsServiceBroker");
                mo2368a(gwz.m18740a(parcel.readStrongBinder()), parcel.readInt(), parcel.readString(), parcel.readStrongBinder(), parcel.readInt() != 0 ? (Bundle) Bundle.CREATOR.createFromParcel(parcel) : null);
                parcel2.writeNoException();
                return true;
            case 20:
                parcel.enforceInterface("com.google.android.gms.common.internal.IGmsServiceBroker");
                mo2375a(gwz.m18740a(parcel.readStrongBinder()), parcel.readInt(), parcel.readString(), parcel.createStringArray(), parcel.readString(), parcel.readInt() != 0 ? (Bundle) Bundle.CREATOR.createFromParcel(parcel) : null);
                parcel2.writeNoException();
                return true;
            case 21:
                parcel.enforceInterface("com.google.android.gms.common.internal.IGmsServiceBroker");
                mo2378b(gwz.m18740a(parcel.readStrongBinder()), parcel.readInt(), parcel.readString());
                parcel2.writeNoException();
                return true;
            case 22:
                parcel.enforceInterface("com.google.android.gms.common.internal.IGmsServiceBroker");
                mo2380c(gwz.m18740a(parcel.readStrongBinder()), parcel.readInt(), parcel.readString());
                parcel2.writeNoException();
                return true;
            case wi.f29038do /*23*/:
                parcel.enforceInterface("com.google.android.gms.common.internal.IGmsServiceBroker");
                a = gwz.m18740a(parcel.readStrongBinder());
                readInt = parcel.readInt();
                readString = parcel.readString();
                if (parcel.readInt() != 0) {
                    bundle = (Bundle) Bundle.CREATOR.createFromParcel(parcel);
                }
                mo2402n(a, readInt, readString, bundle);
                parcel2.writeNoException();
                return true;
            case wi.dA /*24*/:
                parcel.enforceInterface("com.google.android.gms.common.internal.IGmsServiceBroker");
                mo2382d(gwz.m18740a(parcel.readStrongBinder()), parcel.readInt(), parcel.readString());
                parcel2.writeNoException();
                return true;
            case wi.dz /*25*/:
                parcel.enforceInterface("com.google.android.gms.common.internal.IGmsServiceBroker");
                a = gwz.m18740a(parcel.readStrongBinder());
                readInt = parcel.readInt();
                readString = parcel.readString();
                if (parcel.readInt() != 0) {
                    bundle = (Bundle) Bundle.CREATOR.createFromParcel(parcel);
                }
                mo2403o(a, readInt, readString, bundle);
                parcel2.writeNoException();
                return true;
            case wi.dx /*26*/:
                parcel.enforceInterface("com.google.android.gms.common.internal.IGmsServiceBroker");
                mo2384e(gwz.m18740a(parcel.readStrongBinder()), parcel.readInt(), parcel.readString());
                parcel2.writeNoException();
                return true;
            case 27:
                parcel.enforceInterface("com.google.android.gms.common.internal.IGmsServiceBroker");
                a = gwz.m18740a(parcel.readStrongBinder());
                readInt = parcel.readInt();
                readString = parcel.readString();
                if (parcel.readInt() != 0) {
                    bundle = (Bundle) Bundle.CREATOR.createFromParcel(parcel);
                }
                mo2404p(a, readInt, readString, bundle);
                parcel2.writeNoException();
                return true;
            case 28:
                parcel.enforceInterface("com.google.android.gms.common.internal.IGmsServiceBroker");
                mo2364a();
                parcel2.writeNoException();
                return true;
            case 30:
                parcel.enforceInterface("com.google.android.gms.common.internal.IGmsServiceBroker");
                mo2372a(gwz.m18740a(parcel.readStrongBinder()), parcel.readInt(), parcel.readString(), parcel.readString(), parcel.createStringArray(), parcel.readInt() != 0 ? (Bundle) Bundle.CREATOR.createFromParcel(parcel) : null);
                parcel2.writeNoException();
                return true;
            case 31:
                parcel.enforceInterface("com.google.android.gms.common.internal.IGmsServiceBroker");
                mo2386f(gwz.m18740a(parcel.readStrongBinder()), parcel.readInt(), parcel.readString());
                parcel2.writeNoException();
                return true;
            case 32:
                parcel.enforceInterface("com.google.android.gms.common.internal.IGmsServiceBroker");
                mo2388g(gwz.m18740a(parcel.readStrongBinder()), parcel.readInt(), parcel.readString());
                parcel2.writeNoException();
                return true;
            case 33:
                parcel.enforceInterface("com.google.android.gms.common.internal.IGmsServiceBroker");
                mo2370a(gwz.m18740a(parcel.readStrongBinder()), parcel.readInt(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.createStringArray());
                parcel2.writeNoException();
                return true;
            case 34:
                parcel.enforceInterface("com.google.android.gms.common.internal.IGmsServiceBroker");
                mo2369a(gwz.m18740a(parcel.readStrongBinder()), parcel.readInt(), parcel.readString(), parcel.readString());
                parcel2.writeNoException();
                return true;
            case 35:
                parcel.enforceInterface("com.google.android.gms.common.internal.IGmsServiceBroker");
                mo2390h(gwz.m18740a(parcel.readStrongBinder()), parcel.readInt(), parcel.readString());
                parcel2.writeNoException();
                return true;
            case 36:
                parcel.enforceInterface("com.google.android.gms.common.internal.IGmsServiceBroker");
                mo2392i(gwz.m18740a(parcel.readStrongBinder()), parcel.readInt(), parcel.readString());
                parcel2.writeNoException();
                return true;
            case 37:
                parcel.enforceInterface("com.google.android.gms.common.internal.IGmsServiceBroker");
                a = gwz.m18740a(parcel.readStrongBinder());
                readInt = parcel.readInt();
                readString = parcel.readString();
                if (parcel.readInt() != 0) {
                    bundle = (Bundle) Bundle.CREATOR.createFromParcel(parcel);
                }
                mo2405q(a, readInt, readString, bundle);
                parcel2.writeNoException();
                return true;
            case 38:
                parcel.enforceInterface("com.google.android.gms.common.internal.IGmsServiceBroker");
                a = gwz.m18740a(parcel.readStrongBinder());
                readInt = parcel.readInt();
                readString = parcel.readString();
                if (parcel.readInt() != 0) {
                    bundle = (Bundle) Bundle.CREATOR.createFromParcel(parcel);
                }
                mo2406r(a, readInt, readString, bundle);
                parcel2.writeNoException();
                return true;
            case 40:
                parcel.enforceInterface("com.google.android.gms.common.internal.IGmsServiceBroker");
                mo2394j(gwz.m18740a(parcel.readStrongBinder()), parcel.readInt(), parcel.readString());
                parcel2.writeNoException();
                return true;
            case 41:
                parcel.enforceInterface("com.google.android.gms.common.internal.IGmsServiceBroker");
                a = gwz.m18740a(parcel.readStrongBinder());
                readInt = parcel.readInt();
                readString = parcel.readString();
                if (parcel.readInt() != 0) {
                    bundle = (Bundle) Bundle.CREATOR.createFromParcel(parcel);
                }
                mo2407s(a, readInt, readString, bundle);
                parcel2.writeNoException();
                return true;
            case 42:
                parcel.enforceInterface("com.google.android.gms.common.internal.IGmsServiceBroker");
                mo2396k(gwz.m18740a(parcel.readStrongBinder()), parcel.readInt(), parcel.readString());
                parcel2.writeNoException();
                return true;
            case 43:
                parcel.enforceInterface("com.google.android.gms.common.internal.IGmsServiceBroker");
                a = gwz.m18740a(parcel.readStrongBinder());
                readInt = parcel.readInt();
                readString = parcel.readString();
                if (parcel.readInt() != 0) {
                    bundle = (Bundle) Bundle.CREATOR.createFromParcel(parcel);
                }
                mo2408t(a, readInt, readString, bundle);
                parcel2.writeNoException();
                return true;
            case 44:
                parcel.enforceInterface("com.google.android.gms.common.internal.IGmsServiceBroker");
                mo2398l(gwz.m18740a(parcel.readStrongBinder()), parcel.readInt(), parcel.readString());
                parcel2.writeNoException();
                return true;
            case 45:
                parcel.enforceInterface("com.google.android.gms.common.internal.IGmsServiceBroker");
                mo2400m(gwz.m18740a(parcel.readStrongBinder()), parcel.readInt(), parcel.readString());
                parcel2.writeNoException();
                return true;
            case 46:
                GetServiceRequest getServiceRequest;
                parcel.enforceInterface("com.google.android.gms.common.internal.IGmsServiceBroker");
                a = gwz.m18740a(parcel.readStrongBinder());
                if (parcel.readInt() != 0) {
                    getServiceRequest = (GetServiceRequest) GetServiceRequest.CREATOR.createFromParcel(parcel);
                }
                mo2376a(a, getServiceRequest);
                parcel2.writeNoException();
                return true;
            case 47:
                parcel.enforceInterface("com.google.android.gms.common.internal.IGmsServiceBroker");
                a = gwz.m18740a(parcel.readStrongBinder());
                if (parcel.readInt() != 0) {
                    validateAccountRequest = (ValidateAccountRequest) ValidateAccountRequest.CREATOR.createFromParcel(parcel);
                }
                mo2377a(a, validateAccountRequest);
                parcel2.writeNoException();
                return true;
            case 1598968902:
                parcel2.writeString("com.google.android.gms.common.internal.IGmsServiceBroker");
                return true;
            default:
                return super.onTransact(i, parcel, parcel2, i2);
        }
    }
}
