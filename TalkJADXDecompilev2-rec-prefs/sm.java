package p000;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.view.ViewGroup.MarginLayoutParams;
import android.view.WindowInsets;

final class sm {
    private static final int[] f35112a = new int[]{16843828};

    public static void m40639a(View view) {
        if (view instanceof so) {
            view.setOnApplyWindowInsetsListener(new sn());
            view.setSystemUiVisibility(1280);
        }
    }

    public static void m40640a(View view, Object obj, int i) {
        obj = (WindowInsets) obj;
        if (i == 3) {
            obj = obj.replaceSystemWindowInsets(obj.getSystemWindowInsetLeft(), obj.getSystemWindowInsetTop(), 0, obj.getSystemWindowInsetBottom());
        } else if (i == 5) {
            obj = obj.replaceSystemWindowInsets(0, obj.getSystemWindowInsetTop(), obj.getSystemWindowInsetRight(), obj.getSystemWindowInsetBottom());
        }
        view.dispatchApplyWindowInsets(obj);
    }

    public static void m40641a(MarginLayoutParams marginLayoutParams, Object obj, int i) {
        obj = (WindowInsets) obj;
        if (i == 3) {
            obj = obj.replaceSystemWindowInsets(obj.getSystemWindowInsetLeft(), obj.getSystemWindowInsetTop(), 0, obj.getSystemWindowInsetBottom());
        } else if (i == 5) {
            obj = obj.replaceSystemWindowInsets(0, obj.getSystemWindowInsetTop(), obj.getSystemWindowInsetRight(), obj.getSystemWindowInsetBottom());
        }
        marginLayoutParams.leftMargin = obj.getSystemWindowInsetLeft();
        marginLayoutParams.topMargin = obj.getSystemWindowInsetTop();
        marginLayoutParams.rightMargin = obj.getSystemWindowInsetRight();
        marginLayoutParams.bottomMargin = obj.getSystemWindowInsetBottom();
    }

    public static int m40637a(Object obj) {
        return obj != null ? ((WindowInsets) obj).getSystemWindowInsetTop() : 0;
    }

    public static Drawable m40638a(Context context) {
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(f35112a);
        try {
            Drawable drawable = obtainStyledAttributes.getDrawable(0);
            return drawable;
        } finally {
            obtainStyledAttributes.recycle();
        }
    }
}
