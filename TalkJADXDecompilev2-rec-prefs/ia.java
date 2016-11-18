package p000;

import android.content.Context;
import android.content.Intent;
import android.content.res.ColorStateList;
import android.graphics.drawable.Drawable;
import android.os.Build.VERSION;
import android.os.Bundle;
import android.util.TypedValue;
import java.io.File;

public class ia {
    private static final Object f8825a = new Object();
    private static TypedValue f8826b;

    public static boolean m10676a(Context context, Intent[] intentArr, Bundle bundle) {
        int i = VERSION.SDK_INT;
        if (i >= 16) {
            gwb.m1758a(context, intentArr, bundle);
            return true;
        } else if (i < 11) {
            return false;
        } else {
            gwb.m1757a(context, intentArr);
            return true;
        }
    }

    public static File[] m10678a(Context context, String str) {
        if (VERSION.SDK_INT >= 19) {
            return gwb.m1958a(context, null);
        }
        return new File[]{context.getExternalFilesDir(null)};
    }

    public static File[] m10677a(Context context) {
        if (VERSION.SDK_INT >= 19) {
            return gwb.m1957a(context);
        }
        return new File[]{context.getExternalCacheDir()};
    }

    public static final Drawable m10675a(Context context, int i) {
        int i2 = VERSION.SDK_INT;
        if (i2 >= 21) {
            return gwb.m1980b(context, i);
        }
        if (i2 >= 16) {
            return context.getResources().getDrawable(i);
        }
        synchronized (f8825a) {
            if (f8826b == null) {
                f8826b = new TypedValue();
            }
            context.getResources().getValue(i, f8826b, true);
            i2 = f8826b.resourceId;
        }
        return context.getResources().getDrawable(i2);
    }

    public static final ColorStateList m10679b(Context context, int i) {
        if (VERSION.SDK_INT >= 23) {
            return gwb.m2080c(context, i);
        }
        return context.getResources().getColorStateList(i);
    }

    public static final int m10680c(Context context, int i) {
        if (VERSION.SDK_INT >= 23) {
            return gwb.m2122d(context, i);
        }
        return context.getResources().getColor(i);
    }
}
