package p000;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Color;
import android.util.TypedValue;

final class afl {
    static final int[] f534a = new int[]{-16842910};
    static final int[] f535b = new int[]{16842908};
    static final int[] f536c = new int[]{16843518};
    static final int[] f537d = new int[]{16842919};
    static final int[] f538e = new int[]{16842912};
    static final int[] f539f = new int[]{16842913};
    static final int[] f540g = new int[]{-16842919, -16842908};
    static final int[] f541h = new int[0];
    private static final ThreadLocal<TypedValue> f542i = new ThreadLocal();
    private static final int[] f543j = new int[1];

    public static int m921a(Context context, int i) {
        f543j[0] = i;
        afp a = afp.m926a(context, null, f543j);
        try {
            int b = a.m933b(0, 0);
            return b;
        } finally {
            a.m931a();
        }
    }

    public static ColorStateList m922b(Context context, int i) {
        f543j[0] = i;
        afp a = afp.m926a(context, null, f543j);
        try {
            ColorStateList e = a.m940e(0);
            return e;
        } finally {
            a.m931a();
        }
    }

    public static int m923c(Context context, int i) {
        ColorStateList b = afl.m922b(context, i);
        if (b != null && b.isStateful()) {
            return b.getColorForState(f534a, b.getDefaultColor());
        }
        TypedValue typedValue = (TypedValue) f542i.get();
        if (typedValue == null) {
            typedValue = new TypedValue();
            f542i.set(typedValue);
        }
        context.getTheme().resolveAttribute(16842803, typedValue, true);
        float f = typedValue.getFloat();
        int a = afl.m921a(context, i);
        return ja.m23626b(a, Math.round(f * ((float) Color.alpha(a))));
    }
}
