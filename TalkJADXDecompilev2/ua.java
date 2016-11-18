package defpackage;

import android.app.ActionBar;
import android.app.Activity;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.os.Build.VERSION;

final class ua {
    private static final int[] a = new int[]{16843531};

    public static ub a(Activity activity, Drawable drawable, int i) {
        ub ubVar = new ub(activity);
        if (ubVar.a != null) {
            try {
                ActionBar actionBar = activity.getActionBar();
                ubVar.a.invoke(actionBar, new Object[]{drawable});
                ubVar.b.invoke(actionBar, new Object[]{Integer.valueOf(i)});
            } catch (Exception e) {
            }
        } else if (ubVar.c != null) {
            ubVar.c.setImageDrawable(drawable);
        }
        return ubVar;
    }

    public static ub a(ub ubVar, Activity activity, int i) {
        if (ubVar == null) {
            ubVar = new ub(activity);
        }
        if (ubVar.a != null) {
            try {
                ActionBar actionBar = activity.getActionBar();
                ubVar.b.invoke(actionBar, new Object[]{Integer.valueOf(i)});
                if (VERSION.SDK_INT <= 19) {
                    actionBar.setSubtitle(actionBar.getSubtitle());
                }
            } catch (Exception e) {
            }
        }
        return ubVar;
    }

    public static Drawable a(Activity activity) {
        TypedArray obtainStyledAttributes = activity.obtainStyledAttributes(a);
        Drawable drawable = obtainStyledAttributes.getDrawable(0);
        obtainStyledAttributes.recycle();
        return drawable;
    }
}
