package p000;

import android.accounts.Account;
import android.accounts.AccountManagerCallback;
import android.accounts.AccountManagerFuture;
import android.accounts.AuthenticatorException;
import android.accounts.OperationCanceledException;
import android.os.Handler;
import java.io.IOException;
import org.chromium.base.ContextUtils;
import org.chromium.base.ThreadUtils;
import org.chromium.net.HttpNegotiateAuthenticator;

public final class ouh implements AccountManagerCallback<Account[]> {
    final /* synthetic */ HttpNegotiateAuthenticator f34300a;
    private final ouk f34301b;

    public ouh(HttpNegotiateAuthenticator httpNegotiateAuthenticator, ouk ouk) {
        this.f34300a = httpNegotiateAuthenticator;
        this.f34301b = ouk;
    }

    public void run(AccountManagerFuture<Account[]> accountManagerFuture) {
        AuthenticatorException e;
        try {
            Account[] accountArr = (Account[]) accountManagerFuture.getResult();
            if (accountArr.length == 0) {
                ots.m39716c("net_auth", "ERR_MISSING_AUTH_CREDENTIALS: No account provided for the kerberos authentication. Please verify the configuration policies and that the CONTACTS runtime permission is granted. ", new Object[0]);
                this.f34300a.nativeSetResult(this.f34301b.f34306a, -341, null);
            } else if (accountArr.length > 1) {
                ots.m39716c("net_auth", "ERR_MISSING_AUTH_CREDENTIALS: Found %d accounts eligible for the kerberos authentication. Please fix the configuration by providing a single account.", Integer.valueOf(accountArr.length));
                this.f34300a.nativeSetResult(this.f34301b.f34306a, -341, null);
            } else if (this.f34300a.a(ContextUtils.a, "android.permission.USE_CREDENTIALS", true)) {
                ots.m39717d("net_auth", "ERR_MISCONFIGURED_AUTH_ENVIRONMENT: USE_CREDENTIALS permission not granted. Aborting authentication.", new Object[0]);
                this.f34300a.nativeSetResult(this.f34301b.f34306a, -343, null);
            } else {
                this.f34301b.f34310e = accountArr[0];
                this.f34301b.f34307b.getAuthToken(this.f34301b.f34310e, this.f34301b.f34309d, this.f34301b.f34308c, true, new oui(this.f34300a, this.f34301b), new Handler(ThreadUtils.m39317a().getLooper()));
            }
        } catch (OperationCanceledException e2) {
            e = e2;
            ots.m39716c("net_auth", "ERR_UNEXPECTED: Error while attempting to retrieve accounts.", e);
            this.f34300a.nativeSetResult(this.f34301b.f34306a, -9, null);
        } catch (AuthenticatorException e3) {
            e = e3;
            ots.m39716c("net_auth", "ERR_UNEXPECTED: Error while attempting to retrieve accounts.", e);
            this.f34300a.nativeSetResult(this.f34301b.f34306a, -9, null);
        } catch (IOException e4) {
            e = e4;
            ots.m39716c("net_auth", "ERR_UNEXPECTED: Error while attempting to retrieve accounts.", e);
            this.f34300a.nativeSetResult(this.f34301b.f34306a, -9, null);
        }
    }
}
