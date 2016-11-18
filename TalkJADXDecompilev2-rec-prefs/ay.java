package p000;

import android.content.Context;
import android.content.res.TypedArray;

public final class ay {
    private static final int[] f2530a = new int[]{gwb.f868N};

    public static void m4327a(Context context) {
        int i = 0;
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(f2530a);
        if (!obtainStyledAttributes.hasValue(0)) {
            i = 1;
        }
        if (obtainStyledAttributes != null) {
            obtainStyledAttributes.recycle();
        }
        if (i != 0) {
            throw new IllegalArgumentException("You need to use a Theme.AppCompat theme (or descendant) with the design library.");
        }
    }
}
