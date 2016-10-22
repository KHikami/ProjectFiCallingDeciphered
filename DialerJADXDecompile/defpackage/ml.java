package defpackage;

import android.os.Build.VERSION;
import android.view.accessibility.AccessibilityEvent;

/* compiled from: PG */
/* renamed from: ml */
public final class ml {
    public static final mn a;

    static {
        if (VERSION.SDK_INT >= 19) {
            a = new mm();
        } else if (VERSION.SDK_INT >= 14) {
            a = new mn((byte) 0);
        } else {
            a = new mn();
        }
    }

    public static nj a(AccessibilityEvent accessibilityEvent) {
        return new nj(accessibilityEvent);
    }

    public static void a(AccessibilityEvent accessibilityEvent, int i) {
        a.a(accessibilityEvent, i);
    }
}
