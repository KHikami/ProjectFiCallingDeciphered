package p000;

import android.accounts.AuthenticatorException;
import android.content.Context;

class icv implements icq {
    icv() {
    }

    public String mo3141a(Context context, String str, String str2) {
        try {
            return gss.m18486a(context, str, str2, null);
        } catch (Throwable e) {
            throw new AuthenticatorException("Cannot get Oauth2 token from GMS", e);
        }
    }

    public void mo3142a(Context context, String str) {
        try {
            gss.m18489b(context, str);
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
