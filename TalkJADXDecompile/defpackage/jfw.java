package defpackage;

import android.util.Property;
import android.view.View;

/* renamed from: jfw */
public final class jfw {
    public static final Property<View, Float> a;
    public static final Property<View, Float> b;
    public static final Property<View, Float> c;
    public static final Property<View, Float> d;
    public static final Property<View, Float> e;
    public static final Property<View, Float> f;

    static {
        a = Property.of(View.class, Float.class, "pivotX");
        b = Property.of(View.class, Float.class, "pivotY");
        c = new jfx(Float.class, "width");
        d = new jfy(Float.class, "height");
        e = new jfz(c, View.X, 0.5f, "anchorPositionX");
        f = new jfz(d, View.Y, 0.5f, "anchorPositionY");
    }
}
