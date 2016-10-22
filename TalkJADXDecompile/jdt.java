import android.accounts.AccountManagerCallback;
import android.accounts.AccountManagerFuture;
import android.content.Intent;
import android.os.Bundle;

final class jdt implements AccountManagerCallback<Bundle> {
    final /* synthetic */ dr a;
    final /* synthetic */ jds b;

    jdt(jds jds, dr drVar) {
        this.b = jds;
        this.a = drVar;
    }

    public void run(AccountManagerFuture<Bundle> accountManagerFuture) {
        try {
            if (this.a.isAdded()) {
                Intent intent = (Intent) ((Bundle) accountManagerFuture.getResult()).getParcelable("intent");
                jds jds = this.b;
                ed childFragmentManager = this.a.getChildFragmentManager();
                jdv jdv = (jdv) childFragmentManager.a("new.account.launcher");
                if (jdv == null) {
                    jdv = new jdv();
                    childFragmentManager.a().a((dr) jdv, "new.account.launcher").b();
                }
                gwb.a(new jdu(jds, jdv, intent));
            }
        } catch (Throwable e) {
            throw new IllegalStateException(e);
        }
    }
}
