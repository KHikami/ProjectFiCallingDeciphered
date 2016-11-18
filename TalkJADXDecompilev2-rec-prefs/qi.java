package p000;

import android.os.Build.VERSION;
import android.view.accessibility.AccessibilityManager;

public final class qi {
    private static final qk f28989a;

    static {
        if (VERSION.SDK_INT >= 19) {
            f28989a = new qj((byte) 0);
        } else if (VERSION.SDK_INT >= 14) {
            f28989a = new qj();
        } else {
            f28989a = new qk();
        }
    }

    public static boolean m33683a(AccessibilityManager accessibilityManager) {
        return f28989a.a(accessibilityManager);
    }
}
