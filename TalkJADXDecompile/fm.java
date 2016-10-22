import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ActivityInfo;

final class fm extends fl {
    fm() {
    }

    public Intent a(Activity activity) {
        Intent c = gwb.c(activity);
        if (c == null) {
            return b(activity);
        }
        return c;
    }

    private Intent b(Activity activity) {
        return super.a(activity);
    }

    public boolean a(Activity activity, Intent intent) {
        return gwb.a(activity, intent);
    }

    public void b(Activity activity, Intent intent) {
        gwb.b(activity, intent);
    }

    public String a(Context context, ActivityInfo activityInfo) {
        String a = gwb.a(activityInfo);
        if (a == null) {
            return super.a(context, activityInfo);
        }
        return a;
    }
}
