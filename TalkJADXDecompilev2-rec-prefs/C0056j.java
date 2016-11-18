package p000;

import android.os.Binder;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;

public abstract class C0056j extends Binder implements C0055i {
    public C0056j() {
        attachInterface(this, "android.support.customtabs.ICustomTabsCallback");
    }

    public static C0055i m14834a(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("android.support.customtabs.ICustomTabsCallback");
        if (queryLocalInterface == null || !(queryLocalInterface instanceof C0055i)) {
            return new C0216k(iBinder);
        }
        return (C0055i) queryLocalInterface;
    }

    public IBinder asBinder() {
        return this;
    }

    public boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) {
        Bundle bundle = null;
        switch (i) {
            case 2:
                parcel.enforceInterface("android.support.customtabs.ICustomTabsCallback");
                int readInt = parcel.readInt();
                if (parcel.readInt() != 0) {
                    bundle = (Bundle) Bundle.CREATOR.createFromParcel(parcel);
                }
                mo1961a(readInt, bundle);
                return true;
            case 3:
                parcel.enforceInterface("android.support.customtabs.ICustomTabsCallback");
                String readString = parcel.readString();
                if (parcel.readInt() != 0) {
                    bundle = (Bundle) Bundle.CREATOR.createFromParcel(parcel);
                }
                mo1962a(readString, bundle);
                return true;
            case 1598968902:
                parcel2.writeString("android.support.customtabs.ICustomTabsCallback");
                return true;
            default:
                return super.onTransact(i, parcel, parcel2, i2);
        }
    }
}
