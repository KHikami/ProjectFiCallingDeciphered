import android.os.Build.VERSION;
import android.view.View;
import android.view.ViewParent;
import android.view.accessibility.AccessibilityEvent;

/* compiled from: PG */
public final class lr {
    static final lt a;

    static {
        int i = VERSION.SDK_INT;
        if (i >= 21) {
            a = new lu();
        } else if (i >= 19) {
            a = new ls((byte) 0);
        } else if (i >= 14) {
            a = new ls();
        } else {
            a = new lt();
        }
    }

    public static boolean a(ViewParent viewParent, View view, AccessibilityEvent accessibilityEvent) {
        return a.a(viewParent, view, accessibilityEvent);
    }
}
