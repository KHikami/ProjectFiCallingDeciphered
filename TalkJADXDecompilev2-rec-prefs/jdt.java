package p000;

import android.accounts.AccountManagerCallback;
import android.accounts.AccountManagerFuture;
import android.content.Intent;
import android.os.Bundle;

final class jdt implements AccountManagerCallback<Bundle> {
    final /* synthetic */ dr f19913a;
    final /* synthetic */ jds f19914b;

    jdt(jds jds, dr drVar) {
        this.f19914b = jds;
        this.f19913a = drVar;
    }

    public void run(AccountManagerFuture<Bundle> accountManagerFuture) {
        try {
            if (this.f19913a.isAdded()) {
                Intent intent = (Intent) ((Bundle) accountManagerFuture.getResult()).getParcelable("intent");
                jds jds = this.f19914b;
                ed childFragmentManager = this.f19913a.getChildFragmentManager();
                jdv jdv = (jdv) childFragmentManager.mo1844a("new.account.launcher");
                if (jdv == null) {
                    jdv = new jdv();
                    childFragmentManager.mo1845a().mo1528a((dr) jdv, "new.account.launcher").mo1529b();
                }
                gwb.m1863a(new jdu(jds, jdv, intent));
            }
        } catch (Throwable e) {
            throw new IllegalStateException(e);
        }
    }
}
