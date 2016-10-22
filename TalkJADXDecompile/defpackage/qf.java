package defpackage;

import android.os.Build.VERSION;
import android.view.accessibility.AccessibilityEvent;
import qg;
import qh;

/* renamed from: qf */
public final class qf {
    public static final qh a;

    static {
        if (VERSION.SDK_INT >= 19) {
            a = new qg();
        } else if (VERSION.SDK_INT >= 16) {
            a = new qh('\u0000');
        } else if (VERSION.SDK_INT >= 14) {
            a = new qh((byte) 0);
        } else {
            a = new qh();
        }
    }

    public static rf a(AccessibilityEvent accessibilityEvent) {
        return new rf(accessibilityEvent);
    }
}
