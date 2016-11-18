package p000;

import android.os.Build.VERSION;
import android.view.accessibility.AccessibilityEvent;

public final class qf {
    public static final qh f28988a;

    static {
        if (VERSION.SDK_INT >= 19) {
            f28988a = new qg();
        } else if (VERSION.SDK_INT >= 16) {
            f28988a = new qh('\u0000');
        } else if (VERSION.SDK_INT >= 14) {
            f28988a = new qh((byte) 0);
        } else {
            f28988a = new qh();
        }
    }

    public static rf m33682a(AccessibilityEvent accessibilityEvent) {
        return new rf(accessibilityEvent);
    }
}
