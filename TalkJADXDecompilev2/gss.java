package defpackage;

import android.accounts.Account;
import android.accounts.AccountManager;
import android.content.Context;
import android.os.Bundle;
import com.google.android.gms.auth.TokenData;

public final class gss extends gst {
    public static final String a = gst.c;
    public static final String b = gst.d;

    @Deprecated
    public static String a(Context context, String str, String str2, Bundle bundle) {
        Account account = new Account(str, "com.google");
        Bundle bundle2 = null;
        if (null == null) {
            bundle2 = new Bundle();
        }
        bundle2.putBoolean("handle_notification", true);
        return gss.c(context, account, str2, bundle2).a();
    }

    @Deprecated
    public static String b(Context context, String str, String str2, Bundle bundle) {
        return gst.a(context, new Account(str, "com.google"), str2, null);
    }

    private static TokenData c(Context context, Account account, String str, Bundle bundle) {
        if (bundle == null) {
            bundle = new Bundle();
        }
        try {
            TokenData b = gst.b(context, account, str, bundle);
            gtv.f(context);
            return b;
        } catch (gsx e) {
            gtt.a(e.a(), context);
            throw new gsr("User intervention required. Notification has been pushed.", (byte) 0);
        } catch (gsy e2) {
            gtv.f(context);
            throw new gsr("User intervention required. Notification has been pushed.", (byte) 0);
        }
    }

    @Deprecated
    public static String a(Context context, String str, String str2) {
        return gst.a(context, new Account(str, "com.google"), str2, new Bundle());
    }

    @Deprecated
    public static void a(Context context, String str) {
        AccountManager.get(context).invalidateAuthToken("com.google", str);
    }

    public static void b(Context context, String str) {
        gwb.O("Calling this from your main thread can lead to deadlock");
        gst.a(context);
        Bundle bundle = new Bundle();
        String str2 = context.getApplicationInfo().packageName;
        bundle.putString("clientPackageName", str2);
        if (!bundle.containsKey(gst.d)) {
            bundle.putString(gst.d, str2);
        }
        gst.a(context, gst.e, new gsv(str, bundle));
    }

    public static Account[] c(Context context, String str) {
        gwb.M(str);
        return gwb.ah() ? gst.d(context, str) : AccountManager.get(context).getAccountsByType(str);
    }
}
