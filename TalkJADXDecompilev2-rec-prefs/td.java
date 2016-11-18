package p000;

import android.view.View;
import android.widget.PopupWindow;
import java.lang.reflect.Method;

public class td {
    static Method f35130a;
    static boolean f35131b;

    public void mo4379a(PopupWindow popupWindow, View view, int i, int i2, int i3) {
        if ((mj.a(i3, oa.m37351d(view)) & 7) == 5) {
            i -= popupWindow.getWidth() - view.getWidth();
        }
        popupWindow.showAsDropDown(view, i, i2);
    }

    public void mo4380a(PopupWindow popupWindow, boolean z) {
    }

    public void mo4381a(PopupWindow popupWindow, int i) {
        if (!f35131b) {
            try {
                f35130a = PopupWindow.class.getDeclaredMethod("setWindowLayoutType", new Class[]{Integer.TYPE});
                f35130a.setAccessible(true);
            } catch (Exception e) {
            }
            f35131b = true;
        }
        if (f35130a != null) {
            try {
                f35130a.invoke(popupWindow, new Object[]{Integer.valueOf(i)});
            } catch (Exception e2) {
            }
        }
    }

    td() {
    }
}
