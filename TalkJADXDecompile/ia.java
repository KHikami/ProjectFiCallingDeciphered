import android.content.Context;
import android.content.Intent;
import android.content.res.ColorStateList;
import android.graphics.drawable.Drawable;
import android.os.Build.VERSION;
import android.os.Bundle;
import android.util.TypedValue;
import java.io.File;

public class ia {
    private static final Object a;
    private static TypedValue b;

    static {
        a = new Object();
    }

    public static boolean a(Context context, Intent[] intentArr, Bundle bundle) {
        int i = VERSION.SDK_INT;
        if (i >= 16) {
            gwb.a(context, intentArr, bundle);
            return true;
        } else if (i < 11) {
            return false;
        } else {
            gwb.a(context, intentArr);
            return true;
        }
    }

    public static File[] a(Context context, String str) {
        if (VERSION.SDK_INT >= 19) {
            return gwb.a(context, null);
        }
        return new File[]{context.getExternalFilesDir(null)};
    }

    public static File[] a(Context context) {
        if (VERSION.SDK_INT >= 19) {
            return gwb.a(context);
        }
        return new File[]{context.getExternalCacheDir()};
    }

    public static final Drawable a(Context context, int i) {
        int i2 = VERSION.SDK_INT;
        if (i2 >= 21) {
            return gwb.b(context, i);
        }
        if (i2 >= 16) {
            return context.getResources().getDrawable(i);
        }
        synchronized (a) {
            if (b == null) {
                b = new TypedValue();
            }
            context.getResources().getValue(i, b, true);
            i2 = b.resourceId;
        }
        return context.getResources().getDrawable(i2);
    }

    public static final ColorStateList b(Context context, int i) {
        if (VERSION.SDK_INT >= 23) {
            return gwb.c(context, i);
        }
        return context.getResources().getColorStateList(i);
    }

    public static final int c(Context context, int i) {
        if (VERSION.SDK_INT >= 23) {
            return gwb.d(context, i);
        }
        return context.getResources().getColor(i);
    }
}
