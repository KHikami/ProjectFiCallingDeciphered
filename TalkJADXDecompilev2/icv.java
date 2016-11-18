package defpackage;

import android.accounts.AuthenticatorException;
import android.content.Context;

class icv implements icq {
    icv() {
    }

    public String a(Context context, String str, String str2) {
        try {
            return gss.a(context, str, str2, null);
        } catch (Throwable e) {
            throw new AuthenticatorException("Cannot get Oauth2 token from GMS", e);
        }
    }

    public void a(Context context, String str) {
        try {
            gss.b(context, str);
        } catch (Throwable e) {
            throw new AuthenticatorException("Cannot invalidate token", e);
        } catch (Throwable e2) {
            throw new AuthenticatorException("Cannot invalidate token", e2);
        }
    }

    icv(byte b) {
        this();
    }
}
