import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Color;
import android.util.TypedValue;

final class afl {
    static final int[] a;
    static final int[] b;
    static final int[] c;
    static final int[] d;
    static final int[] e;
    static final int[] f;
    static final int[] g;
    static final int[] h;
    private static final ThreadLocal<TypedValue> i;
    private static final int[] j;

    static {
        i = new ThreadLocal();
        a = new int[]{-16842910};
        b = new int[]{16842908};
        c = new int[]{16843518};
        d = new int[]{16842919};
        e = new int[]{16842912};
        f = new int[]{16842913};
        g = new int[]{-16842919, -16842908};
        h = new int[0];
        j = new int[1];
    }

    public static int a(Context context, int i) {
        j[0] = i;
        afp a = afp.a(context, null, j);
        try {
            int b = a.b(0, 0);
            return b;
        } finally {
            a.a();
        }
    }

    public static ColorStateList b(Context context, int i) {
        j[0] = i;
        afp a = afp.a(context, null, j);
        try {
            ColorStateList e = a.e(0);
            return e;
        } finally {
            a.a();
        }
    }

    public static int c(Context context, int i) {
        ColorStateList b = b(context, i);
        if (b != null && b.isStateful()) {
            return b.getColorForState(a, b.getDefaultColor());
        }
        TypedValue typedValue = (TypedValue) i.get();
        if (typedValue == null) {
            typedValue = new TypedValue();
            i.set(typedValue);
        }
        context.getTheme().resolveAttribute(16842803, typedValue, true);
        float f = typedValue.getFloat();
        int a = a(context, i);
        return ja.b(a, Math.round(f * ((float) Color.alpha(a))));
    }
}
