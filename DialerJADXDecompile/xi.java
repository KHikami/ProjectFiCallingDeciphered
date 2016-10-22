import android.graphics.PorterDuff.Mode;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.Drawable.ConstantState;
import android.graphics.drawable.DrawableContainer;
import android.graphics.drawable.DrawableContainer.DrawableContainerState;
import android.graphics.drawable.GradientDrawable;
import android.graphics.drawable.InsetDrawable;
import android.graphics.drawable.LayerDrawable;
import android.graphics.drawable.ScaleDrawable;
import android.graphics.drawable.StateListDrawable;
import android.os.Build.VERSION;

/* compiled from: PG */
public final class xi {
    static {
        Rect rect = new Rect();
        if (VERSION.SDK_INT >= 18) {
            try {
                Class.forName("android.graphics.Insets");
            } catch (ClassNotFoundException e) {
            }
        }
    }

    static void a(Drawable drawable) {
        if (VERSION.SDK_INT == 21 && "android.graphics.drawable.VectorDrawable".equals(drawable.getClass().getName())) {
            int[] state = drawable.getState();
            if (state == null || state.length == 0) {
                drawable.setState(aad.d);
            } else {
                drawable.setState(aad.e);
            }
            drawable.setState(state);
        }
    }

    public static boolean b(Drawable drawable) {
        Drawable drawable2 = drawable;
        while (true) {
            if (VERSION.SDK_INT < 8 && (drawable2 instanceof StateListDrawable)) {
                return false;
            }
            if (VERSION.SDK_INT < 15 && (drawable2 instanceof InsetDrawable)) {
                return false;
            }
            if (VERSION.SDK_INT < 15 && (drawable2 instanceof GradientDrawable)) {
                return false;
            }
            if (VERSION.SDK_INT >= 17 || !(drawable2 instanceof LayerDrawable)) {
                if (!(drawable2 instanceof DrawableContainer)) {
                    if (!(drawable2 instanceof gz)) {
                        if (!(drawable2 instanceof rp)) {
                            if (!(drawable2 instanceof ScaleDrawable)) {
                                break;
                            }
                            drawable2 = ((ScaleDrawable) drawable2).getDrawable();
                        } else {
                            drawable2 = ((rp) drawable2).a;
                        }
                    } else {
                        drawable2 = ((gz) drawable2).a();
                    }
                } else {
                    break;
                }
            }
            return false;
        }
        ConstantState constantState = drawable2.getConstantState();
        if (constantState instanceof DrawableContainerState) {
            for (Drawable b : ((DrawableContainerState) constantState).getChildren()) {
                if (!b(b)) {
                    return false;
                }
            }
        }
        return true;
    }

    static Mode a(int i, Mode mode) {
        switch (i) {
            case rl.e /*3*/:
                return Mode.SRC_OVER;
            case rl.g /*5*/:
                return Mode.SRC_IN;
            case rl.l /*9*/:
                return Mode.SRC_ATOP;
            case rk.bV /*14*/:
                return Mode.MULTIPLY;
            case rk.bY /*15*/:
                return Mode.SCREEN;
            case rk.bX /*16*/:
                if (VERSION.SDK_INT >= 11) {
                    return Mode.valueOf("ADD");
                }
                return mode;
            default:
                return mode;
        }
    }
}
