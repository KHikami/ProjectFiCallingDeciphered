package defpackage;

import android.accounts.Account;
import android.content.Context;

/* renamed from: icx */
final class icx extends icw {
    public icx(Context context) {
        super(context);
    }

    public Account[] a(String str) {
        try {
            return gss.c(this.a, str);
        } catch (Throwable e) {
            throw new idt(e.a(), e.getMessage(), e.b(), e);
        } catch (Throwable e2) {
            throw new ids(e2.a, e2);
        }
    }
}
