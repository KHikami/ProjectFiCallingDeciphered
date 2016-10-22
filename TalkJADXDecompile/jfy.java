import android.util.Property;
import android.view.View;
import android.view.ViewGroup.LayoutParams;

final class jfy extends Property<View, Float> {
    jfy(Class cls, String str) {
        super(cls, str);
    }

    public /* synthetic */ Object get(Object obj) {
        return Float.valueOf((float) ((View) obj).getHeight());
    }

    public /* synthetic */ void set(Object obj, Object obj2) {
        View view = (View) obj;
        Float f = (Float) obj2;
        LayoutParams layoutParams = view.getLayoutParams();
        if (layoutParams == null) {
            layoutParams = new LayoutParams(-2, f.intValue());
        } else {
            layoutParams.height = f.intValue();
        }
        view.setLayoutParams(layoutParams);
        view.requestLayout();
    }
}
