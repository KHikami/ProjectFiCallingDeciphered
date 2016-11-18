package defpackage;

import android.view.View;
import android.widget.PopupWindow;
import java.lang.reflect.Method;

public class td {
    static Method a;
    static boolean b;

    public void a(PopupWindow popupWindow, View view, int i, int i2, int i3) {
        if ((mj.a(i3, oa.d(view)) & 7) == 5) {
            i -= popupWindow.getWidth() - view.getWidth();
        }
        popupWindow.showAsDropDown(view, i, i2);
    }

    public void a(PopupWindow popupWindow, boolean z) {
    }

    public void a(PopupWindow popupWindow, int i) {
        if (!b) {
            try {
                a = PopupWindow.class.getDeclaredMethod("setWindowLayoutType", new Class[]{Integer.TYPE});
                a.setAccessible(true);
            } catch (Exception e) {
            }
            b = true;
        }
        if (a != null) {
            try {
                a.invoke(popupWindow, new Object[]{Integer.valueOf(i)});
            } catch (Exception e2) {
            }
        }
    }

    td() {
    }
}
