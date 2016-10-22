import android.app.Activity;
import android.content.Intent;
import android.os.Build.VERSION;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;

/* compiled from: PG */
public final class ci extends gd {
    public static void a(Activity activity, Intent intent, int i, Bundle bundle) {
        if (VERSION.SDK_INT >= 16) {
            buf.a(activity, intent, i, bundle);
        } else {
            activity.startActivityForResult(intent, i);
        }
    }

    public static void a(Activity activity) {
        if (VERSION.SDK_INT >= 16) {
            buf.b(activity);
        } else {
            activity.finish();
        }
    }

    public static void a(Activity activity, String[] strArr, int i) {
        if (VERSION.SDK_INT >= 23) {
            buf.a(activity, strArr, 1);
        } else if (activity instanceof ck) {
            new Handler(Looper.getMainLooper()).post(new cj(strArr, activity, 1));
        }
    }
}
