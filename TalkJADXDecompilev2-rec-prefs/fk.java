package p000;

import android.app.Activity;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.os.Build.VERSION;

public final class fk {
    private static final fl f13303a;

    static {
        if (VERSION.SDK_INT >= 16) {
            f13303a = new fm();
        } else {
            f13303a = new fl();
        }
    }

    public static boolean m15532a(Activity activity, Intent intent) {
        return f13303a.mo2033a(activity, intent);
    }

    public static void m15531a(Activity activity) {
        Intent b = fk.m15533b(activity);
        if (b == null) {
            throw new IllegalArgumentException("Activity " + activity.getClass().getSimpleName() + " does not have a parent activity name specified. (Did you forget to add the android.support.PARENT_ACTIVITY <meta-data> " + " element in your manifest?)");
        }
        fk.m15535b(activity, b);
    }

    public static void m15535b(Activity activity, Intent intent) {
        f13303a.mo2034b(activity, intent);
    }

    public static Intent m15533b(Activity activity) {
        return f13303a.mo2031a(activity);
    }

    public static Intent m15530a(Context context, ComponentName componentName) {
        String b = fk.m15534b(context, componentName);
        if (b == null) {
            return null;
        }
        ComponentName componentName2 = new ComponentName(componentName.getPackageName(), b);
        if (fk.m15534b(context, componentName2) == null) {
            return id.m21610a(componentName2);
        }
        return new Intent().setComponent(componentName2);
    }

    public static String m15536c(Activity activity) {
        try {
            return fk.m15534b((Context) activity, activity.getComponentName());
        } catch (Throwable e) {
            throw new IllegalArgumentException(e);
        }
    }

    public static String m15534b(Context context, ComponentName componentName) {
        return f13303a.mo2032a(context, context.getPackageManager().getActivityInfo(componentName, 128));
    }
}
