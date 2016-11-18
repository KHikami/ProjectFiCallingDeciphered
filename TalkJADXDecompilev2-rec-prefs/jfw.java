package p000;

import android.util.Property;
import android.view.View;

public final class jfw {
    public static final Property<View, Float> f19983a = Property.of(View.class, Float.class, "pivotX");
    public static final Property<View, Float> f19984b = Property.of(View.class, Float.class, "pivotY");
    public static final Property<View, Float> f19985c = new jfx(Float.class, "width");
    public static final Property<View, Float> f19986d = new jfy(Float.class, "height");
    public static final Property<View, Float> f19987e = new jfz(f19985c, View.X, 0.5f, "anchorPositionX");
    public static final Property<View, Float> f19988f = new jfz(f19986d, View.Y, 0.5f, "anchorPositionY");
}
