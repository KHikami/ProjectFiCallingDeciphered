package defpackage;

import android.util.Property;
import android.view.View;
import android.view.ViewGroup.LayoutParams;

final class jfx extends Property<View, Float> {
    jfx(Class cls, String str) {
        super(cls, str);
    }

    public /* synthetic */ Object get(Object obj) {
        return Float.valueOf((float) ((View) obj).getWidth());
    }

    public /* synthetic */ void set(Object obj, Object obj2) {
        View view = (View) obj;
        Float f = (Float) obj2;
        LayoutParams layoutParams = view.getLayoutParams();
        if (layoutParams == null) {
            layoutParams = new LayoutParams(f.intValue(), -2);
        } else {
            layoutParams.width = f.intValue();
        }
        view.setLayoutParams(layoutParams);
        view.requestLayout();
    }
}
