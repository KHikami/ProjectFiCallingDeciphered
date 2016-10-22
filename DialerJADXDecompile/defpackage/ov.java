package defpackage;

import android.view.View;
import android.widget.PopupWindow;

/* compiled from: PG */
/* renamed from: ov */
public class ov {
    public void a(PopupWindow popupWindow, View view, int i, int i2, int i3) {
        if ((iy.a(i3, kn.f(view)) & 7) == 5) {
            i -= popupWindow.getWidth() - view.getWidth();
        }
        popupWindow.showAsDropDown(view, i, i2);
    }

    public void a(PopupWindow popupWindow, boolean z) {
    }

    public void a(PopupWindow popupWindow, int i) {
    }

    ov() {
    }
}
