package defpackage;

import android.os.Build.VERSION;
import android.widget.PopupWindow;

/* compiled from: PG */
/* renamed from: oq */
public final class oq {
    public static final ov a;

    static {
        int i = VERSION.SDK_INT;
        if (i >= 23) {
            a = new os();
        } else if (i >= 21) {
            a = new or();
        } else if (i >= 19) {
            a = new ou();
        } else if (i >= 9) {
            a = new ot();
        } else {
            a = new ov();
        }
    }

    public static void a(PopupWindow popupWindow, int i) {
        a.a(popupWindow, i);
    }
}
