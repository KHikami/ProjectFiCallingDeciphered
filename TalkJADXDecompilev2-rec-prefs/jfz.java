package p000;

import android.util.Property;
import android.view.View;

final class jfz extends Property<View, Float> {
    private final Property<View, Float> f19989a;
    private final Property<View, Float> f19990b;
    private final float f19991c = 0.5f;

    public /* synthetic */ Object get(Object obj) {
        return m24109a((View) obj);
    }

    public /* synthetic */ void set(Object obj, Object obj2) {
        m24110a((View) obj, (Float) obj2);
    }

    public jfz(Property<View, Float> property, Property<View, Float> property2, float f, String str) {
        super(Float.class, str);
        this.f19989a = property;
        this.f19990b = property2;
    }

    private Float m24109a(View view) {
        return Float.valueOf((((Float) this.f19989a.get(view)).floatValue() * this.f19991c) + ((Float) this.f19990b.get(view)).floatValue());
    }

    private void m24110a(View view, Float f) {
        this.f19990b.set(view, Float.valueOf(f.floatValue() - (((Float) this.f19989a.get(view)).floatValue() * this.f19991c)));
    }
}
