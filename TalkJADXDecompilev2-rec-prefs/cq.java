package p000;

import android.app.Activity;
import android.content.Intent;
import android.content.IntentSender;
import android.os.Build.VERSION;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;

public final class cq extends ia {
    public static void m10682a(Activity activity, Intent intent, int i, Bundle bundle) {
        if (VERSION.SDK_INT >= 16) {
            gwb.m1737a(activity, intent, i, bundle);
        } else {
            activity.startActivityForResult(intent, i);
        }
    }

    public static void m10683a(Activity activity, IntentSender intentSender, int i, Intent intent, int i2, int i3, int i4, Bundle bundle) {
        if (VERSION.SDK_INT >= 16) {
            gwb.m1738a(activity, intentSender, i, intent, i2, i3, i4, bundle);
        } else {
            activity.startIntentSenderForResult(intentSender, i, intent, i2, i3, i4);
        }
    }

    public static void m10681a(Activity activity) {
        if (VERSION.SDK_INT >= 16) {
            gwb.m2013b(activity);
        } else {
            activity.finish();
        }
    }

    public static void m10684a(Activity activity, String[] strArr, int i) {
        if (VERSION.SDK_INT >= 23) {
            gwb.m1740a(activity, strArr, i);
        } else if (activity instanceof cs) {
            new Handler(Looper.getMainLooper()).post(new cr(strArr, activity, i));
        }
    }

    public static boolean m10685a(Activity activity, String str) {
        if (VERSION.SDK_INT >= 23) {
            return gwb.m1894a(activity, str);
        }
        return false;
    }
}
