package defpackage;

import android.accounts.Account;
import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;

/* renamed from: bva */
public abstract class bva extends Binder implements buz {
    public static buz a(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.common.internal.IAccountAccessor");
        return (queryLocalInterface == null || !(queryLocalInterface instanceof buz)) ? new bvb(iBinder) : (buz) queryLocalInterface;
    }

    public IBinder asBinder() {
        return this;
    }

    public boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) {
        switch (i) {
            case rq.c /*2*/:
                parcel.enforceInterface("com.google.android.gms.common.internal.IAccountAccessor");
                Account a = a();
                parcel2.writeNoException();
                if (a != null) {
                    parcel2.writeInt(1);
                    a.writeToParcel(parcel2, 1);
                    return true;
                }
                parcel2.writeInt(0);
                return true;
            case 1598968902:
                parcel2.writeString("com.google.android.gms.common.internal.IAccountAccessor");
                return true;
            default:
                return super.onTransact(i, parcel, parcel2, i2);
        }
    }
}
