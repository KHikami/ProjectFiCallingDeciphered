import android.accounts.Account;
import android.os.Binder;
import android.os.RemoteException;
import android.util.Log;

public final class btn extends bva {
    private int a;

    public static Account a(buz buz) {
        Account account = null;
        if (buz != null) {
            long clearCallingIdentity = Binder.clearCallingIdentity();
            try {
                account = buz.a();
            } catch (RemoteException e) {
                Log.w("AccountAccessor", "Remote account accessor probably died");
            } finally {
                Binder.restoreCallingIdentity(clearCallingIdentity);
            }
        }
        return account;
    }

    public final Account a() {
        int callingUid = Binder.getCallingUid();
        if (callingUid != this.a) {
            if (bqu.a(null, callingUid)) {
                this.a = callingUid;
            } else {
                throw new SecurityException("Caller is not GooglePlayServices");
            }
        }
        return null;
    }

    public final boolean equals(Object obj) {
        Account account = null;
        return this == obj ? true : !(obj instanceof btn) ? false : account.equals(account);
    }
}
