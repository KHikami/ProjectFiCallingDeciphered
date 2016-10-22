import android.util.Property;
import android.view.View;

final class jfz extends Property<View, Float> {
    private final Property<View, Float> a;
    private final Property<View, Float> b;
    private final float c;

    public /* synthetic */ Object get(Object obj) {
        return a((View) obj);
    }

    public /* synthetic */ void set(Object obj, Object obj2) {
        a((View) obj, (Float) obj2);
    }

    public jfz(Property<View, Float> property, Property<View, Float> property2, float f, String str) {
        super(Float.class, str);
        this.a = property;
        this.b = property2;
        this.c = 0.5f;
    }

    private Float a(View view) {
        return Float.valueOf((((Float) this.a.get(view)).floatValue() * this.c) + ((Float) this.b.get(view)).floatValue());
    }

    private void a(View view, Float f) {
        this.b.set(view, Float.valueOf(f.floatValue() - (((Float) this.a.get(view)).floatValue() * this.c)));
    }
}
