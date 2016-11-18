package p000;

import android.os.Build.VERSION;
import android.widget.PopupWindow;

public final class sz {
    public static final td f35120a;

    static {
        int i = VERSION.SDK_INT;
        if (i >= 23) {
            f35120a = new tb();
        } else if (i >= 21) {
            f35120a = new ta();
        } else if (i >= 19) {
            f35120a = new tc();
        } else {
            f35120a = new td();
        }
    }

    public static void m40685a(PopupWindow popupWindow, int i) {
        f35120a.mo4381a(popupWindow, i);
    }
}
