package defpackage;

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
    final /* synthetic */ HttpNegotiateAuthenticator a;
    private final ouk b;

    public ouh(HttpNegotiateAuthenticator httpNegotiateAuthenticator, ouk ouk) {
        this.a = httpNegotiateAuthenticator;
        this.b = ouk;
    }

    public void run(AccountManagerFuture<Account[]> accountManagerFuture) {
        AuthenticatorException e;
        try {
            Account[] accountArr = (Account[]) accountManagerFuture.getResult();
            if (accountArr.length == 0) {
                ots.c("net_auth", "ERR_MISSING_AUTH_CREDENTIALS: No account provided for the kerberos authentication. Please verify the configuration policies and that the CONTACTS runtime permission is granted. ", new Object[0]);
                this.a.nativeSetResult(this.b.a, -341, null);
            } else if (accountArr.length > 1) {
                ots.c("net_auth", "ERR_MISSING_AUTH_CREDENTIALS: Found %d accounts eligible for the kerberos authentication. Please fix the configuration by providing a single account.", Integer.valueOf(accountArr.length));
                this.a.nativeSetResult(this.b.a, -341, null);
            } else if (this.a.a(ContextUtils.a, "android.permission.USE_CREDENTIALS", true)) {
                ots.d("net_auth", "ERR_MISCONFIGURED_AUTH_ENVIRONMENT: USE_CREDENTIALS permission not granted. Aborting authentication.", new Object[0]);
                this.a.nativeSetResult(this.b.a, -343, null);
            } else {
                this.b.e = accountArr[0];
                this.b.b.getAuthToken(this.b.e, this.b.d, this.b.c, true, new oui(this.a, this.b), new Handler(ThreadUtils.a().getLooper()));
            }
        } catch (OperationCanceledException e2) {
            e = e2;
            ots.c("net_auth", "ERR_UNEXPECTED: Error while attempting to retrieve accounts.", e);
            this.a.nativeSetResult(this.b.a, -9, null);
        } catch (AuthenticatorException e3) {
            e = e3;
            ots.c("net_auth", "ERR_UNEXPECTED: Error while attempting to retrieve accounts.", e);
            this.a.nativeSetResult(this.b.a, -9, null);
        } catch (IOException e4) {
            e = e4;
            ots.c("net_auth", "ERR_UNEXPECTED: Error while attempting to retrieve accounts.", e);
            this.a.nativeSetResult(this.b.a, -9, null);
        }
    }
}
