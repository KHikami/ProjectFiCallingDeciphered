package p000;

import android.widget.PopupWindow;
import java.lang.reflect.Field;

final class te {
    static Field f35132a;

    static {
        try {
            Field declaredField = PopupWindow.class.getDeclaredField("mOverlapAnchor");
            f35132a = declaredField;
            declaredField.setAccessible(true);
        } catch (NoSuchFieldException e) {
        }
    }
}
