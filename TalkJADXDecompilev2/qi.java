package defpackage;

import android.os.Build.VERSION;
import android.view.accessibility.AccessibilityManager;

public final class qi {
    private static final qk a;

    static {
        if (VERSION.SDK_INT >= 19) {
            a = new qj((byte) 0);
        } else if (VERSION.SDK_INT >= 14) {
            a = new qj();
        } else {
            a = new qk();
        }
    }

    public static boolean a(AccessibilityManager accessibilityManager) {
        return a.a(accessibilityManager);
    }
}
