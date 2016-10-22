import android.widget.PopupWindow;

/* compiled from: PG */
class or extends ou {
    or() {
    }

    public void a(PopupWindow popupWindow, boolean z) {
        if (ow.a != null) {
            try {
                ow.a.set(popupWindow, Boolean.valueOf(z));
            } catch (IllegalAccessException e) {
            }
        }
    }
}
