package p000;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ActivityInfo;

final class fm extends fl {
    fm() {
    }

    public Intent mo2031a(Activity activity) {
        Intent c = gwb.m2077c(activity);
        if (c == null) {
            return m15665b(activity);
        }
        return c;
    }

    private Intent m15665b(Activity activity) {
        return super.mo2031a(activity);
    }

    public boolean mo2033a(Activity activity, Intent intent) {
        return gwb.m1893a(activity, intent);
    }

    public void mo2034b(Activity activity, Intent intent) {
        gwb.m2014b(activity, intent);
    }

    public String mo2032a(Context context, ActivityInfo activityInfo) {
        String a = gwb.m1653a(activityInfo);
        if (a == null) {
            return super.mo2032a(context, activityInfo);
        }
        return a;
    }
}
