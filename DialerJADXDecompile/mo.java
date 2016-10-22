import android.os.Build.VERSION;
import android.view.accessibility.AccessibilityManager;

/* compiled from: PG */
public final class mo {
    private static final mq a;

    static {
        if (VERSION.SDK_INT >= 14) {
            a = new mp();
        } else {
            a = new mq();
        }
    }

    public static boolean a(AccessibilityManager accessibilityManager) {
        return a.a(accessibilityManager);
    }
}
