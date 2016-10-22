import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ActivityInfo;

/* compiled from: PG */
final class ek extends ej {
    ek() {
    }

    public final Intent a(Activity activity) {
        Intent c = buf.c(activity);
        if (c == null) {
            return super.a(activity);
        }
        return c;
    }

    public final boolean a(Activity activity, Intent intent) {
        return buf.a(activity, intent);
    }

    public final void b(Activity activity, Intent intent) {
        buf.b(activity, intent);
    }

    public final String a(Context context, ActivityInfo activityInfo) {
        String a = buf.a(activityInfo);
        if (a == null) {
            return super.a(context, activityInfo);
        }
        return a;
    }
}
