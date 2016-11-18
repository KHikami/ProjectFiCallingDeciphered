package p000;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;

public final class afp {
    private final Context f548a;
    private final TypedArray f549b;

    public static afp m926a(Context context, AttributeSet attributeSet, int[] iArr) {
        return new afp(context, context.obtainStyledAttributes(attributeSet, iArr));
    }

    public static afp m927a(Context context, AttributeSet attributeSet, int[] iArr, int i, int i2) {
        return new afp(context, context.obtainStyledAttributes(attributeSet, iArr, i, i2));
    }

    public static afp m925a(Context context, int i, int[] iArr) {
        return new afp(context, context.obtainStyledAttributes(i, iArr));
    }

    private afp(Context context, TypedArray typedArray) {
        this.f548a = context;
        this.f549b = typedArray;
    }

    public Drawable m930a(int i) {
        if (this.f549b.hasValue(i)) {
            int resourceId = this.f549b.getResourceId(i, 0);
            if (resourceId != 0) {
                return wk.b(this.f548a, resourceId);
            }
        }
        return this.f549b.getDrawable(i);
    }

    public Drawable m934b(int i) {
        if (this.f549b.hasValue(i)) {
            int resourceId = this.f549b.getResourceId(i, 0);
            if (resourceId != 0) {
                return aai.m66a().m80a(this.f548a, resourceId, true);
            }
        }
        return null;
    }

    public CharSequence m936c(int i) {
        return this.f549b.getText(i);
    }

    public String m938d(int i) {
        return this.f549b.getString(i);
    }

    public boolean m932a(int i, boolean z) {
        return this.f549b.getBoolean(i, z);
    }

    public int m929a(int i, int i2) {
        return this.f549b.getInt(i, i2);
    }

    public float m928a(int i, float f) {
        return this.f549b.getFloat(i, -1.0f);
    }

    public int m933b(int i, int i2) {
        return this.f549b.getColor(i, i2);
    }

    public ColorStateList m940e(int i) {
        if (this.f549b.hasValue(i)) {
            int resourceId = this.f549b.getResourceId(i, 0);
            if (resourceId != 0) {
                ColorStateList a = wk.a(this.f548a, resourceId);
                if (a != null) {
                    return a;
                }
            }
        }
        return this.f549b.getColorStateList(i);
    }

    public int m935c(int i, int i2) {
        return this.f549b.getInteger(i, i2);
    }

    public int m937d(int i, int i2) {
        return this.f549b.getDimensionPixelOffset(i, i2);
    }

    public int m939e(int i, int i2) {
        return this.f549b.getDimensionPixelSize(i, i2);
    }

    public int m941f(int i, int i2) {
        return this.f549b.getLayoutDimension(i, i2);
    }

    public int m943g(int i, int i2) {
        return this.f549b.getResourceId(i, i2);
    }

    public CharSequence[] m942f(int i) {
        return this.f549b.getTextArray(i);
    }

    public boolean m944g(int i) {
        return this.f549b.hasValue(i);
    }

    public void m931a() {
        this.f549b.recycle();
    }
}
