package defpackage;

import android.widget.PopupWindow;
import java.lang.reflect.Field;

final class te {
    static Field a;

    static {
        try {
            Field declaredField = PopupWindow.class.getDeclaredField("mOverlapAnchor");
            a = declaredField;
            declaredField.setAccessible(true);
        } catch (NoSuchFieldException e) {
        }
    }
}
