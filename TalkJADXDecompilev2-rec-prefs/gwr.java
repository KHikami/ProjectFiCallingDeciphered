package p000;

import android.accounts.Account;
import android.os.IBinder;
import android.os.Parcel;

final class gwr implements gwp {
    private IBinder f16314a;

    gwr(IBinder iBinder) {
        this.f16314a = iBinder;
    }

    public Account mo2342a() {
        Parcel obtain = Parcel.obtain();
        Parcel obtain2 = Parcel.obtain();
        try {
            obtain.writeInterfaceToken("com.google.android.gms.common.internal.IAccountAccessor");
            this.f16314a.transact(2, obtain, obtain2, 0);
            obtain2.readException();
            Account account = obtain2.readInt() != 0 ? (Account) Account.CREATOR.createFromParcel(obtain2) : null;
            obtain2.recycle();
            obtain.recycle();
            return account;
        } catch (Throwable th) {
            obtain2.recycle();
            obtain.recycle();
        }
    }

    public IBinder asBinder() {
        return this.f16314a;
    }
}
