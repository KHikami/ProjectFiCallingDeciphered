package p000;

import android.accounts.Account;
import android.accounts.AccountManager;
import android.content.Context;
import android.os.Bundle;
import com.google.android.gms.auth.TokenData;

public final class gss extends gst {
    public static final String f16028a = gst.f16025c;
    public static final String f16029b = gst.f16026d;

    @Deprecated
    public static String m18486a(Context context, String str, String str2, Bundle bundle) {
        Account account = new Account(str, "com.google");
        Bundle bundle2 = null;
        if (null == null) {
            bundle2 = new Bundle();
        }
        bundle2.putBoolean("handle_notification", true);
        return gss.m18490c(context, account, str2, bundle2).m9633a();
    }

    @Deprecated
    public static String m18488b(Context context, String str, String str2, Bundle bundle) {
        return gst.m18481a(context, new Account(str, "com.google"), str2, null);
    }

    private static TokenData m18490c(Context context, Account account, String str, Bundle bundle) {
        if (bundle == null) {
            bundle = new Bundle();
        }
        try {
            TokenData b = gst.m18483b(context, account, str, bundle);
            gtv.m18576f(context);
            return b;
        } catch (gsx e) {
            gtt.m18583a(e.m18498a(), context);
            throw new gsr("User intervention required. Notification has been pushed.", (byte) 0);
        } catch (gsy e2) {
            gtv.m18576f(context);
            throw new gsr("User intervention required. Notification has been pushed.", (byte) 0);
        }
    }

    @Deprecated
    public static String m18485a(Context context, String str, String str2) {
        return gst.m18481a(context, new Account(str, "com.google"), str2, new Bundle());
    }

    @Deprecated
    public static void m18487a(Context context, String str) {
        AccountManager.get(context).invalidateAuthToken("com.google", str);
    }

    public static void m18489b(Context context, String str) {
        gwb.m1434O("Calling this from your main thread can lead to deadlock");
        gst.m18482a(context);
        Bundle bundle = new Bundle();
        String str2 = context.getApplicationInfo().packageName;
        bundle.putString("clientPackageName", str2);
        if (!bundle.containsKey(gst.f16026d)) {
            bundle.putString(gst.f16026d, str2);
        }
        gst.m18479a(context, gst.f16027e, new gsv(str, bundle));
    }

    public static Account[] m18491c(Context context, String str) {
        gwb.m1426M(str);
        return gwb.ah() ? gst.m18484d(context, str) : AccountManager.get(context).getAccountsByType(str);
    }
}
