package defpackage;

import android.content.Context;
import android.content.Intent;
import android.content.res.ColorStateList;
import android.graphics.drawable.Drawable;
import android.os.Build.VERSION;
import android.os.Bundle;
import android.os.Process;
import android.util.TypedValue;

/* compiled from: PG */
/* renamed from: gd */
public class gd {
    private static final Object a;
    private static TypedValue b;

    static {
        a = new Object();
    }

    public static boolean a(Context context, Intent[] intentArr, Bundle bundle) {
        int i = VERSION.SDK_INT;
        if (i >= 16) {
            buf.a(context, intentArr, bundle);
            return true;
        } else if (i < 11) {
            return false;
        } else {
            buf.a(context, intentArr);
            return true;
        }
    }

    public static final Drawable a(Context context, int i) {
        int i2 = VERSION.SDK_INT;
        if (i2 >= 21) {
            return buf.a(context, i);
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
            return buf.b(context, i);
        }
        return context.getResources().getColorStateList(i);
    }

    public static final int c(Context context, int i) {
        if (VERSION.SDK_INT >= 23) {
            return buf.c(context, i);
        }
        return context.getResources().getColor(i);
    }

    public static int a(Context context, String str) {
        if (str != null) {
            return context.checkPermission(str, Process.myPid(), Process.myUid());
        }
        throw new IllegalArgumentException("permission is null");
    }
}
