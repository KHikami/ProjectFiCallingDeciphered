package defpackage;

import android.accounts.AccountManagerCallback;
import android.accounts.AccountManagerFuture;
import android.accounts.AuthenticatorException;
import android.accounts.OperationCanceledException;
import android.content.Context;
import android.content.IntentFilter;
import android.os.Bundle;
import java.io.IOException;
import org.chromium.base.ContextUtils;
import org.chromium.net.HttpNegotiateAuthenticator;

public final class oui implements AccountManagerCallback<Bundle> {
    final ouk a;
    final /* synthetic */ HttpNegotiateAuthenticator b;

    public oui(HttpNegotiateAuthenticator httpNegotiateAuthenticator, ouk ouk) {
        this.b = httpNegotiateAuthenticator;
        this.a = ouk;
    }

    public void run(AccountManagerFuture<Bundle> accountManagerFuture) {
        AuthenticatorException e;
        int i = 0;
        try {
            Bundle bundle = (Bundle) accountManagerFuture.getResult();
            if (bundle.containsKey("intent")) {
                Context context = ContextUtils.a;
                context.registerReceiver(new ouj(this, context), new IntentFilter("android.accounts.LOGIN_ACCOUNTS_CHANGED"));
                return;
            }
            HttpNegotiateAuthenticator httpNegotiateAuthenticator = this.b;
            ouk ouk = this.a;
            httpNegotiateAuthenticator.a = bundle.getBundle("spnegoContext");
            switch (bundle.getInt("spnegoResult", 1)) {
                case 0:
                    break;
                case 1:
                    i = -9;
                    break;
                case 2:
                    i = -3;
                    break;
                case 3:
                    i = -342;
                    break;
                case 4:
                    i = -320;
                    break;
                case 5:
                    i = -338;
                    break;
                case 6:
                    i = -339;
                    break;
                case 7:
                    i = -341;
                    break;
                case 8:
                    i = -344;
                    break;
                case 9:
                    i = -329;
                    break;
                default:
                    i = -9;
                    break;
            }
            httpNegotiateAuthenticator.nativeSetResult(ouk.a, i, bundle.getString("authtoken"));
        } catch (OperationCanceledException e2) {
            e = e2;
            ots.c("net_auth", "ERR_UNEXPECTED: Error while attempting to obtain a token.", e);
            this.b.nativeSetResult(this.a.a, -9, null);
        } catch (AuthenticatorException e3) {
            e = e3;
            ots.c("net_auth", "ERR_UNEXPECTED: Error while attempting to obtain a token.", e);
            this.b.nativeSetResult(this.a.a, -9, null);
        } catch (IOException e4) {
            e = e4;
            ots.c("net_auth", "ERR_UNEXPECTED: Error while attempting to obtain a token.", e);
            this.b.nativeSetResult(this.a.a, -9, null);
        }
    }
}
