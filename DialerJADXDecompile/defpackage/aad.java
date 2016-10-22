package defpackage;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Color;
import android.util.TypedValue;

/* compiled from: PG */
/* renamed from: aad */
final class aad {
    static final int[] a;
    static final int[] b;
    static final int[] c;
    static final int[] d;
    static final int[] e;
    private static final ThreadLocal f;
    private static final int[] g;

    static {
        f = new ThreadLocal();
        a = new int[]{-16842910};
        b = new int[]{16842908};
        c = new int[]{16842919};
        d = new int[]{16842912};
        e = new int[0];
        g = new int[1];
    }

    public static int a(Context context, int i) {
        g[0] = i;
        aah a = aah.a(context, null, g);
        try {
            int b = a.b(0, 0);
            return b;
        } finally {
            a.a.recycle();
        }
    }

    public static ColorStateList b(Context context, int i) {
        g[0] = i;
        aah a = aah.a(context, null, g);
        try {
            ColorStateList d = a.d(0);
            return d;
        } finally {
            a.a.recycle();
        }
    }

    public static int c(Context context, int i) {
        ColorStateList b = aad.b(context, i);
        if (b != null && b.isStateful()) {
            return b.getColorForState(a, b.getDefaultColor());
        }
        TypedValue typedValue = (TypedValue) f.get();
        if (typedValue == null) {
            typedValue = new TypedValue();
            f.set(typedValue);
        }
        context.getTheme().resolveAttribute(16842803, typedValue, true);
        float f = typedValue.getFloat();
        int a = aad.a(context, i);
        return gq.b(a, Math.round(f * ((float) Color.alpha(a))));
    }
}
