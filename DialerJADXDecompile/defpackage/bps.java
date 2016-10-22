package defpackage;

import android.accounts.Account;
import android.accounts.AccountManager;
import android.content.Context;
import android.os.Bundle;
import android.os.SystemClock;
import android.text.TextUtils;
import com.google.android.gms.auth.TokenData;

/* renamed from: bps */
public final class bps extends bpt {
    private static TokenData a(Context context, Account account, String str, Bundle bundle) {
        if (bundle == null) {
            bundle = new Bundle();
        }
        try {
            buf.p("Calling this from your main thread can lead to deadlock");
            bpt.a(context);
            Bundle bundle2 = bundle == null ? new Bundle() : new Bundle(bundle);
            String str2 = context.getApplicationInfo().packageName;
            bundle2.putString("clientPackageName", str2);
            if (TextUtils.isEmpty(bundle2.getString(bpt.b))) {
                bundle2.putString(bpt.b, str2);
            }
            bundle2.putLong("service_connection_start_time_millis", SystemClock.elapsedRealtime());
            TokenData tokenData = (TokenData) bpt.a(context, bpt.c, new bpu(account, str, bundle2));
            bqu.d(context);
            return tokenData;
        } catch (bpv e) {
            bqs.a(e.a, context);
            throw new bpr("User intervention required. Notification has been pushed.", (byte) 0);
        } catch (bpw e2) {
            bqu.d(context);
            throw new bpr("User intervention required. Notification has been pushed.", (byte) 0);
        }
    }

    @Deprecated
    public static String a(Context context, String str, String str2, Bundle bundle) {
        Account account = new Account(str, "com.google");
        Bundle bundle2 = null;
        if (null == null) {
            bundle2 = new Bundle();
        }
        bundle2.putBoolean("handle_notification", true);
        return bps.a(context, account, str2, bundle2).b;
    }

    @Deprecated
    public static void a(Context context, String str) {
        AccountManager.get(context).invalidateAuthToken("com.google", str);
    }
}
