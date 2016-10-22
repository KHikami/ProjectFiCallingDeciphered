package defpackage;

import android.widget.PopupWindow;
import java.lang.reflect.Field;

/* compiled from: PG */
/* renamed from: ow */
final class ow {
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
