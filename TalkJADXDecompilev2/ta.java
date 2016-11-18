package defpackage;

import android.widget.PopupWindow;

class ta extends tc {
    ta() {
    }

    public void a(PopupWindow popupWindow, boolean z) {
        if (te.a != null) {
            try {
                te.a.set(popupWindow, Boolean.valueOf(z));
            } catch (IllegalAccessException e) {
            }
        }
    }
}
