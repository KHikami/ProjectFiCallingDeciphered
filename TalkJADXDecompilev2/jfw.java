package defpackage;

import android.util.Property;
import android.view.View;

public final class jfw {
    public static final Property<View, Float> a = Property.of(View.class, Float.class, "pivotX");
    public static final Property<View, Float> b = Property.of(View.class, Float.class, "pivotY");
    public static final Property<View, Float> c = new jfx(Float.class, "width");
    public static final Property<View, Float> d = new jfy(Float.class, "height");
    public static final Property<View, Float> e = new jfz(c, View.X, 0.5f, "anchorPositionX");
    public static final Property<View, Float> f = new jfz(d, View.Y, 0.5f, "anchorPositionY");
}
