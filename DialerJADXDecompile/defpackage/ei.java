package defpackage;

import android.app.Activity;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.os.Build.VERSION;

/* compiled from: PG */
/* renamed from: ei */
public final class ei {
    public static final ej a;

    static {
        if (VERSION.SDK_INT >= 16) {
            a = new ek();
        } else {
            a = new ej();
        }
    }

    public static Intent a(Activity activity) {
        return a.a(activity);
    }

    public static Intent a(Context context, ComponentName componentName) {
        String b = ei.b(context, componentName);
        if (b == null) {
            return null;
        }
        ComponentName componentName2 = new ComponentName(componentName.getPackageName(), b);
        if (ei.b(context, componentName2) == null) {
            return gf.a(componentName2);
        }
        return new Intent().setComponent(componentName2);
    }

    public static String b(Activity activity) {
        try {
            return ei.b(activity, activity.getComponentName());
        } catch (Throwable e) {
            throw new IllegalArgumentException(e);
        }
    }

    public static String b(Context context, ComponentName componentName) {
        return a.a(context, context.getPackageManager().getActivityInfo(componentName, 128));
    }
}
