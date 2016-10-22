package defpackage;

import android.content.Context;
import android.content.res.TypedArray;

/* compiled from: PG */
/* renamed from: an */
public final class an {
    private static final int[] a;

    static {
        a = new int[]{buf.M};
    }

    public static void a(Context context) {
        int i = 0;
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(a);
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
