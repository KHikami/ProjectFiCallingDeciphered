package p000;

import android.app.ActionBar;
import android.app.Activity;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.os.Build.VERSION;

final class ua {
    private static final int[] f35192a = new int[]{16843531};

    public static ub m40880a(Activity activity, Drawable drawable, int i) {
        ub ubVar = new ub(activity);
        if (ubVar.f35193a != null) {
            try {
                ActionBar actionBar = activity.getActionBar();
                ubVar.f35193a.invoke(actionBar, new Object[]{drawable});
                ubVar.f35194b.invoke(actionBar, new Object[]{Integer.valueOf(i)});
            } catch (Exception e) {
            }
        } else if (ubVar.f35195c != null) {
            ubVar.f35195c.setImageDrawable(drawable);
        }
        return ubVar;
    }

    public static ub m40881a(ub ubVar, Activity activity, int i) {
        if (ubVar == null) {
            ubVar = new ub(activity);
        }
        if (ubVar.f35193a != null) {
            try {
                ActionBar actionBar = activity.getActionBar();
                ubVar.f35194b.invoke(actionBar, new Object[]{Integer.valueOf(i)});
                if (VERSION.SDK_INT <= 19) {
                    actionBar.setSubtitle(actionBar.getSubtitle());
                }
            } catch (Exception e) {
            }
        }
        return ubVar;
    }

    public static Drawable m40879a(Activity activity) {
        TypedArray obtainStyledAttributes = activity.obtainStyledAttributes(f35192a);
        Drawable drawable = obtainStyledAttributes.getDrawable(0);
        obtainStyledAttributes.recycle();
        return drawable;
    }
}
