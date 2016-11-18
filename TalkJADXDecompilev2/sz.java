package defpackage;

import android.os.Build.VERSION;
import android.widget.PopupWindow;

public final class sz {
    public static final td a;

    static {
        int i = VERSION.SDK_INT;
        if (i >= 23) {
            a = new tb();
        } else if (i >= 21) {
            a = new ta();
        } else if (i >= 19) {
            a = new tc();
        } else {
            a = new td();
        }
    }

    public static void a(PopupWindow popupWindow, int i) {
        a.a(popupWindow, i);
    }
}
