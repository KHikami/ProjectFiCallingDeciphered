package defpackage;

import android.accounts.Account;
import android.accounts.AccountManager;
import android.content.Context;
import java.util.concurrent.TimeUnit;

/* renamed from: icw */
class icw implements ics {
    private static final long b;
    public final Context a;

    static {
        b = TimeUnit.SECONDS.toMillis(2);
    }

    public icw(Context context) {
        this.a = context;
    }

    public String a(String str, String str2) {
        try {
            return gss.a(this.a, str, str2);
        } catch (Exception e) {
            throw new ict(e.a(), e.getMessage(), e.b(), e);
        } catch (gsy e2) {
            throw new icu(e2.getMessage(), e2.b());
        } catch (Throwable e3) {
            throw new icr(e3);
        }
    }

    public Account[] a(String str) {
        return AccountManager.get(this.a).getAccountsByType(str);
    }
}
