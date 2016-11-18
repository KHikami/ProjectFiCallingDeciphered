package p000;

import android.accounts.Account;
import android.content.Context;

final class icx extends icw {
    public icx(Context context) {
        super(context);
    }

    public Account[] mo3144a(String str) {
        try {
            return gss.m18491c(this.a, str);
        } catch (Throwable e) {
            throw new idt(e.m18567a(), e.getMessage(), e.m18566b(), e);
        } catch (Throwable e2) {
            throw new ids(e2.f16133a, e2);
        }
    }
}
