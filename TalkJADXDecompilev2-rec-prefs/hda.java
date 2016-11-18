package p000;

import android.accounts.Account;
import android.os.Binder;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.google.android.gms.auth.AccountChangeEventsRequest;
import com.google.android.gms.auth.AccountChangeEventsResponse;

public abstract class hda extends Binder implements hcz {
    public static hcz m19393a(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.auth.IAuthManagerService");
        return (queryLocalInterface == null || !(queryLocalInterface instanceof hcz)) ? new hdb(iBinder) : (hcz) queryLocalInterface;
    }

    public boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) {
        Bundle a;
        switch (i) {
            case 1:
                parcel.enforceInterface("com.google.android.auth.IAuthManagerService");
                a = mo2457a(parcel.readString(), parcel.readString(), parcel.readInt() != 0 ? (Bundle) Bundle.CREATOR.createFromParcel(parcel) : null);
                parcel2.writeNoException();
                if (a != null) {
                    parcel2.writeInt(1);
                    a.writeToParcel(parcel2, 1);
                } else {
                    parcel2.writeInt(0);
                }
                return true;
            case 2:
                parcel.enforceInterface("com.google.android.auth.IAuthManagerService");
                a = mo2456a(parcel.readString(), parcel.readInt() != 0 ? (Bundle) Bundle.CREATOR.createFromParcel(parcel) : null);
                parcel2.writeNoException();
                if (a != null) {
                    parcel2.writeInt(1);
                    a.writeToParcel(parcel2, 1);
                } else {
                    parcel2.writeInt(0);
                }
                return true;
            case 3:
                parcel.enforceInterface("com.google.android.auth.IAuthManagerService");
                AccountChangeEventsResponse a2 = mo2458a(parcel.readInt() != 0 ? (AccountChangeEventsRequest) AccountChangeEventsRequest.CREATOR.createFromParcel(parcel) : null);
                parcel2.writeNoException();
                if (a2 != null) {
                    parcel2.writeInt(1);
                    a2.writeToParcel(parcel2, 1);
                } else {
                    parcel2.writeInt(0);
                }
                return true;
            case 5:
                parcel.enforceInterface("com.google.android.auth.IAuthManagerService");
                a = mo2454a(parcel.readInt() != 0 ? (Account) Account.CREATOR.createFromParcel(parcel) : null, parcel.readString(), parcel.readInt() != 0 ? (Bundle) Bundle.CREATOR.createFromParcel(parcel) : null);
                parcel2.writeNoException();
                if (a != null) {
                    parcel2.writeInt(1);
                    a.writeToParcel(parcel2, 1);
                } else {
                    parcel2.writeInt(0);
                }
                return true;
            case 6:
                parcel.enforceInterface("com.google.android.auth.IAuthManagerService");
                a = mo2455a(parcel.readInt() != 0 ? (Bundle) Bundle.CREATOR.createFromParcel(parcel) : null);
                parcel2.writeNoException();
                if (a != null) {
                    parcel2.writeInt(1);
                    a.writeToParcel(parcel2, 1);
                } else {
                    parcel2.writeInt(0);
                }
                return true;
            case 7:
                parcel.enforceInterface("com.google.android.auth.IAuthManagerService");
                a = mo2453a(parcel.readInt() != 0 ? (Account) Account.CREATOR.createFromParcel(parcel) : null);
                parcel2.writeNoException();
                if (a != null) {
                    parcel2.writeInt(1);
                    a.writeToParcel(parcel2, 1);
                } else {
                    parcel2.writeInt(0);
                }
                return true;
            case 1598968902:
                parcel2.writeString("com.google.android.auth.IAuthManagerService");
                return true;
            default:
                return super.onTransact(i, parcel, parcel2, i2);
        }
    }
}
