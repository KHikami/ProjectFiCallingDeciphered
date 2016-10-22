package defpackage;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.os.Build.VERSION;
import android.util.Log;
import android.util.SparseArray;
import android.util.TypedValue;
import java.util.WeakHashMap;

/* compiled from: PG */
/* renamed from: rm */
public final class rm {
    private static final ThreadLocal a;
    private static final WeakHashMap b;
    private static final Object c;

    static {
        a = new ThreadLocal();
        b = new WeakHashMap(0);
        c = new Object();
    }

    public static ColorStateList a(Context context, int i) {
        if (VERSION.SDK_INT >= 23) {
            return context.getColorStateList(i);
        }
        ColorStateList c = rm.c(context, i);
        if (c != null) {
            return c;
        }
        ColorStateList b = rm.b(context, i);
        if (b == null) {
            return gd.b(context, i);
        }
        synchronized (c) {
            SparseArray sparseArray = (SparseArray) b.get(context);
            if (sparseArray == null) {
                sparseArray = new SparseArray();
                b.put(context, sparseArray);
            }
            sparseArray.append(i, new rn(b, context.getResources().getConfiguration()));
        }
        return b;
    }

    private static ColorStateList b(Context context, int i) {
        boolean z;
        Resources resources = context.getResources();
        TypedValue typedValue = (TypedValue) a.get();
        if (typedValue == null) {
            typedValue = new TypedValue();
            a.set(typedValue);
        }
        resources.getValue(i, typedValue, true);
        if (typedValue.type < 28 || typedValue.type > 31) {
            z = false;
        } else {
            z = true;
        }
        if (z) {
            return null;
        }
        Resources resources2 = context.getResources();
        try {
            return buf.a(resources2, resources2.getXml(i), context.getTheme());
        } catch (Throwable e) {
            Log.e("AppCompatResources", "Failed to inflate ColorStateList, leaving it to the framework", e);
            return null;
        }
    }

    private static ColorStateList c(Context context, int i) {
        synchronized (c) {
            SparseArray sparseArray = (SparseArray) b.get(context);
            if (sparseArray != null && sparseArray.size() > 0) {
                rn rnVar = (rn) sparseArray.get(i);
                if (rnVar != null) {
                    if (rnVar.b.equals(context.getResources().getConfiguration())) {
                        ColorStateList colorStateList = rnVar.a;
                        return colorStateList;
                    }
                    sparseArray.remove(i);
                }
            }
            return null;
        }
    }
}
