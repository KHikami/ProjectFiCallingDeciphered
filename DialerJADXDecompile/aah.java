import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;

/* compiled from: PG */
public final class aah {
    public final TypedArray a;
    private final Context b;

    public static aah a(Context context, AttributeSet attributeSet, int[] iArr) {
        return new aah(context, context.obtainStyledAttributes(attributeSet, iArr));
    }

    public static aah a(Context context, AttributeSet attributeSet, int[] iArr, int i, int i2) {
        return new aah(context, context.obtainStyledAttributes(attributeSet, iArr, i, i2));
    }

    public static aah a(Context context, int i, int[] iArr) {
        return new aah(context, context.obtainStyledAttributes(i, iArr));
    }

    private aah(Context context, TypedArray typedArray) {
        this.b = context;
        this.a = typedArray;
    }

    public final Drawable a(int i) {
        if (this.a.hasValue(i)) {
            int resourceId = this.a.getResourceId(i, 0);
            if (resourceId != 0) {
                return vi.a().a(this.b, resourceId, false);
            }
        }
        return this.a.getDrawable(i);
    }

    public final Drawable b(int i) {
        if (this.a.hasValue(i)) {
            int resourceId = this.a.getResourceId(i, 0);
            if (resourceId != 0) {
                return vi.a().a(this.b, resourceId, true);
            }
        }
        return null;
    }

    public final CharSequence c(int i) {
        return this.a.getText(i);
    }

    public final boolean a(int i, boolean z) {
        return this.a.getBoolean(i, z);
    }

    public final int a(int i, int i2) {
        return this.a.getInt(i, i2);
    }

    public final int b(int i, int i2) {
        return this.a.getColor(i, i2);
    }

    public final ColorStateList d(int i) {
        if (this.a.hasValue(i)) {
            int resourceId = this.a.getResourceId(i, 0);
            if (resourceId != 0) {
                ColorStateList a = rm.a(this.b, resourceId);
                if (a != null) {
                    return a;
                }
            }
        }
        return this.a.getColorStateList(i);
    }

    public final int c(int i, int i2) {
        return this.a.getInteger(i, i2);
    }

    public final int d(int i, int i2) {
        return this.a.getDimensionPixelOffset(i, i2);
    }

    public final int e(int i, int i2) {
        return this.a.getDimensionPixelSize(i, i2);
    }

    public final int f(int i, int i2) {
        return this.a.getLayoutDimension(i, i2);
    }

    public final int g(int i, int i2) {
        return this.a.getResourceId(i, i2);
    }

    public final boolean e(int i) {
        return this.a.hasValue(i);
    }
}
