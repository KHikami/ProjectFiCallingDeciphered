package p000;

import android.accounts.Account;
import android.os.Binder;
import android.os.RemoteException;

public final class gvh extends gwq {
    int f16211a;

    public static Account m18678a(gwp gwp) {
        Account account = null;
        if (gwp != null) {
            long clearCallingIdentity = Binder.clearCallingIdentity();
            try {
                account = gwp.mo2342a();
            } catch (RemoteException e) {
            } finally {
                Binder.restoreCallingIdentity(clearCallingIdentity);
            }
        }
        return account;
    }

    public Account mo2342a() {
        int callingUid = Binder.getCallingUid();
        if (callingUid != this.f16211a) {
            if (gtv.m18569a(null, callingUid)) {
                this.f16211a = callingUid;
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
