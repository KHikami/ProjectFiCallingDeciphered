package p000;

import android.accounts.Account;
import android.accounts.AccountManager;
import android.content.Context;
import java.util.concurrent.TimeUnit;

class icw implements ics {
    private static final long f17583b = TimeUnit.SECONDS.toMillis(2);
    public final Context f17584a;

    public icw(Context context) {
        this.f17584a = context;
    }

    public String mo3143a(String str, String str2) {
        try {
            return gss.m18485a(this.f17584a, str, str2);
        } catch (Exception e) {
            throw new ict(e.m18498a(), e.getMessage(), e.m18497b(), e);
        } catch (gsy e2) {
            throw new icu(e2.getMessage(), e2.m18497b());
        } catch (Throwable e3) {
            throw new icr(e3);
        }
    }

    public Account[] mo3144a(String str) {
        return AccountManager.get(this.f17584a).getAccountsByType(str);
    }
}
