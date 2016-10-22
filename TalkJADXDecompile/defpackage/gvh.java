package defpackage;

import android.accounts.Account;
import android.os.Binder;
import android.os.RemoteException;

/* renamed from: gvh */
public final class gvh extends gwq {
    int a;

    public static Account a(gwp gwp) {
        Account account = null;
        if (gwp != null) {
            long clearCallingIdentity = Binder.clearCallingIdentity();
            try {
                account = gwp.a();
            } catch (RemoteException e) {
            } finally {
                Binder.restoreCallingIdentity(clearCallingIdentity);
            }
        }
        return account;
    }

    public Account a() {
        int callingUid = Binder.getCallingUid();
        if (callingUid != this.a) {
            if (gtv.a(null, callingUid)) {
                this.a = callingUid;
            } else {
                throw new SecurityException("Caller is not GooglePlayServices");
            }
        }
        return null;
    }

    public boolean equals(Object obj) {
        Account account = null;
        return this == obj ? true : !(obj instanceof gvh) ? false : account.equals(account);
    }
}
